package com.example.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.leave.model.Leave;
import com.example.leave.service.LeaveService;



// TODO: Auto-generated Javadoc
/**
 * The Class LeaveController.
 */
@Controller
public class LeaveController {

	/** The leave service. */
	@Autowired
	private LeaveService leaveService;


	

	/**
	 * View home page.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/")
	public String viewHomePage(Model model) {
		System.out.println("===================================siva=====================");
		return findPaginated(1, "empname", "asc", model);

	}

	/**
	 * Show new leave form.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/showNewLeaveForm")
	public String showNewLeaveForm(Model model) {
		
		Leave leave = new Leave();
		model.addAttribute("leave", leave);
		return "new_leave";
	}

	/**
	 * Save leave.
	 *
	 * @param leave the leave
	 * @return the string
	 */
	@PostMapping("/saveLeave")
	public String saveLeave(@ModelAttribute("leave") Leave leave) {
		leaveService.saveLeave(leave);
		System.out.println("===================================s=====================");
		return "redirect:/";
	}

	/**
	 * Show form for update.
	 *
	 * @param id the id
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {
		Leave leave = leaveService.getLeaveById(id);
		model.addAttribute("leave", leave);
		return "update_leave";
	}


	/**
	 * Delete leave.
	 *
	 * @param id the id
	 * @return the string
	 */
	@GetMapping("/deleteLeave/{id}")
	public String deleteLeave(@PathVariable (value = "id") int id) {
		this.leaveService.deleteLeaveById(id);
		return "redirect:/";
	}

	/**
	 * Find paginated.
	 *
	 * @param pageNo the page no
	 * @param sortField the sort field
	 * @param sortDir the sort dir
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;

		Page < Leave > page = leaveService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List < Leave > listLeave = page.getContent();

		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());

		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

		model.addAttribute("listLeave", listLeave);
		return "index";
	}

}




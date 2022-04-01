package com.example.leave.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.leave.model.Leave;

// TODO: Auto-generated Javadoc
/**
 * The Interface LeaveService.
 */
public interface LeaveService {

	/**
	 * Gets the all leave.
	 *
	 * @return the all leave
	 */
	List<Leave> getAllLeave();
	
	/**
	 * Save leave.
	 *
	 * @param leave the leave
	 */
	void saveLeave(Leave leave);
	
	/**
	 * Gets the leave by id.
	 *
	 * @param id the id
	 * @return the leave by id
	 */
	Leave getLeaveById(int id);
	
	/**
	 * Delete leave by id.
	 *
	 * @param id the id
	 */
	void deleteLeaveById(int id);
	
	/**
	 * Find paginated.
	 *
	 * @param pageNo the page no
	 * @param pageSize the page size
	 * @param sortField the sort field
	 * @param sortDirection the sort direction
	 * @return the page
	 */
	Page<Leave> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);


}

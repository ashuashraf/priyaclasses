package com.example.leave.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.leave.model.Leave;
import com.example.leave.repository.LeaveRepository;

// TODO: Auto-generated Javadoc
/**
 * The Class LeaveServiceImpl.
 */
@Service
public class LeaveServiceImpl implements LeaveService {
	
	/** The leave repository. */
	@Autowired
	private LeaveRepository leaveRepository;
	
	/**
	 * Gets the all leave.
	 *
	 * @return the all leave
	 */
	@Override
	public List<Leave> getAllLeave() {
		return leaveRepository.findAll();
	}
	
	/**
	 * Save leave.
	 *
	 * @param leave the leave
	 */
	@Override
	public void saveLeave(Leave leave) {
		this.leaveRepository.save(leave);
	}

	/**
	 * Gets the leave by id.
	 *
	 * @param id the id
	 * @return the leave by id
	 */
	@Override
	public Leave getLeaveById(int id) {
		Optional<Leave> optional = leaveRepository.findById(id);
		Leave leave = null;
		if (optional.isPresent()) {
			leave = optional.get();
		} else {
			throw new RuntimeException(" Leave not found for id :: " + id);
		}
		return leave;
	}
	
	/**
	 * Delete leave by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteLeaveById(int id) {
		this.leaveRepository.deleteById(id);
	}
	
	/**
	 * Find paginated.
	 *
	 * @param pageNo the page no
	 * @param pageSize the page size
	 * @param sortField the sort field
	 * @param sortDirection the sort direction
	 * @return the page
	 */
	@Override
	public Page<Leave> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.leaveRepository.findAll(pageable);
	}
}
	



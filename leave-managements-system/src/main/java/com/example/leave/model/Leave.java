package com.example.leave.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// TODO: Auto-generated Javadoc
/**
 * The Class Leave.
 */
@Entity
@Table(name="LeaveSystem")
public class Leave {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	
	/** The empname. */
	@Column(name = "emp_name")
	private String empname;
	

	/** The deptname. */
	@Column(name = "dept_name")
	private String deptname;
	
	
	/** The leavetype. */
	@Column(name = "leave_type")
	private String leavetype;
	
	
	/** The fromdate. */
	@Column(name = "from_date")
	private String fromdate;
	

	/** The todate. */
	@Column(name = "to_date")
	private String todate;
	

	/** The reason. */
	@Column(name = "reason")
	private String reason;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the empname.
	 *
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}

	/**
	 * Sets the empname.
	 *
	 * @param empname the new empname
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	/**
	 * Gets the deptname.
	 *
	 * @return the deptname
	 */
	public String getDeptname() {
		return deptname;
	}

	/**
	 * Sets the deptname.
	 *
	 * @param deptname the new deptname
	 */
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	/**
	 * Gets the leavetype.
	 *
	 * @return the leavetype
	 */
	public String getLeavetype() {
		return leavetype;
	}

	/**
	 * Sets the leavetype.
	 *
	 * @param leavetype the new leavetype
	 */
	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	/**
	 * Gets the fromdate.
	 *
	 * @return the fromdate
	 */
	public String getFromdate() {
		return fromdate;
	}

	/**
	 * Sets the fromdate.
	 *
	 * @param fromdate the new fromdate
	 */
	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	/**
	 * Gets the todate.
	 *
	 * @return the todate
	 */
	public String getTodate() {
		return todate;
	}

	/**
	 * Sets the todate.
	 *
	 * @param todate the new todate
	 */
	public void setTodate(String todate) {
		this.todate = todate;
	}

	/**
	 * Gets the reason.
	 *
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	

	/**
	 * Sets the reason.
	 *
	 * @param reason the new reason
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

}

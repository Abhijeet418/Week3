/**
 * 
 */
package com.springmvc.pmvc.beans;

public class Faculty {
	/**
	 * @param f_id
	 * @param f_name
	 * @param pass
	 * @param email
	 * @param mobile
	 */
	public Faculty() {}
	public Faculty(int f_id, String f_name, String pass, String email, String mobile) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.pass = pass;
		this.email = email;
		this.mobile = mobile;
	}
	int f_id;
	String f_name;
	String pass;
	String email;
	String mobile;
	/**
	 * @return the f_id
	 */
	public int getF_id() {
		return f_id;
	}
	/**
	 * @param f_id the f_id to set
	 */
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	/**
	 * @return the f_name
	 */
	public String getF_name() {
		return f_name;
	}
	/**
	 * @param f_name the f_name to set
	 */
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}


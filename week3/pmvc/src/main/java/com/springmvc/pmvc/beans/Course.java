package com.springmvc.pmvc.beans;

/**
 * 
 */
public class Course {
	/**
	 * @param c_id
	 * @param f_id
	 * @param c_name
	 * @param duration
	 */
	public Course(int c_id, int f_id, String c_name, int duration) {
		super();
		this.c_id = c_id;
		this.f_id = f_id;
		this.c_name = c_name;
		this.duration = duration;
	}
	int c_id;
	int f_id;
	String c_name;
	int duration;
	public Course() {}
	/**
	 * @return the c_id
	 */
	public int getC_id() {
		return c_id;
	}
	/**
	 * @param c_id the c_id to set
	 */
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
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
	 * @return the c_name
	 */
	public String getC_name() {
		return c_name;
	}
	/**
	 * @param c_name the c_name to set
	 */
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
}

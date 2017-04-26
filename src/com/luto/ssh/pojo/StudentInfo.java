package com.luto.ssh.pojo;

import java.io.Serializable;

public class StudentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer stuId;
	private String stuName;
	private String stuSex;
	private TypeInfo type;

	/**
	 * @return the stuId
	 */
	public Integer getStuId() {
		return stuId;
	}

	/**
	 * @param stuId
	 *            the stuId to set
	 */
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}

	/**
	 * @param stuName
	 *            the stuName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	/**
	 * @return the stuSex
	 */
	public String getStuSex() {
		return stuSex;
	}

	/**
	 * @param stuSex
	 *            the stuSex to set
	 */
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	/**
	 * @return the type
	 */
	public TypeInfo getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(TypeInfo type) {
		this.type = type;
	}

}

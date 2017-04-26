package com.luto.ssh.pojo;

import java.io.Serializable;
import java.util.Set;

import com.luto.ssh.pojo.StudentInfo;

public class TypeInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer typeId;
	private String typeName;
	private Set<StudentInfo> students;

	/**
	 * @return the typeId
	 */
	public Integer getTypeId() {
		return typeId;
	}

	/**
	 * @param typeId
	 *            the typeId to set
	 */
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName
	 *            the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	/**
	 * @return the students
	 */
	public Set<StudentInfo> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(Set<StudentInfo> students) {
		this.students = students;
	}

}

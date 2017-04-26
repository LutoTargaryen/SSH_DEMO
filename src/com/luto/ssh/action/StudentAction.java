package com.luto.ssh.action;

import java.util.List;

import com.luto.ssh.pojo.StudentInfo;
import com.luto.ssh.pojo.TypeInfo;
import com.luto.ssh.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private StudentService stuService;
	private StudentInfo student;
	private List<TypeInfo> types;
	private List<StudentInfo> students;

	/**
	 * @return the students
	 */
	public List<StudentInfo> getStudents() {
		return students;
	}

	/**
	 * @param students
	 *            the students to set
	 */
	public void setStudents(List<StudentInfo> students) {
		this.students = students;
	}

	/**
	 * @return the student
	 */
	public StudentInfo getStudent() {
		return student;
	}

	/**
	 * @param student
	 *            the student to set
	 */
	public void setStudent(StudentInfo student) {
		this.student = student;
	}

	/**
	 * @return the types
	 */
	public List<TypeInfo> getTypes() {
		return types;
	}

	/**
	 * @param types
	 *            the types to set
	 */
	public void setTypes(List<TypeInfo> types) {
		this.types = types;
	}

	/**
	 * @param stuService
	 *            the stuService to set
	 */
	public void setStuService(StudentService stuService) {
		this.stuService = stuService;
	}

	/**
	 * 定义初始化添加界面的方法
	 */
	public String initAdd() {
		// 初始化类型列表
		this.types = stuService.getTypes();

		return "initAdd";
	}

	/**
	 * 定义添加学生信息的方法
	 */
	public String addStudent() {
		stuService.saveStudent(student);

		return "list";
	}

	/**
	 * 定义初始化修改的方法
	 */
	public String initUpdate() {
		// 初始化类型列表
		this.types = stuService.getTypes();
		this.student = stuService.getStudentById(student.getStuId());

		return "initUpdate";
	}

	/**
	 * 定义删除学生信息的方法
	 */
	public String deleteStudent() {
		stuService.deleteStudent(student);

		return "list";
	}

	/**
	 * 定义修改学生信息的方法
	 */
	public String updateStudent() {
		stuService.updateStudent(student);

		return "list";
	}

	/**
	 * 定义显示所有学生信息的方法
	 */
	public String listStudent() {
		setStudents(stuService.getStudents());
		return SUCCESS;
	}

}

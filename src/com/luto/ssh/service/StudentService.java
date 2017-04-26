package com.luto.ssh.service;

import java.util.List;

import com.luto.ssh.pojo.StudentInfo;
import com.luto.ssh.pojo.TypeInfo;

public interface StudentService {
	void saveStudent(StudentInfo stu);

	void deleteStudent(StudentInfo stu);

	void updateStudent(StudentInfo stu);

	StudentInfo getStudentById(Integer stuId);

	List<StudentInfo> getStudents();

	List<TypeInfo> getTypes();
}

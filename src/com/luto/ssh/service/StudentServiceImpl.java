package com.luto.ssh.service;

import java.util.List;

import com.luto.ssh.dao.StudentDAO;
import com.luto.ssh.exception.BusinessException;
import com.luto.ssh.pojo.StudentInfo;
import com.luto.ssh.pojo.TypeInfo;

public class StudentServiceImpl implements StudentService {

	private StudentDAO stuDao;

	/**
	 * @param stuDao
	 *            the stuDao to set
	 */
	public void setStuDao(StudentDAO stuDao) {
		this.stuDao = stuDao;
	}

	@Override
	public void saveStudent(StudentInfo stu) {

		try {
			stuDao.addStudent(stu);
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw new BusinessException("添加失败 cause by:" + e.getMessage());
		}

	}

	@Override
	public void deleteStudent(StudentInfo stu) {
		try {
			stuDao.deleteStudent(stu);
		} catch (RuntimeException e) {
			throw new BusinessException("删除失败 cause by:" + e.getMessage());
		}

	}

	@Override
	public void updateStudent(StudentInfo stu) {
		try {
			stuDao.updateStudent(stu);
		} catch (RuntimeException e) {
			throw new BusinessException("修改失败 cause by:" + e.getMessage());
		}

	}

	@Override
	public StudentInfo getStudentById(Integer stuId) {
		StudentInfo stu = null;

		try {
			stu = stuDao.getStudentById(stuId);
		} catch (RuntimeException e) {
			throw new BusinessException("根据学生编号:" + stuId + "查询失败 cause by:"
					+ e.getMessage());
		}

		return stu;
	}

	@Override
	public List<StudentInfo> getStudents() {
		List<StudentInfo> stuList = null;

		try {
			stuList = stuDao.getStudents();
		} catch (RuntimeException e) {
			throw new BusinessException("查询失败 cause by:" + e.getMessage());
		}

		return stuList;
	}

	@Override
	public List<TypeInfo> getTypes() {

		List<TypeInfo> typeList = null;

		try {
			typeList = stuDao.getTypes();
		} catch (RuntimeException e) {
			throw new BusinessException("查询类型失败 cause by:" + e.getMessage());
		}

		return typeList;
	}

}

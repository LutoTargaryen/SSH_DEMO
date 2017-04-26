/**
 * 
 */
package com.luto.ssh.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.luto.ssh.pojo.StudentInfo;
import com.luto.ssh.pojo.TypeInfo;

/**
 * @author Administrator
 *
 */
public class StudentDAOImpl implements StudentDAO {

	private SessionFactory sessionFactory;

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.luto.ssh.dao.StudentDAO#addStudent(com.luto.ssh.pojo.StudentInfo)
	 */
	@Override
	public void addStudent(StudentInfo stu) {

		sessionFactory.getCurrentSession().persist(stu);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.luto.ssh.dao.StudentDAO#deleteStudent(com.luto.ssh.pojo.StudentInfo)
	 */
	@Override
	public void deleteStudent(StudentInfo stu) {

		sessionFactory.getCurrentSession().delete(stu);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.luto.ssh.dao.StudentDAO#updateStudent(com.luto.ssh.pojo.StudentInfo)
	 */
	@Override
	public void updateStudent(StudentInfo stu) {
		sessionFactory.getCurrentSession().update(stu);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.luto.ssh.dao.StudentDAO#getStudentById(java.lang.Integer)
	 */
	@Override
	public StudentInfo getStudentById(Integer stuId) {

		return (StudentInfo) sessionFactory.getCurrentSession().get(
				StudentInfo.class, stuId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.luto.ssh.dao.StudentDAO#getStudents()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<StudentInfo> getStudents() {

		return sessionFactory.getCurrentSession()
				.createCriteria(StudentInfo.class).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TypeInfo> getTypes() {
		return sessionFactory.getCurrentSession()
				.createCriteria(TypeInfo.class).list();
	}

}

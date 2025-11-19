package com.hibernate.MyFirstHibernateApp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.MyFirstHibernateApp.entity.Student;
import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

public class MainGetAllStudents {

	public static void main(String[] args) {

		SessionFactory factory = HIbernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		// we don't have any predefined method to get all student
		// -> So we need to write a query for it
		// SQL query

		List<Student> studentList = session.createNativeQuery("select * from student",
				Student.class)
				.getResultList();
		
		studentList.stream().forEach(x -> System.out.println(x.toString()));
		
		transaction.commit();
		session.close();

	}

}

package com.hibernate.MyFirstHibernateApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.MyFirstHibernateApp.entity.Student;
import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

public class MainAddMultipleStudent {

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(106);
		s.setName("Sham");
		s.setZipcode(11111);

		Student s1 = new Student();
		s1.setId(104);
		s1.setName("Pratik");
		s1.setZipcode(22222);

		Student s2 = new Student();
		s2.setId(105);
		s2.setName("Chetan");
		s2.setZipcode(33333);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s);
		studentList.add(s1);
		studentList.add(s2);

		SessionFactory factory = HIbernateUtility.getSessionFactory();
		Session session = factory.openSession();
		for (Student student : studentList) {
			Transaction transaction = session.beginTransaction();
			session.persist(student);
			transaction.commit();
		}
		session.close();
	}

}

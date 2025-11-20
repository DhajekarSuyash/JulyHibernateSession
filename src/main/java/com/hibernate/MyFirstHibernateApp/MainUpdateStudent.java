package com.hibernate.MyFirstHibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.MyFirstHibernateApp.entity.Student;
import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

public class MainUpdateStudent {

	public static void main(String[] args) {

		SessionFactory factory = HIbernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Student s = session.find(Student.class, 105);
		System.out.println("Student from db : " +s.toString());
		s.setName("David");
		s.setZipcode(55555);
		System.out.println("Student from db after update  : " + s.toString());
		
		transaction.commit();
		session.close();
		
	}

}

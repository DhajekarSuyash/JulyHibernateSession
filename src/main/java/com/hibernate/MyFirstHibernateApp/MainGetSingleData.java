package com.hibernate.MyFirstHibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.MyFirstHibernateApp.entity.Student;
import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

public class MainGetSingleData {

	public static void main(String[] args) {

		SessionFactory factory = HIbernateUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		// to get single entity from database..
		Student s = session.find(Student.class, 106);

		System.out.println("Student from db : " + s.toString());

		transaction.commit();

		session.close();

	}

}

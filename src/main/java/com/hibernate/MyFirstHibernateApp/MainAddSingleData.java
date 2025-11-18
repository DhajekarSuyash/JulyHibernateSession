package com.hibernate.MyFirstHibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.MyFirstHibernateApp.entity.Student;
import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

public class MainAddSingleData {

	public static void main(String[] args) {
		// save Student

		Student s = new Student();
		s.setId(102);
		s.setName("Ram");
		s.setZipcode(77777);

		// 1. session Factory
		SessionFactory factory = HIbernateUtility.getSessionFactory();
		// 2. session
		Session session = factory.openSession();
		// 3. transaction
		Transaction transaction = session.beginTransaction();
		//4.
		session.persist(s);
		//5. commit
		transaction.commit();
		//6. session close
		session.close();

	}

}

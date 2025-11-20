package com.hibernate.MyFirstHibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.MyFirstHibernateApp.entity.Student;
import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

public class MainDeleteStudentById {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HIbernateUtility.getSessionFactory();
		 Session session= factory.openSession();
		Transaction transaction = session.beginTransaction();
		// we want to delete student with id = 106
		 Student s = session.find(Student.class, 106);
		//Object of student with id 106
		session.remove(s);
	 
		transaction.commit();
		System.out.println("Student deleted with id : "+s.getId());
		session.close();
	}

}

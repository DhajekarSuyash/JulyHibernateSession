package com.hibernate.MyFirstHibernateApp;

import com.hibernate.MyFirstHibernateApp.utility.HIbernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HIbernateUtility.getSessionFactory();
    }
}

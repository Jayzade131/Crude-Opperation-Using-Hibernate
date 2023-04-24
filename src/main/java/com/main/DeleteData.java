package com.main;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {
		System.out.println( "starting........." );
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory =cfg.buildSessionFactory();
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        Query q2=s.createQuery("delete from Employess s where s.empId=:c");
        q2.setParameter("c", 101);
        int y=q2.executeUpdate();
        System.out.println("delete..");
        System.out.println(y);
       
        tx.commit();
        
        
        
        s.close();
        factory.close();

	}

}

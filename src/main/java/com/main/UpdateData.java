package com.main;

import javax.transaction.Transactional.TxType;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {
		System.out.println( "starting........." );
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory =cfg.buildSessionFactory();
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        Query q3=s.createQuery("update Employess set empId=:g");
        q3.setParameter("g", 101);
        int z=q3.executeUpdate();
        System.out.println("update");
        tx.commit();
        s.close();
        factory.close();

	}

}

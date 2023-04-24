package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData 
{
    public static void main( String[] args )
    {
        System.out.println( "starting........." );
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory =cfg.buildSessionFactory();
        
        Employess e1=new Employess();
        Employess e2=new Employess();
        e1.setEmpId(101);
        e1.setEmpName("ram");
        e1.setCity("nagpur");
        e1.setEmail("jayzade@gmail.com");
        e2.setEmpId(102);
        e2.setEmpName("shyam");
        e2.setCity("Goa");
        e2.setEmail("harshuzade@gmail.com");
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
        s.save(e1);
        s.save(e2);
        tx.commit();
        
        
        
        
        s.close();
        
        
        
    }
}

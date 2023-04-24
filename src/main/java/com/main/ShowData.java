package com.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowData {

	public static void main(String[] args) {
		System.out.println( "starting........." );
        Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory =cfg.buildSessionFactory();
        Session s=factory.openSession();
        
       String query="from Employess";
       // 	 String query="from Employess where empId=101";
        Query q=s.createQuery(query);
        //single = Unique
        //multiple =list
        
        List<Employess>list=q.list();
        for (Employess employess : list) {
			System.out.println(employess.getEmpId()+" : "+employess.getEmpName()+" : "+employess.getCity()+" : "+employess.getEmail());
		}
        s.close();
        factory.close();

	}

}

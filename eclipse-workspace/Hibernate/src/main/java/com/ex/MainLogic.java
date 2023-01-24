package com.ex;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf= new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		College hardik=new College();
		hardik.setSid(111);
		hardik.setSname("Hardik Pandya");
		hardik.setSection("A");
		hardik.setBranch("CSE");
		se.save(hardik);
		tx.commit();
	}

}

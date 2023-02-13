package com.ex;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class MainLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session se=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=se.beginTransaction();
		College cc=se.load(College.class, 111);
		System.out.println(cc.getSid()+" "+cc.getSname()+" "+cc.getSmarks()+" ");
		cc.setSmarks(343);
		cc.setSection("A");
		se.update(cc);
		tx.commit();
	}

}

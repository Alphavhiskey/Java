package com.ex;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SpringORM {
	private SessionFactory sf;
	private Session se;
	private Transaction tx;
	

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	public void insert(College c) {
		se=sf.openSession();
		tx=se.beginTransaction();
		se.save(c);
		tx.commit();
		
	}
	
	

}

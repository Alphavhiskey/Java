package com.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class MainLogic {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(SprinUtil.class);
		SpringORM s=ac.getBean(SpringORM.class);
		College c=new College();
		c.setId(1046);
		c.setSname("Steve");
		c.setSmarks(543);
		c.setSection("A");
		c.setBranch("CSE");
		s.insert(c);

	}

}

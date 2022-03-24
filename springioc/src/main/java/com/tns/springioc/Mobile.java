package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
	/*
	 * //accessing airtel objects Airtel air= (Airtel) c.getBean("airtel"); //type
	 * casting is required air.calling(); air.data();
	 */
//		//By this method we don't need type casting and this is also not best practice
//		BSNL b=c.getBean("bsnl", BSNL.class);
//		b.calling();
//		b.data();
		
		//By using interface 
		Sim sim=c.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}

}

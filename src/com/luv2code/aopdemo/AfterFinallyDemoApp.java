package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterFinallyDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext  ctxt = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean
		AccountDAO dao = ctxt.getBean("accountDAO", AccountDAO.class);

		
		List<Account> theAccountList = null;
		try {
			boolean tripWire = false;
			theAccountList = dao.findAccount(tripWire);
		} catch(Exception ex) {
			System.out.println("Exception>>>>>>>>>>>>.."+ex);
		}
		System.out.println("\n\n Main prog for : AfterThrowingDemoApp()");
		
		System.out.println(theAccountList);
		
		System.out.println("\n\n");
		
		//close  context
		ctxt.close();
	}

}

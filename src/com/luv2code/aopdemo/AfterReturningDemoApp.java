package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext  ctxt = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean
		AccountDAO dao = ctxt.getBean("accountDAO", AccountDAO.class);

		List<Account> theAccountList = dao.findAccount(false);
		
		System.out.println("\n\n Main prog for : AfterReturningDemoApp()");
		
		System.out.println(theAccountList);
		
		System.out.println("\n\n");
		
		//close  context
		ctxt.close();
	}

}

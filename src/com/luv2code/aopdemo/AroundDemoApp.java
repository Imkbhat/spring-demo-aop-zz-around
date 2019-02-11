package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundDemoApp {

	public static void main(String[] args) {
		
		//Read spring configuration file
		AnnotationConfigApplicationContext  ctxt = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get bean
		TrafficFortuneService fortuneService = ctxt.getBean("trafficFortuneService", 
					TrafficFortuneService.class);
		
		String data = fortuneService.getFortune();
		
		System.out.println("><<<<<<<<<<>>>>>>>>>>>><<<<<<<>>>>>>>>"+ data);
		
		//close  context-
		
		ctxt.close();
	}

}

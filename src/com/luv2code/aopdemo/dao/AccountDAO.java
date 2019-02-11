package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;

	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass()+":DOING MY DB WORK ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		System.out.println(getClass()+":DOING MY WORK");
		return false;
	}

	public String getName() {
		System.out.println(getClass()+":Inside getName()");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass()+"::Inside setName()");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass()+":Inside getServiceCode()");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass()+":Inside setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
	public List<Account> findAccount(boolean tripWire) {
		List<Account> myAccounts = new ArrayList<>();
		
		if (tripWire) {
			throw new RuntimeException("No soup for you!!!");
		}
		
		//Add accounts to the list
		Account ac = new Account("Kiru","Silver");
		Account ac2 = new Account("Chad","Gold");
		Account ac3 = new Account("Darby","Darbe");
		
		myAccounts.add(ac);
		myAccounts.add(ac2);
		myAccounts.add(ac3);
		
		return myAccounts;
	}

}

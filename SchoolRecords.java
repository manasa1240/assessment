package com.lulu.test;

import java.util.Scanner;

public class SchoolRecords {
	
	Scanner sc = new Scanner(System.in);
	
	String Schoolname = sc.next();
	
	int SchoolId = sc.nextInt();
	
	String SchoolAdd =sc.next();
	
	void addRecord() {
		
		System.out.println("The Records are being added");
	}
	void dispRecords() {
		System.out.println("The records are displayed");
	}
	

}

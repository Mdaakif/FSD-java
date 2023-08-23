package com.y4j.oops.Aakif;

public class Studentinfo {

	
		// TODO Auto-generated method stub
       String fname;
       String lname;
       String email;
       Long mobile;
       int age;
       char gender;
       char section;
       int totalfees;
 
	
static void getFullName(String fname) {
		
		System.out.println(fname + " tanweer");		
		
	}
static void getAgeInMonths(int age) {
	
	System.out.println(age + "");		
	
}
static void getStudentDetails(String email) {
	
	System.out.println(email + "");		
	
}
public static void main(String[] args) {
	getFullName("Aakif");
	getAgeInMonths(25);
	getStudentDetails("aakifcs@gmail.com");
	
}
}

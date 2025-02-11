package com.braindata.bankmanagement.client;

import java.util.Scanner;


import com.braindata.bankmanagement.model.Account;


import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceimpl.Sbi;

public class Test {
public static void main(String[] args) 
{
	 Rbi r1=new Sbi();
	    // r1.createAccount();
	     //r1.balanceCheck();
	     //r1.depositeMoney();
	     //r1.dispalyAllDetails();
	     //r1.withdrawal();
	 Scanner sc=new Scanner(System.in);
	 while(true)
	 {
		 System.out.println("1.Create Account");
		 System.out.println("2.Display All Details");
		 System.out.println("3.Deposite Money");
		 System.out.println("4.Withdrawal");
		 System.out.println("5.Balance Check");
		 
		 int a=sc.nextInt();
		  
		 switch(a)
		 {
		 
		 case 1:
			 r1.createAccount();
			 break;
			 
		 case 2:
			 r1.dispalyAllDetails();
			 break;
			 
		 case 3:
			 r1.depositeMoney();
			 break;
			 
		 case 4:
			 r1.withdrawal();
			 
		 case 5:
		      r1.balanceCheck();
		      break;
		      
		      default:
		    	  System.out.println("Invalid Option");
		 }
		 
	 }
	 
	 
}
}

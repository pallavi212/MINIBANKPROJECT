package com.braindata.bankmanagement.serviceimpl;


import java.util.*;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;
public  class Sbi implements Rbi
{
	Scanner sc=new Scanner(System.in);
	Account a1=new Account();
	 @Override
	 public void  createAccount()
	 {
		 
		 System.out.println("Enter Account No");
		
		 int accno=sc.nextInt();
		 int accno1=accno;
		 int count=0;
		 while(accno!=0)
		 {
			 accno=accno/10;
			 count++;
		 } 
		 if(count==8)
		 {
			a1.setAccno(accno1);	
		 }
		 else {
			// System.out.println("invalid");
			 System.exit(0);
		 }
		 
		System.out.println("Enter Adhar Card No");
		 
		  long adhar=sc.nextLong();
	      long adhar1=adhar;
	      int count1=0;
		   while(adhar!=0)
	        {
			 adhar=adhar/10;
			 count1++;
		    }
		 
		    if(count1==12)
		      {
			 a1.setAdharno(adhar1);
		      }
		 else {
			// System.exit(0);
			 System.out.println("invalid");
		      }
		    
		 System.out.println("Enter Mobile No");
		 
		//  a1.setMobno(sc.nextLong());
		  
		  long mno=sc.nextLong();
		  long mno1=mno;
		  long count2=0;
		  while(mno!=0)
		  {
			  mno=mno/10;
			  count2++;
		  }
		  if(count2==10)
		  {
			  a1.setMobno(mno1);
		  }
		  else {
			  System.exit(0);
		  }
		  
		 System.out.println("Enter Gender");
		 a1.setGender(sc.next());
		 
		 System.out.println("Enter Age");
		// a1.setAge(sc.nextInt());
		 
		 
		   int age1=sc.nextInt();
		   int age2=age1;
		   int count3=0;
		  while(age1!=0)
		  {
			  age1=age1/10;
			  count3++;
		  }
		  if(count3==2)
		  {
			  a1.setAge(age2);
		  }
		  else {
			  System.exit(0);
		  }
		 
		  System.out.println("Enter Name");
		  a1.setName(sc.next());
		  
		  System.out.println("Bank Balance");
		  a1.setBalance(sc.nextDouble());
		 }
	 
	 
	 @Override
		public void dispalyAllDetails()
	 {
		System.out.println(a1.getAccno());
		System.out.println(a1.getAdharno());
		System.out.println(a1.getAge());
		System.out.println(a1.getBalance());
		System.out.println(a1.getGender());
		System.out.println(a1.getName());
		System.out.println(a1.getMobno());
	 }
	 @Override
		public void depositeMoney()
		{
			System.out.println("Enter the amount for deposite");
			int x=sc.nextInt();
			double totalamount=x+a1.getBalance();
			a1.setBalance(totalamount);
			System.out.println(a1.getBalance());
			}
	 @Override
		public void withdrawal()
		{
			System.out.println("Enter Amount for withdrawal");
			int y=sc.nextInt();
			double totalamount1=a1.getBalance()-y;
			a1.setBalance(totalamount1);
			System.out.println(a1.getBalance());
		}
	 @Override
	 public void balanceCheck()
	 {
		 System.out.println("your balance is " +a1.getBalance());
	 }

}
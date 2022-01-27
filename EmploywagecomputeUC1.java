package com.bridgelabz.employwagebuilder;

public class EmploywagecomputeUC1 {
	int IS_FULL_TIME =1;

    public void employeecheck(){
      double empcheck = Math.floor(Math.random() * 10) % 2;
      if (empcheck == IS_FULL_TIME)
        System.out.println("PRESENT");
      else
        System.out.println("ABSENT");
      }
    public static void main(String args[]){
       EmploywagecomputeUC1 e=new EmploywagecomputeUC1();
       e.employeecheck();
      }
    }

package com.tendom;
import java.util.Scanner;

public class Problem1 {	
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Type First value");
	        double a = sc.nextDouble();
	        
	        System.out.println("Type Second value");
	        double b = sc.nextDouble();
	        
	        sc.nextLine();
	        System.out.println("Type Operation (addition, subtraction, multiplication, division or +, -, , /)");
	        String operation = sc.nextLine();
	        Calculate(a,b,operation);
	    }
	    
	    public static void Calculate(double a, double b,String operation){
	 
	        if(operation.equalsIgnoreCase("addition") || operation.equalsIgnoreCase("+")){
	        	System.out.println(a+b);
	        }
	        else if(operation.equalsIgnoreCase("subtraction") || operation.equalsIgnoreCase("-")){
	        	System.out.println(a-b);
	        }
	        else if(operation.equalsIgnoreCase("multiplication") || operation.equalsIgnoreCase("*")){
	        	System.out.println(a*b);
	        }
	        else if(operation.equalsIgnoreCase("division") || operation.equalsIgnoreCase("/")){
	            if(b != 0){
	            	System.out.println(a/b);
	            }else{
	                System.out.println("Cannot devide by 0");
	            }
	        }else{
	            System.out.println("Invalid Operation");
	        }
	}
}

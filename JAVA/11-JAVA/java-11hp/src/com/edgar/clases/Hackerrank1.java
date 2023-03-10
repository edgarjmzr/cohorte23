package com.edgar.clases;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hackerrank1 {





	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        //even
	        if (n%2==0) {
	            
	            //inclusive range of 2 to 5, print Not Weird
	            if(n >= 2 && n <= 5 ) {
	                System.out.println("Not Weird");
	            }
	            
	            //inclusive range of 6 to 20, print Weird
	            if(n >= 6 && n <= 20 ) {
	                System.out.println("Weird");
	            }
	     
	            //greater than 20, print Not Weird
	            if(n > 20 ) {
	                System.out.println("Not Weird");
	            }
	            
	        }else {
	            //odd print weird
	            System.out.println("Weird");
	        }

	        scanner.close();           
	    }
	} 


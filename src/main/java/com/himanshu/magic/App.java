package com.himanshu.magic;

import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException
    {
    	
        	result();
        
    }
    public  static int result() throws FileNotFoundException
    {
    	int igot=0;
    	Scanner sc  = new Scanner(System.in);
    	        
    	    	
    	    	
    			System.out.println("*****************************");
    	       System.out.println("Enter 1 for check of local file in the remote location");
    	       System.out.println("Enter 2 new set of values ");
    	       System.out.println("Enter 3 to close");
    	       
    	       System.out.println("*****************************");
    	       int choice=1;
    	      switch (choice) {
    	      	case 1:
    			Magic mg = new Magic();
    		igot=mg.flag;
    			
    			
    			
    			break;
    	      	
    	      	case 2:
    			//m2 is non static for security purpose
    			App pp = new App();

    	    //	Scanner sc  = new Scanner(System.in);
    	    	System.out.println("Enter the number (number* number square matrix)");
    	    	int n = sc.nextInt();
    	    	System.out.println("Now enter the integers in new Array One by One from row to column");
    	    	int [][] arr = new int[n][n];
    	    	for(int i=0;i<arr.length;i++)
    	    	{
    	    		for(int j=0;j<arr.length;j++)
    	    		{
    	    			arr[i][j]=sc.nextInt();
    	    		}
    	    	}
    	    	Magic mg1=new Magic(arr);
    			igot=mg1.flag;
    			
    			break;
    	      	
    	      	case 3:
    	  	    System.exit(0);
    }
    	      return igot;
 
    }
}


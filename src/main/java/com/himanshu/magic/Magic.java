package com.himanshu.magic;

import java.util.Scanner;
import java.io.*;
//Getting the input for the same

public class Magic  {
	//No Args constructor
	
	
	
	Magic() throws FileNotFoundException
	{
		//Reading the sam.txt file for evaluation
		
		Scanner scc = new Scanner(new BufferedReader(new FileReader("sam.txt")));
	
		
		
		//Counting the number of rows to define myArray;
	
		String[] ss1 = scc.nextLine().trim().split(" ");
		int count=ss1.length;	
		int rows = count;
	      int columns = count;
	      int [][] myArray = new int[rows][columns];
	      
	      
	      
	      //Reading file to store in Array
	    
	      Scanner sc = new Scanner(new BufferedReader(new FileReader("sam.txt")));
	      while(sc.hasNextLine()) {
	         for (int i=0; i<myArray.length; i++) {
	            String[] ss = sc.nextLine().trim().split(" ");
	            for (int j=0; j<ss.length; j++) {
	               myArray[i][j] = Integer.parseInt(ss[j]);
	            }
	            
	         }
	      }
	      
	      //Printing the text file for display(remove /* & */ for printing the array
	  /*    
	      for(int i=0;i<myArray.length;i++){
	      	for(int j=0;j<myArray.length;j++)
	      		System.out.print(myArray[i][j]+" ");
	       System.out.println();
	      }
	    */  
	      
	      
	      int lrsum=0,rlsum=0,rowsum=0,colsum=0;
	      
	      
	      //SUM OF LEFT TO RIGHT
	      
	      
	      for(int i=0;i<myArray.length;i++)
	      {
	    	  for(int j=0;j<myArray.length;j++)
	    	  {
	    		  if(i==j)
	    			 lrsum+= myArray[i][j];
	    	  }
	      }
	      
	      //SUM FROM RIGHT TO LEFT
	      
	      
	      int len=myArray.length-1;
	         for(int i=0;i<myArray.length;i++)
	         {
	           for(int j=0;j<myArray.length;j++)
	           {
	              if(i+j==len)
	                rlsum+= myArray[i][j];
	           }
	         }
	      
	         
	         //SUM OF ROW
	         
	         
	         for(int j=0;j<myArray.length;j++)
	                rowsum+= myArray[0][j];
	          
	       
	   //SUM OF COL
	        
	         for(int i=0;i<myArray.length;i++)
	                colsum+= myArray[i][0];
	       
	        
	         correctnumber(rowsum, colsum, lrsum, rlsum);
	      // if(correctnumber(rowsum, colsum, lrsum, rlsum))
	      //  {System.out.println("This is a magic square");}
	      //  else
	       // System.out.println("This is a not a magic square");
	        
	}
	
	public int flag=0;
	//Method to check for magic number is correct or not
	 public void correctnumber(int row1,int column1,int lrsum1,int rlsum1)
	{
		 if(row1==column1 && row1==lrsum1 && row1==rlsum1)
		 { System.out.println("true");
		 
		 flag=1;
		 }
		 else {
			 System.out.println("false");
			 flag=0;
		 
		 }
		 }
	//Another construction with args as Array
	Magic (int [][] myArray)
	{
		 int lrsum=0,rlsum=0,rowsum=0,colsum=0;
	      
	      //SUM OF LEFT TO RIGHT
	      for(int i=0;i<myArray.length;i++)
	      {
	    	  for(int j=0;j<myArray.length;j++)
	    	  {
	    		  if(i==j)
	    			 lrsum+= myArray[i][j];
	    	  }
	      }
	      //SUM FROM RIGHT TO LEFT
	      int len=myArray.length-1;
	         for(int i=0;i<myArray.length;i++)
	         {
	           for(int j=0;j<myArray.length;j++)
	           {
	              if(i+j==len)
	                rlsum+= myArray[i][j];
	           }
	         }
	         //SUM OF ROW
	         for(int j=0;j<myArray.length;j++)
	           {
	              
	                rowsum+= myArray[0][j];
	          }
	       //SUM OF COL
	        for(int i=0;i<myArray.length;i++)
	         {
	                colsum+= myArray[i][0];   
	       }
	        
	       correctnumber(rowsum, colsum, lrsum, rlsum);
	        
	}

}

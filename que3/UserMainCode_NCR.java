package corejava.assessment_2.que3;
import java.util.*;
import java.util.Scanner;
public class UserMainCode_NCR
{    
	static int nCr(int n, int r)   
    {   
          return fact(n) / (fact(r) * fact(n - r));   
    }   
     
	static int fact(int n)   
    {   
          int res = 1;   
          for (int i = 2; i <= n; i++)   
          res = res * i;   
          return res;   
    }   
   public static void main(String[] args)   
   {   
    
	   Scanner sc = new Scanner(System.in);  
         
       System.out.println("Enter the value of n :");  
       int n = sc.nextInt();   
       System.out.println("Enter the value of r :");
       int r = sc.nextInt();   
       if(n>=r)
	   {
	        
            System.out.println("value of ncr:  "+nCr(n, r)); 
	   }
		else
		  System.out.println("Value of n should be greater than or equal to r value");
   }   
}
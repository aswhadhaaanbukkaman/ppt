import java.util.Scanner;
class PrimeNumbers
{
   public static void main (String[] args)
   {		
   Scanner sc=new Scanner(Syatem.in);
       int i =0;
       int num =0;
       int n=sc.nextInt();
       
       String  primeNumbers = "";

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	    
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}
Output:


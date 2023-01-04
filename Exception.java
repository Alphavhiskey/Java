
	import java.util.Arrays;
import java.util.Scanner;
	 
	public class Exception 
	{
	
	    public static void main (String[] args)
	    {
	        // Initializing String variable with null value
	        String ptr = null;
	 
	        // Checking if ptr.equals null or works fine.
	        try
	        {
	            // This line of code throws NullPointerException
	            // because ptr is null
	            if (ptr.equals("Aditya"))
	                System.out.print("Same");
	            else
	                System.out.print("Not Same");
	        }
	        catch(NullPointerException e)
	        {
	            System.out.print("NullPointerException Caught");
	        }
	        
	        int[] myArray = {897, 56, 78, 90, 12, 123, 75};
	        System.out.println("Elements in the array are:: ");
	        System.out.println(Arrays.toString(myArray));
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the index of the required element ::");
	        try {
	        int element = sc.nextInt();
	        System.out.println("Element in the given index is :: "+myArray[element]);
	        }
	        catch(ArrayIndexOutOfBoundsException e) {
	            System.out.println("The index you have entered is invalid");
	            System.out.println("Please enter an index number between 0 and 6");
	        	
	        }
	        try{  
	            //code that may raise exception  
	            int result=800/0;  
	         }
	         catch(ArithmeticException e)
	         {
	             System.out.println(e);
	         }  
	         //rest code of the program   
	         System.out.println("Program still executes");  
	        }  
	
	    
	}


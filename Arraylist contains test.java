 

import java.io.*;

import java.util.*;







public class Main {
	public static void main(String args[]) throws Exception{
		//write your code here



		Scanner in = new Scanner( System.in);

		System.out.println(" Enter the number of halls:");
		int N= in.nextInt();


		 ArrayList<String> arr = new ArrayList<String>(N);	

		 in.nextLine();

		

		

		   
        for(int i = 0; i < N; i++)
        {

			int m=i+1;

			System.out.println("Enter the Hall Name "+m);


			String val= in.nextLine();





            arr.add(val);
            
         }


		  

		System.out.println("Enter the hall name to be searched:");


			String val= in.nextLine();


			if( arr.contains(val))
			{

					int X=  arr.indexOf(val);

					System.out.println( val+ " hall is found in the list at position "+X);


			}
			else
			{
					 

					 	System.out.println( val+ " hall is not found");

			}












	}

}

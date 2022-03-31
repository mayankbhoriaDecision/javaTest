



import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.ArrayList;
import java.text.ParseException; 


public class Main {

	public static void main(String[] args) throws ParseException 
	{
		//fill your code here






		 Scanner in = new Scanner(System.in);


		 System.out.println("Enter the number of Events");

			int N= in.nextInt();
in.nextLine();


 System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");




	ArrayList<String> EventNames=new ArrayList<String>();



			for ( int i=0;i<N;i++)
			{


				String val= in.nextLine();

				String[] data=val.split("\\,");


				String eventName=data[0];


				String startSTR=data[1];


				String endSTR = data[2];


			 

						
				 Date StartDate=new SimpleDateFormat("dd/MM/yyyy").parse(startSTR);  

				Date endDate=new SimpleDateFormat("dd/MM/yyyy").parse(endSTR);  

				  long diff = endDate.getTime() - StartDate.getTime();


				if(diff==0)
				{
					EventNames.add(eventName);
				}

				 
			 








			}


			System.out.println("1-day Events:");



			if(         EventNames.size()==0)
			{

					System.out.println("No Events");

			}
			else
			{

					 for(String name:EventNames) 
					 {
           					 System.out.println(name);
       					 }


			}














	}

}





import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.ArrayList;
import java.text.ParseException; 

public class Main {
	public static void main(String args[]) throws Exception{
		//write your code here





		 Scanner in = new Scanner(System.in);


		 System.out.println("Enter your choice:");



 System.out.println("1.Exhibition event");

 System.out.println("2.Stage event");

int N= in.nextInt();

in.nextLine();

if(N==1)
{

System.out.println("Enter the details of exhibition:");

String val= in.nextLine();
String[] data=val.split("\\,");

System.out.println("Enter the starting date of the event:");

String startSTR=in.nextLine();

System.out.println("Enter the ending date of the event:");

String endSTR=in.nextLine();

Date StartDate=new SimpleDateFormat("dd-MM-yyyy").parse(startSTR);  

Date endDate=new SimpleDateFormat("dd-MM-yyyy").parse(endSTR);  

 long   diff = Math.round((endDate.getTime() - StartDate.getTime()) / (double) 86400000);


 

double costDay=Double.parseDouble( data[4]);

 

Double gst= costDay*diff*0.05;

System.out.println("The GST to be paid is Rs."+gst);


}
if(N==2)
{



System.out.println("Enter the details of stage event:");

String val= in.nextLine();
String[] data=val.split("\\,");

System.out.println("Enter the starting date of the event:");

String startSTR=in.nextLine();

System.out.println("Enter the ending date of the event:");

String endSTR=in.nextLine();

Date StartDate=new SimpleDateFormat("dd-MM-yyyy").parse(startSTR);  

Date endDate=new SimpleDateFormat("dd-MM-yyyy").parse(endSTR);  


 long   diff = Math.round((endDate.getTime() - StartDate.getTime()) / (double) 86400000);

double costDay=Double.parseDouble( data[4]);  

Double gst= costDay*diff*(0.15);

System.out.println("The GST to be paid is Rs."+gst);







}











	}
}

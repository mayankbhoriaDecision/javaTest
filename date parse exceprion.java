




import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.ArrayList;
import java.text.ParseException; 



public class Main {

	public static void main(String[] args) {
		// your code here



 Scanner in = new Scanner(System.in);



boolean OK=true;

 


System.out.println("Enter the stage event start date and end date");



String startSTR= in.nextLine();


String res="";

try
{

Date StartDate=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss").parse(startSTR);  

String targetStart = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss").format(StartDate);

res=("Start date:"+targetStart);


}	
catch(Exception e  )
{

System.out.println( "Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");

OK=false;


}		









if(OK)
{




String endSTR = in.nextLine();



  

try
{


 Date endDate=new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss").parse(endSTR);



String targetEnd = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss").format(endDate);



 
res+="?"+("End date:"+targetEnd);




}	
catch(Exception e  )
{

System.out.println( "Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");

OK=false;


}		 
 


if(OK)
{

String[] data=res.split("\\?");


System.out.println(data[0]);


System.out.println(data[1]);




}










}



 














	}

}

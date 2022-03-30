

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class Main {
	public static void main(String []args){
		//fill your code here
			try {
		
		
        Scanner in= new Scanner(System.in);

		
      
        
        System.out.println( "Enter the date to be formatted:(MM-dd-yyyy)");
        
        String Data=in.nextLine();
        
        SimpleDateFormat dfParse = new SimpleDateFormat("MM-dd-yyyy");
        
        
        SimpleDateFormat dfFormat1 = new SimpleDateFormat("EEE, MMM d, yy");
        
        
        SimpleDateFormat dfFormat2 = new SimpleDateFormat("dd.MM.yyyy");
        
        
        SimpleDateFormat dfFormat3 = new SimpleDateFormat("dd/MM/yyyy");
        
        
        
        
        
        
     String   date1=   dfFormat1.format(dfParse.parse( Data));
     
     
     String   date2=   dfFormat2.format(dfParse.parse( Data));
     
     String   date3=   dfFormat3.format(dfParse.parse( Data));
     

        
        System.out.println("Date Format with EEE, MMM d, yy : "+date1  );
        
        System.out.println("Date Format with dd.MM.yyyy : "+date2  );
        
        
        System.out.println("Date Format with dd dd/MM/yyyy : "+date3  );
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		}
		catch (java.text.ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
	}
}

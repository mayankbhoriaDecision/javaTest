import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


			


			Scanner in = new Scanner(System.in);

			

			System.out.println("Enter the Name :");
 
        	String RobotName = in.nextLine();




			System.out.println("Enter the Creator Name :");

			String CreatorName = in.nextLine();



			System.out.println("Enter the Purpose :");
			String PurposeName = in.nextLine();
		
 
		 
			System.out.println("Memory Space :");
			int Memory=	in.nextInt();

		 
			 System.out.println("Speed :");
		 	double speed=in.nextFloat();  

			String newSpeed= String.format("%.1f", speed);


			  System.out.println("My Details :");

			System.out.println(  "I am the Robot named "+RobotName+".");

			 System.out.println(  "I was created by "+CreatorName+"." );

			 System.out.println(  "I am created for the purpose of "+PurposeName+".");

			 System.out.println( "My memory space is around "+String.valueOf(Memory)+"Gb and my speed is "+newSpeed+"Tb.");















	}

}

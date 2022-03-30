



import java.util.Scanner;


import java.util.Arrays;


public class Main {



	public static void main(String[] args) {
		//fill your code here

			

			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the number of items:");
			
			
		int	N=in.nextInt();		


		Item[] Obj = new Item[N];	





StringBuilder str = new StringBuilder();









			
		in.nextLine();
		
			  System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
			  
		  for (int x = 0; x < N; x++)
		  {

			  String Data=in.nextLine();



			  
			  String[] val = Data.split("\\$");

			   // System.out.println(    Arrays.toString(val) );
			  
			  String itemName=val[0]; 
			  
			  
			  String Item_Type=val[1]; 





			  
			  
			  String Item_Cost=val[2]; 
			  
			  String Item_Availability=val[3]; 
			  
			  
			 Obj[x] = new Item(	itemName,Item_Type,Integer.parseInt(Item_Cost),Integer.parseInt(Item_Availability	));



		 
			  
			  
			  

			  
		  }


		  System.out.println("Items:");



		  for (int x = 0; x < N; x++)
		  {


			  Obj[x].DisplayData();


		  }
	            
		 
        



	}
}

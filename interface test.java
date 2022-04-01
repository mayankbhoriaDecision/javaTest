


import java.util.Scanner;


public class Main {
    public static void main(String[] args){
		// fill your code here

 Scanner in = new Scanner(System.in);

System.out.println("Choose Stall Type");


 System.out.println("1)Gold Stall");
 System.out.println("2)Premium Stall");
 System.out.println("3)Executive Stall");


int choice=in.nextInt();





if(choice!=1 && choice!=2 && choice!=3)
{

System.out.println("Invalid Stall Type");

}
else
{

in.nextLine();
}









if(choice==1)
{

System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of TV sets)");


String val= in.nextLine();
String[] data=val.split("\\,");


String stallName=data[0];


String cost =data[1];


String ownerName=data[2];


String tvSet=data[3];


GoldStall OBJ = new GoldStall(stallName, Integer.parseInt(  cost),ownerName, Integer.parseInt(  tvSet));


OBJ.display();









}

if(choice==2)
{

System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Projectors)");
String val= in.nextLine();
String[] data=val.split("\\,");


String stallName=data[0];


String cost =data[1];


String ownerName=data[2];


String projector=data[3];



PremiumStall OBJ = new PremiumStall(stallName, Integer.parseInt(  cost),ownerName, Integer.parseInt(  projector));


OBJ.display();

}



if(choice==3)
{

System.out.println("Enter Stall details in comma separated(Stall Name,Stall Cost,Owner Name,Number of Screens)");
String val= in.nextLine();
String[] data=val.split("\\,");


String stallName=data[0];


String cost =data[1];


String ownerName=data[2];


String screen=data[3];




ExecutiveStall OBJ = new ExecutiveStall(stallName, Integer.parseInt(  cost),ownerName, Integer.parseInt(  screen));



OBJ.display();


}















	}
}





public class ExecutiveStall implements Stall
{
	//fill your code here



	private String stallName;

	private int cost;


	private String ownerName;

	private int screen;


	public void display()
	{


System.out.println("Stall Name:"+stallName);
System.out.println("Cost:"+cost+".Rs");
System.out.println("Owner Name:"+ownerName);
System.out.println("Number of Screens:"+screen);

		
	}






	public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer screen)
	{


		this.stallName=stallName;

		this.cost=cost;

		this.ownerName=ownerName;

		this.screen=screen;




	}


	public ExecutiveStall()
	{
		
	}



	public void setStallName(String stallName)
	{
		this.stallName=stallName;
	}


	public void setCost(int cost)
	{
		this.cost=cost;
	}


	public void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}


	public void setScreen(int screen)
	{
		this.screen=screen;
	}


}




public class PremiumStall implements Stall
{
	//fill your code here




	private String stallName;

	private int cost;

	private String ownerName;

	private int projector;


	public PremiumStall(String stallName, Integer cost, String ownerName, Integer projector)
	{


		this.stallName=stallName;

		this.cost=cost;

		this.ownerName=ownerName;

		this.projector=projector;




	}


	public PremiumStall()
	{
		
	}








	public void display()
	{


System.out.println("Stall Name:"+stallName);
System.out.println("Cost:"+cost+".Rs");
System.out.println("Owner Name:"+ownerName);
System.out.println("Number of Projectors:"+projector);

		
	}







	public void setStallName(String stallName)
	{
		this.stallName=stallName;
	}


	public void setCost(int cost)
	{
		this.cost=cost;
	}


	public void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}



public void setProjector(int projector)
	{
		this.projector=projector;
	}










}





public class GoldStall implements Stall
{
	//fill your code here




	private String stallName;

	private int cost;


	private String ownerName;


	private int tvSet;


	public GoldStall(String stallName, Integer cost, String ownerName, Integer tvSet)
	{


		this.stallName=stallName;

		this.cost=cost;

		this.ownerName=ownerName;

		this.tvSet=tvSet;








	}

	public GoldStall()
	{
		
	}



	public void display()
	{


System.out.println("Stall Name:"+stallName);
System.out.println("Cost:"+cost+".Rs");
System.out.println("Owner Name:"+ownerName);
System.out.println("Number of TV sets:"+tvSet);






		

	}





	public void setStallName(String stallName)
	{
		this.stallName=stallName;
	}


	public void setCost(int cost)
	{
		this.cost=cost;
	}


	public void setOwnerName(String ownerName)
	{
		this.ownerName=ownerName;
	}


	public void setTvSet(int tvSet)
	{
		this.tvSet=tvSet;
	}




}






public interface Stall {
 	//fill your code here


	public void display();
	 



}























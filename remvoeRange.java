

public class User{
    //Your code here


    String name;

    String contactNumber;

    String userName;

    String email;


    public   User(String name, String contactNumber, String userName, String email)
    {
        this.name=name;

        this.contactNumber=contactNumber;

        this.userName=userName;

        this.email=email;
 
    }


    public void display()
    {
         System.out.printf("%-20s%-20s%-20s%-20s\n",name,contactNumber,userName,email);
    }






}



import java.util.ArrayList;

public class UserBO extends ArrayList<User>{
    public static UserBO getList(){
		UserBO u=new UserBO();
		u.add(new User("mohan Raja","9874563210","mohan","mohan@abc.in"));
		u.add(new User("arjun Ravi","4324237","arjun","arjun@abc.in"));
		u.add(new User("Arun kumar","9845671230","arun","arun@abc.in"));
		u.add(new User("prakash raj","7548921445","prakash","raj@abc.in"));
		return u;
	}
    //Your code here


	public	ArrayList<User> UserList;


	public UserBO()
	{


		UserList=getList();




	}




	public ArrayList<User> initalval()
	{
		return UserList;
	}



	public void removeUser(int n1,int n2)	
	{

		this.UserList.removeRange(n1,n2);



		
		for(int i=0; i<  Userlist.size(); i++)
		{
			User temp=Userlist.get(i);
			
		}


		


	}






}



import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main{
    public static void main(String[] args){


	ArrayList<User> Userlist = new ArrayList<User>();

	UserBO UserBOobj=new UserBO();

	Userlist=UserBOobj.initalval();	

	System.out.println("Enter the number of User details to be added");
  
		Scanner in = new Scanner(System.in);
 		int	N=in.nextInt();

		in.nextLine();

		for(int i=0;i<N;i++)
		{
 	 		System.out.println("Enter the number of User :"+  String.valueOf(i+1)  +" details to be added"   ) ;
 
			String val=in.nextLine();
 
			String[] data=val.split("\\,");
 
			String name=data[0];

			String mobileNumber=data[1];

			String username=data[2];

			String password=data[3];
 
			User userobj=new User(	name,mobileNumber,username,password			);
 
			Userlist.add(userobj);
 
		}



 System.out.printf("%-20s%-20s%-20s%-20s","Name","Contact Number","Username","Email");



	for(int i=0;i<Userlist.size();i++)
		{
				 Userlist.get(i).display();
			
		}



System.out.println("Enter the range to be removed from array list");


int P=in.nextInt();
int Q=in.nextInt();


UserBOobj.removeUser(P,Q);








 
	}
}










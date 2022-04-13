public class User {
	//write your code here



	String name;

	String mobileNumber;

	String username;

	String password;


	
	public User(String name,String mobileNumber,String username,String password)
	{
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.username=username;
		this.password=password;
	}

	public String getName()
	{
		return name;
	}

	public String getMobile()
	{
		return mobileNumber;
	}


	public String getUsername()
	{
		return username;
	}

	public String getPassword()
	{
		return password;
	}




}









import java.util.ArrayList;
import java.io.*;




public class UserBO {

	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
		//write your code here


		  try
        {

		 for (int i = 0; i < userList.size(); i++) {
 

			User temp= userList.get(i);


           bw.write(temp.getName());

			bw.write("\"");

	
           bw.write(temp.getMobile());

			bw.write("\"");

           bw.write(temp.getUsername());

			bw.write("\"");


           bw.write(temp.getPassword());

			bw.write("\"");


            
        }

		}
		 catch (IOException except)
        {
            except.printStackTrace();
        }






	}
}













 
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Main {
	public static void main(String args[]) {
		//write your code here
 
		ArrayList<User> Userlist = new ArrayList<User>();
  
		Scanner in = new Scanner(System.in);
 		int	N=in.nextInt();

		in.nextLine();

		for(int i=0;i<N;i++)
		{
 	 		System.out.println("Enter the details of users:"+  String.valueOf(i)) ;
 
			String val=in.nextLine();
 
		String[] data=val.split("\\,");
 
			String name=data[0];

			String mobileNumber=data[1];

			String username=data[2];

			String password=data[3];
 
			User userobj=new User(	name,mobileNumber,username,password			);
 
			Userlist.add(userobj);
 
		}

		 try
        {
        FileWriter geek_file;
  		geek_file = new FileWriter("output.csv");
      
  		BufferedWriter geekwrite = new BufferedWriter(geek_file);

		UserBO printerr= new UserBO();


		try{
 
		UserBO.writeFile(Userlist,geekwrite);

		}
		catch( Exception except)
        {
            except.printStackTrace();
		 

		}




		}
		 catch (IOException except)
        {
            except.printStackTrace();
        }
 
	}
}






















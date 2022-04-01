
public class User {
	//Your code here




	private String name;

	private String mobile;

	private String username;

	private String password;


	public  User(String name, String mobile, String username, String password)
	{

		this.name=name;

		this.mobile=mobile;

		this.username=username;

		this.password=password;

		







	}


	public String getPSWRD()
	{
		return password;
	}





}


import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserBO 
{
	//Your code here


	 

	public static void validate(User u)	throws WeakPasswordException 
	{

		String password=u.getPSWRD();

		int len=password.length();

        boolean hasLetter = false;
        boolean hasDigit = false;

		boolean special=false;
		boolean lenF=false;

		if(len>=10 && len<=20)
		{
			lenF=true;
		}

		 

Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
Matcher m = p.matcher(password);
special = m.find();












            for (int i = 0; i < password.length(); i++)
			 {
                char x = password.charAt(i);
                if (Character.isLetter(x)) 
				{

                    hasLetter = true;
                }

                else if (Character.isDigit(x)) 
				{

                    hasDigit = true;
                }

              }


    
        





		if(       (lenF&&hasDigit&&hasLetter&&special) ==false)
		{
				throw new WeakPasswordException("Your password is weak");
		}
 

	}


}









public class WeakPasswordException extends Exception {
		//Your code here

		 public WeakPasswordException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
	
	}
  











import java.io.*;

import java.util.Scanner;








public class Main {

	public static void main(String[] args)throws WeakPasswordException, IOException {
		//Your code here






Scanner in = new Scanner(System.in);
    System.out.println("Enter the user details");
		String st=in.nextLine();
		String[] str=st.split(",");


		User UserOBJ = new User(str[0],str[1],str[2],str[3]);


        UserBO Checker = new UserBO();



 		try
        {

             Checker.validate(  UserOBJ );
		 
                       System.out.println(   "Name:"+str[0]   );

											System.out.println(   "Mobile:"+str[1]   );

											System.out.println(   "Username:"+str[2]   );

											System.out.println(   "Password:"+str[3]   );

											 

        }
        catch(   WeakPasswordException ex   )
        {

            System.out.println(ex);

        }	








		
	}

}











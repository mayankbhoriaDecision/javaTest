import java.io.*;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws DuplicateMobileNumberException,IOException
	{

		Scanner in = new Scanner(System.in);
    System.out.println("Enter the contact details");
		String st=in.nextLine();
		String[] str=st.split(",");


        ContactDetailBO Checker = new ContactDetailBO();

        try
        {

             Checker.validate(  str[0],  str[1] );
		 
                       System.out.println(   "Mobile:"+str[0]   );

											System.out.println(   "Alternate mobile:"+str[1]   );

											System.out.println(   "LandLine:"+str[2]   );

											System.out.println(   "Email:"+str[3]   );

											System.out.println(   "Address:"+str[4]   );

        }
        catch(   DuplicateMobileNumberException ex   )
        {

            System.out.println(ex);

        }	
	}
}



public class ContactDetailBO {

	public static void validate(String mobile,String AlternateMobile) throws DuplicateMobileNumberException
    {

      if(mobile.equals(AlternateMobile))
			{
				 
				throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");

			}
            


    }
}







import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class UserBO {
	//Your code here



	public void display(List<User> list)
	{



            System.out.printf( "%-15s %-20s %-15s %s\n", "Name", "Email","Username","Password" );
           
         
              for(int i = 0; i < list.size(); i++) 
              {

                  



                   String[] val=    list.get(i).getUserData();


        
            System.out.printf( "%-15s %-20s %-15s %s\n", val[0] , val[1]  , val[2] , val[3] );



           


  
                }
           

	}

	public  List<User> readFromFile(BufferedReader br)	
	{	

        		 List<User> Userlist = new ArrayList<User>();

            try
            {
		            String line = null;

                    while((line = br.readLine()) != null)
                    {
                        String[] result = line.split("\\,");


                        String name =result[0];
                        String email=result[1];
                        String username=result[2];
                        String password=result[3];

                        User UserOBJ= new User( name,email,username,password );

                        if(!Userlist.contains(UserOBJ))
                        {
                            
                             Userlist.add(UserOBJ);

                        }

                       


                    }

                   


                display(Userlist);


            }
            catch(IOException e  )
            {

            }



		return Userlist;
		
	}












}






import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args){
		
		//Your code here



		try {


       
      BufferedReader br = new BufferedReader(new FileReader("input.csv"));


	  UserBO UserReadOBJ = new UserBO();

	  	UserReadOBJ.readFromFile(br);
      


    	}
    	catch(IOException e) 
		{


      e.printStackTrace();


   		 }















	}
}



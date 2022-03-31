







import java.util.*;




public class Main {



	public static void main(String[] args) {
		// fill the code here




		Scanner in = new Scanner(System.in);


		 Set<String> hash_Set = new HashSet<String>();





		 int AddEmail=1;



		 while(AddEmail==1)
		 {



			 	

		 		System.out.println("Enter Email address");


			 	String val= in.nextLine();


				 hash_Set.add(val);


				System.out.println("Do you want to Continue?(yes/no)");


				String choice= in.nextLine();
	

				if(choice.equals("yes"))
				{
					AddEmail=1;
				}
					if(choice.equals("no"))
				{
					AddEmail=0;
				}



		 }

		


	System.out.println("Enter the email addresses to be searched separated by comma");

		String emails= in.nextLine();


		String[] res= emails.split("\\,");


		int AllPresent=1;



		 for (int i = 0; i < res.length; i++) 
		 
		 {
  
           

           

           if(hash_Set.contains(res[i])==false)
		   {

			   AllPresent=0;
		   }
		   else
		   {
			   // System.out.println(res[i]);
		   }




        }





		if(AllPresent==0)
		{
				System.out.println("Email addresses are not present");
		}
		else
		{
				System.out.println("Email addresses are present");
		}











	}

}

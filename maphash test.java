 import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		//Your code here
              
		 Map<String, List<Address> > MegaMap= new HashMap<String, List<Address>>();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of address");

		int N=in.nextInt();


            List<Address> AddList = new ArrayList<>();


            in.nextLine();


		for(int i=0;i<N;i++)
		{

                  int m=i+1;

	      System.out.println("Enter the address "+m+" detail");




		String val=in.nextLine();



            String[] res = val.split("\\,");

               String addressLine1=res[0];

              String addressLine2=res[1];

              String city=res[2];

              String state=res[3];

             String pincode=res[4];




             List<Address>  value = MegaMap.get(city);




             Address AddrObj= new Address(  addressLine1,addressLine2, city,state, Integer.valueOf( pincode ) );

             if(value==null)
             {
                  
                  AddList.add(AddrObj );
                   MegaMap.put( city,AddList  );
             }
             else

             {
                   
                   AddList = MegaMap.get(city);
                   AddList.add(AddrObj );
                   MegaMap.put( city,AddList  );

             }
		}

		System.out.println("Enter the city to be searched");

		String cityVal=in.nextLine();


       List<Address> AddVals = MegaMap.get(cityVal);

      if (AddVals != null)
       {

             
 


            System.out.printf( "%-15s %-15s %-15s %-15s %s\n",  "Line 1" , "Line 2"  , "City" ,"State" , "Pincode"  );

             for (int i = 0; i < AddVals.size(); i++) 
             
             {
                     String[] res= AddVals.get(i).getAddValue();

                   if(  res[2].equals(cityVal)        )
                   {


  
                         System.out.printf( "%-15s %-15s %-15s %-15s %s\n",  res[0]  ,res[1]   , res[2], res[3] ,  res[4]  );                            

                   }


                      


              }
         
      } 
      else 
      {
         System.out.println("Searched city not found");

      }


	
      }

}

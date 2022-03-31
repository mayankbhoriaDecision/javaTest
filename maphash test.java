import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		//Your code here
              
		 Map<String, List<Address> > MegaMap= new HashMap<String, List<Address>>();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the number of address");

		int N=in.nextInt();

		for(int i=0;i<N;i++)
		{

				System.out.println("Enter the address "+i+" detail");
				String val=in.nextLine();
            String[] res = val.split("\\,");

               String addressLine1=res[0];

              String addressLine2=res[1];

              String city=res[2];

              String state=res[3];

             String pincode=res[4];

             boolean  value = MegaMap.get(city);

             Address AddrObj= new Address(  addressLine1,addressLine2, city,state, Integer.valueOf( pincode ) );

             if(value==null)
             {
                  List<Address> AddList = new ArrayList<>();
                  AddList.add(AddrObj );
                   MegaMap.put( city,AddList  );
             }
             else

             {
                  List<Address> AddList = new ArrayList<>();
                     AddList = map.get(city);
                    AddList.add(AddrObj );
                   MegaMap.put( city,AddList  );

             }
		}

		System.out.println("Enter the city to be searched");

		String cityVal=in.nextLine();


      Foo value = MegaMap.get(cityVal);

      if (value != null)
       {

             List<Address> AddVals = MegaMap[ cityVal];


            System.out.printf( "%-15s %-15s %-15s %-15s %s\n",  "Line 1" , "Line 2"  , "City" ,"State" , "Pincode"  );

             for (int i = 0; i < AddVals.size(); i++) 
             
             {


                        String[] res= AddVals.get(i).getAddValue();

                         System.out.printf( "%-15s %-15s %-15s %-15s %s\n",  res[0]  ,res[1]   , res[2], res[3] ,  res[4]  );

              }
         
      } 
      else 
      {
         System.out.println("Searched city not found");

      }


	
	

}

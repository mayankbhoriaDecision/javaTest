


public class Address {
    //your code here


            private String addressLine1;

            private String addressLine2;

            private String city;

            private String state;


            private Integer pincode;



            public Address(String addressLine1, String addressLine2, String city,String state, Integer pincode)
            {

               this.addressLine1=       addressLine1;

              this.addressLine2=          addressLine2;

                 this.city=        city;

                     this.state=   state;


                  this.pincode=  pincode;



            }



         public String[] getAddValue()
         {


               String[] res= new String[5];

               res[0]=addressLine1;


               res[1]=addressLine2;

               res[2]= city;

               res[3]=state;

               res[4]=  String.valueOf(  pincode);



               return res;





         }



}

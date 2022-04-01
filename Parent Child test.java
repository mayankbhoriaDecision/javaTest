public class FundTransfer {
	//write your code here



	private String accountNumber;

	private Double balance;

	public boolean validate(Double transfer)
	{

		if( accountNumber.length()==10 && transfer>=0 && transfer <balance		)
		{
			return true;
		}


		return false;

	}	




	public FundTransfer(String accountNumber, Double balance)
	{

		this.accountNumber=accountNumber;

		this.balance=balance;



	}



	public Double getBalance()
	{
		return balance;
	}

	public void setBalance(Double newBalance)
	{
		this.balance=newBalance;
	}








	public boolean  transfer(Double transfer)
	{

		return false;


	}



}




public class NEFTTransfer extends FundTransfer
{
	//write your code here


	String accountNumber;


	Double balance;



	public	NEFTTransfer(String accountNumber,Double balance)
	{

		    super(accountNumber,balance);

		 


	}

	public boolean check(Double transfer)
	{



	 	return	super.validate(transfer);






		
	}



	public Double getBalance()
	{
		return super.getBalance();
	}




	public boolean transfer(Double transfer)	
	{


		Double newVal = transfer+ 0.05*transfer;


		if(newVal<super.getBalance())
		{


			Double val=super.getBalance();

			val-=newVal;


			super.setBalance(val);


			return true;






		}


		return false;


	}






}



public class IMPSTransfer extends FundTransfer
{
	//write your code here	

String accountNumber;


	Double balance;



	public	IMPSTransfer(String accountNumber,Double balance)
	{

		   super(accountNumber,balance);


	}

	public boolean check(Double transfer)
	{



	 	return	super.validate(transfer);






		
	}




	public Double getBalance()
	{
		return super.getBalance();
	}



	public boolean transfer(Double transfer)	
	{



		Double newVal= transfer+ 0.02*transfer;


		Double val=super.getBalance();

			 



		if(newVal<val)
		{


				val-=newVal; 	super.setBalance(val);

				return true;


		}


	return false;

	




	}








}





public class RTGSTransfer extends FundTransfer
 {
	//write your code here



String accountNumber;


	Double balance;



	public	RTGSTransfer(String accountNumber,Double balance)
	{

		   super(accountNumber,balance);


	}

	public boolean check(Double transfer)
	{



	 	return	super.validate(transfer);






		
	}


	public Double getBalance()
	{
		return super.getBalance();
	}








	public boolean transfer(Double transfer)	
	{


			Double val=super.getBalance();

			if(transfer>10000)
			{


				val-=transfer;
			super.setBalance(val);

				return true;




			}

		return false;


	}










}





import java.util.Scanner;



public class Main {
	public static void main(String args[]) throws Exception {
		//write your code here

Scanner in = new Scanner(System.in);


System.out.println("Enter your account number:");

String accNum=in.nextLine();





System.out.println("Enter the balance of the account:");


String temp=in.nextLine();



double balance=Double.parseDouble(temp);  



System.out.println("Enter the type of transfer to be made:");

System.out.println("1.NEFT");

System.out.println("2.IMPS");

System.out.println("3.RTGS");




int choice= in.nextInt();

in.nextLine();

System.out.println("Enter the amount to be transferred:");


String temp2=in.nextLine();



double transferAmnt=Double.parseDouble(temp2);  








if(choice==1)
{



		NEFTTransfer OBJ = new NEFTTransfer(accNum,balance);



		if(OBJ.check(transferAmnt)==false)
		{

					System.out.println("Account number or transfer amount seems to be wrong");

		}
		else
		{

					boolean res=  OBJ.transfer(transferAmnt);

					if(res)
					{

						System.out.println("Transfer occurred successfully");


						Double blnc= OBJ.getBalance();


					System.out.println("Remaining balance is "+blnc);

						




					}
					else
					{
						System.out.println("Transfer could not be made");
					}

		}




	
}



if(choice==2)
{



		IMPSTransfer OBJ = new IMPSTransfer(accNum,balance);



		if(OBJ.check(transferAmnt)==false)
		{

					System.out.println("Account number or transfer amount seems to be wrong");

		}
		else
		{

					boolean res=  OBJ.transfer(transferAmnt);

					if(res)
					{

						System.out.println("Transfer occurred successfully");


						Double blnc= OBJ.getBalance();


					System.out.println("Remaining balance is "+blnc);

						




					}
					else
					{
					System.out.println("Transfer could not be made");

					}

		}




	
}




if(choice==3)
{



		RTGSTransfer OBJ = new RTGSTransfer(accNum,balance);



		if(OBJ.check(transferAmnt)==false)
		{

					System.out.println("Account number or transfer amount seems to be wrong");

		}
		else
		{

					boolean res=  OBJ.transfer(transferAmnt);

					if(res)
					{

						System.out.println("Transfer occurred successfully");


						Double blnc= OBJ.getBalance();


					System.out.println("Remaining balance is "+blnc);

						




					}
					else
					{
						System.out.println("Transfer could not be made");

					}

		}




	
}

























	}
}














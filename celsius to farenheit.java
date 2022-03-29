

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//fill your code here

		Scanner in = new Scanner(System.in);


		System.out.println("Temparature in Celsius:");

		int celNum=in.nextInt();


		double fnum=celNum*1.8 + 32;

		System.out.println("Temparature in Fahrenheit is "+fnum+"F");









	}

}

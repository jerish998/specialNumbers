package specialNumbers;

import java.util.*;

public class PrimeNumber {
	/*A prime number (or a prime) is a natural number greater than 1 
	that is not a product of two smaller natural numbers
	1 , 2,3,5...
	*/
	public static boolean isPrime(int num) {
		int i=1,count=0;
		if(num==1||num==2) {
			return true;
		}else {
			while(i<=num) {
				if (num%i==0) 
					count=count+1;
				i++;
			}
			if(count==2) {
				return true;
			}else {
				return false;	
			}
		}
	}
	//checking the number is prime or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enetr the number");
		int num = obj.nextInt();//gets input from user
		boolean prime=isPrime(num);//passing to the method isPrime and return true or false
		if(prime==true) {
			System.out.println("Entered number is prime");
		}else {
			System.out.println("Entered number is not prime");
		}
	}
	/*for printing the number in the range */
	/*
	public static void main(String[] args) {
		System.out.println("the Prime number in the range of  o to 500:");
		int num =1;
		while(num<500) {
			boolean auto =isPrime(num);
			if(auto==true)
				System.out.println(num);
				num++;
		}
		
		}
	*/
}

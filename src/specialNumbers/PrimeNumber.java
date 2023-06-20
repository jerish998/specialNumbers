package specialNumbers;

import java.util.*;

public class PrimeNumber {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Prime numbers under the ra
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

}

package specialNumbers;

import java.util.Scanner;

public class PalinDromeNumber {
 /*
  * palindrome number is same when reads from left to right and right to left*/
	public boolean isPalinDrome(int num) {
		if((num%10==0&&num !=0) || num<0) //checking for tens or negative number then return false
			return false;
			int rev=0;//assign reverse variable
			while(num>rev) {//when num is less than  rev loop break
				rev = rev*10 + num%10;//reversing the number by last digits 
				num/=10;
			}
		if (num==rev||num==rev/10)//checking the two numbers 
			return true;
		else
			return false;
	}
	//for checking number is palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		Scanner obj = new Scanner(System.in);
		int num= obj.nextInt();
		PalinDromeNumber obj1 =new PalinDromeNumber();
		boolean pal=obj1.isPalinDrome(num);
		if(pal==true)
			System.out.println("the number is palindrome");
		else 
			System.out.println("not palindrome:");
			
	}
	/*for printing the number in the range */
	/*
	public static void main(String[] args) {
		System.out.println("the palindrome number in the range of  o to 500:");
		int num =1;
		PalinDromeNumber obj1 =new PalinDromeNumber();
		while(num<500) {
			boolean auto = obj1.isPalinDrome(num);//passing num to method 
			if(auto==true)
				System.out.println(num);
				num++;
		}
		
		}
	*/
}

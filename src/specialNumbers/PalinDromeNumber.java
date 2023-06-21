package specialNumbers;

import java.util.Scanner;

public class PalinDromeNumber {
 
	public boolean isPalinDrome(int num) {
		if((num%10==0&&num !=0) || num<0) //checking for tens or negative number then return false
			return false;
			int rev=0,temp=num;//assign num to temp
			while(temp>0) {
				rev=rev*10+temp%10;//reversing the number
				temp/=10;
			}
		if (rev==num||temp==rev/10)//checking the two numbers 
			return true;
		else
			return false;
	}
	
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

}

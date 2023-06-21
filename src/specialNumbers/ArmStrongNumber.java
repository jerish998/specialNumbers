package specialNumbers;

import java.util.Scanner;

public class ArmStrongNumber {
	
	public static boolean isArmStrong(int num) {
		int temp,a=num,arm=0;
		while(a>0) {
			temp=a%10;//asiging last digit to temp variable
			arm +=temp*temp*temp;//taking cube of last digit and add to previous result
			a=a/10;//iterating the while variable
		}
		if (arm==num) {//checking the num is true or not then return 
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		Scanner obj = new Scanner(System.in);
		int num=obj.nextInt();
		boolean as = isArmStrong(num);
		if (as==true) {
			System.out.println("the number is ArmStrong ");
		}else {
			System.out.println("this is not Armstrong");
		}
	}

}

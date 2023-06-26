package specialNumbers;

import java.util.Scanner;

public class PerfectNumber {
/*perfect number, a positive integer 
 * that is equal to the sum of its proper divisors.
 *  The smallest perfect number is 6,
 *  which is the sum of 1, 2, and 3.
 * Other perfect numbers are 28, 496, and 8,128.
 * */
	public boolean isPerfectNumber(int num) {
		int temp=0;
		for (int i=1;i<num;i++) {
			if(num%i==0)
				temp+=i;
		}
		if(temp==num)
			return true;
		else
			return false;
	}
	
	/*for checkin the num is perfect or not*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
Scanner obj =new Scanner(System.in);
int num = obj.nextInt();
PerfectNumber obj1= new PerfectNumber();
boolean perf=obj1.isPerfectNumber(num);
if(perf==true)
	System.out.println("the number is perfect number : ");
else
	System.out.println("the number is not perfect number");

	}

	/*for printing the number in the range */
	/*
	public static void main(String[] args) {
		System.out.println("the perfect number in the range of  o to 500:");
		int num =1;
		while(num<500) {
			PerfectNumber obj1 =new PerfectNumber();//object creation to call isAutoMorphicNumber because not static
			boolean auto = obj1.isPerfectNumber(num);
			if(auto==true)
				System.out.println(num);
				num++;
		}
		
		}
	*/
	
}

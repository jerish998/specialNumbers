package specialNumbers;

import java.util.Scanner;

public class PeterSonNumber {
	/*Peterson if the sum of factorials of each 
	 * digit is equal to the sum of the number itself.
	 * 145=1!+4!=5!
	 * 	  =1+24+120
	 * 145=145
	 * */
	
	public int isFact(int num1) {//calculating the factorial using recursion
		if(num1==1) 
			return 1;
		else 
			return (num1*isFact(num1-1));
	}
	
public static boolean isPeterSon(int num) {//checking for peterson numberr
	int fact=0;
	int a=num,res=0;
	while(a>0) {
		int temp=a%10;
		PeterSonNumber obj=new PeterSonNumber();
		fact=obj.isFact(temp);//to find factorial passing the number to isFact() method
		res+=fact;
		a/=10;
	}
	if(res==num) //checcking num and result is equal
		return true;
	else 
		return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();//getting number from user
		boolean peter = isPeterSon(num);//passing to method isPeterSon and getting true or false
		if(peter==true) //cheking the condition
			System.out.println("The number is PETERSON");
		else
			System.out.println("THe number is NOT peterson");
	}
}

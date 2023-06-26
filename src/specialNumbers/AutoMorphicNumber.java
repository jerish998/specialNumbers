package specialNumbers;

import java.util.Scanner;

public class AutoMorphicNumber {
	//An automorphic number is an integer 
	//whose square ends with the given integer,
	//as (25)2 = 625, and (76)2 = 5776.
	/*****************/
	/*for checking the number is true or false*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");//getting number from user
		Scanner obj =new Scanner(System.in);
		int num = obj.nextInt();
		AutoMorphicNumber obj1 =new AutoMorphicNumber();//object creation to call isAutoMorphicNumber because not static
		boolean auto = obj1.isAutoMorphic(num);
		String result = (auto) ? "Auto morphic" : "Not Automorphic";//checking with ternary operator
		System.out.println("the number is "+ result);
	}
	/*for printing the number in the range */
	/*
	public static void main(String[] args) {
		System.out.println("the Automorphic number in the range of  o to 500:");
		int num =1;
		while(num<500) {
			AutoMorphicNumber obj1 =new AutoMorphicNumber();//object creation to call isAutoMorphicNumber because not static
			boolean auto = obj1.isAutoMorphic(num);
			if(auto==true)
				System.out.println(num);
				num++;
		}
		
		}
	*/
	public boolean isAutoMorphic(int num) {
		int square = num*num,lastTwo;
		lastTwo=square%100;
		System.out.println("Square of number is "+ square);//disable when printing all number in the range 
		boolean check;
		return check =(lastTwo == num )? true : false;//checking and return using ternary operator
	}
}

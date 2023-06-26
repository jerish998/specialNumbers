package specialNumbers;

import java.util.Scanner;

public class ArmStrongNumber {
	/* Armstrong number is a number that is
	 *  equal to the sum of cubes of its digits. 
	 *  1, 153, 370, 371 and 407
	 * */
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
//for checking the number
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
	
	//for printing the number in the range
	
/*public static void main(String[] args) {
 System.out.println("Armstrong number in the range of 1 to 500 ");
 int num =1;
 while(num<=500){//change the limit "500" to get more number
 boolean as = isArmStrong(num);
 if(as==true)
 System.out.println(num);
 num++;
 }
}
*/
}

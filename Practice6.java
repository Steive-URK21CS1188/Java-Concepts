//import java.util.Scanner;
//public class Practice6 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of rows to be printed");
//        int rows = sc.nextInt();
//        int k=1;
//        for (int i = 1; i <= rows; i++) {//rows=4
//        	for(int j=1;j<=rows-i;j++)//rows(4)-5=0 j=1
//            {
//                System.out.print(" ");
//            }
//        	for (int j = 1; j <= i; j++) //i=5,j=5
//            {
//                System.out.print(k);
//                k++;
//            }
//        	System.out.println();
//            }	
//	}
//}
import java.util.Scanner;
class Practice6 {
public static void main(String[] args) {
	int sum = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a no of inputs");
	int number = input.nextInt();
//	do {
//		System.out.println(number);
//		number--;
//	}while(number>0);
	boolean f=true;
	while (f) {
		sum+=number;
		if (number%2!=0) {
			f=false;
		}
		else {
			System.out.println("Enter a number");
			number=input.nextInt();
		}	
	}
System.out.println("Sum = " + sum);
	}
}
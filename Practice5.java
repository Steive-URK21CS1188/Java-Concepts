//import java.util.Scanner;
//public class Practice5 {
//	public static void main(String[] args) {
////		float r,a;
////		Scanner s = new Scanner(System.in);
////		System.out.println("Enter Radius:");
////		r=s.nextFloat();
////		a=3.14f*(r*r);
////		System.out.println("Area of Circle: "+a);
////		
//		//Type Conversion
//		//byte b=10;
//		//int a=b;
//		//System.out.println(a);
//		
//		int b=10;//range -128 to 127 byte
//		byte a= (byte)b;
//		System.out.println(a);
//		double x=10.5;
//		int v=(int)x;
//		System.out.println(v);
//	}
//}
//import java.util.Scanner;
//public class Practice5 {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Number: ");
//		char num = sc.next().charAt(0);
//		switch(num) {
//			case 'A': System.out.println("Apple");
//				//break;
//			case 'B':System.out.println("Orange");
//				break;
//			case 'C': System.out.println("Mango");
//				break;
//			case 'D': System.out.println("Pineapple");
//				break;
//			default:
//				System.out.println("Invalid");
//				break;
//
//		}
//		
//	}
//}

//public class Practice5 {
//
//	   public static void main(String args[]) {
//	      int x = 50;
//	      int y = 1;
//
//	      if( x == 5 ) {
//	    	 System.out.println("AB");
//	         if( y == 1 ) {
//	            //System.out.print("X = 30 and Y = 10");
//	            System.out.println("A");
//	         }
//	         System.out.println("B");
//	      }
//	   }
//	}
//----------------------------
//
//public class Practice5 {
//	static boolean b;
//	public static void main(String [] args) {
//		short hand = 42;
//		if ( hand < 50 && !b ) 
//			hand++;
//		else if ( hand > 40 ) {
//			hand += 7;
//			hand++;
//		}	
//		else
//			--hand;
//		System.out.println(hand);
//		
//		
//	}
//}

//public class Practice5 {
//	public static void main(String [] args) {
//		int i = 1, j = 10;
//		do
//		{
//			if(i > j)
//			{
//				break;
//			}
//			j--;
//		} while (++i < 5);
//		System.out.println("i = " + i + " and j = " + j);	
//	}
//}


//public class Practice5 {
//	public static void main(String [] args) {
//		int i = 1, j = -1;
//		switch (i)
//		{
//			case 0, 1: j = 1;
//			case 2: j = 2;
//			default: j = 0;
//		}
//		System.out.println("j = " + j);
//	}
//}
public class Practice5 {
	public static void main(String [] args) {
		int n=5;
		while(n>0) {
			System.out.println("Kowshi");
			n--;
		}
	}
}
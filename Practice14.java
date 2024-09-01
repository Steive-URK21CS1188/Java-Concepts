//import java.util.Scanner;
//public class Practice14 {
//	public static void main(String[] args) {
//		int a=0,b=0;
//		Scanner s=new Scanner(System.in);
//		System.out.print("Enter Size of array:");
//		int n=s.nextInt();
//		int num[]=new int[n];
//		int Even[]=new int[n];
//		int Odd[]=new int[n];
//		System.out.println("Enter "+n+" Numbers:");
//		for(int i=0;i<n;i++) {
//			num[i]=s.nextInt();
//		}
//		for(int j=0;j<n;j++) {
//			if (num[j]%2==0){
//				Even[a]=num[j]*num[j]*num[j];
//				a++;
//			}
//			else {
//				Odd[b]=num[j]*num[j];
//				b++;
//			}
//		}
//		System.out.println("Original Array:");
//		for(int k=0;k<n;k++) {
//			System.out.println(num[k]);
//		}
//		System.out.println("Even Array:");
//		for(int l=0;l<a;l++) {
//			System.out.println(Even[l]);
//		}
//		System.out.println("Odd Array:");
//		for(int m=0;m<b;m++) {
//			System.out.println(Odd[m]);
//		}	
//	}
//}

//import java.util.Scanner;
//public class Practice14 {
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		String p="";
//		int i=0;
//		char[] small ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//		char[] capital= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I','J', 'K', 'L', 'M', 'N', 'O', 'P','Q','R','S','T', 'U', 'V','W', 'X', 'Y', 'Z'};
//		int[] numbers = {0,1,2,3,4,5,6,7,8,9};
//		System.out.print("Enter Length of Password:");
//		int l=s.nextInt();
//		while(l>0 && i<=l){
//			for(int j=0;j<=i;j++) {
//				if(i%4==0) {
//					p=small[i+1]+p;
//					break;
//				}
//				else if(i%3==0||i%7==0) {
//					p=capital[i]+p;
//					break;
//				}
//				else if(i%5==0 || i%2==0){
//					p=numbers[i+2]+p;
//					break;
//				}
//			}
//			i++;
//		}
//		System.out.println("Generated Password: "+p);
//	}	
//}

//import java.util.Scanner;
//public class Practice14 {
//	public static void main(String[] args) {
//		int a;
//		Scanner i= new Scanner(System.in);
//		System.out.print("Enter an Integer:");
//		a=i.nextInt();
//		if(a>0) {
//			if(a%2==0) {
//				if(a>0 && a<=7) {
//					System.out.println("Not Weird");
//				}
//				else if(a>7 && a<=22) {
//					System.out.println("Weird");
//				}
//				else if(a>23) {
//					System.out.println("Not Weird");
//				}
//			}
//			else {
//				System.out.println("Wierd");
//			}
//		}
//		else {
//			System.out.println("Wrong Input");
//		}
//	}
//}


import java.util.Scanner;
public class Practice14 {

	public static void main(String[] args) {
		int a,b,r;
		String x="";
		Scanner i=new Scanner(System.in);
		System.out.print("Enter a Decimal Number:");
		a=i.nextInt();
		while(a>0) {
			r=a%2;
			x=r+x;
			a=a/2;
		}
		System.out.println("Binary Converted: "+x);	
	}
}
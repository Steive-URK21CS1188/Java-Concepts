import java.util.Scanner;
public class Practice13 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=s.nextInt();
		int f=1;
		do {
			f=a*f;
			a--;
		}while(a>0);
		System.out.println("Factorial: "+f);
	}
}
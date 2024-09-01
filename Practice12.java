import java.util.Scanner;
public class Practice12 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=s.nextInt();
		do {
			System.out.println(a);
			a--;
		}while(a>0);
	}
}
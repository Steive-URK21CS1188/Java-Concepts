import java.util.Scanner;
public class Practice11 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int  n=7890 ,digits=0;
		while(n!=0) {
			n=n/10;
			System.out.println(n);
			digits++;
		}
		System.out.println(digits);
	}
}
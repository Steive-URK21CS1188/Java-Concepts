import java.util.Scanner;
public class Practice7 {

	public static void main(String[] args) {
		char a;
		Scanner s=new Scanner(System.in);
		a=s.next().charAt(0);
		//a=s.nextInt();
		switch(a) {
		case 'a':
			System.out.println("Apple");
//			break;
		case 'b':
			System.out.println("Orange");
//			break;
		case 'c':
			System.out.println("Mango");
//			break;
		case 'k':
			System.out.println("Pineapple");
//			break;
		default:
			System.out.println("Invalid");
//			

		}

	}

}

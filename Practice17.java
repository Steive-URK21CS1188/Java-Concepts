import java.util.Scanner;
public class Practice17 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of Customers:");
		int n=s.nextInt();
        String names[]=new String[n+1];
        System.out.println("Enter Customer Names:");
        for (int i=0;i<=n;i++) {
        	names[i]=s.nextLine();
        }
        String temp;
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Contact List:");
        for (int i = 0; i <= n; i++) {
            System.out.println(names[i]);
        }
	}
}
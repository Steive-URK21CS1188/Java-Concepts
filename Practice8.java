import java.util.Scanner;
public class Practice8 {
	public static void main(String[] args) {
//		int Arr[];
//		Arr= new int[10];
//		int Arr[]=new int[10];
		Scanner n=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int a=n.nextInt();
		int N[]=new int[a];
		System.out.println("Enter "+a+" values");
		for(int i=0;i<N.length;i++) {
			N[i]=n.nextInt();
		}
		for(int i:N) {
			System.out.println(i);
		}
//		System.out.println("Enter no. to search:");
//		int b=n.nextInt();
//		boolean s=false;
//		for(int i=0;i<N.length;i++){
//		for(int i=N.length-1;i>-1;i--){
//			System.out.println(N[i]);
//		for(int i:N) {
//			if (i==b) {
//				s=true;
//				break;
//			}
//		}
//		if(s) {
//			System.out.println(b+" is found");
//		}
//		else {
//			System.out.println(b+" is not found");
//		}
		char l[]= {'a','b','c'};
		for(char v:l) {
			System.out.println(v);
		}
		String var[]= {"HI","Hello","How are u"};
		for(String v:var) {
			System.out.println(v);
		}
	}
}
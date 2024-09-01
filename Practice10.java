import java.util.Scanner;
public class Practice10 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int arr[][]= {{1,2,3},{4,5},{6,7,8,9}};//Array of array
//		System.out.println(arr[2][0]);
//		Create 2D array from input
		System.out.print("Enter no. of Rows:");
		int r=s.nextInt();
		System.out.print("Enter no. of Column:");
		int c=s.nextInt();
		int arr[][]= new int[r][c];//row*column Matrix
		System.out.println("Enter The values for Matrix");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("Arr["+i+"]["+j+"]:");
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
//				System.out.println(arr[i][j]); //print each element
//				System.out.print(arr[i][j]+" ");//Matrix Method
				System.out.print(arr[j][i]+" ");//Matrix Method Transpose
			}
			System.out.println();//Matrix Method
		}
	}
}
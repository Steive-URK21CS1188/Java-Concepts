import java.util.Scanner;
class car{
	String m,b,c,f;
	double p;
	
	void display() {
		System.out.println("Model: "+m+"\nBrand: "+b+"\nColor: "+c+"\nFuel: "+f+"\nPrice: "+p);
	}
	void setprice(double a) {
		p=a;
	}
}
public class Practice20 {
	public static void main(String[] args) {
		car ob=new car();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Model:");
		ob.m=s.nextLine();
		System.out.println("Enter Brand:");
		ob.b=s.nextLine();
		System.out.println("Enter Colour:");
		ob.c=s.nextLine();
		System.out.println("Enter Fuel:");
		ob.f=s.nextLine();
		System.out.println("Enter Price:");
		ob.p=s.nextDouble();
		ob.display();
		ob.setprice(1325000);
		ob.display();
	}
}


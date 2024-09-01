import java.util.Scanner;
// final it cannot be inherited or over written so we cannot use final in abstract
abstract class cal{//if class is abstract cannot create an object
	abstract void sq(int x);
	abstract void fac(int x);
	void sum(int x,int y) {
		System.out.println(x+y);
	}
}
class cu extends cal{//base class- super class- parent class
	void sq(int x) {
		System.out.println(x*x);
	}
	void fac(int x) {
		int s=1;
		while(x>0) {
			s=s*x;
			x--;
		}
		System.out.println(s);
	}
}
public class Practice27 {
	public static void main(String[] args) {
		cal ob=new cu();
		ob.sum(5, 15);
		ob.sq(2);
		ob.fac(5);
		cu ob1=new cu();
		ob1.sum(15, 5);
		ob1.sq(5);
	}
}
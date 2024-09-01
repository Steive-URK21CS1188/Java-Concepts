import java.util.Scanner;
class Calc{
	double pi=3.14;
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
}

class AdvCalc extends Calc{
	//add and sub inherited
	int mul(int a, int b) {
		return a*b;
	}
	int div(int a, int b) {
		return a/b;
	}
	double CirAr(int r) {
		return pi*(r*r);
	}
}

public class Practice25 {
	public static void main(String[] args) {
		AdvCalc ob= new AdvCalc();
		System.out.println(ob.add(10, 20));
		System.out.println(ob.sub(10, 20));
		System.out.println(ob.mul(10, 20));
		System.out.println(ob.div(10, 20));
		System.out.println(ob.CirAr(10));
	}
}
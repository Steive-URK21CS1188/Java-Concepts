//
//public class Practice28 {
//	static int a=10;
//	int b=20;
//	Practice28(){
//		a++;
//		b++;
//	}
//	static void view() {
//		System.out.println(a);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println(Practice28.a);
//		Practice28 ob=new Practice28();
//		Practice28 ob1=new Practice28();
//		Practice28 ob2=new Practice28();
//		System.out.println(ob.a+" "+ob.b);
//		System.out.println(ob.a+" "+ob.b);
//		System.out.println(ob1.a+" "+ob1.b);
//		System.out.println(ob2.a+" "+ob2.b);
//		System.out.println("sum"+(5+6));
//	}
//
//}
class A {
// non-static method
String s="AAA";
class B{
	String s="BBB";
	void meth() {
		System.out.println(s);
	}
}
}
public class Practice28 {
public static void main( String[] args ) {
// create an instance of the StaticTest class
A ob=new A();
System.out.println(ob.s);
A.B ob2=ob.new B();
System.out.println(ob2.s);
ob2.meth();
}
}
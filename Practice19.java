
public class Practice19 {
	int x,y;
	void view() {
		System.out.println("X value: "+x+"\nY value: "+y);
	}
	void mod(int m,int n) {
		x=m;
		y=n;
	}
	public static void main(String[] args) {
		int x=10,y=45;
		Practice19 ob=new Practice19();
		ob.view();
		System.out.println(ob.x);
		System.out.println(ob.y);
		ob.x=100;
		ob.y=200;
		System.out.println(ob.x);
		System.out.println(ob.y);
		System.out.println(x);
		ob.view();
		ob.mod(x,y);
		ob.view();
	}
}
	

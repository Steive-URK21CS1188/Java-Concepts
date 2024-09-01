import java.util.Scanner;
class Rect{
	int l,b;
	Rect(int l, int b){
		this.l=l;
		this.b=b;
	}
	void view() {
		System.out.println("Length: "+l+"\nBreadth: "+b);
	}
	boolean comp(Rect ob2) {
		if (this.l==ob2.l && this.b==ob2.b) {
			return true;
		}
		else
			return false;
	}
	Rect sc(int r) {
		int le=l*r;
		int br=b*r;
		Rect t=new Rect(le,br);
		return t;
	}
}
public class Practice24 {
	public static void main(String[] args) {
	Rect r1=new Rect(10,25);
	Rect r2=new Rect(10,25);
	System.out.println(r1.comp(r2));
	Rect r3=r1.sc(2);
	r3.view();
	}
}

public class E3 {
	enum F{
		A,B,C;
	}
	public static void main(String[] args) {
		F a=F.A;
		F b=F.C;
		if(b.compareTo(a)>0) {
			System.out.println(b+" comes after "+a);
		}
		
	}

}

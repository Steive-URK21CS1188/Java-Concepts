import java.util.Scanner;//Multilevel
class Pers{
	String N,G;
	Pers(String N,String G){
		System.out.println("Person");
		this.N=N;
		this.G=G;
	}
//	void dis() {
//		System.out.println("Name: "+this.N+"\nGender: "+this.G);
//	}
}

class Emp extends Pers{
	String eid;
	double S;
	Emp(String N,String G, String eid,double S){
		super(N,G);//If not included compiler will include automatically, mandatory when constructor is parameterized
		System.out.println("Employee");
		this.eid=eid;
		this.S=S;
	}
	void setDet(String N,String G,String eid,double S){
		super.N=N;
		this.G=G;
		this.eid=eid;
		this.S=S;
	}
	void dis() {
//		super.dis();
		System.out.println("Name: "+this.N+"\nGender: "+this.G+"\nID: "+this.eid+"\nSalaray:"+this.S);
	}
}
class Doc extends Emp{
	int g;
	Doc(String N,String G, String eid,double S,int g){
		super(N,G,eid,S);
		System.out.println("Doctor");
		this.g=g;
	}
	void dis() {
//		super.dis();
		System.out.println("Name: "+this.N+"\nGender: "+this.G+"\nID: "+this.eid+"\nSalaray:"+this.S+"\nGrade Pay:"+this.g);
	}
}
public class Practice26 {
	public static void main(String[] args) {
//		Emp ob=new Emp("SteJ","Male","E101", 7500);
		Doc ob1=new Doc("SteJ","Male","E101", 7500,85);
//		ob.setDet("SteJ","Male", "E101", 75000);
		ob1.dis();
	}
}
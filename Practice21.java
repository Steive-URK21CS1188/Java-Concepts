import java.util.Scanner;
class Std{
	String name;
	int regno;
	int m[]=new int[5];
	int avg=0;
	Scanner s=new Scanner(System.in);
	Std(){
		System.out.println("Constructor");
		
		System.out.print("Enter Name:");
		name=s.nextLine();
		System.out.print("Enter RegNo:");
		regno=s.nextInt();
	}
	void view(){
		System.out.println("Name: "+name+"\nRegno:"+regno);
		for(int i=0;i<m.length;i++) {
			System.out.println("Mark "+(i+1)+": "+m[i]);
		}
	}
	void smark() {
		System.out.println("Enter Marks:");
		for(int i=0;i<m.length;i++) {
			m[i]=s.nextInt();
		}
	}
	void avg() {
		for(int i:m) {
			avg+=i;
		}
		avg/=m.length;
		System.out.println("Average Mark: "+avg);
	}
}
public class Practice21 {

	public static void main(String[] args) {
		Std s1=new Std();
		s1.smark();
		Std s2=new Std();
		s2.smark();
		s1.view();
		s1.avg();
		s2.view();
		s2.avg();
	}
}
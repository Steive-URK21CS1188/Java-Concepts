//import java.util.*;
//public class Practice3 {
//	public static void main(String[] args) {
//		int a,b,c;
//		Scanner in =  new Scanner(System.in);
//		System.out.println("Enter First Number:");
//		a= in.nextInt();
//		System.out.println("Enter Second Number:");
//		b= in.nextInt();
//		c=a+b;
//		System.out.println("The Sum of No.'s = "+c);
//	}
//}
import java.util.Scanner;
class AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(String s){
        super(s);
    }
}
class NameNotValidException extends Exception{
    NameNotValidException(String st){
        super(st);
    }
}
class Student{
    int sid,a;
    String n,c;
    Student(int sid,String n,int a,String c){
        this.sid=sid;
        this.n=n;
        this.a=a;
        this.c=c;
    }
    public void pri(){
        System.out.println(this.sid+" "+this.n+" "+this.a+" "+this.c);
    }
}
class Practice3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=0;
        try{
        int h=s.nextInt();
        String h1=s.next();
        int ag=s.nextInt();
        String co=s.next();
        if(ag<15&&ag>21){
            throw new AgeNotWithinRangeException("Age is not between 15 and 21");
        }
        
        for(int i=0;i<h1.length();i++){
            if(((int)h1.charAt(i)>=97&&(int)h1.charAt(i)<=122)||((int)h1.charAt(i)>=65&&(int)h1.charAt(i)<=90));
            else {
            	a++;
            }
        }
        if(a!=0) {
        	throw new NameNotValidException("Invalid");
        }
        Student ob=new Student(h,h1,ag,co);
        ob.pri();
        System.out.println(ob.sid+" "+ob.n);
        }catch(AgeNotWithinRangeException e){
            System.out.println(e.getMessage());
        }catch(NameNotValidException ex){
            System.out.println(ex.getMessage());
        }
       
    }
}
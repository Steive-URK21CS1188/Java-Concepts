
public class Practice15 {
	public static void main(String[] args) {
		String n="Hi";
		String s=new String("hello");
		String e= new String();
		char l[]= {'a','b','c'};
		String str=new String (l);
		String str2=new String(l,1,2);// arr,index,no of characters
		System.out.println(n);
		System.out.println(s);
		System.out.println(str2);
		byte asci[]= {97,98,102,99,69};
		String S=new String(asci);
		System.out.println(S);
		System.out.println(S.length());
		s=s.concat(S);
		System.out.println(s);
		int a=100;
		String str3=String.valueOf(a);
		System.out.println(str3);
		}
}
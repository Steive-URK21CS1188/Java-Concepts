
public class Practice16 {
	public static void main(String[] args) {
//		String s= "welcome";
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				System.out.println(c);
//			}
//		}
//		char arr[]=s.toCharArray();
//		for(char v:arr) {
//			System.out.println(v);
//		}
//
//		String s1=s.substring(1, 5);
//		System.out.println(s1);
		String e1="JAVA";
		String e2="java";
		String e3="java";
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e2));
		System.out.println(e2.equalsIgnoreCase(e1));
		System.out.println(e1.startsWith("JA"));
		System.out.println(e1.endsWith("VA"));
		System.out.println(e1.compareTo(e3));// 0- same, -1-e1<e3, 1-e1>e3
	}
}
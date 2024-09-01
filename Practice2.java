//static int computeDivision(int a, int b) 
//{
//    int res =0;
//    try
//    {
//        res = a/b;
//    }catch(NumberFormatException ex)
//    {
//        System.out.println("NumberFormatException");
//    }
//    return res;
//}
//public class Practice2{
//public static void main(String args[])
//{
//    int a = 1,b = 0;
//    try
//    {
//        int i = computeDivision(a,b);
//        System.out.println(i);
//    }
//    catch(ArithmeticException e)
//    {
//        System.out.println(e.getMessage());
//    }
//}
//}


		
		class One extends Thread{
			public void run(){
				for(int i=0; i<2; i++){
					System.out.print(i);
				}
			}
		}

		public class Practice2{
			public static void main(String args[]){
				Practice2 t = new Practice2();
				t.call(new One());
			}
			
			public void call(One o){
				o.start();
			}
		}
	



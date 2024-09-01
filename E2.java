
//Abstract
import java.util.Scanner;
class Account{
	String A_Name;
	long A_Number;
	double Balance;
	Account(String A_Name,long A_Number, double Balance){
		this.A_Name=A_Name;
		this.A_Number=A_Number;
		this.Balance=Balance;
	}
	void setBalance(double Balance) {
		this.Balance=Balance;
	}
	double getBalance() {
		return this.Balance;
	}
	void deposit(long A_Number,double amt) {
		System.out.println("DEPOSIT");
	}
	double withdraw(long A_Number, double amt) {
		System.out.println("WITHDRAW");
		return 0;
	}
	double viewBalance(long A_Number) {
		return 0;
	}
}
class SBI_BANK extends Account implements Transaction{
	SBI_BANK(String A_Name,long A_Number, double Balance){
		super(A_Name,A_Number,Balance);
	}
	public void deposit(long A_Number,double amt) {
		if(A_Number==this.A_Number) {
			this.setBalance(this.getBalance()+amt);
			System.out.println("Amount Deposited Successfully...");
		}
		else {
			System.out.println("Invalid Account Number!!!");
		}
	}
	public double withdraw(long A_Number, double amt) {
		if(A_Number==this.A_Number) {
			if(this.getBalance()>=amt) {
				this.setBalance(this.getBalance()-amt);
				return amt;
			}
			return 1;
		}
		else {
			System.out.println("Invalid Account Number!!!");
			return 0;
		}
	}
	public double viewBalance(long A_Number) {
		if(A_Number==this.A_Number) {
			return this.getBalance();
		}
		else {
			System.out.println("Invalid Account Number!!!");
			return 0;
		}
	}
}
class AXIS_BANK extends Account implements Transaction{
	AXIS_BANK(String A_Name,long A_Number, double Balance){
		super(A_Name,A_Number,Balance);
	}
	public void deposit(long A_Number,double amt) {
		if(A_Number==this.A_Number) {
			this.setBalance(this.getBalance()+amt);
			System.out.println("Amount Deposited Successfully...");
		}
		else {
			System.out.println("Invalid Account Number!!!");
		}
	}
	public double withdraw(long A_Number, double amt) {
		if(A_Number==this.A_Number) {
			if(this.getBalance()>=amt) {
				this.setBalance(this.getBalance()-amt);
				return amt;
			}
			return 1;
		}
		else {
			System.out.println("Invalid Account Number!!!");
			return 0;
		}
	}
	public double viewBalance(long A_Number) {
		if(A_Number==this.A_Number) {
			return this.getBalance();
		}
		else {
			System.out.println("Invalid Account Number!!!");
			return 0;
		}
	}
}
public class E2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String ans="";
		String ans1="";
		String ans2="";
		Account ob1=null;;
		do {
			System.out.print("1.SBI Bank\n2.AXIS Bank\n3.Exit\nEnter your Choice:");
			int c=s.nextInt();
			switch(c) {
			case 1:
				do {
					System.out.println("***SBI_BANK***");
					System.out.print("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit\nEnter your Choice:");
					int a=s.nextInt();
					switch(a) {
					case 1:
						System.out.print("Enter Name of Account Holder:");
						String N1=s.next();
						System.out.print("Enter Account Number : ");
						long an = s.nextLong();
						System.out.println("Deposit Amount");
						System.out.print("Enter total Balance: ");
						double e1= s.nextDouble();
						ob1=new SBI_BANK(N1, an, 0);
						ob1.deposit(an, e1);
						break;
					case 2:
						System.out.print("Enter Account Number : ");
						an = s.nextLong();
						System.out.println("Withdraw Amount");
						System.out.print("Enter Amount to Withdraw: ");
						e1= s.nextDouble();
						System.out.println("Withdrawed Amount: "+ob1.withdraw(an, e1));
						break;
					case 3:
						System.out.print("Enter Account Number : ");
						an = s.nextLong();
						System.out.println("Balance");
						System.out.println("Remaining Amount in Account: "+ob1.viewBalance(an));
						break;
					case 4:break;
					default : 
						System.out.println("Invalid choice");
						break;
					}
					System.out.print("Do you want any other Transactions in SBI(y/n):");
					ans1=s.next();
				}while(ans1.equals("y"));
				break;
			case 2:
				do {
					System.out.println("***AXIS_BANK***");
					System.out.print("1.Deposit\n2.Withdraw\n3.Balance\n4.Exit\nEnter your Choice:");
					int a=s.nextInt();
					switch(a) {
					case 1:
						System.out.println("Deposit Amount");
						System.out.print("Enter Name of Account Holder:");
						String N1=s.next();
						System.out.print("Enter Account Number : ");
						long an = s.nextLong();
						System.out.print("Enter total Balance: ");
						double e1= s.nextDouble();
						ob1=new AXIS_BANK(N1, an, 0);
						ob1.deposit(an, e1);
						break;
					case 2:
						System.out.println("Withdraw Amount");
						System.out.print("Enter Account number: ");
						an = s.nextLong();
						System.out.print("Enter Amount to Withdraw: ");
						e1= s.nextDouble();
						System.out.println("Withdrawed Amount: "+ob1.withdraw(an, e1));
						break;
					case 3:
						System.out.println("Balance");
						System.out.print("Enter Account number: ");
						an = s.nextLong();
						System.out.println("Remaining Amount in Account: "+ob1.viewBalance(an));
						break;
					case 4:break;
					default : 
						System.out.println("Invalid choice");
						break;
					}
					System.out.print("Do you want any other Transactions in Axis(y/n):");
					ans2=s.next();
				}while(ans2.equals("y"));
			}
			System.out.print("Do you want to Continue(y/n):");
			ans=s.next();
		}while(ans.equals("y"));
	}
}




//Interface
public interface Transaction {
	void deposit(long A_Number,double amount);
	double withdraw(long A_Number, double amount);
	double viewBalance(long A_Number);
}
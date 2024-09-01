
import java.util.Scanner;
abstract class Contacts{
	String Name,mail_id;
	long Mobile;
	Contacts(String Name,long Mobile,String mail_id){
		this.Name=Name;
		this.Mobile=Mobile;
		this.mail_id=mail_id;
	}
	abstract void AddContact(String Name,long Mobile,String mail_id);
	abstract void EditContact(String Name,long Mobile,String mail_id);
	abstract void ViewContact();
}
class WhatsApp extends Contacts{
	WhatsApp(String Name, long Mobile, String mail_id){
		super(Name, Mobile, mail_id);
	}
	public void AddContact(String Name,long Mobile,String mail_id){
		this.Name=Name;
		this.Mobile=Mobile;
		this.mail_id=mail_id;
		System.out.println("Contact added Successfully...");
	}
	public void EditContact(String Name,long Mobile,String mail_id){
		if (this.Name.equalsIgnoreCase(Name)) {
			this.Mobile=Mobile;
			this.mail_id=mail_id;
			System.out.println("Contact updated Successfully...");
		}
		else
			System.out.println("Name not found!!");	
	}
	public void ViewContact(){
		System.out.println("-----WhatsApp Contacts-----\nName: "+this.Name+"\nMobile Number: "+this.Mobile+"\nE-Mail_id: "+this.mail_id);
	}
}
class FaceBook extends Contacts{
	FaceBook(String Name, long Mobile, String mail_id){
		super(Name, Mobile, mail_id);
	}
	public void AddContact(String Name,long Mobile,String mail_id){
		this.Name=Name;
		this.Mobile=Mobile;
		this.mail_id=mail_id;
		System.out.println("Contact added Successfully...");
	}
	public void EditContact(String Name,long Mobile,String mail_id){
		if (this.Name.equalsIgnoreCase(Name)) {
			this.Mobile=Mobile;
			this.mail_id=mail_id;
			System.out.println("Contact updated Successfully...");
		}
		else
			System.out.println("Name not found!!");	
	}
	public void ViewContact(){
		System.out.println("-----FaceBook Contacts-----\nName: "+this.Name+"\nMobile Number: "+this.Mobile+"\nE-Mail_id: "+this.mail_id);
	}
}

public class E1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String op="";
		String op1="";
		String op2="";
		Contacts Obj=null;;
		do {
			System.out.print("1.WhatsApp\n2.FaceBook\n3.Exit\nEnter your Choice:");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				do {
					System.out.println("***Whatsapp***");
					System.out.print("1.Add Contacts\n2.Edit Contact\n3.View Contact\n4.Exit\nEnter your Choice:");
					int a=sc.nextInt();
					switch(a) {
					case 1:
						System.out.print("Enter Name of Contact:");
						String Name1=sc.next();
						System.out.print("Enter the Mobile number : ");
						long Phone1 = sc.nextLong();
						System.out.print("Enter the Email ID : ");
						String eid1= sc.next();
						Obj=new WhatsApp(Name1, Phone1, eid1);
						Obj.AddContact(Name1, Phone1, eid1);
						break;
					case 2:
						System.out.print("Search Name of Contact:");
						Name1=sc.next();
						System.out.print("Enter new Mobile number: ");
						Phone1 = sc.nextLong();
						System.out.print("Enter new Email ID : ");
						eid1= sc.next();
						Obj.EditContact(Name1, Phone1, eid1);
						break;
					case 3:
						Obj.ViewContact();
						break;
					case 4:break;
					default : 
						System.out.println("Invalid choice");
						break;
					}
					System.out.print("Do you want to Continue in Whatsapp(yes/no):");
					op1=sc.next();
				}while(op1.equals("yes"));
				break;
			case 2:
				do {
					System.out.println("***FaceBook***");
					System.out.print("1.Add Contacts\n2.Edit Contact\n3.View Contact\n4.Exit\nEnter your Choice:");
					int b=sc.nextInt();
					switch(b) {
					case 1:
						System.out.print("Enter Name of Contact:");
						String Name=sc.next();
						System.out.print("Enter the Mobile number : ");
						long Phone = sc.nextLong();
						System.out.print("Enter the Email ID : ");
						String eid= sc.next();
						Obj=new FaceBook(Name, Phone, eid);
						Obj.AddContact(Name, Phone, eid);
						break;
					case 2:
						System.out.print("Search Name of Contact:");
						Name=sc.next();
						System.out.print("Enter new Mobile number: ");
						Phone= sc.nextLong();
						System.out.print("Enter new Email ID : ");
						eid= sc.next();
						Obj.EditContact(Name, Phone, eid);
						break;
					case 3:Obj.ViewContact();
						break;
					case 4:break;
					default : 
						System.out.println("Invalid choice");
						break;
					}
					System.out.print("Do you want to Continue in Facebook(yes/no):");
					op2=sc.next();
				}while(op2.equals("yes"));
			}
			System.out.print("Do you want to Continue(yes/no):");
			op=sc.next();
		}while(op.equals("yes"));
	}
}




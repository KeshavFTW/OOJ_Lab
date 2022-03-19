import java.util.Scanner;
class Account{
	String name;
	long accountno;
	String typeAcc;
	int balance;
	Scanner sc;
	Account(String name, long accountno, String typeAcc){
		this.name = name;
		this.accountno = accountno;
		this.typeAcc = typeAcc;
		this.balance=500;
		sc= new Scanner(System.in);
	}
	public void Display(){
		System.out.println("**********Account Details*********");
		System.out.println("Name of Customer : "+this.name);
		System.out.println("Account number : "+this.accountno);
		System.out.println("Type of Account : "+this.typeAcc);
	}
	public void Accept(){
		System.out.println("Enter the amount to be deposited");
		int amount = sc.nextInt();
		this.balance += amount;
		System.out.println("Succesfully Credited ");
		System.out.println("Available Balance : "+this.balance);

	}
	public void permit(){
		System.out.println("Enter the amount to withdraw");
		int amount= sc.nextInt();
		if(amount<balance){
			balance -= amount;
			System.out.println("Succesfully Debited ");
			System.out.println("Available Balance : "+balance);
		}
		else{
			System.out.println("Sorry!! Insufficient Balance : "+balance);
		}
	}
}
class Curr_Acct extends Account{
	Curr_Acct(String name, long accountno, String typeAcc){
		super(name, accountno, typeAcc);
		System.out.println("*************Current Account*************");
	}
	public void Display(){
		super.Display();
		System.out.println("Balance : "+super.balance);
		System.out.println("**********Thank You*********");
	}
	private void compute(){
		if(super.balance<1000){
			super.balance -= 100;
			System.out.println("Due to low balance fine of 100rs has been applied");
		}
		return;
	}
	public void permit(){
		super.permit();
		compute();
	}
	public void cheque(){
		System.out.println("Cheque book services available");
	}
}
class Sav_Acct extends Account{
	Sav_Acct(String name, long accountno, String typeAcc){
		super(name, accountno, typeAcc);
		System.out.println("*************Savings Account*************");
	}
	public void Display(){
		super.Display();
		System.out.println("Balance : "+super.balance);
		System.out.println("**********Thank You*********");
	}
	public void compute(){
		System.out.println("Enter the the time lapse after the Account creation(in months)");
		int time=sc.nextInt();
		double t=time/12.0;
		double n=Math.pow((1+0.05/12),12*t);
		super.balance=(int)(super.balance*n);
	}
	public void cheque(){
		System.out.println("Sorry!!Cheque book services unavailable");
	}
}

public class Bank{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the name of Customer : ");
		String name=sc.next();
		System.out.print("Enter the Account Number : ");
		long accno=sc.nextLong();
		System.out.print("Enter the Type Account(current or savings) :");
		String typeAcc=sc.next();
		if(typeAcc.equals("current")){
			System.out.println("Current Account created:");
			Curr_Acct ca1=new Curr_Acct(name,accno,typeAcc);
			while(true){
				System.out.println("Enter Options");
				System.out.println("1-Deposit");
				System.out.println("2-Debit");
				System.out.println("3-Display Balance");
				System.out.println("4-Cheque book Available");
				System.out.println("5-Exit from Bank");
				int ch=sc.nextInt();
				switch(ch){
				case 1:
				ca1.Accept();
				break;
				case 2:
				ca1.permit();
				break;
				case 3:
				ca1.Display();
				break;
				case 4:
				ca1.cheque();
				break;
				case 5:
				System.out.println("Thank You visit again");
				System.exit(0);
				default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
		else{
			Sav_Acct sa1=new Sav_Acct(name,accno,typeAcc);
			while(true){
				System.out.println("Enter Options");
				System.out.println("1-Deposit");
				System.out.println("2-Debit");
				System.out.println("3-Display Balance");
				System.out.println("4-Cheque book Available");
				System.out.println("5-Compute intrest of your balance");
				System.out.println("6-Exit from Bank");
				int ch=sc.nextInt();
				switch(ch){
					case 1:
					sa1.Accept();
					break;
					case 2:
					sa1.permit();
					break;
					case 3:
					sa1.Display();
					break;
					case 4:
					sa1.cheque();
					break;
					case 5:
					sa1.compute();
					break;
					case 6:
					System.out.println("Thank You visit again");
					System.exit(0);
					default:
					System.out.println("Invalid Choice");
				}
			}
		}

	}
}
package OOps;

class BankAccount
{
	private String userName;
	private double balance;
	private String accountNumber;
	private long mobile;
	private int age;
	private String password;
	
	public BankAccount(String userName,String accountNumber,long mobile,int age,String password)
	{
		this.userName=userName;
		this.accountNumber=accountNumber;
		this.mobile=mobile;
		this.age=age;
		this.password=password;
	}
	
	public void setuserName(String name)
	{
		this.userName=name;
	}
	
	public String getuserName()
	{
		return userName;
		
	}
	
	public void setmobile(long mob)
	{
		this.mobile=mob;
	}
	
	public long getmobile()
	{
		return mobile;
	}
	
	public void setage(int ages)
	{
		this.age=ages;
	}
	public int getage()
	{
		return age;
	}
	
	public void setpassword(String pass)
	{
		this.password=pass;
	}
	public String getpassword()
	{
		return password;
	}
	
	public String accountNumber()
	{
		return accountNumber;
	}
	public double getbalance()
	{
		return balance;
	} 
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited amount" + amount);
			System.out.println("Total amount" + balance);
		}
		else
		{
			System.out.println("Invalid deposit for the given account");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance)
		{
			balance-=amount;
			System.out.println("Amount withdrawl done" + amount);
			System.out.println("Total amount" + balance);
		}
		else
		{
			System.out.println("Invalid withdraw amount");
			System.out.println(balance);
		}
	}
}


public class Encapsulation {
	
	public static void main(String[] args) {
		BankAccount bank=new BankAccount("Jspiders","123456789",987654321,23,"Supriya@218");
		System.out.println("Account Holder :" + bank.getuserName());
		System.out.println("Account Number :" + bank.accountNumber());
		System.out.println("Mobile number : "+ bank.getmobile());
		System.out.println("Age: "+ bank.getage());
		bank.deposit(500);
		System.out.println("new balance :" +bank.getbalance());
		bank.withdraw(1000);
		System.out.println("new balance :" + bank.getbalance());
		bank.setuserName("Jspiders institute");
		System.out.println("new updated name : " + bank.getuserName());
		
	}
	
	

}

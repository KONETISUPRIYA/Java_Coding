package OOps;

class whatsapp
{  
	public void m1()
	{
		System.out.println("Text msg");

	}
}

class whatsappv1 extends whatsapp
{
	public void m2()
	{
		System.out.println("voice msg");
	}
}

public class singlelevelinheritance {
	public static void main(String[] args) {
		whatsappv1 app=new whatsappv1();
		app.m1();
		app.m2();
	}
	
	

}

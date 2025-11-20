package OOps;

interface whatsapp1
{
	 void m1();
}

interface whatsapp2
{
	void m2();
	
}

interface whatsapp3
{
	void m3();
	
}

class Whatsappv implements whatsapp1,whatsapp2,whatsapp3
{
	@Override
	public void m1()
	{
		System.out.println("voice msg");
	}
	
	@Override
	public void m2()
	{
		System.out.println("voice msg");
	}
	
	@Override
	public void m3()
	{
		System.out.println("video call");
	}
	
}

public class multipleinheritance {
	public static void main(String[] args) {
		Whatsappv app=new Whatsappv();
		app.m1();
		app.m2();
		app.m3();
	}

}

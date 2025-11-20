package OOps;

class whatsappp
{
	public void m1()
	{
		System.out.println("text msg");
		
	}
}

class whatsappp1 extends whatsappp
{
	public void m2()
	{
		System.out.println("voice msg");
	}
}

class whatsappp2 extends whatsappp1
{
	public void m3()
	{
		System.out.println("video call");
	}
}

public class multilevelinheritance {
	public static void main(String[] args) {
		whatsappp2 app=new whatsappp2();
		app.m1();
		app.m2();
		app.m3();
	}

}

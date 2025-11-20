package OOps;

class whatsapp11 {
	public void m1()
	{
		System.out.println("Text msg sent");
	}
}

interface whatsappve1
{
	void m2();
}

interface whatsappve2
{
	void m3();
}

interface whatsappve3
{
	void m4();
}

class whatsappv2 extends whatsapp11 implements whatsappve1,whatsappve2,whatsappve3
{
	public void m2()
	{
		System.out.println("Voice msg");
		
		
	}
	public void m3()
	{
		System.out.println("Video call");
	}
	
	public void m4()
	{
		System.out.println("payment");
	}
}

public class hybridinheritance {

	public static void main(String[] args) {
		whatsappv2 app=new whatsappv2();
		app.m1();
		app.m2();
		app.m3();
		app.m4();
	}
}

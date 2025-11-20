package OOps;


class Whatsapp
{
	public void m1()
	{
		System.out.println("whatapp 1st version");
	}
}

class Whatsapp1 extends Whatsapp
{
	public void m2()
	{
		System.out.println("text msg");
	}
}

class Whatsapp2 extends Whatsapp
{
	public void m3()
	{
		System.out.println("voice msg");
	}
}

class Whatsapp3 extends Whatsapp
{
	public void m5()
	{
		System.out.println("video call");
	}
}


public class hierrachicalinheritance {
	
	public static void main(String[] args) {
		
		Whatsapp1 app=new Whatsapp1();
				app.m1();
		        app.m2();
	System.out.println("-----------");
	    Whatsapp2 app1=new Whatsapp2();
				app1.m1();
		        app1.m3();
				 System.out.println("-****---*****-");

		        
		 Whatsapp3 app2=new Whatsapp3();
		 app2.m1();
		 app2.m5();
		 System.out.println("-*********-");
		 
		        
		        
		
	}

}

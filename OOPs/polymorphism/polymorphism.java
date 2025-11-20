package OOps;

class sim
{
	void call()
	{
		System.out.println("call connected");
	}
}

class airtel extends sim
{
	public void call()
	{
		System.out.println("call conncted via airtel");
	}
	void receiver()
	{
		System.out.println("call received via airtel");
	}
}

class jio extends sim
{
	public void call()
	{
		System.out.println("call connected via jio");
	}
	void receiver()
	{
		System.out.println("call received via jio");
	}
}

class BSNL extends sim
{
	public void call()
	{
		System.out.println("call connected via BSNL");
	}
	void receiver()
	{
		System.out.println("call received via BSNL");
	}
}



public class polymorphism {
	
	public static void main(String[] args) {
		
		airtel ar=new airtel();
		jio jo=new jio();
		BSNL bl=new BSNL();
		
		sim ref;
		
		ref=ar;
		ref.call();
		
		((airtel)ref).receiver();
		
		ref=jo;
		ref.call();
		((jio)ref).receiver();
		
		ref=bl;
		ref.call();
		((BSNL)ref).receiver();
		
	}

}


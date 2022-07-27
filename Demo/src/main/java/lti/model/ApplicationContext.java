package lti.model;

public class ApplicationContext {

	public static void main(String args[])
	{
		System.out.println("Hello World!!!");
		P p = new P();
		p.print();
		
		C c = new C();
		c.print();
		
		P p1 = new C();
		p1.print();
		C c1 = (C) new P();
		c1.print();
		
	}
}

class P
{
	public void print()
	{
		System.out.println("print");
	}
}

class C extends P
{
	public void print()
	{
		System.out.println("pint c");
	}
}

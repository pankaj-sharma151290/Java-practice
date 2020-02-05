package myjava.eight.features.methodreference;

interface One
{
	void firstInterface();
}

interface Two
{
	void twoInterface(String msg);
}

interface InstMethodRefExpOne
{
	Object first(int a, int b);
}

public class StaticMethodRefExp {
	
	StaticMethodRefExp(String msg)
	{
		System.out.println("Provided peram is : "+msg);
	}
	StaticMethodRefExp()
	{
		System.out.println("I am in Constructor");
	}

	static void myMethod()
	{
		System.out.println("in static myMethod");
	}
	
	static void myMethod(String msg)
	{
		System.out.println("Provided peram is : "+msg);
	}
	
	String myInstanceMethod(int a, int b)
	{
		return "a: "+ a + " b: " + b;
	}
	
	public static void main(String[] args) {
		
	One one = StaticMethodRefExp::myMethod;
	one.firstInterface();

	Two two = StaticMethodRefExp::myMethod;
	two.twoInterface("Pankaj");
	
	One one1 = StaticMethodRefExp::new;
	one1.firstInterface();
	
	Two two1 = StaticMethodRefExp::new;
	two1.twoInterface("ssss");
	
		/*
		 * InstMethodRefExpOne ob = new StaticMethodRefExp()::myInstanceMethod;
		 * System.out.println(ob.first(5, 12));
		 */
	}

}

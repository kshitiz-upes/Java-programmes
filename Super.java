package world;
class A
{
	int z;
	public void f1()
	{
	System.out.println("hey");
	}
}
class B extends A
{
	int z;
	public void f1()
	{
	super.f1();
	}
	public void f2()
    {
    int z;
    z=2;
    this.z=3;
    super.z=5;
    System.out.println("z="+z);
    System.out.println("z="+this.z);
    System.out.println("z="+super.z);
    }
}
class Super
{
	public static void main(String [] args)
	{
	B obj = new B();
	obj.f1();
	obj.f2();
	}
}
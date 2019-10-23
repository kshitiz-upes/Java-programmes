class mac
{
	mac()  //constuctor
	{
	System.out.println("kshitiz gupta");
	}
}
class pro extends mac
{
	pro()
	{
		super();
		System.out.println("Hey Git! ");
	}
}
class imp
{
	public static void main(String [] args)
	{
      	 pro p = new pro();
	}
}

	class GrandFather 
	{
	    void house() 
	    {
	        System.out.println("3 BHK House.");
	    }
	}
	class Father  extends GrandFather
	{
	    void land() 
	    {
	        System.out.println("5 Arcs of Land..");
	    }
	}
	 
	class Son extends Father
	{
	    void car()
	    {
	        System.out.println("Own Audi Car..");
	    }
	}
	 
	public class multilevel
	{
	    public static void main(String args[]) 
	    {
	        Son o = new Son();
	        o.car();
	        o.house();
	        o.land();
	    }
	}


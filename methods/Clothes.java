class Clothes
{
	public static void brands(String name,int quantity)
	{
		System.out.println("running brands in clothes");
		System.out.println("Name:"+name);
		System.out.println("Quantity:"+quantity);
	}
	
	public static void quality(int price,String colour,String type)
	{
		System.out.println("Price:"+price);
		System.out.println("Colour:"+colour);
		System.out.println("Type:"+type);
		
		if(price>500)
		{
			System.out.println("it is an costly");
		}
		else
		{
			System.out.println("it is cheap");
		}
		
	}
	public static void quality(double weight)
	{
		System.out.println("Weight:"+weight);
	}
	
	
}

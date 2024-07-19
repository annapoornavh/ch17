class Scrunchies
{
	public static void main(String[] args)
	{
	   stretch(); // invoke	
	}
	
	static void stretch()
	{
		System.out.println("Scrunchies stretch is for elasticity");
		tie(); //invoke
	}
	
	static void tie()
	{
		System.out.println("Scrunchies tie use to tie the hair");
		stretch(); //invoke
	}
	
}



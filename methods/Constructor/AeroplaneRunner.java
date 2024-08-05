class AeroplaneRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in AeroplaneRunner");
		
		
		new Aeroplane();
		Aeroplane aeroplane=new Aeroplane("AirIndia","Bangalore","Delhi");
		Aeroplane aeroplane1=new Aeroplane(10000,"Maldives","Pune");
		Aeroplane aeroplane2=new Aeroplane("SpiceJet",30,25000,"Switzerland","Hubli");
		
		System.out.println("end main in AeroplaneRunner");
		
		
	}
}
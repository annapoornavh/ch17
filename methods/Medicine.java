class Medicine
{
	public static double price(String medicineName)
	{
		System.out.println("running medicine in price");
		System.out.println("MedicineName:"+medicineName);
		
		if(medicineName=="Paracetemol")
		{
			return 25;
		}
		if(medicineName=="Dolo650")
		{
			return 40;
		}
		if(medicineName=="Anacin")
		{
			return 15;
		}
		
		System.out.println("MedicineName Not Found");
		return 0;
	}
}
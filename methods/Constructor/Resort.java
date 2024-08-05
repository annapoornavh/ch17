class Resort
{
	 static double summerRoomPrice=3000;
	 static double summerFoodPrice=350;
	 static double monsoonRoomPrice=8000;
	 static double monsoonFoodPrice=150;
	 static double winterRoomPrice=10000;
	 static double winterFoodPrice=5000;
	 
	 
	public static double season(String packages,boolean food)
	{
		
	    double sum=0;
	    if(packages=="summer")
		{
			
		
		if(food==true)
		{
		    double sum1 =summerRoomPrice+summerFoodPrice;
			return sum1;
		}
		
		
		else
		{
			return summerRoomPrice;
		}
		}
	
	
	
		if(packages=="monsoon")
		{
			
			
		if(food==true)
		{
			double sum2=monsoonRoomPrice+monsoonFoodPrice;
			return sum2;
		}
		
		else
		{
			return monsoonRoomPrice;
		}
		}
	
	
	
		if(packages=="winter")
		{
			
		
		if(food==true)
		{
			double sum3=winterRoomPrice+winterFoodPrice;
			return sum3;
		}
		
		else
		{
			return winterRoomPrice;
		}
		}
		return sum;
	
	}
	
}

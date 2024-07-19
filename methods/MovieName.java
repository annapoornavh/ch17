class MovieName
{
	public static String producerName(String movieName)
	{
		System.out.println("running movieName in producerName");
		System.out.println("movieName:"+movieName);
		if(movieName=="Kotee")
		{
			return"jyotiDeshpande";
		}
		if(movieName=="LoveMoktail")
		{
			return"milanaNagaraj";
		}
		if(movieName=="Milana")
		{
			return"dushyanth";
		}
		if(movieName=="MogginaManasu")
		{
			return"krishnappa";
		}
		if(movieName=="Rajkumar")
		{
			return"hombaleFilms";
		}
		
		System.out.println("Movie name not found");
		return "Not Found";
	}
}

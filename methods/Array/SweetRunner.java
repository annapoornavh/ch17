class SweetRunner
{
	public static void main(String[] args)
	{
		System.out.println("tasting sweet in SweetRunner");
		
		String famousInIndia="Jamun";
		String famousInDharwad="DharwadPeda";
		String famousInBelgaum="BelgaumKunda";
		String famousInGujarat="Burfi";
		String famousInMysore="MysorePak";
		String famousInKarnataka="KesariBath";
		String famousInTirupati="Laddu";
		String famousInUttarKarnataka="BasenLaddu";
		String famousInHyderabad="Kheer";
		
		
		String[] taste={famousInIndia,famousInDharwad,famousInBelgaum,famousInGujarat,famousInMysore,famousInKarnataka,
		famousInTirupati,famousInUttarKarnataka,famousInHyderabad};
		int total=taste.length;
		System.out.println("Total SweetType:"+total);
		
		String ref=taste[5];
		System.out.println("elements @ index 5:"+ref);
		
	}
}
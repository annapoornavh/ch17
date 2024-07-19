class BloodRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BloodRunner");
		char ref=Blood.group();
		System.out.println("groupName:"+'A');
		String value=Blood.personName();
		System.out.println("nameOfPerson:"+"Anu");
		double price=Blood.cost();
		System.out.println("costOfBlood:"+200d);
		int no=Blood.hospitalTested();
		System.out.println("hospitalTested:"+2);
		boolean valid=Blood.sickness();
		System.out.println("sickness:"+false);
		boolean statement=Blood.donate();
		System.out.println("donateBlood:"+true);
		
		
		
	}
}

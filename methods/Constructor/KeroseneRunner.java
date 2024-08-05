class KeroseneRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in KeroseneRunner");
		
		
		new Kerosene();
		Kerosene kerosene=new Kerosene(150);
		Kerosene kerosene1=new Kerosene(true);
		Kerosene kerosene2=new Kerosene(250,80,true);
		
		
		System.out.println("end main in KeroseneRunner");
	}
}
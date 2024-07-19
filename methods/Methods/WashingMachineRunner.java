class WashingMachine
{
	public static void wash()
	{
		System.out.println("running wash in WashingMachine");
		shake(); //wash-->shake
	}
	
	public static void shake()
	{
		System.out.println("running shake in WashingMachine");
		rotate(); //shake-->rotate
	}
	
	public static void rotate()
	{
		System.out.println("running rotate in WashingMachine");
		dry(); //rotate-->dry
	}
	
	public static void dry()
	{
		System.out.println("running dry in WashingMachine");
		alarm(); //dry-->alarm
	}
	
	
	public static void alarm()
	{
		System.out.println("running alarm in WashingMachine");
		
	}
	
}



class WashingMachineRunner
{
	public static void main(String[] args)
	{
		WashingMachine.wash(); //invoke
	}
	
	
}

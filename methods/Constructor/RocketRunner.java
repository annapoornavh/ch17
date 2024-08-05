class RocketRunner
{
public static void main(String[] args)
{
	Rocket rocket=new Rocket(2800);
	rocket.setNoOfThrusters(2.5f);
	rocket.fuelCapacity=400;
	rocket.display();
}
}
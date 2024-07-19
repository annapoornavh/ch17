class BusBooking
{
	public static double cancel(boolean wantToCancel)
{
  
  if(wantToCancel)

{
return -100;
}
else 
{
return 100;

}
}
}


class BusBookingRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BusBookingRunner");
		double wantToCancel=-100;
		double cancel=BusBooking.cancel(wantToCancel);
		System.out.println("wantToCancel:"+wantToCancel);
		double wantToCancel1=100;
		double cancel1=BusBooking.cancel(wantToCancel1);
		System.out.println("wantToCancel:"+wantToCancel1);
	}
}
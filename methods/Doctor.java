class Doctor
{
	public static String returnAvailability(String doctorName)
	{
		System.out.println("running returnAvailability in doctor");
		System.out.println("DoctorName:"+doctorName);
		
		if(doctorName=="Aarathi")
		{
			return"average";
		}
		if(doctorName=="Bharathi")
		{
			return"high";
		}
		if(doctorName=="Sneha")
		{
			return"low";
		}
		
		System.out.println("Doctor Name Not Found");
		return"returnAvailability also Not Found";
	}
}

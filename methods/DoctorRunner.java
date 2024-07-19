class DoctorRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in DoctorRunner");
		String doctorName="Aarathi";
		String returnAvailability=Doctor.returnAvailability(doctorName);
		System.out.println("ReturnAvailability:"+returnAvailability);
		String doctorName1="Bharathi";
		String returnAvailability1=Doctor.returnAvailability(doctorName1);
		System.out.println("ReturnAvailability:"+returnAvailability1);
		String doctorName2="Sneha";
		String returnAvailability2=Doctor.returnAvailability(doctorName2);
		System.out.println("ReturnAvailability:"+returnAvailability2);
		String doctorName3="Sanjeevini";
		String returnAvailability3=Doctor.returnAvailability(doctorName3);
		System.out.println("ReturnAvailability:"+returnAvailability3);
	}
}
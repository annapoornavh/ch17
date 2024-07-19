class PatientRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in PatientRunner");
		String doctorName="Dr.Kiran S G";
		boolean availability=Patient.availability(doctorName);
		System.out.println("doctorName:"+doctorName);
		
		String doctorName1="Dr. K.N rao";
		boolean availability1=Patient.availability(doctorName1);
		System.out.println("doctorName:"+doctorName1);
		
		String doctorName2="Dr.S reddy";
		boolean availability2=Patient.availability(doctorName2);
		System.out.println("doctorName:"+doctorName2);
		
	}
}

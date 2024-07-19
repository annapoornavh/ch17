class MedicineRunner
{
	public static void main(String[] anything)
	{
		System.out.println("running main in MedicineRunner");
		String medicineName="Paracetemol";
		double price=Medicine.price(medicineName);
		System.out.println("Price:"+price);
		String medicineName1="Dolo650";
		double price1=Medicine.price(medicineName1);
		System.out.println("Price:"+price1);
		String medicineName2="Anacin";
		double price2=Medicine.price(medicineName2);
		System.out.println("Price:"+price2);
		String medicineName3="aspirin";
		double price3=Medicine.price(medicineName3);
		System.out.println("Price:"+price3);
	}
}
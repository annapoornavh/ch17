class MedicineRunner
{
	public static void main(String[] args)
	{
		System.out.println("main in MedicineRunner");
		
		if(args.length==4)
		{
			String name=args[0];
			String manufactureDate=args[1];
			String price=args[2];
			String quantity=args[3];
			double convertedPrice=Double.parseDouble(price);
			int convertedQuantity=Integer.parseInt(quantity);
			
			Medicine.medicineInfo(name,manufactureDate,convertedPrice,convertedQuantity);
			
		}
		else
		{
			System.out.println("4 args required");
		}
	}
}

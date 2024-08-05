class MaskRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in MaskRunner");
		new Mask();
		Mask mask=new Mask(25);
		Mask mask1=new Mask('S');
		Mask mask2=new Mask("cotton");
		Mask mask3=new Mask(15,'M',"fabric");
		Mask mask4=new Mask(50,'X');
		System.out.println("end main in MaskRunner");
		
	}
}
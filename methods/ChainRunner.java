class ChainRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in ChainRunner");
		int value=Chain.carat();
		System.out.println("caratMl:"+200);
		double price=Chain.costPerGram();
		System.out.println("gramPrice:"+5000);
		String ref=Chain.type();
		System.out.println("chainType:"+"pureGold");
		String valid=Chain.quality();
		System.out.println("qualityOfChain:"+"noMetalMixing");
		int no=Chain.quantity();
		System.out.println("quantityOfChain:"+4);
		float noUse=Chain.wastage();
		System.out.println("wastage:"+30F);
		float pay=Chain.serviceCharge();
		System.out.println("serviceCharge:"+100F);
		float percentage=Chain.GST();
		System.out.println("GST return type:"+5F);
		
	}
}
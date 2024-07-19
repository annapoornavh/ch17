class BagRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BagRunner");
		String[] bagcontains={"pen","laptop","bottle"};
		Bag.books(bagcontains);
		System.out.println("============");
		Bag.bookbackward(bagcontains);
	}
}
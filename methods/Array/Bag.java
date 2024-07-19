class Bag
{
	public static void books(String[] books)
	{
		System.out.println("start storing books in bag");
		
		for(int index=0;index<books.length;index++)
		{
			String ref=books[index];
			System.out.println("books:"+ref);
		}
		
		System.out.println("end storing in bag");
	}
	
	public static void bookbackward(String[] books)
	{
	    System.out.println("running bag in bookbackward");
	   for(int index=books.length-1;index>=0;index--)
	   {
		   System.out.println(books[index]);
	   }
	}
	
}

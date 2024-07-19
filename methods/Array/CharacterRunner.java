class CharacterRunner
{
	public static void main(String[] args)
	{
		System.out.println("starting main in CharacterRunner");
		
		char gender='F';
		char gender1='M';
		char result='P';
		char result1='F';
		char grade='A';
		char grade1='B';
		char section='C';
		char letter='X';
		char symbol='&';
		char category='C';
		char type='G';
		char code='Z';
        char initial='J';
		char status='E';
		char size='L';
		char volt='V';
		char power='W';
		char energy='J';
		char height='M';
		char depth='D';
		
		char[] alphabets={gender,gender1,result,result1,grade,grade1,section,letter,symbol,category,type,code,
		initial,status,size,volt,power,energy,height,depth};
		int total=alphabets.length;
		System.out.println("Total number:"+total);
		
		
		char ref=alphabets[2];
		System.out.println("element @ index 2:"+ref);
		char ref1=alphabets[3];
		System.out.println("element @ index 3:"+ref1);
		char ref2=alphabets[4];
		System.out.println("element @ index 4:"+ref2);
		char ref3=alphabets[5];
		System.out.println("element @ index 5:"+ref3);
	}
}
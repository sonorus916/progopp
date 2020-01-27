class Fibbo

{
	public static void main(String args[])
	{
		int i=10,a=0,b=1,c;
		System.out.println( a+" ");
		for (i=0;i<10;i++)
		{
		 		  
			System.out.println( b+ " ");
			c=a+b;
			a=b;
			b=c;

		}
		
		System.out.println( Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
	}
}
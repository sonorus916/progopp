class Largest

{
	public static void main(String args[])
	{
		int a,b,c;
		a=Integer.parseInt(args[0]);
                                  b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		if (a>b)
		{
			if(a>c)
		                 	System.out.println( "Largest of all="+a);
			else 
				System.out.println( "Largest of all="+c);		
		}

                 	else if (a<b)
		{
			if(b>c)
		                 	System.out.println( "Largest of all="+b);
			else 
				System.out.println( "Largest of all="+c);		
		}


		
		
	}
}
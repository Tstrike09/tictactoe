package com.D.javaworkspace;


	class TwodimensionalLoop
	{
		public static void main(String args[])
		{    
		int[][] a={{10,20,1},{30,40,2},{50,60,3}};//declaration and initialization   
		System.out.println("Two dimensional array elements are");    
		for (int i = 0; i < a.length; i++) 
		{
	            for (int j = 0; j < a.length; j++) 
		    {
	                System.out.print(a[i][j] +" ");
	                
	        }
	            System.out.println();
		}
		}
	

}

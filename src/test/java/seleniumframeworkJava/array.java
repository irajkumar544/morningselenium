package seleniumframeworkJava;

import org.testng.annotations.Test;

@Test
public class array {
	
	
	int a[]= {1,3,4,5,7,8};
	
	public void arraytest()
	{
		
		for (int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
			
			
		}
	}
    
	
	public void arraytest2()
	{       //   changes by Janki
		//changes my raj
		int a[]=new int[5]; 
		a[0]=10; 
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50;  
		 
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]); 
		}
	}
}

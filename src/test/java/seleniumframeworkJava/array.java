package seleniumframeworkJava;

import org.testng.annotations.Test;

@Test
public class array {
	
	
	int a[]= {1,3,4,5,7,8};
	
	public void arraytest()
	{
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
			
		}
	}

}

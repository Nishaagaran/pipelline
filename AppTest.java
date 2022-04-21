package demo.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
@Test
public void test()
{
	App a=new App();
	int result=a.add(10, 10);
	Assert.assertEquals(20, result);
	if(true)
	{
		
	
	System.out.println("test case passed");
}
	
}
@Test
public void test2()
{
	App a=new App();
	int result=a.sub(10, 10);
	Assert.assertEquals(0, result);
	if(true)
	{
		
	
	System.out.println("test case passed");
}
	
}
}

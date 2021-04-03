package Appium_BaseClass;

import org.testng.annotations.DataProvider;

public class DataProvider_Class {

	
	@DataProvider(name="inputData")
	public Object[][] getData()
	{
		Object[][] data=new Object[][]
		      {
			
			     {"hello"},{"#$$%^^"}
			  };
			  return data;
	}
}

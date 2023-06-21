package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_driven_testing {
@Test(dataProvider = "login")
public void testing(String name,String pswd)
{
	System.out.println(name);
	System.out.println(pswd);
}

@DataProvider(name = "login")
public Object[][] login_data()
{
   Object[][] data=new Object[3][2];
   data[0][0]="manu";
   data[0][1]="8217";
   data[1][0]="janu";
   data[1][1]="9739";
   data[2][0]="deepu";
   data[2][1]="9964";
   
   return data;
}
}

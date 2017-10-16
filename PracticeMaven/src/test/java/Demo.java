import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void test() {
		int [] a=-new int[3];
		a[0]=5;
		a[1]=7;
		a[2]=8;
		int expecteddata[]= {3,6,8};
		int []actualData=test(a);
		int actualData;
		for(int i=0;i<actualData.length;i++){
			
			Assert,assertEquals(expecteddata[i], actualData[i]);
			
			
		}

		
		
	}
    public int[] test(int a[]) {
    	int [] a= new int [3];
    	a[0]=5;
    	a[1]=7;
    	a[2]=8;
    	int b[]=new int[a.length];
    	for(int i=0;i<a.length;i++) {
    		b[i]=a[i];
    		
    		
    		}
    	for(int d:a) {
    		System.out.println(d);
    	}
    	return b;
    	
    }
    FirefoxDriver fd ;
    public void openBrowser() {
    	fd = new FirefoxDriver();
    	fd.get("https://eshopper24.com");
    	
    }
    public void getData(List<WebElement> elements,String[]expected) {
    	String[] actualData= new String[expected.length];
    	int i =0;
    	for(WebElement element:elements) {
    		actualData[i]=element.getText();
    		i++;
    		
    	}
    	for(int j=0;j<expected.length;j++){
    		
			if (actualData[j].equals(expected[j])) {
				System.out.println("ActualData is"+actualData[j+"with match with expected data is"+exp]);
				
			
			}
			//or
			//Asser.assert[Equals(actualData[j].expected[j]);
			//System.out.println("ActualData is"+ actualData[j] +"with match with expected data is"+expected);
			
				
    			
    				
    	}
    }
    	@Test
    	public void test3() {
    		openBrowser();
    		List<WebElement> ele= fd.findElements(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[/a"));
    		String [] expec = {"MEN", "WOMEN", "ELECTRONICS"};
    		getData(ele, expec);
    	}
    	
}

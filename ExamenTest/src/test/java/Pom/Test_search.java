package Pom;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_search {

	private WebDriver driver;
	Home home;
	Resultado resultado;
	Base base;
	
	
	@Before
	public void setUp() {
		home = new Home (driver);
		driver = home.chromeConnection();
		home.open("https://www.fravega.com");
		
	}


	@Test
	public void testSearch() {
		home.search("Heladera");
		resultado = new Resultado (driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		resultado.filterByProduct();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		resultado.filterByBrand();
		java.util.List<WebElement> result = resultado.listarElementos();
		for (WebElement y : result) {
	    String b =  y.getText();
	    System.out.println(b);
	    Assert.assertTrue(b.contains("Samsung"));
            
		}
				
	}
	@After

	
	public void tearDown() throws Exception {
        base = new Base(driver);
        base.quit();

	}
	

}

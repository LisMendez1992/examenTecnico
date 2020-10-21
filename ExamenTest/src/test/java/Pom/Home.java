package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home extends Base {
	
	By searchBar = By.xpath("//*[@id=\"__next\"]/div[1]/header/div/header/div[2]/div/div[2]/form/input");
	By searchButton = By.xpath("//*[@id=\"__next\"]/div[1]/header/div/header/div[2]/div/div[2]/form/button");
	
	public Home(WebDriver driver) {
		super(driver);
	}
	
	public void search (String product) {
		sendKeys(product,searchBar);
		click(searchButton);
		
		
	}
	

}

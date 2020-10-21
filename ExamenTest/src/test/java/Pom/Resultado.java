package Pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resultado extends Base{
	

	By filterHeladeras = By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[1]/ul/li[2]/ul/li[1]/ul/li[2]/a/h4");
	By samsung = By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[1]/ul/li[2]/ul/li[3]/ul/li[6]/a/label");
	By list = By.xpath("//*[@id=\"__next\"]/div[3]/div[2]/div/div/div[2]/section/ul[1]");
	By tittle = By.className("PieceTitle-sc-1eg7yvt-0.akEoc");


	public Resultado(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
    public void filterByProduct() {
        click(filterHeladeras);
    }
    
    public void filterByBrand() {
        click(samsung);	
    }
    
    public List<WebElement>  listarElementos() {
    	WebElement elements = findElement(list);
    	 List<WebElement> c = elements.findElements(By.xpath("./child::*"));
    	 
    	 return c;
    	 
    	 }
    	 
     	

    }
    
    
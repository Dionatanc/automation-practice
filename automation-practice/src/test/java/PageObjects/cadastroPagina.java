package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class cadastroPagina {
	
	WebDriver driver;
	
	public cadastroPagina (WebDriver driver) {
		this.driver = driver;
	}
	
	 public void clicaBotaoSignIn() {
		driver.findElement(By.className("login")).click();	
	
	 }
	 
	 public cadastroPagina preencheEmail(String email) {
		 driver.findElement(By.id("email_create")).sendKeys(email);
		 return this;

	 } 
	 
	 public void clicaCriarConta() {
		 driver.findElement(By.id("SubmitCreate")).click();
	 }  
	 
	 
	 
}

package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class criarConta extends cadastroPagina {

	 public criarConta(WebDriver driver) {
		super(driver);
	}

	public void clicaTitulo() {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 int a = driver.findElements(By.xpath("//input [@name='id_gender']")).size();
		 for (int i=1;i<a;i++)  
		 {	 
			driver.findElements(By.xpath("//input [@name='id_gender']")).get(1).click(); 
		 }
		 
		 //ou fazer dessa forma mais simples
		 //WebElement radio1 = driver.findElement(By.id("uniform-id_gender2"));
		 //radio1.click(); 
	 }
	 
	 public cadastroPagina preencheNome(String nome) {
		 driver.findElement(By.id("customer_firstname")).sendKeys(nome);
		 return this;
	 }
	 
	 
	 public cadastroPagina preencheSobreNome(String  sobrenome) {
		 driver.findElement(By.id("customer_lastname")).sendKeys(sobrenome);
		 return this;
	 }

	 public cadastroPagina preencheSenhaCadastro (String passwd) {
		 driver.findElement(By.id("passwd")).sendKeys(passwd);
		 return this;
	 }
	 
	 
	public void diaNascimento() {
		Select diaNascimento = new Select(driver.findElement(By.id("days")));
		diaNascimento.selectByValue("15");
	}
	
	public void mesNascimento() {
		Select mesNascimento = new Select(driver.findElement(By.id("months")));
		mesNascimento.selectByValue("12");
		
	}
	
	public void anoNascimento() {
		Select anoNascimento = new Select(driver.findElement(By.id("years")));
		anoNascimento.selectByValue("1987");

	}
	
	public void marcaCheckbox() {
		if (!driver.findElement(By.id("newsletter")).isSelected()) {
			driver.findElement(By.id("newsletter")).click();	
		}
		
	}
	
	public void marcaCheckbox2() {
		if(!driver.findElement(By.id("optin")).isSelected()) {
			driver.findElement(By.id("optin")).click();
		}
		
	}
	
	public criarConta preencheCompany(String nomeEmpresa) {
		driver.findElement(By.id("company")).sendKeys(nomeEmpresa);
		return this;
	}
	
	
	public criarConta preencheEndereço(String endereco) {
		driver.findElement(By.id("address1")).sendKeys(endereco);
		return this;
		
		
	}
	
	public criarConta preencheCidade (String cidade) {
		driver.findElement(By.id("city")).sendKeys(cidade);
		return this;
	}
	
	
	public void selecionaEstado() {
		Select selecEstado = new Select(driver.findElement(By.id("id_state")));
		selecEstado.selectByValue("5");
	}
				
		
	public criarConta zipCode(String zip) {
		driver.findElement(By.id("postcode")).sendKeys(zip);
		return this;
		
	}
	
	public void selecionaPais() {
		Select selecPais = new Select(driver.findElement(By.id("id_country")));
		selecPais.selectByValue("21");
		
	}
	
	public criarConta preenchePhone(String telefone) {
		driver.findElement(By.id("phone_mobile")).sendKeys(telefone);
		return this;
	}
	
	public criarConta preencheAlias(String alias) {
		driver.findElement(By.id("alias")).sendKeys(alias);
		return this;
		
	}
	
	public void clicaSubmit() {
		driver.findElement(By.id("submitAccount")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

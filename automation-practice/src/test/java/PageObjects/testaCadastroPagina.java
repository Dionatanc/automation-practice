package PageObjects;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testaCadastroPagina {

		private static cadastroPagina practice;
		private static WebDriver driver;
		private static criarConta conta;
		private static MinhaContaPrincipal minhaConta;
		
		@BeforeClass
		public static void preCondicao() {
		System.setProperty("webdriver.chrome.driver", "C:\\temp\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		practice = new cadastroPagina(driver);
		conta = new criarConta(driver);
		minhaConta = new MinhaContaPrincipal(driver); 
		}
		
		@Test
		public void realizaCadastro(){
			practice.clicaBotaoSignIn();
			practice.preencheEmail("teste@testedionatana11212utomacao.com.br");
			practice.clicaCriarConta();
			conta.clicaTitulo();
			conta.preencheNome("Dionatanfdsfs");
			conta.preencheSenhaCadastro("12345645654579");
			conta.preencheSobreNome("SobreNomdfsfsd");
			conta.diaNascimento();
			conta.mesNascimento();
			conta.anoNascimento();
			conta.marcaCheckbox();
			conta.marcaCheckbox2();
			conta.preencheCompany("teste empresa");
			conta.preencheEndereço("Endereço teste");
			conta.preencheCidade("Cidade teste");
			conta.selecionaEstado();
			conta.zipCode("73556");
			conta.selecionaPais();
			conta.preenchePhone("65656454");
			conta.preencheAlias("test323e@teste.com.br");
			conta.clicaSubmit();
		}
		
}



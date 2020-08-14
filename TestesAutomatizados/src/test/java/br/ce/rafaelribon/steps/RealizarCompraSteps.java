package br.ce.rafaelribon.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageOject.CompraPage;
import pageOject.HomePage;
import pageOject.CadastroPage;

public class RealizarCompraSteps {

	protected static WebDriver driver;
	public WebDriverWait wait;
	public int timeout = 60;

	
	@Before
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\TesteBRQ\\TestesAutomatizados\\chromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://automationpractice.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, timeout);

	}

	@After
	public void finaliza() {
		driver.quit();
	}

	@Given("^que estou no site$")
	public void que_estou_no_site() throws Throwable {
		HomePage home = new HomePage();
		home.consultaProduto("Faded Short Sleeve T-shirts");

	}

	@When("^adiciono um produto no carrinho$")
	public void adiciono_um_produto_no_carrinho() throws Throwable {
		HomePage home = new HomePage();
		home.addProduto();

	}

	@When("^realizo um novo cadastro$")
	public void realizo_um_novo_cadastro() {
		CadastroPage cadastro = new CadastroPage();
		
		cadastro.cadastroNovoUsuario();

	}

	@Then("^efetivo a compra com sucesso$")
	public void efetivo_a_compra_com_sucesso() throws Throwable {
		CompraPage compra = new CompraPage();
		compra.avancarMeioPagemnto();
		compra.escolherMeioPagamento();
		compra.finalizaCompra();
		
//
	}

}

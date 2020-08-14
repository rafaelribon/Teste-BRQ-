package pageOject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import br.ce.rafaelribon.steps.RealizarCompraSteps;

public class HomePage extends RealizarCompraSteps {

	public HomePage consultaProduto(String search) {
		// 2. Escolha um produto qualquer na loja.

		driver.get("http://automationpractice.com/index.php");
		Assert.assertEquals("My Store", driver.getTitle());

		driver.findElement(By.id("search_query_top")).sendKeys(search);
		driver.findElement(By.name("submit_search")).click();

		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div")).click();

		return this;

		// exemplo de como fazer validação por texto
		// driver.getPageSource().contains("poe o teste de validação aqui");

	}

	public HomePage addProduto() {


		driver.findElement(By.xpath("//*[text()[contains(.,'Add to cart')]]")).click();

		String mensageAtual = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")).getText();
        assertEquals("", mensageAtual);
		

		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();

		return this;
	}

}
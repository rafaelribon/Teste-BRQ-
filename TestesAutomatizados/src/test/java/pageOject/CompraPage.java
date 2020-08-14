package pageOject;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import br.ce.rafaelribon.steps.RealizarCompraSteps;

public class CompraPage extends RealizarCompraSteps {
	
	public CompraPage avancarMeioPagemnto() {
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button/span")).click();
		
		return this;
			
		
	}

	public CompraPage escolherMeioPagamento() throws InterruptedException {
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		
		
		
		return this;
		
	}
	
	public CompraPage finalizaCompra() throws InterruptedException {
		
	
		String precoTotal = driver.findElement(By.id("total_price")).getText();
        assertEquals("$19.25", precoTotal);
		
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		
		
		String valorPagamento = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/div/p[2]")).getText();
        assertEquals("- The total amount of your order comes to: $19.25 (tax incl.)", valorPagamento);
        
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		
		String pedidoFinalizado = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).getText();
        assertEquals("Your order on My Store is complete.", pedidoFinalizado);
		
		return this;
		
	}
}

package pageOject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import br.ce.rafaelribon.steps.RealizarCompraSteps;

public class CadastroPage extends RealizarCompraSteps {

	public CadastroPage cadastroNovoUsuario() {

		Faker faker = new Faker();

		String emailRandon = faker.internet().emailAddress();

		driver.findElement(By.id("email_create")).sendKeys(emailRandon);
		driver.findElement(By.xpath("//*[@id='SubmitCreate']/span")).click();
		driver.findElement(By.id("uniform-id_gender1")).isSelected();
		driver.findElement(By.id("customer_firstname")).sendKeys("teste");
		driver.findElement(By.id("customer_lastname")).sendKeys("teste");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("firstname")).sendKeys("Joao");
		driver.findElement(By.id("lastname")).sendKeys("Joao");
		driver.findElement(By.id("address1")).sendKeys("Teste");
		driver.findElement(By.id("city")).sendKeys("Osasco");
		driver.findElement(By.id("postcode")).sendKeys("33101");
		driver.findElement(By.id("id_country"));
		driver.findElement(By.id("phone_mobile")).sendKeys("5511975426060");
		driver.findElement(By.id("alias")).sendKeys("Joao");
		Select estado = new Select(driver.findElement(By.id("id_state")));
		estado.selectByVisibleText("Alabama");
		driver.findElement(By.id("passwd")).sendKeys("Teste@123");
		driver.findElement(By.id("submitAccount")).click();

		return this;

	}

}
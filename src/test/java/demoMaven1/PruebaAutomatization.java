package demoMaven1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PruebaAutomatization {
	
	/*Se declara e inicializa la variable*/
	static WebDriver driver;
	

	@Test(priority=1)
	public void VerificarGoogle1() {
		System.setProperty("webdriver.chrome.driver", "/Users/jl/Documents/AutomatizationAumenta/chromedriver");
		driver= new ChromeDriver();
		//Se instancia la variable
		driver.get(ParametersRepository.URL);
		//Se obtiene el título de la página
		String x = driver.getTitle();
		//Imprimimos el título de la página en consola
		System.out.println("The title of this page is "+x);
		//Verificaremos que el logo de la página se despliega
		WebElement logoGoogle = driver.findElement(By.id("hplogo"));
		AssertJUnit.assertTrue(logoGoogle.isDisplayed());
		//Se declara una variable de tipo WebElement para el campo de texto de búsqueda de la página de google
		WebElement textField = driver.findElement(By.xpath(LocatorRepository.searchFieldXpath));
		//Limpiamos el campo de texto
		textField.clear();
		//Introducimos nuestra búsqueda
		textField.sendKeys(ParametersRepository.TC1);
		//Se cierra el navegador
		driver.close();
		//Se cierra el driver
		driver.quit();
	}
	
	public void VerificarGoogle2() {
			System.setProperty("webdriver.chrome.driver", "/Users/jl/Documents/AutomatizationAumenta/chromedriver");
			driver= new ChromeDriver();
			driver.get(ParametersRepository.URL);
			String x = driver.getTitle();
			System.out.println("The title of this page is "+x);
			WebElement textField = driver.findElement(By.xpath(LocatorRepository.searchFieldXpath));
			textField.clear();
			textField.sendKeys(ParametersRepository.TC2);
			driver.close();
			driver.quit();
		}
	
	public void VerificarGoogle3() {
		System.setProperty("webdriver.chrome.driver", "/Users/jl/Documents/AutomatizationAumenta/chromedriver");
		driver= new ChromeDriver();
		driver.get(ParametersRepository.URL);
		String x = driver.getTitle();
		System.out.println("The title of this page is "+x);
		WebElement textField = driver.findElement(By.xpath(LocatorRepository.searchFieldXpath));
		textField.clear();
		textField.sendKeys(ParametersRepository.TC3);
		driver.close();
		driver.quit();
	}
	

}

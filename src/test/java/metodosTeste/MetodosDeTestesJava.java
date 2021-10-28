package metodosTeste;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MetodosDeTestesJava {
	
	private static WebDriver driver;
	
	public WebDriver lDriver() {
		return driver;
	}
	
	public void abrirNavegador(String site) {
	
		try {
			
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		
		}catch (Exception e) {
			System.err.println("--------Erro ao abrir o navegador -------" +e.getMessage());
		}
	}
	
	public void fechar() {
		try {
			
			driver.quit();
		} catch (Exception e) {
			System.err.println("----------Erro ao fechar -----------"+e.getMessage());
			System.err.println("----------Erroao fechar-------------"+e.getCause());
		}
		
	}
	
	public void pausa (int tempo) throws InterruptedException {
		
		try {
		
		Thread.sleep(tempo);
		}catch (Exception e) {
			System.err.println("----------Erro ao esperar -----------"+e.getMessage());
			System.err.println("----------Erro ao esperar-------------"+e.getCause());
		}
	}
	
	public void esperarElementoClicavel(By elemento, int tempo) {
	
		try {
	WebDriverWait wait = new WebDriverWait(driver, tempo);
	wait.until(ExpectedConditions.elementToBeClickable(elemento));
	
	
		}catch (Exception e) {
			System.err.println("----------Erro ao fechar -----------"+e.getMessage());
			System.err.println("----------Erroao fechar-------------"+e.getCause());
		}

	}
	
	public void preencher(By elemento, String texto) {
		
		try {
		driver.findElement(elemento).sendKeys(texto);
		
		}catch (Exception e) {
			System.err.println("----------Erro ao preencher -----------"+e.getMessage());
			System.err.println("----------Erro  ao preencher-------------"+e.getCause());
		}
	}
	
	public void clicar(By elemento) {
		
		try {
		driver.findElement(elemento).click();
		
	}catch (Exception e) {
		System.err.println("----------Erro ao clicar-----------"+e.getMessage());
		System.err.println("----------Erroao ao clicar-------------"+e.getCause());
	}
	
	}
	
	public void validarJanela(WebElement janela) {
		
		try {
		int contador = 3;
		while(janela.isDisplayed()&& contador>0) {
			janela.click();
			contador --;
		}
		}catch (Exception e) {
			System.err.println("----------Erro ao validar Janela-----------"+e.getMessage());
			System.err.println("----------Erroao ao validar Janela-------------"+e.getCause());
		}
		
	}
	
	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/evidencias/"+nomeEvidencia+".png");
			FileUtils.copyFile(scrFile,destFile);
			
		}catch (Exception e) {
			System.err.println("----------Erro ao tirar evidencia-----------"+e.getMessage());
			System.err.println("----------Erroao ao tirar evidencia-------------"+e.getCause());
		}
	}
	
	public void moverMouse() throws InterruptedException {
		WebElement subLink = driver.findElement(By.xpath("//*[@class='navigation-primary__button-text']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(subLink);
		actions.perform();
		}
}
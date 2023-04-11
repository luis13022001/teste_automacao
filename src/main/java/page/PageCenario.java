package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//By.xpath(//*[text(), 'Texto']") por toda a página
//By.xpath(//a[text(), 'Texto']") por linha
//By.xpath(//p[text(), 'Texto']") por um paragrafo
//entre outros
public class PageCenario {
    private WebDriver driver;

    public void setUp() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\luisf\\eclipse-workspace\\opensite\\chromedriver.exe");
            if (driver != null) {
                this.driver = driver;
            } else {
                this.driver = new ChromeDriver();
            }
            driver.get("https://advantageonlineshopping.com");
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickSpecialOffer() {
        try {
            driver.findElement(By.xpath("/html/body/header/nav/ul/li[7]")).wait(10000);
            driver.findElement(By.xpath("/html/body/header/nav/ul/li[7]")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickSeeOffer() {
        try {
            driver.findElement(By.xpath("/html/body/div[3]/section/article[2]/div/div[2]/div/a/button")).wait(10000);
            driver.findElement(By.xpath("/html/body/div[3]/section/article[2]/div/div[2]/div/a/button")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickCart() {
        try {
            Thread.sleep(10000);
            driver.findElement(By.xpath("save_to_cart")).wait(10000);
            driver.findElement(By.name("save_to_cart")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clicarCarrinho() {
        try {
            driver.findElement(By.id("shoppingCartLink")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerCompra() {
        try {
            driver.findElement(By.xpath("//table[@id=\"shoppingCart\"]//td[6]/span/a[3]")).wait(10000);
            driver.findElement(By.xpath("//table[@id=\"shoppingCart\"]//td[6]/span/a[3]")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void verificarCarrinhoVazio() {
        try {

            WebElement strvalue = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[1]/div/label"));
            String expected = "Your shopping cart is empty";
            String actual = ((WebElement) strvalue).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("Carrinho vazio");
            } else {
                System.out.println("Carrinho cheio.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void fechar_browser(){
        try{
            driver.quit();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}

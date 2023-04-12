package page;

import com.lfilisp.dados.model.Bdd_massas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.Duration;

//By.xpath(//*[text(), 'SPECIAL OFFER']") por toda a página
//By.xpath(//a[text(), 'SPECIAL OFFER']") por linha
//By.xpath(//p[text(), 'Texto']") por um paragrafo
//entre outros
public class PageCenario {
    private WebDriver driver;
    private WebDriverWait wait;
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banco");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();
    Bdd_massas massas = entityManager.find(Bdd_massas.class, 2);
    private WebElement element;

    String color = "YELLOW";

    public void setUp() {
        try {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(options);
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
            Thread.sleep(5000);
            //driver.findElement(By.xpath("//a[@translate='SPACIAL_OFFER']")).wait(10000);
            element = driver.findElement(By.xpath("//a[@translate='SPACIAL_OFFER']"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            //driver.findElement(By.xpath("//a[@translate='SPACIAL_OFFER']")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickSeeOffer() {
        try {
            Thread.sleep(3000);
            element = driver.findElement(By.xpath("//button[@translate='SEE_OFFER']"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            //driver.findElement(By.xpath("//button[@translate='SEE_OFFER']")).wait(10000);
            //driver.findElement(By.xpath("//button[@translate='SEE_OFFER']")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void clickCart() {
        try {
            element = driver.findElement(By.xpath("//button[@translate='ADD_TO_CART']"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            //driver.findElement(By.xpath("ADD_TO_CART")).wait(10000);
            //driver.findElement(By.name("ADD_TO_CART")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clicarCarrinho() {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.xpath("//a[@id='shoppingCartLink']"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            //driver.findElement(By.id("shoppingCartLink")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void removerCompra() {
        try {
            Thread.sleep(3000);
            element = driver.findElement(By.xpath("//a[@translate='REMOVE']"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            //driver.findElement(By.xpath("//table[@id=\"shoppingCart\"]//td[6]/span/a[3]")).wait(10000);
            //driver.findElement(By.xpath("//table[@id=\"shoppingCart\"]//td[6]/span/a[3]")).click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void verificarCarrinhoVazio() {
        try {
            Thread.sleep(3000);
            element = driver.findElement(By.xpath("//label[@translate='Your_shopping_cart_is_empty']"));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
            //WebElement strvalue = driver.findElement(By.xpath("/html/body/div[3]/section/article/div[1]/div/label"));
            String expected = "Your shopping cart is empty";
            String actual = ((WebElement) element).getText();
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
    public void verificarEspecificacoes() {
        try {
            Thread.sleep(3000);
            element = driver.findElement(By.xpath("//label[contains(text(), 'Simplicity')]"));
            String expected = massas.getCUSTOMIZATION();
            String actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("Customization correct");
            }
            element = driver.findElement(By.xpath("//label[contains(text(), '15.6-inch diagonal Full HD WLED-backlit Display (1920x1080) Touchscreen')]"));
            expected = massas.getDISPLAY();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("Display correct");
            }
            element = driver.findElement(By.xpath("//label[normalize-space()='1920x1080']"));
            expected = massas.getDISPLAY_RESOLUTION();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("Display Resolution correct");
           }
            element = driver.findElement(By.xpath("//label[normalize-space()='15.6']"));
           expected = massas.getDISPLAY_SIZE();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("Display Size correct");
            }
            element = driver.findElement(By.xpath("//label[normalize-space()='16GB DDR3 - 2 DIMM']"));
            expected = massas.getMEMORY();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("MEMORY correct");
            }
            element = driver.findElement(By.xpath("//label[normalize-space()='Windows 10']"));
            expected = massas.getOPERATING_SYSTEM();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("OPERATING SYSTEM  correct");
            }
            element = driver.findElement(By.xpath("//label[contains(text(),'AMD Quad-Core A10-8700P Processor + AMD Radeon(TM) R6 Graphics')]"));
            expected = massas.getPROCESSOR();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                //System.out.println("PROCESSOR correct");
            }
            element = driver.findElement(By.xpath("//label[normalize-space()='Yes']"));
            expected = massas.getTOUCHSCREEN();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("TOUCHSCREEN correct");
            }
            element = driver.findElement(By.xpath("//label[normalize-space()='5.51 lb']"));
            expected = massas.getWEIGHT();
            actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("WIGHT correct");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
       }
    }
    public void verificarCorESelecionar() {
        try {
            Thread.sleep(2000);
            String expected = massas.getCOLOR();
            element = driver.findElement(By.xpath("//span[@title='"+expected+"' and @id='bunny']"));
                element.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void verificarCarrinhoColor() {
        try {
            String expected = massas.getCOLOR();
            if((element = driver.findElement(By.xpath("//span[@title='"+expected+"']"))) != null){
                System.out.println("A cor é a mesma da selecionada");
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void pesquisarProduto() {
        try {
            Thread.sleep(3000);
            element = driver.findElement(By.xpath("//a[@title='SEARCH']"));
            element.click();
            element = driver.findElement(By.xpath("//input[@id='autoComplete']"));
            String expected = massas.getNAME_PRODUCT();
            element.sendKeys(expected);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void selecionarProduct() {
        try {
            Thread.sleep(3000);
            element = driver.findElement(By.xpath("//a[@class='product ng-scope']"));
            element.click();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void alterarCorNot() {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.xpath("//span[@title='"+color+"'and @id='bunny']"));
            element.click();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void alterarQntd() {
        try {
            element = driver.findElement(By.xpath("//div[@class='plus']"));
            element.click();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void acessarCheckout() {
        try {
            Thread.sleep(2000);
            element = driver.findElement(By.xpath("//button[@id='checkOutPopUp']"));
            element.click();
            //System.out.println("Cliquei???");


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void conferirSoma() {
        try {
            Thread.sleep(1000);
            element = driver.findElement(By.xpath("//span[@class='roboto-medium totalValue ng-binding']"));
            String val = element.getText();
            String expected = "$899.98";
            String actual = ((WebElement) element).getText();
            System.out.println(actual);
            if (expected.equals(actual)) {
                System.out.println("Valor está correto");
            }



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public void updateBancoColor(){
        try{
            System.out.println(color);
            massas.setCOLOR(color);
            System.out.println(massas.getCOLOR());
            System.out.println("Cor Alterada Com Suecesso!!");


        }
        catch (Exception e) {
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

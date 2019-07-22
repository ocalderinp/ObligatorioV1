package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected NavigateBar bar;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
        bar = new NavigateBar(driver);

    }


    public RegisterPage clickInRegister(){
        return bar.clickInRegister();
    }

    public LoginPage clickInLogIn(){
        return bar.clickInLogIn();
    }

    public ShoppingCartPage clickInShoppingCart(){
        return bar.clickInShoppingCart();
    }

    public ResultsPage searchProduct(String productToSearch){
        return bar.searchProduct(productToSearch);
    }

    public HomePage clickInlogout() { return bar.logout();}


}



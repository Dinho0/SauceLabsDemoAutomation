package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class inventory {

    public By btnAddBackpack = By.id("add-to-cart-sauce-labs-backpack");
    public By btnRemoveBackpack = By.id("remove-sauce-labs-backpack");

    public By btnAddBacklight = By.id("add-to-cart-sauce-labs-bike-light");
    public By btnRemoveBacklight  = By.id("remove-sauce-labs-bike-light");

    public By btnAddBoltshirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    public By btnRemoveBoltshirt = By.id("remove-sauce-labs-bolt-t-shirt");

    public By btnAddFleecejacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public By btnRemoveFleecejacket = By.id("remove-sauce-labs-fleece-jacket");

    public By btnAddOnesie = By.id("add-to-cart-sauce-labs-onesie");
    public By btnRemoveOnesie = By.id("remove-sauce-labs-onesie");

    public By btnAddTestall = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    public By btnRemoveTestall = By.id("remove-test.allthethings()-t-shirt-(red)t");

    public By pageTitle = By.className("title");


    public By backToProducts = By.id("back-to-products");

    @FindBy(how = How.CLASS_NAME, using = "product_sort_container")
    public WebElement filter;

}

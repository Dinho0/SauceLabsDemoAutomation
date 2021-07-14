package Steps;

import Pages.*;

import java.sql.SQLOutput;

public class Steps extends BaseClass  {
        login login = new login();
        inventory inventory = new inventory();
        menu menu = new menu();
        cart cart = new cart();
        checkoutInformation checkoutInformation = new checkoutInformation();
        checkoutComplete checkoutComplete = new checkoutComplete();
        checkoutOverview checkoutOverview = new checkoutOverview();

        public void inputUsername(String username){
            inputEvent(login.txtUsername, username);
        }

        public void inputPassword(String password){
            inputEvent(login.txtPassword, password);
        }

        public void clickLogin(){
        clickEvent(login.loginButton);
    }

        public void addItemToCart(String productName){
            if (productName.equalsIgnoreCase("Sauce Labs Backpack")) {
                clickEvent(inventory.btnAddBackpack);
            }else if(productName.equalsIgnoreCase("Sauce Labs Bike Light")){
                clickEvent(inventory.btnAddBacklight);
            }else if(productName.equalsIgnoreCase("Sauce Labs Onesie")){
                clickEvent(inventory.btnAddOnesie);
            }else if(productName.equalsIgnoreCase("Sauce Labs Bolt T-Shirt")){
                clickEvent(inventory.btnAddBacklight);
            }else if(productName.equalsIgnoreCase("Sauce Labs Fleece Jacket")){
                clickEvent(inventory.btnAddOnesie);
            }else if(productName.equalsIgnoreCase("Test.allTheThings() T-Shirt (Red)")){
                clickEvent(inventory.btnAddBacklight);
            }else{
                System.out.println("The product "+productName+" is not available.");
            }
        }

        public void filter(String filterName){
        if (filterName.equalsIgnoreCase("High to low ")) {
            select(inventory.filter,"hilo");
        }else if(filterName.equalsIgnoreCase("Low to high ")){
            select(inventory.filter,"lohi");
        }else if(filterName.equalsIgnoreCase("A to Z ")){
            select(inventory.filter,"az");
        }else if(filterName.equalsIgnoreCase("Z to A ")){
            select(inventory.filter,"za");
        }
    }

        public void checkout(){
            clickEvent(menu.btnCart);
            clickEvent(cart.btnCheckout);
        }

        public void clickFinish(){
            clickEvent(checkoutOverview.finishButton);
        }

        public void inputFirstName(String details){
             inputEvent(checkoutInformation.txtfirstName, details);
        }

        public void inputLastName(String details){
            inputEvent(checkoutInformation.txtlastName, details);
        }

        public void inputPostalCode(String details){
            inputEvent(checkoutInformation.txtpostalCode, details);
        }

        public void clickContinue(){
            clickEvent(checkoutInformation.continueButton);
        }

        public void clickMenu(){
            clickEvent(menu.btnHamburger);
        }

        public void clicklogout(){
            clickEvent(menu.btnLogOut);
        }
}

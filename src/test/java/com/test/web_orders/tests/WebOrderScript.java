package com.test.web_orders.tests;

import com.test.sauce_demo.tests.BaseTest;
import com.test.web_orders.pages.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebOrderScript extends BaseTest{




    // This test case is for signing up a new user
    @Parameters({"userName", "userEmail", "password", "day", "month", "year", "name", "lastName", "address",
                    "country", "state", "city", "zipCode", "phoneNumber", "text", "congratsText"})
    @Test(priority = 1)
    public void TC_01_ValidateSignUp(String userName, String userEmail, String password, String day,
                                     String month, String year, String name, String lastName, String address,
                                     String country, String state, String city, String zipCode, String phoneNumber,
                                     String text, String congratsText) throws Exception {


        WebOrderMainPage1 order = new WebOrderMainPage1(driver);
        order.clickOnSignUpLoginBtn();

        NewUserSignUpLogin signIn = new NewUserSignUpLogin(driver);

        signIn.signUpFunction(userName, userEmail);

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.fillOutForm(driver, password, day, month, year, name,
                               lastName, address, country, state, city,
                                zipCode, phoneNumber);

        signUpPage.getSuccessMsgAndContinue(text, congratsText);
        //signUpPage.handleIframe(driver);
    }


    // This test case checks for product details
    @Parameters({"userNameMsg", "allProductMsg"})
    @Test(priority = 2)
    public void TC_2_CheckOutProductFunctionality(String userNameMsg, String allProductMsg) throws Exception {

        UserHomePage user = new UserHomePage(driver);
        user.loggedInAsText(userNameMsg);
        user.clickOnProducts();

        ProductListPage listPage = new ProductListPage(driver);
        listPage.checkAllProductsExist(driver, allProductMsg);
        SingleProductPage singleProductPage = new SingleProductPage(driver);
        singleProductPage.productDetails();
        user.setHomeBtn();
        user.logoutFunction();





    }


    // This test case clicks on signUp/Login and sign in existing user
    @Parameters({"userEmail", "password"})
    @Test(priority = 3)
    public void TC_03_ValidateLoginLogout(String userEmail, String password) throws Exception {

        WebOrderMainPage1 main = new WebOrderMainPage1(driver);
        main.clickOnSignUpLoginBtn();
        NewUserSignUpLogin user = new NewUserSignUpLogin(driver);
        user.signInFunction(userEmail, password);




    }


}

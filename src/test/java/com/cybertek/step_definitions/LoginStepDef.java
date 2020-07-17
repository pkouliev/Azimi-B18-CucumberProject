package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {
    @Given("user is on library login page")
    public void user_is_on_library_login_page() {
        System.out.println("User is on login page");
    }

    @When("user logs in as liberian")
    public void user_logs_in_as_liberian() {
        System.out.println("Liberian logged in");
    }




  @When("User logs in as student")
    public void user_logs_in_as_student() {
      System.out.println("logged in as student");
    }


    @Given("User logs in as admin")
    public void user_logs_in_as_admin() {
        System.out.println("logged in as admin"); }





}

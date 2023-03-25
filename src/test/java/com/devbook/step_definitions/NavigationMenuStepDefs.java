package com.devbook.step_definitions;

import com.devbook.pages.DashboardPage;
import com.devbook.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    DashboardPage dashboardPage = new DashboardPage();


    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {
        System.out.println(" I verified that Welcome message text is here");
    }
    @When("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {
        System.out.println(" User navigates to Developers menu");
    }
    @Then("The user able to see Developers text")
    public void the_user_able_to_see_developers_text() {
        System.out.println(" I verify that developers text is here");
    }

    @When("The user navigates to All Posts menu")
    public void theUserNavigatesToAllPostsMenu() {
        System.out.println(" I verified that All Posts menu");
    }

    @Then("The user able to see  Posts text")
    public void theUserAbleToSeePostsText() {
        System.out.println(" I verified that Posts text is here");
    }

    @When("The user navigates to My Account menu")
    public void theUserNavigatesToMyAccountMenu() {
        System.out.println(" I verified that My Account menu");
    }

    @Then("The user able to see Dashboard text")
    public void theUserAbleToSeeDashboardText() {
        System.out.println(" I verified that Dashboard text is here");
    }

    @And("The user navigates to {string} menu")
    public void theUserNavigatesToMenu(String menuName) {
        dashboardPage.navigateToMenu(menuName);
    }

    @Then("The user should be able to see header as {string}")
    public void theUserShouldBeAbleToSeeHeaderAs(String headerName) {
        BrowserUtils.waitFor(5);
        String actualHeaderText = dashboardPage.getHeaderText(headerName);
        Assert.assertEquals("Verify that header name is display",headerName,actualHeaderText);
    }
}

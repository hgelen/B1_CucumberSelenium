package com.devbook.pages;

import com.devbook.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage extends BasePage {

    @FindBy(id = "dashboard-h1")
    public WebElement dashboardText_loc;
    @FindBy(xpath = "//p[contains(text(),'Welcome')]")
    public WebElement welcomeMessage_loc;
    @FindBy(xpath = "//*[text()='Audit']/../td[1]")
    public WebElement school_loc;
    // Method sent to Base page
    // public void dashboardMenu(String menuName) {
    //     Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']")).click();
    //}

    public String getTitle(String title) {
        return Driver.get().findElement(By.xpath("//td[text()='" + title + "']")).getText();
    }

    public String getCompany(String company) {
        return Driver.get().findElement(By.xpath("//td[text()='" + company + "']")).getText();
    }
}
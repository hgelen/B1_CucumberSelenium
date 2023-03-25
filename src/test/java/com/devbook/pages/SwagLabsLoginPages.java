package com.devbook.pages;

import com.devbook.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPages {
    public SwagLabsLoginPages() {
        PageFactory.initElements(Driver.get(),this);
    }
}

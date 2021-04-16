package com;

import org.testng.annotations.*;

import java.util.logging.Logger;

public class hello {
    Logger log =  Logger.getLogger("");;

    @BeforeTest
    public void setUpDriver(){
        log.info("Set up driver");
        log.info("Navigate to the ESPN page");
    }

    @Test
    public void logIn() {
        log.info("Wait that the page loads completely");
        log.info("Click on icon account");
        log.info("Click on li login");
        log.info("Switch to iFrame");
        log.info("Populate user");
        log.info("Populate password");
        log.info("Click on Log In Button");
        log.info("Switch to default content");
    }

    @Test
    public void logOut() {
        log.info("Click on icon account");
        log.info("Click on log out");
    }

    @Test
    public void inactiveUser() {
        log.info("Click on icon account");
        log.info("Click on ESPN Profile");
        log.info("Switch to Iframe");
        log.info("Click on delete account");
    }

    @AfterTest
    public void closeDriver(){
        log.info("close driver");
    }
}

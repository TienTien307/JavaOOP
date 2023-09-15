package baitap.common;

import static baitap.common.Constants.*;

public class BaseTest {
    public void createDriver(){
        System.out.println("Browser: " + browser);
        System.out.println("Report: " + report);
        System.out.println("Headless: " + headless);
    }
    public void closeDriver(){
        System.out.println("Close browser: " + browser);
    }
}

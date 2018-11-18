package com.synway.driverWeb;

/**
 * * Copyright (C), 2018-2019, Xihu Lovo info. Co., Ltd.
 *
 * @Package: com.synway.driverWeb
 * @ClassName: ${CLASS_NAME}
 * @Description: Descrebes the function of class
 * @Author: Administrator
 * @CreateDate: 2018/11/17 下午 3:44
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/11/17 下午 3:44
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */
import java.lang.InterruptedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class DriverWeb {

    public static WebDriver chmDriver;

    public static void openBaidu() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Tools\\Driver\\chromedriver.exe");
        String url = "https://www.baidu.com";

        /*
        ChromeOptions chmOption = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY,chmOption);
        capabilities.setCapability("pageLoadStrategy","NORMAL");
        */

        chmDriver = new ChromeDriver();
        chmDriver.get(url);
        chmDriver.manage().window().maximize();


        WebDriverWait wait = new WebDriverWait(chmDriver, 10);
        WebElement bdElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='su']")));

    }


    public  static void refreshWeb(){
        chmDriver.navigate().refresh();
    }

    public static void quitWeb(){
        chmDriver.quit();
    }

}

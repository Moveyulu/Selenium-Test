package com.synway.webuitest;

/**
 * * Copyright (C), 2018-2019, Xihu Lovo info. Co., Ltd.
 *
 * @Package: com.synway.webuitest
 * @ClassName: ${CLASS_NAME}
 * @Description: Descrebes the function of class
 * @Author: Administrator
 * @CreateDate: 2018/11/17 下午 10:27
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/11/17 下午 10:27
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */

import com.synway.driverWeb.DriverWeb;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTestOne {
    @BeforeSuite
    public void beforeMethod() throws InterruptedException {
        DriverWeb.openBaidu();
    }

    @Test
    public void login_one() throws InterruptedException {
        WebElement webEle = DriverWeb.chmDriver.findElement(By.xpath(".//*[@id='kw']"));
        webEle.sendKeys("51testing");
        DriverWeb.chmDriver.findElement(By.xpath(".//*[@id='su']")).click();

        DriverWeb.chmDriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        Assert.assertTrue(DriverWeb.chmDriver.getPageSource().contains("51testing"));
        Reporter.log("搜索51testing的测试用例");
    }

    @Test
    public void login_two() throws InterruptedException{
        WebElement webElem = DriverWeb.chmDriver.findElement(By.xpath(".//*[@id='kw']"));
        webElem.clear();
        webElem.sendKeys("Selenium");
        DriverWeb.chmDriver.findElement(By.xpath(".//*[@id='su']")).click();

        new WebDriverWait(DriverWeb.chmDriver,10).until(ExpectedConditions.titleContains("Selenium_百度搜索"));
        Assert.assertTrue(DriverWeb.chmDriver.getPageSource().contains("Selenium_百度搜索"));
        Reporter.log("搜索selenium的测试用例");

    }

//    @AfterMethod
//    public void afterMethod() {
//        DriverWeb.refreshWeb();
//        }
    @AfterSuite
    public void afterSuite() throws InterruptedException{
        DriverWeb.quitWeb();
    }
}

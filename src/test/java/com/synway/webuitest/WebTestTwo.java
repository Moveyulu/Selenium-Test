package com.synway.webuitest;

import com.synway.driverWeb.DriverWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * * Copyright (C), 2018-2019, Xihu Lovo info. Co., Ltd.
 *
 * @Package: com.synway.webuitest
 * @ClassName: ${CLASS_NAME}
 * @Description: Descrebes the function of class
 * @Author: Administrator
 * @CreateDate: 2018/11/17 下午 10:28
 * @UpdateUser: Administrator
 * @UpdateDate: 2018/11/17 下午 10:28
 * @UpdateRemark: The modified content
 * @Version: 1.0
 */


public class WebTestTwo {

    @BeforeSuite
    public void beforeMethod() throws InterruptedException{
        DriverWeb.openBaidu();
    }

    @AfterSuite
    public void afterSuite() throws InterruptedException{
        DriverWeb.quitWeb();
    }
}

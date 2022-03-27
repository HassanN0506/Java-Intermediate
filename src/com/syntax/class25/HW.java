package com.syntax.class25;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public class HW {
}

interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Chrome is maximizing window");
    }

    @Override
    public void findElement() {
        System.out.println("Chrome is finding element");
    }
}

class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox is opening browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox is closing browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Firefox is maximizing window");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox is finding element");
    }
}

class WebDriverTester{
    public static void main(String[] args) {
        WebDriver chrome = new ChromeDriver();
        chrome.openBrowser();
        chrome.closeBrowser();
        chrome.maximizeWindow();
        chrome.findElement();

        WebDriver firefox = new FirefoxDriver();
        firefox.openBrowser();
        firefox.closeBrowser();
        firefox.maximizeWindow();
        firefox.findElement();
    }
}
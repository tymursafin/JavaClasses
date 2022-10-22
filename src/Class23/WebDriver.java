package Class23;

public interface WebDriver {
    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();
}

class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("open Chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close Chrome browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome browser window");
    }

    @Override
    public void findElement() {
        System.out.println("Find element in Chrome browser");
    }
}

class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {}

    @Override
    public void closeBrowser() {}

    @Override
    public void maximizeWindow() {}

    @Override
    public void findElement() {}
}
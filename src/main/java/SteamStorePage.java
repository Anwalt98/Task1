import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class SteamStorePage {
    private static WebDriver webDriver;
    private By aboutButton = new ByXPath("//*[@class='supernav_container']//a[contains(text(),\"ABOUT\")]");


    public SteamStorePage (WebDriver webDriver){
        SteamStorePage.webDriver = webDriver;
    }
    public static void openSteamSorePage(){
        webDriver.get(SteamGetPropertiesValues.getValue("URL"));
    }
    public void pressAboutButton(){

    }



}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseMethods;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage extends BaseMethods{
	

	public HomePage(AndroidDriver<?> mobiledriver){
		
		HomePage.mobiledriver= mobiledriver;
        PageFactory.initElements(mobiledriver, this);

    }
	
	@FindBy (id = "com.whatsapp:id/entry")
	public WebElement chat;
	
	@FindBy (id = "com.whatsapp:id/send")
	public WebElement buttonsend;
	
	
	
	

}
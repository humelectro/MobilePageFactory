package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseMethods;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends BaseMethods {

	public HomePage(AndroidDriver<?> mobiledriver) {
		HomePage.mobiledriver = mobiledriver;
		PageFactory.initElements(mobiledriver, this);
	}

	@FindBy(id = "com.whatsapp:id/menuitem_search")
	public WebElement search_icon;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
	public WebElement more_options_button;

	@FindBy(id = "com.whatsapp:id/icon")
	public WebElement camera_icon;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]")
	public WebElement chat_menu;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[3]")
	public WebElement status_menu;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.FrameLayout[4]")
	public WebElement calls_menu;

	@FindBy(id = "com.whatsapp:id/fab")
	public WebElement new_chat;

	public void clickOnSearch() {
		search_icon.click();

	}

	public void clickOnMoreMenu() {
		more_options_button.click();

	}

	public void clickOnCamera() {
		camera_icon.click();

	}

	public void clickOnChat() {
		chat_menu.click();

	}

	public void clickOnStatus() {
		status_menu.click();
	}

	public void clickOnCalls() {
		calls_menu.click();
	}
	
	public void clickOnNewChat(){
		new_chat.click();
	}

}

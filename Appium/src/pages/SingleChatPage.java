package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.BaseMethods;
import io.appium.java_client.InteractsWithFiles;
import io.appium.java_client.android.AndroidDriver;

public class SingleChatPage extends BaseMethods {

	public SingleChatPage(AndroidDriver<?> mobiledriver) {
		SingleChatPage.mobiledriver = mobiledriver;
		PageFactory.initElements(mobiledriver, this);
	}

	@FindBy(id = "com.whatsapp:id/entry")
	public WebElement chat;

	@FindBy(id = "com.whatsapp:id/send")
	public WebElement buttonsend;

	@FindBy(id = "com.whatsapp:id/conversation_contact_name")
	public WebElement friend_name;

	@FindBy(id = "com.whatsapp:id/conversation_contact_status")
	public WebElement friend_status;

	@FindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
	public WebElement more_menu;

	@FindBy(id = "com.whatsapp:id/emoji_picker_btn")
	public WebElement emoji_icon;

	@FindBy(id = "com.whatsapp:id/input_attach_button")
	public WebElement attachement_icon;

	@FindBy(id = "com.whatsapp:id/camera_btn")
	public WebElement camera_icon;

	@FindBy(id = "com.whatsapp:id/voice_note_btn")
	public WebElement voice_record;
	
	@FindBy(id = "com.whatsapp:id/voice_note_tip")
	public WebElement voice_record_tooltip;

	public void sendMessageToFriend(String message) {
		chat.click();
		chat.sendKeys(message);
		buttonsend.click();

	}

	public void clickOnFriendName() {
		friend_name.click();

	}

	public void clickOnFriendStatus() {
		friend_status.click();

	}

	public void clickOnMoreMenu() {
		more_menu.click();

	}

	public void clickOnEmojiIcon() {
		emoji_icon.click();

	}

	public void clickOnAttachementIcon() {
		attachement_icon.click();
	}

	public void clickOnCameraIcon() {
		camera_icon.click();

	}

	public void clickOnVoiceRecord() {
		voice_record.click();
		Assert.assertEquals("Hold to record, release to send",voice_record_tooltip.getText());

	}
	
	public void sendEmoji(String id){
		chat.sendKeys(id);
	}
	

}

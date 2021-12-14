/**import java.util.List;

public class LoginPage {
	
	//List<LoginDto> testCases;

	public void fillData(String email,String password) {
		SeleniumUtil seleniumUtil = new SeleniumUtil();
		seleniumUtil.inputText(email, ApplicationConstants.LOGIN_EMAIL_PATH);
		seleniumUtil.inputText(password, ApplicationConstants.LOGIN_PASSWORD_PATH);
		seleniumUtil.clickButton(ApplicationConstants.LOGIN_BUTTON_PATH);
	}
	
	//public boolean check
}
**/
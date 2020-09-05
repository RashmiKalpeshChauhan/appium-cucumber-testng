package StepDefinitions;
import com.mobile.pages.BasePage;
import com.mobile.pages.TenantPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SigninPage extends BasePage {
	@AndroidFindBy(id="net.gadm.tv.beta:id/availableCountries")private MobileElement availableCountryLink;
	@AndroidFindBy(id="net.gadm.tv.beta:id/countries_bottom_sheet")private MobileElement countryList;
	@AndroidFindBy(id="net.gadm.tv.beta:id/close_button")private MobileElement closeButton;
	
	public SigninPage clickavailableCountryLink () {
		click(availableCountryLink);
		return this;
	}
	public SigninPage isSigninButtonPrsent(){
		find(countryList,10);
		return this;
	}
	public SigninPage clickCloseButton () {
		click(closeButton);
		return this;
	}
}

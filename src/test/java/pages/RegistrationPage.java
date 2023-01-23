package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    private final String TITLE_TEXT = "Text Box";
    private SelenideElement
            userNameInput = $("#userName"),
            userEmailInput = $("#userEmail");

    public void openPage() {

        open("/text-box");
        $(".main-header").shouldHave(text(TITLE_TEXT));
    }

    public void setFirstName(String value) {

        userNameInput.setValue(value);
    }

    public void clearName() {
        userNameInput.clear();
    }

    public void setEmail() {
        userEmailInput.setValue("test@mail.com");
    }
}

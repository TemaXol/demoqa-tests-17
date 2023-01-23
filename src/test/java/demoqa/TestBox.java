package demoqa;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBox {

    @BeforeAll
    static void before() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        String userName = "Alex Steel";

        new RegistrationPage().openPage();
        new RegistrationPage().setFirstName(userName);
        new RegistrationPage().setEmail();



        $("#currentAddress").setValue("street street");
        $("#permanentAddress").setValue("test text");
        $("#submit").click();
        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave((text(userName)));
        $("#output #email").shouldHave((text("test@mail.com")));
        $("#output #currentAddress").shouldHave((text("street street")));
        $("#output #permanentAddress").shouldHave((text("test text")));
    }
}

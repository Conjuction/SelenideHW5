package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultModal;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    private final String TITLETEXT = "Student Registration Form";
    private SelenideElement firstNameInput = $("#firstName");

    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLETEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        $("#lastName").setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPage setPhone(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(month, year);

        return this;
    }

    public RegistrationPage verifyResultsModalAppears() {
        registrationResultModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResults(String key, String value) {
        registrationResultModal.verifyResult(key, value);

        return this;
    }

    public RegistrationPage setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobbies(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPage setFile(String fileName) {
        $("#uploadPicture").uploadFile(new File("src/test/resources/" + fileName));

        return this;
    }

    public RegistrationPage setAddress(String value) {
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationPage setState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").find(byText(value)).click();

        return this;
    }

    public RegistrationPage setCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").find(byText(value)).click();

        return this;
    }

    public RegistrationPage submit() {
        $("#submit").click();

        return this;
    }

}


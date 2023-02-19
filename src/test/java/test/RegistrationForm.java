package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("simple")
public class RegistrationForm extends TestBase {

    @Test
    void registrationForm() {

        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(gender)
                .setPhone(userNumber)
                .setBirthDate(month, year, day)
                .setSubjects(subjects)
                .setHobbies(hobbies)
                .setFile(fileName)
                .setAddress(currentAddress)
                .setState(state)
                .setCity(city)
                .submit();

        registrationPage.verifyResultsModalAppears()
                .verifyResults("Student Name", firstName + " " + lastName)
                .verifyResults("Student Email", userEmail)
                .verifyResults("Gender", gender)
                .verifyResults("Mobile", userNumber)
                .verifyResults("Date of Birth", dayOfBirth)
                .verifyResults("Subjects", subjects)
                .verifyResults("Hobbies", hobbies)
                .verifyResults("Picture", fileName)
                .verifyResults("Address", currentAddress)
                .verifyResults("State and City", state + " " + city);
    }
}


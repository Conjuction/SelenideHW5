package form;

import com.github.javafaker.Faker;
import pages.RegistrationPage;


public class TestBase {
    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = getRandomValue("Male", "Female", "Other"),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            day = String.format("%02d", faker.number().numberBetween(1, 28)),
            month = getRandomValue("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"),
            year = String.valueOf(faker.number().numberBetween(1900, 2022)),
            subjects = getRandomValue("Math", "Chemistry", "Physics", "Computer Science", "English", "History"),
            hobbies = getRandomValue("Sports", "Reading", "Music"),
            currentAddress = faker.address().fullAddress(),
            state = getRandomValue("NCR", "Uttar Pradesh", "Haryana", "Rajasthan"),
            city = getCity(),
            dayOfBirth = day + " " + month + "," + year,
            fileName = "avatar.jpg";
    RegistrationPage registrationPage = new RegistrationPage();

    private String getRandomValue(String... initialValues) {

        return faker.options().option(initialValues);
    }

    private String getCity() {
        String cityItem = null;

        if (state.equals("NCR")) {
            cityItem = getRandomValue("Delhi", "Gurgaon", "Noida");
        }

        if (state.equals("Uttar Pradesh")) {
            cityItem = getRandomValue("Agra", "Lucknow", "Merrut");
        }

        if (state.equals("Haryana")) {
            cityItem = getRandomValue("Karnal", "Panipat");
        }

        if (state.equals("Rajasthan")) {
            cityItem = getRandomValue("Jaipur", "Jaiselmer");
        }

        return cityItem;
    }
}

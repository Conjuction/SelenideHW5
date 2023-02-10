package test;

import com.github.javafaker.Faker;
import pages.RegistrationPage;


public class TestBase {
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String gender = getRandomValue("Male", "Female", "Other");

    String userNumber = String.valueOf(faker.number().numberBetween(0000000000L, 9999999999L));
    String day = String.format("%02d", faker.number().numberBetween(1, 28));
    String month = faker.options().option("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    String year = String.valueOf(faker.number().numberBetween(1900, 2022));
    String subjects = getRandomValue("Math", "Chemistry", "Physics", "Computer Science", "English", "History");
    String hobbies = getRandomValue("Sports", "Reading", "Music");
    String currentAddress = faker.address().fullAddress();
    String state = getRandomValue("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    String city = getCity();
    String dayOfBirth = day + " " + month + "," + year;
    String fileName = "avatar.jpg";
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

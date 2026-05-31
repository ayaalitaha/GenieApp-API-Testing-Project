package Steps;

import Apis.AuthApi;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import Models.User;

/**
 * UserStep class
 *
 * This class contains helper methods (test steps) related to User operations.
 *
 * It is used to:
 * - Generate random test users for signup scenarios
 * - Retrieve authentication token for authorized API calls
 *
 * It acts as a service layer between test classes and API layer.
 */
public class UserStep {

    /**
     * Generates a random user using JavaFaker
     *
     * This method is used for creating dynamic test data
     * to avoid duplicate users in signup tests.
     *
     * @return User object with randomly generated valid data
     */
    public static User generateUser(){

        Faker faker = new Faker();

        return new User(
                faker.name().fullName(),                 // Random full name
                "010" + faker.number().digits(8),        // Egyptian-style phone number format
                faker.internet().emailAddress(),         // Unique email address
                1,                                       // Default city ID (can be parameterized later)
                "123456"                                 // Default password for testing
        );
    }

    /**
     * Retrieves authentication token for a user
     *
     * This method logs in using email & password,
     * then extracts the token from the API response.
     *
     * @param email user's email address
     * @param password user's password
     *
     * @return authentication token as String
     */
    public static String getToken(String email, String password){

        User user = new User(email, password);

        Response response = AuthApi.login(user);

        // Extract token from JSON response path
        return response.jsonPath().getString("results.token");
    }
}
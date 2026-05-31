package Tests;

import Apis.AuthApi;
import Models.User;
import Steps.UserStep;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

/**
 * AuthTest class
 *
 * This class contains automated test cases for Authentication APIs.
 *
 * It validates core authentication flows such as:
 * - User registration (Sign Up)
 * - (Future scope: Login, invalid login, duplicate email, etc.)
 *
 * It uses TestNG as the test framework and RestAssured for API validation.
 */
public class AuthTest {

    /**
     * Test case: Verify user can successfully register
     *
     * Steps:
     * 1. Generate random user data using UserStep
     * 2. Call Sign Up API
     * 3. Validate response status code is 200 (success)
     */
    @Test
    public void shouldBeAbleToRegister(){

        // Arrange: create a random test user
        User user = UserStep.generateUser();

        // Act: send sign-up request
        Response response = AuthApi.signUp(user);

        // Assert: verify response status code
        assertThat(response.statusCode(), equalTo(200));
    }
}
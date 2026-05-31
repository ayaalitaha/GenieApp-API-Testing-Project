package Apis;
import base.Specs;
import data.Route;
import io.restassured.response.Response;
import Models.User;
import static io.restassured.RestAssured.given;

/**
 * AuthApi class
 *
 * This class contains all authentication-related API calls such as:
 * - User Sign Up
 * - User Login
 *
 * It uses RestAssured for sending HTTP requests and a shared Request Specification
 * from Specs class to ensure consistency across all requests (base URL, headers, etc.).
 */
public class AuthApi {

    /**
     * Sends a Sign-Up request to the authentication service.
     *
     * @param user the User object containing sign-up details
     *             (e.g. full name, email, password, phone, etc.)
     *
     * @return Response object containing API response details
     */
    public static Response signUp(User user){

        return given()
                .spec(Specs.getRequestSpec()) // Common request configuration (base URI, headers, etc.)
                .body(user) // Request payload serialized from User object
                .when()
                .post(Route.SIGNUP_ROUTE) // Endpoint for user registration
                .then()
                .log().all() // Logs full response for debugging purposes
                .extract()
                .response(); // Extracts and returns the raw Response object
    }

    /**
     * Sends a Login request to the authentication service.
     *
     * @param user the User object containing login credentials
     *             (email/phone and password)
     *
     * @return Response object containing API response details
     */
    public static Response login(User user){

        return given()
                .spec(Specs.getRequestSpec()) // Common request configuration (base URI, headers, etc.)
                .body(user) // Request payload serialized from User object
                .when()
                .post(Route.LOGIN_ROUTE) // Endpoint for user login
                .then()
                .log().all() // Logs full response for debugging purposes
                .extract()
                .response(); // Extracts and returns the raw Response object
    }
}
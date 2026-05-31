package base;
import data.Route;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

/**
 * Specs class
 *
 * This class is responsible for creating and managing
 * the common RequestSpecification used across all API requests.
 *
 * It helps to avoid duplication and ensures consistency in:
 * - Base URL
 * - Content Type
 * - Logging configuration
 */
public class Specs {

    /**
     * Builds and returns a reusable RequestSpecification
     *
     * This specification is used as a base configuration for all API calls,
     * ensuring that every request includes:
     * - Base URI from Route configuration
     * - Content-Type set to JSON
     * - Full request logging for debugging purposes
     *
     * @return RequestSpecification configured for API testing
     */
    public static RequestSpecification getRequestSpec(){

        return given()
                .baseUri(Route.BASE_URL) // Base endpoint for all API requests
                .contentType(ContentType.JSON) // All requests use JSON format
                .log().all(); // Log request details for debugging
    }
}
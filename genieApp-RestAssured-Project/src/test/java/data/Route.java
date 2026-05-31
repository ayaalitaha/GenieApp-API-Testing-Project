package data;

/**
 * Route class
 *
 * This class holds all API endpoint paths and the base URL used across the framework.
 *
 * Centralizing routes helps to:
 * - Avoid hardcoding endpoints in test or API classes
 * - Improve maintainability when endpoints change
 * - Provide a single source of truth for API URLs
 */
public class Route {

    /**
     * Base URL for the application under test
     */
    public static final String BASE_URL = "https://genie.aimtech.online";

    /**
     * Endpoint for user registration (Sign Up API)
     */
    public static final String SIGNUP_ROUTE = "/api/v1/auth/signup";

    /**
     * Endpoint for user authentication (Login API)
     */
    public static final String LOGIN_ROUTE = "/api/v1/auth/signin";
}
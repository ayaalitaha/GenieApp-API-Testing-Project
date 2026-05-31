package data;

/**
 * ErrorMessage class
 *
 * This class contains all predefined API error messages used for assertions
 * in automated tests.
 *
 * Centralizing error messages helps to:
 * - Avoid duplication across test cases
 * - Improve maintainability
 * - Ensure consistency in validations
 */
public class ErrorMessage {

    /**
     * Returned when attempting to register with an email that already exists
     */
    public static final String EMAIL_ALREADY_EXISTS = "Email already exists";

    /**
     * Returned when login credentials are incorrect (invalid email or password)
     */
    public static final String INVALID_CREDENTIALS = "Invalid email or password";
}
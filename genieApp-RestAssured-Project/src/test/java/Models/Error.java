package Models;

/**
 * Error model class
 *
 * This class represents the structure of error responses returned by the API.
 *
 * It is used for deserializing API error responses using RestAssured:
 * Response.body().as(Error.class)
 *
 * Currently it maps the "message" field from the API response.
 */
public class Error {

    /**
     * Error message returned from the API response
     */
    private String message;

    /**
     * Gets the error message
     *
     * @return error message as String
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the error message
     *
     * @param message error message from API response
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
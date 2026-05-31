package Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User model class
 *
 * This class represents the payload and response structure for User-related APIs.
 *
 * It is used for:
 * - Signup request body
 * - Login request body
 * - Parsing API responses (e.g., token, id, username)
 *
 * Jackson annotations are used to map JSON fields to Java fields.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("city_id")
    private Integer cityId;

    private String email;

    private String password;

    private String token;

    private Integer id;

    private String username;

    /**
     * Default constructor required for Jackson deserialization
     */
    public User() {
    }

    /**
     * Constructor used for Signup API requests
     *
     * @param fullName user's full name
     * @param phoneNumber user's phone number
     * @param email user's email address
     * @param cityId user's city ID
     * @param password user's password
     */
    public User(String fullName,
                String phoneNumber,
                String email,
                Integer cityId,
                String password) {

        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cityId = cityId;
        this.password = password;
    }

    /**
     * Constructor used for Login API requests
     *
     * @param email user's email
     * @param password user's password
     */
    public User(String email, String password){

        this.email = email;
        this.password = password;
    }

    // -------------------- Getters & Setters --------------------

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}


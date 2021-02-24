package gr.codehub.team7.propertywebapp.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class OwnerForm {

    private static final String MAIL_PATTERN = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{1,63}$";
    private static final String PASSWORD_PATTERN = "^[a-zA-Z0-9@#$%^&]*$";
    private static final int SSN_LENGTH=9;
    private static final int PHONE_LENGTH=10;
    private static final int PASSWORD_MIN_SIZE = 6;
    private static final int PASSWORD_MAX_SIZE = 20;

    private String id;

    @NotEmpty(message = "no empty")
    @Size(min = SSN_LENGTH, max = SSN_LENGTH, message = "Ssn must be 9 numbers")
    private String ssn;

    @NotEmpty(message = "no empty")
    private String firstname;

    @NotEmpty(message = "no empty")
    private String lastname;

    @NotEmpty(message = "no empty")
    private String address;

    @NotEmpty(message = "no empty")
    @Size(min = PHONE_LENGTH, max = PHONE_LENGTH, message = "Phone number must be 10 numbers")
    private String phone_number;

    @Pattern(regexp = MAIL_PATTERN, message = "enter an valid email")
    @NotEmpty(message = "no empty")
    private String email;

    @Pattern(regexp = PASSWORD_PATTERN, message = " ")
    @Size(min = PASSWORD_MIN_SIZE, max = PASSWORD_MAX_SIZE, message = "Password between 6 and 20 characters")
    @NotEmpty(message = "no empty")
    private String password;


    private String propertyType;

    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}

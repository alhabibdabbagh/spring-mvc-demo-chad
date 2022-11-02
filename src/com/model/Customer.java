package com.model;


import javax.validation.constraints.*;

/**
 * @author Habib
 * @on 10/17/22 - 11:05 AM
 */
public class Customer {

    @NotNull(message = "is required")
    @Size(min=10,message="is required")
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=10,message="is required")
    private String lastName;

    @Min(value = 0,message = "can't be under zero or equal")
    @Max(value = 10,message=" can't be up 10 or equal ")
    private int age;
    private String Language ;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "only 5 chars")
    private String postalCode;


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }
}

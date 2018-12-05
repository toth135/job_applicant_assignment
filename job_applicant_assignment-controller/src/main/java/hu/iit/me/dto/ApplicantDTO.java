package hu.iit.me.dto;

import java.util.Objects;

public class ApplicantDTO {

    private String firstName;
    private String lastName;
    private String birthDate;
    private String gender;
    private String qualification;
    private String phoneNumber;
    private String city;

    public ApplicantDTO(){

    }

    public ApplicantDTO(String firstName, String lastName, String birthDate, String gender,
                        String qualification, String phoneNumber, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.qualification = qualification;
        this.phoneNumber = phoneNumber;
        this.city = city;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicantDTO that = (ApplicantDTO) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(birthDate, that.birthDate) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(qualification, that.qualification) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, gender, qualification, phoneNumber, city);
    }

    @Override
    public String toString() {
        return "ApplicantDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                ", qualification='" + qualification + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
package hu.iit.me.dto;

import java.util.Objects;

public class JobDTO {

    private String category;
    private String name;
    private String description;
    private String company;
    private String payment;
    private String requiredQualification;
    private String experience;

    public JobDTO(){
    }

    public JobDTO(String category, String name, String description, String company, String payment,
                  String requiredQualification, String experience) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.company = company;
        this.payment = payment;
        this.requiredQualification = requiredQualification;
        this.experience = experience;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRequiredQualification() {
        return requiredQualification;
    }

    public void setRequiredQualification(String requiredQualification) {
        this.requiredQualification = requiredQualification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobDTO jobDTO = (JobDTO) o;
        return Objects.equals(category, jobDTO.category) &&
                Objects.equals(name, jobDTO.name) &&
                Objects.equals(description, jobDTO.description) &&
                Objects.equals(company, jobDTO.company) &&
                Objects.equals(payment, jobDTO.payment) &&
                Objects.equals(requiredQualification, jobDTO.requiredQualification) &&
                Objects.equals(experience, jobDTO.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, description, company, payment, requiredQualification, experience);
    }

    @Override
    public String toString() {
        return "JobDTO{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", payment='" + payment + '\'' +
                ", requieredQualification='" + requiredQualification + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}

package hu.iit.me.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
import java.util.UUID;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String category;
    private String name;
    private String description;
    private String company;
    private Integer payment;
    private Qualification requiredQualification;
    private String experience;

    public Job() {

    }

    public Job(String category, String name, String description, String company,
               Integer payment, Qualification requiredQualification, String experience) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.company = company;
        this.payment = payment;
        this.requiredQualification = requiredQualification;
        this.experience = experience;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public Qualification getRequiredQualification() {
        return requiredQualification;
    }

    public void setRequiredQualification(Qualification requiredQualification) {
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
        Job job = (Job) o;
        return Objects.equals(id, job.id) &&
                Objects.equals(category, job.category) &&
                Objects.equals(name, job.name) &&
                Objects.equals(description, job.description) &&
                Objects.equals(company, job.company) &&
                Objects.equals(payment, job.payment) &&
                requiredQualification == job.requiredQualification &&
                Objects.equals(experience, job.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, description, company, payment, requiredQualification, experience);
    }

    @Override
    public String toString() {
        return "Job{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", company='" + company + '\'' +
                ", payment='" + payment + '\'' +
                ", requiredQualification='" + requiredQualification + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}

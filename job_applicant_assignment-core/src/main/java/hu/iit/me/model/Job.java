package hu.iit.me.model;

public class Job {

    private String id;
    private String category;
    private String name;
    private String description;
    private String company;
    private String payment;
    private String requiredQualification;
    private String experience;

    public Job() {

    }

    public Job(String id, String category, String name, String description, String company,
               String payment, String requiredQualification, String experience) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.description = description;
        this.company = company;
        this.payment = payment;
        this.requiredQualification = requiredQualification;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

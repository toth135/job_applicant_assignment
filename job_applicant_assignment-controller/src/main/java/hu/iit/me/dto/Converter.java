package hu.iit.me.dto;

import hu.iit.me.exceptions.EmptyFieldException;
import hu.iit.me.exceptions.InvalidBirthDateException;
import hu.iit.me.exceptions.NegativePaymentException;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Gender;
import hu.iit.me.model.Job;
import hu.iit.me.model.Qualification;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Converter {

    SimpleDateFormat sdf = new SimpleDateFormat();

    public static ApplicantDTO convertApplicantToDTO(Applicant applicant){
        ApplicantDTO applicantDTO = new ApplicantDTO();
        applicantDTO.setFirstName(applicant.getFirstName());
        applicantDTO.setLastName(applicant.getLastName());
        applicantDTO.setBirthDate(String.valueOf(applicant.getBirthDate()));
        applicantDTO.setGender(String.valueOf(applicant.getGender()));
        applicantDTO.setQualification(String.valueOf(applicant.getQualification()));
        applicantDTO.setPhoneNumber(applicant.getPhoneNumber());
        applicantDTO.setCity(applicant.getCity());
        return applicantDTO;
    }

    public Applicant convertDTOToApplicant(ApplicantDTO applicantDTO) throws Exception{
        String firstName = applicantDTO.getFirstName();
        if (applicantDTO.getFirstName().isEmpty())
            throw new EmptyFieldException("firstName field is empty!");
        String lastName = applicantDTO.getLastName();
        if (applicantDTO.getLastName().isEmpty())
            throw new EmptyFieldException("lastName field is empty!");
        Date birthDate = sdf.parse(applicantDTO.getBirthDate());
        if (birthDate.before(sdf.parse("1900-01-01")) || birthDate.after(sdf.parse("2018-01-01")))
            throw new InvalidBirthDateException("birthDate should be between 1990-01-01 and 2018-01-01!");
        Gender gender = Gender.valueOf(applicantDTO.getGender());
        Qualification qualification = Qualification.valueOf(applicantDTO.getQualification());
        String phoneNumber = applicantDTO.getPhoneNumber();
        if (applicantDTO.getPhoneNumber().isEmpty())
            throw new EmptyFieldException("phoneNumber field is empty!");
        String city = applicantDTO.getCity();
        return new Applicant(firstName, lastName, birthDate, gender, qualification, phoneNumber, city);
    }

    public static JobDTO convertJobToDTO(Job job){
        JobDTO jobDTO = new JobDTO();
        jobDTO.setCategory(job.getCategory());
        jobDTO.setName(job.getName());
        jobDTO.setDescription(job.getDescription());
        jobDTO.setCompany(job.getCompany());
        jobDTO.setPayment(String.valueOf(job.getPayment()));
        jobDTO.setRequiredQualification(String.valueOf(job.getRequiredQualification()));
        jobDTO.setExperience(job.getExperience());
        return jobDTO;
    }

    public Job convertDTOToJob(JobDTO jobDTO) throws Exception {
        String category = jobDTO.getCategory();
        if (jobDTO.getCategory().isEmpty())
            throw new EmptyFieldException("category field is empty!");
        String name = jobDTO.getName();
        if (jobDTO.getName().isEmpty())
            throw new EmptyFieldException("name field is empty!");
        String description = jobDTO.getDescription();
        if (jobDTO.getDescription().isEmpty())
            throw new EmptyFieldException("description field is empty!");
        String company = jobDTO.getCompany();
        if (jobDTO.getCompany().isEmpty())
            throw new EmptyFieldException("company field is empty!");
        Integer payment = Integer.valueOf(jobDTO.getPayment());
        if (Integer.valueOf(jobDTO.getPayment()) < 0.0)
            throw new NegativePaymentException("payment shouldn't be negative");
        Qualification requiredQualification = Qualification.valueOf(jobDTO.getRequiredQualification());
        String experience = jobDTO.getExperience();
        if (jobDTO.getExperience().isEmpty())
            throw new EmptyFieldException("experience field is empty!");
        return new Job(category, name, description, company, payment, requiredQualification, experience);
    }


}

package hu.iit.me.service;

import hu.iit.me.model.Applicant;
import hu.iit.me.model.Qualification;

import java.util.Collection;
import java.util.Date;

public interface ApplicantService {

    Collection<Applicant> getApplicants();

    Collection<Applicant> getApplicantByQualification(Qualification qualification);

    Collection<Applicant> getApplicantByFirstName(String firstName);

    Collection<Applicant> getApplicantByBirthDate(Date birthDate);
}

package hu.iit.me.service;

import hu.iit.me.model.Applicant;

import java.util.Collection;

public interface ApplicantService {

    Collection<Applicant> getApplicants();

    Collection<Applicant> getApplicantByQualification(String qualification);

    Collection<Applicant> getApplicantByFirstName(String firstName);
}

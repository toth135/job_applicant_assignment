package hu.iit.me.dao;

import hu.iit.me.model.Applicant;
import hu.iit.me.model.Qualification;

import java.util.Collection;
import java.util.Date;

public interface ApplicantsRepository {

    <S extends Applicant> S save(S applicants);

    Collection<Applicant> findAll();

    Collection<Applicant> findByQualification(Qualification qualification);

    Collection<Applicant> findByFirstName(String firstName);

    Collection<Applicant> findByBirthDate(Date birthDate);

}

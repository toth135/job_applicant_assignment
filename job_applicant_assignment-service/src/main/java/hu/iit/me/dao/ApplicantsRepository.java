package hu.iit.me.dao;

import hu.iit.me.model.Applicant;

import java.util.Collection;

public interface ApplicantsRepository {

    <S extends Applicant> S save(S applicants);

    Collection<Applicant> findAll();

    Collection<Applicant> findByQualification(String qualification);

    Collection<Applicant> findByFirstName(String firstName);

}

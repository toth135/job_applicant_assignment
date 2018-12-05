package hu.iit.me.dao;

import hu.iit.me.model.Job;
import hu.iit.me.model.Qualification;

import java.util.Collection;

public interface JobsRepository {

    <S extends Job> S save(S jobs);

    Collection<Job> findAll();

    Collection<Job> findByCategory(String category);

    Collection<Job> findByPayment(Integer payment);

    Collection<Job> findByRequiredQualification(Qualification requiredQualification);

}

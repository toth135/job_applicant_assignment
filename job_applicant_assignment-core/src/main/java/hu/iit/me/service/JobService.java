package hu.iit.me.service;

import hu.iit.me.model.Job;
import hu.iit.me.model.Qualification;

import java.util.Collection;

public interface JobService {

    Collection<Job> getJobs();

    Collection<Job> getJobByCategory(String category);

    Collection<Job> getJobByPayment(Integer payment);

    Collection<Job> getJobByRequiredQualification(Qualification requiredQualification);
}

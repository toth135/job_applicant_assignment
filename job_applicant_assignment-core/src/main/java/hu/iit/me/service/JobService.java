package hu.iit.me.service;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobService {

    Collection<Job> getJobs();

    Collection<Job> getJobByCategory(String category);
}

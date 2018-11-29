package hu.iit.me.dao;

import hu.iit.me.model.Job;

import java.util.Collection;

public interface JobsRepository {

    Collection<Job> findByCategory(String category);

}

package hu.iit.me.dao;

import hu.iit.me.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JobCrudRepository  extends CrudRepository<Job, UUID>, JobsRepository{
}

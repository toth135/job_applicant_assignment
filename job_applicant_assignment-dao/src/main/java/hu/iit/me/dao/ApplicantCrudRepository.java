package hu.iit.me.dao;

import hu.iit.me.model.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ApplicantCrudRepository extends CrudRepository<Applicant, UUID>, ApplicantsRepository {

}
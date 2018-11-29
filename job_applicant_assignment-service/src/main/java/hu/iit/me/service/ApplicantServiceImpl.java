package hu.iit.me.service;

import hu.iit.me.dao.ApplicantsRepository;
import hu.iit.me.model.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.UUID;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private Collection<Applicant> applicants;

    @Autowired
    private ApplicantsRepository applicantsRepository;

    @PostConstruct
    public final void initialization() {
        applicantsRepository.save(new Applicant(
                UUID.randomUUID(),
             "Jancsi",
             "Kiss",
             "1995.06.12.",
             "Férfi",
             "Felsőfokú",
             "06201234567",
             "Ózd"

        ));
        applicantsRepository.save(new Applicant(
                UUID.randomUUID(),
                "Béla",
                "Nagy",
                "1990.05.11.",
                "Férfi",
                "Középfokú",
                "06202345678",
                "Borsodnádasd"
        ));
        applicantsRepository.save(new Applicant(
                UUID.randomUUID(),
                "Julcsi",
                "Fekete",
                "1992.01.01.",
                "Nő",
                "Felsőfokú",
                "06301236789",
                "Kazincbarcika"
        ));
    }

    @Override
    public Collection<Applicant> getApplicants() { return applicantsRepository.findAll(); }

    @Override
    public Collection<Applicant> getApplicantByQualification(String qualification) {
        return applicantsRepository.findByQualification(qualification);
    }

    @Override
    public Collection<Applicant> getApplicantByFirstName(String firstName) {
        return applicantsRepository.findByFirstName(firstName);
    }

}

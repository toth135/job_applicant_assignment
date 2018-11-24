package hu.iit.me.service;

import hu.iit.me.model.Applicant;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;

@Component
public class ApplicantServiceImpl implements ApplicantService {

    private Collection<Applicant> applicants;

    @PostConstruct
    public final void initialization() {
        applicants = new ArrayList<>();
        applicants.add(new Applicant(
             "001",
             "Jancsi",
             "Kiss",
             "1995.06.12.",
             "Férfi",
             "Felsőfokú",
             "06201234567",
             "Ózd"
        ));
        applicants.add(new Applicant(
                "002",
                "Béla",
                "Nagy",
                "1990.05.11.",
                "Férfi",
                "Középfokú",
                "06202345678",
                "Borsodnádasd"
        ));
        applicants.add(new Applicant(
                "003",
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
    public Collection<Applicant> getApplicants() { return applicants; }

    @Override
    public Collection<Applicant> getApplicantByQualification(String qualification) {
        Collection<Applicant> result = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.getQualification().equals(qualification))
                result.add(applicant);
        }
        return result;
    }

    @Override
    public Collection<Applicant> getApplicantByFirstName(String firstName) {
        Collection<Applicant> result = new ArrayList<>();
        for (Applicant applicant : applicants) {
            if (applicant.getFirstName().equals(firstName))
                result.add(applicant);
        }
        return result;
    }

}

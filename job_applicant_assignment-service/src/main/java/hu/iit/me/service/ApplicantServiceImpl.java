package hu.iit.me.service;

import hu.iit.me.dao.ApplicantsRepository;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Gender;
import hu.iit.me.model.Qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    private ApplicantsRepository applicantsRepository;

    @PostConstruct
    public final void initialization() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        applicantsRepository.save(new Applicant(
                UUID.randomUUID(),
             "Jancsi",
             "Kiss",
             sdf.parse("1997-01-29"),
             Gender.FÉRFI,
             Qualification.FELSŐFOKÚ,
             "06201234567",
             "Ózd"

        ));
        applicantsRepository.save(new Applicant(
                UUID.randomUUID(),
                "Béla",
                "Nagy",
                sdf.parse("1992-03-21"),
                Gender.FÉRFI,
                Qualification.KÖZÉPFOKÚ,
                "06202345678",
                "Borsodnádasd"
        ));
        applicantsRepository.save(new Applicant(
                UUID.randomUUID(),
                "Julcsi",
                "Fekete",
                sdf.parse("1990-07-15"),
                Gender.NŐ,
                Qualification.KÖZÉPFOKÚ,
                "06301236789",
                "Kazincbarcika"
        ));
    }

    @Override
    public Collection<Applicant> getApplicants() { return applicantsRepository.findAll(); }

    @Override
    public Collection<Applicant> getApplicantByQualification(Qualification qualification) {
        return applicantsRepository.findByQualification(qualification);
    }

    @Override
    public Collection<Applicant> getApplicantByFirstName(String firstName) {
        return applicantsRepository.findByFirstName(firstName);
    }

    @Override
    public Collection<Applicant> getApplicantByBirthDate(Date birthDate) {
        return applicantsRepository.findByBirthDate(birthDate);
    }

}

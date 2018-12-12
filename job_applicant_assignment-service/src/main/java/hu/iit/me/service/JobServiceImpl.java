package hu.iit.me.service;

import hu.iit.me.dao.JobsRepository;
import hu.iit.me.model.Job;
import hu.iit.me.model.Qualification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobsRepository jobsRepository;

    @PostConstruct
    public final void initialization() {
        jobsRepository.save(new Job(
                "IT",
                "Számítástechnikai szakembör",
                "Szakembört keresünk számítógépek és laptopok szereléséhez",
                "Józsi bácsi kft.",
                170000,
                Qualification.KÖZÉPFOKÚ,
                "Nem feltétel"
        ));
        jobsRepository.save(new Job(
                "Oktatás",
                "Tornatanár",
                "Tornatanárt keresünk általános iskolába",
                "Csépány-Somsály ÁMK",
                140000,
                Qualification.FELSŐFOKÚ,
                "Nem feltétel"
        ));
        jobsRepository.save(new Job(
                "Karbantartás",
                "Karbantartó",
                "Karbantartót keresünk fröccsentőüzemünkbe",
                "Lakat kft.",
                200000,
                Qualification.KÖZÉPFOKÚ,
                "1-2 év munkatapasztalat"
        ));
    }

    @Override
    public Collection<Job> getJobs() {
        return jobsRepository.findAll();
    }

    @Override
    public Collection<Job> getJobByCategory(String category) {
        return jobsRepository.findByCategory(category);
    }

    @Override
    public Collection<Job> getJobByPayment(Integer payment) {
        return jobsRepository.findByPayment(payment);
    }

    @Override
    public Collection<Job> getJobByRequiredQualification(Qualification requiredQualification) {
        return jobsRepository.findByRequiredQualification(requiredQualification);
    }

}

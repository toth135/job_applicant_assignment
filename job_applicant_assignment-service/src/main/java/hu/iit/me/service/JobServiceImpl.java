package hu.iit.me.service;

import hu.iit.me.model.Job;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

@Component
public class JobServiceImpl implements JobService {

    private Collection<Job> jobs;

    @PostConstruct
    public final void initialization() {
        jobs = new LinkedList<>();
        jobs.add(new Job(
                "001",
                "IT",
                "Számítástechnikai szakembör",
                "Szakembört keresünk számítógépek és laptopok szereléséhez",
                "Józsi bácsi kft.",
                "170000",
                "Középfokú",
                "Nem feltétel"
        ));
        jobs.add(new Job(
                "002",
                "Oktatás",
                "Tornatanár",
                "Tornatanárt keresünk általános iskolába",
                "Csépány-Somsály ÁMK",
                "140000",
                "Felsőfokú",
                "Nem feltétel"
        ));
        jobs.add(new Job(
                "002",
                "Karbantartás",
                "Karbantartó",
                "Karbantartót keresünk fröccsentőüzemünkbe",
                "Lakat kft.",
                "200000",
                "Középfokú",
                "1-2 év munkatapasztalat"
        ));
    }

    public Collection<Job> getJobs() {
        return jobs;
    }
    @Override
    public Collection<Job> getJobByCategory(String category) {
        Collection<Job> result = new ArrayList<>();
        for (Job job : jobs) {
            if (job.getCategory().equals(category))
                result.add(job);
        }
        return result;
    }

}

package hu.iit.me.controller;

import hu.iit.me.model.Job;
import hu.iit.me.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping(value = "/jobs/all")
    public Collection<Job> getJobs() {
        return jobService.getJobs();
    }

    @GetMapping("/jobs/bycategory/{category}")
    public Collection<Job> getJobsByCategory(@PathVariable String category) {
        return jobService.getJobByCategory(category);
    }

}

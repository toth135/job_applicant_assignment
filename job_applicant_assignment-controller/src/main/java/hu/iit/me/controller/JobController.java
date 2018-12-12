package hu.iit.me.controller;

import hu.iit.me.dto.Converter;
import hu.iit.me.dto.JobDTO;
import hu.iit.me.model.Job;
import hu.iit.me.model.Qualification;
import hu.iit.me.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping(value = "/jobs/all")
    public List<JobDTO> getJobs() {
        Collection<Job> jobs = this.jobService.getJobs();
        List<JobDTO> jobDTOS = new ArrayList<>();
        for(Job job : jobs) {
            jobDTOS.add(Converter.convertJobToDTO(job));
        }
        return jobDTOS;
    }

    @GetMapping("/jobs/bycategory/{category}")
    public List<JobDTO> getJobsByCategory(@PathVariable String category) {
        Collection<Job> jobs  = this.jobService.getJobByCategory(category);
        List<JobDTO> jobDTOS = new ArrayList<>();
        for(Job job : jobs) {
            jobDTOS.add(Converter.convertJobToDTO(job));
        }
        return jobDTOS;
    }

    @GetMapping("/jobs/bypayment/{payment}")
    public List<JobDTO> getJobsByPayment(@PathVariable Integer payment) {
        Collection<Job> jobs  = this.jobService.getJobByPayment(payment);
        List<JobDTO> jobDTOS = new ArrayList<>();
        for(Job job : jobs) {
            jobDTOS.add(Converter.convertJobToDTO(job));
        }
        return jobDTOS;
    }

    @GetMapping("jobs/byrequiredqualification/{requiredQualification}")
    public List<JobDTO> getJobsByRequiredQualification(@PathVariable Qualification requiredQualification) {
        Collection<Job> jobs  = this.jobService.getJobByRequiredQualification(requiredQualification);
        List<JobDTO> jobDTOS = new ArrayList<>();
        for(Job job : jobs) {
            jobDTOS.add(Converter.convertJobToDTO(job));
        }
        return jobDTOS;
    }


}

package hu.iit.me.controller;

import hu.iit.me.dto.Converter;
import hu.iit.me.dto.JobDTO;
import hu.iit.me.model.Qualification;
import hu.iit.me.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping(value = "/jobs/all")
    public List<JobDTO> getJobs() {
        return jobService.getJobs().stream()
                .map(Converter::convertJobToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/jobs/bycategory/{category}")
    public List<JobDTO> getJobsByCategory(@PathVariable String category) {
        return jobService.getJobByCategory(category).stream()
                .map(Converter::convertJobToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/jobs/bypayment/{payment}")
    public List<JobDTO> getJobsByPayment(@PathVariable Integer payment) {
        return jobService.getJobByPayment(payment).stream()
                .map(Converter::convertJobToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("jobs/byrequiredqualification/{requiredQualification}")
    public List<JobDTO> getJobsByRequiredQualification(@PathVariable Qualification requiredQualification) {
        return jobService.getJobByRequiredQualification(requiredQualification).stream()
                .map(Converter::convertJobToDTO)
                .collect(Collectors.toList());
    }


}

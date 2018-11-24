package hu.iit.me.controller;

import hu.iit.me.model.Applicant;
import hu.iit.me.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    @GetMapping(value="/applicants/all")
    public Collection<Applicant> getApplicants() { return applicantService.getApplicants(); }

    @GetMapping("/applicants/byqualification/{qualification}")
    public Collection<Applicant> getApplicantsByQualification(@PathVariable String qualification) {
        return applicantService.getApplicantByQualification(qualification);
    }

    @GetMapping("/applicants/byfirstname/{firstName}")
    public Collection<Applicant> getApplicantsByFirstName(@PathVariable String firstName) {
        return applicantService.getApplicantByFirstName(firstName);
    }

}

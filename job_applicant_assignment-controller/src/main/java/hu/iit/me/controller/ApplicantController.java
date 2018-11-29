package hu.iit.me.controller;

import hu.iit.me.model.Applicant;
import hu.iit.me.model.Qualification;
import hu.iit.me.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Date;

@RestController
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    @GetMapping(value="/applicants/all")
    public Collection<Applicant> getApplicants() {
        return applicantService.getApplicants();
    }

    @GetMapping("/applicants/byqualification/{qualification}")
    public Collection<Applicant> getApplicantsByQualification(@PathVariable Qualification qualification) {
        return applicantService.getApplicantByQualification(qualification);
    }

    @GetMapping("/applicants/byfirstname/{firstName}")
    public Collection<Applicant> getApplicantsByFirstName(@PathVariable String firstName) {
        return applicantService.getApplicantByFirstName(firstName);
    }

    @GetMapping("/applicants/bybirthdate/{birthDate}")
    public Collection<Applicant> getApplicantsByBirthDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate) {
        return applicantService.getApplicantByBirthDate(birthDate);
    }

}

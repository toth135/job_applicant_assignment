package hu.iit.me.controller;

import hu.iit.me.dto.ApplicantDTO;
import hu.iit.me.dto.Converter;
import hu.iit.me.model.Applicant;
import hu.iit.me.model.Qualification;
import hu.iit.me.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    @GetMapping(value="/applicants/all")
    public List<ApplicantDTO> getApplicants() {
        Collection<Applicant> applicants = this.applicantService.getApplicants();
        List<ApplicantDTO> applicantDTOS = new ArrayList<>();
        for(Applicant applicant : applicants) {
            applicantDTOS.add(Converter.convertApplicantToDTO(applicant));
        }
        return applicantDTOS;
    }

    @GetMapping("/applicants/byqualification/{qualification}")
    public List<ApplicantDTO> getApplicantsByQualification(@PathVariable Qualification qualification) {
        Collection<Applicant> applicants = this.applicantService.getApplicantByQualification(qualification);
        List<ApplicantDTO> applicantDTOS = new ArrayList<>();
        for(Applicant applicant : applicants) {
            applicantDTOS.add(Converter.convertApplicantToDTO(applicant));
        }
        return applicantDTOS;
    }

    @GetMapping("/applicants/byfirstname/{firstName}")
    public List<ApplicantDTO> getApplicantsByFirstName(@PathVariable String firstName) {
        Collection<Applicant> applicants = this.applicantService.getApplicantByFirstName(firstName);
        List<ApplicantDTO> applicantDTOS = new ArrayList<>();
        for(Applicant applicant : applicants) {
            applicantDTOS.add(Converter.convertApplicantToDTO(applicant));
        }
        return applicantDTOS;
    }

    @GetMapping("/applicants/bybirthdate/{birthDate}")
    public List<ApplicantDTO> getApplicantsByBirthDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate) {
        Collection<Applicant> applicants = this.applicantService.getApplicantByBirthDate(birthDate);
        List<ApplicantDTO> applicantDTOS = new ArrayList<>();
        for(Applicant applicant : applicants) {
            applicantDTOS.add(Converter.convertApplicantToDTO(applicant));
        }
        return applicantDTOS;
    }

}

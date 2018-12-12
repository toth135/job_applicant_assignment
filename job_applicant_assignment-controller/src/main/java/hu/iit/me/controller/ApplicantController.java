package hu.iit.me.controller;

import hu.iit.me.dto.ApplicantDTO;
import hu.iit.me.dto.Converter;
import hu.iit.me.model.Qualification;
import hu.iit.me.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    @GetMapping(value="/applicants/all")
    public List<ApplicantDTO> getApplicants() {
        return applicantService.getApplicants().stream()
                .map(Converter::convertApplicantToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/applicants/byqualification/{qualification}")
    public List<ApplicantDTO> getApplicantsByQualification(@PathVariable Qualification qualification) {
        return applicantService.getApplicantByQualification(qualification).stream()
                .map(Converter::convertApplicantToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/applicants/byfirstname/{firstName}")
    public List<ApplicantDTO> getApplicantsByFirstName(@PathVariable String firstName) {
        return applicantService.getApplicantByFirstName(firstName).stream()
                .map(Converter::convertApplicantToDTO)
                .collect(Collectors.toList());

    }

    @GetMapping("/applicants/bybirthdate/{birthDate}")
    public List<ApplicantDTO> getApplicantsByBirthDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate) {
        return applicantService.getApplicantByBirthDate(birthDate).stream()
                .map(Converter::convertApplicantToDTO)
                .collect(Collectors.toList());
    }

}

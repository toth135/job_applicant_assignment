package web.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"hu.iit.me.controller", "hu.iit.me.dao", "hu.iit.me.model", "hu.iit.me.service"})
public class JobApplicantAssignmentApplicationContext {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

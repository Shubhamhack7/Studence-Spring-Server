package com.studence.studence_spring_management_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.studence.studence_environment.enamuration.StudenceEnvironmentProfile;
import com.studence.studence_environment.manager.StudenceProfileManager;

@SpringBootApplication
public class StudenceSpringManagementAppApplication {
	

    @Autowired
    private static Environment environment;
    
    @Autowired
    private static StudenceProfileManager manager;
    

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(StudenceSpringManagementAppApplication.class);
        app.setAdditionalProfiles(StudenceEnvironmentProfile.PRODUCTION.getProfileName());
		StudenceProfileManager manager = new StudenceProfileManager();
		try {
			manager.determineActiveProfile(app.getAdditionalProfiles());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        app.run(args);
        
	}

}

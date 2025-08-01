package com.studence.studence_environment.manager;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.studence.studence_environment.enamuration.StudenceEnvironmentProfile;

@Component
public class StudenceProfileManager {


    private StudenceEnvironmentProfile activeProfile;

    @PostConstruct
    public void determineActiveProfile(Set<String> set) {
        String[] activeProfiles = set.toArray(new String[0]);
        if (activeProfiles.length > 0) {
            // Find the enum constant that matches the first active profile string
            activeProfile = Arrays.stream(StudenceEnvironmentProfile.values())
                    .filter(p -> p.getProfileName().equalsIgnoreCase(activeProfiles[0]))
                    .findFirst()
                    .orElse(null); // Or handle a default case
        }
        System.out.println("✅ Determined active profile enum: " + this.activeProfile);
    
    }

    public Optional<StudenceEnvironmentProfile> getActiveProfile() {
        return Optional.ofNullable(activeProfile);
    }
}

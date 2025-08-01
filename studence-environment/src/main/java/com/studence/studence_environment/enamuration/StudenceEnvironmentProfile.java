package com.studence.studence_environment.enamuration;

public enum StudenceEnvironmentProfile {
	DEVELOPMENT("development"),
    QUALITY_ASSURANCE("quality_assurance"),
    PRODUCTION("production");

    private final String profileName;

    StudenceEnvironmentProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}

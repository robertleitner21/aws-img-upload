package com.robertleitner.awsimgupload.datastore;

import com.robertleitner.awsimgupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("c3a8931f-013b-4f41-b719-2a8eba4f7969"), "bobbythecreator", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("4430ba01-764b-481b-801d-f4256f638d50"), "smartattack", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}

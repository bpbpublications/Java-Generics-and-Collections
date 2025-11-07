package com.meennu.javabook.chap11.casestudy2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserAccessManager {
    private final Map<String, Set<String>> userRoles = new HashMap<>();
    private final RolePermissionRegistry registry;

    public UserAccessManager(RolePermissionRegistry registry) {
        this.registry = registry;
    }

    public void assignRole(String userId, String role) {
        userRoles.computeIfAbsent(userId, k -> new HashSet<>()).add(role);
    }

    public Set<String> getUserRoles(String userId) {
    	return Collections.unmodifiableSet(
    			userRoles.getOrDefault(userId, Collections.emptySet())
    	);
    }

    public boolean isActionAllowed(String userId, String action) {
        Set<String> roles = getUserRoles(userId);

        for (String role : roles) {
            if (registry.getPermissions(role).contains(action)) {
                return true;
            }
        }
        return false;
    }
}

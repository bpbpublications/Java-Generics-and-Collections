package com.meennu.javabook.chap11.casestudy2;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RolePermissionRegistry {
    private final Map<String, Set<String>> rolePermissions = new HashMap<>();

    public void addPermissions(String role, Set<String> permissions) {
        rolePermissions.put(role, new HashSet<>(permissions));
    }

    public Set<String> getPermissions(String role) {
    	return Collections.unmodifiableSet(
    	        rolePermissions.getOrDefault(role, Collections.emptySet())
    	);
    }
}

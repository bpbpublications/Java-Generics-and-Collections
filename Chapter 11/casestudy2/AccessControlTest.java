package com.meennu.javabook.chap11.casestudy2;

import java.util.Set;

public class AccessControlTest {
    public static void main(String[] args) {
        RolePermissionRegistry registry = new RolePermissionRegistry();
        registry.addPermissions("admin", Set.of("CREATE", "READ", "UPDATE", "DELETE"));
        registry.addPermissions("editor", Set.of("READ", "UPDATE"));
        registry.addPermissions("viewer", Set.of("READ"));

        UserAccessManager accessManager = new UserAccessManager(registry);

        accessManager.assignRole("Chloe", "viewer");
        accessManager.assignRole("Ray", "editor");
        accessManager.assignRole("Ann", "admin");

        System.out.println("Can Chloe DELETE? " + accessManager.isActionAllowed("Chloe", "DELETE")); // false
        System.out.println("Can Ray UPDATE? " + accessManager.isActionAllowed("Ray", "UPDATE"));     // true
        System.out.println("Can Ann CREATE? " + accessManager.isActionAllowed("Ann", "CREATE")); // true
    }
}

package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Student {
    private final Set<String> enrolledSubjects;

    public Student(boolean isEnrolled) {
        if (isEnrolled) {
            this.enrolledSubjects = new HashSet<>(Arrays.asList("Math", "Science"));
        } else {
            this.enrolledSubjects = Collections.emptySet();
        }
    }

    public Set<String> getEnrolledSubjects() {
        return enrolledSubjects;
    }
}

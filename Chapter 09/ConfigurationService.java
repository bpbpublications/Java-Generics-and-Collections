package com.meennu.javabook.chap9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ConfigurationService {
    public Map<String, String> loadConfig(String env) {
        if (env == null || env.isEmpty()) {
            return Collections.emptyMap();
        }
        // Suppose config is loaded from a file or DB
        Map<String, String> config = new HashMap<>();
        config.put("timeout", "30");
        config.put("retry", "5");
        return config;
    }
}


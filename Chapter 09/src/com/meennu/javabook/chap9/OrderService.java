package com.meennu.javabook.chap9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrderService {
    public List<String> getPendingOrders(String userId) {
        if (userId == null || userId.isEmpty()) {
            return Collections.emptyList();
        }
        // Logic to fetch orders from database
        return Arrays.asList("ORD123", "ORD456");
    }
}

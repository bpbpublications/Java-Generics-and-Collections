package com.meennu.javabook.chap11.casestudy1;

public class SessionInfo {
    private final String userId;
    private final String ipAddress;
    private final long loginTime; // epoch time in ms
    private final String role;

    public SessionInfo(String userId, String ipAddress, long loginTime, String role) {
        this.userId = userId;
        this.ipAddress = ipAddress;
        this.loginTime = loginTime;
        this.role = role;
    }

    // Getters
    public String getUserId() { return userId; }
    public String getIpAddress() { return ipAddress; }
    public long getLoginTime() { return loginTime; }
    public String getRole() { return role; }
}

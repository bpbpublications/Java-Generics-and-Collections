package com.meennu.javabook.chap11.casestudy1;

public class TestSessionManager {
    public static void main(String[] args) throws InterruptedException {
        SessionManager manager = new SessionManager();

        manager.createSession("sess1", new SessionInfo("user123", "192.168.1.1", System.currentTimeMillis(), "admin"));
        manager.createSession("sess2", new SessionInfo("user456", "192.168.1.2", System.currentTimeMillis(), "editor"));

        // Simulate session list
        for (SessionInfo session : manager.getAllActiveSessions()) {
            System.out.println(session.getUserId() + " - " + session.getRole());
        }

        // After 30 minutes, run cleanup (simulate with sleep for testing)
        Thread.sleep(1000); // Just for demonstration
        manager.cleanupExpiredSessions();
    }
}


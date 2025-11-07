package com.meennu.javabook.chap11.casestudy1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SessionManager {

    private final Map<String, SessionInfo> sessionMap = new LinkedHashMap<>();
    private static final long SESSION_TIMEOUT = 30 * 60 * 1000; // 30 minutes

    // Creates or replaces a session for a user
    public void createSession(String sessionId, SessionInfo info) {
        sessionMap.put(sessionId, info);
    }

    // Retrieve session by session ID
    public SessionInfo getSession(String sessionId) {
        return sessionMap.get(sessionId);
    }

    // Manually remove a session
    public void removeSession(String sessionId) {
        sessionMap.remove(sessionId);
    }

    // Get read-only view of all sessions
    public List<SessionInfo> getAllActiveSessions() {
        return Collections.unmodifiableList(new ArrayList<>(sessionMap.values()));
    }

    // Cleanup expired sessions
    public void cleanupExpiredSessions() {
        long now = System.currentTimeMillis();
        Iterator<Map.Entry<String, SessionInfo>> iterator = sessionMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, SessionInfo> entry = iterator.next();
            if (now - entry.getValue().getLoginTime() > SESSION_TIMEOUT) {
                iterator.remove(); // safe way to remove while iterating
            }
        }
    }
}

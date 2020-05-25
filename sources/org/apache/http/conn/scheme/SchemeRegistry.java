package org.apache.http.conn.scheme;

import java.util.LinkedHashMap;
import java.util.Map;

public final class SchemeRegistry {
    private final Map<String, Scheme> registeredSchemes = new LinkedHashMap();

    public final synchronized Scheme register(Scheme scheme) {
        if (scheme != null) {
        } else {
            throw new IllegalArgumentException("Scheme must not be null.");
        }
        return (Scheme) this.registeredSchemes.put(scheme.getName(), scheme);
    }
}

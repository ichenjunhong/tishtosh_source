package org.apache.http.impl.conn;

import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;

public class DefaultClientConnectionOperator implements ClientConnectionOperator {
    protected final SchemeRegistry schemeRegistry;

    public DefaultClientConnectionOperator(SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            return;
        }
        throw new IllegalArgumentException("Scheme registry must not be null.");
    }
}

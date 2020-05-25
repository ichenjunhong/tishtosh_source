package org.apache.http.conn.params;

import org.apache.http.params.HttpParams;

public final class ConnManagerParams {
    private static final ConnPerRoute DEFAULT_CONN_PER_ROUTE = new ConnPerRoute() {
    };

    public static void setMaxConnectionsPerRoute(HttpParams httpParams, ConnPerRoute connPerRoute) {
        if (httpParams != null) {
            httpParams.setParameter("http.conn-manager.max-per-route", connPerRoute);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i) {
        if (httpParams != null) {
            httpParams.setIntParameter("http.conn-manager.max-total", i);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters must not be null.");
    }
}

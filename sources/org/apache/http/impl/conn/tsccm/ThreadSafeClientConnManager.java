package org.apache.http.impl.conn.tsccm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.DefaultClientConnectionOperator;
import org.apache.http.params.HttpParams;

public class ThreadSafeClientConnManager implements ClientConnectionManager {
    protected final ClientConnectionOperator connOperator;
    protected final AbstractConnPool connectionPool;
    public final Log log = LogFactory.getLog(getClass());
    protected final SchemeRegistry schemeRegistry;

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    public void shutdown() {
        this.log.debug("Shutting down");
        this.connectionPool.shutdown();
    }

    /* access modifiers changed from: protected */
    public ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeRegistry2) {
        return new DefaultClientConnectionOperator(schemeRegistry2);
    }

    /* access modifiers changed from: protected */
    public AbstractConnPool createConnectionPool(HttpParams httpParams) {
        return new ConnPoolByRoute(this.connOperator, httpParams);
    }

    public ThreadSafeClientConnManager(HttpParams httpParams, SchemeRegistry schemeRegistry2) {
        if (httpParams == null) {
            throw new IllegalArgumentException("HTTP parameters may not be null");
        } else if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            this.connOperator = createConnectionOperator(schemeRegistry2);
            this.connectionPool = createConnectionPool(httpParams);
        } else {
            throw new IllegalArgumentException("Scheme registry may not be null");
        }
    }
}

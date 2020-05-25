package org.apache.http.impl.conn.tsccm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

public class ConnPoolByRoute extends AbstractConnPool {
    protected final Queue<BasicPoolEntry> freeConnections;
    private final Log log = LogFactory.getLog(getClass());
    protected final ClientConnectionOperator operator;
    private final HttpParams params;
    protected final Map<HttpRoute, Object> routeToPool;
    protected final Queue<WaitingThread> waitingThreads;

    /* access modifiers changed from: protected */
    public Queue<BasicPoolEntry> createFreeConnQueue() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    public Map<HttpRoute, Object> createRouteToPoolMap() {
        return new HashMap();
    }

    /* access modifiers changed from: protected */
    public Queue<WaitingThread> createWaitingThreadQueue() {
        return new LinkedList();
    }

    public void shutdown() {
        this.poolLock.lock();
        try {
            super.shutdown();
            Iterator it = this.freeConnections.iterator();
            while (it.hasNext()) {
                BasicPoolEntry basicPoolEntry = (BasicPoolEntry) it.next();
                it.remove();
                if (this.log.isDebugEnabled()) {
                    Log log2 = this.log;
                    StringBuilder sb = new StringBuilder("Closing connection [");
                    sb.append(basicPoolEntry.getPlannedRoute());
                    sb.append("][");
                    sb.append(basicPoolEntry.getState());
                    sb.append("]");
                    log2.debug(sb.toString());
                }
                closeConnection(basicPoolEntry.getConnection());
            }
            Iterator it2 = this.waitingThreads.iterator();
            while (it2.hasNext()) {
                WaitingThread waitingThread = (WaitingThread) it2.next();
                it2.remove();
                waitingThread.wakeup();
            }
            this.routeToPool.clear();
        } finally {
            this.poolLock.unlock();
        }
    }

    public ConnPoolByRoute(ClientConnectionOperator clientConnectionOperator, HttpParams httpParams) {
        if (clientConnectionOperator != null) {
            this.operator = clientConnectionOperator;
            this.params = httpParams;
            this.freeConnections = createFreeConnQueue();
            this.waitingThreads = createWaitingThreadQueue();
            this.routeToPool = createRouteToPoolMap();
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }
}

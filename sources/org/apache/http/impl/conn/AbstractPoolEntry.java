package org.apache.http.impl.conn;

import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;

public abstract class AbstractPoolEntry {
    protected final OperatedClientConnection connection;
    protected volatile HttpRoute route;
    protected volatile Object state;

    public Object getState() {
        return this.state;
    }
}

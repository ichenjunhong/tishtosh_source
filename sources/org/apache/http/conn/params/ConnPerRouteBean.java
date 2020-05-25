package org.apache.http.conn.params;

import java.util.HashMap;
import java.util.Map;
import org.apache.http.conn.routing.HttpRoute;

public final class ConnPerRouteBean implements ConnPerRoute {
    private int defaultMax;
    private final Map<HttpRoute, Integer> maxPerHostMap;

    public ConnPerRouteBean() {
        this(2);
    }

    public final String toString() {
        return this.maxPerHostMap.toString();
    }

    public ConnPerRouteBean(int i) {
        this.maxPerHostMap = new HashMap();
        setDefaultMaxPerRoute(i);
    }

    public final void setDefaultMaxPerRoute(int i) {
        if (i > 0) {
            this.defaultMax = i;
            return;
        }
        throw new IllegalArgumentException("The maximum must be greater than 0.");
    }
}

package org.apache.http.conn.routing;

public interface RouteInfo {

    public enum LayerType {
        PLAIN,
        LAYERED
    }

    public enum TunnelType {
        PLAIN,
        TUNNELLED
    }
}

package org.apache.http.params;

import org.apache.http.ProtocolVersion;

public final class HttpProtocolParams {
    public static void setContentCharset(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.protocol.content-charset", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUseExpectContinue(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter("http.protocol.expect-continue", z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUserAgent(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter("http.useragent", str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setVersion(HttpParams httpParams, ProtocolVersion protocolVersion) {
        if (httpParams != null) {
            httpParams.setParameter("http.protocol.version", protocolVersion);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}

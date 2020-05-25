package org.apache.http.impl.client;

import org.apache.http.client.HttpRequestRetryHandler;

public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    private final boolean requestSentRetryEnabled;
    private final int retryCount;

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }

    public DefaultHttpRequestRetryHandler(int i, boolean z) {
        this.retryCount = i;
        this.requestSentRetryEnabled = z;
    }
}

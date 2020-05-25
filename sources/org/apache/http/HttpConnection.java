package org.apache.http;

import java.io.IOException;

public interface HttpConnection {
    void close() throws IOException;
}

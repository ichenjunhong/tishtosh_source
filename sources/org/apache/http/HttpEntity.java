package org.apache.http;

import java.io.IOException;
import java.io.InputStream;

public interface HttpEntity {
    InputStream getContent() throws IOException, IllegalStateException;

    long getContentLength();
}

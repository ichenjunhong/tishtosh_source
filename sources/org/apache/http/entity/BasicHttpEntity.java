package org.apache.http.entity;

import java.io.InputStream;

public class BasicHttpEntity extends AbstractHttpEntity {
    private InputStream content;
    private boolean contentObtained;
    private long length = -1;

    public long getContentLength() {
        return this.length;
    }

    public InputStream getContent() throws IllegalStateException {
        if (this.content == null) {
            throw new IllegalStateException("Content has not been provided");
        } else if (!this.contentObtained) {
            this.contentObtained = true;
            return this.content;
        } else {
            throw new IllegalStateException("Content has been consumed");
        }
    }

    public void setContentLength(long j) {
        this.length = j;
    }

    public void setContent(InputStream inputStream) {
        this.content = inputStream;
        this.contentObtained = false;
    }
}

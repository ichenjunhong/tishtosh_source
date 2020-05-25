package com.p683ss.ttuploader;

/* renamed from: com.ss.ttuploader.TTExternNetLoader */
public interface TTExternNetLoader {
    void cancelTask();

    int sendRequest(TTExternRequestInfo tTExternRequestInfo, TTExternNetLoaderListener tTExternNetLoaderListener);
}

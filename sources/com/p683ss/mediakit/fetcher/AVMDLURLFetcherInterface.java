package com.p683ss.mediakit.fetcher;

/* renamed from: com.ss.mediakit.fetcher.AVMDLURLFetcherInterface */
public interface AVMDLURLFetcherInterface {
    void close();

    String[] getURLs();

    int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener);
}

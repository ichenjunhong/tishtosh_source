package com.p683ss.ttvideoengine.fetcher;

/* renamed from: com.ss.ttvideoengine.fetcher.FetcherBase */
public class FetcherBase {
    private String mFallbackAPI;
    private String mKeyseed;

    public String getFallbackAPI() {
        return this.mFallbackAPI;
    }

    public String getKeyseed() {
        return this.mKeyseed;
    }

    public FetcherBase(String str, String str2) {
        this.mKeyseed = str;
        this.mFallbackAPI = str2;
    }
}

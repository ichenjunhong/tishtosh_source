package com.p683ss.ttvideoengine.model;

import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.model.P2PPlayUrlInfo */
public class P2PPlayUrlInfo {
    public HashMap mHeaders;
    public int mP2PCDNType;
    public String mSDKVersion;
    public String mUrl;

    public P2PPlayUrlInfo(String str, HashMap hashMap, int i) {
        this.mUrl = str;
        this.mHeaders = hashMap;
        this.mP2PCDNType = i;
    }
}

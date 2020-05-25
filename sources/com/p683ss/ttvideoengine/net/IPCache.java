package com.p683ss.ttvideoengine.net;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.net.IPCache */
public class IPCache {
    private static IPCache mInstance = null;
    private static String mNetExtraInfo = null;
    private static int mNetType = -1;
    private ConcurrentHashMap<String, IpInfo> mIpRecord = new ConcurrentHashMap<>();

    /* renamed from: com.ss.ttvideoengine.net.IPCache$IpInfo */
    static class IpInfo {
        public long ip_expiretime;
        public JSONObject ip_json;

        IpInfo() {
        }
    }

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    private IPCache() {
    }

    public void clear() {
        if (this.mIpRecord != null) {
            this.mIpRecord.clear();
        }
    }

    public int getRecordSize() {
        if (this.mIpRecord != null) {
            return this.mIpRecord.size();
        }
        return -1;
    }

    public static IPCache getInstance() {
        if (mInstance == null) {
            synchronized (IPCache.class) {
                if (mInstance == null) {
                    mInstance = new IPCache();
                }
            }
        }
        return mInstance;
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i) {
        mNetType = i;
    }

    public IpInfo get(String str) {
        if (this.mIpRecord != null) {
            return (IpInfo) this.mIpRecord.get(str);
        }
        return null;
    }

    public void put(String str, IpInfo ipInfo) {
        if (this.mIpRecord != null) {
            this.mIpRecord.put(str, ipInfo);
        }
    }
}

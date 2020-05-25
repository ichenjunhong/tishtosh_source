package com.p683ss.ttvideoengine.net;

import android.content.Context;
import android.os.SystemClock;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.net.DNSParser */
public class DNSParser extends BaseDNS implements DNSCompletionListener {
    private boolean hasRecAndExpired;
    private long mClearTime;
    private Context mContext;
    private BaseDNS mCurrentDNS;
    private int mDNSCount;
    private JSONObject mDnsInfo;
    private long mDnsTime;
    private int mExpiredTime = 120;
    private boolean mForceReparse;
    private IPCache mIPCache;
    private boolean mIPFromCache;
    private boolean mIPFromServer;
    private int mIndex;
    private int[] mParserIndex = {0, 2};
    private boolean mUseDNSCache;
    private boolean mUseServerDNS;

    public boolean getIsUseDNSCache() {
        return this.mUseDNSCache;
    }

    public boolean getIsUseServerDNS() {
        return this.mUseServerDNS;
    }

    public void onCancelled() {
    }

    public void onRetry(Error error) {
    }

    public void setForceReparse() {
        this.mForceReparse = true;
    }

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            if (this.mCurrentDNS != null) {
                this.mCurrentDNS.cancel();
            }
        }
    }

    public String getTypeStr() {
        if (this.mIPFromCache) {
            return "FromCache";
        }
        if (this.mIPFromServer) {
            return "FromServer";
        }
        switch (this.mParserIndex[this.mIndex]) {
            case 0:
                return "local";
            case 1:
                return "HTTP 203.107.1.4";
            case 2:
                return "TT_HTTP";
            default:
                return "";
        }
    }

    private void DNSParseAsync() {
        switch (this.mParserIndex[this.mIndex]) {
            case 0:
                this.mCurrentDNS = new LocalDNS(this.mHostname);
                break;
            case 1:
                this.mCurrentDNS = new HTTPDNS(this.mHostname, this.mNetClient, 1);
                break;
            case 2:
                this.mCurrentDNS = new HTTPDNS(this.mHostname, this.mNetClient, 2);
                break;
        }
        if (this.mCurrentDNS != null) {
            this.mCurrentDNS.setCompletionListener(this);
            this.mCurrentDNS.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r12 = this;
            boolean r0 = r12.mCancelled
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r12.mIndex
            int r1 = r12.mDNSCount
            if (r0 < r1) goto L_0x000c
            return
        L_0x000c:
            com.p683ss.ttvideoengine.net.DNSServerIP.updateDNSServerIP()
            boolean r0 = r12.mForceReparse
            if (r0 != 0) goto L_0x013c
            boolean r0 = r12.mUseDNSCache
            if (r0 != 0) goto L_0x001d
            boolean r0 = r12.mUseServerDNS
            if (r0 != 0) goto L_0x001d
            goto L_0x013c
        L_0x001d:
            android.content.Context r0 = r12.mContext
            android.net.NetworkInfo r0 = com.p683ss.ttvideoengine.net.NetUtils.getNetworkInfo(r0)
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0036
            boolean r3 = r0.isAvailable()
            if (r3 == 0) goto L_0x0036
            int r3 = r0.getType()
            java.lang.String r0 = r0.getExtraInfo()
            goto L_0x0038
        L_0x0036:
            r0 = r2
            r3 = -1
        L_0x0038:
            com.ss.ttvideoengine.net.IPCache r4 = r12.mIPCache
            int r4 = r4.getCurNetType()
            r5 = 0
            r6 = 1
            if (r3 == r1) goto L_0x0063
            if (r3 == r4) goto L_0x004c
            long r7 = java.lang.System.currentTimeMillis()
            r12.mClearTime = r7
        L_0x004a:
            r7 = 1
            goto L_0x0064
        L_0x004c:
            com.ss.ttvideoengine.net.IPCache r7 = r12.mIPCache
            java.lang.String r7 = r7.getCurNetExtraInfo()
            if (r0 == 0) goto L_0x0063
            if (r7 == 0) goto L_0x005c
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x0063
        L_0x005c:
            long r7 = java.lang.System.currentTimeMillis()
            r12.mClearTime = r7
            goto L_0x004a
        L_0x0063:
            r7 = 0
        L_0x0064:
            boolean r8 = r12.mUseServerDNS
            if (r8 == 0) goto L_0x008d
            long r8 = r12.mClearTime
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            long r10 = r12.mDnsTime
            long r8 = r8 - r10
            if (r7 == 0) goto L_0x0080
            if (r4 != r1) goto L_0x0080
            com.ss.ttvideoengine.net.IPCache r1 = r12.mIPCache
            r1.setCurNetExtraInfo(r0)
            com.ss.ttvideoengine.net.IPCache r1 = r12.mIPCache
            r1.setCurNetType(r3)
            r7 = 0
            goto L_0x008d
        L_0x0080:
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x008d
            long r8 = r12.mDnsTime
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x008d
            r7 = 1
        L_0x008d:
            if (r7 == 0) goto L_0x00a2
            com.ss.ttvideoengine.net.IPCache r1 = r12.mIPCache
            r1.clear()
            com.ss.ttvideoengine.net.IPCache r1 = r12.mIPCache
            r1.setCurNetExtraInfo(r0)
            com.ss.ttvideoengine.net.IPCache r0 = r12.mIPCache
            r0.setCurNetType(r3)
            r12.DNSParseAsync()
            return
        L_0x00a2:
            boolean r0 = r12.mUseServerDNS
            if (r0 == 0) goto L_0x00f0
            org.json.JSONObject r0 = r12.mDnsInfo
            if (r0 == 0) goto L_0x00f0
            org.json.JSONObject r0 = r12.mDnsInfo
            java.lang.String r1 = r12.mHostname
            org.json.JSONArray r0 = r0.optJSONArray(r1)
            if (r0 == 0) goto L_0x00e9
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00bb
            goto L_0x00e9
        L_0x00bb:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "ip"
            java.lang.String r0 = r0.optString(r5)     // Catch:{ Exception -> 0x00d3 }
            r1.put(r3, r0)     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r0 = "time"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d3 }
            r1.put(r0, r3)     // Catch:{ Exception -> 0x00d3 }
            goto L_0x00d7
        L_0x00d3:
            r0 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r0)
        L_0x00d7:
            r12.mIPFromServer = r6
            int r0 = r12.mExpiredTime
            long r3 = (long) r0
            r12.recordIPInfo(r1, r3)
            com.ss.ttvideoengine.net.DNSCompletionListener r0 = r12.mListener
            if (r0 == 0) goto L_0x00e8
            com.ss.ttvideoengine.net.DNSCompletionListener r0 = r12.mListener
            r0.onCompletion(r1, r2)
        L_0x00e8:
            return
        L_0x00e9:
            java.lang.String r0 = "DNSParser"
            java.lang.String r1 = "dns_info ips empty"
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r0, r1)
        L_0x00f0:
            boolean r0 = r12.mUseDNSCache
            if (r0 == 0) goto L_0x0138
            com.ss.ttvideoengine.net.IPCache r0 = r12.mIPCache
            if (r0 == 0) goto L_0x0101
            com.ss.ttvideoengine.net.IPCache r0 = r12.mIPCache
            java.lang.String r1 = r12.mHostname
            com.ss.ttvideoengine.net.IPCache$IpInfo r0 = r0.get(r1)
            goto L_0x0102
        L_0x0101:
            r0 = r2
        L_0x0102:
            if (r0 == 0) goto L_0x0138
            java.lang.String r1 = "DNSParser"
            java.lang.String r3 = "DNS from cache"
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110644d(r1, r3)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r7 = r0.ip_expiretime
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x011a
            r12.hasRecAndExpired = r6
            r12.DNSParseAsync()
        L_0x011a:
            r12.mIPFromCache = r6
            org.json.JSONObject r1 = r0.ip_json     // Catch:{ Exception -> 0x0128 }
            java.lang.String r3 = "time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0128 }
            r1.put(r3, r4)     // Catch:{ Exception -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r1 = move-exception
            com.p683ss.ttvideoengine.utils.TTVideoEngineLog.m110645d(r1)
        L_0x012c:
            com.ss.ttvideoengine.net.DNSCompletionListener r1 = r12.mListener
            if (r1 == 0) goto L_0x0137
            com.ss.ttvideoengine.net.DNSCompletionListener r1 = r12.mListener
            org.json.JSONObject r0 = r0.ip_json
            r1.onCompletion(r0, r2)
        L_0x0137:
            return
        L_0x0138:
            r12.DNSParseAsync()
            return
        L_0x013c:
            r12.DNSParseAsync()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ttvideoengine.net.DNSParser.start():void");
    }

    public void setDNSExpiredTimeInS(int i) {
        this.mExpiredTime = i;
    }

    public void setIsUseDNSCache(boolean z) {
        this.mUseDNSCache = z;
    }

    public void setIsUseServerDNS(boolean z) {
        this.mUseServerDNS = z;
    }

    public void setDnsInfo(JSONObject jSONObject, Long l) {
        this.mDnsInfo = jSONObject;
        this.mDnsTime = l.longValue();
    }

    private void recordIPInfo(JSONObject jSONObject, long j) {
        if (this.mIPCache != null) {
            IpInfo ipInfo = new IpInfo();
            ipInfo.ip_json = jSONObject;
            ipInfo.ip_expiretime = SystemClock.elapsedRealtime() + (j * 1000);
            this.mIPCache.put(this.mHostname, ipInfo);
        }
    }

    public void onCompletion(JSONObject jSONObject, Error error) {
        if (this.mCancelled) {
            if (!this.hasRecAndExpired || this.mForceReparse) {
                notifyCancelled();
            }
        } else if (error == null) {
            JSONArray jSONArray = null;
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("ips");
            }
            if (jSONArray == null || jSONArray.length() == 0) {
                if (this.mParserIndex[this.mIndex] == 0) {
                    StringBuilder sb = new StringBuilder("dns result empty,type:");
                    sb.append(this.mParserIndex[this.mIndex]);
                    notifyError(new Error("kTTVideoErrorDomainLocalDNS", -9997, sb.toString()));
                } else {
                    StringBuilder sb2 = new StringBuilder("dns result empty,type:");
                    sb2.append(this.mParserIndex[this.mIndex]);
                    notifyError(new Error("kTTVideoErrorDomainHTTPDNS", -9997, sb2.toString()));
                }
                TTVideoEngineLog.m110644d("DNSParser", "ips empty");
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ip", jSONArray.optString(0));
            } catch (Exception unused) {
            }
            long optLong = jSONObject.optLong("ttl");
            if (optLong == 0) {
                optLong = (long) this.mExpiredTime;
            }
            recordIPInfo(jSONObject2, optLong);
            if (!this.hasRecAndExpired || this.mForceReparse) {
                try {
                    jSONObject2.put("time", jSONObject.optLong("time"));
                } catch (Exception e) {
                    TTVideoEngineLog.m110644d("DNSParser", e.toString());
                }
                notifySuccess(jSONObject2);
            }
        } else if (this.mIndex == this.mDNSCount - 1) {
            if (!this.hasRecAndExpired || this.mForceReparse) {
                notifyError(error);
            }
        } else {
            if (!this.hasRecAndExpired || this.mForceReparse) {
                notifyRetry(error);
            }
            this.mIndex++;
            start();
        }
    }

    public DNSParser(Context context, String str, TTVNetClient tTVNetClient) {
        super(str, tTVNetClient);
        this.mContext = context;
        this.mDNSCount = this.mParserIndex.length;
        int[] dNSType = TTVideoEngine.getDNSType();
        if (dNSType != null && dNSType.length > 0) {
            for (int i = 0; i < dNSType.length; i++) {
                switch (dNSType[i]) {
                    case 0:
                    case 1:
                    case 2:
                        this.mParserIndex[i] = dNSType[i];
                        break;
                }
            }
        } else if (TTVideoEngine.isHttpDnsFirst()) {
            this.mParserIndex[0] = 2;
            this.mParserIndex[1] = 0;
        }
        StringBuilder sb = new StringBuilder("DNSType:");
        sb.append(Arrays.toString(this.mParserIndex));
        TTVideoEngineLog.m110647i("DNSParser", sb.toString());
        this.mIPCache = IPCache.getInstance();
    }
}

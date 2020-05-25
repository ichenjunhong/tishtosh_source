package com.p683ss.ttvideoengine.net;

import com.p683ss.ttvideoengine.net.TTVNetClient.CompletionListener;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.net.HTTPDNS */
public class HTTPDNS extends BaseDNS {
    private static String mAliDNSServer = "https://203.107.1.4/131950/d?host=";
    private static String mTTDNSServer = "https://dig.bdurl.net/q?host=";
    private int mHttpDNSType = 2;

    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    private String _getURL() {
        StringBuilder sb = new StringBuilder();
        if (this.mHttpDNSType == 2) {
            sb.append(mTTDNSServer);
        } else {
            sb.append(mAliDNSServer);
        }
        sb.append(this.mHostname);
        return sb.toString();
    }

    public void start() {
        String _getURL = _getURL();
        Method[] declaredMethods = this.mNetClient.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (method.getName().equals("startTask") && method.getParameterTypes().length == 5) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            this.mNetClient.startTask(_getURL, null, null, 0, new CompletionListener() {
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        } else {
            this.mNetClient.startTask(_getURL, null, new CompletionListener() {
                public void onCompletion(JSONObject jSONObject, Error error) {
                    HTTPDNS.this._handleResponse(jSONObject, error);
                }
            });
        }
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        Error error2;
        String str;
        String str2;
        if (error != null) {
            error.domain = "kTTVideoErrorDomainHTTPDNS";
            error2 = error;
        } else if (jSONObject == null || jSONObject.length() == 0) {
            String str3 = "kTTVideoErrorDomainHTTPDNS";
            StringBuilder sb = new StringBuilder();
            if (this.mHttpDNSType == 2) {
                str = "TT_";
            } else {
                str = "ALI_";
            }
            sb.append(str);
            sb.append("HTTP dns empty");
            error2 = new Error(str3, -9997, sb.toString());
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                String str4 = "kTTVideoErrorDomainHTTPDNS";
                StringBuilder sb2 = new StringBuilder();
                if (this.mHttpDNSType == 2) {
                    str2 = "TT_";
                } else {
                    str2 = "ALI_";
                }
                sb2.append(str2);
                sb2.append("HTTP dns empty");
                error2 = new Error(str4, -9997, sb2.toString());
            } else {
                try {
                    jSONObject.put("time", System.currentTimeMillis());
                } catch (JSONException e) {
                    TTVideoEngineLog.m110645d(e);
                }
                notifySuccess(jSONObject);
                return;
            }
        }
        notifyError(error2);
    }

    public HTTPDNS(String str, TTVNetClient tTVNetClient, int i) {
        String str2;
        super(str, tTVNetClient);
        this.mHttpDNSType = i;
        String str3 = "HTTPDNS";
        StringBuilder sb = new StringBuilder("DNS use HTTPDNS");
        if (i == 2) {
            str2 = "_TT";
        } else {
            str2 = "_ALI";
        }
        sb.append(str2);
        TTVideoEngineLog.m110647i(str3, sb.toString());
    }
}

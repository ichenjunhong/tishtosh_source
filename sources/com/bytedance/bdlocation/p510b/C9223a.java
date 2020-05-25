package com.bytedance.bdlocation.p510b;

import com.bytedance.bdlocation.BDLocation;
import com.bytedance.bdlocation.ILocateCallback;
import com.bytedance.bdlocation.Util;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.client.BDLocationException;
import com.bytedance.bdlocation.netwok.p511a.C9240i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.bdlocation.b.a */
public final class C9223a implements ILocateCallback {

    /* renamed from: a */
    public final String f25203a;

    /* renamed from: b */
    public long f25204b;

    /* renamed from: c */
    public BDLocationException f25205c;

    /* renamed from: d */
    public List<Throwable> f25206d = Collections.synchronizedList(new ArrayList(3));

    /* renamed from: e */
    public long f25207e;

    /* renamed from: f */
    public C9225c f25208f;

    /* renamed from: g */
    private boolean f25209g;

    /* renamed from: h */
    private long f25210h;

    /* renamed from: i */
    private long f25211i;

    /* renamed from: j */
    private BDLocation f25212j;

    /* renamed from: k */
    private long f25213k;

    /* renamed from: b */
    public final void mo16672b() {
        m18327a(false);
    }

    /* renamed from: a */
    public final void mo16668a() {
        this.f25204b = System.currentTimeMillis();
        BDLocationConfig.isDebug();
    }

    /* renamed from: c */
    private void m18328c() {
        this.f25209g = false;
        this.f25210h = 0;
        this.f25211i = 0;
        this.f25212j = null;
        this.f25205c = null;
        this.f25207e = 0;
        this.f25213k = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationTrace{mTag='");
        sb.append(this.f25203a);
        sb.append('\'');
        sb.append(", mStartTimeMs=");
        sb.append(this.f25204b);
        sb.append(", isCache=");
        sb.append(this.f25209g);
        sb.append(", mStopTimeMs=");
        sb.append(this.f25210h);
        sb.append(", mLocation=");
        sb.append(this.f25212j);
        sb.append(", mError=");
        sb.append(this.f25205c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo16673b(BDLocationException bDLocationException) {
        mo16671a(bDLocationException);
        m18327a(true);
        m18328c();
    }

    public final void onLocateStart(String str) {
        if (this.f25208f != null) {
            this.f25208f.onLocateStart(str);
        }
    }

    public final void onLocateStop(String str) {
        if (this.f25208f != null) {
            this.f25208f.onLocateStop(str);
        }
    }

    public C9223a(String str) {
        this.f25203a = str;
    }

    /* renamed from: a */
    public final void mo16669a(long j) {
        if (this.f25213k == 0) {
            this.f25213k = j;
        }
    }

    /* renamed from: a */
    public final void mo16670a(BDLocation bDLocation) {
        if (this.f25208f != null) {
            new BDLocation(bDLocation);
        }
        this.f25212j = bDLocation;
        this.f25209g = bDLocation.isCache();
        if (this.f25211i == 0) {
            this.f25211i = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo16671a(BDLocationException bDLocationException) {
        this.f25205c = bDLocationException;
        if (this.f25206d.size() < 16) {
            this.f25206d.add(bDLocationException);
        }
        if (this.f25211i == 0) {
            this.f25211i = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    private void m18327a(boolean z) {
        this.f25210h = System.currentTimeMillis();
        BDLocation bDLocation = this.f25212j;
        BDLocationException bDLocationException = this.f25205c;
        BDLocationConfig.isDebug();
        if (this.f25211i == 0) {
            this.f25211i = System.currentTimeMillis();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("biz_module", this.f25203a);
            jSONObject.put("background", BDLocationConfig.getAppBackgroundProvider().f25377b ? 1 : 0);
            if (bDLocation != null) {
                jSONObject.put("locate_type", C9226d.m18335a(bDLocation.getLocationType()));
                jSONObject.put("location_source", bDLocation.getLocationSDKName());
                jSONObject.put("total_duration", this.f25211i - this.f25204b);
                jSONObject.put("reverse_gis_cost", this.f25207e);
                jSONObject.put("bd_location_cost", this.f25213k);
                jSONObject.put("reduce", z);
                jSONObject.put("status", 1);
                if (bDLocation.hasLBSResult()) {
                    C9240i iVar = bDLocation.getBdLBSResult().f25223a;
                    if (iVar != null) {
                        jSONObject2.put("BDLocation_locate_method", iVar.f25281i);
                    }
                }
            } else if (bDLocationException != null) {
                jSONObject.put("total_duration", this.f25211i - this.f25204b);
                jSONObject.put("status", 0);
                jSONObject.put("reduce", z);
                jSONObject.put("location_source", bDLocationException.getSdkName());
                jSONObject2.put("locate_fail_code", bDLocationException.getCode());
                jSONObject2.put("locate_fail_reason", bDLocationException.getMessage());
                for (Entry entry : bDLocationException.getExtra().entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            }
            jSONObject2.put("gps_switch", Util.getGpsStatus(BDLocationConfig.getContext()));
            jSONObject2.put("gps_permission", Util.checkPermissions(BDLocationConfig.getContext(), "android.permission.ACCESS_FINE_LOCATION"));
            jSONObject2.put("bss_permission", Util.checkPermissions(BDLocationConfig.getContext(), "android.permission.ACCESS_COARSE_LOCATION"));
            jSONObject2.put("wifi_permission", Util.checkPermissions(BDLocationConfig.getContext(), "android.permission.ACCESS_COARSE_LOCATION"));
            BDLocationConfig.notifyTraceListener("bd_location_sdk_lcoate", null, jSONObject, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public final void onLocateChange(String str, BDLocation bDLocation) {
        if (this.f25208f != null) {
            this.f25208f.onLocateChange(str, bDLocation);
        }
    }

    public final void onLocateError(String str, BDLocationException bDLocationException) {
        if (this.f25208f != null) {
            this.f25208f.onLocateError(str, bDLocationException);
        }
    }
}

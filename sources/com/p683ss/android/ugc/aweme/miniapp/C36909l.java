package com.p683ss.android.ugc.aweme.miniapp;

import android.content.Context;
import com.bytedance.crash.C9588g;
import com.bytedance.crash.p555n.C9685a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.AppLog.ILogSessionHook;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.deviceregister.p1154a.C19002a;
import com.p683ss.android.deviceregister.p1154a.C19005d;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp.l */
public final class C36909l implements C9588g {

    /* renamed from: a */
    public String f94288a;

    /* renamed from: b */
    private Context f94289b;

    /* renamed from: c */
    private Map<String, String> f94290c = new HashMap();

    /* renamed from: d */
    public final String mo17415d() {
        return this.f94288a;
    }

    /* renamed from: c */
    public final long mo17414c() {
        try {
            return Long.parseLong(AppLog.getUserId());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo17412a() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        NetUtil.putCommonParams(hashMap2, true);
        hashMap.putAll(hashMap2);
        hashMap.putAll(this.f94290c);
        if (!hashMap.containsKey("channel")) {
            hashMap.put("channel", C19005d.m46189d());
        }
        if (!hashMap.containsKey("release_build")) {
            hashMap.put("release_build", C19005d.m46178a());
        }
        return hashMap;
    }

    /* renamed from: b */
    public final String mo17413b() {
        if (C9685a.m19317b(this.f94289b)) {
            return TeaAgent.getServerDeviceId();
        }
        return C35807d.m80935a(this.f94289b, C19002a.m46175a(), 0).getString("device_id", "");
    }

    public C36909l(Context context) {
        this.f94289b = context;
        AppLog.addSessionHook(new ILogSessionHook() {
            public final void onLogSessionStart(long j) {
            }

            public final void onLogSessionTerminate(long j, String str, JSONObject jSONObject) {
            }

            public final void onLogSessionBatchEvent(long j, String str, JSONObject jSONObject) {
                C36909l.this.f94288a = str;
            }
        });
    }
}

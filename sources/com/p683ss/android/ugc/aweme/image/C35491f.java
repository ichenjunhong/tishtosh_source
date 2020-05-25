package com.p683ss.android.ugc.aweme.image;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.p566a.C9806a;
import com.bytedance.frameworks.baselib.network.p566a.C9812c;
import com.bytedance.ies.p621b.p622a.C10201a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.C9218a;
import com.bytedance.p582g.p583a.p584a.C9946b;
import com.bytedance.ttnet.C13281b;
import com.bytedance.ttnet.p883a.C13258a;
import com.bytedance.ttnet.p885c.C13297b;
import com.bytedance.ttnet.p885c.C13302e;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.image.f */
public final class C35491f implements C35498j {
    /* renamed from: a */
    private static void m80228a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("nt_band_width", C9812c.m19639b().mo17652c());
                jSONObject.put("cdn_nt_band_width", C9806a.m19636a().mo17652c());
                jSONObject.put("cronet_open", C13258a.m26660a(C11010c.m22280a()).mo24856h());
                jSONObject.put("cronet_plugin_install", false);
                jSONObject.put("cronet_plugin_version", -1);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m80227a(C13297b bVar, JSONObject jSONObject) {
        if (bVar != null && jSONObject != null) {
            m80228a(jSONObject);
            try {
                jSONObject.put("requestStart", bVar.f26755e);
                jSONObject.put("responseBack", bVar.f26756f);
                jSONObject.put("completeReadResponse", bVar.f26757g);
                jSONObject.put("appLevelRequestStart", bVar.f26753c);
                jSONObject.put("beforeAllInterceptors", bVar.f26754d);
                jSONObject.put("requestEnd", bVar.f26758h);
                jSONObject.put("recycleCount", bVar.f26759i);
                if (C13281b.m26758a()) {
                    jSONObject.put("netClientType", "CronetClient");
                } else {
                    jSONObject.put("netClientType", "TTOkhttp3Client");
                }
                if (bVar.f26772v == 0) {
                    jSONObject.put("timing_dns", bVar.f26760j);
                    jSONObject.put("timing_connect", bVar.f26761k);
                    jSONObject.put("timing_ssl", bVar.f26762l);
                    jSONObject.put("timing_send", bVar.f26763m);
                    jSONObject.put("timing_waiting", bVar.f26767q);
                    jSONObject.put("timing_receive", bVar.f26765o);
                    jSONObject.put("timing_total", bVar.f26768r);
                    jSONObject.put("timing_isSocketReused", bVar.f26766p);
                    jSONObject.put("timing_totalSendBytes", bVar.f26769s);
                    jSONObject.put("timing_totalReceivedBytes", bVar.f26770t);
                    jSONObject.put("timing_remoteIP", bVar.f26751a);
                    jSONObject.put("request_log", bVar.f26774x);
                }
                if (bVar.f26775y != null) {
                    jSONObject.put("req_info", bVar.f26775y);
                }
                jSONObject.put("download", bVar.f26776z);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo73887a(long j, long j2, String str, C13297b bVar, Throwable th, JSONObject jSONObject) {
        final long j3 = j;
        final long j4 = j2;
        final String str2 = str;
        final C13297b bVar2 = bVar;
        final Throwable th2 = th;
        C354921 r0 = new Callable<Object>(null) {
            public final Object call() throws Exception {
                C23569o.m57783b("aweme_image_api", "", C35491f.m80226a(false, j3, j4, str2, bVar2, th2));
                try {
                    String[] strArr = new String[1];
                    int a = C10201a.m20661a(th2, strArr);
                    if (C9431p.m18664a(strArr[0]) && bVar2 != null) {
                        strArr[0] = bVar2.f26751a;
                    }
                    JSONObject jSONObject = null;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = jSONObject;
                    C35491f.m80227a(bVar2, jSONObject2);
                    C9218a.m18307a(str2, a, strArr[0], j3, jSONObject2);
                } catch (Throwable unused) {
                }
                return null;
            }
        };
        C0013i.m16a((Callable<TResult>) r0);
    }

    /* renamed from: b */
    public final void mo73888b(long j, long j2, String str, C13297b bVar, Throwable th, JSONObject jSONObject) {
        C13297b bVar2 = bVar;
        C23569o.m57783b("aweme_image_api", "", m80226a(true, j, j2, str, bVar, (Throwable) null));
        try {
            String[] strArr = new String[1];
            if (C9431p.m18664a(strArr[0]) && bVar2 != null) {
                strArr[0] = bVar2.f26751a;
            }
            m80227a(bVar, jSONObject);
            C9218a.m18307a(str, 200, strArr[0], j, jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static JSONObject m80226a(boolean z, long j, long j2, String str, C13297b bVar, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                if (str.contains("&config_retry=b")) {
                    jSONObject.put("log_config_retry", 1);
                }
            } catch (Exception unused) {
            }
        }
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(strArr[0]) && bVar != null) {
            strArr[0] = bVar.f26751a;
            if (bVar.f26752b != null) {
                if (((C13302e) bVar.f26752b).f34693n > 0) {
                    jSONObject.put("index", ((C13302e) bVar.f26752b).f34693n);
                }
                if (((C13302e) bVar.f26752b).f34692m > 0) {
                    jSONObject.put("httpIndex", ((C13302e) bVar.f26752b).f34692m);
                }
            }
        }
        if (bVar != null) {
            jSONObject.put("requestStart", bVar.f26755e);
            jSONObject.put("responseBack", bVar.f26756f);
            jSONObject.put("completeReadResponse", bVar.f26757g);
            jSONObject.put("requestEnd", bVar.f26758h);
            jSONObject.put("recycleCount", bVar.f26759i);
            if (bVar.f26772v == 0) {
                jSONObject.put("timing_dns", bVar.f26760j);
                jSONObject.put("timing_connect", bVar.f26761k);
                jSONObject.put("timing_ssl", bVar.f26762l);
                jSONObject.put("timing_send", bVar.f26763m);
                jSONObject.put("timing_waiting", bVar.f26767q);
                jSONObject.put("timing_receive", bVar.f26765o);
                jSONObject.put("timing_total", bVar.f26768r);
                jSONObject.put("timing_isSocketReused", bVar.f26766p);
                jSONObject.put("timing_totalSendBytes", bVar.f26769s);
                jSONObject.put("timing_totalReceivedBytes", bVar.f26770t);
                jSONObject.put("timing_remoteIP", bVar.f26751a);
                jSONObject.put("request_log", bVar.f26774x);
            }
            jSONObject.put("download", bVar.f26776z);
        }
        if (C13281b.m26758a()) {
            jSONObject.put("netClientType", "CronetClient");
        } else {
            jSONObject.put("netClientType", "TTOkhttp3Client");
        }
        jSONObject.put("networkQuality", C9812c.m19639b().mo17652c().toString());
        jSONObject.put("downloadSpeed", (int) C9812c.m19639b().mo17653d());
        if (!z && th != null) {
            jSONObject.put("errorDesc", Log.getStackTraceString(th));
        }
        jSONObject.put("duration", j);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("uri", Uri.parse(str));
        }
        if (j2 > 0) {
            jSONObject.put("timestamp", j2);
        }
        int i = 200;
        if (!z) {
            i = C10201a.m20661a(th, strArr);
        }
        jSONObject.put("status", i);
        if (!TextUtils.isEmpty(strArr[0])) {
            jSONObject.put("ip", strArr[0]);
        }
        jSONObject.put("network_type", C9946b.m19991b(C11010c.m22280a().getApplicationContext()).getValue());
        return jSONObject;
    }
}

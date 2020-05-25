package com.p683ss.android.ugc.aweme.p1382aq.p1384b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.statisticlogger.C11063e;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.utils.C47831dv;
import com.p683ss.android.ugc.aweme.utils.C47832dw;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.aq.b.a */
public final class C23223a {

    /* renamed from: a */
    public static boolean f61960a = C47832dw.m103471a().mo95066a(C47831dv.VIDEO_REQ);

    /* renamed from: b */
    private static volatile long f61961b = -1;

    /* renamed from: c */
    private static volatile boolean f61962c = false;

    /* renamed from: a */
    public static boolean m57037a() {
        return f61960a;
    }

    /* renamed from: c */
    private static void m57039c() {
        C35807d.m80935a(C11010c.m22280a(), "ies_log_flag", 0).edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
    }

    /* renamed from: b */
    public static boolean m57038b() {
        long j;
        if (f61962c) {
            return true;
        }
        Context a = C11010c.m22280a();
        if (f61961b <= 0) {
            SharedPreferences a2 = C35807d.m80935a(a, "ies_log_flag", 0);
            String str = "first_install_time_key";
            if (C30578o.m71568b()) {
                j = -1;
            } else {
                j = 1;
            }
            long j2 = a2.getLong(str, j);
            f61961b = j2;
            if (j2 <= 0) {
                f61961b = System.currentTimeMillis();
                m57039c();
            }
        }
        if (f61961b + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!f61962c) {
            f61962c = true;
            C35807d.m80935a(a, "ies_log_flag", 0).edit().putLong("first_install_time_key", 1).apply();
        }
        return true;
    }

    /* renamed from: a */
    public static void m57035a(String str, JSONObject jSONObject) {
        m57036a(str, jSONObject, System.currentTimeMillis());
    }

    /* renamed from: a */
    public static void m57034a(String str, String str2, String str3) {
        if (!m57038b()) {
            C0013i.m16a((Callable<TResult>) new C23225c<TResult>(str, str2, str3, C11010c.m22280a()));
        }
    }

    /* renamed from: a */
    public static void m57036a(String str, JSONObject jSONObject, long j) {
        if (!m57038b()) {
            Context a = C11010c.m22280a();
            try {
                jSONObject.put("local_time", j / 1000);
            } catch (JSONException unused) {
            }
            m57033a(a, str, "low_retain", jSONObject);
        }
    }

    /* renamed from: a */
    private static void m57033a(Context context, String str, String str2, JSONObject jSONObject) {
        C0013i.m16a((Callable<TResult>) new C23226d<TResult>(jSONObject, str, str2, context));
    }

    /* renamed from: a */
    static final /* synthetic */ Object m57031a(JSONObject jSONObject, String str, String str2, Context context) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str3 = (String) keys.next();
                jSONObject2.put(str3, jSONObject.get(str3));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put("session_id", C11063e.m22389a());
        jSONObject2.put("scene", str2);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m57032a(JSONObject jSONObject, String str, String str2, String str3, Context context) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String str4 = (String) keys.next();
                jSONObject2.put(str4, jSONObject.get(str4));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put(str2, str3);
        jSONObject2.put("session_id", C11063e.m22389a());
        jSONObject2.put("scene", "low_retain");
        jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }
}

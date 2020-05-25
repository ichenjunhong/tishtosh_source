package com.p683ss.android.ugc.aweme.p1341an;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.ugc.aweme.experiment.ReportAsyncAB;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.an.a */
public final class C22574a {

    /* renamed from: a */
    public Map<String, Long> f60700a;

    /* renamed from: b */
    public Map<String, Long> f60701b;

    /* renamed from: c */
    public Map<String, Long> f60702c;

    /* renamed from: d */
    public boolean f60703d;

    /* renamed from: e */
    public boolean f60704e;

    /* renamed from: f */
    public boolean f60705f;

    /* renamed from: g */
    public volatile int f60706g;

    /* renamed from: h */
    public long f60707h;

    /* renamed from: i */
    public long f60708i;

    /* renamed from: j */
    public HashMap<String, Long> f60709j;

    /* renamed from: k */
    private boolean f60710k;

    /* renamed from: com.ss.android.ugc.aweme.an.a$a */
    public static class C22576a implements ActivityLifecycleCallbacks {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.an.a$b */
    static class C22577b {

        /* renamed from: a */
        public static final C22574a f60711a = new C22574a();
    }

    /* renamed from: f */
    public static C22574a m55738f() {
        return C22577b.f60711a;
    }

    /* renamed from: a */
    public final void mo46914a() {
        this.f60703d = false;
    }

    /* renamed from: b */
    public final void mo46919b() {
        this.f60710k = false;
    }

    /* renamed from: c */
    public static boolean m55736c() {
        return C23859b.m58575b().mo49460a(C11010c.m22280a(), "log_release_build_version_v4").isEmpty();
    }

    private C22574a() {
        this.f60700a = new ConcurrentHashMap();
        this.f60701b = new ConcurrentHashMap();
        this.f60702c = new ConcurrentHashMap();
        this.f60703d = true;
        this.f60704e = false;
        this.f60705f = false;
        this.f60706g = -1;
        this.f60710k = true;
        this.f60709j = new HashMap<>();
    }

    /* renamed from: e */
    public static boolean m55737e() {
        Context a = C11010c.m22280a();
        String e = C11010c.m22284e();
        String a2 = C23859b.m58575b().mo49460a(a, "log_release_build_version_v4");
        if (e.isEmpty()) {
            e = "default_version";
        }
        if (a2.equals(e)) {
            return false;
        }
        C23859b.m58575b().mo49465a(a, "log_release_build_version_v4", e);
        return true;
    }

    /* renamed from: g */
    private void m55739g() {
        HashMap<String, Long> hashMap = this.f60709j;
        if (hashMap != null && !hashMap.isEmpty()) {
            long j = 0;
            for (Entry value : hashMap.entrySet()) {
                j += ((Long) value.getValue()).longValue();
            }
            this.f60702c.put("load_sp_total", Long.valueOf(j));
        }
    }

    /* renamed from: d */
    public boolean mo46925d() {
        Long l = (Long) this.f60702c.get("cold_boot_application_to_main");
        if (l != null && l.longValue() > 1000) {
            return false;
        }
        Long l2 = (Long) this.f60702c.get("cold_boot_application_to_splash");
        if (l2 != null && l2.longValue() > 1000) {
            return false;
        }
        Long l3 = (Long) this.f60702c.get("cold_boot_splash_to_main");
        if (l3 != null && l3.longValue() > 1000) {
            return false;
        }
        Long l4 = (Long) this.f60702c.get("cold_boot_main_create_to_resume");
        if (l4 == null || l4.longValue() <= 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo46922b(String str) {
        if (this.f60702c.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo46918a(String str) {
        if (this.f60700a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo46923c(String str) {
        int i;
        boolean c = m55736c();
        m55739g();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        int i2 = 1;
        try {
            jSONObject.put("app2main5s", 1);
            if (!str.equals("first_feed_show_time_new_user") || (this.f60710k && mo46925d())) {
                for (Entry entry : this.f60702c.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            } else {
                jSONObject2.put("new_user_report_bad_case", 1);
            }
            String str2 = "cold_boot_use_cache";
            if (this.f60704e) {
                i = 1;
            } else {
                i = 2;
            }
            jSONObject2.put(str2, i);
            if (str.equals("first_feed_show_time_new_user_v4")) {
                i2 = 3;
            } else if (!c) {
                i2 = 2;
            }
            jSONObject2.put("is_new_user", i2);
            jSONObject2.put("convert_type", this.f60706g);
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", "1");
        } catch (JSONException unused) {
        }
        C9951d.m19998a(str, jSONObject4, jSONObject3);
        if (!c) {
            C9951d.m19998a("first_feed_show_time_v3_all", jSONObject4, jSONObject3);
        }
        if (C10181b.m20511a().mo18172a(ReportAsyncAB.class, true, "is_async_report_coldlog", 31744, true)) {
            C0013i.m16a((Callable<TResult>) new C22578b<TResult>(jSONObject2));
        } else {
            C18894a.m46006a("first_feed_show_time_v3", jSONObject2);
        }
    }

    /* renamed from: b */
    public final void mo46921b(String str, boolean z) {
        mo46920b(str, SystemClock.uptimeMillis(), z);
    }

    /* renamed from: a */
    public final void mo46917a(String str, boolean z) {
        mo46916a(str, SystemClock.uptimeMillis(), z);
    }

    /* renamed from: a */
    public final void mo46915a(String str, long j) {
        Long l = (Long) this.f60702c.get(str);
        if (l != null) {
            j += l.longValue();
        }
        this.f60702c.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo46916a(String str, long j, boolean z) {
        if (this.f60700a.get(str) != null) {
            if (z) {
                mo46914a();
            }
            return;
        }
        this.f60700a.put(str, Long.valueOf(j));
        if (z) {
            this.f60701b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo46920b(String str, long j, boolean z) {
        Long l = (Long) this.f60700a.get(str);
        if (l != null) {
            if (this.f60702c.get(str) == null) {
                this.f60702c.put(str, Long.valueOf(j - l.longValue()));
            }
            if (z) {
                this.f60701b.remove(str);
            }
        } else if (z) {
            mo46914a();
        } else {
            this.f60702c.put(str, Long.valueOf(0));
        }
    }

    /* renamed from: c */
    public final void mo46924c(String str, long j, boolean z) {
        if (this.f60702c.get(str) == null) {
            this.f60702c.put(str, Long.valueOf(j));
        }
    }
}

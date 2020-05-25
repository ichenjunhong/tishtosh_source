package com.bytedance.polaris.p821a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.polaris.C12552a;
import com.bytedance.polaris.browser.PolarisBrowserActivity;
import com.bytedance.polaris.p822b.C12571a;
import com.bytedance.polaris.p822b.C12571a.C12573a;
import com.bytedance.polaris.p822b.C12575b;
import com.bytedance.polaris.p825c.C12624b;
import com.bytedance.polaris.p826d.C12650p;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.a.i */
public final class C12563i {

    /* renamed from: a */
    public static Application f32943a;

    /* renamed from: b */
    public static C12559e f32944b;

    /* renamed from: c */
    public static C12557c f32945c;

    /* renamed from: d */
    public static C12561g f32946d;

    /* renamed from: e */
    public static C12560f f32947e;

    /* renamed from: f */
    public static C12569l f32948f;

    /* renamed from: g */
    public static boolean f32949g;

    /* renamed from: h */
    public static boolean f32950h;

    /* renamed from: i */
    public static WeakReference<Activity> f32951i;

    /* renamed from: j */
    public static ActivityLifecycleCallbacks f32952j = new ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
            if (activity != null) {
                C12563i.f32951i = new WeakReference<>(activity);
            }
            if (!TextUtils.isEmpty(C12563i.m25225g().mo23619d())) {
            }
        }
    };

    /* renamed from: a */
    public static Application m25215a() {
        return C12565j.m25230a();
    }

    /* renamed from: b */
    public static Application m25219b() {
        return f32943a;
    }

    /* renamed from: c */
    public static C12557c m25221c() {
        return C12565j.m25231b();
    }

    /* renamed from: d */
    public static C12557c m25222d() {
        return f32945c;
    }

    /* renamed from: e */
    public static C12561g m25223e() {
        return C12565j.m25232c();
    }

    /* renamed from: f */
    public static C12561g m25224f() {
        return f32946d;
    }

    /* renamed from: g */
    public static C12559e m25225g() {
        return C12565j.m25233d();
    }

    /* renamed from: h */
    public static C12559e m25226h() {
        return f32944b;
    }

    /* renamed from: i */
    public static boolean m25227i() {
        return f32949g;
    }

    /* renamed from: j */
    public static Activity m25228j() {
        if (f32951i == null) {
            return null;
        }
        return (Activity) f32951i.get();
    }

    /* renamed from: k */
    public static void m25229k() {
        if (!TextUtils.isEmpty(m25225g().mo23619d())) {
            C12552a.m25181a().mo23593b();
        }
    }

    /* renamed from: a */
    public static boolean m25218a(String str) {
        return C12650p.m25427e(str);
    }

    /* renamed from: b */
    public static String m25220b(String str) {
        C12559e g = m25225g();
        String str2 = "";
        if (g != null) {
            str2 = g.mo23621f();
        }
        if (!C12650p.m25425c(str2)) {
            str2 = "http://ib.snssdk.com";
        } else if (str2.endsWith("/")) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m25217a(String str, C12558d<JSONObject> dVar, JSONObject jSONObject) {
        C12571a c = C12571a.m25236c();
        m25225g();
        if (!c.f32982b.mo23618c()) {
            c.mo23632a(10003, null, null);
        }
        if (!C12575b.m25239a(c.f32983c)) {
            c.mo23632a(10008, null, null);
        }
        if (C12571a.m25235a()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (!TextUtils.isEmpty(str) && c.f32984d != null && c.f32984d.size() != 0 && c.f32984d.containsKey(str)) {
                j = ((Long) c.f32984d.get(str)).longValue();
            }
            if (currentTimeMillis < j) {
                c.mo23632a(10010, null, null);
                return;
            }
        }
        C9393e.submitRunnable(new C12573a(str, null, null));
    }

    /* renamed from: a */
    public static void m25216a(Context context, String str, boolean z) {
        String str2;
        if (!C9431p.m18664a(str) && context != null) {
            if (!C9431p.m18664a(str)) {
                Uri parse = Uri.parse(str);
                boolean c = C12650p.m25425c(str);
                if (c || m25218a(str)) {
                    if (c) {
                        str2 = str;
                    } else {
                        str2 = C12650p.m25416a(parse);
                    }
                    String b = C12650p.m25424b(str2);
                    if (c) {
                        str = b;
                    } else {
                        str = C12650p.m25417a(str, b);
                    }
                }
            }
            Uri parse2 = Uri.parse(str);
            if (C12650p.m25425c(str)) {
                Intent intent = new Intent(context, PolarisBrowserActivity.class);
                intent.addFlags(268435456);
                intent.setData(parse2);
                intent.putExtra("swipe_mode", C12650p.m25415a(parse2, "swipe_mode", 2));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                PolarisBrowserActivity.m25256a(intent, parse2);
                context.startActivity(intent);
                return;
            }
            if (m25218a(str)) {
                if (C12650p.m25426d(str)) {
                    C12556b bVar = null;
                    if (f32947e != null) {
                        bVar = f32947e.mo23623a(parse2);
                    }
                    if (bVar == null) {
                        bVar = new C12624b(parse2);
                    }
                    if (bVar != null) {
                        if (!(context == null || bVar == null)) {
                            m25225g();
                        }
                        String a = bVar.mo23597a();
                        if (!C9431p.m18664a(a)) {
                            parse2 = Uri.parse(a);
                        }
                    }
                }
                Intent a2 = PolarisBrowserActivity.m25255a(context, parse2);
                if (a2 != null) {
                    if (!(context instanceof Activity)) {
                        a2.addFlags(268435456);
                    }
                    context.startActivity(a2);
                }
            }
        }
    }
}

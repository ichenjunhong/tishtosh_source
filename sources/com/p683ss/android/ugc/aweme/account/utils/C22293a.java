package com.p683ss.android.ugc.aweme.account.utils;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1302o.C22089b;
import com.p683ss.android.ugc.aweme.account.util.C22265g;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.utils.a */
public final class C22293a {

    /* renamed from: a */
    public static final C22293a f60060a = new C22293a();

    /* renamed from: b */
    private static final boolean f60061b = false;

    private C22293a() {
    }

    /* renamed from: a */
    private static boolean m55178a() {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        boolean booleanValue = b.getKeepCookies().booleanValue() & C23826bi.m58466g();
        if (!C22298e.m55182a() || booleanValue) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m55177a(Context context) {
        if (context != null && m55178a()) {
            JSONObject b = C23088c.m56631a().mo47824a("enter_from", C31483a.f82385b).mo47825b();
            C52711k.m112236a((Object) b, "EventJsonBuilder.newBuil…_from\", \"normal\").build()");
            C22089b.m54868a("monitor_clear_cookie", 1, b);
            if (VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
            CookieManager a = C22265g.m55112a();
            if (a != null) {
                a.removeAllCookie();
                if (VERSION.SDK_INT >= 21) {
                    a.flush();
                    return;
                }
                CookieSyncManager.getInstance().sync();
            }
        }
    }
}

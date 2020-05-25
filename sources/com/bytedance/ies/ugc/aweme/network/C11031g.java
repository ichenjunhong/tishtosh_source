package com.bytedance.ies.ugc.aweme.network;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.p883a.C13258a;
import com.bytedance.ttnet.p887e.C13331f;
import com.bytedance.ttnet.p887e.C13331f.C13332a;
import com.p683ss.android.common.p1146d.C18894a;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.net.p1990c.C37751b;
import com.p683ss.android.ugc.aweme.network.C37819a;
import com.p683ss.android.ugc.aweme.network.C37834c;
import java.util.List;
import java.util.concurrent.Callable;
import org.chromium.C53702c;
import org.chromium.C53703d;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.ugc.aweme.network.g */
public final class C11031g {

    /* renamed from: a */
    static volatile boolean f29631a;

    /* renamed from: b */
    static C37819a f29632b;

    /* renamed from: c */
    static volatile boolean f29633c;

    /* renamed from: d */
    public static final C11031g f29634d = new C11031g();

    /* renamed from: e */
    private static final Object f29635e = new Object();

    /* renamed from: f */
    private static final List<String> f29636f = C52575l.m112099b((Object[]) new String[]{"MI PAD 2", "YT3-X90L", "YT3-X90F", "GT-810"});

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$a */
    static final class C11032a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37819a f29637a;

        /* renamed from: b */
        final /* synthetic */ C37834c f29638b;

        C11032a(C37819a aVar, C37834c cVar) {
            this.f29637a = aVar;
            this.f29638b = cVar;
        }

        public final /* synthetic */ Object call() {
            C13303d.m26802d();
            C11031g.f29634d.mo19931a(this.f29637a, this.f29638b);
            C11031g.m22345c();
            C37834c cVar = this.f29638b;
            if (cVar != null) {
                cVar.mo77267d(this.f29637a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.network.g$b */
    public static final class C11033b implements C13332a {
        C11033b() {
        }

        /* renamed from: a */
        public final void mo19933a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
            C52711k.m112240b(str, "tag");
            C52711k.m112240b(str2, "url");
            C52711k.m112240b(jSONObject, "extraJson");
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("tag", str);
                jSONObject2.put("url", str2);
                jSONObject2.put("value", i);
                jSONObject2.put("ext_value", z ? 1 : 0);
                jSONObject2.put("extraObject", jSONObject);
                C18894a.m46006a("set_cookie", jSONObject2);
            } catch (Throwable unused) {
            }
        }
    }

    private C11031g() {
    }

    /* renamed from: a */
    public static final C37819a m22343a() {
        return f29632b;
    }

    /* renamed from: c */
    public static void m22345c() {
        synchronized (f29635e) {
            f29631a = true;
            f29635e.notifyAll();
        }
    }

    /* renamed from: d */
    private static boolean m22346d() {
        if (VERSION.SDK_INT <= 19) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m22344b() {
        if (!f29631a) {
            synchronized (f29635e) {
                if (!f29631a) {
                    try {
                        f29635e.wait();
                        f29631a = true;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private static boolean m22347e() {
        List list;
        try {
            if (VERSION.SDK_INT == 18) {
                return true;
            }
            if (VERSION.SDK_INT < 21) {
                list = C52575l.m112092a(Build.CPU_ABI);
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                C52711k.m112236a((Object) strArr, "Build.SUPPORTED_ABIS");
                list = C52568f.m112068a(strArr);
            }
            if (!list.contains("x86")) {
                if (!list.contains("x86_64")) {
                    return false;
                }
            }
            new StringBuilder("Cronet unsupported CPU arch: ").append(list);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo19931a(C37819a aVar, C37834c cVar) {
        boolean z;
        C37819a aVar2 = aVar;
        C37834c cVar2 = cVar;
        if (cVar2 != null) {
            cVar2.mo77265b(aVar2);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C13303d.m26790a(((Number) aVar2.f96298n.mo77272a()).intValue());
        C13303d.m26796a(aVar2.f96286b);
        if (!m22346d() && C18920g.m46048a(aVar2.f96285a)) {
            C13303d.m26791a(0);
        }
        String b = C18920g.m46051b(aVar2.f96285a);
        boolean z2 = false;
        if (b == null || !C52830p.m112456b((CharSequence) b, (CharSequence) "miniapp", false, 2, (Object) null)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!m22346d()) {
                C13303d.m26791a(0);
            }
            C13303d.m26793a(aVar2.f96285a, aVar2.f96285a, new C37751b(), aVar2.f96295k, null, true, true);
        } else {
            C13303d.m26793a(aVar2.f96285a, aVar2.f96285a, new C37751b(), aVar2.f96295k, null, true, false);
        }
        try {
            if (m22347e() || f29636f.contains(Build.MODEL) || (z && VERSION.SDK_INT == 22)) {
                z2 = true;
            }
            if (z2) {
                C13258a.m26660a((Context) aVar2.f96285a);
                C13258a.m26669b(true);
            } else {
                C13258a.m26660a((Context) aVar2.f96285a);
                C13258a.m26670c(true);
            }
            C53703d.m114300a().setAdapter(aVar2.f96287c);
            C53702c.m114289a().mo112166a((Object) aVar2.f96287c);
            C13303d.m26804f();
            C13303d.m26797a(((Boolean) aVar2.f96297m.mo77272a()).booleanValue());
            f29633c = true;
        } catch (Throwable unused) {
        }
        C13331f.m26854a((C13332a) new C11033b());
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ttnet_init_time", elapsedRealtime2);
        } catch (JSONException unused2) {
        }
        C23569o.m57783b("ttnet_init_time", "", jSONObject);
        new StringBuilder("ttnet init cost time:").append(elapsedRealtime2);
        if (cVar2 != null) {
            cVar2.mo77266c(aVar2);
        }
    }
}

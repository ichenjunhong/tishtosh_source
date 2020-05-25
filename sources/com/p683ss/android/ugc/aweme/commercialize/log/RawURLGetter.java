package com.p683ss.android.ugc.aweme.commercialize.log;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.common.p520c.C9351b;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12696ac;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12710l;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.http.p1169a.C19170a;
import com.p683ss.android.http.p1169a.p1170a.C19174b;
import com.p683ss.android.http.p1169a.p1172b.C19176a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter */
public final class RawURLGetter {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68767a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RawURLGetter.class), "mRawApi", "getMRawApi()Lcom/ss/android/ugc/aweme/commercialize/log/RawURLGetter$RawUrlApi;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RawURLGetter.class), "newUa", "getNewUa()Ljava/lang/String;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(RawURLGetter.class), "sp", "getSp()Landroid/content/SharedPreferences;"))};

    /* renamed from: b */
    public static final RawURLGetter f68768b = new RawURLGetter();

    /* renamed from: c */
    private static final C52668f f68769c = C52732g.m112285a(C26028b.f68774a);

    /* renamed from: d */
    private static final C52668f f68770d = C52732g.m112285a(C26029c.f68775a);

    /* renamed from: e */
    private static final C52668f f68771e = C52732g.m112285a(C26030d.f68776a);

    /* renamed from: f */
    private static String f68772f;

    /* renamed from: g */
    private static boolean f68773g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$RawUrlApi */
    public interface RawUrlApi {
        @C12706h
        @C12696ac(mo23871a = "vas_ad_track")
        C17832m<String> doGet(@C12699af String str, @C12710l List<C12685b> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$a */
    public interface C26027a {
        /* renamed from: a */
        void mo53492a(int i, boolean z, Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$b */
    static final class C26028b extends C52712l implements C52670a<RawUrlApi> {

        /* renamed from: a */
        public static final C26028b f68774a = new C26028b();

        C26028b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RawUrlApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C18845b.f52040e).mo19926b(false).mo19925a().mo19930a(RawUrlApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$c */
    static final class C26029c extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C26029c f68775a = new C26029c();

        C26029c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            String a = RawURLGetter.m63082a(C11010c.m22280a(), (WebView) null);
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = System.getProperty("http.agent");
                if (a == null) {
                    return "";
                }
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$d */
    static final class C26030d extends C52712l implements C52670a<SharedPreferences> {

        /* renamed from: a */
        public static final C26030d f68776a = new C26030d();

        C26030d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            return inst.getSharePref();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$e */
    static final class C26031e<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f68777a;

        /* renamed from: b */
        final /* synthetic */ C26027a f68778b;

        C26031e(String str, C26027a aVar) {
            this.f68777a = str;
            this.f68778b = aVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            Iterable<C19170a> iterable;
            String a = RawURLGetter.m63083a("other");
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iterable = null;
            } else {
                iterable = C52575l.m112101c(new C19176a("User-Agent", a));
            }
            ArrayList arrayList = new ArrayList();
            if (iterable != null) {
                for (C19170a aVar : iterable) {
                    arrayList.add(new C12685b(aVar.mo39116a(), aVar.mo39117b()));
                }
            }
            try {
                RawURLGetter.f68768b.mo53488a().doGet(this.f68777a, arrayList).get();
                RawURLGetter.m63085a(this.f68778b, 200, true, null);
            } catch (C19174b e) {
                RawURLGetter.m63085a(this.f68778b, e.getStatusCode(), false, e);
            } catch (C9872a e2) {
                RawURLGetter.m63085a(this.f68778b, e2.getStatusCode(), false, e2);
            } catch (Exception e3) {
                RawURLGetter.m63085a(this.f68778b, 0, false, e3);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$f */
    static final class C26032f<T> implements C1710e<Boolean> {

        /* renamed from: a */
        public static final C26032f f68779a = new C26032f();

        C26032f() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Boolean bool = (Boolean) obj;
            C52711k.m112236a((Object) bool, "it");
            if (bool.booleanValue()) {
                C35857a.m81001b().mo74526a(new RawURLGetter$updateUa$1$1()).mo74527a();
            }
        }
    }

    private RawURLGetter() {
    }

    /* renamed from: d */
    public static final String m63087d() {
        return m63083a("other");
    }

    /* renamed from: a */
    public final RawUrlApi mo53488a() {
        return (RawUrlApi) f68769c.getValue();
    }

    /* renamed from: b */
    public final String mo53489b() {
        return (String) f68770d.getValue();
    }

    /* renamed from: c */
    public final SharedPreferences mo53490c() {
        return (SharedPreferences) f68771e.getValue();
    }

    /* renamed from: e */
    private static final void m63088e() {
        C11016e.m22309d().mo6545f((C1710e<? super T>) C26032f.f68779a);
    }

    /* renamed from: a */
    public static final String m63083a(String str) {
        boolean z;
        C52711k.m112240b(str, "from");
        String string = f68768b.mo53490c().getString("ad_user_agent_sp", null);
        CharSequence charSequence = string;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
            if (!C52711k.m112239a((Object) currentThread, (Object) mainLooper.getThread())) {
                SharedPreferences c = f68768b.mo53490c();
                C52711k.m112236a((Object) c, "sp");
                if (TextUtils.equals(str, C22858c.f61207c)) {
                    boolean z3 = c.getBoolean("ad_user_agent_has_read_sp", false);
                    c.edit().putBoolean("ad_user_agent_has_read_sp", true).apply();
                    if (!z3) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    String b = f68768b.mo53489b();
                    f68768b.mo53490c().edit().putString("ad_user_agent_sp", f68768b.mo53489b()).apply();
                    return b;
                }
            }
            String property = System.getProperty("http.agent");
            if (property == null) {
                property = "";
            }
            string = property;
        }
        String str2 = string;
        m63088e();
        return str2;
    }

    /* renamed from: a */
    public static final void m63086a(String str, C26027a aVar) {
        C52711k.m112240b(str, "url");
        C0013i.m18a((Callable<TResult>) new C26031e<TResult>(str, aVar), (Executor) C24076h.m58902c());
    }

    /* renamed from: a */
    public static String m63082a(Context context, WebView webView) {
        if (!C9431p.m18664a(f68772f)) {
            return f68772f;
        }
        String a = C9351b.m18530a(context);
        f68772f = a;
        if (!C9431p.m18664a(a)) {
            return f68772f;
        }
        if (!f68773g && context != null && (context instanceof Activity)) {
            f68773g = true;
            try {
                WebView webView2 = new WebView(context);
                WebSettings settings = webView2.getSettings();
                C52711k.m112236a((Object) settings, "webview.settings");
                f68772f = settings.getUserAgentString();
                webView2.destroy();
            } catch (Throwable unused) {
            }
        }
        return f68772f;
    }

    /* renamed from: a */
    public static void m63085a(C26027a aVar, int i, boolean z, Exception exc) {
        if (aVar != null) {
            try {
                aVar.mo53492a(i, z, exc);
            } catch (Exception unused) {
            }
        }
    }
}

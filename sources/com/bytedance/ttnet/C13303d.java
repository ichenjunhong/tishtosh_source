package com.bytedance.ttnet;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.p523c.C9389c;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9896b;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9900f;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9903i;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9905k;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9873b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c;
import com.bytedance.frameworks.baselib.network.http.p569b.C9852f;
import com.bytedance.frameworks.baselib.network.http.p569b.C9854g;
import com.bytedance.frameworks.baselib.network.http.p569b.C9854g.C9856a;
import com.bytedance.frameworks.baselib.network.http.p574e.C9912g;
import com.bytedance.retrofit2.C12795r;
import com.bytedance.ttnet.debug.C13319a;
import com.bytedance.ttnet.debug.C13320b;
import com.bytedance.ttnet.encrypt.C13343c;
import com.bytedance.ttnet.encrypt.TtTokenConfig;
import com.bytedance.ttnet.p883a.C13258a;
import com.bytedance.ttnet.p885c.C13297b;
import com.bytedance.ttnet.p886d.C13314c;
import com.bytedance.ttnet.p887e.C13325b;
import com.bytedance.ttnet.p887e.C13331f;
import com.bytedance.ttnet.p887e.C13331f.C13332a;
import com.p683ss.android.ugc.aweme.lancet.C18996q.C18997a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.io.File;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UnknownFormatConversionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53679x;
import okhttp3.C53679x.C53680a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.d */
public class C13303d {

    /* renamed from: a */
    public static C13295c f34698a = null;

    /* renamed from: b */
    public static boolean f34699b = true;

    /* renamed from: c */
    public static long f34700c = 0;

    /* renamed from: d */
    public static volatile boolean f34701d = false;

    /* renamed from: e */
    static volatile boolean f34702e = false;

    /* renamed from: f */
    public static volatile String f34703f = "";

    /* renamed from: g */
    private static volatile boolean f34704g = false;

    /* renamed from: h */
    private static volatile int f34705h = 10;

    /* renamed from: i */
    private static volatile Semaphore f34706i = new Semaphore(0);

    /* renamed from: j */
    private static volatile C13311a f34707j = C13311a.RELEASE;

    /* renamed from: k */
    private static volatile boolean f34708k = false;

    /* renamed from: l */
    private static long f34709l = 0;

    /* renamed from: m */
    private static long f34710m = 1500;

    /* renamed from: com.bytedance.ttnet.d$a */
    public enum C13311a {
        DEBUG,
        RELEASE
    }

    /* renamed from: a */
    public static C13311a m26788a() {
        return f34707j;
    }

    /* renamed from: a */
    public static void m26795a(Context context, boolean z) {
        C13321e.m26825a(context, z);
    }

    /* renamed from: f */
    public static void m26804f() throws Exception {
        m26805g();
    }

    /* renamed from: a */
    public static boolean m26798a(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        try {
            C9874c.m19754a(m26799b().mo24896a());
            if (C9874c.f26872b != null) {
                C9409b.m18609a((Object) C9874c.f26872b).mo17052a("tryStartNetDetect", (Class<?>[]) new Class[]{String[].class, Integer.TYPE, Integer.TYPE}, strArr, Integer.valueOf(10), Integer.valueOf(1));
                return true;
            }
            throw new UnsupportedOperationException("CronetEngine is not created.");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static void m26802d() {
        C9852f.f26819a = "ttnetCookieStore";
    }

    /* renamed from: b */
    public static C13295c m26799b() {
        if (f34698a != null) {
            return f34698a;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    /* renamed from: c */
    public static void m26801c() {
        if (f34698a != null && !f34708k) {
            f34708k = true;
        }
    }

    /* renamed from: h */
    private static void m26806h() {
        try {
            C9389c.m18569b().schedule(new Runnable() {
                public final void run() {
                    try {
                        System.currentTimeMillis();
                        C9894e.m19828b(true);
                        if (C9415i.m18635b()) {
                            System.currentTimeMillis();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, f34710m, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static C9873b m26803e() throws Exception {
        C9874c.m19754a(m26799b().mo24896a());
        C9874c.m19760a();
        int[] iArr = (int[]) C9409b.m18609a((Object) C9874c.f26872b).mo17054b("getNetworkQuality").f25654a;
        if (iArr.length == 3) {
            C9873b bVar = new C9873b();
            bVar.f26868a = iArr[0];
            bVar.f26869b = iArr[1];
            bVar.f26870c = iArr[2];
            return bVar;
        }
        throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
    }

    /* renamed from: g */
    public static C9874c m26805g() throws Exception {
        if (!C13281b.m26758a()) {
            return null;
        }
        C9874c a = C9874c.m19754a(m26799b().mo24896a());
        a.mo17790a(false, false, false, C13258a.m26660a(m26799b().mo24896a()).mo17793b());
        return a;
    }

    /* renamed from: a */
    public static void m26790a(int i) {
        f34705h = i;
    }

    /* renamed from: a */
    public static void m26791a(long j) {
        f34710m = 0;
    }

    /* renamed from: a */
    public static List<InetAddress> m26789a(String str) throws Exception {
        C9874c.m19754a(m26799b().mo24896a());
        if (C9874c.f26872b != null) {
            return (List) C9409b.m18609a((Object) C9874c.f26872b).mo17052a("dnsLookup", (Class<?>[]) new Class[]{String.class}, str).f25654a;
        }
        throw new UnsupportedOperationException("CronetEngine is not created.");
    }

    /* renamed from: a */
    public static void m26792a(Activity activity) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C24076h.m58902c().execute(new C18997a(activity));
            return;
        }
        if (activity != null) {
            C13258a.m26660a((Context) activity).mo24859k();
            C13258a.m26660a((Context) activity);
            C13258a.m26667b((Context) activity);
            if (f34704g) {
                TtTokenConfig.m26876a().mo24941e();
            }
        }
    }

    /* renamed from: a */
    public static void m26796a(C13295c cVar) {
        f34698a = cVar;
    }

    /* renamed from: a */
    public static void m26797a(boolean z) throws Exception {
        f34699b = z;
        if (m26805g() != null) {
            C9874c.m19760a();
            C9409b.m18609a((Object) C9874c.f26872b).mo17052a("setEnableURLDispatcher", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    private static void m26794a(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "failed");
            jSONObject.put("exception", str);
        } catch (JSONException unused) {
        }
        m26799b().mo24900a(context, "TTNET-COOKIE", "init", jSONObject);
    }

    /* renamed from: b */
    public static void m26800b(final Context context, final boolean z) {
        CookieManager cookieManager;
        try {
            f34709l = System.currentTimeMillis();
            if (z) {
                CookieSyncManager.createInstance(context);
                CookieManager.getInstance().setAcceptCookie(true);
                try {
                    CookieHandler cookieHandler = CookieHandler.getDefault();
                    if (cookieHandler != null && (cookieHandler instanceof C9854g)) {
                        m26806h();
                    } else if (f34709l <= 0) {
                        m26806h();
                    } else {
                        cookieManager = CookieManager.getInstance();
                        int i = f34705h;
                        m26799b();
                        C9854g gVar = new C9854g(context, i, cookieManager, null, new C9856a() {
                            /* renamed from: a */
                            public final void mo17701a(String str, String str2, JSONObject jSONObject) {
                                if (C13303d.f34702e) {
                                    C13303d.m26799b().mo24900a(context, str, str2, jSONObject);
                                }
                            }
                        });
                        CookieHandler.setDefault(gVar);
                        long currentTimeMillis = System.currentTimeMillis() - f34709l;
                        if (currentTimeMillis >= f34710m) {
                            C9894e.m19828b(true);
                            return;
                        }
                        C9894e.m19828b(false);
                        final long currentTimeMillis2 = System.currentTimeMillis();
                        C9389c.m18569b().schedule(new Runnable() {
                            public final void run() {
                                if (C9415i.m18635b()) {
                                    System.currentTimeMillis();
                                }
                                System.currentTimeMillis();
                                C9894e.m19828b(true);
                                if (C9415i.m18635b()) {
                                    System.currentTimeMillis();
                                }
                            }
                        }, f34710m - currentTimeMillis, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th) {
                    m26794a(context, th.getMessage());
                }
            } else {
                m26806h();
            }
        } catch (Throwable th2) {
            if (C9912g.m19864a(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C13303d.m26795a(context, z);
                    }
                });
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th2.getMessage());
                } catch (JSONException unused) {
                }
                if (f34698a != null) {
                    f34698a.mo24903a("async_init_cookie_manager_fail", jSONObject);
                }
                m26794a(context, th2.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m26793a(final Context context, Application application, C9896b<C13297b> bVar, C9905k<C13297b> kVar, C9900f fVar, boolean z, boolean... zArr) {
        boolean z2;
        if (context != null) {
            boolean z3 = false;
            if (C13311a.RELEASE != m26788a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && C13320b.m26824a(context)) {
                C13319a.m26821a();
            }
            C12795r.m25658a(C9415i.m18632a());
            C9894e.f26960e = bVar;
            C13297b.m26782b();
            boolean z4 = zArr[0];
            if (C9912g.m19864a(context)) {
                new C9393e("NetWork-AsyncInit", true) {
                    public final void run() {
                        C13303d.m26795a(context, true);
                        try {
                            C13325b a = C13325b.m26836a(context);
                            C9389c.m18569b().schedule(new Runnable() {
                                public final void run() {
                                    try {
                                        C13325b bVar = C13325b.this;
                                        if (!C13325b.f34769l.getAndSet(true)) {
                                            bVar.f34779j = C9894e.m19815a(bVar.f34779j, true);
                                            ArrayList arrayList = new ArrayList();
                                            ArrayList arrayList2 = new ArrayList();
                                            File file = new File(bVar.f34773d);
                                            if (file.exists() && file.isDirectory()) {
                                                File[] listFiles = file.listFiles();
                                                if (listFiles != null) {
                                                    int i = 0;
                                                    int i2 = 0;
                                                    for (File file2 : listFiles) {
                                                        if (file2.getName().contains(".dmp")) {
                                                            arrayList2.add(file2.getName());
                                                            arrayList.add(file2);
                                                            i2++;
                                                        }
                                                    }
                                                    if (i2 > bVar.f34775f) {
                                                        arrayList2.clear();
                                                        Collections.sort(arrayList, new C13327a());
                                                        Iterator it = arrayList.iterator();
                                                        while (it.hasNext()) {
                                                            File file3 = (File) it.next();
                                                            i++;
                                                            if (i <= bVar.f34775f) {
                                                                arrayList2.add(file3.getName());
                                                            } else {
                                                                C13325b.m26837a(file3.getAbsolutePath());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            Iterator it2 = arrayList2.iterator();
                                            while (it2.hasNext()) {
                                                String str = (String) it2.next();
                                                try {
                                                    if (C9425l.m18651b(bVar.f34780k)) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append(bVar.f34773d);
                                                        sb.append("/");
                                                        sb.append(str);
                                                        String sb2 = sb.toString();
                                                        if (new JSONObject(bVar.f34772c.mo111653b().mo111654a(bVar.f34776g, TimeUnit.SECONDS).mo111672c(bVar.f34777h, TimeUnit.SECONDS).mo111668b(bVar.f34778i, TimeUnit.SECONDS).mo111667a().mo111325a(new C53499a().mo111262a(bVar.f34779j).mo111265a((C53500ac) new C53680a().mo111648a(C53679x.f133173e).mo111646a("upfile", str, C53500ac.create(bVar.f34771b, new File(sb2))).mo111650a()).mo111272c()).mo111247b().f132404g.string()).getString("code").contentEquals("0")) {
                                                            C13325b.m26837a(sb2);
                                                        }
                                                    }
                                                } catch (Throwable unused) {
                                                }
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }, a.f34774e, TimeUnit.MILLISECONDS);
                        } catch (Throwable unused) {
                        }
                    }
                }.start();
            }
            C13314c.m26812a().mo24924a(context, C9912g.m19864a(context));
            String b = C9912g.m19865b(context);
            if (b != null && (b.endsWith(":push") || b.endsWith(":pushservice"))) {
                z3 = true;
            }
            if (z3 || (!C9912g.m19864a(context) && z4)) {
                m26795a(context, true);
                C13258a.m26660a(context).mo24859k();
                C13258a.m26660a(context).mo24857i();
                if (f34704g) {
                    C9894e.m19821a((C9903i) C13343c.m26893c());
                }
            }
            try {
                f34706i.release(99999999);
            } catch (Exception unused) {
            }
            if (C9912g.m19864a(context)) {
                C9894e.f26959d = null;
                C13258a.m26660a(context);
                if (f34704g) {
                    C9894e.m19821a((C9903i) C13343c.m26893c());
                }
                C9894e.f26961f = kVar;
                if (C13331f.f34790a == null) {
                    C13331f.m26854a((C13332a) new C13332a() {
                        /* renamed from: a */
                        public final void mo19933a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("url", str2);
                                jSONObject2.put("value", i);
                                jSONObject2.put("ext_value", z ? 1 : 0);
                                jSONObject2.put("extraObject", jSONObject);
                                C13303d.m26799b().mo24900a(context, "set_cookie", str, jSONObject2);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
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
                            C13303d.m26792a(activity);
                        }
                    });
                }
                if (!C13281b.m26758a()) {
                    m26801c();
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tryInitTTNet context is null");
    }
}

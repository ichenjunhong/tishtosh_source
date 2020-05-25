package com.p683ss.android.p1103ad.splash.core;

import android.text.TextUtils;
import com.p683ss.android.p1103ad.splash.C18558c;
import com.p683ss.android.p1103ad.splash.C18721d;
import com.p683ss.android.p1103ad.splash.C18757i;
import com.p683ss.android.p1103ad.splash.C18767n;
import com.p683ss.android.p1103ad.splash.C18769p;
import com.p683ss.android.p1103ad.splash.C18770q;
import com.p683ss.android.p1103ad.splash.C18771r;
import com.p683ss.android.p1103ad.splash.C18772s;
import com.p683ss.android.p1103ad.splash.C18775u;
import com.p683ss.android.p1103ad.splash.C18776v;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1115d.C18621a;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18629a;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18631b;
import com.p683ss.android.p1103ad.splash.core.p1117f.C18632c;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.p1103ad.splash.p1120d.C18722a;
import com.p683ss.android.p1103ad.splash.p1120d.C18723b;
import com.p683ss.android.p1103ad.splash.p1123g.C18735a;
import com.p683ss.android.p1103ad.splash.p1123g.C18741g;
import com.p683ss.android.p1103ad.splash.p1123g.C18746k;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.p1103ad.splash.p1123g.C18749n;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.r */
public class C18663r implements C18767n, C18769p, C18775u {

    /* renamed from: b */
    private static volatile C18663r f51578b;

    /* renamed from: a */
    public boolean f51579a;

    private C18663r() {
    }

    /* renamed from: a */
    public final void mo38101a() {
        C18642g.f51514j = System.currentTimeMillis();
        boolean z = true;
        C18642g.f51513i = true;
        C18723b a = C18723b.m45628a();
        if (System.currentTimeMillis() - a.f51799a <= 3600000) {
            z = false;
        }
        if (z && C18642g.m45187O() != null) {
            C18722a a2 = C18642g.m45187O().mo38337a();
            if (a2 != null) {
                a.f51799a = System.currentTimeMillis();
                C18673u a3 = C18673u.m45399a();
                a3.mo38177t().putString("key_splash_ad_rt_necessary_device_params", a2.toString()).apply();
                String str = a2.f51794a;
                String str2 = "";
                if (C18642g.m45227e() != null) {
                    str2 = C18642g.m45227e().mo38027c();
                }
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                if (!C18747l.m45742a(str)) {
                    C18673u.m45399a().mo38153c(str).mo38164h();
                }
            }
        }
        String str3 = "";
        if (C18642g.f51515k != null) {
            str3 = C18642g.m45227e().mo38027c();
        }
        if (!C18747l.m45742a(str3)) {
            C18673u.m45399a().mo38153c(str3).mo38164h();
        }
    }

    /* renamed from: a */
    public final C18775u mo38100a(boolean z, int i) {
        C18642g.f51525u = false;
        C18642g.f51519o = 0;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38099a(boolean z) {
        C18642g.f51511g = z;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38097a(String str, boolean z) {
        C18642g.f51526v = str;
        C18642g.f51528x = true;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38098a(JSONArray jSONArray, boolean z, int i) {
        if (jSONArray != null && jSONArray.length() > 0) {
            C18674v.m45443a().f51618e = jSONArray.length();
            C18674v.m45443a().mo38178a(-1);
            C18674v.m45443a().mo38179a(-1);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    new C18746k(jSONArray.getString(i2), false, i).executeOnExecutor(C18642g.m45247t(), new Void[0]);
                } catch (Throwable unused) {
                }
            }
        }
        return this;
    }

    /* renamed from: d */
    public final C18770q mo38111d() {
        m45319l();
        return new C18664s();
    }

    /* renamed from: f */
    public final C18559a mo38116f() {
        return C18628f.m45128a().mo38031b();
    }

    /* renamed from: g */
    public final void mo38121g() {
        C18665t.m45364a().mo38130b();
    }

    /* renamed from: h */
    public final int mo38122h() {
        return C18673u.m45399a().mo38172o();
    }

    /* renamed from: j */
    public static C18663r m45318j() {
        if (f51578b == null) {
            synchronized (C18663r.class) {
                if (f51578b == null) {
                    f51578b = new C18663r();
                }
            }
        }
        return f51578b;
    }

    /* renamed from: c */
    public final void mo38109c() {
        C18665t.m45364a().f51586a = 0;
    }

    /* renamed from: i */
    public final boolean mo38125i() {
        C18658n.m45272a();
        if (!C18673u.m45399a().mo38156d()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo38104b() {
        C18642g.f51510f = System.currentTimeMillis();
        C18642g.f51513i = false;
        for (WeakReference weakReference : new ArrayList(C18620d.f51413a)) {
            C18651h hVar = (C18651h) weakReference.get();
            if (hVar != null) {
                hVar.mo37895b();
            }
        }
        C18674v.m45443a().mo38178a(-1);
        C18642g.m45225d(false);
        C18642g.f51466D = null;
        C18642g.f51467E = -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final boolean mo38126k() {
        boolean z = false;
        if (!C18642g.m45213ac()) {
            C18735a.m45665b(0, "开屏 SDK 未启用");
            return false;
        }
        if (!C18642g.m45236i()) {
            C18735a.m45671d("开屏数据未加载好，无法展示广告");
            C18550a.m44899a().mo37843a("service_load_local_status_monitor", 1, (JSONObject) null);
        } else {
            z = true;
        }
        m45319l();
        return z;
    }

    /* renamed from: l */
    private static void m45319l() {
        int i = 0;
        try {
            if (C18642g.m45250w() == null) {
                i = 1;
                String str = "SplashNetWork为空！ 请在SplashAdManager中设置！";
                if (C18642g.m45226d()) {
                    C18749n.m45747a(str);
                }
                C18735a.m45671d(str);
            }
            if (C18642g.m45253z() == null) {
                i = 2;
                String str2 = "EventListener为空！ 请在SplashAdManager中设置！";
                if (C18642g.m45226d()) {
                    C18749n.m45747a(str2);
                }
                C18735a.m45671d(str2);
            }
            if (C18642g.m45252y() == null) {
                i = 3;
                String str3 = "SplashAdResourceLoader为空！ 请在SplashAdManager中设置！";
                if (C18642g.m45226d()) {
                    C18749n.m45747a(str3);
                }
                C18735a.m45671d(str3);
            }
            if (C18642g.m45251x() == null) {
                String str4 = "SplashAdPlatformSupportCallback为空！ 请在SplashAdManager中设置！";
                if (C18642g.m45226d()) {
                    C18749n.m45747a(str4);
                }
                C18735a.m45671d(str4);
            }
            if (i > 0) {
                C18550a.m44899a().mo37843a("service_sdk_engine_invalidate", i, (JSONObject) null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final boolean mo38115e() {
        if (!mo38126k()) {
            return false;
        }
        boolean z = true;
        C18602b a = C18658n.m45272a().mo38077a(true);
        C18674v.m45443a().mo38186g();
        if (a == null || !a.mo37977a()) {
            z = false;
        }
        if (z) {
            C18735a.m45661a(a.mo37863p(), "此次开屏挑选出来了广告");
            C18628f a2 = C18628f.m45128a();
            a2.f51441a = a;
            a2.f51442b = System.currentTimeMillis();
        } else {
            C18735a.m45667b("此次开屏没有挑选出广告");
            C18656m.m45265a().mo38073b();
            C18621a.m45104a();
        }
        C18642g.m45225d(false);
        return z;
    }

    /* renamed from: a */
    public final C18769p mo38087a(int i) {
        C18741g.f51827a = 2;
        return this;
    }

    /* renamed from: b */
    public final C18769p mo38102b(long j) {
        C18642g.f51470H = j;
        return this;
    }

    /* renamed from: c */
    public final C18769p mo38106c(long j) {
        C18642g.f51471I = j;
        return this;
    }

    /* renamed from: d */
    public final C18769p mo38110d(boolean z) {
        C18642g.f51468F = true;
        return this;
    }

    /* renamed from: e */
    public final C18769p mo38113e(boolean z) {
        C18642g.f51469G = z;
        return this;
    }

    /* renamed from: f */
    public final C18769p mo38117f(boolean z) {
        C18642g.f51465C = true;
        return this;
    }

    /* renamed from: g */
    public final C18769p mo38119g(boolean z) {
        C18642g.f51474L = z;
        return this;
    }

    /* renamed from: h */
    public final C18775u mo38123h(int i) {
        C18642g.f51530z = 1;
        return this;
    }

    /* renamed from: i */
    public final C18775u mo38124i(int i) {
        C18642g.f51463A = 1;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38089a(C18558c cVar) {
        C18642g.f51476N = cVar;
        return this;
    }

    /* renamed from: b */
    public final C18769p mo38103b(boolean z) {
        C18642g.f51516l = false;
        return this;
    }

    /* renamed from: c */
    public final C18769p mo38107c(boolean z) {
        C18642g.f51464B = z;
        return this;
    }

    /* renamed from: d */
    public final C18775u mo38112d(int i) {
        C18642g.f51518n = R.drawable.bc2;
        return this;
    }

    /* renamed from: e */
    public final C18775u mo38114e(int i) {
        C18642g.f51521q = R.string.dma;
        return this;
    }

    /* renamed from: f */
    public final C18775u mo38118f(int i) {
        C18642g.f51524t = R.drawable.bc3;
        return this;
    }

    /* renamed from: g */
    public final C18775u mo38120g(int i) {
        C18642g.f51522r = R.string.dm_;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38088a(long j) {
        if (j <= FbUploadTokenTime.group0) {
            j = 86400000;
        }
        C18642g.f51527w = j;
        return this;
    }

    /* renamed from: b */
    public final void mo38105b(int i) {
        C18642g.m45199a(i);
    }

    /* renamed from: c */
    public final C18775u mo38108c(int i) {
        C18642g.f51523s = R.style.mx;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38090a(C18629a aVar) {
        C18642g.f51475M = aVar;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38091a(C18631b bVar) {
        if (!(bVar == null || bVar == C18642g.f51517m)) {
            C18642g.f51517m = bVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38092a(C18721d dVar) {
        C18642g.f51478P = dVar;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38093a(C18757i iVar) {
        C18642g.f51489a = iVar;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38094a(C18771r rVar) {
        if (rVar != null) {
            C18642g.f51507c = rVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38095a(C18772s sVar) {
        C18642g.f51508d = sVar;
        return this;
    }

    /* renamed from: a */
    public final C18769p mo38096a(C18776v vVar) {
        C18642g.f51506b = vVar;
        C18631b H = C18642g.m45180H();
        if (H instanceof C18632c) {
            ((C18632c) H).mo38046a();
        }
        return this;
    }
}

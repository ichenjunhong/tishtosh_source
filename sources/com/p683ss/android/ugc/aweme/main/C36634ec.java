package com.p683ss.android.ugc.aweme.main;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.main.ec */
public final class C36634ec {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f93748a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C36634ec.class), "mPreferences", "getMPreferences()Lcom/ss/android/ugc/aweme/main/MainTabPreferences;"))};

    /* renamed from: b */
    private final C52668f f93749b = C52732g.m112286a(C52757k.SYNCHRONIZED, C36635a.f93750a);

    /* renamed from: com.ss.android.ugc.aweme.main.ec$a */
    static final class C36635a extends C52712l implements C52670a<C36606dx> {

        /* renamed from: a */
        public static final C36635a f93750a = new C36635a();

        C36635a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (C36606dx) C23393g.m57474a(AwemeApplication.m56199a(), C36606dx.class);
        }
    }

    /* renamed from: a */
    public final C36606dx mo75722a() {
        return (C36606dx) this.f93749b.getValue();
    }

    /* renamed from: b */
    public final boolean mo75726b() {
        try {
            return mo75722a().mo48530i(false);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: c */
    public final String mo75727c() {
        String str = "";
        try {
            String f = mo75722a().mo48524f("");
            C52711k.m112236a((Object) f, "mPreferences.getUnloginContentLanguage(\"\")");
            return f;
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    /* renamed from: d */
    public final boolean mo75729d() {
        try {
            return mo75722a().mo48531j(false);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo75730e() {
        try {
            return mo75722a().mo48534m(false);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
            return false;
        }
    }

    /* renamed from: f */
    public final String mo75731f() {
        String str = "";
        try {
            String h = mo75722a().mo48528h("");
            C52711k.m112236a((Object) h, "mPreferences.getConsumedFeedsForLocationPopup(\"\")");
            return h;
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
            return str;
        }
    }

    /* renamed from: b */
    public final void mo75725b(boolean z) {
        try {
            mo75722a().mo48532k(true);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: c */
    public final void mo75728c(boolean z) {
        try {
            mo75722a().mo48533l(true);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: a */
    public final void mo75723a(String str) {
        C52711k.m112240b(str, "contentLanguage");
        try {
            mo75722a().mo48522e(str);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
        }
    }

    /* renamed from: a */
    public final void mo75724a(boolean z) {
        try {
            mo75722a().mo48529h(z);
        } catch (Throwable th) {
            C9220a.m18312a(th, "MainTabPreferences AbstractMethodError");
        }
    }
}

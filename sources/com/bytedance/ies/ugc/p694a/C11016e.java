package com.bytedance.ies.ugc.p694a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2180b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.a.e */
public final class C11016e {

    /* renamed from: a */
    static final C2180b<C11017a> f29594a = C2180b.m6534l();

    /* renamed from: b */
    static final C2180b<Activity> f29595b = C2180b.m6534l();

    /* renamed from: c */
    static final C2180b<Activity> f29596c = C2180b.m6534l();

    /* renamed from: d */
    static final C2180b<Activity> f29597d = C2180b.m6534l();

    /* renamed from: e */
    public static final C2180b<Activity> f29598e = C2180b.m6534l();

    /* renamed from: f */
    static final C2180b<Activity> f29599f = C2180b.m6534l();

    /* renamed from: g */
    static final C2180b<C11017a> f29600g = C2180b.m6534l();

    /* renamed from: h */
    static final C2180b<Application> f29601h = C2180b.m6534l();

    /* renamed from: i */
    public static volatile long f29602i;

    /* renamed from: j */
    public static C11019c f29603j;

    /* renamed from: k */
    public static final C11016e f29604k = new C11016e();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C2180b<Boolean> f29605l = C2180b.m6534l();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static volatile boolean f29606m = true;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static volatile boolean f29607n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static int f29608o;

    /* renamed from: p */
    private static WeakReference<Activity> f29609p;

    /* renamed from: com.bytedance.ies.ugc.a.e$a */
    public static final class C11017a {

        /* renamed from: a */
        public final Activity f29610a;

        /* renamed from: b */
        public final Bundle f29611b;

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f29611b, (java.lang.Object) r3.f29611b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof com.bytedance.ies.ugc.p694a.C11016e.C11017a
                if (r0 == 0) goto L_0x001d
                com.bytedance.ies.ugc.a.e$a r3 = (com.bytedance.ies.ugc.p694a.C11016e.C11017a) r3
                android.app.Activity r0 = r2.f29610a
                android.app.Activity r1 = r3.f29610a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x001d
                android.os.Bundle r0 = r2.f29611b
                android.os.Bundle r3 = r3.f29611b
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.p694a.C11016e.C11017a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Activity activity = this.f29610a;
            int i = 0;
            int hashCode = (activity != null ? activity.hashCode() : 0) * 31;
            Bundle bundle = this.f29611b;
            if (bundle != null) {
                i = bundle.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivityEvent(activity=");
            sb.append(this.f29610a);
            sb.append(", bundle=");
            sb.append(this.f29611b);
            sb.append(")");
            return sb.toString();
        }

        public C11017a(Activity activity, Bundle bundle) {
            this.f29610a = activity;
            this.f29611b = bundle;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.a.e$b */
    public interface C11018b {
    }

    /* renamed from: com.bytedance.ies.ugc.a.e$c */
    public interface C11019c {
        /* renamed from: a */
        boolean mo19907a(Activity activity);
    }

    /* renamed from: com.bytedance.ies.ugc.a.e$d */
    public static final class C11020d implements ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ Application f29612a;

        public C11020d(Application application) {
            this.f29612a = application;
        }

        public final void onActivityResumed(Activity activity) {
            if (C11016e.m22300a() != null) {
                C11019c a = C11016e.m22300a();
                if (a == null) {
                    C52711k.m112234a();
                }
                if (a.mo19907a(activity)) {
                    C11016e.m22301a(activity);
                }
            }
            C11016e eVar = C11016e.f29604k;
            C11016e.f29596c.onNext(activity);
        }

        public final void onActivityDestroyed(Activity activity) {
            if (activity instanceof C11018b) {
                C11016e.f29607n = false;
            }
            C11016e eVar = C11016e.f29604k;
            C11016e.f29599f.onNext(activity);
            if (C11016e.f29608o == 0) {
                C11016e eVar2 = C11016e.f29604k;
                C11016e.f29601h.onNext(this.f29612a);
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (C11016e.m22300a() != null) {
                C11019c a = C11016e.m22300a();
                if (a == null) {
                    C52711k.m112234a();
                }
                if (a.mo19907a(activity)) {
                    C11016e.m22301a((Activity) null);
                }
            }
            C11016e eVar = C11016e.f29604k;
            C11016e.f29597d.onNext(activity);
        }

        public final void onActivityStarted(Activity activity) {
            C11016e eVar = C11016e.f29604k;
            C11016e.f29608o = C11016e.f29608o + 1;
            if (C11016e.f29608o == 1) {
                C11016e.f29606m = false;
                C11016e.f29605l.onNext(Boolean.valueOf(C11016e.f29606m));
            }
            C11016e eVar2 = C11016e.f29604k;
            C11016e.f29595b.onNext(activity);
        }

        public final void onActivityStopped(Activity activity) {
            C11016e eVar = C11016e.f29604k;
            C11016e.f29608o = C11016e.f29608o - 1;
            if (C11016e.f29608o == 0) {
                C11016e.f29606m = true;
                C11016e eVar2 = C11016e.f29604k;
                C11016e.f29602i = System.currentTimeMillis();
                C11016e.f29605l.onNext(Boolean.valueOf(C11016e.f29606m));
            }
            C11016e eVar3 = C11016e.f29604k;
            C11016e.f29598e.onNext(activity);
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C11016e eVar = C11016e.f29604k;
            C11016e.f29600g.onNext(new C11017a(activity, bundle));
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof C11018b) {
                C11016e.f29607n = true;
            }
            C11016e eVar = C11016e.f29604k;
            C11016e.f29594a.onNext(new C11017a(activity, bundle));
        }
    }

    private C11016e() {
    }

    /* renamed from: f */
    public static boolean m22311f() {
        return f29607n;
    }

    /* renamed from: h */
    public static boolean m22313h() {
        return f29606m;
    }

    /* renamed from: a */
    public static C11019c m22300a() {
        return f29603j;
    }

    /* renamed from: b */
    public static C2201v<Activity> m22304b() {
        C2201v<Activity> g = f29596c.mo6548g();
        C52711k.m112236a((Object) g, "activityResumedSubject.share()");
        return g;
    }

    /* renamed from: c */
    public static C2201v<Activity> m22308c() {
        C2201v<Activity> g = f29597d.mo6548g();
        C52711k.m112236a((Object) g, "activityPausedSubject.share()");
        return g;
    }

    /* renamed from: d */
    public static C2201v<Boolean> m22309d() {
        C2201v<Boolean> g = f29605l.mo6548g();
        C52711k.m112236a((Object) g, "appEnterBackgroundSubject.share()");
        return g;
    }

    /* renamed from: e */
    public static C2201v<Application> m22310e() {
        C2201v<Application> g = f29601h.mo6548g();
        C52711k.m112236a((Object) g, "appQuitSubject.share()");
        return g;
    }

    /* renamed from: g */
    public static Activity m22312g() {
        WeakReference<Activity> weakReference = f29609p;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public static void m22301a(Activity activity) {
        if (activity == null) {
            f29609p = null;
        } else {
            f29609p = new WeakReference<>(activity);
        }
    }
}

package com.bytedance.ies.bullet.p653ui.common;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.bytedance.ies.bullet.p628b.p629a.C10241d;
import com.bytedance.ies.bullet.p653ui.common.p655b.C10564a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.ui.common.BulletActivityWrapper */
public class BulletActivityWrapper implements C10577d {

    /* renamed from: a */
    private final WeakReference<Activity> f28036a;

    /* renamed from: b */
    private final List<C10564a> f28037b = new ArrayList();

    /* renamed from: com.bytedance.ies.bullet.ui.common.BulletActivityWrapper$BulletLifecycleObserver */
    static final class BulletLifecycleObserver implements C0183j {

        /* renamed from: a */
        public final WeakReference<BulletActivityWrapper> f28038a;

        /* renamed from: b */
        public final WeakReference<C0184k> f28039b;

        @C0200t(mo345a = C0177a.ON_PAUSE)
        public final void onPause() {
            if (((BulletActivityWrapper) this.f28038a.get()) != null) {
                BulletActivityWrapper bulletActivityWrapper = (BulletActivityWrapper) this.f28038a.get();
                if (bulletActivityWrapper != null) {
                    Activity a = bulletActivityWrapper.mo18708a();
                    if (a != null) {
                        bulletActivityWrapper.mo18672b(a);
                    }
                }
            }
        }

        @C0200t(mo345a = C0177a.ON_RESUME)
        public final void onResume() {
            if (((BulletActivityWrapper) this.f28038a.get()) != null) {
                BulletActivityWrapper bulletActivityWrapper = (BulletActivityWrapper) this.f28038a.get();
                if (bulletActivityWrapper != null) {
                    Activity a = bulletActivityWrapper.mo18708a();
                    if (a != null) {
                        bulletActivityWrapper.mo18671a(a);
                    }
                }
            }
        }

        @C0200t(mo345a = C0177a.ON_START)
        public final void onStart() {
            if (((BulletActivityWrapper) this.f28038a.get()) != null) {
                BulletActivityWrapper bulletActivityWrapper = (BulletActivityWrapper) this.f28038a.get();
                if (bulletActivityWrapper != null) {
                    Activity a = bulletActivityWrapper.mo18708a();
                    if (a != null) {
                        bulletActivityWrapper.mo18720d(a);
                    }
                }
            }
        }

        @C0200t(mo345a = C0177a.ON_STOP)
        public final void onStop() {
            if (((BulletActivityWrapper) this.f28038a.get()) != null) {
                BulletActivityWrapper bulletActivityWrapper = (BulletActivityWrapper) this.f28038a.get();
                if (bulletActivityWrapper != null) {
                    Activity a = bulletActivityWrapper.mo18708a();
                    if (a != null) {
                        bulletActivityWrapper.mo18721e(a);
                    }
                }
            }
        }

        @C0200t(mo345a = C0177a.ON_CREATE)
        public final void onCreate() {
            if (((BulletActivityWrapper) this.f28038a.get()) != null) {
                BulletActivityWrapper bulletActivityWrapper = (BulletActivityWrapper) this.f28038a.get();
                if (bulletActivityWrapper != null) {
                    Activity a = bulletActivityWrapper.mo18708a();
                    if (a != null) {
                        bulletActivityWrapper.mo18713a(a, (Bundle) null);
                    }
                }
            }
        }

        @C0200t(mo345a = C0177a.ON_DESTROY)
        public final void onDestroy() {
            if (((BulletActivityWrapper) this.f28038a.get()) != null) {
                BulletActivityWrapper bulletActivityWrapper = (BulletActivityWrapper) this.f28038a.get();
                if (bulletActivityWrapper != null) {
                    Activity a = bulletActivityWrapper.mo18708a();
                    if (a != null) {
                        bulletActivityWrapper.mo18722f(a);
                        C0184k kVar = (C0184k) this.f28039b.get();
                        if (kVar != null) {
                            C0176h lifecycle = kVar.getLifecycle();
                            if (lifecycle != null) {
                                lifecycle.mo325b(this);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo18715a(C10564a aVar) {
        C52711k.m112240b(aVar, "delegate");
        this.f28037b.add(aVar);
    }

    /* renamed from: c */
    private List<C10564a> m21244c() {
        return C52575l.m112138e((Iterable) this.f28037b);
    }

    /* renamed from: a */
    public final Activity mo18708a() {
        return (Activity) this.f28036a.get();
    }

    /* renamed from: b */
    public final void mo18716b() {
        Activity activity = (Activity) this.f28036a.get();
        if (activity != null) {
            activity.finish();
        }
    }

    public BulletActivityWrapper(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f28036a = new WeakReference<>(activity);
    }

    /* renamed from: b */
    public final void mo18718b(C10564a aVar) {
        C52711k.m112240b(aVar, "delegate");
        this.f28037b.remove(aVar);
    }

    /* renamed from: a */
    public final void mo18671a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        for (C10564a a : m21244c()) {
            try {
                a.mo18671a(activity);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo18672b(Activity activity) {
        C52711k.m112240b(activity, "activity");
        for (C10564a b : m21244c()) {
            try {
                b.mo18672b(activity);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo18720d(Activity activity) {
        C52711k.m112240b(activity, "activity");
        for (C10564a d : m21244c()) {
            try {
                d.mo18720d(activity);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: e */
    public final void mo18721e(Activity activity) {
        C52711k.m112240b(activity, "activity");
        for (C10564a e : m21244c()) {
            try {
                e.mo18721e(activity);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: f */
    public final void mo18722f(Activity activity) {
        C52711k.m112240b(activity, "activity");
        for (C10564a f : m21244c()) {
            try {
                f.mo18722f(activity);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: c */
    public final boolean mo18673c(Activity activity) {
        C52711k.m112240b(activity, "activity");
        for (C10564a c : m21244c()) {
            try {
                return c.mo18673c(activity);
            } catch (C10241d unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo18709a(int i, Intent intent) {
        C52711k.m112240b(intent, "data");
        Activity activity = (Activity) this.f28036a.get();
        if (activity != null) {
            activity.setResult(50000, intent);
        }
    }

    /* renamed from: c */
    public final void mo18719c(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        for (C10564a c : m21244c()) {
            try {
                c.mo18719c(activity, bundle);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo18717b(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        for (C10564a b : m21244c()) {
            try {
                b.mo18717b(activity, bundle);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo18712a(Activity activity, Configuration configuration) {
        C52711k.m112240b(activity, "activity");
        for (C10564a a : m21244c()) {
            try {
                a.mo18712a(activity, configuration);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo18713a(Activity activity, Bundle bundle) {
        C52711k.m112240b(activity, "activity");
        for (C10564a a : m21244c()) {
            try {
                a.mo18713a(activity, bundle);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo18714a(Activity activity, boolean z) {
        C52711k.m112240b(activity, "activity");
        for (C10564a a : m21244c()) {
            try {
                a.mo18714a(activity, z);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo18710a(Activity activity, int i, int i2, Intent intent) {
        C52711k.m112240b(activity, "activity");
        for (C10564a a : m21244c()) {
            try {
                a.mo18710a(activity, i, i2, intent);
            } catch (C10241d unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo18711a(Activity activity, int i, String[] strArr, int[] iArr) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(strArr, "permissions");
        C52711k.m112240b(iArr, "grantResults");
        for (C10564a a : m21244c()) {
            try {
                a.mo18711a(activity, i, strArr, iArr);
            } catch (C10241d unused) {
            }
        }
    }
}

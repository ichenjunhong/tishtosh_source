package com.p683ss.android.ugc.aweme.lego.p1914b;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35895e;
import com.p683ss.android.ugc.aweme.lego.LegoInflate;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.lego.b.a */
public final class C35884a {

    /* renamed from: a */
    public Context f92097a;

    /* renamed from: b */
    public final Map<Class<? extends Activity>, WeakReference<Activity>> f92098b = new HashMap();

    /* renamed from: c */
    private final Map<Class<? extends LegoInflate>, LegoInflate> f92099c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Map<Class<? extends LegoInflate>, LegoInflate> f92100d = new ConcurrentHashMap();

    /* renamed from: com.ss.android.ugc.aweme.lego.b.a$a */
    public final class C35885a implements ActivityLifecycleCallbacks {
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

        public C35885a() {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (activity != null) {
                C35884a.this.f92098b.remove(activity.getClass());
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity != null) {
                C35884a.this.f92098b.put(activity.getClass(), new WeakReference(activity));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo74541b(Class<? extends LegoInflate> cls) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        return this.f92099c.containsKey(cls);
    }

    /* renamed from: a */
    public final <T> T mo74539a(Class<? extends LegoInflate> cls) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        C52727e eVar = new C52727e();
        synchronized (this.f92099c) {
            eVar.element = (LegoInflate) this.f92099c.get(cls);
        }
        if (((LegoInflate) eVar.element) == null) {
            eVar.element = mo74542c(cls);
        }
        return (Object) ((LegoInflate) eVar.element);
    }

    /* renamed from: c */
    public final LegoInflate mo74542c(Class<? extends LegoInflate> cls) {
        LegoInflate legoInflate;
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        Object obj = this.f92100d.get(cls);
        if (obj == null) {
            C52711k.m112234a();
        }
        LegoInflate legoInflate2 = (LegoInflate) obj;
        synchronized (legoInflate2) {
            if (!this.f92099c.containsKey(cls)) {
                Context context = this.f92097a;
                if (context == null) {
                    C52711k.m112237a("context");
                }
                if (legoInflate2.theme() != 0) {
                    Context context2 = this.f92097a;
                    if (context2 == null) {
                        C52711k.m112237a("context");
                    }
                    context = new ContextThemeWrapper(context2, legoInflate2.theme());
                }
                WeakReference weakReference = (WeakReference) this.f92098b.get(legoInflate2.activity());
                Activity activity = null;
                if (weakReference != null) {
                    activity = (Activity) weakReference.get();
                }
                StringBuilder sb = new StringBuilder("inflate_");
                sb.append(legoInflate2.getClass().getSimpleName());
                String sb2 = sb.toString();
                C35895e a = C35857a.m80996a();
                if (a != null) {
                    a.mo47849a(sb2);
                }
                legoInflate2.inflate(context, activity);
                C35895e a2 = C35857a.m80996a();
                if (a2 != null) {
                    a2.mo47850b(sb2);
                }
                synchronized (this.f92099c) {
                    this.f92099c.put(cls, legoInflate2);
                }
            }
            Object obj2 = this.f92099c.get(cls);
            if (obj2 == null) {
                C52711k.m112234a();
            }
            legoInflate = (LegoInflate) obj2;
        }
        return legoInflate;
    }

    /* renamed from: a */
    public final void mo74540a(Class<? extends LegoInflate> cls, LegoInflate legoInflate) {
        C52711k.m112240b(cls, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(legoInflate, "inflate");
        if (!this.f92100d.containsKey(cls)) {
            this.f92100d.put(cls, legoInflate);
        }
    }
}

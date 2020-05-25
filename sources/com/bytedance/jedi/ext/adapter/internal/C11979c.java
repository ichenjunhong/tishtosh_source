package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.C0176h;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0654k.C0655a;
import android.support.p030v4.app.Fragment;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.c */
public final class C11979c extends Fragment {

    /* renamed from: c */
    public static final String f31696c = C11979c.class.getCanonicalName();

    /* renamed from: d */
    public static final C11980a f31697d = new C11980a(null);

    /* renamed from: a */
    public Fragment f31698a;

    /* renamed from: b */
    final Set<C52670a<C52860x>> f31699b = new LinkedHashSet();

    /* renamed from: e */
    private final Map<C0176h, C11982d> f31700e = new WeakHashMap();

    /* renamed from: f */
    private HashMap f31701f;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.c$a */
    public static final class C11980a {

        /* renamed from: com.bytedance.jedi.ext.adapter.internal.c$a$a */
        public static final class C11981a extends C0655a {

            /* renamed from: a */
            final /* synthetic */ C11979c f31702a;

            C11981a(C11979c cVar) {
                this.f31702a = cVar;
            }

            public final void onFragmentViewDestroyed(C0654k kVar, Fragment fragment) {
                C52711k.m112240b(kVar, "fm");
                C52711k.m112240b(fragment, "f");
                if (fragment == this.f31702a.f31698a) {
                    kVar.mo2228a((C0655a) this);
                    fragment.getChildFragmentManager().mo2225a().mo2177a((Fragment) this.f31702a).mo2200e();
                    C11979c cVar = this.f31702a;
                    for (C52670a invoke : cVar.f31699b) {
                        invoke.invoke();
                    }
                    cVar.f31699b.clear();
                }
            }
        }

        private C11980a() {
        }

        public /* synthetic */ C11980a(C52707g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            if (r3 == null) goto L_0x0008;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.bytedance.jedi.ext.adapter.internal.C11979c m24381a(android.support.p030v4.app.FragmentActivity r3, android.support.p030v4.app.Fragment r4) {
            /*
                if (r3 == 0) goto L_0x0008
                android.support.v4.app.k r3 = r3.getSupportFragmentManager()
                if (r3 != 0) goto L_0x0016
            L_0x0008:
                if (r4 != 0) goto L_0x000d
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x000d:
                android.support.v4.app.k r3 = r4.getChildFragmentManager()
                java.lang.String r0 = "fragment!!.childFragmentManager"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            L_0x0016:
                java.lang.String r0 = com.bytedance.jedi.ext.adapter.internal.C11979c.f31696c
                android.support.v4.app.Fragment r0 = r3.mo2224a(r0)
                boolean r1 = r0 instanceof com.bytedance.jedi.ext.adapter.internal.C11979c
                if (r1 != 0) goto L_0x0021
                r0 = 0
            L_0x0021:
                com.bytedance.jedi.ext.adapter.internal.c r0 = (com.bytedance.jedi.ext.adapter.internal.C11979c) r0
                if (r0 != 0) goto L_0x004f
                com.bytedance.jedi.ext.adapter.internal.c r0 = new com.bytedance.jedi.ext.adapter.internal.c
                r0.<init>()
                r0.f31698a = r4
                if (r4 == 0) goto L_0x003f
                android.support.v4.app.k r4 = r4.getFragmentManager()
                if (r4 == 0) goto L_0x003f
                com.bytedance.jedi.ext.adapter.internal.c$a$a r1 = new com.bytedance.jedi.ext.adapter.internal.c$a$a
                r1.<init>(r0)
                android.support.v4.app.k$a r1 = (android.support.p030v4.app.C0654k.C0655a) r1
                r2 = 0
                r4.mo2229a(r1, r2)
            L_0x003f:
                android.support.v4.app.r r3 = r3.mo2225a()
                r4 = r0
                android.support.v4.app.Fragment r4 = (android.support.p030v4.app.Fragment) r4
                java.lang.String r1 = com.bytedance.jedi.ext.adapter.internal.C11979c.f31696c
                android.support.v4.app.r r3 = r3.mo2178a(r4, r1)
                r3.mo2200e()
            L_0x004f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.internal.C11979c.C11980a.m24381a(android.support.v4.app.FragmentActivity, android.support.v4.app.Fragment):com.bytedance.jedi.ext.adapter.internal.c");
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f31701f != null) {
            this.f31701f.clear();
        }
    }

    /* renamed from: a */
    public final C11982d mo22719a(C0176h hVar) {
        C52711k.m112240b(hVar, "lifecycle");
        return (C11982d) this.f31700e.get(hVar);
    }

    /* renamed from: a */
    public final void mo22720a(C0176h hVar, C11982d dVar) {
        C52711k.m112240b(hVar, "lifecycle");
        C52711k.m112240b(dVar, "manager");
        this.f31700e.put(hVar, dVar);
    }
}

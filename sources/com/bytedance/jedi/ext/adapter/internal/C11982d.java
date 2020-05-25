package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.C0176h;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.internal.C11979c.C11980a;
import java.util.concurrent.CopyOnWriteArraySet;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.d */
public final class C11982d {

    /* renamed from: d */
    public static final C11984a f31703d = new C11984a(null);

    /* renamed from: a */
    public C11979c f31704a;

    /* renamed from: b */
    public C11978b f31705b;

    /* renamed from: c */
    public C11988g f31706c;

    /* renamed from: e */
    private final CopyOnWriteArraySet<C11944b> f31707e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    private final C0176h f31708f;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.d$a */
    public static final class C11984a {
        private C11984a() {
        }

        public /* synthetic */ C11984a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C11982d m24384a(C0176h hVar, C11979c cVar) {
            C11982d a = cVar.mo22719a(hVar);
            if (a != null) {
                return a;
            }
            C11982d dVar = new C11982d(hVar, cVar);
            cVar.mo22720a(hVar, dVar);
            return dVar;
        }

        /* renamed from: a */
        public final C11982d mo22723a(FragmentActivity fragmentActivity, Fragment fragment) {
            C11979c a = C11980a.m24381a(fragmentActivity, fragment);
            C0176h lifecycle = a.getLifecycle();
            C52711k.m112236a((Object) lifecycle, "proxyHost.lifecycle");
            return m24384a(lifecycle, a);
        }
    }

    /* renamed from: a */
    public final C11982d mo22721a(C11944b bVar) {
        C52711k.m112240b(bVar, "proxy");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) bVar;
        if (this.f31707e.add(jediViewHolderProxy)) {
            jediViewHolderProxy.f31682d = this;
            this.f31708f.mo324a(jediViewHolderProxy);
        }
        return this;
    }

    /* renamed from: b */
    public final C11982d mo22722b(C11944b bVar) {
        C52711k.m112240b(bVar, "proxy");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) bVar;
        this.f31708f.mo325b(jediViewHolderProxy);
        switch (C11985e.f31710a[this.f31708f.mo323a().ordinal()]) {
            case 2:
                if (!jediViewHolderProxy.f31683e) {
                    jediViewHolderProxy.onDestroy();
                    break;
                }
                break;
            case 3:
                jediViewHolderProxy.onDestroy();
                break;
            case 4:
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
                break;
            case 5:
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
                break;
        }
        jediViewHolderProxy.f31682d = null;
        this.f31707e.remove(jediViewHolderProxy);
        return this;
    }

    public C11982d(C0176h hVar, C11979c cVar) {
        C52711k.m112240b(hVar, "parentLifecycle");
        C52711k.m112240b(cVar, "host");
        this.f31708f = hVar;
        this.f31704a = cVar;
        C52670a r2 = new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ C11982d f31709a;

            {
                this.f31709a = r1;
            }

            public final /* synthetic */ Object invoke() {
                this.f31709a.f31704a = null;
                C11978b bVar = this.f31709a.f31705b;
                if (bVar != null) {
                    bVar.mo22717a();
                }
                C11988g gVar = this.f31709a.f31706c;
                if (gVar != null) {
                    gVar.mo22724a();
                }
                return C52860x.f131107a;
            }
        };
        C52711k.m112240b(r2, "listener");
        cVar.f31699b.add(r2);
    }
}

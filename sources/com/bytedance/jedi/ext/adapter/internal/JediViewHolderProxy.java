package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.C0174g;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11930q;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class JediViewHolderProxy implements C0183j, C11930q, C11944b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f31679a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(JediViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b */
    public JediViewHolder<? extends C11796d, ?> f31680b;

    /* renamed from: c */
    public boolean f31681c;

    /* renamed from: d */
    public C11982d f31682d;

    /* renamed from: e */
    public boolean f31683e;

    /* renamed from: f */
    private boolean f31684f = true;

    /* renamed from: g */
    private final C52668f<C0174g> f31685g = C52732g.m112285a(C11976b.f31689a);

    /* renamed from: h */
    private boolean f31686h;

    /* renamed from: i */
    private final C52668f f31687i = C52732g.m112285a(new C11975a(this));

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy$a */
    static final class C11975a extends C52712l implements C52670a<C0185l> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolderProxy f31688a;

        C11975a(JediViewHolderProxy jediViewHolderProxy) {
            this.f31688a = jediViewHolderProxy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0185l(this.f31688a);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy$b */
    static final class C11976b extends C52712l implements C52670a<C0174g> {

        /* renamed from: a */
        public static final C11976b f31689a = new C11976b();

        C11976b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0174g();
        }
    }

    /* renamed from: d */
    private final C0185l m24364d() {
        return (C0185l) this.f31687i.getValue();
    }

    /* renamed from: a */
    public final boolean mo22644a() {
        return this.f31684f;
    }

    /* renamed from: h */
    public final C0184k mo22626h() {
        return this;
    }

    public final C0176h getLifecycle() {
        return m24364d();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public JediViewHolder<? extends C11796d, ?> mo22645i() {
        if (this.f31681c) {
            return null;
        }
        return this.f31680b;
    }

    /* renamed from: b */
    public final C0174g mo22685b() {
        return (C0174g) this.f31685g.getValue();
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        this.f31683e = false;
        m24364d().mo332a(C0177a.ON_CREATE);
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void onStart() {
        if (mo22645i() != null) {
            mo22708a(true);
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void onStop() {
        if (mo22645i() != null) {
            mo22709b(true);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        m24364d().mo332a(C0177a.ON_DESTROY);
        if (this.f31685g.isInitialized()) {
            mo22685b().mo322b();
        }
        this.f31683e = true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Proxy@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append('(');
        sb.append("holder@");
        JediViewHolder<? extends C11796d, ?> jediViewHolder = this.f31680b;
        if (jediViewHolder != null) {
            str = Integer.toHexString(jediViewHolder.hashCode());
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",detached:");
        sb.append(this.f31681c);
        sb.append(",state:");
        sb.append(getLifecycle().mo323a());
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo22708a(boolean z) {
        this.f31684f = z;
        if (!z) {
            this.f31686h = true;
        }
        if (this.f31686h) {
            m24364d().mo332a(C0177a.ON_START);
        }
    }

    /* renamed from: b */
    public final void mo22709b(boolean z) {
        this.f31684f = z;
        m24364d().mo332a(C0177a.ON_STOP);
    }

    /* renamed from: a */
    public final void mo22707a(C11982d dVar, JediViewHolder<? extends C11796d, ?> jediViewHolder) {
        C52711k.m112240b(dVar, "manager");
        if (jediViewHolder != null) {
            this.f31680b = jediViewHolder;
            jediViewHolder.f31631d = this;
            this.f31681c = false;
            dVar.mo22721a(this);
            return;
        }
        this.f31680b = null;
        JediViewHolder<? extends C11796d, ?> jediViewHolder2 = this.f31680b;
        if (jediViewHolder2 != null) {
            jediViewHolder2.f31631d = null;
        }
    }
}

package com.p683ss.android.ugc.aweme.effect.p1676e.p1678b;

import com.p683ss.android.ugc.aweme.effect.p1676e.p1677a.C29190b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.e.b.b */
public abstract class C29192b<Param, Target> {

    /* renamed from: a */
    public int f76492a;

    /* renamed from: b */
    public boolean f76493b;

    /* renamed from: c */
    public AtomicBoolean f76494c = new AtomicBoolean(false);

    /* renamed from: d */
    public Target f76495d;

    /* renamed from: e */
    public C29195e f76496e;

    /* renamed from: f */
    public String f76497f;

    /* renamed from: g */
    public Param f76498g;

    /* renamed from: h */
    private AtomicInteger f76499h = new AtomicInteger(-1);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo59082a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo59084b(C29190b<Param, Target> bVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo59085c(C29190b<Param, Target> bVar) {
        C52711k.m112240b(bVar, "callback");
    }

    /* renamed from: b */
    public final int mo59083b() {
        return this.f76499h.get();
    }

    /* renamed from: a */
    public final void mo59080a(int i) {
        this.f76499h.set(i);
    }

    /* renamed from: a */
    public final void mo59081a(C29190b<Param, Target> bVar) {
        C52711k.m112240b(bVar, "callback");
        if (!this.f76494c.get()) {
            this.f76494c.set(true);
            bVar.mo59062a(this);
        }
        if (mo59082a()) {
            mo59080a(3);
            mo59085c(bVar);
            bVar.mo59067b(this);
            return;
        }
        mo59080a(2);
        mo59084b(bVar);
    }

    public C29192b(String str, Param param) {
        C52711k.m112240b(str, "mTaskId");
        this.f76497f = str;
        this.f76498g = param;
        mo59080a(0);
    }
}

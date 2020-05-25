package com.p683ss.android.ugc.asve.sandbox.p1252c;

import com.p683ss.android.ugc.asve.context.C20362g;
import com.p683ss.android.ugc.asve.recorder.reaction.C20531a;
import com.p683ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p683ss.android.ugc.asve.sandbox.C20752d;
import com.p683ss.android.ugc.asve.sandbox.C20794k;
import java.lang.reflect.Proxy;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.e */
public final class C20751e implements C20531a {

    /* renamed from: a */
    private final C20794k f56635a;

    /* renamed from: b */
    private final C20362g f56636b;

    /* renamed from: a */
    public final C20362g mo43569a() {
        return this.f56636b;
    }

    /* renamed from: b */
    public final float mo43572b() {
        return this.f56635a.mo44076a();
    }

    /* renamed from: c */
    public final int[] mo43574c() {
        return this.f56635a.mo44080b();
    }

    /* renamed from: d */
    public final int[] mo43575d() {
        return this.f56635a.mo44081c();
    }

    /* renamed from: e */
    public final void mo43576e() {
        this.f56635a.mo44082d();
    }

    /* renamed from: g */
    public final void mo43578g() {
        this.f56635a.mo44084f();
    }

    /* renamed from: f */
    public final ReactionWindowInfo mo43577f() {
        ReactionWindowInfo e = this.f56635a.mo44083e();
        C52711k.m112236a((Object) e, "safeRemoteReactionController.currentWindowInfo");
        return e;
    }

    /* renamed from: a */
    public final void mo43570a(float f) {
        this.f56635a.mo44077a(f);
    }

    /* renamed from: a */
    public final void mo43571a(int i, int i2) {
        this.f56635a.mo44078a(i, i2);
    }

    /* renamed from: b */
    public final boolean mo43573b(int i, int i2) {
        return this.f56635a.mo44079b(i, i2);
    }

    public C20751e(C20794k kVar, C20362g gVar) {
        C52711k.m112240b(gVar, "reactionContext");
        this.f56636b = gVar;
        Object newProxyInstance = Proxy.newProxyInstance(C20794k.class.getClassLoader(), new Class[]{C20794k.class}, new C20752d(kVar));
        if (newProxyInstance != null) {
            this.f56635a = (C20794k) newProxyInstance;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteReactionService");
    }
}

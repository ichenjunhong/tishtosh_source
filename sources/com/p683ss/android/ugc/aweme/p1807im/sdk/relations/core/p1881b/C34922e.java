package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b;

import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.b.e */
public abstract class C34922e<R> {

    /* renamed from: h */
    protected C34920d<R> f89916h;

    public abstract void bp_();

    public abstract void bq_();

    /* renamed from: d */
    public abstract boolean mo73027d();

    /* renamed from: e */
    public abstract boolean mo73028e();

    /* renamed from: b */
    public boolean mo73016b() {
        if (this.f89916h != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73035a(C34920d<R> dVar) {
        C52711k.m112240b(dVar, "<set-?>");
        this.f89916h = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73036a(Throwable th, boolean z) {
        C52711k.m112240b(th, "t");
        if (z) {
            C34920d<R> dVar = this.f89916h;
            if (dVar == null) {
                C52711k.m112237a("loadSubscriber");
            }
            dVar.mo72986b(th);
            return;
        }
        C34920d<R> dVar2 = this.f89916h;
        if (dVar2 == null) {
            C52711k.m112237a("loadSubscriber");
        }
        dVar2.mo72983a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73037a(List<R> list, boolean z) {
        C52711k.m112240b(list, "list");
        if (z) {
            C34920d<R> dVar = this.f89916h;
            if (dVar == null) {
                C52711k.m112237a("loadSubscriber");
            }
            dVar.mo72987b(list, mo73028e());
            return;
        }
        C34920d<R> dVar2 = this.f89916h;
        if (dVar2 == null) {
            C52711k.m112237a("loadSubscriber");
        }
        dVar2.mo72984a(list, mo73028e());
    }
}

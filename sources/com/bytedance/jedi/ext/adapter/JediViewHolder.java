package com.bytedance.jedi.ext.adapter;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0200t;
import android.view.View;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11788aa;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11797e;
import com.bytedance.jedi.arch.C11797e.C11798a;
import com.bytedance.jedi.arch.C11910j;
import com.bytedance.jedi.arch.C11931r;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11934u;
import com.bytedance.jedi.arch.C11937x;
import com.bytedance.jedi.arch.C11938y;
import com.bytedance.jedi.arch.C11939z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.C11978b;
import com.bytedance.jedi.ext.adapter.internal.C11986f;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import java.util.List;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2648k.C52771j;

public abstract class JediViewHolder<R extends C11796d, ITEM> extends C11949e<ITEM> implements C0183j, C0184k, C11974i<R> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f31628a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(JediViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroid/arch/lifecycle/LifecycleRegistry;"))};

    /* renamed from: b */
    public C0184k f31629b;

    /* renamed from: c */
    public C11986f f31630c;

    /* renamed from: d */
    public JediViewHolderProxy f31631d;

    /* renamed from: e */
    public boolean f31632e;

    /* renamed from: f */
    private final C52668f f31633f = C52732g.m112285a(new C11940a(this));

    /* renamed from: com.bytedance.jedi.ext.adapter.JediViewHolder$a */
    static final class C11940a extends C52712l implements C52670a<C0185l> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f31634a;

        C11940a(JediViewHolder jediViewHolder) {
            this.f31634a = jediViewHolder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0185l(this.f31634a);
        }
    }

    /* renamed from: t */
    private final C0185l mo58381t() {
        return (C0185l) this.f31633f.getValue();
    }

    /* renamed from: a */
    public final void mo22665a(ITEM item, int i) {
    }

    /* renamed from: a */
    public void mo22664a(List<Object> list) {
    }

    /* renamed from: e */
    public final void mo22670e() {
        mo22671g();
    }

    /* renamed from: f */
    public final boolean mo22555f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo22671g() {
    }

    /* renamed from: j */
    public void mo22674j() {
    }

    /* renamed from: k */
    public void mo22675k() {
    }

    /* renamed from: l */
    public void mo22676l() {
    }

    /* renamed from: m */
    public void mo22677m() {
    }

    /* renamed from: b */
    public final C11944b mo22666b() {
        return this.f31631d;
    }

    public C0176h getLifecycle() {
        return mo58381t();
    }

    /* renamed from: s */
    private final C11978b mo58380s() {
        C11986f fVar = this.f31630c;
        if (fVar == null) {
            C52711k.m112237a("provider");
        }
        return fVar.f31712b;
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void destroy$ext_adapter_release() {
        mo22677m();
        mo58382u();
        mo58381t().mo332a(C0177a.ON_DESTROY);
    }

    /* renamed from: n */
    public final C0184k mo22678n() {
        C0184k kVar = this.f31629b;
        if (kVar == null) {
            C52711k.m112237a("parent");
        }
        return kVar;
    }

    /* renamed from: u */
    private final void mo58382u() {
        C0184k kVar = this.f31629b;
        if (kVar == null) {
            C52711k.m112237a("parent");
        }
        kVar.getLifecycle().mo325b(this);
        mo78991v();
    }

    /* renamed from: c */
    public final C11910j mo22553c() {
        C11944b b = mo22666b();
        if (b != null) {
            return b;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.LifecycleOwnerHolder");
    }

    /* renamed from: d */
    public final C11931r<R> mo22554d() {
        C11944b b = mo22666b();
        if (b != null) {
            return b;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.ReceiverHolder<VH>");
    }

    /* renamed from: i */
    public void mo22673i() {
        super.mo22673i();
        JediViewHolderProxy jediViewHolderProxy = this.f31631d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31680b) {
            jediViewHolderProxy.f31681c = true;
        }
        mo78991v();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void pause$ext_adapter_release() {
        if (this.f31632e) {
            mo22676l();
            mo58381t().mo332a(C0177a.ON_PAUSE);
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void resume$ext_adapter_release() {
        if (this.f31632e) {
            mo22675k();
            mo58381t().mo332a(C0177a.ON_RESUME);
        }
    }

    @C0200t(mo345a = C0177a.ON_START)
    public final void start$ext_adapter_release() {
        if (this.f31632e) {
            mo58381t().mo332a(C0177a.ON_START);
            JediViewHolderProxy jediViewHolderProxy = this.f31631d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31680b) {
                jediViewHolderProxy.mo22708a(false);
            }
        }
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public final void stop$ext_adapter_release() {
        if (this.f31632e) {
            mo58381t().mo332a(C0177a.ON_STOP);
            JediViewHolderProxy jediViewHolderProxy = this.f31631d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31680b) {
                jediViewHolderProxy.mo22709b(false);
            }
        }
    }

    /* renamed from: v */
    private final void mo78991v() {
        switch (C11970f.f31673b[getLifecycle().mo323a().ordinal()]) {
            case 1:
                pause$ext_adapter_release();
                break;
            case 2:
            case 3:
                break;
        }
        stop$ext_adapter_release();
        this.f31632e = false;
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void create$ext_adapter_release() {
        boolean z;
        C11978b s = mo58380s();
        int i = this.f31643i;
        if (i < 0 || i >= s.f31695a.size()) {
            z = false;
        } else {
            z = ((Boolean) s.f31695a.get(i)).booleanValue();
        }
        if (!z) {
            mo22674j();
            mo58380s().mo22718a(this.f31643i, true);
            mo58381t().mo332a(C0177a.ON_CREATE);
        }
    }

    /* renamed from: h */
    public void mo22672h() {
        super.mo22672h();
        JediViewHolderProxy jediViewHolderProxy = this.f31631d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f31680b) {
            jediViewHolderProxy.f31681c = false;
        }
        this.f31632e = true;
        switch (C11970f.f31672a[getLifecycle().mo323a().ordinal()]) {
            case 1:
                return;
            case 2:
                start$ext_adapter_release();
                resume$ext_adapter_release();
                return;
            case 3:
                resume$ext_adapter_release();
                return;
            default:
                return;
        }
    }

    public JediViewHolder(View view) {
        C52711k.m112240b(view, "view");
        super(view);
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11932s, R> R mo22552a(VM1 vm1, C52671b<? super S1, ? extends R> bVar) {
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        C52711k.m112240b(vm1, "viewModel1");
        C52711k.m112240b(bVar, "block");
        return C11798a.m24156a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11932s> C1690c mo22546a(JediViewModel<S> jediViewModel, C11934u<S> uVar, C52682m<? super R, ? super S, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C52711k.m112240b(jediViewModel, "$this$subscribe");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11798a.m24146a(this, jediViewModel, uVar, mVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22667b(ITEM r6, int r7, java.util.List<java.lang.Object> r8) {
        /*
            r5 = this;
            super.mo22667b(r6, r7, r8)
            r6 = 0
            r0 = 1
            if (r8 == 0) goto L_0x0043
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0018
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0041
        L_0x0018:
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r1.next()
            boolean r4 = r2 instanceof p2628d.C52847n
            if (r4 != 0) goto L_0x002b
            r2 = r6
        L_0x002b:
            d.n r2 = (p2628d.C52847n) r2
            if (r2 == 0) goto L_0x0034
            java.lang.Object r2 = r2.getSecond()
            goto L_0x0035
        L_0x0034:
            r2 = r6
        L_0x0035:
            java.lang.Object r4 = com.bytedance.jedi.ext.adapter.C11963d.m24352a()
            if (r2 != r4) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x001c
            r3 = 1
        L_0x0041:
            if (r3 != 0) goto L_0x00b3
        L_0x0043:
            r5.f31632e = r0
            r5.mo58382u()
            com.bytedance.jedi.ext.adapter.internal.f r1 = r5.f31630c
            if (r1 != 0) goto L_0x0051
            java.lang.String r2 = "provider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0051:
            com.bytedance.jedi.ext.adapter.internal.g r2 = r1.f31713c
            if (r7 < 0) goto L_0x0066
            java.util.List<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r3 = r2.f31716a
            int r3 = r3.size()
            if (r7 >= r3) goto L_0x0066
            java.util.List<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r2 = r2.f31716a
            java.lang.Object r2 = r2.get(r7)
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r2 = (com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy) r2
            goto L_0x0067
        L_0x0066:
            r2 = r6
        L_0x0067:
            if (r2 != 0) goto L_0x0076
            d.f.a.a<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r2 = r1.f31711a
            java.lang.Object r2 = r2.invoke()
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r2 = (com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy) r2
            com.bytedance.jedi.ext.adapter.internal.g r1 = r1.f31713c
            r1.mo22725a(r7, r2)
        L_0x0076:
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r7 = r5.f31631d
            if (r2 == r7) goto L_0x0090
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r7 = r5.f31631d
            if (r7 == 0) goto L_0x0090
            com.bytedance.jedi.ext.adapter.JediViewHolder<? extends com.bytedance.jedi.arch.d, ?> r1 = r7.f31680b
            if (r5 != r1) goto L_0x0090
            com.bytedance.jedi.ext.adapter.internal.f r1 = r5.f31630c
            if (r1 != 0) goto L_0x008b
            java.lang.String r3 = "provider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x008b:
            com.bytedance.jedi.ext.adapter.internal.d r1 = r1.f31714d
            r7.mo22707a(r1, r6)
        L_0x0090:
            com.bytedance.jedi.ext.adapter.internal.f r6 = r5.f31630c
            if (r6 != 0) goto L_0x0099
            java.lang.String r7 = "provider"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x0099:
            com.bytedance.jedi.ext.adapter.internal.d r6 = r6.f31714d
            r2.mo22707a(r6, r5)
            r5.f31632e = r0
            android.arch.lifecycle.k r6 = r5.f31629b
            if (r6 != 0) goto L_0x00a9
            java.lang.String r7 = "parent"
            p2628d.p2639f.p2641b.C52711k.m112237a(r7)
        L_0x00a9:
            android.arch.lifecycle.h r6 = r6.getLifecycle()
            r7 = r5
            android.arch.lifecycle.j r7 = (android.arch.lifecycle.C0183j) r7
            r6.mo324a(r7)
        L_0x00b3:
            r5.mo22664a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.JediViewHolder.mo22667b(java.lang.Object, int, java.util.List):void");
    }

    /* renamed from: a */
    public final <S extends C11932s, A> C1690c mo22547a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C11934u<C11937x<A>> uVar, C52682m<? super R, ? super A, C52860x> mVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(mVar, "subscriber");
        return C11798a.m24148a(this, jediViewModel, jVar, uVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B> C1690c mo22549a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C11934u<C11938y<A, B>> uVar, C52686q<? super R, ? super A, ? super B, C52860x> qVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(qVar, "subscriber");
        return C11798a.m24152a((C11797e<? extends RECEIVER>) this, jediViewModel, jVar, jVar2, uVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, T> C1690c mo22548a(JediViewModel<S> jediViewModel, C52771j<S, ? extends C11787a<? extends T>> jVar, C11934u<C11937x<C11787a<T>>> uVar, C52682m<? super R, ? super Throwable, C52860x> mVar, C52671b<? super R, C52860x> bVar, C52682m<? super R, ? super T, C52860x> mVar2) {
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(jediViewModel, "$this$asyncSubscribe");
        C52711k.m112240b(jVar, "prop");
        C52711k.m112240b(uVar, "config");
        return C11798a.m24150a((C11797e<? extends RECEIVER>) this, jediViewModel, jVar, uVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C> C1690c mo22550a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C11934u<C11939z<A, B, C>> uVar, C52687r<? super R, ? super A, ? super B, ? super C, C52860x> rVar) {
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(rVar, "subscriber");
        return C11798a.m24154a((C11797e<? extends RECEIVER>) this, jediViewModel, jVar, jVar2, jVar3, uVar, rVar);
    }

    /* renamed from: a */
    public final <S extends C11932s, A, B, C, D> C1690c mo22551a(JediViewModel<S> jediViewModel, C52771j<S, ? extends A> jVar, C52771j<S, ? extends B> jVar2, C52771j<S, ? extends C> jVar3, C52771j<S, ? extends D> jVar4, C11934u<C11788aa<A, B, C, D>> uVar, C52688s<? super R, ? super A, ? super B, ? super C, ? super D, C52860x> sVar) {
        JediViewModel<S> jediViewModel2 = jediViewModel;
        C52771j<S, ? extends A> jVar5 = jVar;
        C52771j<S, ? extends B> jVar6 = jVar2;
        C52771j<S, ? extends C> jVar7 = jVar3;
        C52771j<S, ? extends D> jVar8 = jVar4;
        C11934u<C11788aa<A, B, C, D>> uVar2 = uVar;
        C52688s<? super R, ? super A, ? super B, ? super C, ? super D, C52860x> sVar2 = sVar;
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        C52711k.m112240b(jediViewModel, "$this$selectSubscribe");
        C52711k.m112240b(jVar, "prop1");
        C52711k.m112240b(jVar2, "prop2");
        C52711k.m112240b(jVar3, "prop3");
        C52711k.m112240b(jVar4, "prop4");
        C52711k.m112240b(uVar, "config");
        C52711k.m112240b(sVar, "subscriber");
        return C11798a.m24155a((C11797e<? extends RECEIVER>) this, jediViewModel2, jVar5, jVar6, jVar7, jVar8, uVar2, sVar2);
    }
}

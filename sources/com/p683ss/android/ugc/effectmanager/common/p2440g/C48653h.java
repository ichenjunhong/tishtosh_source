package com.p683ss.android.ugc.effectmanager.common.p2440g;

import android.os.Handler;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.common.g.h */
public abstract class C48653h<T> implements C48652g<T> {

    /* renamed from: a */
    public boolean f122285a;

    /* renamed from: b */
    public C48650e<T> f122286b;

    /* renamed from: c */
    public final Handler f122287c;

    /* renamed from: d */
    private String f122288d;

    /* renamed from: com.ss.android.ugc.effectmanager.common.g.h$a */
    static final class C48654a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48653h f122289a;

        C48654a(C48653h hVar) {
            this.f122289a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f122289a.mo96236h();
            this.f122289a.f122286b = null;
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo96229e();

    /* renamed from: f */
    public final String mo96233f() {
        return this.f122288d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo96236h();

    /* renamed from: g */
    public void mo96234g() {
        this.f122285a = true;
        mo96235a((C52670a<C52860x>) new C48654a<C52860x>(this));
    }

    /* renamed from: a */
    public final void mo96232a(C48650e<T> eVar) {
        if (!this.f122285a) {
            this.f122286b = eVar;
            mo96229e();
        }
    }

    /* renamed from: a */
    public final void mo96235a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "block");
        if (this.f122287c != null) {
            this.f122287c.post(new C48655i(aVar));
        } else {
            aVar.invoke();
        }
    }

    public C48653h(Handler handler, String str) {
        C52711k.m112240b(str, "taskId");
        this.f122287c = handler;
        this.f122288d = str;
    }
}

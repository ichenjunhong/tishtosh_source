package com.bytedance.jedi.arch.ext.list.p744a;

import com.bytedance.jedi.arch.ext.list.p744a.C11848e.C11850b;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.arch.ext.list.a.a */
public abstract class C11839a implements C11850b {

    /* renamed from: a */
    private boolean f31409a;

    /* renamed from: b */
    public int f31410b;

    /* renamed from: c */
    private boolean f31411c;

    /* renamed from: com.bytedance.jedi.arch.ext.list.a.a$a */
    static final class C11840a extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C11839a f31412a;

        /* renamed from: b */
        final /* synthetic */ int f31413b;

        C11840a(C11839a aVar, int i) {
            this.f31412a = aVar;
            this.f31413b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = this.f31413b - ((Number) obj).intValue();
            this.f31412a.f31410b = Math.max(this.f31412a.f31410b, intValue);
            if (this.f31412a.f31410b > 0) {
                this.f31412a.mo22593b();
            }
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22568a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22569a(C52671b<? super Integer, C52860x> bVar);

    /* renamed from: b */
    public final void mo22593b() {
        if (!this.f31409a) {
            this.f31409a = true;
            mo22568a();
        }
    }

    /* renamed from: a */
    public final void mo22560a(int i) {
        this.f31411c = true;
        mo22569a((C52671b<? super Integer, C52860x>) new C11840a<Object,C52860x>(this, i));
    }

    /* renamed from: a */
    public final void mo22592a(int i, Throwable th) {
        if (this.f31411c) {
            this.f31409a = false;
            if (th == null && i != 0) {
                this.f31410b -= i;
                if (this.f31410b > 0) {
                    mo22593b();
                }
            }
        }
    }
}

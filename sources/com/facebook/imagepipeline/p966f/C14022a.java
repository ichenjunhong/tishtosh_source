package com.facebook.imagepipeline.p966f;

import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p974n.C14139am;
import com.facebook.imagepipeline.p974n.C14151at;
import com.facebook.imagepipeline.p974n.C14168b;
import com.facebook.imagepipeline.p976p.C14237b;
import com.facebook.p929d.C13740a;

/* renamed from: com.facebook.imagepipeline.f.a */
public abstract class C14022a<T> extends C13740a<T> {

    /* renamed from: a */
    private final C14151at f36671a;

    /* renamed from: b */
    private final C14050c f36672b;

    /* renamed from: h */
    public final synchronized void mo26238h() {
        C13689i.m27657b(mo25668a());
    }

    /* renamed from: g */
    public final boolean mo25677g() {
        if (!super.mo25677g()) {
            return false;
        }
        if (!super.mo25672b()) {
            this.f36672b.onRequestCancellation(this.f36671a.mo26386b());
            this.f36671a.mo26410i();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo26237b(Throwable th) {
        if (super.mo25671a(th)) {
            this.f36672b.onRequestFailure(this.f36671a.mo26384a(), this.f36671a.mo26386b(), th, this.f36671a.mo26390f());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26236a(T t, int i) {
        boolean a = C14168b.m29025a(i);
        if (super.mo25670a(t, a) && a) {
            this.f36672b.onRequestSuccess(this.f36671a.mo26384a(), this.f36671a.mo26386b(), this.f36671a.mo26390f());
        }
    }

    protected C14022a(C14139am<T> amVar, C14151at atVar, C14050c cVar) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractProducerToDataSourceAdapter()");
        }
        this.f36671a = atVar;
        this.f36672b = cVar;
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        this.f36672b.onRequestStart(atVar.mo26384a(), this.f36671a.mo26388d(), this.f36671a.mo26386b(), this.f36671a.mo26390f());
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        if (C14237b.m29187b()) {
            C14237b.m29186a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        amVar.mo26346a(new C14168b<T>() {
            /* renamed from: a */
            public final void mo26239a() {
                C14022a.this.mo26238h();
            }

            /* renamed from: a */
            public final void mo26240a(float f) {
                C14022a.this.mo25669a(f);
            }

            /* renamed from: a */
            public final void mo26242a(Throwable th) {
                C14022a.this.mo26237b(th);
            }

            /* renamed from: a */
            public final void mo26241a(T t, int i) {
                C14022a.this.mo26236a(t, i);
            }
        }, atVar);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }
}

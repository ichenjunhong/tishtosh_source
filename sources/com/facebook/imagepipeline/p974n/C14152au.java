package com.facebook.imagepipeline.p974n;

import com.facebook.common.p918b.C13669h;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.n.au */
public abstract class C14152au<T> extends C13669h<T> {

    /* renamed from: b */
    private final C14188k<T> f36941b;

    /* renamed from: c */
    private final C14142ap f36942c;

    /* renamed from: d */
    private final String f36943d;

    /* renamed from: e */
    private final String f36944e;

    /* renamed from: b */
    public abstract void mo25574b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo26352c(T t) {
        return null;
    }

    /* renamed from: b */
    public void mo25573b() {
        C14142ap apVar = this.f36942c;
        String str = this.f36944e;
        String str2 = this.f36943d;
        this.f36942c.requiresExtraMap(this.f36944e);
        apVar.onProducerFinishWithCancellation(str, str2, null);
        this.f36941b.mo26402b();
    }

    /* renamed from: a */
    public void mo25571a(Exception exc) {
        C14142ap apVar = this.f36942c;
        String str = this.f36944e;
        String str2 = this.f36943d;
        this.f36942c.requiresExtraMap(this.f36944e);
        apVar.onProducerFinishWithFailure(str, str2, exc, null);
        this.f36941b.mo26405b((Throwable) exc);
    }

    /* renamed from: a */
    public void mo25572a(T t) {
        Map map;
        C14142ap apVar = this.f36942c;
        String str = this.f36944e;
        String str2 = this.f36943d;
        if (this.f36942c.requiresExtraMap(this.f36944e)) {
            map = mo26352c(t);
        } else {
            map = null;
        }
        apVar.onProducerFinishWithSuccess(str, str2, map);
        this.f36941b.mo26404b(t, 1);
    }

    public C14152au(C14188k<T> kVar, C14142ap apVar, String str, String str2) {
        this.f36941b = kVar;
        this.f36942c = apVar;
        this.f36943d = str;
        this.f36944e = str2;
        this.f36942c.onProducerStart(this.f36944e, this.f36943d);
    }
}

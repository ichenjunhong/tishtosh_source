package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bf */
final class C16562bf implements C16549at<C16563bg> {

    /* renamed from: a */
    private final C16862t f46549a;

    /* renamed from: b */
    private final C16563bg f46550b = new C16563bg();

    public C16562bf(C16862t tVar) {
        this.f46549a = tVar;
    }

    /* renamed from: a */
    public final void mo31807a(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f46550b.f46551a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.f46550b.f46552b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f46550b.f46553c = str2;
        } else {
            this.f46549a.mo32518a().mo32498c("String xml configuration name not recognized", str);
        }
    }

    /* renamed from: a */
    public final void mo31808a(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.f46550b.f46555e = z ? 1 : 0;
            return;
        }
        this.f46549a.mo32518a().mo32498c("Bool xml configuration name not recognized", str);
    }

    /* renamed from: a */
    public final void mo31806a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f46550b.f46554d = i;
        } else {
            this.f46549a.mo32518a().mo32498c("Int xml configuration name not recognized", str);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C16547ar mo31805a() {
        return this.f46550b;
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dy */
public final class C16643dy extends C16843ku<C16643dy> {

    /* renamed from: c */
    private static volatile C16643dy[] f46771c;

    /* renamed from: a */
    public String f46772a;

    /* renamed from: b */
    public String f46773b;

    /* renamed from: a */
    public static C16643dy[] m39754a() {
        if (f46771c == null) {
            synchronized (C16847ky.f47301b) {
                if (f46771c == null) {
                    f46771c = new C16643dy[0];
                }
            }
        }
        return f46771c;
    }

    public C16643dy() {
        this.f46772a = null;
        this.f46773b = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16643dy)) {
            return false;
        }
        C16643dy dyVar = (C16643dy) obj;
        if (this.f46772a == null) {
            if (dyVar.f46772a != null) {
                return false;
            }
        } else if (!this.f46772a.equals(dyVar.f46772a)) {
            return false;
        }
        if (this.f46773b == null) {
            if (dyVar.f46773b != null) {
                return false;
            }
        } else if (!this.f46773b.equals(dyVar.f46773b)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dyVar.f47288L == null || dyVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dyVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f46772a == null ? 0 : this.f46772a.hashCode())) * 31) + (this.f46773b == null ? 0 : this.f46773b.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46772a != null) {
            ksVar.mo32445a(1, this.f46772a);
        }
        if (this.f46773b != null) {
            ksVar.mo32445a(2, this.f46773b);
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46772a != null) {
            b += C16841ks.m40864b(1, this.f46772a);
        }
        return this.f46773b != null ? b + C16841ks.m40864b(2, this.f46773b) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f46772a = kqVar.mo32429c();
            } else if (a == 18) {
                this.f46773b = kqVar.mo32429c();
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dw */
public final class C16641dw extends C16843ku<C16641dw> {

    /* renamed from: e */
    private static volatile C16641dw[] f46758e;

    /* renamed from: a */
    public String f46759a;

    /* renamed from: b */
    public Boolean f46760b;

    /* renamed from: c */
    public Boolean f46761c;

    /* renamed from: d */
    public Integer f46762d;

    /* renamed from: a */
    public static C16641dw[] m39747a() {
        if (f46758e == null) {
            synchronized (C16847ky.f47301b) {
                if (f46758e == null) {
                    f46758e = new C16641dw[0];
                }
            }
        }
        return f46758e;
    }

    public C16641dw() {
        this.f46759a = null;
        this.f46760b = null;
        this.f46761c = null;
        this.f46762d = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16641dw)) {
            return false;
        }
        C16641dw dwVar = (C16641dw) obj;
        if (this.f46759a == null) {
            if (dwVar.f46759a != null) {
                return false;
            }
        } else if (!this.f46759a.equals(dwVar.f46759a)) {
            return false;
        }
        if (this.f46760b == null) {
            if (dwVar.f46760b != null) {
                return false;
            }
        } else if (!this.f46760b.equals(dwVar.f46760b)) {
            return false;
        }
        if (this.f46761c == null) {
            if (dwVar.f46761c != null) {
                return false;
            }
        } else if (!this.f46761c.equals(dwVar.f46761c)) {
            return false;
        }
        if (this.f46762d == null) {
            if (dwVar.f46762d != null) {
                return false;
            }
        } else if (!this.f46762d.equals(dwVar.f46762d)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dwVar.f47288L == null || dwVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dwVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46759a == null ? 0 : this.f46759a.hashCode())) * 31) + (this.f46760b == null ? 0 : this.f46760b.hashCode())) * 31) + (this.f46761c == null ? 0 : this.f46761c.hashCode())) * 31) + (this.f46762d == null ? 0 : this.f46762d.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46759a != null) {
            ksVar.mo32445a(1, this.f46759a);
        }
        if (this.f46760b != null) {
            ksVar.mo32446a(2, this.f46760b.booleanValue());
        }
        if (this.f46761c != null) {
            ksVar.mo32446a(3, this.f46761c.booleanValue());
        }
        if (this.f46762d != null) {
            ksVar.mo32442a(4, this.f46762d.intValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46759a != null) {
            b += C16841ks.m40864b(1, this.f46759a);
        }
        if (this.f46760b != null) {
            this.f46760b.booleanValue();
            b += C16841ks.m40861b(2) + 1;
        }
        if (this.f46761c != null) {
            this.f46761c.booleanValue();
            b += C16841ks.m40861b(3) + 1;
        }
        return this.f46762d != null ? b + C16841ks.m40862b(4, this.f46762d.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f46759a = kqVar.mo32429c();
            } else if (a == 16) {
                this.f46760b = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 24) {
                this.f46761c = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 32) {
                this.f46762d = Integer.valueOf(kqVar.mo32430d());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

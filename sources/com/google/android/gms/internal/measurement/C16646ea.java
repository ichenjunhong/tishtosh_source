package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ea */
public final class C16646ea extends C16843ku<C16646ea> {

    /* renamed from: c */
    private static volatile C16646ea[] f46783c;

    /* renamed from: a */
    public Integer f46784a;

    /* renamed from: b */
    public Long f46785b;

    /* renamed from: a */
    public static C16646ea[] m39763a() {
        if (f46783c == null) {
            synchronized (C16847ky.f47301b) {
                if (f46783c == null) {
                    f46783c = new C16646ea[0];
                }
            }
        }
        return f46783c;
    }

    public C16646ea() {
        this.f46784a = null;
        this.f46785b = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16646ea)) {
            return false;
        }
        C16646ea eaVar = (C16646ea) obj;
        if (this.f46784a == null) {
            if (eaVar.f46784a != null) {
                return false;
            }
        } else if (!this.f46784a.equals(eaVar.f46784a)) {
            return false;
        }
        if (this.f46785b == null) {
            if (eaVar.f46785b != null) {
                return false;
            }
        } else if (!this.f46785b.equals(eaVar.f46785b)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return eaVar.f47288L == null || eaVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(eaVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f46784a == null ? 0 : this.f46784a.hashCode())) * 31) + (this.f46785b == null ? 0 : this.f46785b.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46784a != null) {
            ksVar.mo32442a(1, this.f46784a.intValue());
        }
        if (this.f46785b != null) {
            ksVar.mo32448b(2, this.f46785b.longValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46784a != null) {
            b += C16841ks.m40862b(1, this.f46784a.intValue());
        }
        return this.f46785b != null ? b + C16841ks.m40866c(2, this.f46785b.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46784a = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 16) {
                this.f46785b = Long.valueOf(kqVar.mo32432e());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

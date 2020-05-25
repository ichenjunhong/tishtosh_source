package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.eg */
public final class C16652eg extends C16843ku<C16652eg> {

    /* renamed from: c */
    private static volatile C16652eg[] f46845c;

    /* renamed from: a */
    public Integer f46846a;

    /* renamed from: b */
    public long[] f46847b;

    /* renamed from: a */
    public static C16652eg[] m39785a() {
        if (f46845c == null) {
            synchronized (C16847ky.f47301b) {
                if (f46845c == null) {
                    f46845c = new C16652eg[0];
                }
            }
        }
        return f46845c;
    }

    public C16652eg() {
        this.f46846a = null;
        this.f46847b = C16853ld.f47308b;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16652eg)) {
            return false;
        }
        C16652eg egVar = (C16652eg) obj;
        if (this.f46846a == null) {
            if (egVar.f46846a != null) {
                return false;
            }
        } else if (!this.f46846a.equals(egVar.f46846a)) {
            return false;
        }
        if (!C16847ky.m40902a(this.f46847b, egVar.f46847b)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return egVar.f47288L == null || egVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(egVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f46846a == null ? 0 : this.f46846a.hashCode())) * 31) + C16847ky.m40898a(this.f46847b)) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46846a != null) {
            ksVar.mo32442a(1, this.f46846a.intValue());
        }
        if (this.f46847b != null && this.f46847b.length > 0) {
            for (long b : this.f46847b) {
                ksVar.mo32448b(2, b);
            }
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46846a != null) {
            b += C16841ks.m40862b(1, this.f46846a.intValue());
        }
        if (this.f46847b == null || this.f46847b.length <= 0) {
            return b;
        }
        int i = 0;
        for (long a : this.f46847b) {
            i += C16841ks.m40855a(a);
        }
        return b + i + (this.f46847b.length * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46846a = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 16) {
                int a2 = C16853ld.m40927a(kqVar, 16);
                int length = this.f46847b == null ? 0 : this.f46847b.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46847b, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = kqVar.mo32432e();
                    kqVar.mo32421a();
                    length++;
                }
                jArr[length] = kqVar.mo32432e();
                this.f46847b = jArr;
            } else if (a == 18) {
                int c = kqVar.mo32428c(kqVar.mo32430d());
                int i = kqVar.mo32437i();
                int i2 = 0;
                while (kqVar.mo32436h() > 0) {
                    kqVar.mo32432e();
                    i2++;
                }
                kqVar.mo32433e(i);
                int length2 = this.f46847b == null ? 0 : this.f46847b.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46847b, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = kqVar.mo32432e();
                    length2++;
                }
                this.f46847b = jArr2;
                kqVar.mo32431d(c);
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

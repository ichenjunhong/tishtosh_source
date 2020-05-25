package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ec */
public final class C16648ec extends C16843ku<C16648ec> {

    /* renamed from: e */
    private static volatile C16648ec[] f46792e;

    /* renamed from: a */
    public String f46793a;

    /* renamed from: b */
    public String f46794b;

    /* renamed from: c */
    public Long f46795c;

    /* renamed from: d */
    public Double f46796d;

    /* renamed from: f */
    private Float f46797f;

    /* renamed from: a */
    public static C16648ec[] m39771a() {
        if (f46792e == null) {
            synchronized (C16847ky.f47301b) {
                if (f46792e == null) {
                    f46792e = new C16648ec[0];
                }
            }
        }
        return f46792e;
    }

    public C16648ec() {
        this.f46793a = null;
        this.f46794b = null;
        this.f46795c = null;
        this.f46797f = null;
        this.f46796d = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16648ec)) {
            return false;
        }
        C16648ec ecVar = (C16648ec) obj;
        if (this.f46793a == null) {
            if (ecVar.f46793a != null) {
                return false;
            }
        } else if (!this.f46793a.equals(ecVar.f46793a)) {
            return false;
        }
        if (this.f46794b == null) {
            if (ecVar.f46794b != null) {
                return false;
            }
        } else if (!this.f46794b.equals(ecVar.f46794b)) {
            return false;
        }
        if (this.f46795c == null) {
            if (ecVar.f46795c != null) {
                return false;
            }
        } else if (!this.f46795c.equals(ecVar.f46795c)) {
            return false;
        }
        if (this.f46797f == null) {
            if (ecVar.f46797f != null) {
                return false;
            }
        } else if (!this.f46797f.equals(ecVar.f46797f)) {
            return false;
        }
        if (this.f46796d == null) {
            if (ecVar.f46796d != null) {
                return false;
            }
        } else if (!this.f46796d.equals(ecVar.f46796d)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return ecVar.f47288L == null || ecVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(ecVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46793a == null ? 0 : this.f46793a.hashCode())) * 31) + (this.f46794b == null ? 0 : this.f46794b.hashCode())) * 31) + (this.f46795c == null ? 0 : this.f46795c.hashCode())) * 31) + (this.f46797f == null ? 0 : this.f46797f.hashCode())) * 31) + (this.f46796d == null ? 0 : this.f46796d.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46793a != null) {
            ksVar.mo32445a(1, this.f46793a);
        }
        if (this.f46794b != null) {
            ksVar.mo32445a(2, this.f46794b);
        }
        if (this.f46795c != null) {
            ksVar.mo32448b(3, this.f46795c.longValue());
        }
        if (this.f46797f != null) {
            ksVar.mo32441a(4, this.f46797f.floatValue());
        }
        if (this.f46796d != null) {
            ksVar.mo32440a(5, this.f46796d.doubleValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46793a != null) {
            b += C16841ks.m40864b(1, this.f46793a);
        }
        if (this.f46794b != null) {
            b += C16841ks.m40864b(2, this.f46794b);
        }
        if (this.f46795c != null) {
            b += C16841ks.m40866c(3, this.f46795c.longValue());
        }
        if (this.f46797f != null) {
            this.f46797f.floatValue();
            b += C16841ks.m40861b(4) + 4;
        }
        if (this.f46796d == null) {
            return b;
        }
        this.f46796d.doubleValue();
        return b + C16841ks.m40861b(5) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f46793a = kqVar.mo32429c();
            } else if (a == 18) {
                this.f46794b = kqVar.mo32429c();
            } else if (a == 24) {
                this.f46795c = Long.valueOf(kqVar.mo32432e());
            } else if (a == 37) {
                this.f46797f = Float.valueOf(Float.intBitsToFloat(kqVar.mo32434f()));
            } else if (a == 41) {
                this.f46796d = Double.valueOf(Double.longBitsToDouble(kqVar.mo32435g()));
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

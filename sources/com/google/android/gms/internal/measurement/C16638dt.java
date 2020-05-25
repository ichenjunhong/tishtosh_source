package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dt */
public final class C16638dt extends C16843ku<C16638dt> {

    /* renamed from: a */
    public Integer f46743a;

    /* renamed from: b */
    public Boolean f46744b;

    /* renamed from: c */
    public String f46745c;

    /* renamed from: d */
    public String f46746d;

    /* renamed from: e */
    public String f46747e;

    public C16638dt() {
        this.f46743a = null;
        this.f46744b = null;
        this.f46745c = null;
        this.f46746d = null;
        this.f46747e = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16638dt)) {
            return false;
        }
        C16638dt dtVar = (C16638dt) obj;
        if (this.f46743a == null) {
            if (dtVar.f46743a != null) {
                return false;
            }
        } else if (!this.f46743a.equals(dtVar.f46743a)) {
            return false;
        }
        if (this.f46744b == null) {
            if (dtVar.f46744b != null) {
                return false;
            }
        } else if (!this.f46744b.equals(dtVar.f46744b)) {
            return false;
        }
        if (this.f46745c == null) {
            if (dtVar.f46745c != null) {
                return false;
            }
        } else if (!this.f46745c.equals(dtVar.f46745c)) {
            return false;
        }
        if (this.f46746d == null) {
            if (dtVar.f46746d != null) {
                return false;
            }
        } else if (!this.f46746d.equals(dtVar.f46746d)) {
            return false;
        }
        if (this.f46747e == null) {
            if (dtVar.f46747e != null) {
                return false;
            }
        } else if (!this.f46747e.equals(dtVar.f46747e)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dtVar.f47288L == null || dtVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dtVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46743a == null ? 0 : this.f46743a.intValue())) * 31) + (this.f46744b == null ? 0 : this.f46744b.hashCode())) * 31) + (this.f46745c == null ? 0 : this.f46745c.hashCode())) * 31) + (this.f46746d == null ? 0 : this.f46746d.hashCode())) * 31) + (this.f46747e == null ? 0 : this.f46747e.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46743a != null) {
            ksVar.mo32442a(1, this.f46743a.intValue());
        }
        if (this.f46744b != null) {
            ksVar.mo32446a(2, this.f46744b.booleanValue());
        }
        if (this.f46745c != null) {
            ksVar.mo32445a(3, this.f46745c);
        }
        if (this.f46746d != null) {
            ksVar.mo32445a(4, this.f46746d);
        }
        if (this.f46747e != null) {
            ksVar.mo32445a(5, this.f46747e);
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46743a != null) {
            b += C16841ks.m40862b(1, this.f46743a.intValue());
        }
        if (this.f46744b != null) {
            this.f46744b.booleanValue();
            b += C16841ks.m40861b(2) + 1;
        }
        if (this.f46745c != null) {
            b += C16841ks.m40864b(3, this.f46745c);
        }
        if (this.f46746d != null) {
            b += C16841ks.m40864b(4, this.f46746d);
        }
        return this.f46747e != null ? b + C16841ks.m40864b(5, this.f46747e) : b;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C16638dt mo31923a(C16839kq kqVar) throws IOException {
        int d;
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = kqVar.mo32430d();
                    if (d < 0 || d > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(d);
                        sb.append(" is not a valid enum ComparisonType");
                    } else {
                        this.f46743a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    kqVar.mo32433e(kqVar.mo32437i());
                    mo32451a(kqVar, a);
                }
            } else if (a == 16) {
                this.f46744b = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 26) {
                this.f46745c = kqVar.mo32429c();
            } else if (a == 34) {
                this.f46746d = kqVar.mo32429c();
            } else if (a == 42) {
                this.f46747e = kqVar.mo32429c();
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(d);
        sb2.append(" is not a valid enum ComparisonType");
        throw new IllegalArgumentException(sb2.toString());
    }
}

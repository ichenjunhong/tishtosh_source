package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ds */
public final class C16637ds extends C16843ku<C16637ds> {

    /* renamed from: e */
    private static volatile C16637ds[] f46738e;

    /* renamed from: a */
    public C16640dv f46739a;

    /* renamed from: b */
    public C16638dt f46740b;

    /* renamed from: c */
    public Boolean f46741c;

    /* renamed from: d */
    public String f46742d;

    /* renamed from: a */
    public static C16637ds[] m39731a() {
        if (f46738e == null) {
            synchronized (C16847ky.f47301b) {
                if (f46738e == null) {
                    f46738e = new C16637ds[0];
                }
            }
        }
        return f46738e;
    }

    public C16637ds() {
        this.f46739a = null;
        this.f46740b = null;
        this.f46741c = null;
        this.f46742d = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16637ds)) {
            return false;
        }
        C16637ds dsVar = (C16637ds) obj;
        if (this.f46739a == null) {
            if (dsVar.f46739a != null) {
                return false;
            }
        } else if (!this.f46739a.equals(dsVar.f46739a)) {
            return false;
        }
        if (this.f46740b == null) {
            if (dsVar.f46740b != null) {
                return false;
            }
        } else if (!this.f46740b.equals(dsVar.f46740b)) {
            return false;
        }
        if (this.f46741c == null) {
            if (dsVar.f46741c != null) {
                return false;
            }
        } else if (!this.f46741c.equals(dsVar.f46741c)) {
            return false;
        }
        if (this.f46742d == null) {
            if (dsVar.f46742d != null) {
                return false;
            }
        } else if (!this.f46742d.equals(dsVar.f46742d)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dsVar.f47288L == null || dsVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dsVar.f47288L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = getClass().getName().hashCode() + 527;
        C16640dv dvVar = this.f46739a;
        int i3 = hashCode * 31;
        int i4 = 0;
        if (dvVar == null) {
            i = 0;
        } else {
            i = dvVar.hashCode();
        }
        int i5 = i3 + i;
        C16638dt dtVar = this.f46740b;
        int i6 = i5 * 31;
        if (dtVar == null) {
            i2 = 0;
        } else {
            i2 = dtVar.hashCode();
        }
        int hashCode2 = (((((i6 + i2) * 31) + (this.f46741c == null ? 0 : this.f46741c.hashCode())) * 31) + (this.f46742d == null ? 0 : this.f46742d.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i4 = this.f47288L.hashCode();
        }
        return hashCode2 + i4;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46739a != null) {
            ksVar.mo32444a(1, (C16850la) this.f46739a);
        }
        if (this.f46740b != null) {
            ksVar.mo32444a(2, (C16850la) this.f46740b);
        }
        if (this.f46741c != null) {
            ksVar.mo32446a(3, this.f46741c.booleanValue());
        }
        if (this.f46742d != null) {
            ksVar.mo32445a(4, this.f46742d);
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46739a != null) {
            b += C16841ks.m40863b(1, (C16850la) this.f46739a);
        }
        if (this.f46740b != null) {
            b += C16841ks.m40863b(2, (C16850la) this.f46740b);
        }
        if (this.f46741c != null) {
            this.f46741c.booleanValue();
            b += C16841ks.m40861b(3) + 1;
        }
        return this.f46742d != null ? b + C16841ks.m40864b(4, this.f46742d) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                if (this.f46739a == null) {
                    this.f46739a = new C16640dv();
                }
                kqVar.mo32425a((C16850la) this.f46739a);
            } else if (a == 18) {
                if (this.f46740b == null) {
                    this.f46740b = new C16638dt();
                }
                kqVar.mo32425a((C16850la) this.f46740b);
            } else if (a == 24) {
                this.f46741c = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 34) {
                this.f46742d = kqVar.mo32429c();
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

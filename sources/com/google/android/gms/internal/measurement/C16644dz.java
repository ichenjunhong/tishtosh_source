package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dz */
public final class C16644dz extends C16843ku<C16644dz> {

    /* renamed from: e */
    private static volatile C16644dz[] f46774e;

    /* renamed from: a */
    public Integer f46775a;

    /* renamed from: b */
    public C16651ef f46776b;

    /* renamed from: c */
    public C16651ef f46777c;

    /* renamed from: d */
    public Boolean f46778d;

    /* renamed from: a */
    public static C16644dz[] m39758a() {
        if (f46774e == null) {
            synchronized (C16847ky.f47301b) {
                if (f46774e == null) {
                    f46774e = new C16644dz[0];
                }
            }
        }
        return f46774e;
    }

    public C16644dz() {
        this.f46775a = null;
        this.f46776b = null;
        this.f46777c = null;
        this.f46778d = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16644dz)) {
            return false;
        }
        C16644dz dzVar = (C16644dz) obj;
        if (this.f46775a == null) {
            if (dzVar.f46775a != null) {
                return false;
            }
        } else if (!this.f46775a.equals(dzVar.f46775a)) {
            return false;
        }
        if (this.f46776b == null) {
            if (dzVar.f46776b != null) {
                return false;
            }
        } else if (!this.f46776b.equals(dzVar.f46776b)) {
            return false;
        }
        if (this.f46777c == null) {
            if (dzVar.f46777c != null) {
                return false;
            }
        } else if (!this.f46777c.equals(dzVar.f46777c)) {
            return false;
        }
        if (this.f46778d == null) {
            if (dzVar.f46778d != null) {
                return false;
            }
        } else if (!this.f46778d.equals(dzVar.f46778d)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dzVar.f47288L == null || dzVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dzVar.f47288L);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        int hashCode = ((getClass().getName().hashCode() + 527) * 31) + (this.f46775a == null ? 0 : this.f46775a.hashCode());
        C16651ef efVar = this.f46776b;
        int i4 = hashCode * 31;
        if (efVar == null) {
            i = 0;
        } else {
            i = efVar.hashCode();
        }
        int i5 = i4 + i;
        C16651ef efVar2 = this.f46777c;
        int i6 = i5 * 31;
        if (efVar2 == null) {
            i2 = 0;
        } else {
            i2 = efVar2.hashCode();
        }
        int hashCode2 = (((i6 + i2) * 31) + (this.f46778d == null ? 0 : this.f46778d.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i3 = this.f47288L.hashCode();
        }
        return hashCode2 + i3;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46775a != null) {
            ksVar.mo32442a(1, this.f46775a.intValue());
        }
        if (this.f46776b != null) {
            ksVar.mo32444a(2, (C16850la) this.f46776b);
        }
        if (this.f46777c != null) {
            ksVar.mo32444a(3, (C16850la) this.f46777c);
        }
        if (this.f46778d != null) {
            ksVar.mo32446a(4, this.f46778d.booleanValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46775a != null) {
            b += C16841ks.m40862b(1, this.f46775a.intValue());
        }
        if (this.f46776b != null) {
            b += C16841ks.m40863b(2, (C16850la) this.f46776b);
        }
        if (this.f46777c != null) {
            b += C16841ks.m40863b(3, (C16850la) this.f46777c);
        }
        if (this.f46778d == null) {
            return b;
        }
        this.f46778d.booleanValue();
        return b + C16841ks.m40861b(4) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46775a = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 18) {
                if (this.f46776b == null) {
                    this.f46776b = new C16651ef();
                }
                kqVar.mo32425a((C16850la) this.f46776b);
            } else if (a == 26) {
                if (this.f46777c == null) {
                    this.f46777c = new C16651ef();
                }
                kqVar.mo32425a((C16850la) this.f46777c);
            } else if (a == 32) {
                this.f46778d = Boolean.valueOf(kqVar.mo32426b());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.du */
public final class C16639du extends C16843ku<C16639du> {

    /* renamed from: f */
    private static volatile C16639du[] f46748f;

    /* renamed from: a */
    public Integer f46749a;

    /* renamed from: b */
    public String f46750b;

    /* renamed from: c */
    public C16637ds f46751c;

    /* renamed from: d */
    public Boolean f46752d;

    /* renamed from: e */
    public Boolean f46753e;

    /* renamed from: a */
    public static C16639du[] m39739a() {
        if (f46748f == null) {
            synchronized (C16847ky.f47301b) {
                if (f46748f == null) {
                    f46748f = new C16639du[0];
                }
            }
        }
        return f46748f;
    }

    public C16639du() {
        this.f46749a = null;
        this.f46750b = null;
        this.f46751c = null;
        this.f46752d = null;
        this.f46753e = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16639du)) {
            return false;
        }
        C16639du duVar = (C16639du) obj;
        if (this.f46749a == null) {
            if (duVar.f46749a != null) {
                return false;
            }
        } else if (!this.f46749a.equals(duVar.f46749a)) {
            return false;
        }
        if (this.f46750b == null) {
            if (duVar.f46750b != null) {
                return false;
            }
        } else if (!this.f46750b.equals(duVar.f46750b)) {
            return false;
        }
        if (this.f46751c == null) {
            if (duVar.f46751c != null) {
                return false;
            }
        } else if (!this.f46751c.equals(duVar.f46751c)) {
            return false;
        }
        if (this.f46752d == null) {
            if (duVar.f46752d != null) {
                return false;
            }
        } else if (!this.f46752d.equals(duVar.f46752d)) {
            return false;
        }
        if (this.f46753e == null) {
            if (duVar.f46753e != null) {
                return false;
            }
        } else if (!this.f46753e.equals(duVar.f46753e)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return duVar.f47288L == null || duVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(duVar.f47288L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((getClass().getName().hashCode() + 527) * 31) + (this.f46749a == null ? 0 : this.f46749a.hashCode())) * 31) + (this.f46750b == null ? 0 : this.f46750b.hashCode());
        C16637ds dsVar = this.f46751c;
        int i3 = hashCode * 31;
        if (dsVar == null) {
            i = 0;
        } else {
            i = dsVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f46752d == null ? 0 : this.f46752d.hashCode())) * 31) + (this.f46753e == null ? 0 : this.f46753e.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i2 = this.f47288L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46749a != null) {
            ksVar.mo32442a(1, this.f46749a.intValue());
        }
        if (this.f46750b != null) {
            ksVar.mo32445a(2, this.f46750b);
        }
        if (this.f46751c != null) {
            ksVar.mo32444a(3, (C16850la) this.f46751c);
        }
        if (this.f46752d != null) {
            ksVar.mo32446a(4, this.f46752d.booleanValue());
        }
        if (this.f46753e != null) {
            ksVar.mo32446a(5, this.f46753e.booleanValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46749a != null) {
            b += C16841ks.m40862b(1, this.f46749a.intValue());
        }
        if (this.f46750b != null) {
            b += C16841ks.m40864b(2, this.f46750b);
        }
        if (this.f46751c != null) {
            b += C16841ks.m40863b(3, (C16850la) this.f46751c);
        }
        if (this.f46752d != null) {
            this.f46752d.booleanValue();
            b += C16841ks.m40861b(4) + 1;
        }
        if (this.f46753e == null) {
            return b;
        }
        this.f46753e.booleanValue();
        return b + C16841ks.m40861b(5) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46749a = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 18) {
                this.f46750b = kqVar.mo32429c();
            } else if (a == 26) {
                if (this.f46751c == null) {
                    this.f46751c = new C16637ds();
                }
                kqVar.mo32425a((C16850la) this.f46751c);
            } else if (a == 32) {
                this.f46752d = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 40) {
                this.f46753e = Boolean.valueOf(kqVar.mo32426b());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

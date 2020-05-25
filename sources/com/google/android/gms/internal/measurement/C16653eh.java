package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.eh */
public final class C16653eh extends C16843ku<C16653eh> {

    /* renamed from: f */
    private static volatile C16653eh[] f46848f;

    /* renamed from: a */
    public Long f46849a;

    /* renamed from: b */
    public String f46850b;

    /* renamed from: c */
    public String f46851c;

    /* renamed from: d */
    public Long f46852d;

    /* renamed from: e */
    public Double f46853e;

    /* renamed from: g */
    private Float f46854g;

    /* renamed from: a */
    public static C16653eh[] m39789a() {
        if (f46848f == null) {
            synchronized (C16847ky.f47301b) {
                if (f46848f == null) {
                    f46848f = new C16653eh[0];
                }
            }
        }
        return f46848f;
    }

    public C16653eh() {
        this.f46849a = null;
        this.f46850b = null;
        this.f46851c = null;
        this.f46852d = null;
        this.f46854g = null;
        this.f46853e = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16653eh)) {
            return false;
        }
        C16653eh ehVar = (C16653eh) obj;
        if (this.f46849a == null) {
            if (ehVar.f46849a != null) {
                return false;
            }
        } else if (!this.f46849a.equals(ehVar.f46849a)) {
            return false;
        }
        if (this.f46850b == null) {
            if (ehVar.f46850b != null) {
                return false;
            }
        } else if (!this.f46850b.equals(ehVar.f46850b)) {
            return false;
        }
        if (this.f46851c == null) {
            if (ehVar.f46851c != null) {
                return false;
            }
        } else if (!this.f46851c.equals(ehVar.f46851c)) {
            return false;
        }
        if (this.f46852d == null) {
            if (ehVar.f46852d != null) {
                return false;
            }
        } else if (!this.f46852d.equals(ehVar.f46852d)) {
            return false;
        }
        if (this.f46854g == null) {
            if (ehVar.f46854g != null) {
                return false;
            }
        } else if (!this.f46854g.equals(ehVar.f46854g)) {
            return false;
        }
        if (this.f46853e == null) {
            if (ehVar.f46853e != null) {
                return false;
            }
        } else if (!this.f46853e.equals(ehVar.f46853e)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return ehVar.f47288L == null || ehVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(ehVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46849a == null ? 0 : this.f46849a.hashCode())) * 31) + (this.f46850b == null ? 0 : this.f46850b.hashCode())) * 31) + (this.f46851c == null ? 0 : this.f46851c.hashCode())) * 31) + (this.f46852d == null ? 0 : this.f46852d.hashCode())) * 31) + (this.f46854g == null ? 0 : this.f46854g.hashCode())) * 31) + (this.f46853e == null ? 0 : this.f46853e.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46849a != null) {
            ksVar.mo32448b(1, this.f46849a.longValue());
        }
        if (this.f46850b != null) {
            ksVar.mo32445a(2, this.f46850b);
        }
        if (this.f46851c != null) {
            ksVar.mo32445a(3, this.f46851c);
        }
        if (this.f46852d != null) {
            ksVar.mo32448b(4, this.f46852d.longValue());
        }
        if (this.f46854g != null) {
            ksVar.mo32441a(5, this.f46854g.floatValue());
        }
        if (this.f46853e != null) {
            ksVar.mo32440a(6, this.f46853e.doubleValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46849a != null) {
            b += C16841ks.m40866c(1, this.f46849a.longValue());
        }
        if (this.f46850b != null) {
            b += C16841ks.m40864b(2, this.f46850b);
        }
        if (this.f46851c != null) {
            b += C16841ks.m40864b(3, this.f46851c);
        }
        if (this.f46852d != null) {
            b += C16841ks.m40866c(4, this.f46852d.longValue());
        }
        if (this.f46854g != null) {
            this.f46854g.floatValue();
            b += C16841ks.m40861b(5) + 4;
        }
        if (this.f46853e == null) {
            return b;
        }
        this.f46853e.doubleValue();
        return b + C16841ks.m40861b(6) + 8;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46849a = Long.valueOf(kqVar.mo32432e());
            } else if (a == 18) {
                this.f46850b = kqVar.mo32429c();
            } else if (a == 26) {
                this.f46851c = kqVar.mo32429c();
            } else if (a == 32) {
                this.f46852d = Long.valueOf(kqVar.mo32432e());
            } else if (a == 45) {
                this.f46854g = Float.valueOf(Float.intBitsToFloat(kqVar.mo32434f()));
            } else if (a == 49) {
                this.f46853e = Double.valueOf(Double.longBitsToDouble(kqVar.mo32435g()));
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

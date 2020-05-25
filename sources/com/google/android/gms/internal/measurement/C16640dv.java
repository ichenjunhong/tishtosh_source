package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dv */
public final class C16640dv extends C16843ku<C16640dv> {

    /* renamed from: a */
    public Integer f46754a;

    /* renamed from: b */
    public String f46755b;

    /* renamed from: c */
    public Boolean f46756c;

    /* renamed from: d */
    public String[] f46757d;

    public C16640dv() {
        this.f46754a = null;
        this.f46755b = null;
        this.f46756c = null;
        this.f46757d = C16853ld.f47309c;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16640dv)) {
            return false;
        }
        C16640dv dvVar = (C16640dv) obj;
        if (this.f46754a == null) {
            if (dvVar.f46754a != null) {
                return false;
            }
        } else if (!this.f46754a.equals(dvVar.f46754a)) {
            return false;
        }
        if (this.f46755b == null) {
            if (dvVar.f46755b != null) {
                return false;
            }
        } else if (!this.f46755b.equals(dvVar.f46755b)) {
            return false;
        }
        if (this.f46756c == null) {
            if (dvVar.f46756c != null) {
                return false;
            }
        } else if (!this.f46756c.equals(dvVar.f46756c)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46757d, (Object[]) dvVar.f46757d)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dvVar.f47288L == null || dvVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dvVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46754a == null ? 0 : this.f46754a.intValue())) * 31) + (this.f46755b == null ? 0 : this.f46755b.hashCode())) * 31) + (this.f46756c == null ? 0 : this.f46756c.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46757d)) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46754a != null) {
            ksVar.mo32442a(1, this.f46754a.intValue());
        }
        if (this.f46755b != null) {
            ksVar.mo32445a(2, this.f46755b);
        }
        if (this.f46756c != null) {
            ksVar.mo32446a(3, this.f46756c.booleanValue());
        }
        if (this.f46757d != null && this.f46757d.length > 0) {
            for (String str : this.f46757d) {
                if (str != null) {
                    ksVar.mo32445a(4, str);
                }
            }
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46754a != null) {
            b += C16841ks.m40862b(1, this.f46754a.intValue());
        }
        if (this.f46755b != null) {
            b += C16841ks.m40864b(2, this.f46755b);
        }
        if (this.f46756c != null) {
            this.f46756c.booleanValue();
            b += C16841ks.m40861b(3) + 1;
        }
        if (this.f46757d == null || this.f46757d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.f46757d) {
            if (str != null) {
                i2++;
                i += C16841ks.m40857a(str);
            }
        }
        return b + i + (i2 * 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C16640dv mo31923a(C16839kq kqVar) throws IOException {
        int d;
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                try {
                    d = kqVar.mo32430d();
                    if (d < 0 || d > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(d);
                        sb.append(" is not a valid enum MatchType");
                    } else {
                        this.f46754a = Integer.valueOf(d);
                    }
                } catch (IllegalArgumentException unused) {
                    kqVar.mo32433e(kqVar.mo32437i());
                    mo32451a(kqVar, a);
                }
            } else if (a == 18) {
                this.f46755b = kqVar.mo32429c();
            } else if (a == 24) {
                this.f46756c = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 34) {
                int a2 = C16853ld.m40927a(kqVar, 34);
                int length = this.f46757d == null ? 0 : this.f46757d.length;
                String[] strArr = new String[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46757d, 0, strArr, 0, length);
                }
                while (length < strArr.length - 1) {
                    strArr[length] = kqVar.mo32429c();
                    kqVar.mo32421a();
                    length++;
                }
                strArr[length] = kqVar.mo32429c();
                this.f46757d = strArr;
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append(d);
        sb2.append(" is not a valid enum MatchType");
        throw new IllegalArgumentException(sb2.toString());
    }
}

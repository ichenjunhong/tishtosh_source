package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dr */
public final class C16636dr extends C16843ku<C16636dr> {

    /* renamed from: g */
    private static volatile C16636dr[] f46730g;

    /* renamed from: a */
    public Integer f46731a;

    /* renamed from: b */
    public String f46732b;

    /* renamed from: c */
    public C16637ds[] f46733c;

    /* renamed from: d */
    public C16638dt f46734d;

    /* renamed from: e */
    public Boolean f46735e;

    /* renamed from: f */
    public Boolean f46736f;

    /* renamed from: h */
    private Boolean f46737h;

    /* renamed from: a */
    public static C16636dr[] m39727a() {
        if (f46730g == null) {
            synchronized (C16847ky.f47301b) {
                if (f46730g == null) {
                    f46730g = new C16636dr[0];
                }
            }
        }
        return f46730g;
    }

    public C16636dr() {
        this.f46731a = null;
        this.f46732b = null;
        this.f46733c = C16637ds.m39731a();
        this.f46737h = null;
        this.f46734d = null;
        this.f46735e = null;
        this.f46736f = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16636dr)) {
            return false;
        }
        C16636dr drVar = (C16636dr) obj;
        if (this.f46731a == null) {
            if (drVar.f46731a != null) {
                return false;
            }
        } else if (!this.f46731a.equals(drVar.f46731a)) {
            return false;
        }
        if (this.f46732b == null) {
            if (drVar.f46732b != null) {
                return false;
            }
        } else if (!this.f46732b.equals(drVar.f46732b)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46733c, (Object[]) drVar.f46733c)) {
            return false;
        }
        if (this.f46737h == null) {
            if (drVar.f46737h != null) {
                return false;
            }
        } else if (!this.f46737h.equals(drVar.f46737h)) {
            return false;
        }
        if (this.f46734d == null) {
            if (drVar.f46734d != null) {
                return false;
            }
        } else if (!this.f46734d.equals(drVar.f46734d)) {
            return false;
        }
        if (this.f46735e == null) {
            if (drVar.f46735e != null) {
                return false;
            }
        } else if (!this.f46735e.equals(drVar.f46735e)) {
            return false;
        }
        if (this.f46736f == null) {
            if (drVar.f46736f != null) {
                return false;
            }
        } else if (!this.f46736f.equals(drVar.f46736f)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return drVar.f47288L == null || drVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(drVar.f47288L);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46731a == null ? 0 : this.f46731a.hashCode())) * 31) + (this.f46732b == null ? 0 : this.f46732b.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46733c)) * 31) + (this.f46737h == null ? 0 : this.f46737h.hashCode());
        C16638dt dtVar = this.f46734d;
        int i3 = hashCode * 31;
        if (dtVar == null) {
            i = 0;
        } else {
            i = dtVar.hashCode();
        }
        int hashCode2 = (((((i3 + i) * 31) + (this.f46735e == null ? 0 : this.f46735e.hashCode())) * 31) + (this.f46736f == null ? 0 : this.f46736f.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i2 = this.f47288L.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46731a != null) {
            ksVar.mo32442a(1, this.f46731a.intValue());
        }
        if (this.f46732b != null) {
            ksVar.mo32445a(2, this.f46732b);
        }
        if (this.f46733c != null && this.f46733c.length > 0) {
            for (C16637ds dsVar : this.f46733c) {
                if (dsVar != null) {
                    ksVar.mo32444a(3, (C16850la) dsVar);
                }
            }
        }
        if (this.f46737h != null) {
            ksVar.mo32446a(4, this.f46737h.booleanValue());
        }
        if (this.f46734d != null) {
            ksVar.mo32444a(5, (C16850la) this.f46734d);
        }
        if (this.f46735e != null) {
            ksVar.mo32446a(6, this.f46735e.booleanValue());
        }
        if (this.f46736f != null) {
            ksVar.mo32446a(7, this.f46736f.booleanValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46731a != null) {
            b += C16841ks.m40862b(1, this.f46731a.intValue());
        }
        if (this.f46732b != null) {
            b += C16841ks.m40864b(2, this.f46732b);
        }
        if (this.f46733c != null && this.f46733c.length > 0) {
            for (C16637ds dsVar : this.f46733c) {
                if (dsVar != null) {
                    b += C16841ks.m40863b(3, (C16850la) dsVar);
                }
            }
        }
        if (this.f46737h != null) {
            this.f46737h.booleanValue();
            b += C16841ks.m40861b(4) + 1;
        }
        if (this.f46734d != null) {
            b += C16841ks.m40863b(5, (C16850la) this.f46734d);
        }
        if (this.f46735e != null) {
            this.f46735e.booleanValue();
            b += C16841ks.m40861b(6) + 1;
        }
        if (this.f46736f == null) {
            return b;
        }
        this.f46736f.booleanValue();
        return b + C16841ks.m40861b(7) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46731a = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 18) {
                this.f46732b = kqVar.mo32429c();
            } else if (a == 26) {
                int a2 = C16853ld.m40927a(kqVar, 26);
                int length = this.f46733c == null ? 0 : this.f46733c.length;
                C16637ds[] dsVarArr = new C16637ds[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46733c, 0, dsVarArr, 0, length);
                }
                while (length < dsVarArr.length - 1) {
                    dsVarArr[length] = new C16637ds();
                    kqVar.mo32425a((C16850la) dsVarArr[length]);
                    kqVar.mo32421a();
                    length++;
                }
                dsVarArr[length] = new C16637ds();
                kqVar.mo32425a((C16850la) dsVarArr[length]);
                this.f46733c = dsVarArr;
            } else if (a == 32) {
                this.f46737h = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 42) {
                if (this.f46734d == null) {
                    this.f46734d = new C16638dt();
                }
                kqVar.mo32425a((C16850la) this.f46734d);
            } else if (a == 48) {
                this.f46735e = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 56) {
                this.f46736f = Boolean.valueOf(kqVar.mo32426b());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

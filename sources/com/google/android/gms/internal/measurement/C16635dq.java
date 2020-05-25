package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dq */
public final class C16635dq extends C16843ku<C16635dq> {

    /* renamed from: d */
    private static volatile C16635dq[] f46724d;

    /* renamed from: a */
    public Integer f46725a;

    /* renamed from: b */
    public C16639du[] f46726b;

    /* renamed from: c */
    public C16636dr[] f46727c;

    /* renamed from: e */
    private Boolean f46728e;

    /* renamed from: f */
    private Boolean f46729f;

    /* renamed from: a */
    public static C16635dq[] m39723a() {
        if (f46724d == null) {
            synchronized (C16847ky.f47301b) {
                if (f46724d == null) {
                    f46724d = new C16635dq[0];
                }
            }
        }
        return f46724d;
    }

    public C16635dq() {
        this.f46725a = null;
        this.f46726b = C16639du.m39739a();
        this.f46727c = C16636dr.m39727a();
        this.f46728e = null;
        this.f46729f = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16635dq)) {
            return false;
        }
        C16635dq dqVar = (C16635dq) obj;
        if (this.f46725a == null) {
            if (dqVar.f46725a != null) {
                return false;
            }
        } else if (!this.f46725a.equals(dqVar.f46725a)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46726b, (Object[]) dqVar.f46726b) || !C16847ky.m40903a((Object[]) this.f46727c, (Object[]) dqVar.f46727c)) {
            return false;
        }
        if (this.f46728e == null) {
            if (dqVar.f46728e != null) {
                return false;
            }
        } else if (!this.f46728e.equals(dqVar.f46728e)) {
            return false;
        }
        if (this.f46729f == null) {
            if (dqVar.f46729f != null) {
                return false;
            }
        } else if (!this.f46729f.equals(dqVar.f46729f)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dqVar.f47288L == null || dqVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dqVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46725a == null ? 0 : this.f46725a.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46726b)) * 31) + C16847ky.m40899a((Object[]) this.f46727c)) * 31) + (this.f46728e == null ? 0 : this.f46728e.hashCode())) * 31) + (this.f46729f == null ? 0 : this.f46729f.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46725a != null) {
            ksVar.mo32442a(1, this.f46725a.intValue());
        }
        if (this.f46726b != null && this.f46726b.length > 0) {
            for (C16639du duVar : this.f46726b) {
                if (duVar != null) {
                    ksVar.mo32444a(2, (C16850la) duVar);
                }
            }
        }
        if (this.f46727c != null && this.f46727c.length > 0) {
            for (C16636dr drVar : this.f46727c) {
                if (drVar != null) {
                    ksVar.mo32444a(3, (C16850la) drVar);
                }
            }
        }
        if (this.f46728e != null) {
            ksVar.mo32446a(4, this.f46728e.booleanValue());
        }
        if (this.f46729f != null) {
            ksVar.mo32446a(5, this.f46729f.booleanValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46725a != null) {
            b += C16841ks.m40862b(1, this.f46725a.intValue());
        }
        if (this.f46726b != null && this.f46726b.length > 0) {
            int i = b;
            for (C16639du duVar : this.f46726b) {
                if (duVar != null) {
                    i += C16841ks.m40863b(2, (C16850la) duVar);
                }
            }
            b = i;
        }
        if (this.f46727c != null && this.f46727c.length > 0) {
            for (C16636dr drVar : this.f46727c) {
                if (drVar != null) {
                    b += C16841ks.m40863b(3, (C16850la) drVar);
                }
            }
        }
        if (this.f46728e != null) {
            this.f46728e.booleanValue();
            b += C16841ks.m40861b(4) + 1;
        }
        if (this.f46729f == null) {
            return b;
        }
        this.f46729f.booleanValue();
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
                this.f46725a = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 18) {
                int a2 = C16853ld.m40927a(kqVar, 18);
                int length = this.f46726b == null ? 0 : this.f46726b.length;
                C16639du[] duVarArr = new C16639du[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46726b, 0, duVarArr, 0, length);
                }
                while (length < duVarArr.length - 1) {
                    duVarArr[length] = new C16639du();
                    kqVar.mo32425a((C16850la) duVarArr[length]);
                    kqVar.mo32421a();
                    length++;
                }
                duVarArr[length] = new C16639du();
                kqVar.mo32425a((C16850la) duVarArr[length]);
                this.f46726b = duVarArr;
            } else if (a == 26) {
                int a3 = C16853ld.m40927a(kqVar, 26);
                int length2 = this.f46727c == null ? 0 : this.f46727c.length;
                C16636dr[] drVarArr = new C16636dr[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46727c, 0, drVarArr, 0, length2);
                }
                while (length2 < drVarArr.length - 1) {
                    drVarArr[length2] = new C16636dr();
                    kqVar.mo32425a((C16850la) drVarArr[length2]);
                    kqVar.mo32421a();
                    length2++;
                }
                drVarArr[length2] = new C16636dr();
                kqVar.mo32425a((C16850la) drVarArr[length2]);
                this.f46727c = drVarArr;
            } else if (a == 32) {
                this.f46728e = Boolean.valueOf(kqVar.mo32426b());
            } else if (a == 40) {
                this.f46729f = Boolean.valueOf(kqVar.mo32426b());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.eb */
public final class C16647eb extends C16843ku<C16647eb> {

    /* renamed from: f */
    private static volatile C16647eb[] f46786f;

    /* renamed from: a */
    public C16648ec[] f46787a;

    /* renamed from: b */
    public String f46788b;

    /* renamed from: c */
    public Long f46789c;

    /* renamed from: d */
    public Long f46790d;

    /* renamed from: e */
    public Integer f46791e;

    /* renamed from: a */
    public static C16647eb[] m39767a() {
        if (f46786f == null) {
            synchronized (C16847ky.f47301b) {
                if (f46786f == null) {
                    f46786f = new C16647eb[0];
                }
            }
        }
        return f46786f;
    }

    public C16647eb() {
        this.f46787a = C16648ec.m39771a();
        this.f46788b = null;
        this.f46789c = null;
        this.f46790d = null;
        this.f46791e = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16647eb)) {
            return false;
        }
        C16647eb ebVar = (C16647eb) obj;
        if (!C16847ky.m40903a((Object[]) this.f46787a, (Object[]) ebVar.f46787a)) {
            return false;
        }
        if (this.f46788b == null) {
            if (ebVar.f46788b != null) {
                return false;
            }
        } else if (!this.f46788b.equals(ebVar.f46788b)) {
            return false;
        }
        if (this.f46789c == null) {
            if (ebVar.f46789c != null) {
                return false;
            }
        } else if (!this.f46789c.equals(ebVar.f46789c)) {
            return false;
        }
        if (this.f46790d == null) {
            if (ebVar.f46790d != null) {
                return false;
            }
        } else if (!this.f46790d.equals(ebVar.f46790d)) {
            return false;
        }
        if (this.f46791e == null) {
            if (ebVar.f46791e != null) {
                return false;
            }
        } else if (!this.f46791e.equals(ebVar.f46791e)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return ebVar.f47288L == null || ebVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(ebVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + C16847ky.m40899a((Object[]) this.f46787a)) * 31) + (this.f46788b == null ? 0 : this.f46788b.hashCode())) * 31) + (this.f46789c == null ? 0 : this.f46789c.hashCode())) * 31) + (this.f46790d == null ? 0 : this.f46790d.hashCode())) * 31) + (this.f46791e == null ? 0 : this.f46791e.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46787a != null && this.f46787a.length > 0) {
            for (C16648ec ecVar : this.f46787a) {
                if (ecVar != null) {
                    ksVar.mo32444a(1, (C16850la) ecVar);
                }
            }
        }
        if (this.f46788b != null) {
            ksVar.mo32445a(2, this.f46788b);
        }
        if (this.f46789c != null) {
            ksVar.mo32448b(3, this.f46789c.longValue());
        }
        if (this.f46790d != null) {
            ksVar.mo32448b(4, this.f46790d.longValue());
        }
        if (this.f46791e != null) {
            ksVar.mo32442a(5, this.f46791e.intValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46787a != null && this.f46787a.length > 0) {
            for (C16648ec ecVar : this.f46787a) {
                if (ecVar != null) {
                    b += C16841ks.m40863b(1, (C16850la) ecVar);
                }
            }
        }
        if (this.f46788b != null) {
            b += C16841ks.m40864b(2, this.f46788b);
        }
        if (this.f46789c != null) {
            b += C16841ks.m40866c(3, this.f46789c.longValue());
        }
        if (this.f46790d != null) {
            b += C16841ks.m40866c(4, this.f46790d.longValue());
        }
        return this.f46791e != null ? b + C16841ks.m40862b(5, this.f46791e.intValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                int a2 = C16853ld.m40927a(kqVar, 10);
                int length = this.f46787a == null ? 0 : this.f46787a.length;
                C16648ec[] ecVarArr = new C16648ec[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46787a, 0, ecVarArr, 0, length);
                }
                while (length < ecVarArr.length - 1) {
                    ecVarArr[length] = new C16648ec();
                    kqVar.mo32425a((C16850la) ecVarArr[length]);
                    kqVar.mo32421a();
                    length++;
                }
                ecVarArr[length] = new C16648ec();
                kqVar.mo32425a((C16850la) ecVarArr[length]);
                this.f46787a = ecVarArr;
            } else if (a == 18) {
                this.f46788b = kqVar.mo32429c();
            } else if (a == 24) {
                this.f46789c = Long.valueOf(kqVar.mo32432e());
            } else if (a == 32) {
                this.f46790d = Long.valueOf(kqVar.mo32432e());
            } else if (a == 40) {
                this.f46791e = Integer.valueOf(kqVar.mo32430d());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

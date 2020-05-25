package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ef */
public final class C16651ef extends C16843ku<C16651ef> {

    /* renamed from: a */
    public long[] f46841a;

    /* renamed from: b */
    public long[] f46842b;

    /* renamed from: c */
    public C16646ea[] f46843c;

    /* renamed from: d */
    public C16652eg[] f46844d;

    public C16651ef() {
        this.f46841a = C16853ld.f47308b;
        this.f46842b = C16853ld.f47308b;
        this.f46843c = C16646ea.m39763a();
        this.f46844d = C16652eg.m39785a();
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16651ef)) {
            return false;
        }
        C16651ef efVar = (C16651ef) obj;
        if (!C16847ky.m40902a(this.f46841a, efVar.f46841a) || !C16847ky.m40902a(this.f46842b, efVar.f46842b) || !C16847ky.m40903a((Object[]) this.f46843c, (Object[]) efVar.f46843c) || !C16847ky.m40903a((Object[]) this.f46844d, (Object[]) efVar.f46844d)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return efVar.f47288L == null || efVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(efVar.f47288L);
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + C16847ky.m40898a(this.f46841a)) * 31) + C16847ky.m40898a(this.f46842b)) * 31) + C16847ky.m40899a((Object[]) this.f46843c)) * 31) + C16847ky.m40899a((Object[]) this.f46844d)) * 31) + ((this.f47288L == null || this.f47288L.mo32460a()) ? 0 : this.f47288L.hashCode());
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46841a != null && this.f46841a.length > 0) {
            for (long a : this.f46841a) {
                ksVar.mo32443a(1, a);
            }
        }
        if (this.f46842b != null && this.f46842b.length > 0) {
            for (long a2 : this.f46842b) {
                ksVar.mo32443a(2, a2);
            }
        }
        if (this.f46843c != null && this.f46843c.length > 0) {
            for (C16646ea eaVar : this.f46843c) {
                if (eaVar != null) {
                    ksVar.mo32444a(3, (C16850la) eaVar);
                }
            }
        }
        if (this.f46844d != null && this.f46844d.length > 0) {
            for (C16652eg egVar : this.f46844d) {
                if (egVar != null) {
                    ksVar.mo32444a(4, (C16850la) egVar);
                }
            }
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46841a != null && this.f46841a.length > 0) {
            int i = 0;
            for (long a : this.f46841a) {
                i += C16841ks.m40855a(a);
            }
            b = b + i + (this.f46841a.length * 1);
        }
        if (this.f46842b != null && this.f46842b.length > 0) {
            int i2 = 0;
            for (long a2 : this.f46842b) {
                i2 += C16841ks.m40855a(a2);
            }
            b = b + i2 + (this.f46842b.length * 1);
        }
        if (this.f46843c != null && this.f46843c.length > 0) {
            int i3 = b;
            for (C16646ea eaVar : this.f46843c) {
                if (eaVar != null) {
                    i3 += C16841ks.m40863b(3, (C16850la) eaVar);
                }
            }
            b = i3;
        }
        if (this.f46844d != null && this.f46844d.length > 0) {
            for (C16652eg egVar : this.f46844d) {
                if (egVar != null) {
                    b += C16841ks.m40863b(4, (C16850la) egVar);
                }
            }
        }
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                int a2 = C16853ld.m40927a(kqVar, 8);
                int length = this.f46841a == null ? 0 : this.f46841a.length;
                long[] jArr = new long[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46841a, 0, jArr, 0, length);
                }
                while (length < jArr.length - 1) {
                    jArr[length] = kqVar.mo32432e();
                    kqVar.mo32421a();
                    length++;
                }
                jArr[length] = kqVar.mo32432e();
                this.f46841a = jArr;
            } else if (a == 10) {
                int c = kqVar.mo32428c(kqVar.mo32430d());
                int i = kqVar.mo32437i();
                int i2 = 0;
                while (kqVar.mo32436h() > 0) {
                    kqVar.mo32432e();
                    i2++;
                }
                kqVar.mo32433e(i);
                int length2 = this.f46841a == null ? 0 : this.f46841a.length;
                long[] jArr2 = new long[(i2 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46841a, 0, jArr2, 0, length2);
                }
                while (length2 < jArr2.length) {
                    jArr2[length2] = kqVar.mo32432e();
                    length2++;
                }
                this.f46841a = jArr2;
                kqVar.mo32431d(c);
            } else if (a == 16) {
                int a3 = C16853ld.m40927a(kqVar, 16);
                int length3 = this.f46842b == null ? 0 : this.f46842b.length;
                long[] jArr3 = new long[(a3 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f46842b, 0, jArr3, 0, length3);
                }
                while (length3 < jArr3.length - 1) {
                    jArr3[length3] = kqVar.mo32432e();
                    kqVar.mo32421a();
                    length3++;
                }
                jArr3[length3] = kqVar.mo32432e();
                this.f46842b = jArr3;
            } else if (a == 18) {
                int c2 = kqVar.mo32428c(kqVar.mo32430d());
                int i3 = kqVar.mo32437i();
                int i4 = 0;
                while (kqVar.mo32436h() > 0) {
                    kqVar.mo32432e();
                    i4++;
                }
                kqVar.mo32433e(i3);
                int length4 = this.f46842b == null ? 0 : this.f46842b.length;
                long[] jArr4 = new long[(i4 + length4)];
                if (length4 != 0) {
                    System.arraycopy(this.f46842b, 0, jArr4, 0, length4);
                }
                while (length4 < jArr4.length) {
                    jArr4[length4] = kqVar.mo32432e();
                    length4++;
                }
                this.f46842b = jArr4;
                kqVar.mo32431d(c2);
            } else if (a == 26) {
                int a4 = C16853ld.m40927a(kqVar, 26);
                int length5 = this.f46843c == null ? 0 : this.f46843c.length;
                C16646ea[] eaVarArr = new C16646ea[(a4 + length5)];
                if (length5 != 0) {
                    System.arraycopy(this.f46843c, 0, eaVarArr, 0, length5);
                }
                while (length5 < eaVarArr.length - 1) {
                    eaVarArr[length5] = new C16646ea();
                    kqVar.mo32425a((C16850la) eaVarArr[length5]);
                    kqVar.mo32421a();
                    length5++;
                }
                eaVarArr[length5] = new C16646ea();
                kqVar.mo32425a((C16850la) eaVarArr[length5]);
                this.f46843c = eaVarArr;
            } else if (a == 34) {
                int a5 = C16853ld.m40927a(kqVar, 34);
                int length6 = this.f46844d == null ? 0 : this.f46844d.length;
                C16652eg[] egVarArr = new C16652eg[(a5 + length6)];
                if (length6 != 0) {
                    System.arraycopy(this.f46844d, 0, egVarArr, 0, length6);
                }
                while (length6 < egVarArr.length - 1) {
                    egVarArr[length6] = new C16652eg();
                    kqVar.mo32425a((C16850la) egVarArr[length6]);
                    kqVar.mo32421a();
                    length6++;
                }
                egVarArr[length6] = new C16652eg();
                kqVar.mo32425a((C16850la) egVarArr[length6]);
                this.f46844d = egVarArr;
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

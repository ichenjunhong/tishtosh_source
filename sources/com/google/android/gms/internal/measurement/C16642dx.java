package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.dx */
public final class C16642dx extends C16843ku<C16642dx> {

    /* renamed from: a */
    public Long f46763a;

    /* renamed from: b */
    public String f46764b;

    /* renamed from: c */
    public C16643dy[] f46765c;

    /* renamed from: d */
    public C16641dw[] f46766d;

    /* renamed from: e */
    public C16635dq[] f46767e;

    /* renamed from: f */
    private Integer f46768f;

    /* renamed from: g */
    private String f46769g;

    /* renamed from: h */
    private Boolean f46770h;

    public C16642dx() {
        this.f46763a = null;
        this.f46764b = null;
        this.f46768f = null;
        this.f46765c = C16643dy.m39754a();
        this.f46766d = C16641dw.m39747a();
        this.f46767e = C16635dq.m39723a();
        this.f46769g = null;
        this.f46770h = null;
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16642dx)) {
            return false;
        }
        C16642dx dxVar = (C16642dx) obj;
        if (this.f46763a == null) {
            if (dxVar.f46763a != null) {
                return false;
            }
        } else if (!this.f46763a.equals(dxVar.f46763a)) {
            return false;
        }
        if (this.f46764b == null) {
            if (dxVar.f46764b != null) {
                return false;
            }
        } else if (!this.f46764b.equals(dxVar.f46764b)) {
            return false;
        }
        if (this.f46768f == null) {
            if (dxVar.f46768f != null) {
                return false;
            }
        } else if (!this.f46768f.equals(dxVar.f46768f)) {
            return false;
        }
        if (!C16847ky.m40903a((Object[]) this.f46765c, (Object[]) dxVar.f46765c) || !C16847ky.m40903a((Object[]) this.f46766d, (Object[]) dxVar.f46766d) || !C16847ky.m40903a((Object[]) this.f46767e, (Object[]) dxVar.f46767e)) {
            return false;
        }
        if (this.f46769g == null) {
            if (dxVar.f46769g != null) {
                return false;
            }
        } else if (!this.f46769g.equals(dxVar.f46769g)) {
            return false;
        }
        if (this.f46770h == null) {
            if (dxVar.f46770h != null) {
                return false;
            }
        } else if (!this.f46770h.equals(dxVar.f46770h)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return dxVar.f47288L == null || dxVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(dxVar.f47288L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f46763a == null ? 0 : this.f46763a.hashCode())) * 31) + (this.f46764b == null ? 0 : this.f46764b.hashCode())) * 31) + (this.f46768f == null ? 0 : this.f46768f.hashCode())) * 31) + C16847ky.m40899a((Object[]) this.f46765c)) * 31) + C16847ky.m40899a((Object[]) this.f46766d)) * 31) + C16847ky.m40899a((Object[]) this.f46767e)) * 31) + (this.f46769g == null ? 0 : this.f46769g.hashCode())) * 31) + (this.f46770h == null ? 0 : this.f46770h.hashCode())) * 31;
        if (this.f47288L != null && !this.f47288L.mo32460a()) {
            i = this.f47288L.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46763a != null) {
            ksVar.mo32448b(1, this.f46763a.longValue());
        }
        if (this.f46764b != null) {
            ksVar.mo32445a(2, this.f46764b);
        }
        if (this.f46768f != null) {
            ksVar.mo32442a(3, this.f46768f.intValue());
        }
        if (this.f46765c != null && this.f46765c.length > 0) {
            for (C16643dy dyVar : this.f46765c) {
                if (dyVar != null) {
                    ksVar.mo32444a(4, (C16850la) dyVar);
                }
            }
        }
        if (this.f46766d != null && this.f46766d.length > 0) {
            for (C16641dw dwVar : this.f46766d) {
                if (dwVar != null) {
                    ksVar.mo32444a(5, (C16850la) dwVar);
                }
            }
        }
        if (this.f46767e != null && this.f46767e.length > 0) {
            for (C16635dq dqVar : this.f46767e) {
                if (dqVar != null) {
                    ksVar.mo32444a(6, (C16850la) dqVar);
                }
            }
        }
        if (this.f46769g != null) {
            ksVar.mo32445a(7, this.f46769g);
        }
        if (this.f46770h != null) {
            ksVar.mo32446a(8, this.f46770h.booleanValue());
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46763a != null) {
            b += C16841ks.m40866c(1, this.f46763a.longValue());
        }
        if (this.f46764b != null) {
            b += C16841ks.m40864b(2, this.f46764b);
        }
        if (this.f46768f != null) {
            b += C16841ks.m40862b(3, this.f46768f.intValue());
        }
        if (this.f46765c != null && this.f46765c.length > 0) {
            int i = b;
            for (C16643dy dyVar : this.f46765c) {
                if (dyVar != null) {
                    i += C16841ks.m40863b(4, (C16850la) dyVar);
                }
            }
            b = i;
        }
        if (this.f46766d != null && this.f46766d.length > 0) {
            int i2 = b;
            for (C16641dw dwVar : this.f46766d) {
                if (dwVar != null) {
                    i2 += C16841ks.m40863b(5, (C16850la) dwVar);
                }
            }
            b = i2;
        }
        if (this.f46767e != null && this.f46767e.length > 0) {
            for (C16635dq dqVar : this.f46767e) {
                if (dqVar != null) {
                    b += C16841ks.m40863b(6, (C16850la) dqVar);
                }
            }
        }
        if (this.f46769g != null) {
            b += C16841ks.m40864b(7, this.f46769g);
        }
        if (this.f46770h == null) {
            return b;
        }
        this.f46770h.booleanValue();
        return b + C16841ks.m40861b(8) + 1;
    }

    /* renamed from: a */
    public final /* synthetic */ C16850la mo31923a(C16839kq kqVar) throws IOException {
        while (true) {
            int a = kqVar.mo32421a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f46763a = Long.valueOf(kqVar.mo32432e());
            } else if (a == 18) {
                this.f46764b = kqVar.mo32429c();
            } else if (a == 24) {
                this.f46768f = Integer.valueOf(kqVar.mo32430d());
            } else if (a == 34) {
                int a2 = C16853ld.m40927a(kqVar, 34);
                int length = this.f46765c == null ? 0 : this.f46765c.length;
                C16643dy[] dyVarArr = new C16643dy[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46765c, 0, dyVarArr, 0, length);
                }
                while (length < dyVarArr.length - 1) {
                    dyVarArr[length] = new C16643dy();
                    kqVar.mo32425a((C16850la) dyVarArr[length]);
                    kqVar.mo32421a();
                    length++;
                }
                dyVarArr[length] = new C16643dy();
                kqVar.mo32425a((C16850la) dyVarArr[length]);
                this.f46765c = dyVarArr;
            } else if (a == 42) {
                int a3 = C16853ld.m40927a(kqVar, 42);
                int length2 = this.f46766d == null ? 0 : this.f46766d.length;
                C16641dw[] dwVarArr = new C16641dw[(a3 + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f46766d, 0, dwVarArr, 0, length2);
                }
                while (length2 < dwVarArr.length - 1) {
                    dwVarArr[length2] = new C16641dw();
                    kqVar.mo32425a((C16850la) dwVarArr[length2]);
                    kqVar.mo32421a();
                    length2++;
                }
                dwVarArr[length2] = new C16641dw();
                kqVar.mo32425a((C16850la) dwVarArr[length2]);
                this.f46766d = dwVarArr;
            } else if (a == 50) {
                int a4 = C16853ld.m40927a(kqVar, 50);
                int length3 = this.f46767e == null ? 0 : this.f46767e.length;
                C16635dq[] dqVarArr = new C16635dq[(a4 + length3)];
                if (length3 != 0) {
                    System.arraycopy(this.f46767e, 0, dqVarArr, 0, length3);
                }
                while (length3 < dqVarArr.length - 1) {
                    dqVarArr[length3] = new C16635dq();
                    kqVar.mo32425a((C16850la) dqVarArr[length3]);
                    kqVar.mo32421a();
                    length3++;
                }
                dqVarArr[length3] = new C16635dq();
                kqVar.mo32425a((C16850la) dqVarArr[length3]);
                this.f46767e = dqVarArr;
            } else if (a == 58) {
                this.f46769g = kqVar.mo32429c();
            } else if (a == 64) {
                this.f46770h = Boolean.valueOf(kqVar.mo32426b());
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

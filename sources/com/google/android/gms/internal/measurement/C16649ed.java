package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ed */
public final class C16649ed extends C16843ku<C16649ed> {

    /* renamed from: a */
    public C16650ee[] f46798a;

    public C16649ed() {
        this.f46798a = C16650ee.m39778a();
        this.f47288L = null;
        this.f47304M = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16649ed)) {
            return false;
        }
        C16649ed edVar = (C16649ed) obj;
        if (!C16847ky.m40903a((Object[]) this.f46798a, (Object[]) edVar.f46798a)) {
            return false;
        }
        if (this.f47288L == null || this.f47288L.mo32460a()) {
            return edVar.f47288L == null || edVar.f47288L.mo32460a();
        }
        return this.f47288L.equals(edVar.f47288L);
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + C16847ky.m40899a((Object[]) this.f46798a)) * 31) + ((this.f47288L == null || this.f47288L.mo32460a()) ? 0 : this.f47288L.hashCode());
    }

    /* renamed from: a */
    public final void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f46798a != null && this.f46798a.length > 0) {
            for (C16650ee eeVar : this.f46798a) {
                if (eeVar != null) {
                    ksVar.mo32444a(1, (C16850la) eeVar);
                }
            }
        }
        super.mo31924a(ksVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo31925b() {
        int b = super.mo31925b();
        if (this.f46798a != null && this.f46798a.length > 0) {
            for (C16650ee eeVar : this.f46798a) {
                if (eeVar != null) {
                    b += C16841ks.m40863b(1, (C16850la) eeVar);
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
            if (a == 10) {
                int a2 = C16853ld.m40927a(kqVar, 10);
                int length = this.f46798a == null ? 0 : this.f46798a.length;
                C16650ee[] eeVarArr = new C16650ee[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f46798a, 0, eeVarArr, 0, length);
                }
                while (length < eeVarArr.length - 1) {
                    eeVarArr[length] = new C16650ee();
                    kqVar.mo32425a((C16850la) eeVarArr[length]);
                    kqVar.mo32421a();
                    length++;
                }
                eeVarArr[length] = new C16650ee();
                kqVar.mo32425a((C16850la) eeVarArr[length]);
                this.f46798a = eeVarArr;
            } else if (!super.mo32451a(kqVar, a)) {
                return this;
            }
        }
    }
}

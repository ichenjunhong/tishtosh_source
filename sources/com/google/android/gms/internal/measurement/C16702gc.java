package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.gc */
class C16702gc extends C16701gb {

    /* renamed from: a */
    protected final byte[] f46952a;

    C16702gc(byte[] bArr) {
        if (bArr != null) {
            this.f46952a = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo32033a() {
        return 0;
    }

    public byte zzam(int i) {
        return this.f46952a[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte mo32014a(int i) {
        return this.f46952a[i];
    }

    public int size() {
        return this.f46952a.length;
    }

    public final C16691fs zzb(int i, int i2) {
        int b = m39866b(0, i2, size());
        if (b == 0) {
            return C16691fs.zzbtq;
        }
        return new C16696fx(this.f46952a, mo32033a(), b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32017a(C16690fr frVar) throws IOException {
        frVar.mo32013a(this.f46952a, mo32033a(), size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo32016a(Charset charset) {
        return new String(this.f46952a, mo32033a(), size(), charset);
    }

    public final boolean zzue() {
        int a = mo32033a();
        return C16825kc.f47256a.mo32417a(this.f46952a, a, size() + a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C16691fs) || size() != ((C16691fs) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C16702gc)) {
            return obj.equals(this);
        }
        C16702gc gcVar = (C16702gc) obj;
        int i = this.zzbsi;
        int i2 = gcVar.zzbsi;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo32037a(gcVar, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32037a(C16691fs fsVar, int i, int i2) {
        if (i2 > fsVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > fsVar.size()) {
            int size2 = fsVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(fsVar instanceof C16702gc)) {
            return fsVar.zzb(0, i2).equals(zzb(0, i2));
        } else {
            C16702gc gcVar = (C16702gc) fsVar;
            byte[] bArr = this.f46952a;
            byte[] bArr2 = gcVar.f46952a;
            int a = mo32033a() + i2;
            int a2 = mo32033a();
            int a3 = gcVar.mo32033a();
            while (a2 < a) {
                if (bArr[a2] != bArr2[a3]) {
                    return false;
                }
                a2++;
                a3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo32015a(int i, int i2, int i3) {
        return C16743hf.m40311a(i, this.f46952a, mo32033a(), i3);
    }
}

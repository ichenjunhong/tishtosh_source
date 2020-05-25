package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

class awy extends awx {

    /* renamed from: a */
    protected final byte[] f41477a;

    awy(byte[] bArr) {
        if (bArr != null) {
            this.f41477a = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo29631a() {
        return 0;
    }

    public byte zzfi(int i) {
        return this.f41477a[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte mo29609a(int i) {
        return this.f41477a[i];
    }

    public int size() {
        return this.f41477a.length;
    }

    public final awo zzw(int i, int i2) {
        int b = m34292b(0, i2, size());
        if (b == 0) {
            return awo.zzfuo;
        }
        return new awt(this.f41477a, mo29631a(), b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29613a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f41477a, 0, bArr, 0, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29612a(awn awn) throws IOException {
        awn.mo29608a(this.f41477a, mo29631a(), size());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo29611a(Charset charset) {
        return new String(this.f41477a, mo29631a(), size(), charset);
    }

    public final boolean zzarf() {
        int a = mo29631a();
        return bbc.m35233a(this.f41477a, a, size() + a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awo) || size() != ((awo) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof awy)) {
            return obj.equals(this);
        }
        awy awy = (awy) obj;
        int i = this.zzftx;
        int i2 = awy.zzftx;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo29633a(awy, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo29633a(awo awo, int i, int i2) {
        if (i2 > awo.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > awo.size()) {
            int size2 = awo.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(awo instanceof awy)) {
            return awo.zzw(0, i2).equals(zzw(0, i2));
        } else {
            awy awy = (awy) awo;
            byte[] bArr = this.f41477a;
            byte[] bArr2 = awy.f41477a;
            int a = mo29631a() + i2;
            int a2 = mo29631a();
            int a3 = awy.mo29631a();
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
    public final int mo29610a(int i, int i2, int i3) {
        return ayb.m34765a(i, this.f41477a, mo29631a(), i3);
    }

    public final axa zzarg() {
        return axa.m34318a(this.f41477a, mo29631a(), size(), true);
    }
}

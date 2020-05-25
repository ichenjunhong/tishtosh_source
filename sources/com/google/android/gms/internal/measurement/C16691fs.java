package com.google.android.gms.internal.measurement;

import com.C2240a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.fs */
public abstract class C16691fs implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    private static final C16697fy f46935a = (C16688fp.m39858a() ? new C16703gd(null) : new C16695fw(null));

    /* renamed from: b */
    private static final Comparator<C16691fs> f46936b = new C16693fu();
    public static final C16691fs zzbtq = new C16702gc(C16743hf.f47108b);
    public int zzbsi;

    C16691fs() {
    }

    /* renamed from: a */
    static /* synthetic */ int m39865a(byte b) {
        return b & 255;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte mo32014a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo32015a(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo32016a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo32017a(C16690fr frVar) throws IOException;

    public abstract boolean equals(Object obj);

    public abstract int size();

    public abstract byte zzam(int i);

    public abstract C16691fs zzb(int i, int i2);

    public abstract boolean zzue();

    public static C16691fs zzb(byte[] bArr, int i, int i2) {
        m39866b(i, i + i2, bArr.length);
        return new C16702gc(f46935a.mo32032a(bArr, i, i2));
    }

    public static C16691fs zzga(String str) {
        return new C16702gc(str.getBytes(C16743hf.f47107a));
    }

    public final String zzud() {
        return size() == 0 ? "" : mo32016a(C16743hf.f47107a);
    }

    public final int hashCode() {
        int i = this.zzbsi;
        if (i == 0) {
            int size = size();
            i = mo32015a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzbsi = i;
        }
        return i;
    }

    /* renamed from: b */
    static C16700ga m39867b(int i) {
        return new C16700ga(i, null);
    }

    /* renamed from: b */
    static int m39866b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return C2240a.m6772a("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public /* synthetic */ Iterator iterator() {
        return new C16692ft(this);
    }
}

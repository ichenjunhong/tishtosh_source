package com.google.android.gms.internal.ads;

import com.C2240a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class awo implements Serializable, Iterable<Byte> {

    /* renamed from: a */
    private static final awu f41468a = (awi.m34267a() ? new awz(null) : new aws(null));

    /* renamed from: b */
    private static final Comparator<awo> f41469b = new awq();
    public static final awo zzfuo = new awy(ayb.f41628b);
    public int zzftx;

    awo() {
    }

    /* renamed from: a */
    static /* synthetic */ int m34291a(byte b) {
        return b & 255;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte mo29609a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo29610a(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo29611a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29612a(awn awn) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29613a(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract int size();

    public abstract boolean zzarf();

    public abstract axa zzarg();

    public abstract byte zzfi(int i);

    public abstract awo zzw(int i, int i2);

    public static awo zzi(byte[] bArr, int i, int i2) {
        m34292b(i, i + i2, bArr.length);
        return new awy(f41468a.mo29630a(bArr, i, i2));
    }

    public static awo zzy(byte[] bArr) {
        return zzi(bArr, 0, bArr.length);
    }

    public static awo zzgt(String str) {
        return new awy(str.getBytes(ayb.f41627a));
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return ayb.f41628b;
        }
        byte[] bArr = new byte[size];
        mo29613a(bArr, 0, 0, size);
        return bArr;
    }

    public final String zzare() {
        return size() == 0 ? "" : mo29611a(ayb.f41627a);
    }

    public final int hashCode() {
        int i = this.zzftx;
        if (i == 0) {
            int size = size();
            i = mo29610a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzftx = i;
        }
        return i;
    }

    /* renamed from: b */
    static aww m34293b(int i) {
        return new aww(i, null);
    }

    /* renamed from: b */
    static int m34292b(int i, int i2, int i3) {
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
        return new awp(this);
    }
}

package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.z */
public final class C29471z implements Cloneable {

    /* renamed from: a */
    public final int f77201a;

    public final int hashCode() {
        return this.f77201a;
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZipShort value: ");
        sb.append(this.f77201a);
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo59566a() {
        byte[] bArr = new byte[2];
        m69537a(this.f77201a, bArr, 0);
        return bArr;
    }

    public C29471z(int i) {
        this.f77201a = i;
    }

    /* renamed from: a */
    public static int m69535a(byte[] bArr) {
        return m69536a(bArr, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C29471z) || this.f77201a != ((C29471z) obj).f77201a) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static byte[] m69538a(int i) {
        return new byte[]{(byte) (i & NormalGiftView.ALPHA_255), (byte) ((i & 65280) >> 8)};
    }

    public C29471z(byte[] bArr, int i) {
        this.f77201a = m69536a(bArr, i);
    }

    /* renamed from: a */
    public static int m69536a(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    /* renamed from: a */
    public static void m69537a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & NormalGiftView.ALPHA_255);
        bArr[i2 + 1] = (byte) ((i & 65280) >> 8);
    }
}

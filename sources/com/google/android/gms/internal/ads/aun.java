package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class aun implements avn {

    /* renamed from: b */
    private static final int[] f41368b = m34183b(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a */
    int[] f41369a;

    /* renamed from: c */
    private final int f41370c;

    aun(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f41369a = m34183b(bArr);
            this.f41370c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    private static int m34179a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo29552a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int[] mo29553a(int[] iArr, int i);

    /* renamed from: a */
    public final byte[] mo29551a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - mo29552a()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo29552a() + bArr.length);
            mo29555a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29555a(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo29552a() >= bArr.length) {
            byte[] a = avr.m34234a(mo29552a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo29554a(a, this.f41370c + i2);
                if (i2 == i - 1) {
                    aul.m34175a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    aul.m34175a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ByteBuffer mo29554a(byte[] bArr, int i) {
        int[] a = mo29553a(m34183b(bArr), i);
        int[] iArr = (int[]) a.clone();
        m34180a(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            a[i2] = a[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a, 0, 16);
        return order;
    }

    /* renamed from: a */
    static void m34182a(int[] iArr, int[] iArr2) {
        System.arraycopy(f41368b, 0, iArr, 0, f41368b.length);
        System.arraycopy(iArr2, 0, iArr, f41368b.length, 8);
    }

    /* renamed from: a */
    static void m34180a(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m34181a(iArr2, 0, 4, 8, 12);
            m34181a(iArr2, 1, 5, 9, 13);
            m34181a(iArr2, 2, 6, 10, 14);
            m34181a(iArr2, 3, 7, 11, 15);
            m34181a(iArr2, 0, 5, 10, 15);
            m34181a(iArr2, 1, 6, 11, 12);
            m34181a(iArr2, 2, 7, 8, 13);
            m34181a(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: a */
    private static void m34181a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m34179a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m34179a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m34179a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m34179a(iArr[i2] ^ iArr[i3], 7);
    }

    /* renamed from: b */
    private static int[] m34183b(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}

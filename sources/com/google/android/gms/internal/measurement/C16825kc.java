package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.measurement.kc */
final class C16825kc {

    /* renamed from: a */
    static final C16827ke f47256a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m40764b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m40765b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m40766b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    static int m40760a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C16829kg(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    static int m40761a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f47256a.mo32415a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static void m40763a(CharSequence charSequence, ByteBuffer byteBuffer) {
        C16827ke keVar = f47256a;
        if (byteBuffer.hasArray()) {
            int arrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(m40761a(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
        } else if (byteBuffer.isDirect()) {
            keVar.mo32416a(charSequence, byteBuffer);
        } else {
            C16827ke.m40775b(charSequence, byteBuffer);
        }
    }

    static {
        C16827ke keVar;
        if (!(C16819ka.m40687a() && C16819ka.m40692b()) || C16688fp.m39858a()) {
            keVar = new C16828kf();
        } else {
            keVar = new C16830kh();
        }
        f47256a = keVar;
    }

    /* renamed from: a */
    static /* synthetic */ int m40762a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return m40764b(b);
            case 1:
                return m40765b(b, bArr[i]);
            case 2:
                return m40766b(b, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }
}

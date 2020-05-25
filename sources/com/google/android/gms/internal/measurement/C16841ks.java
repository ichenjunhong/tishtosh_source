package com.google.android.gms.internal.measurement;

import com.C2240a;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.measurement.ks */
public final class C16841ks {

    /* renamed from: a */
    final ByteBuffer f47285a;

    /* renamed from: b */
    C16709gj f47286b;

    /* renamed from: c */
    int f47287c;

    private C16841ks(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: a */
    public static int m40855a(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    public static int m40867d(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    private C16841ks(ByteBuffer byteBuffer) {
        this.f47285a = byteBuffer;
        this.f47285a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static C16841ks m40858a(byte[] bArr) {
        return m40859a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C16841ks m40859a(byte[] bArr, int i, int i2) {
        return new C16841ks(bArr, 0, i2);
    }

    /* renamed from: a */
    public final void mo32440a(int i, double d) throws IOException {
        mo32450c(i, 1);
        long doubleToLongBits = Double.doubleToLongBits(d);
        if (this.f47285a.remaining() >= 8) {
            this.f47285a.putLong(doubleToLongBits);
            return;
        }
        throw new C16842kt(this.f47285a.position(), this.f47285a.limit());
    }

    /* renamed from: a */
    public final void mo32441a(int i, float f) throws IOException {
        mo32450c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f47285a.remaining() >= 4) {
            this.f47285a.putInt(floatToIntBits);
            return;
        }
        throw new C16842kt(this.f47285a.position(), this.f47285a.limit());
    }

    /* renamed from: a */
    public final void mo32443a(int i, long j) throws IOException {
        mo32450c(i, 0);
        m40865b(j);
    }

    /* renamed from: b */
    public final void mo32448b(int i, long j) throws IOException {
        mo32450c(i, 0);
        m40865b(j);
    }

    /* renamed from: a */
    public final void mo32442a(int i, int i2) throws IOException {
        mo32450c(i, 0);
        if (i2 >= 0) {
            mo32449c(i2);
        } else {
            m40865b((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo32446a(int i, boolean z) throws IOException {
        mo32450c(i, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f47285a.hasRemaining()) {
            this.f47285a.put(b);
            return;
        }
        throw new C16842kt(this.f47285a.position(), this.f47285a.limit());
    }

    /* renamed from: a */
    public final void mo32445a(int i, String str) throws IOException {
        mo32450c(i, 2);
        try {
            int d = m40867d(str.length());
            if (d == m40867d(str.length() * 3)) {
                int position = this.f47285a.position();
                if (this.f47285a.remaining() >= d) {
                    this.f47285a.position(position + d);
                    m40860a((CharSequence) str, this.f47285a);
                    int position2 = this.f47285a.position();
                    this.f47285a.position(position);
                    mo32449c((position2 - position) - d);
                    this.f47285a.position(position2);
                    return;
                }
                throw new C16842kt(position + d, this.f47285a.limit());
            }
            mo32449c(m40856a((CharSequence) str));
            m40860a((CharSequence) str, this.f47285a);
        } catch (BufferOverflowException e) {
            C16842kt ktVar = new C16842kt(this.f47285a.position(), this.f47285a.limit());
            ktVar.initCause(e);
            throw ktVar;
        }
    }

    /* renamed from: a */
    public final void mo32444a(int i, C16850la laVar) throws IOException {
        mo32450c(i, 2);
        mo32447a(laVar);
    }

    /* renamed from: a */
    private static int m40856a(CharSequence charSequence) {
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
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
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
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    private static void m40860a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        if (!byteBuffer.isReadOnly()) {
            int i3 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i4 = remaining + arrayOffset;
                    while (i3 < length) {
                        int i5 = i3 + arrayOffset;
                        if (i5 >= i4) {
                            break;
                        }
                        char charAt = charSequence.charAt(i3);
                        if (charAt >= 128) {
                            break;
                        }
                        array[i5] = (byte) charAt;
                        i3++;
                    }
                    if (i3 == length) {
                        i = arrayOffset + length;
                    } else {
                        i = arrayOffset + i3;
                        while (i3 < length) {
                            char charAt2 = charSequence.charAt(i3);
                            if (charAt2 < 128 && i < i4) {
                                i2 = i + 1;
                                array[i] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i <= i4 - 2) {
                                int i6 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 6) | 960);
                                i = i6 + 1;
                                array[i6] = (byte) ((charAt2 & '?') | 128);
                                i3++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i <= i4 - 3) {
                                int i7 = i + 1;
                                array[i] = (byte) ((charAt2 >>> 12) | 480);
                                int i8 = i7 + 1;
                                array[i7] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i2 = i8 + 1;
                                array[i8] = (byte) ((charAt2 & '?') | 128);
                            } else if (i <= i4 - 4) {
                                int i9 = i3 + 1;
                                if (i9 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i9);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i10 = i + 1;
                                        array[i] = (byte) ((codePoint >>> 18) | 240);
                                        int i11 = i10 + 1;
                                        array[i10] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i = i12 + 1;
                                        array[i12] = (byte) ((codePoint & 63) | 128);
                                        i3 = i9;
                                        i3++;
                                    } else {
                                        i3 = i9;
                                    }
                                }
                                int i13 = i3 - 1;
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i13);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i = i2;
                            i3++;
                        }
                    }
                    byteBuffer.position(i - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt4 = charSequence.charAt(i3);
                    if (charAt4 < 128) {
                        byteBuffer.put((byte) charAt4);
                    } else if (charAt4 < 2048) {
                        byteBuffer.put((byte) ((charAt4 >>> 6) | 960));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else if (charAt4 < 55296 || 57343 < charAt4) {
                        byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                        byteBuffer.put((byte) (((charAt4 >>> 6) & 63) | 128));
                        byteBuffer.put((byte) ((charAt4 & '?') | 128));
                    } else {
                        int i14 = i3 + 1;
                        if (i14 != charSequence.length()) {
                            char charAt5 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(charAt4, charAt5)) {
                                int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                i3 = i14;
                            } else {
                                i3 = i14;
                            }
                        }
                        int i15 = i3 - 1;
                        StringBuilder sb3 = new StringBuilder(39);
                        sb3.append("Unpaired surrogate at index ");
                        sb3.append(i15);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    i3++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: a */
    public final void mo32447a(C16850la laVar) throws IOException {
        mo32449c(laVar.mo32478d());
        laVar.mo31924a(this);
    }

    /* renamed from: c */
    public static int m40866c(int i, long j) {
        return m40861b(i) + m40855a(j);
    }

    /* renamed from: b */
    public static int m40862b(int i, int i2) {
        return m40861b(i) + m40854a(i2);
    }

    /* renamed from: b */
    public static int m40864b(int i, String str) {
        return m40861b(i) + m40857a(str);
    }

    /* renamed from: b */
    public static int m40863b(int i, C16850la laVar) {
        int b = m40861b(i);
        int e = laVar.mo32479e();
        return b + m40867d(e) + e;
    }

    /* renamed from: a */
    public static int m40854a(int i) {
        if (i >= 0) {
            return m40867d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m40857a(String str) {
        int a = m40856a((CharSequence) str);
        return m40867d(a) + a;
    }

    /* renamed from: a */
    public final void mo32439a() {
        if (this.f47285a.remaining() != 0) {
            throw new IllegalStateException(C2240a.m6772a("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f47285a.remaining())}));
        }
    }

    /* renamed from: e */
    private final void m40868e(int i) throws IOException {
        byte b = (byte) i;
        if (this.f47285a.hasRemaining()) {
            this.f47285a.put(b);
            return;
        }
        throw new C16842kt(this.f47285a.position(), this.f47285a.limit());
    }

    /* renamed from: c */
    public final void mo32450c(int i, int i2) throws IOException {
        mo32449c((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m40861b(int i) {
        return m40867d(i << 3);
    }

    /* renamed from: c */
    public final void mo32449c(int i) throws IOException {
        while ((i & -128) != 0) {
            m40868e((i & 127) | 128);
            i >>>= 7;
        }
        m40868e(i);
    }

    /* renamed from: b */
    private final void m40865b(long j) throws IOException {
        while ((-128 & j) != 0) {
            m40868e((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m40868e((int) j);
    }
}

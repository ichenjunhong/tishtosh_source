package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class bbr {

    /* renamed from: a */
    final ByteBuffer f41780a;

    /* renamed from: b */
    private axf f41781b;

    /* renamed from: c */
    private int f41782c;

    private bbr(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: b */
    public static int m35320b(long j) {
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

    /* renamed from: e */
    private static int m35323e(int i) {
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

    private bbr(ByteBuffer byteBuffer) {
        this.f41780a = byteBuffer;
        this.f41780a.order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public static bbr m35312a(byte[] bArr) {
        return m35313a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static bbr m35313a(byte[] bArr, int i, int i2) {
        return new bbr(bArr, 0, i2);
    }

    /* renamed from: a */
    public final void mo30018a(int i, int i2) throws IOException {
        mo30024c(i, 0);
        if (i2 >= 0) {
            m35322d(i2);
        } else {
            mo30023a((long) i2);
        }
    }

    /* renamed from: a */
    public final void mo30021a(int i, String str) throws IOException {
        mo30024c(i, 2);
        try {
            int e = m35323e(str.length());
            if (e == m35323e(str.length() * 3)) {
                int position = this.f41780a.position();
                if (this.f41780a.remaining() >= e) {
                    this.f41780a.position(position + e);
                    m35314a((CharSequence) str, this.f41780a);
                    int position2 = this.f41780a.position();
                    this.f41780a.position(position);
                    m35322d((position2 - position) - e);
                    this.f41780a.position(position2);
                    return;
                }
                throw new bbs(position + e, this.f41780a.limit());
            }
            m35322d(m35310a((CharSequence) str));
            m35314a((CharSequence) str, this.f41780a);
        } catch (BufferOverflowException e2) {
            bbs bbs = new bbs(this.f41780a.position(), this.f41780a.limit());
            bbs.initCause(e2);
            throw bbs;
        }
    }

    /* renamed from: a */
    public final void mo30020a(int i, bby bby) throws IOException {
        mo30024c(i, 2);
        if (bby.f41795b < 0) {
            bby.mo30040c();
        }
        m35322d(bby.f41795b);
        bby.mo30026a(this);
    }

    /* renamed from: a */
    public final void mo30019a(int i, azj azj) throws IOException {
        axf axf;
        if (this.f41781b == null) {
            ByteBuffer byteBuffer = this.f41780a;
            if (byteBuffer.hasArray()) {
                axf = new C15666b(byteBuffer);
            } else if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
                throw new IllegalArgumentException("ByteBuffer is read-only");
            } else if (bba.m35162b()) {
                axf = new C15669e(byteBuffer);
            } else {
                axf = new C15668d(byteBuffer);
            }
            this.f41781b = axf;
            this.f41782c = this.f41780a.position();
        } else if (this.f41782c != this.f41780a.position()) {
            this.f41781b.mo29729b(this.f41780a.array(), this.f41782c, this.f41780a.position() - this.f41782c);
            this.f41782c = this.f41780a.position();
        }
        axf axf2 = this.f41781b;
        axf2.mo29711a(i, azj);
        axf2.mo29701a();
        this.f41782c = this.f41780a.position();
    }

    /* renamed from: a */
    public final void mo30022a(int i, byte[] bArr) throws IOException {
        mo30024c(i, 2);
        m35322d(bArr.length);
        int length = bArr.length;
        if (this.f41780a.remaining() >= length) {
            this.f41780a.put(bArr, 0, length);
            return;
        }
        throw new bbs(this.f41780a.position(), this.f41780a.limit());
    }

    /* renamed from: a */
    private static int m35310a(CharSequence charSequence) {
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
    private static void m35314a(CharSequence charSequence, ByteBuffer byteBuffer) {
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

    /* renamed from: b */
    public static int m35316b(int i, int i2) {
        return m35315b(i) + m35309a(i2);
    }

    /* renamed from: b */
    public static int m35318b(int i, String str) {
        return m35315b(i) + m35311a(str);
    }

    /* renamed from: b */
    public static int m35317b(int i, bby bby) {
        int b = m35315b(i);
        int c = bby.mo30040c();
        return b + m35323e(c) + c;
    }

    /* renamed from: b */
    public static int m35319b(int i, byte[] bArr) {
        return m35315b(i) + m35323e(bArr.length) + bArr.length;
    }

    /* renamed from: a */
    public static int m35309a(int i) {
        if (i >= 0) {
            return m35323e(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int m35311a(String str) {
        int a = m35310a((CharSequence) str);
        return m35323e(a) + a;
    }

    /* renamed from: c */
    private final void m35321c(int i) throws IOException {
        byte b = (byte) i;
        if (this.f41780a.hasRemaining()) {
            this.f41780a.put(b);
            return;
        }
        throw new bbs(this.f41780a.position(), this.f41780a.limit());
    }

    /* renamed from: c */
    public final void mo30024c(int i, int i2) throws IOException {
        m35322d((i << 3) | i2);
    }

    /* renamed from: b */
    public static int m35315b(int i) {
        return m35323e(i << 3);
    }

    /* renamed from: d */
    private final void m35322d(int i) throws IOException {
        while ((i & -128) != 0) {
            m35321c((i & 127) | 128);
            i >>>= 7;
        }
        m35321c(i);
    }

    /* renamed from: a */
    public final void mo30023a(long j) throws IOException {
        while ((-128 & j) != 0) {
            m35321c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m35321c((int) j);
    }
}

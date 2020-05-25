package okio;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-Util reason: invalid class name */
public final class Util {
    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final long and(byte b, long j) {
        return j & ((long) b);
    }

    public static final long and(int i, long j) {
        return j & ((long) i);
    }

    public static final int reverseBytes(int i) {
        return ((i & NormalGiftView.ALPHA_255) << 24) | ((-16777216 & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short reverseBytes(short s) {
        short s2 = s & 65535;
        return (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
    }

    public static final int shr(byte b, int i) {
        return b >> i;
    }

    public static final long minOf(int i, long j) {
        return Math.min((long) i, j);
    }

    public static final long minOf(long j, int i) {
        return Math.min(j, (long) i);
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static final boolean arrayRangeEquals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C52711k.m112240b(bArr, "a");
        C52711k.m112240b(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}

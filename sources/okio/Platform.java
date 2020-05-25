package okio;

import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: okio.-Platform reason: invalid class name */
public final class Platform {
    public static final String createString(char[] cArr) {
        C52711k.m112240b(cArr, "$receiver");
        return new String(cArr);
    }

    public static final int hashCode(byte[] bArr) {
        C52711k.m112240b(bArr, "a");
        return Arrays.hashCode(bArr);
    }

    public static final String toUtf8String(byte[] bArr) {
        C52711k.m112240b(bArr, "$receiver");
        return new String(bArr, C52808d.f131043a);
    }

    public static final byte[] asUtf8ToByteArray(String str) {
        C52711k.m112240b(str, "$receiver");
        byte[] bytes = str.getBytes(C52808d.f131043a);
        C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final void arraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C52711k.m112240b(bArr, "src");
        C52711k.m112240b(bArr2, "dest");
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }
}

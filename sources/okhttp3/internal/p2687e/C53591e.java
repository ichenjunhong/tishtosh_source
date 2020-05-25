package okhttp3.internal.p2687e;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.IOException;
import okhttp3.internal.C53559c;
import okio.ByteString;

/* renamed from: okhttp3.internal.e.e */
public final class C53591e {

    /* renamed from: a */
    static final ByteString f132838a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    static final String[] f132839b = new String[64];

    /* renamed from: c */
    static final String[] f132840c = new String[UnReadVideoExperiment.BROWSE_RECORD_LIST];

    /* renamed from: d */
    private static final String[] f132841d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    private C53591e() {
    }

    static {
        for (int i = 0; i < f132840c.length; i++) {
            f132840c[i] = C53559c.m113798a("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        f132839b[0] = "";
        f132839b[1] = "END_STREAM";
        int[] iArr = {1};
        f132839b[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr = f132839b;
            int i4 = i3 | 8;
            StringBuilder sb = new StringBuilder();
            sb.append(f132839b[i3]);
            sb.append("|PADDED");
            strArr[i4] = sb.toString();
        }
        f132839b[4] = "END_HEADERS";
        f132839b[32] = "PRIORITY";
        f132839b[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr2 = f132839b;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f132839b[i8]);
                sb2.append('|');
                sb2.append(f132839b[i6]);
                strArr2[i9] = sb2.toString();
                String[] strArr3 = f132839b;
                int i10 = i9 | 8;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f132839b[i8]);
                sb3.append('|');
                sb3.append(f132839b[i6]);
                sb3.append("|PADDED");
                strArr3[i10] = sb3.toString();
            }
        }
        for (int i11 = 0; i11 < f132839b.length; i11++) {
            if (f132839b[i11] == null) {
                f132839b[i11] = f132840c[i11];
            }
        }
    }

    /* renamed from: a */
    static IllegalArgumentException m113890a(String str, Object... objArr) {
        throw new IllegalArgumentException(C53559c.m113798a(str, objArr));
    }

    /* renamed from: b */
    static IOException m113892b(String str, Object... objArr) throws IOException {
        throw new IOException(C53559c.m113798a(str, objArr));
    }

    /* renamed from: a */
    static String m113891a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (b < f132841d.length) {
            str = f132841d[b];
        } else {
            str = C53559c.m113798a("0x%02x", Byte.valueOf(b));
        }
        if (b2 != 0) {
            switch (b) {
                case 2:
                case 3:
                case 7:
                case 8:
                    str2 = f132840c[b2];
                    break;
                case 4:
                case 6:
                    if (b2 != 1) {
                        str2 = f132840c[b2];
                        break;
                    } else {
                        str2 = "ACK";
                        break;
                    }
                default:
                    if (b2 < f132839b.length) {
                        str4 = f132839b[b2];
                    } else {
                        str4 = f132840c[b2];
                    }
                    if (b != 5 || (b2 & 4) == 0) {
                        if (b == 0 && (b2 & 32) != 0) {
                            str2 = str4.replace("PRIORITY", "COMPRESSED");
                            break;
                        } else {
                            str2 = str4;
                            break;
                        }
                    } else {
                        str2 = str4.replace("HEADERS", "PUSH_PROMISE");
                        break;
                    }
                    break;
            }
        } else {
            str2 = "";
        }
        String str5 = "%s 0x%08x %5d %-13s %s";
        Object[] objArr = new Object[5];
        if (z) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        objArr[0] = str3;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = str;
        objArr[4] = str2;
        return C53559c.m113798a(str5, objArr);
    }
}

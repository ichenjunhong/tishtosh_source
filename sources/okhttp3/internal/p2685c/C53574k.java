package okhttp3.internal.p2685c;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C53685z;

/* renamed from: okhttp3.internal.c.k */
public final class C53574k {

    /* renamed from: a */
    public final C53685z f132780a;

    /* renamed from: b */
    public final int f132781b;

    /* renamed from: c */
    public final String f132782c;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f132780a == C53685z.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        sb.append(str);
        sb.append(' ');
        sb.append(this.f132781b);
        if (this.f132782c != null) {
            sb.append(' ');
            sb.append(this.f132782c);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static C53574k m113855a(String str) throws IOException {
        C53685z zVar;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                StringBuilder sb = new StringBuilder("Unexpected status line: ");
                sb.append(str);
                throw new ProtocolException(sb.toString());
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                zVar = C53685z.HTTP_1_0;
            } else if (charAt == 1) {
                zVar = C53685z.HTTP_1_1;
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected status line: ");
                sb2.append(str);
                throw new ProtocolException(sb2.toString());
            }
        } else if (str.startsWith("ICY ")) {
            zVar = C53685z.HTTP_1_0;
            i = 4;
        } else {
            StringBuilder sb3 = new StringBuilder("Unexpected status line: ");
            sb3.append(str);
            throw new ProtocolException(sb3.toString());
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                String str2 = "";
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        StringBuilder sb4 = new StringBuilder("Unexpected status line: ");
                        sb4.append(str);
                        throw new ProtocolException(sb4.toString());
                    }
                }
                return new C53574k(zVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                StringBuilder sb5 = new StringBuilder("Unexpected status line: ");
                sb5.append(str);
                throw new ProtocolException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder("Unexpected status line: ");
            sb6.append(str);
            throw new ProtocolException(sb6.toString());
        }
    }

    public C53574k(C53685z zVar, int i, String str) {
        this.f132780a = zVar;
        this.f132781b = i;
        this.f132782c = str;
    }
}

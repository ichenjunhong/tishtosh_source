package okhttp3.internal;

import com.C2240a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.C53500ac;
import okhttp3.C53506ae;
import okhttp3.C53673t;
import okhttp3.C53678w;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;

/* renamed from: okhttp3.internal.c */
public final class C53559c {

    /* renamed from: a */
    public static final byte[] f132733a = new byte[0];

    /* renamed from: b */
    public static final String[] f132734b = new String[0];

    /* renamed from: c */
    public static final C53506ae f132735c = C53506ae.create((C53678w) null, f132733a);

    /* renamed from: d */
    public static final C53500ac f132736d = C53500ac.create((C53678w) null, f132733a);

    /* renamed from: e */
    public static final Charset f132737e = Charset.forName("UTF-8");

    /* renamed from: f */
    public static final Charset f132738f = Charset.forName("ISO-8859-1");

    /* renamed from: g */
    public static final TimeZone f132739g = TimeZone.getTimeZone("GMT");

    /* renamed from: h */
    public static final Comparator<String> f132740h = new Comparator<String>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    };

    /* renamed from: i */
    private static final ByteString f132741i = ByteString.decodeHex("efbbbf");

    /* renamed from: j */
    private static final ByteString f132742j = ByteString.decodeHex("feff");

    /* renamed from: k */
    private static final ByteString f132743k = ByteString.decodeHex("fffe");

    /* renamed from: l */
    private static final ByteString f132744l = ByteString.decodeHex("0000ffff");

    /* renamed from: m */
    private static final ByteString f132745m = ByteString.decodeHex("ffff0000");

    /* renamed from: n */
    private static final Charset f132746n = Charset.forName("UTF-16BE");

    /* renamed from: o */
    private static final Charset f132747o = Charset.forName("UTF-16LE");

    /* renamed from: p */
    private static final Charset f132748p = Charset.forName("UTF-32BE");

    /* renamed from: q */
    private static final Charset f132749q = Charset.forName("UTF-32LE");

    /* renamed from: r */
    private static final Pattern f132750r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: a */
    public static int m113791a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - 'A') + 10;
    }

    /* renamed from: a */
    public static void m113804a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static boolean m113808a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static void m113805a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m113806a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m113807a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m113809a(Source source, int i, TimeUnit timeUnit) {
        try {
            return m113814b(source, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m113801a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <T> List<T> m113802a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static ThreadFactory m113803a(final String str, final boolean z) {
        return new ThreadFactory() {
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    public static String[] m113810a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m113807a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static Charset m113800a(BufferedSource bufferedSource, Charset charset) throws IOException {
        if (bufferedSource.rangeEquals(0, f132741i)) {
            bufferedSource.skip((long) f132741i.size());
            return f132737e;
        } else if (bufferedSource.rangeEquals(0, f132742j)) {
            bufferedSource.skip((long) f132742j.size());
            return f132746n;
        } else if (bufferedSource.rangeEquals(0, f132743k)) {
            bufferedSource.skip((long) f132743k.size());
            return f132747o;
        } else if (bufferedSource.rangeEquals(0, f132744l)) {
            bufferedSource.skip((long) f132744l.size());
            return f132748p;
        } else if (!bufferedSource.rangeEquals(0, f132745m)) {
            return charset;
        } else {
            bufferedSource.skip((long) f132745m.size());
            return f132749q;
        }
    }

    /* renamed from: b */
    public static int m113811b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m113816c(String str) {
        return f132750r.matcher(str).matches();
    }

    /* renamed from: d */
    private static boolean m113818d(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m113797a(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            int i = 0;
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m113817d(str, 0, str.length());
            } else {
                inetAddress = m113817d(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                int i2 = 0;
                int i3 = 0;
                int i4 = -1;
                while (i2 < address.length) {
                    int i5 = i2;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i2;
                    if (i6 > i3 && i6 >= 4) {
                        i4 = i2;
                        i3 = i6;
                    }
                    i2 = i5 + 2;
                }
                Buffer buffer = new Buffer();
                while (i < address.length) {
                    if (i == i4) {
                        buffer.writeByte(58);
                        i += i3;
                        if (i == 16) {
                            buffer.writeByte(58);
                        }
                    } else {
                        if (i > 0) {
                            buffer.writeByte(58);
                        }
                        buffer.writeHexadecimalUnsignedLong((long) (((address[i] & 255) << 8) | (address[i + 1] & 255)));
                        i += 2;
                    }
                }
                return buffer.readUtf8();
            }
            StringBuilder sb = new StringBuilder("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m113818d(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m113798a(String str, Object... objArr) {
        return C2240a.m6773a(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static AssertionError m113796a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: a */
    public static String m113799a(C53673t tVar, boolean z) {
        String str;
        if (tVar.f133143d.contains(":")) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(tVar.f133143d);
            sb.append("]");
            str = sb.toString();
        } else {
            str = tVar.f133143d;
        }
        if (!z && tVar.f133144e == C53673t.m114168a(tVar.f133140a)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":");
        sb2.append(tVar.f133144e);
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m113815c(String str, int i, int i2) {
        int a = m113792a(str, i, i2);
        return str.substring(a, m113812b(str, a, i2));
    }

    /* renamed from: b */
    public static int m113812b(String str, int i, int i2) {
        int i3 = i2 - 1;
        while (i3 >= i) {
            switch (str.charAt(i3)) {
                case 9:
                case 10:
                case 12:
                case 13:
                case ' ':
                    i3--;
                default:
                    return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m113792a(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case 9:
                case 10:
                case 12:
                case 13:
                case ' ':
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m113813b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0) {
            return false;
        }
        for (String str : strArr) {
            for (String compare : strArr2) {
                if (comparator.compare(str, compare) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m113795a(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString());
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" too small.");
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: b */
    public static boolean m113814b(Source source, int i, TimeUnit timeUnit) throws IOException {
        long j;
        long nanoTime = System.nanoTime();
        if (source.timeout().hasDeadline()) {
            j = source.timeout().deadlineNanoTime() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        source.timeout().deadlineNanoTime(Math.min(j, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192) != -1) {
                buffer.clear();
            }
            if (j == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + j);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + j);
            }
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(nanoTime + j);
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        r5 = 0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.net.InetAddress m113817d(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d4
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r1) goto L_0x0033
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r0.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0033
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            if (r11 != r1) goto L_0x002f
            r8 = r7
            goto L_0x00d4
        L_0x002f:
            r8 = r7
            r9 = r11
            goto L_0x00a2
        L_0x0033:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r0.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0042
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0042:
            java.lang.String r11 = "."
            boolean r6 = r0.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a0
            int r6 = r7 + -2
            r11 = r6
        L_0x004d:
            if (r9 >= r1) goto L_0x0094
            if (r11 != r2) goto L_0x0052
            goto L_0x009a
        L_0x0052:
            if (r11 == r6) goto L_0x005f
            char r15 = r0.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005d
            goto L_0x009a
        L_0x005d:
            int r9 = r9 + 1
        L_0x005f:
            r14 = r9
            r15 = 0
        L_0x0061:
            if (r14 >= r1) goto L_0x0082
            char r5 = r0.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0082
            r4 = 57
            if (r5 > r4) goto L_0x0082
            if (r15 != 0) goto L_0x0074
            if (r9 == r14) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x007b
            goto L_0x0097
        L_0x007b:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0061
        L_0x0082:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004d
        L_0x0094:
            int r6 = r6 + r13
            if (r11 == r6) goto L_0x0099
        L_0x0097:
            r5 = 0
            goto L_0x009a
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r5 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            goto L_0x00d4
        L_0x00a0:
            return r10
        L_0x00a1:
            r9 = r6
        L_0x00a2:
            r6 = r9
            r2 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00b7
            char r4 = r0.charAt(r6)
            int r4 = m113791a(r4)
            r5 = -1
            if (r4 == r5) goto L_0x00b7
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b7:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d3
            if (r4 <= r13) goto L_0x00be
            goto L_0x00d3
        L_0x00be:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d3:
            return r10
        L_0x00d4:
            r0 = 16
            if (r7 == r0) goto L_0x00ea
            r1 = -1
            if (r8 != r1) goto L_0x00dc
            return r10
        L_0x00dc:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00ea:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00ef }
            return r0
        L_0x00ef:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.C53559c.m113817d(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: a */
    public static int m113793a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m113794a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }
}

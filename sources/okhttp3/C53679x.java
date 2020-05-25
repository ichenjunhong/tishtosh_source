package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.internal.C53559c;
import okio.BufferedSink;
import okio.ByteString;

/* renamed from: okhttp3.x */
public final class C53679x extends C53500ac {

    /* renamed from: a */
    public static final C53678w f133169a = C53678w.m114225a("multipart/mixed");

    /* renamed from: b */
    public static final C53678w f133170b = C53678w.m114225a("multipart/alternative");

    /* renamed from: c */
    public static final C53678w f133171c = C53678w.m114225a("multipart/digest");

    /* renamed from: d */
    public static final C53678w f133172d = C53678w.m114225a("multipart/parallel");

    /* renamed from: e */
    public static final C53678w f133173e = C53678w.m114225a("multipart/form-data");

    /* renamed from: h */
    private static final byte[] f133174h = {58, 32};

    /* renamed from: i */
    private static final byte[] f133175i = {13, 10};

    /* renamed from: j */
    private static final byte[] f133176j = {45, 45};

    /* renamed from: f */
    public final C53678w f133177f;

    /* renamed from: g */
    public final List<C53681b> f133178g;

    /* renamed from: k */
    private final ByteString f133179k;

    /* renamed from: l */
    private final C53678w f133180l;

    /* renamed from: m */
    private long f133181m = -1;

    /* renamed from: okhttp3.x$a */
    public static final class C53680a {

        /* renamed from: a */
        private final ByteString f133182a;

        /* renamed from: b */
        private C53678w f133183b;

        /* renamed from: c */
        private final List<C53681b> f133184c;

        public C53680a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public final C53679x mo111650a() {
            if (!this.f133184c.isEmpty()) {
                return new C53679x(this.f133182a, this.f133183b, this.f133184c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }

        private C53680a(String str) {
            this.f133183b = C53679x.f133169a;
            this.f133184c = new ArrayList();
            this.f133182a = ByteString.encodeUtf8(str);
        }

        /* renamed from: a */
        public final C53680a mo111648a(C53678w wVar) {
            if (wVar == null) {
                throw new NullPointerException("type == null");
            } else if (wVar.f133165a.equals("multipart")) {
                this.f133183b = wVar;
                return this;
            } else {
                StringBuilder sb = new StringBuilder("multipart != ");
                sb.append(wVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* renamed from: a */
        public final C53680a mo111649a(C53681b bVar) {
            if (bVar != null) {
                this.f133184c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: a */
        public final C53680a mo111645a(String str, String str2) {
            return mo111649a(C53681b.m114236a(str, str2));
        }

        /* renamed from: a */
        public final C53680a mo111647a(C53671s sVar, C53500ac acVar) {
            return mo111649a(C53681b.m114238a(sVar, acVar));
        }

        /* renamed from: a */
        public final C53680a mo111646a(String str, String str2, C53500ac acVar) {
            return mo111649a(C53681b.m114237a(str, str2, acVar));
        }
    }

    /* renamed from: okhttp3.x$b */
    public static final class C53681b {

        /* renamed from: a */
        public final C53671s f133185a;

        /* renamed from: b */
        public final C53500ac f133186b;

        private C53681b(C53671s sVar, C53500ac acVar) {
            this.f133185a = sVar;
            this.f133186b = acVar;
        }

        /* renamed from: a */
        public static C53681b m114236a(String str, String str2) {
            return m114237a(str, null, C53500ac.create((C53678w) null, str2));
        }

        /* renamed from: a */
        public static C53681b m114238a(C53671s sVar, C53500ac acVar) {
            if (acVar == null) {
                throw new NullPointerException("body == null");
            } else if (sVar != null && sVar.mo111593a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (sVar == null || sVar.mo111593a("Content-Length") == null) {
                return new C53681b(sVar, acVar);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        /* renamed from: a */
        public static C53681b m114237a(String str, String str2, C53500ac acVar) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                C53679x.m114229a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C53679x.m114229a(sb, str2);
                }
                return m114238a(C53671s.m114150a("Content-Disposition", sb.toString()), acVar);
            }
            throw new NullPointerException("name == null");
        }
    }

    public final C53678w contentType() {
        return this.f133180l;
    }

    public final long contentLength() throws IOException {
        long j = this.f133181m;
        if (j != -1) {
            return j;
        }
        long a = m114228a((BufferedSink) null, true);
        this.f133181m = a;
        return a;
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        m114228a(bufferedSink, false);
    }

    /* renamed from: a */
    static StringBuilder m114229a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
        return sb;
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [okio.BufferedSink] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v3, types: [okio.Buffer] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m114228a(okio.BufferedSink r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            okio.Buffer r13 = new okio.Buffer
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<okhttp3.x$b> r1 = r12.f133178g
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
        L_0x0015:
            if (r3 >= r1) goto L_0x00a7
            java.util.List<okhttp3.x$b> r6 = r12.f133178g
            java.lang.Object r6 = r6.get(r3)
            okhttp3.x$b r6 = (okhttp3.C53679x.C53681b) r6
            okhttp3.s r7 = r6.f133185a
            okhttp3.ac r6 = r6.f133186b
            byte[] r8 = f133176j
            r13.write(r8)
            okio.ByteString r8 = r12.f133179k
            r13.write(r8)
            byte[] r8 = f133175i
            r13.write(r8)
            if (r7 == 0) goto L_0x0059
            int r8 = r7.mo111591a()
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0059
            java.lang.String r10 = r7.mo111592a(r9)
            okio.BufferedSink r10 = r13.writeUtf8(r10)
            byte[] r11 = f133174h
            okio.BufferedSink r10 = r10.write(r11)
            java.lang.String r11 = r7.mo111594b(r9)
            okio.BufferedSink r10 = r10.writeUtf8(r11)
            byte[] r11 = f133175i
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0059:
            okhttp3.w r7 = r6.contentType()
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = "Content-Type: "
            okio.BufferedSink r8 = r13.writeUtf8(r8)
            java.lang.String r7 = r7.toString()
            okio.BufferedSink r7 = r8.writeUtf8(r7)
            byte[] r8 = f133175i
            r7.write(r8)
        L_0x0072:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            java.lang.String r9 = "Content-Length: "
            okio.BufferedSink r9 = r13.writeUtf8(r9)
            okio.BufferedSink r9 = r9.writeDecimalLong(r7)
            byte[] r10 = f133175i
            r9.write(r10)
            goto L_0x0092
        L_0x008c:
            if (r14 == 0) goto L_0x0092
            r0.clear()
            return r9
        L_0x0092:
            byte[] r9 = f133175i
            r13.write(r9)
            if (r14 == 0) goto L_0x009b
            long r4 = r4 + r7
            goto L_0x009e
        L_0x009b:
            r6.writeTo(r13)
        L_0x009e:
            byte[] r6 = f133175i
            r13.write(r6)
            int r3 = r3 + 1
            goto L_0x0015
        L_0x00a7:
            byte[] r1 = f133176j
            r13.write(r1)
            okio.ByteString r1 = r12.f133179k
            r13.write(r1)
            byte[] r1 = f133176j
            r13.write(r1)
            byte[] r1 = f133175i
            r13.write(r1)
            if (r14 == 0) goto L_0x00c5
            long r13 = r0.size()
            long r4 = r4 + r13
            r0.clear()
        L_0x00c5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53679x.m114228a(okio.BufferedSink, boolean):long");
    }

    C53679x(ByteString byteString, C53678w wVar, List<C53681b> list) {
        this.f133179k = byteString;
        this.f133177f = wVar;
        StringBuilder sb = new StringBuilder();
        sb.append(wVar);
        sb.append("; boundary=");
        sb.append(byteString.utf8());
        this.f133180l = C53678w.m114225a(sb.toString());
        this.f133178g = C53559c.m113801a(list);
    }
}

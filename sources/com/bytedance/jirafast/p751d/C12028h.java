package com.bytedance.jirafast.p751d;

import com.C2240a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

/* renamed from: com.bytedance.jirafast.d.h */
public final class C12028h {

    /* renamed from: f */
    private static final String[] f31813f = new String[0];

    /* renamed from: g */
    private static C12032c f31814g = C12032c.f31834a;

    /* renamed from: a */
    public boolean f31815a = true;

    /* renamed from: b */
    public int f31816b = VideoCacheReadBuffersizeExperiment.DEFAULT;

    /* renamed from: c */
    public long f31817c = -1;

    /* renamed from: d */
    public long f31818d;

    /* renamed from: e */
    public C12037g f31819e = C12037g.f31836a;

    /* renamed from: h */
    private HttpURLConnection f31820h;

    /* renamed from: i */
    private final URL f31821i;

    /* renamed from: j */
    private final String f31822j;

    /* renamed from: k */
    private C12036f f31823k;

    /* renamed from: l */
    private boolean f31824l;

    /* renamed from: m */
    private boolean f31825m;

    /* renamed from: n */
    private String f31826n;

    /* renamed from: o */
    private int f31827o;

    /* renamed from: com.bytedance.jirafast.d.h$a */
    public static class C12030a {

        /* renamed from: a */
        private static final byte[] f31831a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: a */
        public static String m24481a(String str) {
            byte[] bArr;
            try {
                bArr = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bArr = str.getBytes();
            }
            return m24482a(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        private static String m24482a(byte[] bArr, int i, int i2) {
            byte[] bArr2;
            if (bArr == null) {
                throw new NullPointerException("Cannot serialize a null array.");
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder("Cannot have length offset: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else if (i2 + 0 <= bArr.length) {
                int i3 = 4;
                int i4 = (i2 / 3) * 4;
                if (i2 % 3 <= 0) {
                    i3 = 0;
                }
                byte[] bArr3 = new byte[(i4 + i3)];
                int i5 = i2 - 2;
                int i6 = 0;
                int i7 = 0;
                while (i6 < i5) {
                    m24483a(bArr, i6 + 0, 3, bArr3, i7);
                    i6 += 3;
                    i7 += 4;
                }
                if (i6 < i2) {
                    m24483a(bArr, i6 + 0, i2 - i6, bArr3, i7);
                    i7 += 4;
                }
                if (i7 <= bArr3.length - 1) {
                    bArr2 = new byte[i7];
                    System.arraycopy(bArr3, 0, bArr2, 0, i7);
                } else {
                    bArr2 = bArr3;
                }
                try {
                    return new String(bArr2, "US-ASCII");
                } catch (UnsupportedEncodingException unused) {
                    return new String(bArr2);
                }
            } else {
                throw new IllegalArgumentException(C2240a.m6772a("Cannot have offset of %d and length of %d with array of length %d", new Object[]{Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        private static byte[] m24483a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            int i4;
            int i5;
            byte[] bArr3 = f31831a;
            int i6 = 0;
            if (i2 > 0) {
                i4 = (bArr[i] << 24) >>> 8;
            } else {
                i4 = 0;
            }
            if (i2 > 1) {
                i5 = (bArr[i + 1] << 24) >>> 16;
            } else {
                i5 = 0;
            }
            int i7 = i4 | i5;
            if (i2 > 2) {
                i6 = (bArr[i + 2] << 24) >>> 24;
            }
            int i8 = i7 | i6;
            switch (i2) {
                case 1:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = 61;
                    bArr2[i3 + 3] = 61;
                    return bArr2;
                case 2:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = bArr3[(i8 >>> 6) & 63];
                    bArr2[i3 + 3] = 61;
                    return bArr2;
                case 3:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = bArr3[(i8 >>> 6) & 63];
                    bArr2[i3 + 3] = bArr3[i8 & 63];
                    return bArr2;
                default:
                    return bArr2;
            }
        }
    }

    /* renamed from: com.bytedance.jirafast.d.h$b */
    protected static abstract class C12031b<V> extends C12035e<V> {

        /* renamed from: a */
        private final Closeable f31832a;

        /* renamed from: b */
        private final boolean f31833b;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo22782b() throws IOException {
            if (this.f31832a instanceof Flushable) {
                ((Flushable) this.f31832a).flush();
            }
            if (this.f31833b) {
                try {
                    this.f31832a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f31832a.close();
            }
        }

        protected C12031b(Closeable closeable, boolean z) {
            this.f31832a = closeable;
            this.f31833b = z;
        }
    }

    /* renamed from: com.bytedance.jirafast.d.h$c */
    public interface C12032c {

        /* renamed from: a */
        public static final C12032c f31834a = new C12032c() {
            /* renamed from: a */
            public final HttpURLConnection mo22783a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            /* renamed from: a */
            public final HttpURLConnection mo22784a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        /* renamed from: a */
        HttpURLConnection mo22783a(URL url) throws IOException;

        /* renamed from: a */
        HttpURLConnection mo22784a(URL url, Proxy proxy) throws IOException;
    }

    /* renamed from: com.bytedance.jirafast.d.h$d */
    public static class C12034d extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public final IOException getCause() {
            return (IOException) super.getCause();
        }

        public C12034d(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.bytedance.jirafast.d.h$e */
    protected static abstract class C12035e<V> implements Callable<V> {
        protected C12035e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract V mo22781a() throws C12034d, IOException;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo22782b() throws IOException;

        public V call() throws C12034d {
            boolean z = true;
            try {
                V a = mo22781a();
                try {
                    mo22782b();
                    return a;
                } catch (IOException e) {
                    throw new C12034d(e);
                }
            } catch (C12034d e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C12034d(e3);
            } catch (Throwable th) {
                th = th;
                mo22782b();
                throw th;
            }
        }
    }

    /* renamed from: com.bytedance.jirafast.d.h$f */
    public static class C12036f extends BufferedOutputStream {

        /* renamed from: a */
        public final CharsetEncoder f31835a;

        /* renamed from: a */
        public final C12036f mo22787a(String str) throws IOException {
            ByteBuffer encode = this.f31835a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }

        public C12036f(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f31835a = Charset.forName(C12028h.m24450a(str)).newEncoder();
        }
    }

    /* renamed from: com.bytedance.jirafast.d.h$g */
    public interface C12037g {

        /* renamed from: a */
        public static final C12037g f31836a = new C12037g() {
        };
    }

    /* renamed from: a */
    public final HttpURLConnection mo22771a() {
        if (this.f31820h == null) {
            this.f31820h = m24462g();
        }
        return this.f31820h;
    }

    /* renamed from: j */
    private int m24465j() {
        return m24455d("Content-Length");
    }

    /* renamed from: d */
    public final C12028h mo22777d() {
        mo22771a().disconnect();
        return this;
    }

    /* renamed from: i */
    private String m24464i() {
        return m24457d("Content-Type", "charset");
    }

    /* renamed from: l */
    private C12028h m24467l() throws C12034d {
        try {
            return m24466k();
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: e */
    public final String mo22778e() throws C12034d {
        return m24453b(m24464i());
    }

    /* renamed from: f */
    public final C12028h mo22779f() {
        return m24460f("application/json");
    }

    /* renamed from: b */
    public final int mo22772b() throws C12034d {
        try {
            m24466k();
            return mo22771a().getResponseCode();
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: g */
    private HttpURLConnection m24462g() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.f31826n != null) {
                httpURLConnection = f31814g.mo22784a(this.f31821i, new Proxy(Type.HTTP, new InetSocketAddress(this.f31826n, this.f31827o)));
            } else {
                httpURLConnection = f31814g.mo22783a(this.f31821i);
            }
            httpURLConnection.setRequestMethod(this.f31822j);
            return httpURLConnection;
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: k */
    private C12028h m24466k() throws IOException {
        this.f31819e = C12037g.f31836a;
        if (this.f31823k == null) {
            return this;
        }
        if (this.f31824l) {
            this.f31823k.mo22787a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f31815a) {
            try {
                this.f31823k.close();
            } catch (IOException unused) {
            }
        } else {
            this.f31823k.close();
        }
        this.f31823k = null;
        return this;
    }

    /* renamed from: m */
    private C12028h m24468m() throws IOException {
        if (this.f31823k != null) {
            return this;
        }
        mo22771a().setDoOutput(true);
        this.f31823k = new C12036f(mo22771a().getOutputStream(), m24459e(mo22771a().getRequestProperty("Content-Type"), "charset"), this.f31816b);
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo22771a().getRequestMethod());
        sb.append(' ');
        sb.append(mo22771a().getURL());
        return sb.toString();
    }

    /* renamed from: h */
    private InputStream m24463h() throws C12034d {
        InputStream inputStream;
        if (mo22772b() < 400) {
            try {
                inputStream = C12039i.m24492a(mo22771a());
            } catch (IOException e) {
                throw new C12034d(e);
            }
        } else {
            inputStream = mo22771a().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = C12039i.m24492a(mo22771a());
                } catch (IOException e2) {
                    if (m24465j() <= 0) {
                        inputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        throw new C12034d(e2);
                    }
                }
            }
        }
        if (!this.f31825m || !"gzip".equals(m24454c("Content-Encoding"))) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e3) {
            throw new C12034d(e3);
        }
    }

    /* renamed from: c */
    public final boolean mo22776c() throws C12034d {
        if (200 == mo22772b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C12028h m24446a(CharSequence charSequence) throws C12034d {
        return new C12028h(charSequence, "GET");
    }

    /* renamed from: b */
    public static C12028h m24452b(CharSequence charSequence) throws C12034d {
        return new C12028h(charSequence, "POST");
    }

    /* renamed from: e */
    private C12028h m24458e(String str) {
        return mo22769a("Authorization", str);
    }

    /* renamed from: f */
    private C12028h m24460f(String str) {
        return mo22769a("Accept", str);
    }

    /* renamed from: c */
    private String m24454c(String str) throws C12034d {
        m24467l();
        return mo22771a().getHeaderField(str);
    }

    /* renamed from: d */
    private int m24455d(String str) throws C12034d {
        m24467l();
        return mo22771a().getHeaderFieldInt(str, -1);
    }

    /* renamed from: c */
    public final C12028h mo22774c(CharSequence charSequence) throws C12034d {
        try {
            m24468m();
            this.f31823k.mo22787a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: a */
    public static String m24450a(String str) {
        if (str == null || str.length() <= 0) {
            return "UTF-8";
        }
        return str;
    }

    /* renamed from: b */
    private String m24453b(String str) throws C12034d {
        ByteArrayOutputStream byteArrayOutputStream;
        int j = m24465j();
        if (j > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(j);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            m24445a((InputStream) new BufferedInputStream(m24463h(), this.f31816b), (OutputStream) byteArrayOutputStream);
            return byteArrayOutputStream.toString(m24450a(str));
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: d */
    private static String m24456d(CharSequence charSequence) throws C12034d {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(':');
                sb.append(Integer.toString(port));
                host = sb.toString();
            }
            try {
                URI uri = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null);
                String aSCIIString = uri.toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0) {
                    return aSCIIString;
                }
                int i = indexOf + 1;
                if (i >= aSCIIString.length()) {
                    return aSCIIString;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aSCIIString.substring(0, i));
                sb2.append(aSCIIString.substring(i).replace("+", "%2B"));
                return sb2.toString();
            } catch (URISyntaxException e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new C12034d(iOException);
            }
        } catch (IOException e2) {
            throw new C12034d(e2);
        }
    }

    /* renamed from: a */
    private C12028h m24445a(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        C120291 r0 = new C12031b<C12028h>(inputStream, this.f31815a) {
            /* renamed from: a */
            public final /* synthetic */ Object mo22781a() throws C12034d, IOException {
                byte[] bArr = new byte[C12028h.this.f31816b];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return C12028h.this;
                    }
                    outputStream2.write(bArr, 0, read);
                    C12028h.this.f31818d += (long) read;
                }
            }
        };
        return (C12028h) r0.call();
    }

    /* renamed from: d */
    private String m24457d(String str, String str2) {
        return m24459e(m24454c(str), str2);
    }

    /* renamed from: f */
    private C12028h m24461f(String str, String str2) throws C12034d {
        return mo22774c((CharSequence) str).mo22774c((CharSequence) ": ").mo22774c((CharSequence) str2).mo22774c((CharSequence) "\r\n");
    }

    private C12028h(CharSequence charSequence, String str) throws C12034d {
        try {
            this.f31821i = new URL(charSequence.toString());
            this.f31822j = str;
        } catch (MalformedURLException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: c */
    public final C12028h mo22775c(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return mo22769a("Content-Type", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("; charset=");
        sb.append(str2);
        return mo22769a("Content-Type", sb.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    /* renamed from: e */
    private static java.lang.String m24459e(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0071
            int r1 = r8.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0071
        L_0x000a:
            int r1 = r8.length()
            r2 = 59
            int r3 = r8.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x0070
            if (r3 != r1) goto L_0x001b
            goto L_0x0070
        L_0x001b:
            int r5 = r8.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r8.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r8.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r8.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r8 = 2
            if (r7 <= r8) goto L_0x0065
            r8 = 0
            char r8 = r3.charAt(r8)
            r9 = 34
            if (r9 != r8) goto L_0x0065
            int r7 = r7 - r4
            char r8 = r3.charAt(r7)
            if (r9 != r8) goto L_0x0065
            java.lang.String r8 = r3.substring(r4, r7)
            return r8
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r8.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        L_0x0070:
            return r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jirafast.p751d.C12028h.m24459e(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final C12028h mo22773b(String str, String str2) {
        StringBuilder sb = new StringBuilder("Basic ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(str2);
        sb.append(C12030a.m24481a(sb2.toString()));
        return m24458e(sb.toString());
    }

    /* renamed from: a */
    private static String m24449a(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            if (charSequence2.indexOf(58) + 2 == charSequence2.lastIndexOf(47)) {
                sb.append('/');
            }
            int indexOf = charSequence2.indexOf(63);
            int length = sb.length() - 1;
            if (indexOf == -1) {
                sb.append('?');
            } else if (indexOf < length && charSequence2.charAt(length) != '&') {
                sb.append('&');
            }
            m24451a(objArr[0], objArr[1], sb);
            for (int i = 2; i < objArr.length; i += 2) {
                sb.append('&');
                m24451a(objArr[i], objArr[i + 1], sb);
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Must specify an even number of parameter names/values");
    }

    /* renamed from: a */
    public final C12028h mo22769a(String str, String str2) {
        C12039i.m24493a(mo22771a(), str, str2);
        return this;
    }

    /* renamed from: a */
    public static C12028h m24447a(CharSequence charSequence, boolean z, Object... objArr) {
        return m24446a((CharSequence) m24456d((CharSequence) m24449a(charSequence, objArr)));
    }

    /* renamed from: a */
    private static StringBuilder m24451a(Object obj, Object obj2, StringBuilder sb) {
        if (obj2 != 0 && obj2.getClass().isArray()) {
            if (obj2 instanceof Object[]) {
                obj2 = Arrays.asList((Object[]) obj2);
            } else {
                List arrayList = new ArrayList();
                int i = 0;
                if (obj2 instanceof int[]) {
                    int[] iArr = (int[]) obj2;
                    int length = iArr.length;
                    while (i < length) {
                        arrayList.add(Integer.valueOf(iArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj2;
                    int length2 = zArr.length;
                    while (i < length2) {
                        arrayList.add(Boolean.valueOf(zArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof long[]) {
                    long[] jArr = (long[]) obj2;
                    int length3 = jArr.length;
                    while (i < length3) {
                        arrayList.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof float[]) {
                    float[] fArr = (float[]) obj2;
                    int length4 = fArr.length;
                    while (i < length4) {
                        arrayList.add(Float.valueOf(fArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof double[]) {
                    double[] dArr = (double[]) obj2;
                    int length5 = dArr.length;
                    while (i < length5) {
                        arrayList.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length6 = sArr.length;
                    while (i < length6) {
                        arrayList.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length7 = bArr.length;
                    while (i < length7) {
                        arrayList.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else if (obj2 instanceof char[]) {
                    char[] cArr = (char[]) obj2;
                    int length8 = cArr.length;
                    while (i < length8) {
                        arrayList.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                }
                obj2 = arrayList;
            }
        }
        if (obj2 instanceof Iterable) {
            Iterator it = ((Iterable) obj2).iterator();
            while (it.hasNext()) {
                sb.append(obj);
                sb.append("[]=");
                Object next = it.next();
                if (next != null) {
                    sb.append(next);
                }
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        } else {
            sb.append(obj);
            sb.append("=");
            if (obj2 != 0) {
                sb.append(obj2);
            }
        }
        return sb;
    }

    /* renamed from: a */
    private C12028h m24448a(String str, String str2, String str3, InputStream inputStream) throws C12034d {
        try {
            if (!this.f31824l) {
                this.f31824l = true;
                mo22775c("multipart/form-data; boundary=00content0boundary00", null).m24468m();
                this.f31823k.mo22787a("--00content0boundary00\r\n");
            } else {
                this.f31823k.mo22787a("\r\n--00content0boundary00\r\n");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("form-data; name=\"");
            sb.append(str);
            if (str2 != null) {
                sb.append("\"; filename=\"");
                sb.append(str2);
            }
            sb.append('\"');
            m24461f("Content-Disposition", sb.toString());
            if (str3 != null) {
                m24461f("Content-Type", str3);
            }
            mo22774c((CharSequence) "\r\n");
            m24445a(inputStream, (OutputStream) this.f31823k);
            return this;
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }

    /* renamed from: a */
    public final C12028h mo22770a(String str, String str2, String str3, File file) throws C12034d {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            long length = file.length();
            if (this.f31817c == -1) {
                this.f31817c = 0;
            }
            this.f31817c += length;
            return m24448a(str, str2, str3, (InputStream) bufferedInputStream);
        } catch (IOException e) {
            throw new C12034d(e);
        }
    }
}

package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.C53500ac;
import okhttp3.C53671s;
import okhttp3.C53678w;
import okhttp3.C53679x;
import okhttp3.C53679x.C53680a;
import okio.BufferedSink;

public final class RequestBuilder {

    /* renamed from: p */
    private static final char[] f33276p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public String f33277a;

    /* renamed from: b */
    public String f33278b;

    /* renamed from: c */
    public String f33279c;

    /* renamed from: d */
    public String f33280d;

    /* renamed from: e */
    public List<C12685b> f33281e;

    /* renamed from: f */
    final MultipartTypedOutput f33282f;

    /* renamed from: g */
    public TypedOutput f33283g;

    /* renamed from: h */
    public int f33284h;

    /* renamed from: i */
    public String f33285i;

    /* renamed from: j */
    public boolean f33286j;

    /* renamed from: k */
    public int f33287k;

    /* renamed from: l */
    public boolean f33288l;

    /* renamed from: m */
    public Object f33289m;

    /* renamed from: n */
    C53680a f33290n;

    /* renamed from: o */
    public C53500ac f33291o;

    /* renamed from: q */
    private final C12748h f33292q;

    /* renamed from: r */
    private StringBuilder f33293r;

    /* renamed from: s */
    private String f33294s;

    /* renamed from: t */
    private final boolean f33295t;

    /* renamed from: u */
    private final FormUrlEncodedTypedOutput f33296u;

    /* renamed from: v */
    private boolean f33297v;

    /* renamed from: w */
    private Map<Class<?>, Object> f33298w = new LinkedHashMap();

    static class MimeOverridingTypedOutput implements TypedOutput {
        private final TypedOutput delegate;
        private final String mimeType;

        public String mimeType() {
            return this.mimeType;
        }

        public String fileName() {
            return this.delegate.fileName();
        }

        public long length() {
            return this.delegate.length();
        }

        public String md5Stub() {
            return this.delegate.md5Stub();
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            this.delegate.writeTo(outputStream);
        }

        MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }
    }

    /* renamed from: com.bytedance.retrofit2.RequestBuilder$a */
    static class C12669a extends C53500ac {

        /* renamed from: a */
        private final C53500ac f33299a;

        /* renamed from: b */
        private final String f33300b;

        public final long contentLength() throws IOException {
            return this.f33299a.contentLength();
        }

        public final C53678w contentType() {
            return C53678w.m114225a(this.f33300b);
        }

        public final void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f33299a.writeTo(bufferedSink);
        }

        C12669a(C53500ac acVar, String str) {
            this.f33299a = acVar;
            this.f33300b = str;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23821a() {
        this.f33297v = true;
    }

    /* JADX WARNING: type inference failed for: r14v6, types: [com.bytedance.retrofit2.mime.TypedOutput] */
    /* JADX WARNING: type inference failed for: r14v7 */
    /* JADX WARNING: type inference failed for: r14v8 */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.bytedance.retrofit2.mime.TypedOutput] */
    /* JADX WARNING: type inference failed for: r14v10, types: [com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput] */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.bytedance.retrofit2.RequestBuilder$MimeOverridingTypedOutput] */
    /* JADX WARNING: type inference failed for: r14v12 */
    /* JADX WARNING: type inference failed for: r14v27 */
    /* JADX WARNING: type inference failed for: r14v28 */
    /* JADX WARNING: type inference failed for: r14v29 */
    /* JADX WARNING: type inference failed for: r14v30 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r14v11
      assigns: []
      uses: []
      mth insns count: 165
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.p830a.C12686c mo23820a(com.bytedance.retrofit2.C12757k r14) {
        /*
            r13 = this;
            com.bytedance.retrofit2.mime.MultipartTypedOutput r14 = r13.f33282f
            if (r14 == 0) goto L_0x0019
            com.bytedance.retrofit2.mime.MultipartTypedOutput r14 = r13.f33282f
            int r14 = r14.getPartCount()
            if (r14 != 0) goto L_0x0019
            boolean r14 = r13.f33297v
            if (r14 == 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Multipart requests must contain at least one part."
            r14.<init>(r0)
            throw r14
        L_0x0019:
            com.bytedance.retrofit2.h r14 = r13.f33292q
            java.lang.String r14 = r14.mo23904a()
            boolean r0 = com.bytedance.retrofit2.C12787p.m25633b()
            if (r0 == 0) goto L_0x009d
            okhttp3.t r0 = okhttp3.C53673t.m114180f(r14)
            if (r0 == 0) goto L_0x007f
            java.lang.String r1 = r0.mo111619f()
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r0.mo111619f()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x004d
            java.lang.String r1 = "/"
            java.lang.String r2 = r13.f33279c
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004d
            java.lang.String r0 = r13.f33279c
            java.lang.StringBuilder r14 = m25479b(r14, r0)
            goto L_0x00fa
        L_0x004d:
            java.lang.String r14 = r13.f33279c
            okhttp3.t r14 = r0.mo111615d(r14)
            if (r14 == 0) goto L_0x0061
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
        L_0x005e:
            r14 = r0
            goto L_0x00fa
        L_0x0061:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", Relative: "
            r1.append(r0)
            java.lang.String r0 = r13.f33279c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L_0x007f:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed URL. Base: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", Relative: "
            r1.append(r0)
            java.lang.String r0 = r13.f33279c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L_0x009d:
            java.net.URI r0 = java.net.URI.create(r14)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r1 = r0.getPath()     // Catch:{ Throwable -> 0x00d3 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = r0.getPath()     // Catch:{ Throwable -> 0x00d3 }
            int r1 = r1.length()     // Catch:{ Throwable -> 0x00d3 }
            if (r1 <= 0) goto L_0x00c2
            java.lang.String r1 = "/"
            java.lang.String r2 = r13.f33279c     // Catch:{ Throwable -> 0x00d3 }
            boolean r1 = r1.equals(r2)     // Catch:{ Throwable -> 0x00d3 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r0 = r13.f33279c     // Catch:{ Throwable -> 0x00d3 }
            java.lang.StringBuilder r0 = m25479b(r14, r0)     // Catch:{ Throwable -> 0x00d3 }
            goto L_0x005e
        L_0x00c2:
            java.lang.String r1 = r13.f33279c     // Catch:{ Throwable -> 0x00d3 }
            java.net.URI r0 = r0.resolve(r1)     // Catch:{ Throwable -> 0x00d3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d3 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00d3 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x00d3 }
            r14 = r1
            goto L_0x00fa
        L_0x00d3:
            java.lang.String r0 = r13.f33279c
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = r13.f33279c
            java.lang.String r1 = "http://"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L_0x00ec
            java.lang.String r0 = r13.f33279c
            java.lang.String r1 = "https://"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x00f4
        L_0x00ec:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = r13.f33279c
            r14.<init>(r0)
            goto L_0x00fa
        L_0x00f4:
            java.lang.String r0 = r13.f33279c
            java.lang.StringBuilder r14 = m25479b(r14, r0)
        L_0x00fa:
            java.lang.StringBuilder r0 = r13.f33293r
            r1 = 0
            if (r0 == 0) goto L_0x011c
            char r2 = r0.charAt(r1)
            r3 = 63
            if (r3 != r2) goto L_0x0119
            java.lang.String r2 = r13.f33279c
            if (r2 == 0) goto L_0x0119
            java.lang.String r2 = r13.f33279c
            int r2 = r2.indexOf(r3)
            r3 = -1
            if (r2 == r3) goto L_0x0119
            r2 = 38
            r0.setCharAt(r1, r2)
        L_0x0119:
            r14.append(r0)
        L_0x011c:
            java.lang.String r0 = r13.f33280d
            if (r0 == 0) goto L_0x0123
            r14.append(r0)
        L_0x0123:
            java.lang.String r14 = r14.toString()
            r13.f33278b = r14
            com.bytedance.retrofit2.mime.TypedOutput r14 = r13.f33283g
            java.util.List<com.bytedance.retrofit2.a.b> r0 = r13.f33281e
            okhttp3.ac r2 = r13.f33291o
            boolean r3 = r13.f33297v
            r4 = 0
            if (r3 == 0) goto L_0x015c
            if (r2 != 0) goto L_0x014b
            okhttp3.x$a r3 = r13.f33290n
            if (r3 == 0) goto L_0x0141
            okhttp3.x$a r1 = r13.f33290n
            okhttp3.x r2 = r1.mo111650a()
            goto L_0x014b
        L_0x0141:
            boolean r3 = r13.f33295t
            if (r3 == 0) goto L_0x014b
            byte[] r1 = new byte[r1]
            okhttp3.ac r2 = okhttp3.C53500ac.create(r4, r1)
        L_0x014b:
            r4 = r2
            if (r4 == 0) goto L_0x017f
            java.lang.String r1 = r13.f33294s
            if (r1 == 0) goto L_0x017f
            com.bytedance.retrofit2.RequestBuilder$a r1 = new com.bytedance.retrofit2.RequestBuilder$a
            java.lang.String r2 = r13.f33294s
            r1.<init>(r4, r2)
            r3 = r0
            r5 = r1
            goto L_0x0181
        L_0x015c:
            java.lang.String r1 = r13.f33294s
            if (r1 == 0) goto L_0x017f
            if (r14 == 0) goto L_0x016c
            com.bytedance.retrofit2.RequestBuilder$MimeOverridingTypedOutput r1 = new com.bytedance.retrofit2.RequestBuilder$MimeOverridingTypedOutput
            java.lang.String r2 = r13.f33294s
            r1.<init>(r14, r2)
            r3 = r0
            r14 = r1
            goto L_0x0180
        L_0x016c:
            com.bytedance.retrofit2.a.b r1 = new com.bytedance.retrofit2.a.b
            java.lang.String r2 = "Content-Type"
            java.lang.String r3 = r13.f33294s
            r1.<init>(r2, r3)
            if (r0 != 0) goto L_0x017c
            java.util.List r0 = java.util.Collections.singletonList(r1)
            goto L_0x017f
        L_0x017c:
            r0.add(r1)
        L_0x017f:
            r3 = r0
        L_0x0180:
            r5 = r4
        L_0x0181:
            if (r14 != 0) goto L_0x019b
            java.lang.String r0 = r13.f33277a
            boolean r0 = com.bytedance.retrofit2.C12801w.m25701a(r0)
            if (r0 == 0) goto L_0x019b
            boolean r0 = r13.f33297v
            if (r0 != 0) goto L_0x019b
            com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput r14 = new com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput
            r14.<init>()
            java.lang.String r0 = "body"
            java.lang.String r1 = "null"
            r14.addField(r0, r1)
        L_0x019b:
            r4 = r14
            com.bytedance.retrofit2.a.c r14 = new com.bytedance.retrofit2.a.c
            java.lang.String r1 = r13.f33277a
            java.lang.String r2 = r13.f33278b
            int r6 = r13.f33284h
            boolean r7 = r13.f33286j
            int r8 = r13.f33287k
            boolean r9 = r13.f33288l
            java.lang.Object r10 = r13.f33289m
            java.lang.String r11 = r13.f33285i
            java.util.Map<java.lang.Class<?>, java.lang.Object> r12 = r13.f33298w
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.RequestBuilder.mo23820a(com.bytedance.retrofit2.k):com.bytedance.retrofit2.a.c");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23825a(C53671s sVar, C53500ac acVar) {
        this.f33290n.mo111647a(sVar, acVar);
    }

    /* renamed from: a */
    public final <T> void mo23822a(Class<? super T> cls, T t) {
        this.f33298w.put(cls, cls.cast(t));
    }

    /* renamed from: b */
    private static StringBuilder m25479b(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(str2);
        return sb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23823a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if ("Content-Type".equalsIgnoreCase(str)) {
            this.f33294s = str2;
        } else {
            List list = this.f33281e;
            if (list == null) {
                list = new ArrayList(2);
                this.f33281e = list;
            }
            list.add(new C12685b(str, str2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo23826b(String str, String str2, boolean z) {
        this.f33296u.addField(str, z, str2.toString(), z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo23824a(String str, String str2, boolean z) {
        char c;
        if (str != null) {
            try {
                StringBuilder sb = this.f33293r;
                if (sb == null) {
                    sb = new StringBuilder();
                    this.f33293r = sb;
                }
                if (sb.length() > 0) {
                    c = '&';
                } else {
                    c = '?';
                }
                sb.append(c);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                }
                if (z) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                if (str2 != null) {
                    if (!str2.isEmpty()) {
                        sb.append(str);
                        sb.append('=');
                        sb.append(str2);
                        return;
                    }
                }
                sb.append(str);
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb2 = new StringBuilder("Unable to convert query parameter \"");
                sb2.append(str);
                sb2.append("\" value to UTF-8: ");
                sb2.append(str2);
                throw new RuntimeException(sb2.toString(), e);
            }
        } else {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
    }

    RequestBuilder(String str, C12748h hVar, String str2, List<C12685b> list, String str3, int i, boolean z, int i2, boolean z2, Object obj, boolean z3, boolean z4, boolean z5, String str4) {
        this.f33277a = str;
        this.f33292q = hVar;
        this.f33279c = str2;
        this.f33294s = str3;
        this.f33284h = i;
        this.f33286j = z;
        this.f33287k = i2;
        this.f33288l = z2;
        this.f33289m = obj;
        this.f33295t = z3;
        this.f33281e = list;
        this.f33285i = str4;
        if (z4) {
            this.f33296u = new FormUrlEncodedTypedOutput();
            this.f33282f = null;
            this.f33283g = this.f33296u;
            this.f33290n = null;
        } else if (z5) {
            this.f33296u = null;
            this.f33282f = new MultipartTypedOutput();
            this.f33283g = this.f33282f;
            this.f33290n = new C53680a();
            this.f33290n.mo111648a(C53679x.f133173e);
        } else {
            this.f33296u = null;
            this.f33282f = null;
            this.f33290n = null;
        }
    }
}

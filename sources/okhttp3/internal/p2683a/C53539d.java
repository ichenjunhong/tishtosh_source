package okhttp3.internal.p2683a;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2688f.C53623a;
import okhttp3.internal.p2689g.C53634f;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.a.d */
public final class C53539d implements Closeable, Flushable {

    /* renamed from: a */
    static final Pattern f132637a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: m */
    static final /* synthetic */ boolean f132638m = (!C53539d.class.desiredAssertionStatus());

    /* renamed from: b */
    final C53623a f132639b;

    /* renamed from: c */
    public final File f132640c;

    /* renamed from: d */
    final int f132641d;

    /* renamed from: e */
    BufferedSink f132642e;

    /* renamed from: f */
    final LinkedHashMap<String, C53544b> f132643f = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: g */
    int f132644g;

    /* renamed from: h */
    boolean f132645h;

    /* renamed from: i */
    boolean f132646i;

    /* renamed from: j */
    boolean f132647j;

    /* renamed from: k */
    boolean f132648k;

    /* renamed from: l */
    boolean f132649l;

    /* renamed from: n */
    private final File f132650n;

    /* renamed from: o */
    private final File f132651o;

    /* renamed from: p */
    private final File f132652p;

    /* renamed from: q */
    private final int f132653q;

    /* renamed from: r */
    private long f132654r;

    /* renamed from: s */
    private long f132655s;

    /* renamed from: t */
    private long f132656t = 0;

    /* renamed from: u */
    private final Executor f132657u;

    /* renamed from: v */
    private final Runnable f132658v = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r4.f132659a.f132649l = true;
            r4.f132659a.f132642e = okio.Okio.buffer(okio.Okio.blackhole());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                okhttp3.internal.a.d r0 = okhttp3.internal.p2683a.C53539d.this
                monitor-enter(r0)
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ all -> 0x0041 }
                boolean r1 = r1.f132646i     // Catch:{ all -> 0x0041 }
                r2 = 1
                r1 = r1 ^ r2
                okhttp3.internal.a.d r3 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ all -> 0x0041 }
                boolean r3 = r3.f132647j     // Catch:{ all -> 0x0041 }
                r1 = r1 | r3
                if (r1 == 0) goto L_0x0012
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                return
            L_0x0012:
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ IOException -> 0x0018 }
                r1.mo111357c()     // Catch:{ IOException -> 0x0018 }
                goto L_0x001c
            L_0x0018:
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ all -> 0x0041 }
                r1.f132648k = r2     // Catch:{ all -> 0x0041 }
            L_0x001c:
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ IOException -> 0x002f }
                boolean r1 = r1.mo111356b()     // Catch:{ IOException -> 0x002f }
                if (r1 == 0) goto L_0x003f
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ IOException -> 0x002f }
                r1.mo111352a()     // Catch:{ IOException -> 0x002f }
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ IOException -> 0x002f }
                r3 = 0
                r1.f132644g = r3     // Catch:{ IOException -> 0x002f }
                goto L_0x003f
            L_0x002f:
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ all -> 0x0041 }
                r1.f132649l = r2     // Catch:{ all -> 0x0041 }
                okhttp3.internal.a.d r1 = okhttp3.internal.p2683a.C53539d.this     // Catch:{ all -> 0x0041 }
                okio.Sink r2 = okio.Okio.blackhole()     // Catch:{ all -> 0x0041 }
                okio.BufferedSink r2 = okio.Okio.buffer(r2)     // Catch:{ all -> 0x0041 }
                r1.f132642e = r2     // Catch:{ all -> 0x0041 }
            L_0x003f:
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                return
            L_0x0041:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0041 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53539d.C535401.run():void");
        }
    };

    /* renamed from: okhttp3.internal.a.d$a */
    public final class C53542a {

        /* renamed from: a */
        final C53544b f132662a;

        /* renamed from: b */
        final boolean[] f132663b;

        /* renamed from: d */
        private boolean f132665d;

        /* renamed from: b */
        public final void mo111365b() throws IOException {
            synchronized (C53539d.this) {
                if (!this.f132665d) {
                    if (this.f132662a.f132672f == this) {
                        C53539d.this.mo111353a(this, true);
                    }
                    this.f132665d = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111364a() {
            if (this.f132662a.f132672f == this) {
                for (int i = 0; i < C53539d.this.f132641d; i++) {
                    try {
                        C53539d.this.f132639b.mo111496d(this.f132662a.f132670d[i]);
                    } catch (IOException unused) {
                    }
                }
                this.f132662a.f132672f = null;
            }
        }

        /* renamed from: c */
        public final void mo111366c() throws IOException {
            synchronized (C53539d.this) {
                if (!this.f132665d) {
                    if (this.f132662a.f132672f == this) {
                        C53539d.this.mo111353a(this, false);
                    }
                    this.f132665d = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: a */
        public final Sink mo111363a(int i) {
            synchronized (C53539d.this) {
                if (this.f132665d) {
                    throw new IllegalStateException();
                } else if (this.f132662a.f132672f != this) {
                    Sink blackhole = Okio.blackhole();
                    return blackhole;
                } else {
                    if (!this.f132662a.f132671e) {
                        this.f132663b[i] = true;
                    }
                    try {
                        C535431 r1 = new C53546e(C53539d.this.f132639b.mo111494b(this.f132662a.f132670d[i])) {
                            /* access modifiers changed from: protected */
                            /* renamed from: a */
                            public final void mo111362a(IOException iOException) {
                                synchronized (C53539d.this) {
                                    C53542a.this.mo111364a();
                                }
                            }
                        };
                        return r1;
                    } catch (FileNotFoundException unused) {
                        return Okio.blackhole();
                    }
                }
            }
        }

        C53542a(C53544b bVar) {
            boolean[] zArr;
            this.f132662a = bVar;
            if (bVar.f132671e) {
                zArr = null;
            } else {
                zArr = new boolean[C53539d.this.f132641d];
            }
            this.f132663b = zArr;
        }
    }

    /* renamed from: okhttp3.internal.a.d$b */
    final class C53544b {

        /* renamed from: a */
        final String f132667a;

        /* renamed from: b */
        final long[] f132668b;

        /* renamed from: c */
        final File[] f132669c;

        /* renamed from: d */
        final File[] f132670d;

        /* renamed from: e */
        boolean f132671e;

        /* renamed from: f */
        C53542a f132672f;

        /* renamed from: g */
        long f132673g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C53545c mo111367a() {
            if (Thread.holdsLock(C53539d.this)) {
                Source[] sourceArr = new Source[C53539d.this.f132641d];
                long[] jArr = (long[]) this.f132668b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C53539d.this.f132641d) {
                    try {
                        sourceArr[i2] = C53539d.this.f132639b.mo111492a(this.f132669c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C53539d.this.f132641d && sourceArr[i] != null) {
                            C53559c.m113805a((Closeable) sourceArr[i]);
                            i++;
                        }
                        try {
                            C53539d.this.mo111354a(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                C53545c cVar = new C53545c(this.f132667a, this.f132673g, sourceArr, jArr);
                return cVar;
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        private static IOException m113735b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111368a(BufferedSink bufferedSink) throws IOException {
            for (long writeDecimalLong : this.f132668b) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111369a(String[] strArr) throws IOException {
            if (strArr.length == C53539d.this.f132641d) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f132668b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m113735b(strArr);
                    }
                }
                return;
            }
            throw m113735b(strArr);
        }

        C53544b(String str) {
            this.f132667a = str;
            this.f132668b = new long[C53539d.this.f132641d];
            this.f132669c = new File[C53539d.this.f132641d];
            this.f132670d = new File[C53539d.this.f132641d];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C53539d.this.f132641d; i++) {
                sb.append(i);
                this.f132669c[i] = new File(C53539d.this.f132640c, sb.toString());
                sb.append(".tmp");
                this.f132670d[i] = new File(C53539d.this.f132640c, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: okhttp3.internal.a.d$c */
    public final class C53545c implements Closeable {

        /* renamed from: a */
        public final String f132675a;

        /* renamed from: b */
        public final long f132676b;

        /* renamed from: d */
        private final Source[] f132678d;

        /* renamed from: e */
        private final long[] f132679e;

        public final void close() {
            for (Source a : this.f132678d) {
                C53559c.m113805a((Closeable) a);
            }
        }

        /* renamed from: a */
        public final Source mo111370a(int i) {
            return this.f132678d[i];
        }

        C53545c(String str, long j, Source[] sourceArr, long[] jArr) {
            this.f132675a = str;
            this.f132676b = j;
            this.f132678d = sourceArr;
            this.f132679e = jArr;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo111354a(C53544b bVar) throws IOException {
        if (bVar.f132672f != null) {
            bVar.f132672f.mo111364a();
        }
        for (int i = 0; i < this.f132641d; i++) {
            this.f132639b.mo111496d(bVar.f132669c[i]);
            this.f132655s -= bVar.f132668b[i];
            bVar.f132668b[i] = 0;
        }
        this.f132644g++;
        this.f132642e.writeUtf8("REMOVE").writeByte(32).writeUtf8(bVar.f132667a).writeByte(10);
        this.f132643f.remove(bVar.f132667a);
        if (mo111356b()) {
            this.f132657u.execute(this.f132658v);
        }
        return true;
    }

    /* renamed from: h */
    private synchronized boolean m113718h() {
        return this.f132647j;
    }

    /* renamed from: f */
    private BufferedSink m113716f() throws FileNotFoundException {
        return Okio.buffer((Sink) new C53546e(this.f132639b.mo111495c(this.f132650n)) {

            /* renamed from: a */
            static final /* synthetic */ boolean f132660a = (!C53539d.class.desiredAssertionStatus());

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final void mo111362a(IOException iOException) {
                if (f132660a || Thread.holdsLock(C53539d.this)) {
                    C53539d.this.f132645h = true;
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    /* renamed from: i */
    private synchronized void m113719i() {
        if (m113718h()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo111356b() {
        if (this.f132644g < 2000 || this.f132644g < this.f132643f.size()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo111357c() throws IOException {
        while (this.f132655s > this.f132654r) {
            mo111354a((C53544b) this.f132643f.values().iterator().next());
        }
        this.f132648k = false;
    }

    public final synchronized void flush() throws IOException {
        if (this.f132646i) {
            m113719i();
            mo111357c();
            this.f132642e.flush();
        }
    }

    /* renamed from: g */
    private void m113717g() throws IOException {
        this.f132639b.mo111496d(this.f132651o);
        Iterator it = this.f132643f.values().iterator();
        while (it.hasNext()) {
            C53544b bVar = (C53544b) it.next();
            int i = 0;
            if (bVar.f132672f == null) {
                while (i < this.f132641d) {
                    this.f132655s += bVar.f132668b[i];
                    i++;
                }
            } else {
                bVar.f132672f = null;
                while (i < this.f132641d) {
                    this.f132639b.mo111496d(bVar.f132669c[i]);
                    this.f132639b.mo111496d(bVar.f132670d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void close() throws IOException {
        C53544b[] bVarArr;
        if (this.f132646i) {
            if (!this.f132647j) {
                for (C53544b bVar : (C53544b[]) this.f132643f.values().toArray(new C53544b[this.f132643f.size()])) {
                    if (bVar.f132672f != null) {
                        bVar.f132672f.mo111366c();
                    }
                }
                mo111357c();
                this.f132642e.close();
                this.f132642e = null;
                this.f132647j = true;
                return;
            }
        }
        this.f132647j = true;
    }

    /* renamed from: d */
    private synchronized void m113713d() throws IOException {
        if (!f132638m) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.f132646i) {
            if (this.f132639b.mo111497e(this.f132652p)) {
                if (this.f132639b.mo111497e(this.f132650n)) {
                    this.f132639b.mo111496d(this.f132652p);
                } else {
                    this.f132639b.mo111493a(this.f132652p, this.f132650n);
                }
            }
            if (this.f132639b.mo111497e(this.f132650n)) {
                try {
                    m113715e();
                    m113717g();
                    this.f132646i = true;
                    return;
                } catch (IOException e) {
                    C53634f c = C53634f.m114048c();
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(this.f132640c);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    c.mo111504a(5, sb.toString(), (Throwable) e);
                    close();
                    this.f132639b.mo111499g(this.f132640c);
                    this.f132647j = false;
                } catch (Throwable th) {
                    this.f132647j = false;
                    throw th;
                }
            }
            mo111352a();
            this.f132646i = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:48|49|(1:51)(1:52)|53|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r9.f132644g = r1 - r9.f132643f.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r0.exhausted() == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0112, code lost:
        mo111352a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        r9.f132642e = m113716f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0103 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:55:0x0120=Splitter:B:55:0x0120, B:13:0x0051=Splitter:B:13:0x0051} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m113715e() throws java.io.IOException {
        /*
            r9 = this;
            okhttp3.internal.f.a r0 = r9.f132639b
            java.io.File r1 = r9.f132650n
            okio.Source r0 = r0.mo111492a(r1)
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            java.lang.String r1 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x0151 }
            java.lang.String r2 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x0151 }
            java.lang.String r4 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x0151 }
            java.lang.String r5 = r0.readUtf8LineStrict()     // Catch:{ all -> 0x0151 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0151 }
            if (r6 == 0) goto L_0x0120
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0151 }
            if (r6 == 0) goto L_0x0120
            int r6 = r9.f132653q     // Catch:{ all -> 0x0151 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0151 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0151 }
            if (r3 == 0) goto L_0x0120
            int r3 = r9.f132641d     // Catch:{ all -> 0x0151 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0151 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0151 }
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0151 }
            if (r3 == 0) goto L_0x0120
            r1 = 0
        L_0x0051:
            java.lang.String r2 = r0.readUtf8LineStrict()     // Catch:{ EOFException -> 0x0103 }
            r3 = 32
            int r4 = r2.indexOf(r3)     // Catch:{ EOFException -> 0x0103 }
            r5 = -1
            if (r4 == r5) goto L_0x00ef
            int r6 = r4 + 1
            int r3 = r2.indexOf(r3, r6)     // Catch:{ EOFException -> 0x0103 }
            if (r3 != r5) goto L_0x007b
            java.lang.String r6 = r2.substring(r6)     // Catch:{ EOFException -> 0x0103 }
            r7 = 6
            if (r4 != r7) goto L_0x007f
            java.lang.String r7 = "REMOVE"
            boolean r7 = r2.startsWith(r7)     // Catch:{ EOFException -> 0x0103 }
            if (r7 == 0) goto L_0x007f
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r2 = r9.f132643f     // Catch:{ EOFException -> 0x0103 }
            r2.remove(r6)     // Catch:{ EOFException -> 0x0103 }
            goto L_0x00d7
        L_0x007b:
            java.lang.String r6 = r2.substring(r6, r3)     // Catch:{ EOFException -> 0x0103 }
        L_0x007f:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r7 = r9.f132643f     // Catch:{ EOFException -> 0x0103 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ EOFException -> 0x0103 }
            okhttp3.internal.a.d$b r7 = (okhttp3.internal.p2683a.C53539d.C53544b) r7     // Catch:{ EOFException -> 0x0103 }
            if (r7 != 0) goto L_0x0093
            okhttp3.internal.a.d$b r7 = new okhttp3.internal.a.d$b     // Catch:{ EOFException -> 0x0103 }
            r7.<init>(r6)     // Catch:{ EOFException -> 0x0103 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r8 = r9.f132643f     // Catch:{ EOFException -> 0x0103 }
            r8.put(r6, r7)     // Catch:{ EOFException -> 0x0103 }
        L_0x0093:
            r6 = 5
            if (r3 == r5) goto L_0x00b6
            if (r4 != r6) goto L_0x00b6
            java.lang.String r8 = "CLEAN"
            boolean r8 = r2.startsWith(r8)     // Catch:{ EOFException -> 0x0103 }
            if (r8 == 0) goto L_0x00b6
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r3 = " "
            java.lang.String[] r2 = r2.split(r3)     // Catch:{ EOFException -> 0x0103 }
            r3 = 1
            r7.f132671e = r3     // Catch:{ EOFException -> 0x0103 }
            r3 = 0
            r7.f132672f = r3     // Catch:{ EOFException -> 0x0103 }
            r7.mo111369a(r2)     // Catch:{ EOFException -> 0x0103 }
            goto L_0x00d7
        L_0x00b6:
            if (r3 != r5) goto L_0x00ca
            if (r4 != r6) goto L_0x00ca
            java.lang.String r6 = "DIRTY"
            boolean r6 = r2.startsWith(r6)     // Catch:{ EOFException -> 0x0103 }
            if (r6 == 0) goto L_0x00ca
            okhttp3.internal.a.d$a r2 = new okhttp3.internal.a.d$a     // Catch:{ EOFException -> 0x0103 }
            r2.<init>(r7)     // Catch:{ EOFException -> 0x0103 }
            r7.f132672f = r2     // Catch:{ EOFException -> 0x0103 }
            goto L_0x00d7
        L_0x00ca:
            if (r3 != r5) goto L_0x00db
            r3 = 4
            if (r4 != r3) goto L_0x00db
            java.lang.String r3 = "READ"
            boolean r3 = r2.startsWith(r3)     // Catch:{ EOFException -> 0x0103 }
            if (r3 == 0) goto L_0x00db
        L_0x00d7:
            int r1 = r1 + 1
            goto L_0x0051
        L_0x00db:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0103 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r5 = "unexpected journal line: "
            r4.<init>(r5)     // Catch:{ EOFException -> 0x0103 }
            r4.append(r2)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r2 = r4.toString()     // Catch:{ EOFException -> 0x0103 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0103 }
            throw r3     // Catch:{ EOFException -> 0x0103 }
        L_0x00ef:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ EOFException -> 0x0103 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r5 = "unexpected journal line: "
            r4.<init>(r5)     // Catch:{ EOFException -> 0x0103 }
            r4.append(r2)     // Catch:{ EOFException -> 0x0103 }
            java.lang.String r2 = r4.toString()     // Catch:{ EOFException -> 0x0103 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0103 }
            throw r3     // Catch:{ EOFException -> 0x0103 }
        L_0x0103:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r2 = r9.f132643f     // Catch:{ all -> 0x0151 }
            int r2 = r2.size()     // Catch:{ all -> 0x0151 }
            int r1 = r1 - r2
            r9.f132644g = r1     // Catch:{ all -> 0x0151 }
            boolean r1 = r0.exhausted()     // Catch:{ all -> 0x0151 }
            if (r1 != 0) goto L_0x0116
            r9.mo111352a()     // Catch:{ all -> 0x0151 }
            goto L_0x011c
        L_0x0116:
            okio.BufferedSink r1 = r9.m113716f()     // Catch:{ all -> 0x0151 }
            r9.f132642e = r1     // Catch:{ all -> 0x0151 }
        L_0x011c:
            okhttp3.internal.C53559c.m113805a(r0)
            return
        L_0x0120:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0151 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0151 }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x0151 }
            r6.append(r1)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0151 }
            r6.append(r2)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0151 }
            r6.append(r4)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0151 }
            r6.append(r5)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x0151 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0151 }
            r3.<init>(r1)     // Catch:{ all -> 0x0151 }
            throw r3     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r1 = move-exception
            okhttp3.internal.C53559c.m113805a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53539d.m113715e():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo111352a() throws IOException {
        if (this.f132642e != null) {
            this.f132642e.close();
        }
        BufferedSink buffer = Okio.buffer(this.f132639b.mo111494b(this.f132651o));
        try {
            buffer.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
            buffer.writeUtf8("1").writeByte(10);
            buffer.writeDecimalLong((long) this.f132653q).writeByte(10);
            buffer.writeDecimalLong((long) this.f132641d).writeByte(10);
            buffer.writeByte(10);
            for (C53544b bVar : this.f132643f.values()) {
                if (bVar.f132672f != null) {
                    buffer.writeUtf8("DIRTY").writeByte(32);
                    buffer.writeUtf8(bVar.f132667a);
                    buffer.writeByte(10);
                } else {
                    buffer.writeUtf8("CLEAN").writeByte(32);
                    buffer.writeUtf8(bVar.f132667a);
                    bVar.mo111368a(buffer);
                    buffer.writeByte(10);
                }
            }
            buffer.close();
            if (this.f132639b.mo111497e(this.f132650n)) {
                this.f132639b.mo111493a(this.f132650n, this.f132652p);
            }
            this.f132639b.mo111493a(this.f132651o, this.f132650n);
            this.f132639b.mo111496d(this.f132652p);
            this.f132642e = m113716f();
            this.f132645h = false;
            this.f132649l = false;
        } catch (Throwable th) {
            buffer.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final C53542a mo111355b(String str) throws IOException {
        return mo111350a(str, -1);
    }

    /* renamed from: d */
    private static void m113714d(String str) {
        if (!f132637a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo111358c(String str) throws IOException {
        m113713d();
        m113719i();
        m113714d(str);
        C53544b bVar = (C53544b) this.f132643f.get(str);
        if (bVar == null) {
            return false;
        }
        mo111354a(bVar);
        if (this.f132655s <= this.f132654r) {
            this.f132648k = false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.p2683a.C53539d.C53545c mo111351a(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.m113713d()     // Catch:{ all -> 0x0050 }
            r3.m113719i()     // Catch:{ all -> 0x0050 }
            m113714d(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r0 = r3.f132643f     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            okhttp3.internal.a.d$b r0 = (okhttp3.internal.p2683a.C53539d.C53544b) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f132671e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            okhttp3.internal.a.d$c r0 = r0.mo111367a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f132644g     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f132644g = r1     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r1 = r3.f132642e     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r4 = r1.writeUtf8(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo111356b()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f132657u     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f132658v     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53539d.mo111351a(java.lang.String):okhttp3.internal.a.d$c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.p2683a.C53539d.C53542a mo111350a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m113713d()     // Catch:{ all -> 0x0074 }
            r5.m113719i()     // Catch:{ all -> 0x0074 }
            m113714d(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r0 = r5.f132643f     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            okhttp3.internal.a.d$b r0 = (okhttp3.internal.p2683a.C53539d.C53544b) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f132673g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            okhttp3.internal.a.d$a r7 = r0.f132672f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f132648k     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f132649l     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            okio.BufferedSink r7 = r5.f132642e     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            okio.BufferedSink r7 = r7.writeUtf8(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            okio.BufferedSink r7 = r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            okio.BufferedSink r7 = r7.writeUtf8(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            okio.BufferedSink r7 = r5.f132642e     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f132645h     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            okhttp3.internal.a.d$b r0 = new okhttp3.internal.a.d$b     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r7 = r5.f132643f     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            okhttp3.internal.a.d$a r6 = new okhttp3.internal.a.d$a     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f132672f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f132657u     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f132658v     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53539d.mo111350a(java.lang.String, long):okhttp3.internal.a.d$a");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f2, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo111353a(okhttp3.internal.p2683a.C53539d.C53542a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            okhttp3.internal.a.d$b r0 = r10.f132662a     // Catch:{ all -> 0x00f9 }
            okhttp3.internal.a.d$a r1 = r0.f132672f     // Catch:{ all -> 0x00f9 }
            if (r1 != r10) goto L_0x00f3
            r1 = 0
            if (r11 == 0) goto L_0x0044
            boolean r2 = r0.f132671e     // Catch:{ all -> 0x00f9 }
            if (r2 != 0) goto L_0x0044
            r2 = 0
        L_0x000f:
            int r3 = r9.f132641d     // Catch:{ all -> 0x00f9 }
            if (r2 >= r3) goto L_0x0044
            boolean[] r3 = r10.f132663b     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f9 }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.f.a r3 = r9.f132639b     // Catch:{ all -> 0x00f9 }
            java.io.File[] r4 = r0.f132670d     // Catch:{ all -> 0x00f9 }
            r4 = r4[r2]     // Catch:{ all -> 0x00f9 }
            boolean r3 = r3.mo111497e(r4)     // Catch:{ all -> 0x00f9 }
            if (r3 != 0) goto L_0x002a
            r10.mo111366c()     // Catch:{ all -> 0x00f9 }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo111366c()     // Catch:{ all -> 0x00f9 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f9 }
            r11.append(r2)     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f9 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x0044:
            int r10 = r9.f132641d     // Catch:{ all -> 0x00f9 }
            if (r1 >= r10) goto L_0x007d
            java.io.File[] r10 = r0.f132670d     // Catch:{ all -> 0x00f9 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x0075
            okhttp3.internal.f.a r2 = r9.f132639b     // Catch:{ all -> 0x00f9 }
            boolean r2 = r2.mo111497e(r10)     // Catch:{ all -> 0x00f9 }
            if (r2 == 0) goto L_0x007a
            java.io.File[] r2 = r0.f132669c     // Catch:{ all -> 0x00f9 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f9 }
            okhttp3.internal.f.a r3 = r9.f132639b     // Catch:{ all -> 0x00f9 }
            r3.mo111493a(r10, r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f132668b     // Catch:{ all -> 0x00f9 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f9 }
            okhttp3.internal.f.a r10 = r9.f132639b     // Catch:{ all -> 0x00f9 }
            long r5 = r10.mo111498f(r2)     // Catch:{ all -> 0x00f9 }
            long[] r10 = r0.f132668b     // Catch:{ all -> 0x00f9 }
            r10[r1] = r5     // Catch:{ all -> 0x00f9 }
            long r7 = r9.f132655s     // Catch:{ all -> 0x00f9 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f132655s = r7     // Catch:{ all -> 0x00f9 }
            goto L_0x007a
        L_0x0075:
            okhttp3.internal.f.a r2 = r9.f132639b     // Catch:{ all -> 0x00f9 }
            r2.mo111496d(r10)     // Catch:{ all -> 0x00f9 }
        L_0x007a:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x007d:
            int r10 = r9.f132644g     // Catch:{ all -> 0x00f9 }
            r1 = 1
            int r10 = r10 + r1
            r9.f132644g = r10     // Catch:{ all -> 0x00f9 }
            r10 = 0
            r0.f132672f = r10     // Catch:{ all -> 0x00f9 }
            boolean r10 = r0.f132671e     // Catch:{ all -> 0x00f9 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b9
            r0.f132671e = r1     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = "CLEAN"
            okio.BufferedSink r10 = r10.writeUtf8(r1)     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r3)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            java.lang.String r1 = r0.f132667a     // Catch:{ all -> 0x00f9 }
            r10.writeUtf8(r1)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            r0.mo111368a(r10)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r2)     // Catch:{ all -> 0x00f9 }
            if (r11 == 0) goto L_0x00d7
            long r10 = r9.f132656t     // Catch:{ all -> 0x00f9 }
            r1 = 1
            long r1 = r1 + r10
            r9.f132656t = r1     // Catch:{ all -> 0x00f9 }
            r0.f132673g = r10     // Catch:{ all -> 0x00f9 }
            goto L_0x00d7
        L_0x00b9:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.a.d$b> r10 = r9.f132643f     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f132667a     // Catch:{ all -> 0x00f9 }
            r10.remove(r11)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = "REMOVE"
            okio.BufferedSink r10 = r10.writeUtf8(r11)     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r3)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            java.lang.String r11 = r0.f132667a     // Catch:{ all -> 0x00f9 }
            r10.writeUtf8(r11)     // Catch:{ all -> 0x00f9 }
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            r10.writeByte(r2)     // Catch:{ all -> 0x00f9 }
        L_0x00d7:
            okio.BufferedSink r10 = r9.f132642e     // Catch:{ all -> 0x00f9 }
            r10.flush()     // Catch:{ all -> 0x00f9 }
            long r10 = r9.f132655s     // Catch:{ all -> 0x00f9 }
            long r0 = r9.f132654r     // Catch:{ all -> 0x00f9 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ea
            boolean r10 = r9.mo111356b()     // Catch:{ all -> 0x00f9 }
            if (r10 == 0) goto L_0x00f1
        L_0x00ea:
            java.util.concurrent.Executor r10 = r9.f132657u     // Catch:{ all -> 0x00f9 }
            java.lang.Runnable r11 = r9.f132658v     // Catch:{ all -> 0x00f9 }
            r10.execute(r11)     // Catch:{ all -> 0x00f9 }
        L_0x00f1:
            monitor-exit(r9)
            return
        L_0x00f3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f9 }
            r10.<init>()     // Catch:{ all -> 0x00f9 }
            throw r10     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53539d.mo111353a(okhttp3.internal.a.d$a, boolean):void");
    }

    /* renamed from: a */
    public static C53539d m113712a(C53623a aVar, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C53559c.m113803a("OkHttp DiskLruCache", true));
            C53539d dVar = new C53539d(aVar, file, i, i2, j, threadPoolExecutor);
            return dVar;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private C53539d(C53623a aVar, File file, int i, int i2, long j, Executor executor) {
        this.f132639b = aVar;
        this.f132640c = file;
        this.f132653q = i;
        this.f132650n = new File(file, "journal");
        this.f132651o = new File(file, "journal.tmp");
        this.f132652p = new File(file, "journal.bkp");
        this.f132641d = i2;
        this.f132654r = j;
        this.f132657u = executor;
    }
}

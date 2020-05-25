package com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a;

import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a */
public final class C48608a implements Closeable {

    /* renamed from: a */
    static final Pattern f122208a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: g */
    public static final OutputStream f122209g = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    public final File f122210b;

    /* renamed from: c */
    public final int f122211c;

    /* renamed from: d */
    public Writer f122212d;

    /* renamed from: e */
    public int f122213e;

    /* renamed from: f */
    final ThreadPoolExecutor f122214f;

    /* renamed from: h */
    private final File f122215h;

    /* renamed from: i */
    private final File f122216i;

    /* renamed from: j */
    private final File f122217j;

    /* renamed from: k */
    private final int f122218k;

    /* renamed from: l */
    private long f122219l;

    /* renamed from: m */
    private long f122220m;

    /* renamed from: n */
    private final LinkedHashMap<String, C48613b> f122221n = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o */
    private long f122222o = 0;

    /* renamed from: p */
    private C48615b f122223p;

    /* renamed from: q */
    private final Callable<Void> f122224q;

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$a */
    public final class C48611a {

        /* renamed from: a */
        public final C48613b f122226a;

        /* renamed from: b */
        public final boolean[] f122227b;

        /* renamed from: c */
        public boolean f122228c;

        /* renamed from: e */
        private boolean f122230e;

        /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$a$a */
        class C48612a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C48611a.this.f122228c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C48611a.this.f122228c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C48611a.this.f122228c = true;
                }
            }

            private C48612a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C48611a.this.f122228c = true;
                }
            }
        }

        /* renamed from: b */
        public final void mo96183b() throws IOException {
            C48608a.this.mo96170a(this, false);
        }

        /* renamed from: c */
        public final void mo96184c() {
            if (!this.f122230e) {
                try {
                    mo96183b();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo96182a() throws IOException {
            if (this.f122228c) {
                C48608a.this.mo96170a(this, false);
                C48608a.this.mo96174c(this.f122226a.f122232a);
            } else {
                C48608a.this.mo96170a(this, true);
            }
            this.f122230e = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream mo96181a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                com.ss.android.ugc.effectmanager.common.b.a.a r4 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this
                int r4 = r4.f122211c
                r0 = 0
                if (r4 <= 0) goto L_0x0048
                com.ss.android.ugc.effectmanager.common.b.a.a r4 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this
                monitor-enter(r4)
                com.ss.android.ugc.effectmanager.common.b.a.a$b r1 = r3.f122226a     // Catch:{ all -> 0x0045 }
                com.ss.android.ugc.effectmanager.common.b.a.a$a r1 = r1.f122235d     // Catch:{ all -> 0x0045 }
                if (r1 != r3) goto L_0x003f
                com.ss.android.ugc.effectmanager.common.b.a.a$b r1 = r3.f122226a     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f122234c     // Catch:{ all -> 0x0045 }
                if (r1 != 0) goto L_0x001b
                boolean[] r1 = r3.f122227b     // Catch:{ all -> 0x0045 }
                r2 = 1
                r1[r0] = r2     // Catch:{ all -> 0x0045 }
            L_0x001b:
                com.ss.android.ugc.effectmanager.common.b.a.a$b r1 = r3.f122226a     // Catch:{ all -> 0x0045 }
                java.io.File r0 = r1.mo96192b(r0)     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027 }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0027 }
                goto L_0x0033
            L_0x0027:
                com.ss.android.ugc.effectmanager.common.b.a.a r1 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this     // Catch:{ all -> 0x0045 }
                java.io.File r1 = r1.f122210b     // Catch:{ all -> 0x0045 }
                r1.mkdirs()     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003b }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x003b }
            L_0x0033:
                com.ss.android.ugc.effectmanager.common.b.a.a$a$a r0 = new com.ss.android.ugc.effectmanager.common.b.a.a$a$a     // Catch:{ all -> 0x0045 }
                r2 = 0
                r0.<init>(r1)     // Catch:{ all -> 0x0045 }
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                return r0
            L_0x003b:
                java.io.OutputStream r0 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.f122209g     // Catch:{ all -> 0x0045 }
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                return r0
            L_0x003f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0045 }
                r0.<init>()     // Catch:{ all -> 0x0045 }
                throw r0     // Catch:{ all -> 0x0045 }
            L_0x0045:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                throw r0
            L_0x0048:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r0)
                com.ss.android.ugc.effectmanager.common.b.a.a r0 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this
                int r0 = r0.f122211c
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48611a.mo96181a(int):java.io.OutputStream");
        }

        private C48611a(C48613b bVar) {
            boolean[] zArr;
            this.f122226a = bVar;
            if (bVar.f122234c) {
                zArr = null;
            } else {
                zArr = new boolean[C48608a.this.f122211c];
            }
            this.f122227b = zArr;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$b */
    final class C48613b {

        /* renamed from: a */
        public final String f122232a;

        /* renamed from: b */
        public final long[] f122233b;

        /* renamed from: c */
        public boolean f122234c;

        /* renamed from: d */
        public C48611a f122235d;

        /* renamed from: e */
        public long f122236e;

        /* renamed from: a */
        public final String mo96190a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f122233b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m105202b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final File mo96189a(int i) {
            if (i == 0) {
                return new File(C48608a.this.f122210b, this.f122232a);
            }
            File file = C48608a.this.f122210b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122232a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            return new File(file, sb.toString());
        }

        /* renamed from: a */
        public final void mo96191a(String[] strArr) throws IOException {
            if (strArr.length == C48608a.this.f122211c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f122233b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m105202b(strArr);
                    }
                }
                return;
            }
            throw m105202b(strArr);
        }

        /* renamed from: b */
        public final File mo96192b(int i) {
            if (i == 0) {
                File file = C48608a.this.f122210b;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f122232a);
                sb.append(".tmp");
                return new File(file, sb.toString());
            }
            File file2 = C48608a.this.f122210b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f122232a);
            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
            sb2.append(i);
            sb2.append(".tmp");
            return new File(file2, sb2.toString());
        }

        private C48613b(String str) {
            this.f122232a = str;
            this.f122233b = new long[C48608a.this.f122211c];
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a.a$c */
    public final class C48614c implements Closeable {

        /* renamed from: b */
        private final String f122239b;

        /* renamed from: c */
        private final long f122240c;

        /* renamed from: d */
        private final File[] f122241d;

        /* renamed from: e */
        private final InputStream[] f122242e;

        /* renamed from: f */
        private final long[] f122243f;

        public final void close() {
            for (InputStream a : this.f122242e) {
                C48671i.m105323a((Closeable) a);
            }
        }

        /* renamed from: a */
        public final InputStream mo96193a(int i) {
            return this.f122242e[0];
        }

        /* renamed from: b */
        public final File mo96194b(int i) {
            return this.f122241d[0];
        }

        private C48614c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f122239b = str;
            this.f122240c = j;
            this.f122241d = fileArr;
            this.f122242e = inputStreamArr;
            this.f122243f = jArr;
        }
    }

    /* renamed from: g */
    private synchronized long m105184g() {
        return this.f122219l;
    }

    /* renamed from: h */
    private void m105186h() {
        if (this.f122212d == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: b */
    public final boolean mo96172b() {
        if (this.f122213e < 2000 || this.f122213e < this.f122221n.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final Set<String> mo96176d() {
        Set<String> unmodifiableSet;
        synchronized (this) {
            unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.f122221n.keySet()));
        }
        return unmodifiableSet;
    }

    public final synchronized void close() throws IOException {
        if (this.f122212d != null) {
            Iterator it = new ArrayList(this.f122221n.values()).iterator();
            while (it.hasNext()) {
                C48613b bVar = (C48613b) it.next();
                if (bVar.f122235d != null) {
                    bVar.f122235d.mo96183b();
                }
            }
            mo96173c();
            this.f122212d.close();
            this.f122212d = null;
        }
    }

    /* renamed from: f */
    private void m105183f() throws IOException {
        m105179a(this.f122216i);
        Iterator it = this.f122221n.values().iterator();
        while (it.hasNext()) {
            C48613b bVar = (C48613b) it.next();
            int i = 0;
            if (bVar.f122235d == null) {
                while (i < this.f122211c) {
                    this.f122220m += bVar.f122233b[i];
                    i++;
                }
            } else {
                bVar.f122235d = null;
                while (i < this.f122211c) {
                    m105179a(bVar.mo96189a(i));
                    m105179a(bVar.mo96192b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        if ((r0 - r1) >= 10) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        m105178a(m105184g() * 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        mo96174c((java.lang.String) r3.getKey());
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96173c() throws java.io.IOException {
        /*
            r6 = this;
        L_0x0000:
            long r0 = r6.f122220m
            long r2 = r6.f122219l
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0054
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r0 = r6.f122221n
            int r0 = r0.size()
            r1 = 0
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r2 = r6.f122221n
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0000
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            com.ss.android.ugc.effectmanager.common.b.a.b r4 = r6.f122223p
            if (r4 == 0) goto L_0x003a
            com.ss.android.ugc.effectmanager.common.b.a.b r4 = r6.f122223p
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            boolean r4 = r4.mo96162a(r5)
            if (r4 == 0) goto L_0x003a
            int r1 = r1 + 1
            goto L_0x0019
        L_0x003a:
            int r0 = r0 - r1
            r1 = 10
            if (r0 >= r1) goto L_0x004a
            long r0 = r6.m105184g()
            r4 = 2
            long r0 = r0 * r4
            r6.m105178a(r0)
        L_0x004a:
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r6.mo96174c(r0)
            goto L_0x0000
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.mo96173c():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:49|50|(1:52)(1:53)|54|55) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r11.f122213e = r1 - r11.f122221n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        if (r0.mo96197b() != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0116, code lost:
        mo96169a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011a, code lost:
        r11.f122212d = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r11.f122215h, true), com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105322a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0107 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0135=Splitter:B:56:0x0135, B:14:0x0056=Splitter:B:14:0x0056} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m105181e() throws java.io.IOException {
        /*
            r11 = this;
            com.ss.android.ugc.effectmanager.common.b.a.c r0 = new com.ss.android.ugc.effectmanager.common.b.a.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r11.f122215h
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105322a()
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo96196a()     // Catch:{ all -> 0x0166 }
            java.lang.String r2 = r0.mo96196a()     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = r0.mo96196a()     // Catch:{ all -> 0x0166 }
            java.lang.String r4 = r0.mo96196a()     // Catch:{ all -> 0x0166 }
            java.lang.String r5 = r0.mo96196a()     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r6 == 0) goto L_0x0135
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0166 }
            if (r6 == 0) goto L_0x0135
            int r6 = r11.f122218k     // Catch:{ all -> 0x0166 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0166 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0166 }
            if (r3 == 0) goto L_0x0135
            int r3 = r11.f122211c     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0166 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0166 }
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0166 }
            if (r3 == 0) goto L_0x0135
            r1 = 0
        L_0x0055:
            r2 = 1
            java.lang.String r3 = r0.mo96196a()     // Catch:{ EOFException -> 0x0107 }
            r4 = 32
            int r5 = r3.indexOf(r4)     // Catch:{ EOFException -> 0x0107 }
            r6 = -1
            if (r5 == r6) goto L_0x00f3
            int r7 = r5 + 1
            int r4 = r3.indexOf(r4, r7)     // Catch:{ EOFException -> 0x0107 }
            if (r4 != r6) goto L_0x0080
            java.lang.String r7 = r3.substring(r7)     // Catch:{ EOFException -> 0x0107 }
            r8 = 6
            if (r5 != r8) goto L_0x0084
            java.lang.String r8 = "REMOVE"
            boolean r8 = r3.startsWith(r8)     // Catch:{ EOFException -> 0x0107 }
            if (r8 == 0) goto L_0x0084
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r3 = r11.f122221n     // Catch:{ EOFException -> 0x0107 }
            r3.remove(r7)     // Catch:{ EOFException -> 0x0107 }
            goto L_0x00db
        L_0x0080:
            java.lang.String r7 = r3.substring(r7, r4)     // Catch:{ EOFException -> 0x0107 }
        L_0x0084:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r8 = r11.f122221n     // Catch:{ EOFException -> 0x0107 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ EOFException -> 0x0107 }
            com.ss.android.ugc.effectmanager.common.b.a.a$b r8 = (com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48613b) r8     // Catch:{ EOFException -> 0x0107 }
            r9 = 0
            if (r8 != 0) goto L_0x0099
            com.ss.android.ugc.effectmanager.common.b.a.a$b r8 = new com.ss.android.ugc.effectmanager.common.b.a.a$b     // Catch:{ EOFException -> 0x0107 }
            r8.<init>(r7)     // Catch:{ EOFException -> 0x0107 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r10 = r11.f122221n     // Catch:{ EOFException -> 0x0107 }
            r10.put(r7, r8)     // Catch:{ EOFException -> 0x0107 }
        L_0x0099:
            r7 = 5
            if (r4 == r6) goto L_0x00ba
            if (r5 != r7) goto L_0x00ba
            java.lang.String r10 = "CLEAN"
            boolean r10 = r3.startsWith(r10)     // Catch:{ EOFException -> 0x0107 }
            if (r10 == 0) goto L_0x00ba
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ EOFException -> 0x0107 }
            java.lang.String r4 = " "
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ EOFException -> 0x0107 }
            r8.f122234c = r2     // Catch:{ EOFException -> 0x0107 }
            r8.f122235d = r9     // Catch:{ EOFException -> 0x0107 }
            r8.mo96191a(r3)     // Catch:{ EOFException -> 0x0107 }
            goto L_0x00db
        L_0x00ba:
            if (r4 != r6) goto L_0x00ce
            if (r5 != r7) goto L_0x00ce
            java.lang.String r7 = "DIRTY"
            boolean r7 = r3.startsWith(r7)     // Catch:{ EOFException -> 0x0107 }
            if (r7 == 0) goto L_0x00ce
            com.ss.android.ugc.effectmanager.common.b.a.a$a r3 = new com.ss.android.ugc.effectmanager.common.b.a.a$a     // Catch:{ EOFException -> 0x0107 }
            r3.<init>(r8)     // Catch:{ EOFException -> 0x0107 }
            r8.f122235d = r3     // Catch:{ EOFException -> 0x0107 }
            goto L_0x00db
        L_0x00ce:
            if (r4 != r6) goto L_0x00df
            r4 = 4
            if (r5 != r4) goto L_0x00df
            java.lang.String r4 = "READ"
            boolean r4 = r3.startsWith(r4)     // Catch:{ EOFException -> 0x0107 }
            if (r4 == 0) goto L_0x00df
        L_0x00db:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x00df:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ EOFException -> 0x0107 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0107 }
            java.lang.String r6 = "unexpected journal line: "
            r5.<init>(r6)     // Catch:{ EOFException -> 0x0107 }
            r5.append(r3)     // Catch:{ EOFException -> 0x0107 }
            java.lang.String r3 = r5.toString()     // Catch:{ EOFException -> 0x0107 }
            r4.<init>(r3)     // Catch:{ EOFException -> 0x0107 }
            throw r4     // Catch:{ EOFException -> 0x0107 }
        L_0x00f3:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ EOFException -> 0x0107 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0107 }
            java.lang.String r6 = "unexpected journal line: "
            r5.<init>(r6)     // Catch:{ EOFException -> 0x0107 }
            r5.append(r3)     // Catch:{ EOFException -> 0x0107 }
            java.lang.String r3 = r5.toString()     // Catch:{ EOFException -> 0x0107 }
            r4.<init>(r3)     // Catch:{ EOFException -> 0x0107 }
            throw r4     // Catch:{ EOFException -> 0x0107 }
        L_0x0107:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r3 = r11.f122221n     // Catch:{ all -> 0x0166 }
            int r3 = r3.size()     // Catch:{ all -> 0x0166 }
            int r1 = r1 - r3
            r11.f122213e = r1     // Catch:{ all -> 0x0166 }
            boolean r1 = r0.mo96197b()     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x011a
            r11.mo96169a()     // Catch:{ all -> 0x0166 }
            goto L_0x0131
        L_0x011a:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0166 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0166 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0166 }
            java.io.File r5 = r11.f122215h     // Catch:{ all -> 0x0166 }
            r4.<init>(r5, r2)     // Catch:{ all -> 0x0166 }
            java.nio.charset.Charset r2 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105322a()     // Catch:{ all -> 0x0166 }
            r3.<init>(r4, r2)     // Catch:{ all -> 0x0166 }
            r1.<init>(r3)     // Catch:{ all -> 0x0166 }
            r11.f122212d = r1     // Catch:{ all -> 0x0166 }
        L_0x0131:
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105323a(r0)
            return
        L_0x0135:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0166 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x0166 }
            r6.append(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0166 }
            r6.append(r2)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0166 }
            r6.append(r4)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0166 }
            r6.append(r5)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0166 }
            r3.<init>(r1)     // Catch:{ all -> 0x0166 }
            throw r3     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r1 = move-exception
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105323a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.m105181e():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final synchronized void mo96169a() throws IOException {
        if (this.f122212d != null) {
            this.f122212d.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f122216i), C48671i.m105322a()));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f122218k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f122211c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C48613b bVar : this.f122221n.values()) {
                if (bVar.f122235d != null) {
                    StringBuilder sb = new StringBuilder("DIRTY ");
                    sb.append(bVar.f122232a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("CLEAN ");
                    sb2.append(bVar.f122232a);
                    sb2.append(bVar.mo96190a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f122215h.exists()) {
                m105180a(this.f122215h, this.f122217j, true);
            }
            m105180a(this.f122216i, this.f122215h, false);
            this.f122217j.delete();
            this.f122212d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f122215h, true), C48671i.m105322a()));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final C48611a mo96171b(String str) throws IOException {
        return m105176a(str, -1);
    }

    /* renamed from: a */
    private synchronized void m105178a(long j) {
        this.f122219l = j;
        this.f122214f.submit(this.f122224q);
    }

    /* renamed from: a */
    private static void m105179a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: f */
    public static String m105182f(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (!(c == '_' || c == '-' || ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))) {
                charArray[i] = '_';
            }
        }
        return new String(charArray);
    }

    /* renamed from: g */
    private static void m105185g(String str) {
        if (!f122208a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e */
    public final synchronized boolean mo96178e(String str) {
        m105186h();
        m105185g(str);
        C48613b bVar = (C48613b) this.f122221n.get(str);
        if (bVar == null) {
            return false;
        }
        if (!bVar.f122234c) {
            return false;
        }
        try {
            this.f122213e++;
            Writer writer = this.f122212d;
            StringBuilder sb = new StringBuilder("READ ");
            sb.append(str);
            sb.append(10);
            writer.write(sb.toString());
            this.f122212d.flush();
            if (mo96172b()) {
                this.f122214f.submit(this.f122224q);
            }
        } catch (IOException unused) {
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo96174c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m105186h()     // Catch:{ all -> 0x00bf }
            m105185g(r9)     // Catch:{ all -> 0x00bf }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r0 = r8.f122221n     // Catch:{ all -> 0x00bf }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00bf }
            com.ss.android.ugc.effectmanager.common.b.a.a$b r0 = (com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48613b) r0     // Catch:{ all -> 0x00bf }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00af
            com.ss.android.ugc.effectmanager.common.b.a.a$a r3 = r0.f122235d     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x0019
            goto L_0x00af
        L_0x0019:
            int r3 = r8.f122211c     // Catch:{ all -> 0x00bf }
            if (r1 >= r3) goto L_0x007e
            java.io.File r3 = r0.mo96189a(r1)     // Catch:{ all -> 0x00bf }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x006b
            boolean r4 = r3.isFile()     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.delete()     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0034
            goto L_0x0048
        L_0x0034:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            r0.append(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bf }
            r9.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r9     // Catch:{ all -> 0x00bf }
        L_0x0048:
            boolean r4 = r3.isDirectory()     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x006b
            com.ss.android.ugc.effectmanager.common.h.i r4 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a     // Catch:{ all -> 0x00bf }
            boolean r4 = r4.mo96259b(r3)     // Catch:{ all -> 0x00bf }
            if (r4 == 0) goto L_0x0057
            goto L_0x006b
        L_0x0057:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x00bf }
            r0.append(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bf }
            r9.<init>(r0)     // Catch:{ all -> 0x00bf }
            throw r9     // Catch:{ all -> 0x00bf }
        L_0x006b:
            long r3 = r8.f122220m     // Catch:{ all -> 0x00bf }
            long[] r5 = r0.f122233b     // Catch:{ all -> 0x00bf }
            r6 = r5[r1]     // Catch:{ all -> 0x00bf }
            r5 = 0
            long r3 = r3 - r6
            r8.f122220m = r3     // Catch:{ all -> 0x00bf }
            long[] r3 = r0.f122233b     // Catch:{ all -> 0x00bf }
            r4 = 0
            r3[r1] = r4     // Catch:{ all -> 0x00bf }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x007e:
            int r0 = r8.f122213e     // Catch:{ all -> 0x00bf }
            int r0 = r0 + r2
            r8.f122213e = r0     // Catch:{ all -> 0x00bf }
            java.io.Writer r0 = r8.f122212d     // Catch:{ all -> 0x00bf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = "REMOVE "
            r1.<init>(r3)     // Catch:{ all -> 0x00bf }
            r1.append(r9)     // Catch:{ all -> 0x00bf }
            r3 = 10
            r1.append(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00bf }
            r0.append(r1)     // Catch:{ all -> 0x00bf }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r0 = r8.f122221n     // Catch:{ all -> 0x00bf }
            r0.remove(r9)     // Catch:{ all -> 0x00bf }
            boolean r9 = r8.mo96172b()     // Catch:{ all -> 0x00bf }
            if (r9 == 0) goto L_0x00ad
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f122214f     // Catch:{ all -> 0x00bf }
            java.util.concurrent.Callable<java.lang.Void> r0 = r8.f122224q     // Catch:{ all -> 0x00bf }
            r9.submit(r0)     // Catch:{ all -> 0x00bf }
        L_0x00ad:
            monitor-exit(r8)
            return r2
        L_0x00af:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bf }
            java.lang.String r3 = "remove: can not:"
            r9.<init>(r3)     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            r9.append(r2)     // Catch:{ all -> 0x00bf }
            monitor-exit(r8)
            return r1
        L_0x00bf:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.mo96174c(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo96177d(java.lang.String r10) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.m105186h()     // Catch:{ all -> 0x00be }
            m105185g(r10)     // Catch:{ all -> 0x00be }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r0 = r9.f122221n     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00be }
            com.ss.android.ugc.effectmanager.common.b.a.a$b r0 = (com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48613b) r0     // Catch:{ all -> 0x00be }
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x001e
            com.ss.android.ugc.effectmanager.common.b.a.a$b r0 = new com.ss.android.ugc.effectmanager.common.b.a.a$b     // Catch:{ all -> 0x00be }
            r0.<init>(r10)     // Catch:{ all -> 0x00be }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r3 = r9.f122221n     // Catch:{ all -> 0x00be }
            r3.put(r10, r0)     // Catch:{ all -> 0x00be }
            goto L_0x0024
        L_0x001e:
            com.ss.android.ugc.effectmanager.common.b.a.a$a r10 = r0.f122235d     // Catch:{ all -> 0x00be }
            if (r10 == 0) goto L_0x0024
            monitor-exit(r9)
            return r2
        L_0x0024:
            java.io.File r10 = r0.mo96189a(r2)     // Catch:{ all -> 0x00be }
            boolean r3 = r10.exists()     // Catch:{ all -> 0x00be }
            r4 = 10
            if (r3 == 0) goto L_0x009d
            long[] r3 = r0.f122233b     // Catch:{ all -> 0x00be }
            r5 = r3[r2]     // Catch:{ all -> 0x00be }
            long r7 = r10.length()     // Catch:{ all -> 0x00be }
            boolean r3 = r10.isDirectory()     // Catch:{ all -> 0x00be }
            if (r3 == 0) goto L_0x0044
            com.ss.android.ugc.effectmanager.common.h.i r3 = com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.f122310a     // Catch:{ all -> 0x00be }
            long r7 = r3.mo96261c(r10)     // Catch:{ all -> 0x00be }
        L_0x0044:
            long[] r10 = r0.f122233b     // Catch:{ all -> 0x00be }
            r10[r2] = r7     // Catch:{ all -> 0x00be }
            long r2 = r9.f122220m     // Catch:{ all -> 0x00be }
            r10 = 0
            long r2 = r2 - r5
            long r2 = r2 + r7
            r9.f122220m = r2     // Catch:{ all -> 0x00be }
            int r10 = r9.f122213e     // Catch:{ all -> 0x00be }
            r2 = 1
            int r10 = r10 + r2
            r9.f122213e = r10     // Catch:{ all -> 0x00be }
            r0.f122235d = r1     // Catch:{ all -> 0x00be }
            r0.f122234c = r2     // Catch:{ all -> 0x00be }
            java.io.Writer r10 = r9.f122212d     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r0.f122232a     // Catch:{ all -> 0x00be }
            r1.append(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r0.mo96190a()     // Catch:{ all -> 0x00be }
            r1.append(r3)     // Catch:{ all -> 0x00be }
            r1.append(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00be }
            r10.write(r1)     // Catch:{ all -> 0x00be }
            long r3 = r9.f122222o     // Catch:{ all -> 0x00be }
            r5 = 1
            long r5 = r5 + r3
            r9.f122222o = r5     // Catch:{ all -> 0x00be }
            r0.f122236e = r3     // Catch:{ all -> 0x00be }
            java.io.Writer r10 = r9.f122212d     // Catch:{ all -> 0x00be }
            r10.flush()     // Catch:{ all -> 0x00be }
            long r0 = r9.f122220m     // Catch:{ all -> 0x00be }
            long r3 = r9.f122219l     // Catch:{ all -> 0x00be }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0094
            boolean r10 = r9.mo96172b()     // Catch:{ all -> 0x00be }
            if (r10 == 0) goto L_0x009b
        L_0x0094:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f122214f     // Catch:{ all -> 0x00be }
            java.util.concurrent.Callable<java.lang.Void> r0 = r9.f122224q     // Catch:{ all -> 0x00be }
            r10.submit(r0)     // Catch:{ all -> 0x00be }
        L_0x009b:
            monitor-exit(r9)
            return r2
        L_0x009d:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r10 = r9.f122221n     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r0.f122232a     // Catch:{ all -> 0x00be }
            r10.remove(r1)     // Catch:{ all -> 0x00be }
            java.io.Writer r10 = r9.f122212d     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "REMOVE "
            r1.<init>(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r0.f122232a     // Catch:{ all -> 0x00be }
            r1.append(r0)     // Catch:{ all -> 0x00be }
            r1.append(r4)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00be }
            r10.write(r0)     // Catch:{ all -> 0x00be }
            monitor-exit(r9)
            return r2
        L_0x00be:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.mo96177d(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12.f122213e++;
        r1 = r12.f122212d;
        r2 = new java.lang.StringBuilder("READ ");
        r2.append(r13);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (mo96172b() == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        r12.f122214f.submit(r12.f122224q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r3 = new com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48614c(r12, r13, r0.f122236e, r8, r9, r0.f122233b, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48614c mo96168a(java.lang.String r13) throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            r12.m105186h()     // Catch:{ all -> 0x0086 }
            m105185g(r13)     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r0 = r12.f122221n     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0086 }
            com.ss.android.ugc.effectmanager.common.b.a.a$b r0 = (com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48613b) r0     // Catch:{ all -> 0x0086 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r12)
            return r1
        L_0x0014:
            boolean r2 = r0.f122234c     // Catch:{ all -> 0x0086 }
            if (r2 != 0) goto L_0x001a
            monitor-exit(r12)
            return r1
        L_0x001a:
            int r2 = r12.f122211c     // Catch:{ all -> 0x0086 }
            java.io.InputStream[] r9 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0086 }
            int r2 = r12.f122211c     // Catch:{ all -> 0x0086 }
            java.io.File[] r8 = new java.io.File[r2]     // Catch:{ all -> 0x0086 }
            r2 = 0
            r3 = 0
        L_0x0024:
            int r4 = r12.f122211c     // Catch:{ FileNotFoundException -> 0x0074 }
            if (r3 >= r4) goto L_0x003a
            java.io.File r4 = r0.mo96189a(r3)     // Catch:{ FileNotFoundException -> 0x0074 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0074 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0074 }
            r5 = r8[r3]     // Catch:{ FileNotFoundException -> 0x0074 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074 }
            r9[r3] = r4     // Catch:{ FileNotFoundException -> 0x0074 }
            int r3 = r3 + 1
            goto L_0x0024
        L_0x003a:
            int r1 = r12.f122213e     // Catch:{ all -> 0x0086 }
            int r1 = r1 + 1
            r12.f122213e = r1     // Catch:{ all -> 0x0086 }
            java.io.Writer r1 = r12.f122212d     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x0086 }
            r2.append(r13)     // Catch:{ all -> 0x0086 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0086 }
            r1.append(r2)     // Catch:{ all -> 0x0086 }
            boolean r1 = r12.mo96172b()     // Catch:{ all -> 0x0086 }
            if (r1 == 0) goto L_0x0065
            java.util.concurrent.ThreadPoolExecutor r1 = r12.f122214f     // Catch:{ all -> 0x0086 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r12.f122224q     // Catch:{ all -> 0x0086 }
            r1.submit(r2)     // Catch:{ all -> 0x0086 }
        L_0x0065:
            com.ss.android.ugc.effectmanager.common.b.a.a$c r1 = new com.ss.android.ugc.effectmanager.common.b.a.a$c     // Catch:{ all -> 0x0086 }
            long r6 = r0.f122236e     // Catch:{ all -> 0x0086 }
            long[] r10 = r0.f122233b     // Catch:{ all -> 0x0086 }
            r11 = 0
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0086 }
            monitor-exit(r12)
            return r1
        L_0x0074:
            int r13 = r12.f122211c     // Catch:{ all -> 0x0086 }
            if (r2 >= r13) goto L_0x0084
            r13 = r9[r2]     // Catch:{ all -> 0x0086 }
            if (r13 == 0) goto L_0x0084
            r13 = r9[r2]     // Catch:{ all -> 0x0086 }
            com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i.m105323a(r13)     // Catch:{ all -> 0x0086 }
            int r2 = r2 + 1
            goto L_0x0074
        L_0x0084:
            monitor-exit(r12)
            return r1
        L_0x0086:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.mo96168a(java.lang.String):com.ss.android.ugc.effectmanager.common.b.a.a$c");
    }

    /* renamed from: a */
    private synchronized C48611a m105176a(String str, long j) throws IOException {
        m105186h();
        m105185g(str);
        C48613b bVar = (C48613b) this.f122221n.get(str);
        if (bVar == null) {
            bVar = new C48613b(str);
            this.f122221n.put(str, bVar);
        } else if (bVar.f122235d != null) {
            return null;
        }
        C48611a aVar = new C48611a(bVar);
        bVar.f122235d = aVar;
        Writer writer = this.f122212d;
        StringBuilder sb = new StringBuilder("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f122212d.flush();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo96170a(com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C48611a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.common.b.a.a$b r0 = r10.f122226a     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.effectmanager.common.b.a.a$a r1 = r0.f122235d     // Catch:{ all -> 0x00f1 }
            if (r1 != r10) goto L_0x00eb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f122234c     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f122211c     // Catch:{ all -> 0x00f1 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f122227b     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.mo96192b(r2)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0028
            r10.mo96183b()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.mo96183b()     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            int r10 = r9.f122211c     // Catch:{ all -> 0x00f1 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.mo96192b(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.mo96189a(r1)     // Catch:{ all -> 0x00f1 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f122233b     // Catch:{ all -> 0x00f1 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f1 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f122233b     // Catch:{ all -> 0x00f1 }
            r10[r1] = r5     // Catch:{ all -> 0x00f1 }
            long r7 = r9.f122220m     // Catch:{ all -> 0x00f1 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f122220m = r7     // Catch:{ all -> 0x00f1 }
            goto L_0x0070
        L_0x006d:
            m105179a(r10)     // Catch:{ all -> 0x00f1 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.f122213e     // Catch:{ all -> 0x00f1 }
            r1 = 1
            int r10 = r10 + r1
            r9.f122213e = r10     // Catch:{ all -> 0x00f1 }
            r10 = 0
            r0.f122235d = r10     // Catch:{ all -> 0x00f1 }
            boolean r10 = r0.f122234c     // Catch:{ all -> 0x00f1 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b0
            r0.f122234c = r1     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f122212d     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.f122232a     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.mo96190a()     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00cf
            long r10 = r9.f122222o     // Catch:{ all -> 0x00f1 }
            r1 = 1
            long r1 = r1 + r10
            r9.f122222o = r1     // Catch:{ all -> 0x00f1 }
            r0.f122236e = r10     // Catch:{ all -> 0x00f1 }
            goto L_0x00cf
        L_0x00b0:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a.a$b> r10 = r9.f122221n     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r0.f122232a     // Catch:{ all -> 0x00f1 }
            r10.remove(r11)     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f122212d     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.f122232a     // Catch:{ all -> 0x00f1 }
            r11.append(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            java.io.Writer r10 = r9.f122212d     // Catch:{ all -> 0x00f1 }
            r10.flush()     // Catch:{ all -> 0x00f1 }
            long r10 = r9.f122220m     // Catch:{ all -> 0x00f1 }
            long r0 = r9.f122219l     // Catch:{ all -> 0x00f1 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            boolean r10 = r9.mo96172b()     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e9
        L_0x00e2:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f122214f     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f122224q     // Catch:{ all -> 0x00f1 }
            r10.submit(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00e9:
            monitor-exit(r9)
            return
        L_0x00eb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            r10.<init>()     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.mo96170a(com.ss.android.ugc.effectmanager.common.b.a.a$a, boolean):void");
    }

    /* renamed from: a */
    private static void m105180a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m105179a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private C48608a(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f122214f = threadPoolExecutor;
        this.f122224q = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.effectmanager.common.b.a.a r0 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this
                    monitor-enter(r0)
                    com.ss.android.ugc.effectmanager.common.b.a.a r1 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this     // Catch:{ all -> 0x0025 }
                    java.io.Writer r1 = r1.f122212d     // Catch:{ all -> 0x0025 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000c
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x000c:
                    com.ss.android.ugc.effectmanager.common.b.a.a r1 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this     // Catch:{ all -> 0x0025 }
                    r1.mo96173c()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.effectmanager.common.b.a.a r1 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this     // Catch:{ all -> 0x0025 }
                    boolean r1 = r1.mo96172b()     // Catch:{ all -> 0x0025 }
                    if (r1 == 0) goto L_0x0023
                    com.ss.android.ugc.effectmanager.common.b.a.a r1 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this     // Catch:{ all -> 0x0025 }
                    r1.mo96169a()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.effectmanager.common.b.a.a r1 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.this     // Catch:{ all -> 0x0025 }
                    r3 = 0
                    r1.f122213e = r3     // Catch:{ all -> 0x0025 }
                L_0x0023:
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x0025:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.C486091.call():java.lang.Void");
            }
        };
        this.f122210b = file;
        this.f122218k = i;
        this.f122215h = new File(file, "journal");
        this.f122216i = new File(file, "journal.tmp");
        this.f122217j = new File(file, "journal.bkp");
        this.f122211c = i2;
        this.f122219l = j;
    }

    /* renamed from: a */
    public static C48608a m105177a(File file, int i, int i2, long j, C48615b bVar) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m105180a(file2, file3, false);
                }
            }
            C48608a aVar = new C48608a(file, i, i2, j);
            if (aVar.f122215h.exists()) {
                try {
                    aVar.m105181e();
                    aVar.m105183f();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.close();
                    C48671i.f122310a.mo96257a(aVar.f122210b);
                }
            }
            file.mkdirs();
            C48608a aVar2 = new C48608a(file, i, i2, j);
            aVar2.mo96169a();
            if (bVar != null) {
                aVar2.f122223p = bVar;
            }
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}

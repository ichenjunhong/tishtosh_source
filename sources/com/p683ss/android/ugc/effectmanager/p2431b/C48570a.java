package com.p683ss.android.ugc.effectmanager.p2431b;

import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.b.a */
public final class C48570a implements Closeable {

    /* renamed from: a */
    static final Pattern f122085a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: h */
    public static final OutputStream f122086h = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    public final File f122087b;

    /* renamed from: c */
    public final int f122088c;

    /* renamed from: d */
    public int f122089d;

    /* renamed from: e */
    public boolean f122090e;

    /* renamed from: f */
    public boolean f122091f;

    /* renamed from: g */
    final ThreadPoolExecutor f122092g;

    /* renamed from: i */
    private final File f122093i;

    /* renamed from: j */
    private final File f122094j;

    /* renamed from: k */
    private final File f122095k;

    /* renamed from: l */
    private final int f122096l;

    /* renamed from: m */
    private long f122097m;

    /* renamed from: n */
    private long f122098n;

    /* renamed from: o */
    private Writer f122099o;

    /* renamed from: p */
    private final LinkedHashMap<String, C48575b> f122100p = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: q */
    private long f122101q = 0;

    /* renamed from: r */
    private final Callable<Void> f122102r;

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$a */
    public final class C48573a {

        /* renamed from: a */
        public final C48575b f122104a;

        /* renamed from: b */
        public final boolean[] f122105b;

        /* renamed from: c */
        public boolean f122106c;

        /* renamed from: e */
        private boolean f122108e;

        /* renamed from: com.ss.android.ugc.effectmanager.b.a$a$a */
        class C48574a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C48573a.this.f122106c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C48573a.this.f122106c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C48573a.this.f122106c = true;
                }
            }

            private C48574a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C48573a.this.f122106c = true;
                }
            }
        }

        /* renamed from: b */
        public final void mo96118b() throws IOException {
            C48570a.this.mo96105a(this, false);
        }

        /* renamed from: c */
        public final void mo96119c() {
            if (!this.f122108e) {
                try {
                    mo96118b();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo96117a() throws IOException {
            if (this.f122106c) {
                C48570a.this.mo96105a(this, false);
                C48570a.this.mo96109c(this.f122104a.f122110a);
            } else {
                C48570a.this.mo96105a(this, true);
            }
            this.f122108e = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream mo96116a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                com.ss.android.ugc.effectmanager.b.a r4 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this
                int r4 = r4.f122088c
                r0 = 0
                if (r4 <= 0) goto L_0x0048
                com.ss.android.ugc.effectmanager.b.a r4 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this
                monitor-enter(r4)
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f122104a     // Catch:{ all -> 0x0045 }
                com.ss.android.ugc.effectmanager.b.a$a r1 = r1.f122113d     // Catch:{ all -> 0x0045 }
                if (r1 != r3) goto L_0x003f
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f122104a     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f122112c     // Catch:{ all -> 0x0045 }
                if (r1 != 0) goto L_0x001b
                boolean[] r1 = r3.f122105b     // Catch:{ all -> 0x0045 }
                r2 = 1
                r1[r0] = r2     // Catch:{ all -> 0x0045 }
            L_0x001b:
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f122104a     // Catch:{ all -> 0x0045 }
                java.io.File r0 = r1.mo96127b(r0)     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027 }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0027 }
                goto L_0x0033
            L_0x0027:
                com.ss.android.ugc.effectmanager.b.a r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x0045 }
                java.io.File r1 = r1.f122087b     // Catch:{ all -> 0x0045 }
                r1.mkdirs()     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003b }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x003b }
            L_0x0033:
                com.ss.android.ugc.effectmanager.b.a$a$a r0 = new com.ss.android.ugc.effectmanager.b.a$a$a     // Catch:{ all -> 0x0045 }
                r2 = 0
                r0.<init>(r1)     // Catch:{ all -> 0x0045 }
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                return r0
            L_0x003b:
                java.io.OutputStream r0 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.f122086h     // Catch:{ all -> 0x0045 }
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
                com.ss.android.ugc.effectmanager.b.a r0 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this
                int r0 = r0.f122088c
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48573a.mo96116a(int):java.io.OutputStream");
        }

        private C48573a(C48575b bVar) {
            boolean[] zArr;
            this.f122104a = bVar;
            if (bVar.f122112c) {
                zArr = null;
            } else {
                zArr = new boolean[C48570a.this.f122088c];
            }
            this.f122105b = zArr;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$b */
    final class C48575b {

        /* renamed from: a */
        public final String f122110a;

        /* renamed from: b */
        public final long[] f122111b;

        /* renamed from: c */
        public boolean f122112c;

        /* renamed from: d */
        public C48573a f122113d;

        /* renamed from: e */
        public long f122114e;

        /* renamed from: a */
        public final String mo96125a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f122111b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m105095b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final File mo96124a(int i) {
            File file = C48570a.this.f122087b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122110a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            return new File(file, sb.toString());
        }

        /* renamed from: b */
        public final File mo96127b(int i) {
            File file = C48570a.this.f122087b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122110a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            sb.append(".tmp");
            return new File(file, sb.toString());
        }

        /* renamed from: a */
        public final void mo96126a(String[] strArr) throws IOException {
            if (strArr.length == C48570a.this.f122088c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f122111b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m105095b(strArr);
                    }
                }
                return;
            }
            throw m105095b(strArr);
        }

        private C48575b(String str) {
            this.f122110a = str;
            this.f122111b = new long[C48570a.this.f122088c];
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$c */
    public final class C48576c implements Closeable {

        /* renamed from: a */
        public final File[] f122116a;

        /* renamed from: c */
        private final String f122118c;

        /* renamed from: d */
        private final long f122119d;

        /* renamed from: e */
        private final InputStream[] f122120e;

        /* renamed from: f */
        private final long[] f122121f;

        public final void close() {
            for (InputStream a : this.f122120e) {
                C48579c.m105103a((Closeable) a);
            }
        }

        /* renamed from: a */
        public final InputStream mo96128a(int i) {
            return this.f122120e[0];
        }

        private C48576c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f122118c = str;
            this.f122119d = j;
            this.f122116a = fileArr;
            this.f122120e = inputStreamArr;
            this.f122121f = jArr;
        }
    }

    /* renamed from: j */
    private synchronized boolean m105078j() {
        return this.f122091f;
    }

    /* renamed from: k */
    private void m105079k() {
        if (m105078j()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: e */
    public final void mo96112e() throws IOException {
        close();
        C48579c.m105104a(this.f122087b);
    }

    /* renamed from: b */
    public final boolean mo96107b() {
        if (this.f122089d < 2000 || this.f122089d < this.f122100p.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final synchronized void mo96108c() throws IOException {
        if (this.f122090e) {
            m105079k();
            mo96111d();
            this.f122099o.flush();
        }
    }

    /* renamed from: f */
    public final Set<String> mo96113f() throws IOException {
        Set<String> unmodifiableSet;
        synchronized (this) {
            m105075g();
            unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.f122100p.keySet()));
        }
        return unmodifiableSet;
    }

    /* renamed from: i */
    private void m105077i() throws IOException {
        m105072a(this.f122094j);
        Iterator it = this.f122100p.values().iterator();
        while (it.hasNext()) {
            C48575b bVar = (C48575b) it.next();
            int i = 0;
            if (bVar.f122113d == null) {
                while (i < this.f122088c) {
                    this.f122098n += bVar.f122111b[i];
                    i++;
                }
            } else {
                bVar.f122113d = null;
                while (i < this.f122088c) {
                    m105072a(bVar.mo96124a(i));
                    m105072a(bVar.mo96127b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f122090e) {
            if (!this.f122091f) {
                Iterator it = new ArrayList(this.f122100p.values()).iterator();
                while (it.hasNext()) {
                    C48575b bVar = (C48575b) it.next();
                    if (bVar.f122113d != null) {
                        bVar.f122113d.mo96118b();
                    }
                }
                mo96111d();
                this.f122099o.close();
                this.f122099o = null;
                this.f122091f = true;
                return;
            }
        }
        this.f122091f = true;
    }

    /* renamed from: d */
    public final void mo96111d() throws IOException {
        while (this.f122098n > this.f122097m) {
            mo96109c((String) ((Entry) this.f122100p.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: g */
    private synchronized void m105075g() throws IOException {
        if (!this.f122090e) {
            if (this.f122095k.exists()) {
                if (!this.f122093i.exists()) {
                    m105073a(this.f122095k, this.f122093i, false);
                } else if (this.f122095k.delete()) {
                    if (this.f122095k.exists()) {
                        StringBuilder sb = new StringBuilder("failed to delete ");
                        sb.append(this.f122095k);
                        throw new IOException(sb.toString());
                    }
                }
            }
            if (this.f122093i.exists()) {
                try {
                    m105076h();
                    m105077i();
                    this.f122090e = true;
                    return;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = new StringBuilder("DiskLruCache ");
                    sb2.append(this.f122087b);
                    sb2.append(" is corrupt: ");
                    sb2.append(e.getMessage());
                    sb2.append(", removing");
                    printStream.println(sb2.toString());
                    mo96112e();
                    this.f122091f = false;
                } catch (Throwable th) {
                    this.f122091f = false;
                    throw th;
                }
            }
            mo96104a();
            this.f122090e = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:49|50|(1:52)|(1:54)(1:55)|56|57) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12.f122089d = r2 - r12.f122100p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        if (r0.f122123b == -1) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0113, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r1 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0116, code lost:
        mo96104a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        r12.f122099o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r12.f122093i, true), com.p683ss.android.ugc.effectmanager.p2431b.C48579c.f122128a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0106 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0133=Splitter:B:58:0x0133, B:14:0x0056=Splitter:B:14:0x0056} */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m105076h() throws java.io.IOException {
        /*
            r12 = this;
            com.ss.android.ugc.effectmanager.b.b r0 = new com.ss.android.ugc.effectmanager.b.b
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r12.f122093i
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.p683ss.android.ugc.effectmanager.p2431b.C48579c.f122128a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo96130a()     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = r0.mo96130a()     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = r0.mo96130a()     // Catch:{ all -> 0x0164 }
            java.lang.String r4 = r0.mo96130a()     // Catch:{ all -> 0x0164 }
            java.lang.String r5 = r0.mo96130a()     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0133
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0164 }
            if (r6 == 0) goto L_0x0133
            int r6 = r12.f122096l     // Catch:{ all -> 0x0164 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0164 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0133
            int r3 = r12.f122088c     // Catch:{ all -> 0x0164 }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0164 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0133
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0164 }
            if (r3 == 0) goto L_0x0133
            r1 = 0
            r2 = 0
        L_0x0054:
            r3 = 1
            r4 = -1
            java.lang.String r5 = r0.mo96130a()     // Catch:{ EOFException -> 0x0106 }
            r6 = 32
            int r7 = r5.indexOf(r6)     // Catch:{ EOFException -> 0x0106 }
            if (r7 == r4) goto L_0x00f2
            int r8 = r7 + 1
            int r6 = r5.indexOf(r6, r8)     // Catch:{ EOFException -> 0x0106 }
            if (r6 != r4) goto L_0x007f
            java.lang.String r8 = r5.substring(r8)     // Catch:{ EOFException -> 0x0106 }
            r9 = 6
            if (r7 != r9) goto L_0x0083
            java.lang.String r9 = "REMOVE"
            boolean r9 = r5.startsWith(r9)     // Catch:{ EOFException -> 0x0106 }
            if (r9 == 0) goto L_0x0083
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r5 = r12.f122100p     // Catch:{ EOFException -> 0x0106 }
            r5.remove(r8)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x007f:
            java.lang.String r8 = r5.substring(r8, r6)     // Catch:{ EOFException -> 0x0106 }
        L_0x0083:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r9 = r12.f122100p     // Catch:{ EOFException -> 0x0106 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ EOFException -> 0x0106 }
            com.ss.android.ugc.effectmanager.b.a$b r9 = (com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48575b) r9     // Catch:{ EOFException -> 0x0106 }
            r10 = 0
            if (r9 != 0) goto L_0x0098
            com.ss.android.ugc.effectmanager.b.a$b r9 = new com.ss.android.ugc.effectmanager.b.a$b     // Catch:{ EOFException -> 0x0106 }
            r9.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r11 = r12.f122100p     // Catch:{ EOFException -> 0x0106 }
            r11.put(r8, r9)     // Catch:{ EOFException -> 0x0106 }
        L_0x0098:
            r8 = 5
            if (r6 == r4) goto L_0x00b9
            if (r7 != r8) goto L_0x00b9
            java.lang.String r11 = "CLEAN"
            boolean r11 = r5.startsWith(r11)     // Catch:{ EOFException -> 0x0106 }
            if (r11 == 0) goto L_0x00b9
            int r6 = r6 + 1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r6 = " "
            java.lang.String[] r5 = r5.split(r6)     // Catch:{ EOFException -> 0x0106 }
            r9.f122112c = r3     // Catch:{ EOFException -> 0x0106 }
            r9.f122113d = r10     // Catch:{ EOFException -> 0x0106 }
            r9.mo96126a(r5)     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x00b9:
            if (r6 != r4) goto L_0x00cd
            if (r7 != r8) goto L_0x00cd
            java.lang.String r8 = "DIRTY"
            boolean r8 = r5.startsWith(r8)     // Catch:{ EOFException -> 0x0106 }
            if (r8 == 0) goto L_0x00cd
            com.ss.android.ugc.effectmanager.b.a$a r5 = new com.ss.android.ugc.effectmanager.b.a$a     // Catch:{ EOFException -> 0x0106 }
            r5.<init>(r9)     // Catch:{ EOFException -> 0x0106 }
            r9.f122113d = r5     // Catch:{ EOFException -> 0x0106 }
            goto L_0x00da
        L_0x00cd:
            if (r6 != r4) goto L_0x00de
            r6 = 4
            if (r7 != r6) goto L_0x00de
            java.lang.String r6 = "READ"
            boolean r6 = r5.startsWith(r6)     // Catch:{ EOFException -> 0x0106 }
            if (r6 == 0) goto L_0x00de
        L_0x00da:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x00de:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r8 = "unexpected journal line: "
            r7.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            r7.append(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = r7.toString()     // Catch:{ EOFException -> 0x0106 }
            r6.<init>(r5)     // Catch:{ EOFException -> 0x0106 }
            throw r6     // Catch:{ EOFException -> 0x0106 }
        L_0x00f2:
            java.io.IOException r6 = new java.io.IOException     // Catch:{ EOFException -> 0x0106 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r8 = "unexpected journal line: "
            r7.<init>(r8)     // Catch:{ EOFException -> 0x0106 }
            r7.append(r5)     // Catch:{ EOFException -> 0x0106 }
            java.lang.String r5 = r7.toString()     // Catch:{ EOFException -> 0x0106 }
            r6.<init>(r5)     // Catch:{ EOFException -> 0x0106 }
            throw r6     // Catch:{ EOFException -> 0x0106 }
        L_0x0106:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r5 = r12.f122100p     // Catch:{ all -> 0x0164 }
            int r5 = r5.size()     // Catch:{ all -> 0x0164 }
            int r2 = r2 - r5
            r12.f122089d = r2     // Catch:{ all -> 0x0164 }
            int r2 = r0.f122123b     // Catch:{ all -> 0x0164 }
            if (r2 != r4) goto L_0x0114
            r1 = 1
        L_0x0114:
            if (r1 == 0) goto L_0x011a
            r12.mo96104a()     // Catch:{ all -> 0x0164 }
            goto L_0x012f
        L_0x011a:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x0164 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0164 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0164 }
            java.io.File r5 = r12.f122093i     // Catch:{ all -> 0x0164 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0164 }
            java.nio.charset.Charset r3 = com.p683ss.android.ugc.effectmanager.p2431b.C48579c.f122128a     // Catch:{ all -> 0x0164 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0164 }
            r1.<init>(r2)     // Catch:{ all -> 0x0164 }
            r12.f122099o = r1     // Catch:{ all -> 0x0164 }
        L_0x012f:
            com.p683ss.android.ugc.effectmanager.p2431b.C48579c.m105103a(r0)
            return
        L_0x0133:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0164 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0164 }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x0164 }
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            r6.append(r2)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            r6.append(r4)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            r6.append(r5)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0164 }
            r3.<init>(r1)     // Catch:{ all -> 0x0164 }
            throw r3     // Catch:{ all -> 0x0164 }
        L_0x0164:
            r1 = move-exception
            com.p683ss.android.ugc.effectmanager.p2431b.C48579c.m105103a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.m105076h():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(1:4)|5|6|7|8|9|10|(8:11|12|(4:15|(2:17|34)(2:18|35)|33|13)|19|20|(1:22)|23|24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo96104a() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.f122099o     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x000a
            java.io.Writer r0 = r6.f122099o     // Catch:{ all -> 0x00f0 }
            r0.close()     // Catch:{ all -> 0x00f0 }
        L_0x000a:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0012 }
            java.io.File r1 = r6.f122094j     // Catch:{ FileNotFoundException -> 0x0012 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0012 }
            goto L_0x0022
        L_0x0012:
            java.io.File r0 = r6.f122094j     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ all -> 0x00f0 }
            r0.mkdirs()     // Catch:{ all -> 0x00f0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.File r1 = r6.f122094j     // Catch:{ all -> 0x00f0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x0022:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00f0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00f0 }
            java.nio.charset.Charset r3 = com.p683ss.android.ugc.effectmanager.p2431b.C48579c.f122128a     // Catch:{ all -> 0x00f0 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00f0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "1"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r6.f122096l     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00eb }
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r6.f122088c     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00eb }
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r6.f122100p     // Catch:{ all -> 0x00eb }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00eb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00eb }
        L_0x006d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00eb }
            com.ss.android.ugc.effectmanager.b.a$b r2 = (com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48575b) r2     // Catch:{ all -> 0x00eb }
            com.ss.android.ugc.effectmanager.b.a$a r3 = r2.f122113d     // Catch:{ all -> 0x00eb }
            r4 = 10
            if (r3 == 0) goto L_0x0096
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DIRTY "
            r3.<init>(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.f122110a     // Catch:{ all -> 0x00eb }
            r3.append(r2)     // Catch:{ all -> 0x00eb }
            r3.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00eb }
            r1.write(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x006d
        L_0x0096:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "CLEAN "
            r3.<init>(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = r2.f122110a     // Catch:{ all -> 0x00eb }
            r3.append(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.mo96125a()     // Catch:{ all -> 0x00eb }
            r3.append(r2)     // Catch:{ all -> 0x00eb }
            r3.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00eb }
            r1.write(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x006d
        L_0x00b4:
            r1.close()     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r6.f122093i     // Catch:{ all -> 0x00f0 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00f0 }
            r1 = 1
            if (r0 == 0) goto L_0x00c7
            java.io.File r0 = r6.f122093i     // Catch:{ all -> 0x00f0 }
            java.io.File r2 = r6.f122095k     // Catch:{ all -> 0x00f0 }
            m105073a(r0, r2, r1)     // Catch:{ all -> 0x00f0 }
        L_0x00c7:
            java.io.File r0 = r6.f122094j     // Catch:{ all -> 0x00f0 }
            java.io.File r2 = r6.f122093i     // Catch:{ all -> 0x00f0 }
            r3 = 0
            m105073a(r0, r2, r3)     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r6.f122095k     // Catch:{ all -> 0x00f0 }
            r0.delete()     // Catch:{ all -> 0x00f0 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00f0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00f0 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.File r4 = r6.f122093i     // Catch:{ all -> 0x00f0 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00f0 }
            java.nio.charset.Charset r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48579c.f122128a     // Catch:{ all -> 0x00f0 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00f0 }
            r0.<init>(r2)     // Catch:{ all -> 0x00f0 }
            r6.f122099o = r0     // Catch:{ all -> 0x00f0 }
            monitor-exit(r6)
            return
        L_0x00eb:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.mo96104a():void");
    }

    /* renamed from: b */
    public final C48573a mo96106b(String str) throws IOException {
        return m105070a(str, -1);
    }

    /* renamed from: a */
    private static void m105072a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private static void m105074d(String str) {
        if (!f122085a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo96109c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m105075g()     // Catch:{ all -> 0x008a }
            r7.m105079k()     // Catch:{ all -> 0x008a }
            m105074d(r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r7.f122100p     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            com.ss.android.ugc.effectmanager.b.a$b r0 = (com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48575b) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.ss.android.ugc.effectmanager.b.a$a r2 = r0.f122113d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x001a
            goto L_0x0088
        L_0x001a:
            int r2 = r7.f122088c     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0056
            java.io.File r2 = r0.mo96124a(r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.f122098n     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f122111b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            r4 = 0
            long r2 = r2 - r5
            r7.f122098n = r2     // Catch:{ all -> 0x008a }
            long[] r2 = r0.f122111b     // Catch:{ all -> 0x008a }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0056:
            int r0 = r7.f122089d     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f122089d = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.f122099o     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r7.f122100p     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.mo96107b()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f122092g     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f122102r     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.mo96109c(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12.f122089d++;
        r1 = r12.f122099o;
        r2 = new java.lang.StringBuilder("READ ");
        r2.append(r13);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (mo96107b() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r12.f122092g.submit(r12.f122102r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r3 = new com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48576c(r12, r13, r0.f122114e, r8, r9, r0.f122111b, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0077 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48576c mo96103a(java.lang.String r13) throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            r12.m105075g()     // Catch:{ all -> 0x0089 }
            r12.m105079k()     // Catch:{ all -> 0x0089 }
            m105074d(r13)     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r12.f122100p     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0089 }
            com.ss.android.ugc.effectmanager.b.a$b r0 = (com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48575b) r0     // Catch:{ all -> 0x0089 }
            r1 = 0
            if (r0 != 0) goto L_0x0017
            monitor-exit(r12)
            return r1
        L_0x0017:
            boolean r2 = r0.f122112c     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r12)
            return r1
        L_0x001d:
            int r2 = r12.f122088c     // Catch:{ all -> 0x0089 }
            java.io.InputStream[] r9 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0089 }
            int r2 = r12.f122088c     // Catch:{ all -> 0x0089 }
            java.io.File[] r8 = new java.io.File[r2]     // Catch:{ all -> 0x0089 }
            r2 = 0
            r3 = 0
        L_0x0027:
            int r4 = r12.f122088c     // Catch:{ FileNotFoundException -> 0x0077 }
            if (r3 >= r4) goto L_0x003d
            java.io.File r4 = r0.mo96124a(r3)     // Catch:{ FileNotFoundException -> 0x0077 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0077 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0077 }
            r5 = r8[r3]     // Catch:{ FileNotFoundException -> 0x0077 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0077 }
            r9[r3] = r4     // Catch:{ FileNotFoundException -> 0x0077 }
            int r3 = r3 + 1
            goto L_0x0027
        L_0x003d:
            int r1 = r12.f122089d     // Catch:{ all -> 0x0089 }
            int r1 = r1 + 1
            r12.f122089d = r1     // Catch:{ all -> 0x0089 }
            java.io.Writer r1 = r12.f122099o     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x0089 }
            r2.append(r13)     // Catch:{ all -> 0x0089 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0089 }
            r1.append(r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = r12.mo96107b()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0068
            java.util.concurrent.ThreadPoolExecutor r1 = r12.f122092g     // Catch:{ all -> 0x0089 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r12.f122102r     // Catch:{ all -> 0x0089 }
            r1.submit(r2)     // Catch:{ all -> 0x0089 }
        L_0x0068:
            com.ss.android.ugc.effectmanager.b.a$c r1 = new com.ss.android.ugc.effectmanager.b.a$c     // Catch:{ all -> 0x0089 }
            long r6 = r0.f122114e     // Catch:{ all -> 0x0089 }
            long[] r10 = r0.f122111b     // Catch:{ all -> 0x0089 }
            r11 = 0
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0089 }
            monitor-exit(r12)
            return r1
        L_0x0077:
            int r13 = r12.f122088c     // Catch:{ all -> 0x0089 }
            if (r2 >= r13) goto L_0x0087
            r13 = r9[r2]     // Catch:{ all -> 0x0089 }
            if (r13 == 0) goto L_0x0087
            r13 = r9[r2]     // Catch:{ all -> 0x0089 }
            com.p683ss.android.ugc.effectmanager.p2431b.C48579c.m105103a(r13)     // Catch:{ all -> 0x0089 }
            int r2 = r2 + 1
            goto L_0x0077
        L_0x0087:
            monitor-exit(r12)
            return r1
        L_0x0089:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.mo96103a(java.lang.String):com.ss.android.ugc.effectmanager.b.a$c");
    }

    /* renamed from: a */
    private synchronized C48573a m105070a(String str, long j) throws IOException {
        m105075g();
        m105079k();
        m105074d(str);
        C48575b bVar = (C48575b) this.f122100p.get(str);
        if (bVar == null) {
            bVar = new C48575b(str);
            this.f122100p.put(str, bVar);
        } else if (bVar.f122113d != null) {
            return null;
        }
        C48573a aVar = new C48573a(bVar);
        bVar.f122113d = aVar;
        Writer writer = this.f122099o;
        StringBuilder sb = new StringBuilder("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f122099o.flush();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo96105a(com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48573a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.b.a$b r0 = r10.f122104a     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.effectmanager.b.a$a r1 = r0.f122113d     // Catch:{ all -> 0x00f1 }
            if (r1 != r10) goto L_0x00eb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f122112c     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f122088c     // Catch:{ all -> 0x00f1 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f122105b     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.mo96127b(r2)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0028
            r10.mo96118b()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.mo96118b()     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            int r10 = r9.f122088c     // Catch:{ all -> 0x00f1 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.mo96127b(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.mo96124a(r1)     // Catch:{ all -> 0x00f1 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f122111b     // Catch:{ all -> 0x00f1 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f1 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f122111b     // Catch:{ all -> 0x00f1 }
            r10[r1] = r5     // Catch:{ all -> 0x00f1 }
            long r7 = r9.f122098n     // Catch:{ all -> 0x00f1 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f122098n = r7     // Catch:{ all -> 0x00f1 }
            goto L_0x0070
        L_0x006d:
            m105072a(r10)     // Catch:{ all -> 0x00f1 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.f122089d     // Catch:{ all -> 0x00f1 }
            r1 = 1
            int r10 = r10 + r1
            r9.f122089d = r10     // Catch:{ all -> 0x00f1 }
            r10 = 0
            r0.f122113d = r10     // Catch:{ all -> 0x00f1 }
            boolean r10 = r0.f122112c     // Catch:{ all -> 0x00f1 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b0
            r0.f122112c = r1     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f122099o     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.f122110a     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.mo96125a()     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00cf
            long r10 = r9.f122101q     // Catch:{ all -> 0x00f1 }
            r1 = 1
            long r1 = r1 + r10
            r9.f122101q = r1     // Catch:{ all -> 0x00f1 }
            r0.f122114e = r10     // Catch:{ all -> 0x00f1 }
            goto L_0x00cf
        L_0x00b0:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r10 = r9.f122100p     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r0.f122110a     // Catch:{ all -> 0x00f1 }
            r10.remove(r11)     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f122099o     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.f122110a     // Catch:{ all -> 0x00f1 }
            r11.append(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            java.io.Writer r10 = r9.f122099o     // Catch:{ all -> 0x00f1 }
            r10.flush()     // Catch:{ all -> 0x00f1 }
            long r10 = r9.f122098n     // Catch:{ all -> 0x00f1 }
            long r0 = r9.f122097m     // Catch:{ all -> 0x00f1 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            boolean r10 = r9.mo96107b()     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e9
        L_0x00e2:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f122092g     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f122102r     // Catch:{ all -> 0x00f1 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.mo96105a(com.ss.android.ugc.effectmanager.b.a$a, boolean):void");
    }

    /* renamed from: a */
    private static void m105073a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m105072a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static C48570a m105071a(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            C48570a aVar = new C48570a(file, i, 1, j);
            return aVar;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private C48570a(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f122092g = threadPoolExecutor;
        this.f122102r = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.effectmanager.b.a r0 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this
                    monitor-enter(r0)
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x002c }
                    boolean r1 = r1.f122090e     // Catch:{ all -> 0x002c }
                    r1 = r1 ^ 1
                    com.ss.android.ugc.effectmanager.b.a r2 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x002c }
                    boolean r2 = r2.f122091f     // Catch:{ all -> 0x002c }
                    r1 = r1 | r2
                    r2 = 0
                    if (r1 == 0) goto L_0x0013
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    return r2
                L_0x0013:
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x002c }
                    r1.mo96111d()     // Catch:{ all -> 0x002c }
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x002c }
                    boolean r1 = r1.mo96107b()     // Catch:{ all -> 0x002c }
                    if (r1 == 0) goto L_0x002a
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x002c }
                    r1.mo96104a()     // Catch:{ all -> 0x002c }
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p683ss.android.ugc.effectmanager.p2431b.C48570a.this     // Catch:{ all -> 0x002c }
                    r3 = 0
                    r1.f122089d = r3     // Catch:{ all -> 0x002c }
                L_0x002a:
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    return r2
                L_0x002c:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C485711.call():java.lang.Void");
            }
        };
        this.f122087b = file;
        this.f122096l = i;
        this.f122093i = new File(file, "journal");
        this.f122094j = new File(file, "journal.tmp");
        this.f122095k = new File(file, "journal.bkp");
        this.f122088c = i2;
        this.f122097m = j;
    }
}

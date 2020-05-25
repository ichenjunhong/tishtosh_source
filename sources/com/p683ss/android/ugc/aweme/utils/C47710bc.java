package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.utils.bc */
public final class C47710bc implements Closeable {

    /* renamed from: a */
    public static final Charset f120199a = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final String f120200g = "bc";

    /* renamed from: b */
    public final File f120201b;

    /* renamed from: c */
    public final long f120202c;

    /* renamed from: d */
    public final int f120203d;

    /* renamed from: e */
    public Writer f120204e;

    /* renamed from: f */
    public int f120205f;

    /* renamed from: h */
    private final File f120206h;

    /* renamed from: i */
    private final File f120207i;

    /* renamed from: j */
    private final int f120208j;

    /* renamed from: k */
    private long f120209k;

    /* renamed from: l */
    private final LinkedHashMap<String, C47714b> f120210l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    private long f120211m = 0;

    /* renamed from: n */
    private final ExecutorService f120212n;

    /* renamed from: o */
    private final Callable<Void> f120213o;

    /* renamed from: com.ss.android.ugc.aweme.utils.bc$a */
    public final class C47712a {

        /* renamed from: a */
        public final C47714b f120215a;

        /* renamed from: b */
        public boolean f120216b;

        /* renamed from: com.ss.android.ugc.aweme.utils.bc$a$a */
        class C47713a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C47712a.this.f120216b = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C47712a.this.f120216b = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C47712a.this.f120216b = true;
                }
            }

            private C47713a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C47712a.this.f120216b = true;
                }
            }
        }

        /* renamed from: b */
        public final void mo95006b() throws IOException {
            C47710bc.this.mo94995a(this, false);
        }

        /* renamed from: a */
        public final void mo95005a() throws IOException {
            if (this.f120216b) {
                C47710bc.this.mo94995a(this, false);
                C47710bc.this.mo94999c(this.f120215a.f120219a);
                return;
            }
            C47710bc.this.mo94995a(this, true);
        }

        /* renamed from: a */
        public final OutputStream mo95004a(int i) throws IOException {
            C47713a aVar;
            synchronized (C47710bc.this) {
                if (this.f120215a.f120222d == this) {
                    aVar = new C47713a(new FileOutputStream(this.f120215a.mo95014b(0)));
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C47712a(C47714b bVar) {
            this.f120215a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bc$b */
    final class C47714b {

        /* renamed from: a */
        public final String f120219a;

        /* renamed from: b */
        public final long[] f120220b;

        /* renamed from: c */
        public boolean f120221c;

        /* renamed from: d */
        public C47712a f120222d;

        /* renamed from: e */
        public long f120223e;

        /* renamed from: a */
        public final String mo95012a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f120220b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m103279b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final File mo95011a(int i) {
            File file = C47710bc.this.f120201b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f120219a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            return new File(file, sb.toString());
        }

        /* renamed from: b */
        public final File mo95014b(int i) {
            File file = C47710bc.this.f120201b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f120219a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            sb.append(".tmp");
            return new File(file, sb.toString());
        }

        /* renamed from: a */
        public final void mo95013a(String[] strArr) throws IOException {
            if (strArr.length == C47710bc.this.f120203d) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f120220b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m103279b(strArr);
                    }
                }
                return;
            }
            throw m103279b(strArr);
        }

        private C47714b(String str) {
            this.f120219a = str;
            this.f120220b = new long[C47710bc.this.f120203d];
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bc$c */
    public final class C47715c implements Closeable {

        /* renamed from: b */
        private final String f120226b;

        /* renamed from: c */
        private final long f120227c;

        /* renamed from: d */
        private final InputStream[] f120228d;

        public final void close() {
            for (InputStream a : this.f120228d) {
                C47710bc.m103259a((Closeable) a);
            }
        }

        /* renamed from: a */
        public final InputStream mo95015a(int i) {
            return this.f120228d[0];
        }

        private C47715c(String str, long j, InputStream[] inputStreamArr) {
            this.f120226b = str;
            this.f120227c = j;
            this.f120228d = inputStreamArr;
        }
    }

    /* renamed from: c */
    public final boolean mo94998c() {
        if (this.f120204e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m103265h() {
        if (this.f120204e == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: d */
    public final synchronized void mo95001d() throws IOException {
        m103265h();
        mo95002e();
        this.f120204e.flush();
    }

    /* renamed from: b */
    public final boolean mo94997b() {
        if (this.f120205f < 2000 || this.f120205f < this.f120210l.size()) {
            return false;
        }
        return true;
    }

    public final synchronized void close() throws IOException {
        if (this.f120204e != null) {
            Iterator it = new ArrayList(this.f120210l.values()).iterator();
            while (it.hasNext()) {
                C47714b bVar = (C47714b) it.next();
                if (bVar.f120222d != null) {
                    bVar.f120222d.mo95006b();
                }
            }
            mo95002e();
            this.f120204e.close();
            this.f120204e = null;
        }
    }

    /* renamed from: e */
    public final void mo95002e() throws IOException {
        while (this.f120209k > this.f120202c) {
            mo94999c((String) ((Entry) this.f120210l.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: g */
    private void m103264g() throws IOException {
        m103261b(this.f120207i);
        Iterator it = this.f120210l.values().iterator();
        while (it.hasNext()) {
            C47714b bVar = (C47714b) it.next();
            int i = 0;
            if (bVar.f120222d == null) {
                while (i < this.f120203d) {
                    this.f120209k += bVar.f120220b[i];
                    i++;
                }
            } else {
                bVar.f120222d = null;
                while (i < this.f120203d) {
                    m103261b(bVar.mo95011a(i));
                    m103261b(bVar.mo95014b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m103263f() throws IOException {
        String a;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f120206h), VideoCacheReadBuffersizeExperiment.DEFAULT);
        try {
            String a2 = m103258a((InputStream) bufferedInputStream);
            String a3 = m103258a((InputStream) bufferedInputStream);
            String a4 = m103258a((InputStream) bufferedInputStream);
            String a5 = m103258a((InputStream) bufferedInputStream);
            String a6 = m103258a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.f120208j).equals(a4) || !Integer.toString(this.f120203d).equals(a5) || !"".equals(a6)) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(a2);
                sb.append(", ");
                sb.append(a3);
                sb.append(", ");
                sb.append(a5);
                sb.append(", ");
                sb.append(a6);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            while (true) {
                try {
                    a = m103258a((InputStream) bufferedInputStream);
                    String[] split = a.split(" ");
                    if (split.length >= 2) {
                        String str = split[1];
                        if (!split[0].equals("REMOVE") || split.length != 2) {
                            C47714b bVar = (C47714b) this.f120210l.get(str);
                            if (bVar == null) {
                                bVar = new C47714b(str);
                                this.f120210l.put(str, bVar);
                            }
                            if (split[0].equals("CLEAN") && split.length == this.f120203d + 2) {
                                bVar.f120221c = true;
                                bVar.f120222d = null;
                                int length = split.length;
                                int length2 = split.length;
                                if (2 > length) {
                                    throw new IllegalArgumentException();
                                } else if (2 <= length2) {
                                    int i = length - 2;
                                    int min = Math.min(i, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i);
                                    System.arraycopy(split, 2, objArr, 0, min);
                                    bVar.mo95013a((String[]) objArr);
                                } else {
                                    throw new ArrayIndexOutOfBoundsException();
                                }
                            } else if (split[0].equals("DIRTY") && split.length == 2) {
                                bVar.f120222d = new C47712a(bVar);
                            } else if (!split[0].equals("READ") || split.length != 2) {
                                StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
                                sb2.append(a);
                            }
                        } else {
                            this.f120210l.remove(str);
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("unexpected journal line: ");
                        sb3.append(a);
                        throw new IOException(sb3.toString());
                    }
                } catch (EOFException unused) {
                    m103259a((Closeable) bufferedInputStream);
                    return;
                }
            }
            StringBuilder sb22 = new StringBuilder("unexpected journal line: ");
            sb22.append(a);
            throw new IOException(sb22.toString());
        } catch (Throwable th) {
            m103259a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized void mo94994a() throws IOException {
        if (this.f120204e != null) {
            this.f120204e.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f120207i), VideoCacheReadBuffersizeExperiment.DEFAULT);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f120208j));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f120203d));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C47714b bVar : this.f120210l.values()) {
            if (bVar.f120222d != null) {
                StringBuilder sb = new StringBuilder("DIRTY ");
                sb.append(bVar.f120219a);
                sb.append(10);
                bufferedWriter.write(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(bVar.f120219a);
                sb2.append(bVar.mo95012a());
                sb2.append(10);
                bufferedWriter.write(sb2.toString());
            }
        }
        bufferedWriter.close();
        this.f120207i.renameTo(this.f120206h);
        this.f120204e = new BufferedWriter(new FileWriter(this.f120206h, true), VideoCacheReadBuffersizeExperiment.DEFAULT);
    }

    /* renamed from: b */
    public final C47712a mo94996b(String str) throws IOException {
        return m103256a(str, -1);
    }

    /* renamed from: a */
    public static void m103259a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m103261b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static String m103258a(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == 13) {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    /* renamed from: d */
    private static void m103262d(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder sb = new StringBuilder("keys must not contain spaces or newlines: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo94999c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m103265h()     // Catch:{ all -> 0x0080 }
            m103262d(r8)     // Catch:{ all -> 0x0080 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.bc$b> r0 = r7.f120210l     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0080 }
            com.ss.android.ugc.aweme.utils.bc$b r0 = (com.p683ss.android.ugc.aweme.utils.C47710bc.C47714b) r0     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.utils.bc$a r2 = r0.f120222d     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            int r2 = r7.f120203d     // Catch:{ all -> 0x0080 }
            if (r1 >= r2) goto L_0x004c
            java.io.File r2 = r0.mo95011a(r1)     // Catch:{ all -> 0x0080 }
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0038
            long r2 = r7.f120209k     // Catch:{ all -> 0x0080 }
            long[] r4 = r0.f120220b     // Catch:{ all -> 0x0080 }
            r5 = r4[r1]     // Catch:{ all -> 0x0080 }
            r4 = 0
            long r2 = r2 - r5
            r7.f120209k = r2     // Catch:{ all -> 0x0080 }
            long[] r2 = r0.f120220b     // Catch:{ all -> 0x0080 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0080 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0038:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x0080 }
            r0.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0080 }
            r8.<init>(r0)     // Catch:{ all -> 0x0080 }
            throw r8     // Catch:{ all -> 0x0080 }
        L_0x004c:
            int r0 = r7.f120205f     // Catch:{ all -> 0x0080 }
            r1 = 1
            int r0 = r0 + r1
            r7.f120205f = r0     // Catch:{ all -> 0x0080 }
            java.io.Writer r0 = r7.f120204e     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            r2.append(r8)     // Catch:{ all -> 0x0080 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0080 }
            r0.append(r2)     // Catch:{ all -> 0x0080 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.bc$b> r0 = r7.f120210l     // Catch:{ all -> 0x0080 }
            r0.remove(r8)     // Catch:{ all -> 0x0080 }
            boolean r8 = r7.mo94997b()     // Catch:{ all -> 0x0080 }
            if (r8 == 0) goto L_0x007c
            java.util.concurrent.ExecutorService r8 = r7.f120212n     // Catch:{ all -> 0x0080 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f120213o     // Catch:{ all -> 0x0080 }
            r8.submit(r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            monitor-exit(r7)
            return r1
        L_0x007e:
            monitor-exit(r7)
            return r1
        L_0x0080:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47710bc.mo94999c(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m103260a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m103260a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a directory: ");
        sb2.append(file);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final synchronized C47715c mo94993a(String str) throws IOException {
        m103265h();
        m103262d(str);
        C47714b bVar = (C47714b) this.f120210l.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f120221c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f120203d];
        int i = 0;
        while (i < this.f120203d) {
            try {
                inputStreamArr[i] = new FileInputStream(bVar.mo95011a(i));
                i++;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.f120205f++;
        Writer writer = this.f120204e;
        StringBuilder sb = new StringBuilder("READ ");
        sb.append(str);
        sb.append(10);
        writer.append(sb.toString());
        if (mo94997b()) {
            this.f120212n.submit(this.f120213o);
        }
        C47715c cVar = new C47715c(str, bVar.f120223e, inputStreamArr);
        return cVar;
    }

    /* renamed from: a */
    private synchronized C47712a m103256a(String str, long j) throws IOException {
        m103265h();
        m103262d(str);
        C47714b bVar = (C47714b) this.f120210l.get(str);
        if (bVar == null) {
            bVar = new C47714b(str);
            this.f120210l.put(str, bVar);
        } else if (bVar.f120222d != null) {
            return null;
        }
        C47712a aVar = new C47712a(bVar);
        bVar.f120222d = aVar;
        Writer writer = this.f120204e;
        StringBuilder sb = new StringBuilder("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f120204e.flush();
        return aVar;
    }

    /* renamed from: a */
    public final synchronized void mo94995a(C47712a aVar, boolean z) throws IOException {
        C47714b bVar = aVar.f120215a;
        if (bVar.f120222d == aVar) {
            if (z && !bVar.f120221c) {
                int i = 0;
                while (i < this.f120203d) {
                    if (bVar.mo95014b(i).exists()) {
                        i++;
                    } else {
                        aVar.mo95006b();
                        StringBuilder sb = new StringBuilder("edit didn't create file ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            for (int i2 = 0; i2 < this.f120203d; i2++) {
                File b = bVar.mo95014b(i2);
                if (!z) {
                    m103261b(b);
                } else if (b.exists()) {
                    File a = bVar.mo95011a(i2);
                    b.renameTo(a);
                    long j = bVar.f120220b[i2];
                    long length = a.length();
                    bVar.f120220b[i2] = length;
                    this.f120209k = (this.f120209k - j) + length;
                }
            }
            this.f120205f++;
            bVar.f120222d = null;
            if (bVar.f120221c || z) {
                bVar.f120221c = true;
                Writer writer = this.f120204e;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(bVar.f120219a);
                sb2.append(bVar.mo95012a());
                sb2.append(10);
                writer.write(sb2.toString());
                if (z) {
                    long j2 = this.f120211m;
                    this.f120211m = 1 + j2;
                    bVar.f120223e = j2;
                }
            } else {
                this.f120210l.remove(bVar.f120219a);
                Writer writer2 = this.f120204e;
                StringBuilder sb3 = new StringBuilder("REMOVE ");
                sb3.append(bVar.f120219a);
                sb3.append(10);
                writer2.write(sb3.toString());
            }
            if (this.f120209k > this.f120202c || mo94997b()) {
                this.f120212n.submit(this.f120213o);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private C47710bc(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f120212n = threadPoolExecutor;
        this.f120213o = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.utils.bc r0 = com.p683ss.android.ugc.aweme.utils.C47710bc.this
                    monitor-enter(r0)
                    com.ss.android.ugc.aweme.utils.bc r1 = com.p683ss.android.ugc.aweme.utils.C47710bc.this     // Catch:{ all -> 0x0025 }
                    java.io.Writer r1 = r1.f120204e     // Catch:{ all -> 0x0025 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000c
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x000c:
                    com.ss.android.ugc.aweme.utils.bc r1 = com.p683ss.android.ugc.aweme.utils.C47710bc.this     // Catch:{ all -> 0x0025 }
                    r1.mo95002e()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.aweme.utils.bc r1 = com.p683ss.android.ugc.aweme.utils.C47710bc.this     // Catch:{ all -> 0x0025 }
                    boolean r1 = r1.mo94997b()     // Catch:{ all -> 0x0025 }
                    if (r1 == 0) goto L_0x0023
                    com.ss.android.ugc.aweme.utils.bc r1 = com.p683ss.android.ugc.aweme.utils.C47710bc.this     // Catch:{ all -> 0x0025 }
                    r1.mo94994a()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.aweme.utils.bc r1 = com.p683ss.android.ugc.aweme.utils.C47710bc.this     // Catch:{ all -> 0x0025 }
                    r3 = 0
                    r1.f120205f = r3     // Catch:{ all -> 0x0025 }
                L_0x0023:
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x0025:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47710bc.C477111.call():java.lang.Void");
            }
        };
        this.f120201b = file;
        this.f120208j = i;
        this.f120206h = new File(file, "journal");
        this.f120207i = new File(file, "journal.tmp");
        this.f120203d = i2;
        this.f120202c = j;
    }

    /* renamed from: a */
    public static C47710bc m103257a(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            C47710bc bcVar = new C47710bc(file, i, 1, j);
            if (bcVar.f120206h.exists()) {
                try {
                    bcVar.m103263f();
                    bcVar.m103264g();
                    bcVar.f120204e = new BufferedWriter(new FileWriter(bcVar.f120206h, true), VideoCacheReadBuffersizeExperiment.DEFAULT);
                    return bcVar;
                } catch (IOException unused) {
                    bcVar.close();
                    m103260a(bcVar.f120201b);
                }
            }
            file.mkdirs();
            C47710bc bcVar2 = new C47710bc(file, i, 1, j);
            bcVar2.mo94994a();
            return bcVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}

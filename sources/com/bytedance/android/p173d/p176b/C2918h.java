package com.bytedance.android.p173d.p176b;

import com.bytedance.android.p173d.p176b.C2915f.C2916a;
import com.bytedance.android.p173d.p176b.p177a.C2898a;
import com.bytedance.android.p173d.p176b.p177a.C2906b;
import com.bytedance.android.p173d.p176b.p177a.C2906b.C2907a;
import com.bytedance.android.p173d.p176b.p177a.C2908c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileLock;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bytedance.android.d.b.h */
public final class C2918h implements C2915f {

    /* renamed from: a */
    public static int f8595a = 32768;

    /* renamed from: b */
    public static int f8596b = 8192;

    /* renamed from: c */
    public final Map<String, C2922a> f8597c = new LinkedHashMap();

    /* renamed from: d */
    public final C2916a f8598d;

    /* renamed from: e */
    private volatile int f8599e = 16;

    /* renamed from: f */
    private volatile int f8600f = -1;

    /* renamed from: g */
    private volatile MappedByteBuffer f8601g;

    /* renamed from: h */
    private final FileChannel f8602h;

    /* renamed from: i */
    private final RandomAccessFile f8603i;

    /* renamed from: j */
    private final boolean f8604j;

    /* renamed from: k */
    private final C2924c f8605k;

    /* renamed from: l */
    private final C2924c f8606l;

    /* renamed from: m */
    private final C2908c f8607m = new C2908c();

    /* renamed from: n */
    private final C2898a f8608n = new C2898a();

    /* renamed from: o */
    private final C2906b f8609o = new C2906b();

    /* renamed from: p */
    private final C2911c f8610p = new C2911c();

    /* renamed from: q */
    private final ThreadLocal<byte[]> f8611q = new ThreadLocal<byte[]>() {
        /* access modifiers changed from: protected */
        public final /* bridge */ /* synthetic */ Object initialValue() {
            return new byte[C2918h.f8596b];
        }
    };

    /* renamed from: r */
    private C2923b f8612r = new C2923b() {
        /* renamed from: a */
        public final void mo7568a(String str, C2922a aVar) {
            C2918h.this.f8597c.put(str, aVar);
            C2918h.this.f8598d.mo7560d(str);
        }

        /* renamed from: b */
        public final void mo7569b(String str, C2922a aVar) {
            C2918h.this.f8597c.remove(str);
            C2918h.this.f8598d.mo7560d(str);
        }
    };

    /* renamed from: com.bytedance.android.d.b.h$a */
    static final class C2922a {

        /* renamed from: a */
        volatile int f8617a;

        /* renamed from: b */
        volatile int f8618b;

        C2922a() {
        }

        C2922a(int i, int i2) {
            this.f8617a = i;
            this.f8618b = i2;
        }
    }

    /* renamed from: com.bytedance.android.d.b.h$b */
    interface C2923b {
        /* renamed from: a */
        void mo7568a(String str, C2922a aVar);

        /* renamed from: b */
        void mo7569b(String str, C2922a aVar);
    }

    /* renamed from: com.bytedance.android.d.b.h$c */
    interface C2924c {
        /* renamed from: a */
        void mo7570a();

        /* renamed from: b */
        void mo7571b();
    }

    /* renamed from: com.bytedance.android.d.b.h$d */
    static abstract class C2925d implements C2924c {

        /* renamed from: a */
        final ReentrantLock f8619a = new ReentrantLock();

        /* renamed from: b */
        final FileChannel f8620b;

        /* renamed from: c */
        FileLock f8621c;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo7572c();

        /* renamed from: a */
        public final void mo7570a() {
            this.f8619a.lock();
            mo7572c();
        }

        /* renamed from: b */
        public final void mo7571b() {
            try {
                this.f8621c.release();
            } catch (Exception e) {
                C2909b.m8288b("Failed to release FileLock", e);
            }
            this.f8619a.unlock();
        }

        C2925d(FileChannel fileChannel) {
            this.f8620b = fileChannel;
        }
    }

    /* renamed from: com.bytedance.android.d.b.h$e */
    static final class C2926e extends C2925d {
        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo7572c() {
            try {
                this.f8621c = this.f8620b.lock(0, Long.MAX_VALUE, true);
            } catch (Exception e) {
                C2909b.m8288b("Failed to lock FileLock", e);
            }
        }

        C2926e(FileChannel fileChannel) {
            super(fileChannel);
        }
    }

    /* renamed from: com.bytedance.android.d.b.h$f */
    static final class C2927f extends C2925d {
        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo7572c() {
            try {
                this.f8621c = this.f8620b.lock();
            } catch (Exception e) {
                C2909b.m8288b("Failed to lock FileLock", e);
            }
        }

        C2927f(FileChannel fileChannel) {
            super(fileChannel);
        }
    }

    /* renamed from: com.bytedance.android.d.b.h$g */
    static final class C2928g implements C2924c {

        /* renamed from: a */
        private ReentrantReadWriteLock f8622a;

        /* renamed from: a */
        public final void mo7570a() {
            this.f8622a.readLock().lock();
        }

        /* renamed from: b */
        public final void mo7571b() {
            this.f8622a.readLock().unlock();
        }

        private C2928g(ReentrantReadWriteLock reentrantReadWriteLock) {
            this.f8622a = reentrantReadWriteLock;
        }
    }

    /* renamed from: com.bytedance.android.d.b.h$h */
    static final class C2929h implements C2924c {

        /* renamed from: a */
        private ReentrantReadWriteLock f8623a;

        /* renamed from: a */
        public final void mo7570a() {
            this.f8623a.writeLock().lock();
        }

        /* renamed from: b */
        public final void mo7571b() {
            this.f8623a.writeLock().unlock();
        }

        private C2929h(ReentrantReadWriteLock reentrantReadWriteLock) {
            this.f8623a = reentrantReadWriteLock;
        }
    }

    /* renamed from: a */
    public final int mo7561a(String str, String str2) {
        this.f8606l.mo7570a();
        this.f8609o.mo7532a();
        this.f8609o.f8567a = str;
        this.f8609o.f8568b = 8;
        this.f8609o.f8574h = str2;
        int a = m8327a(str, 1);
        this.f8606l.mo7571b();
        return a;
    }

    /* renamed from: a */
    public final int mo7562a(String str, List<String> list) {
        this.f8606l.mo7570a();
        this.f8609o.mo7532a();
        this.f8609o.f8567a = str;
        this.f8609o.f8568b = 10;
        this.f8609o.f8576j = list;
        int a = m8327a(str, 1);
        this.f8606l.mo7571b();
        return a;
    }

    /* renamed from: a */
    public final C2906b mo7563a(String str) {
        this.f8605k.mo7570a();
        if (this.f8604j) {
            m8330a(false);
        }
        C2922a aVar = (C2922a) this.f8597c.get(str);
        if (aVar == null) {
            this.f8605k.mo7571b();
            StringBuilder sb = new StringBuilder("Item does not exist, key: ");
            sb.append(str);
            C2909b.m8284a(sb.toString());
            return null;
        }
        try {
            C2908c cVar = this.f8607m;
            cVar.f8578a = this.f8610p.mo7546a(this.f8601g, aVar.f8617a, aVar.f8618b);
            cVar.f8579b = 0;
            cVar.f8580c = Long.MAX_VALUE;
            cVar.f8581d = 0;
            cVar.f8582e = 2;
            cVar.f8583f = -1;
            cVar.f8584g = -1;
            return C2907a.m8270a(cVar, this.f8609o);
        } catch (Exception e) {
            C2909b.m8288b("Failed to read local data!", e);
            return null;
        } finally {
            this.f8605k.mo7571b();
        }
    }

    /* renamed from: b */
    public final void mo7565b() {
        m8330a(false);
    }

    /* renamed from: c */
    private byte[] m8333c() {
        return (byte[]) this.f8611q.get();
    }

    /* renamed from: a */
    public final void mo7564a() {
        C2936j.m8363a(this.f8601g);
        try {
            this.f8602h.close();
        } catch (Exception e) {
            C2909b.m8285a("Failed to close dataFileChannel", e);
        }
        try {
            this.f8603i.close();
        } catch (Exception unused) {
            C2909b.m8287b("Failed to close dataRandomAccessFile");
        }
    }

    /* renamed from: a */
    private void m8328a(int i) {
        int capacity = this.f8601g.capacity();
        while (capacity < i) {
            capacity = (int) (((float) capacity) * 1.5f);
        }
        try {
            C2936j.m8363a(this.f8601g);
            this.f8601g = this.f8602h.map(MapMode.READ_WRITE, 0, (long) capacity);
        } catch (Exception e) {
            C2909b.m8285a("Failed to resize mapped buffer", e);
        }
    }

    /* renamed from: b */
    public final void mo7566b(String str) {
        this.f8606l.mo7570a();
        if (this.f8604j) {
            m8330a(false);
        }
        if (((C2922a) this.f8597c.remove(str)) == null) {
            StringBuilder sb = new StringBuilder("Tried to remove item doesn't exist, key: ");
            sb.append(str);
            C2909b.m8284a(sb.toString());
            this.f8605k.mo7571b();
            return;
        }
        this.f8609o.mo7532a();
        this.f8609o.f8567a = str;
        this.f8609o.f8568b = 0;
        m8327a(str, 0);
        this.f8606l.mo7571b();
    }

    /* renamed from: a */
    private void m8330a(boolean z) {
        byte[] c = m8333c();
        this.f8601g.position(0);
        this.f8601g.get(c, 0, 16);
        int i = 1;
        byte b = ((c[0] & 255) << 24) | ((c[1] & 255) << 16) | ((c[2] & 255) << 8) | (c[3] & 255);
        byte b2 = (c[7] & 255) | ((c[4] & 255) << 24) | ((c[5] & 255) << 16) | ((c[6] & 255) << 8);
        if (b <= 0 || b2 <= 0) {
            m8329a(1, 16);
        } else {
            if (this.f8600f < b) {
                if (m8332a(z, (int) b2)) {
                    i = b + 1;
                    m8329a(i, this.f8599e);
                }
            } else if (this.f8599e < b2) {
                m8331a(this.f8599e, b2, this.f8612r);
            }
            i = b;
        }
        this.f8600f = i;
    }

    /* renamed from: a */
    private void m8329a(int i, int i2) {
        byte[] c = m8333c();
        c[0] = (byte) (i >>> 24);
        c[1] = (byte) (i >>> 16);
        c[2] = (byte) (i >>> 8);
        c[3] = (byte) i;
        c[4] = (byte) (i2 >>> 24);
        c[5] = (byte) (i2 >>> 16);
        c[6] = (byte) (i2 >>> 8);
        c[7] = (byte) i2;
        this.f8601g.position(0);
        this.f8601g.put(c, 0, 16);
    }

    /* renamed from: a */
    private int m8327a(String str, byte b) {
        byte[] c = m8333c();
        if (this.f8604j) {
            m8330a(false);
        }
        C2922a aVar = new C2922a();
        int i = this.f8599e;
        int a = C2907a.m8269a(this.f8609o);
        aVar.f8618b = a;
        aVar.f8617a = i + 16;
        int i2 = a + 16;
        if (i2 > c.length) {
            c = new byte[i2];
        }
        C2907a.m8272a(this.f8608n.mo7524a(c, 16), this.f8609o);
        long a2 = C2897a.m8237a(c, 16, a);
        c[0] = (byte) (a >>> 24);
        c[1] = (byte) (a >>> 16);
        c[2] = (byte) (a >>> 8);
        c[3] = (byte) a;
        c[4] = b;
        c[7] = -1;
        c[6] = -1;
        c[5] = -1;
        c[8] = (byte) ((int) (a2 >>> 56));
        c[9] = (byte) ((int) (a2 >>> 48));
        c[10] = (byte) ((int) (a2 >>> 40));
        c[11] = (byte) ((int) (a2 >>> 32));
        c[12] = (byte) ((int) (a2 >>> 24));
        c[13] = (byte) ((int) (a2 >>> 16));
        c[14] = (byte) ((int) (a2 >>> 8));
        c[15] = (byte) ((int) a2);
        if (this.f8601g.capacity() < aVar.f8617a + a) {
            m8328a(aVar.f8617a + a);
        }
        this.f8601g.position(i);
        this.f8601g.put(c, 0, i2);
        this.f8599e = i + i2;
        m8329a(this.f8600f, this.f8599e);
        this.f8597c.put(str, aVar);
        return aVar.f8618b;
    }

    /* renamed from: a */
    private boolean m8332a(boolean z, int i) {
        this.f8597c.clear();
        final int[] iArr = new int[1];
        if (m8331a(16, i, new C2923b() {
            /* renamed from: a */
            public final void mo7568a(String str, C2922a aVar) {
                C2918h.this.f8597c.put(str, aVar);
                int[] iArr = iArr;
                iArr[0] = iArr[0] + 1;
            }

            /* renamed from: b */
            public final void mo7569b(String str, C2922a aVar) {
                C2918h.this.f8597c.remove(str);
                int[] iArr = iArr;
                iArr[0] = iArr[0] + 1;
            }
        })) {
            iArr[0] = -1;
        }
        if ((iArr[0] == this.f8597c.size() || !z) && iArr[0] != -1) {
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.f8601g.capacity() - 16);
        this.f8601g.position(16);
        byte[] array = allocate.array();
        int i2 = 0;
        for (C2922a aVar : this.f8597c.values()) {
            this.f8601g.position(aVar.f8617a - 16);
            this.f8601g.get(array, i2, aVar.f8618b + 16);
            aVar.f8617a = i2 + 16 + 16;
            i2 += aVar.f8618b + 16;
        }
        this.f8601g.position(16);
        this.f8601g.put(array, 0, allocate.capacity());
        this.f8599e = i2 + 16;
        this.f8598d.mo7554a();
        return true;
    }

    C2918h(String str, boolean z, C2916a aVar) throws IOException {
        int i;
        this.f8604j = z;
        this.f8598d = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".mapped.data");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.createNewFile();
        }
        this.f8603i = new RandomAccessFile(file, "rw");
        this.f8602h = this.f8603i.getChannel();
        if (this.f8602h.size() > 0) {
            i = (int) this.f8602h.size();
        } else {
            i = f8595a;
        }
        this.f8601g = this.f8602h.map(MapMode.READ_WRITE, 0, (long) i);
        if (z) {
            this.f8605k = new C2926e(this.f8602h);
            this.f8606l = new C2927f(this.f8602h);
        } else {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.f8605k = new C2928g(reentrantReadWriteLock);
            this.f8606l = new C2929h(reentrantReadWriteLock);
        }
        this.f8605k.mo7570a();
        m8330a(true);
        this.f8605k.mo7571b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0145, code lost:
        r1 = new java.lang.StringBuilder("Broken entry info at ");
        r1.append(r2);
        r1.append("! Skipping all the rest...");
        com.bytedance.android.p173d.p176b.C2909b.m8287b(r1.toString());
        r18 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m8331a(int r20, int r21, com.bytedance.android.p173d.p176b.C2918h.C2923b r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r3 = r22
            int r4 = r1 - r20
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            byte[] r4 = r4.array()
            r5 = 0
            r2 = r20
            r7 = 0
        L_0x0014:
            if (r2 >= r1) goto L_0x015f
            java.nio.MappedByteBuffer r8 = r0.f8601g
            r8.position(r2)
            java.nio.MappedByteBuffer r8 = r0.f8601g
            r9 = 16
            r8.get(r4, r5, r9)
            int r8 = r5 + 1
            byte r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r10 = 24
            int r5 = r5 << r10
            int r11 = r8 + 1
            byte r8 = r4[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r8 = r11 + 1
            byte r11 = r4[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 8
            int r11 = r11 << r12
            r5 = r5 | r11
            int r11 = r8 + 1
            byte r8 = r4[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            int r8 = r11 + 1
            byte r11 = r4[r11]
            int r13 = r8 + 1
            byte r8 = r4[r8]
            r14 = -1
            if (r8 != r14) goto L_0x0145
            int r8 = r13 + 1
            byte r13 = r4[r13]
            if (r13 != r14) goto L_0x0145
            int r13 = r8 + 1
            byte r8 = r4[r8]
            if (r8 == r14) goto L_0x005d
            goto L_0x0145
        L_0x005d:
            int r8 = r13 + 1
            byte r13 = r4[r13]
            long r13 = (long) r13
            r15 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r17 = 56
            long r13 = r13 << r17
            int r17 = r8 + 1
            byte r8 = r4[r8]
            r18 = r7
            long r6 = (long) r8
            long r6 = r6 & r15
            r8 = 48
            long r6 = r6 << r8
            long r6 = r6 | r13
            int r8 = r17 + 1
            byte r13 = r4[r17]
            long r13 = (long) r13
            long r13 = r13 & r15
            r17 = 40
            long r13 = r13 << r17
            long r6 = r6 | r13
            int r13 = r8 + 1
            byte r8 = r4[r8]
            long r9 = (long) r8
            long r9 = r9 & r15
            r8 = 32
            long r8 = r9 << r8
            long r6 = r6 | r8
            int r8 = r13 + 1
            byte r9 = r4[r13]
            long r9 = (long) r9
            long r9 = r9 & r15
            r13 = 24
            long r9 = r9 << r13
            long r6 = r6 | r9
            int r9 = r8 + 1
            byte r8 = r4[r8]
            long r13 = (long) r8
            long r13 = r13 & r15
            r8 = 16
            long r13 = r13 << r8
            long r6 = r6 | r13
            int r8 = r9 + 1
            byte r9 = r4[r9]
            long r9 = (long) r9
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r6 = r6 | r9
            int r9 = r8 + 1
            byte r8 = r4[r8]
            long r12 = (long) r8
            long r12 = r12 & r15
            long r6 = r6 | r12
            if (r5 > 0) goto L_0x00c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected EOF at "
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r3 = "!"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.p173d.p176b.C2909b.m8287b(r1)
            goto L_0x0161
        L_0x00c8:
            java.nio.MappedByteBuffer r8 = r0.f8601g
            r8.get(r4, r9, r5)
            long r12 = com.bytedance.android.p173d.p176b.C2897a.m8237a(r4, r9, r5)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0106
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Checksum failed at position: "
            r8.<init>(r10)
            r8.append(r2)
            java.lang.String r10 = ", expected: "
            r8.append(r10)
            r8.append(r6)
            java.lang.String r6 = ", found: "
            r8.append(r6)
            long r6 = com.bytedance.android.p173d.p176b.C2897a.m8237a(r4, r9, r5)
            r8.append(r6)
            java.lang.String r6 = ", skipping..."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.bytedance.android.p173d.p176b.C2909b.m8287b(r6)
            int r5 = r5 + 16
            int r2 = r2 + r5
            r5 = r9
            r7 = 1
            goto L_0x0014
        L_0x0106:
            com.bytedance.android.d.b.c r6 = r0.f8610p     // Catch:{ Exception -> 0x012d }
            java.nio.MappedByteBuffer r7 = r0.f8601g     // Catch:{ Exception -> 0x012d }
            int r8 = r2 + 16
            com.bytedance.android.d.b.c r6 = r6.mo7546a(r7, r8, r5)     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = com.bytedance.android.p173d.p176b.p177a.C2906b.C2907a.m8271a(r6)     // Catch:{ Exception -> 0x012d }
            r7 = 1
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0122
            com.bytedance.android.d.b.h$a r2 = new com.bytedance.android.d.b.h$a
            r2.<init>(r8, r5)
            r3.mo7568a(r6, r2)
            goto L_0x0126
        L_0x0122:
            r2 = 0
            r3.mo7569b(r6, r2)
        L_0x0126:
            int r2 = r8 + r5
            int r5 = r5 + r9
            r7 = r18
            goto L_0x0014
        L_0x012d:
            r7 = 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to decode data at: "
            r6.<init>(r8)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.bytedance.android.p173d.p176b.C2909b.m8287b(r6)
            int r5 = r5 + 16
            int r2 = r2 + r5
            r5 = r9
            goto L_0x0014
        L_0x0145:
            r7 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Broken entry info at "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r3 = "! Skipping all the rest..."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.p173d.p176b.C2909b.m8287b(r1)
            r18 = 1
            goto L_0x0161
        L_0x015f:
            r18 = r7
        L_0x0161:
            r0.f8599e = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p173d.p176b.C2918h.m8331a(int, int, com.bytedance.android.d.b.h$b):boolean");
    }
}

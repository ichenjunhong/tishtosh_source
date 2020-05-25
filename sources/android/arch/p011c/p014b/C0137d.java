package android.arch.p011c.p014b;

import android.arch.p006a.p008b.C0046b;
import android.arch.p011c.p012a.C0109a;
import android.arch.p011c.p012a.C0118b;
import android.arch.p011c.p012a.C0125e;
import android.arch.p011c.p012a.C0126f;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.support.p030v4.p038f.C0777a;
import com.p683ss.android.ugc.aweme.policy.Policy;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: android.arch.c.b.d */
public final class C0137d {

    /* renamed from: k */
    private static final String[] f327k = {"UPDATE", Policy.ACTION_DELETE, "INSERT"};

    /* renamed from: a */
    C0777a<String, Integer> f328a;

    /* renamed from: b */
    long[] f329b;

    /* renamed from: c */
    public Object[] f330c = new Object[1];

    /* renamed from: d */
    public long f331d;

    /* renamed from: e */
    public final C0142f f332e;

    /* renamed from: f */
    AtomicBoolean f333f;

    /* renamed from: g */
    volatile boolean f334g;

    /* renamed from: h */
    public volatile C0126f f335h;

    /* renamed from: i */
    final C0046b<Object, C0140b> f336i;

    /* renamed from: j */
    Runnable f337j;

    /* renamed from: l */
    private String[] f338l;

    /* renamed from: m */
    private C0139a f339m;

    /* renamed from: android.arch.c.b.d$a */
    static class C0139a {

        /* renamed from: a */
        final long[] f341a;

        /* renamed from: b */
        final boolean[] f342b;

        /* renamed from: c */
        final int[] f343c;

        /* renamed from: d */
        boolean f344d;

        /* renamed from: e */
        boolean f345e;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo238b() {
            synchronized (this) {
                this.f345e = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int[] mo237a() {
            boolean z;
            synchronized (this) {
                if (this.f344d) {
                    if (!this.f345e) {
                        int length = this.f341a.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i < length) {
                                if (this.f341a[i] > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z != this.f342b[i]) {
                                    int[] iArr = this.f343c;
                                    if (!z) {
                                        i2 = 2;
                                    }
                                    iArr[i] = i2;
                                } else {
                                    this.f343c[i] = 0;
                                }
                                this.f342b[i] = z;
                                i++;
                            } else {
                                this.f345e = true;
                                this.f344d = false;
                                int[] iArr2 = this.f343c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        C0139a(int i) {
            this.f341a = new long[i];
            this.f342b = new boolean[i];
            this.f343c = new int[i];
            Arrays.fill(this.f341a, 0);
            Arrays.fill(this.f342b, false);
        }
    }

    /* renamed from: android.arch.c.b.d$b */
    static class C0140b {

        /* renamed from: a */
        final int[] f346a;

        /* renamed from: b */
        final String[] f347b;

        /* renamed from: c */
        final long[] f348c;

        /* renamed from: d */
        final Set<String> f349d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo235a(C0118b bVar) {
        if (!bVar.mo182d()) {
            while (true) {
                try {
                    ReentrantLock reentrantLock = this.f332e.f355f;
                    reentrantLock.lock();
                    try {
                        int[] a = this.f339m.mo237a();
                        if (a == null) {
                            reentrantLock.unlock();
                            return;
                        }
                        int length = a.length;
                        bVar.mo176a();
                        for (int i = 0; i < length; i++) {
                            switch (a[i]) {
                                case 1:
                                    m297b(bVar, i);
                                    break;
                                case 2:
                                    m295a(bVar, i);
                                    break;
                            }
                        }
                        bVar.mo179c();
                        bVar.mo178b();
                        this.f339m.mo238b();
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m295a(C0118b bVar, int i) {
        String[] strArr;
        String str = this.f338l[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f327k) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            m296a(sb, str, str2);
            bVar.mo180c(sb.toString());
        }
    }

    public C0137d(C0142f fVar, String... strArr) {
        this.f333f = new AtomicBoolean(false);
        this.f334g = false;
        this.f336i = new C0046b<>();
        this.f337j = new Runnable() {
            /* renamed from: a */
            private boolean m299a() {
                Cursor a = C0137d.this.f332e.f351b.mo187a().mo175a((C0125e) new C0109a("SELECT * FROM room_table_modification_log WHERE version  > ? ORDER BY version ASC;", C0137d.this.f330c));
                boolean z = false;
                while (a.moveToNext()) {
                    try {
                        long j = a.getLong(0);
                        C0137d.this.f329b[a.getInt(1)] = j;
                        C0137d.this.f331d = j;
                        z = true;
                    } finally {
                        a.close();
                    }
                }
                return z;
            }

            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v6 */
            /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.Object[]] */
            /* JADX WARNING: type inference failed for: r4v12, types: [java.lang.Long] */
            /* JADX WARNING: type inference failed for: r4v13, types: [boolean] */
            /* JADX WARNING: type inference failed for: r4v14 */
            /* JADX WARNING: type inference failed for: r4v16, types: [boolean] */
            /* JADX WARNING: type inference failed for: r4v23 */
            /* JADX WARNING: type inference failed for: r4v24 */
            /* JADX WARNING: type inference failed for: r4v25 */
            /* JADX WARNING: type inference failed for: r4v26 */
            /* JADX WARNING: type inference failed for: r4v27 */
            /* JADX WARNING: type inference failed for: r4v28 */
            /* JADX WARNING: type inference failed for: r4v29 */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x0095, code lost:
                r1 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x0096, code lost:
                r0.unlock();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x0099, code lost:
                throw r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x009a, code lost:
                r4 = 0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v14
              assigns: []
              uses: []
              mth insns count: 128
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC, Splitter:B:19:0x0037] */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x0095 A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x00a0  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x00f8 A[RETURN] */
            /* JADX WARNING: Unknown variable types count: 7 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r14 = this;
                    android.arch.c.b.d r0 = android.arch.p011c.p014b.C0137d.this
                    android.arch.c.b.f r0 = r0.f332e
                    java.util.concurrent.locks.ReentrantLock r0 = r0.f355f
                    r1 = 1
                    r2 = 0
                    r0.lock()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.f r4 = r3.f332e     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.a.b r4 = r4.f350a     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r4 == 0) goto L_0x001b
                    boolean r4 = r4.mo183e()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r4 == 0) goto L_0x001b
                    r4 = 1
                    goto L_0x001c
                L_0x001b:
                    r4 = 0
                L_0x001c:
                    if (r4 != 0) goto L_0x0020
                L_0x001e:
                    r3 = 0
                    goto L_0x0031
                L_0x0020:
                    boolean r4 = r3.f334g     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r4 != 0) goto L_0x002b
                    android.arch.c.b.f r4 = r3.f332e     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.a.c r4 = r4.f351b     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    r4.mo187a()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                L_0x002b:
                    boolean r3 = r3.f334g     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r3 != 0) goto L_0x0030
                    goto L_0x001e
                L_0x0030:
                    r3 = 1
                L_0x0031:
                    if (r3 != 0) goto L_0x0037
                    r0.unlock()
                    return
                L_0x0037:
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    java.util.concurrent.atomic.AtomicBoolean r3 = r3.f333f     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    boolean r3 = r3.compareAndSet(r1, r2)     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r3 != 0) goto L_0x0045
                    r0.unlock()
                    return
                L_0x0045:
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.f r3 = r3.f332e     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    boolean r3 = r3.mo249f()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r3 == 0) goto L_0x0053
                    r0.unlock()
                    return
                L_0x0053:
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.a.f r3 = r3.f335h     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    r3.mo204a()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    java.lang.Object[] r3 = r3.f330c     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.d r4 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    long r4 = r4.f331d     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    r3[r2] = r4     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.f r3 = r3.f332e     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    boolean r3 = r3.f353d     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    if (r3 == 0) goto L_0x0090
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.b.f r3 = r3.f332e     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.a.c r3 = r3.f351b     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    android.arch.c.a.b r3 = r3.mo187a()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    r3.mo176a()     // Catch:{ all -> 0x008a }
                    boolean r4 = r14.m299a()     // Catch:{ all -> 0x008a }
                    r3.mo179c()     // Catch:{ all -> 0x0088 }
                    r3.mo178b()     // Catch:{ SQLiteException | IllegalStateException -> 0x009b, all -> 0x0095 }
                    goto L_0x009b
                L_0x0088:
                    r5 = move-exception
                    goto L_0x008c
                L_0x008a:
                    r5 = move-exception
                    r4 = 0
                L_0x008c:
                    r3.mo178b()     // Catch:{ SQLiteException | IllegalStateException -> 0x009b, all -> 0x0095 }
                    throw r5     // Catch:{ SQLiteException | IllegalStateException -> 0x009b, all -> 0x0095 }
                L_0x0090:
                    boolean r4 = r14.m299a()     // Catch:{ SQLiteException | IllegalStateException -> 0x009a, all -> 0x0095 }
                    goto L_0x009b
                L_0x0095:
                    r1 = move-exception
                    r0.unlock()
                    throw r1
                L_0x009a:
                    r4 = 0
                L_0x009b:
                    r0.unlock()
                    if (r4 == 0) goto L_0x00f8
                    android.arch.c.b.d r0 = android.arch.p011c.p014b.C0137d.this
                    android.arch.a.b.b<java.lang.Object, android.arch.c.b.d$b> r0 = r0.f336i
                    monitor-enter(r0)
                    android.arch.c.b.d r3 = android.arch.p011c.p014b.C0137d.this     // Catch:{ all -> 0x00f5 }
                    android.arch.a.b.b<java.lang.Object, android.arch.c.b.d$b> r3 = r3.f336i     // Catch:{ all -> 0x00f5 }
                    java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00f5 }
                L_0x00ad:
                    boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00f5 }
                    if (r4 == 0) goto L_0x00f3
                    java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00f5 }
                    java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x00f5 }
                    java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x00f5 }
                    android.arch.c.b.d$b r4 = (android.arch.p011c.p014b.C0137d.C0140b) r4     // Catch:{ all -> 0x00f5 }
                    android.arch.c.b.d r5 = android.arch.p011c.p014b.C0137d.this     // Catch:{ all -> 0x00f5 }
                    long[] r5 = r5.f329b     // Catch:{ all -> 0x00f5 }
                    r6 = 0
                    int[] r7 = r4.f346a     // Catch:{ all -> 0x00f5 }
                    int r7 = r7.length     // Catch:{ all -> 0x00f5 }
                    r8 = r6
                    r6 = 0
                L_0x00c9:
                    if (r6 >= r7) goto L_0x00ad
                    int[] r9 = r4.f346a     // Catch:{ all -> 0x00f5 }
                    r9 = r9[r6]     // Catch:{ all -> 0x00f5 }
                    r9 = r5[r9]     // Catch:{ all -> 0x00f5 }
                    long[] r11 = r4.f348c     // Catch:{ all -> 0x00f5 }
                    r12 = r11[r6]     // Catch:{ all -> 0x00f5 }
                    int r11 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                    if (r11 >= 0) goto L_0x00f0
                    long[] r11 = r4.f348c     // Catch:{ all -> 0x00f5 }
                    r11[r6] = r9     // Catch:{ all -> 0x00f5 }
                    if (r7 != r1) goto L_0x00e2
                    java.util.Set<java.lang.String> r8 = r4.f349d     // Catch:{ all -> 0x00f5 }
                    goto L_0x00f0
                L_0x00e2:
                    if (r8 != 0) goto L_0x00e9
                    android.support.v4.f.b r8 = new android.support.v4.f.b     // Catch:{ all -> 0x00f5 }
                    r8.<init>(r7)     // Catch:{ all -> 0x00f5 }
                L_0x00e9:
                    java.lang.String[] r9 = r4.f347b     // Catch:{ all -> 0x00f5 }
                    r9 = r9[r6]     // Catch:{ all -> 0x00f5 }
                    r8.add(r9)     // Catch:{ all -> 0x00f5 }
                L_0x00f0:
                    int r6 = r6 + 1
                    goto L_0x00c9
                L_0x00f3:
                    monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
                    return
                L_0x00f5:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x00f5 }
                    throw r1
                L_0x00f8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.arch.p011c.p014b.C0137d.C01381.run():void");
            }
        };
        this.f332e = fVar;
        this.f339m = new C0139a(strArr.length);
        this.f328a = new C0777a<>();
        int length = strArr.length;
        this.f338l = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.f328a.put(lowerCase, Integer.valueOf(i));
            this.f338l[i] = lowerCase;
        }
        this.f329b = new long[strArr.length];
        Arrays.fill(this.f329b, 0);
    }

    /* renamed from: b */
    private void m297b(C0118b bVar, int i) {
        String[] strArr;
        String str = this.f338l[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f327k) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            m296a(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN INSERT OR REPLACE INTO room_table_modification_log");
            sb.append(" VALUES(null, ");
            sb.append(i);
            sb.append("); END");
            bVar.mo180c(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m296a(StringBuilder sb, String str, String str2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }
}

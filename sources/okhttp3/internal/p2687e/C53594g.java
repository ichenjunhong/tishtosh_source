package okhttp3.internal.p2687e;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C53548b;
import okhttp3.internal.C53559c;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: okhttp3.internal.e.g */
public final class C53594g implements Closeable {

    /* renamed from: a */
    public static final ExecutorService f132860a;

    /* renamed from: v */
    static final /* synthetic */ boolean f132861v = (!C53594g.class.desiredAssertionStatus());

    /* renamed from: b */
    final boolean f132862b;

    /* renamed from: c */
    final C53602b f132863c;

    /* renamed from: d */
    final Map<Integer, C53612i> f132864d = new LinkedHashMap();

    /* renamed from: e */
    final String f132865e;

    /* renamed from: f */
    int f132866f;

    /* renamed from: g */
    int f132867g;

    /* renamed from: h */
    boolean f132868h;

    /* renamed from: i */
    public final ScheduledExecutorService f132869i;

    /* renamed from: j */
    final ExecutorService f132870j;

    /* renamed from: k */
    final C53619l f132871k;

    /* renamed from: l */
    public boolean f132872l;

    /* renamed from: m */
    long f132873m = 0;

    /* renamed from: n */
    long f132874n;

    /* renamed from: o */
    public C53621m f132875o = new C53621m();

    /* renamed from: p */
    final C53621m f132876p = new C53621m();

    /* renamed from: q */
    boolean f132877q = false;

    /* renamed from: r */
    final Socket f132878r;

    /* renamed from: s */
    public final C53616j f132879s;

    /* renamed from: t */
    public final C53605d f132880t;

    /* renamed from: u */
    final Set<Integer> f132881u = new LinkedHashSet();

    /* renamed from: okhttp3.internal.e.g$a */
    public static class C53601a {

        /* renamed from: a */
        public Socket f132903a;

        /* renamed from: b */
        public String f132904b;

        /* renamed from: c */
        public BufferedSource f132905c;

        /* renamed from: d */
        public BufferedSink f132906d;

        /* renamed from: e */
        public C53602b f132907e = C53602b.f132911j;

        /* renamed from: f */
        C53619l f132908f = C53619l.f132974a;

        /* renamed from: g */
        boolean f132909g = true;

        /* renamed from: h */
        public int f132910h;

        public C53601a(boolean z) {
        }
    }

    /* renamed from: okhttp3.internal.e.g$b */
    public static abstract class C53602b {

        /* renamed from: j */
        public static final C53602b f132911j = new C53602b() {
            /* renamed from: a */
            public final void mo111377a(C53612i iVar) throws IOException {
                iVar.mo111461a(C53586b.REFUSED_STREAM);
            }
        };

        /* renamed from: a */
        public void mo111376a(C53594g gVar) {
        }

        /* renamed from: a */
        public abstract void mo111377a(C53612i iVar) throws IOException;
    }

    /* renamed from: okhttp3.internal.e.g$c */
    final class C53604c extends C53548b {

        /* renamed from: a */
        final boolean f132912a;

        /* renamed from: b */
        final int f132913b;

        /* renamed from: c */
        final int f132914c;

        /* renamed from: a */
        public final void mo99503a() {
            boolean z;
            C53594g gVar = C53594g.this;
            boolean z2 = this.f132912a;
            int i = this.f132913b;
            int i2 = this.f132914c;
            if (!z2) {
                synchronized (gVar) {
                    z = gVar.f132872l;
                    gVar.f132872l = true;
                }
                if (z) {
                    gVar.mo111447c();
                    return;
                }
            }
            try {
                gVar.f132879s.mo111479a(z2, i, i2);
            } catch (IOException unused) {
                gVar.mo111447c();
            }
        }

        C53604c(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C53594g.this.f132865e, Integer.valueOf(i), Integer.valueOf(i2));
            this.f132912a = z;
            this.f132913b = i;
            this.f132914c = i2;
        }
    }

    /* renamed from: okhttp3.internal.e.g$d */
    class C53605d extends C53548b implements C53611b {

        /* renamed from: a */
        final C53609h f132916a;

        /* renamed from: a */
        public final void mo111456a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (C53594g.m113902c(i)) {
                C53594g gVar = C53594g.this;
                Buffer buffer = new Buffer();
                long j = (long) i2;
                bufferedSource.require(j);
                bufferedSource.read(buffer, j);
                if (buffer.size() == j) {
                    ExecutorService executorService = gVar.f132870j;
                    C535995 r1 = new C53548b("OkHttp %s Push Data[%s]", new Object[]{gVar.f132865e, Integer.valueOf(i)}, i, buffer, i2, z) {

                        /* renamed from: a */
                        final /* synthetic */ int f132895a;

                        /* renamed from: b */
                        final /* synthetic */ Buffer f132896b;

                        /* renamed from: c */
                        final /* synthetic */ int f132897c;

                        /* renamed from: e */
                        final /* synthetic */ boolean f132898e;

                        /* renamed from: a */
                        public final void mo99503a() {
                            try {
                                C53594g.this.f132871k.mo111486a(this.f132895a, this.f132896b, this.f132897c, this.f132898e);
                                C53594g.this.f132879s.mo111476a(this.f132895a, C53586b.CANCEL);
                                synchronized (C53594g.this) {
                                    C53594g.this.f132881u.remove(Integer.valueOf(this.f132895a));
                                }
                            } catch (IOException unused) {
                            }
                        }

                        {
                            this.f132895a = r4;
                            this.f132896b = r5;
                            this.f132897c = r6;
                            this.f132898e = r7;
                        }
                    };
                    executorService.execute(r1);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(buffer.size());
                sb.append(" != ");
                sb.append(i2);
                throw new IOException(sb.toString());
            }
            C53612i a = C53594g.this.mo111438a(i);
            if (a == null) {
                C53594g.this.mo111441a(i, C53586b.PROTOCOL_ERROR);
                bufferedSource.skip((long) i2);
            } else if (C53612i.f132934m || !Thread.holdsLock(a)) {
                a.f132942h.mo111472a(bufferedSource, (long) i2);
                if (z) {
                    a.mo111468e();
                }
            } else {
                throw new AssertionError();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
            if (okhttp3.internal.p2687e.C53612i.f132934m != false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
            if (java.lang.Thread.holdsLock(r3) != false) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            r3.f132941g = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
            if (r3.f132940f != null) goto L_0x00a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
            r3.f132940f = r15;
            r1 = r3.mo111462a();
            r3.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
            r13 = new java.util.ArrayList();
            r13.addAll(r3.f132940f);
            r13.add(null);
            r13.addAll(r15);
            r3.f132940f = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
            if (r1 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bf, code lost:
            r3.f132938d.mo111444b(r3.f132937c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
            if (r12 == false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
            r3.mo111468e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cb, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo111455a(boolean r12, int r13, int r14, java.util.List<okhttp3.internal.p2687e.C53587c> r15) {
            /*
                r11 = this;
                boolean r14 = okhttp3.internal.p2687e.C53594g.m113902c(r13)
                r0 = 0
                r1 = 1
                r2 = 2
                if (r14 == 0) goto L_0x0029
                okhttp3.internal.e.g r4 = okhttp3.internal.p2687e.C53594g.this
                java.util.concurrent.ExecutorService r14 = r4.f132870j     // Catch:{ RejectedExecutionException -> 0x0028 }
                okhttp3.internal.e.g$4 r10 = new okhttp3.internal.e.g$4     // Catch:{ RejectedExecutionException -> 0x0028 }
                java.lang.String r5 = "OkHttp %s Push Headers[%s]"
                java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ RejectedExecutionException -> 0x0028 }
                java.lang.String r2 = r4.f132865e     // Catch:{ RejectedExecutionException -> 0x0028 }
                r6[r0] = r2     // Catch:{ RejectedExecutionException -> 0x0028 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ RejectedExecutionException -> 0x0028 }
                r6[r1] = r0     // Catch:{ RejectedExecutionException -> 0x0028 }
                r3 = r10
                r7 = r13
                r8 = r15
                r9 = r12
                r3.<init>(r5, r6, r7, r8, r9)     // Catch:{ RejectedExecutionException -> 0x0028 }
                r14.execute(r10)     // Catch:{ RejectedExecutionException -> 0x0028 }
                return
            L_0x0028:
                return
            L_0x0029:
                okhttp3.internal.e.g r14 = okhttp3.internal.p2687e.C53594g.this
                monitor-enter(r14)
                okhttp3.internal.e.g r3 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                okhttp3.internal.e.i r3 = r3.mo111438a(r13)     // Catch:{ all -> 0x00cf }
                if (r3 != 0) goto L_0x0086
                okhttp3.internal.e.g r3 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                boolean r3 = r3.f132868h     // Catch:{ all -> 0x00cf }
                if (r3 == 0) goto L_0x003c
                monitor-exit(r14)     // Catch:{ all -> 0x00cf }
                return
            L_0x003c:
                okhttp3.internal.e.g r3 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                int r3 = r3.f132866f     // Catch:{ all -> 0x00cf }
                if (r13 > r3) goto L_0x0044
                monitor-exit(r14)     // Catch:{ all -> 0x00cf }
                return
            L_0x0044:
                int r3 = r13 % 2
                okhttp3.internal.e.g r4 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                int r4 = r4.f132867g     // Catch:{ all -> 0x00cf }
                int r4 = r4 % r2
                if (r3 != r4) goto L_0x004f
                monitor-exit(r14)     // Catch:{ all -> 0x00cf }
                return
            L_0x004f:
                okhttp3.internal.e.i r9 = new okhttp3.internal.e.i     // Catch:{ all -> 0x00cf }
                okhttp3.internal.e.g r5 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                r6 = 0
                r3 = r9
                r4 = r13
                r7 = r12
                r8 = r15
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00cf }
                okhttp3.internal.e.g r12 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                r12.f132866f = r13     // Catch:{ all -> 0x00cf }
                okhttp3.internal.e.g r12 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                java.util.Map<java.lang.Integer, okhttp3.internal.e.i> r12 = r12.f132864d     // Catch:{ all -> 0x00cf }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00cf }
                r12.put(r15, r9)     // Catch:{ all -> 0x00cf }
                java.util.concurrent.ExecutorService r12 = okhttp3.internal.p2687e.C53594g.f132860a     // Catch:{ all -> 0x00cf }
                okhttp3.internal.e.g$d$1 r15 = new okhttp3.internal.e.g$d$1     // Catch:{ all -> 0x00cf }
                java.lang.String r3 = "OkHttp %s stream %d"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00cf }
                okhttp3.internal.e.g r4 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00cf }
                java.lang.String r4 = r4.f132865e     // Catch:{ all -> 0x00cf }
                r2[r0] = r4     // Catch:{ all -> 0x00cf }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00cf }
                r2[r1] = r13     // Catch:{ all -> 0x00cf }
                r15.<init>(r3, r2, r9)     // Catch:{ all -> 0x00cf }
                r12.execute(r15)     // Catch:{ all -> 0x00cf }
                monitor-exit(r14)     // Catch:{ all -> 0x00cf }
                return
            L_0x0086:
                monitor-exit(r14)     // Catch:{ all -> 0x00cf }
                boolean r13 = okhttp3.internal.p2687e.C53612i.f132934m
                if (r13 != 0) goto L_0x0098
                boolean r13 = java.lang.Thread.holdsLock(r3)
                if (r13 != 0) goto L_0x0092
                goto L_0x0098
            L_0x0092:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            L_0x0098:
                monitor-enter(r3)
                r3.f132941g = r1     // Catch:{ all -> 0x00cc }
                java.util.List<okhttp3.internal.e.c> r13 = r3.f132940f     // Catch:{ all -> 0x00cc }
                if (r13 != 0) goto L_0x00a9
                r3.f132940f = r15     // Catch:{ all -> 0x00cc }
                boolean r1 = r3.mo111462a()     // Catch:{ all -> 0x00cc }
                r3.notifyAll()     // Catch:{ all -> 0x00cc }
                goto L_0x00bc
            L_0x00a9:
                java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00cc }
                r13.<init>()     // Catch:{ all -> 0x00cc }
                java.util.List<okhttp3.internal.e.c> r14 = r3.f132940f     // Catch:{ all -> 0x00cc }
                r13.addAll(r14)     // Catch:{ all -> 0x00cc }
                r14 = 0
                r13.add(r14)     // Catch:{ all -> 0x00cc }
                r13.addAll(r15)     // Catch:{ all -> 0x00cc }
                r3.f132940f = r13     // Catch:{ all -> 0x00cc }
            L_0x00bc:
                monitor-exit(r3)     // Catch:{ all -> 0x00cc }
                if (r1 != 0) goto L_0x00c6
                okhttp3.internal.e.g r13 = r3.f132938d
                int r14 = r3.f132937c
                r13.mo111444b(r14)
            L_0x00c6:
                if (r12 == 0) goto L_0x00cb
                r3.mo111468e()
            L_0x00cb:
                return
            L_0x00cc:
                r12 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x00cc }
                throw r12
            L_0x00cf:
                r12 = move-exception
                monitor-exit(r14)     // Catch:{ all -> 0x00cf }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53594g.C53605d.mo111455a(boolean, int, int, java.util.List):void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:2|3|(4:6|(2:8|48)(1:49)|9|4)|47|10|11|12|13|14|(1:26)(4:17|(3:19|(1:21)|22)|23|(1:25))|27|28) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo111457a(boolean r12, final okhttp3.internal.p2687e.C53621m r13) {
            /*
                r11 = this;
                okhttp3.internal.e.g r12 = okhttp3.internal.p2687e.C53594g.this
                monitor-enter(r12)
                okhttp3.internal.e.g r0 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.m r0 = r0.f132876p     // Catch:{ all -> 0x00b8 }
                int r0 = r0.mo111490b()     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.g r1 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.m r1 = r1.f132876p     // Catch:{ all -> 0x00b8 }
                r2 = 0
                r3 = 0
            L_0x0011:
                r4 = 10
                if (r3 >= r4) goto L_0x0025
                boolean r4 = r13.mo111489a(r3)     // Catch:{ all -> 0x00b8 }
                if (r4 == 0) goto L_0x0022
                int r4 = r13.mo111491b(r3)     // Catch:{ all -> 0x00b8 }
                r1.mo111488a(r3, r4)     // Catch:{ all -> 0x00b8 }
            L_0x0022:
                int r3 = r3 + 1
                goto L_0x0011
            L_0x0025:
                r1 = 1
                okhttp3.internal.e.g r3 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ RejectedExecutionException -> 0x003c }
                java.util.concurrent.ScheduledExecutorService r3 = r3.f132869i     // Catch:{ RejectedExecutionException -> 0x003c }
                okhttp3.internal.e.g$d$3 r4 = new okhttp3.internal.e.g$d$3     // Catch:{ RejectedExecutionException -> 0x003c }
                java.lang.String r5 = "OkHttp %s ACK Settings"
                java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003c }
                okhttp3.internal.e.g r7 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ RejectedExecutionException -> 0x003c }
                java.lang.String r7 = r7.f132865e     // Catch:{ RejectedExecutionException -> 0x003c }
                r6[r2] = r7     // Catch:{ RejectedExecutionException -> 0x003c }
                r4.<init>(r5, r6, r13)     // Catch:{ RejectedExecutionException -> 0x003c }
                r3.execute(r4)     // Catch:{ RejectedExecutionException -> 0x003c }
            L_0x003c:
                okhttp3.internal.e.g r13 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.m r13 = r13.f132876p     // Catch:{ all -> 0x00b8 }
                int r13 = r13.mo111490b()     // Catch:{ all -> 0x00b8 }
                r3 = -1
                r4 = 0
                r6 = 0
                if (r13 == r3) goto L_0x008b
                if (r13 == r0) goto L_0x008b
                int r13 = r13 - r0
                long r7 = (long) r13     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.g r13 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                boolean r13 = r13.f132877q     // Catch:{ all -> 0x00b8 }
                if (r13 != 0) goto L_0x0067
                okhttp3.internal.e.g r13 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                long r9 = r13.f132874n     // Catch:{ all -> 0x00b8 }
                r0 = 0
                long r9 = r9 + r7
                r13.f132874n = r9     // Catch:{ all -> 0x00b8 }
                int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0063
                r13.notifyAll()     // Catch:{ all -> 0x00b8 }
            L_0x0063:
                okhttp3.internal.e.g r13 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                r13.f132877q = r1     // Catch:{ all -> 0x00b8 }
            L_0x0067:
                okhttp3.internal.e.g r13 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                java.util.Map<java.lang.Integer, okhttp3.internal.e.i> r13 = r13.f132864d     // Catch:{ all -> 0x00b8 }
                boolean r13 = r13.isEmpty()     // Catch:{ all -> 0x00b8 }
                if (r13 != 0) goto L_0x008c
                okhttp3.internal.e.g r13 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                java.util.Map<java.lang.Integer, okhttp3.internal.e.i> r13 = r13.f132864d     // Catch:{ all -> 0x00b8 }
                java.util.Collection r13 = r13.values()     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.g r0 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                java.util.Map<java.lang.Integer, okhttp3.internal.e.i> r0 = r0.f132864d     // Catch:{ all -> 0x00b8 }
                int r0 = r0.size()     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.i[] r0 = new okhttp3.internal.p2687e.C53612i[r0]     // Catch:{ all -> 0x00b8 }
                java.lang.Object[] r13 = r13.toArray(r0)     // Catch:{ all -> 0x00b8 }
                r6 = r13
                okhttp3.internal.e.i[] r6 = (okhttp3.internal.p2687e.C53612i[]) r6     // Catch:{ all -> 0x00b8 }
                goto L_0x008c
            L_0x008b:
                r7 = r4
            L_0x008c:
                java.util.concurrent.ExecutorService r13 = okhttp3.internal.p2687e.C53594g.f132860a     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.g$d$2 r0 = new okhttp3.internal.e.g$d$2     // Catch:{ all -> 0x00b8 }
                java.lang.String r3 = "OkHttp %s settings"
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b8 }
                okhttp3.internal.e.g r9 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ all -> 0x00b8 }
                java.lang.String r9 = r9.f132865e     // Catch:{ all -> 0x00b8 }
                r1[r2] = r9     // Catch:{ all -> 0x00b8 }
                r0.<init>(r3, r1)     // Catch:{ all -> 0x00b8 }
                r13.execute(r0)     // Catch:{ all -> 0x00b8 }
                monitor-exit(r12)     // Catch:{ all -> 0x00b8 }
                if (r6 == 0) goto L_0x00b7
                int r12 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r12 == 0) goto L_0x00b7
                int r12 = r6.length
            L_0x00a8:
                if (r2 >= r12) goto L_0x00b7
                r13 = r6[r2]
                monitor-enter(r13)
                r13.mo111460a(r7)     // Catch:{ all -> 0x00b4 }
                monitor-exit(r13)     // Catch:{ all -> 0x00b4 }
                int r2 = r2 + 1
                goto L_0x00a8
            L_0x00b4:
                r12 = move-exception
                monitor-exit(r13)     // Catch:{ all -> 0x00b4 }
                throw r12
            L_0x00b7:
                return
            L_0x00b8:
                r13 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00b8 }
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53594g.C53605d.mo111457a(boolean, okhttp3.internal.e.m):void");
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0078 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo99503a() {
            /*
                r10 = this;
                okhttp3.internal.e.b r0 = okhttp3.internal.p2687e.C53586b.INTERNAL_ERROR
                okhttp3.internal.e.b r1 = okhttp3.internal.p2687e.C53586b.INTERNAL_ERROR
                okhttp3.internal.e.h r2 = r10.f132916a     // Catch:{ IOException -> 0x0078 }
                boolean r3 = r2.f132925c     // Catch:{ IOException -> 0x0078 }
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x001c
                boolean r2 = r2.mo111458a(r4, r10)     // Catch:{ IOException -> 0x0078 }
                if (r2 == 0) goto L_0x0013
                goto L_0x004e
            L_0x0013:
                java.lang.String r2 = "Required SETTINGS preface not received"
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0078 }
                java.io.IOException r2 = okhttp3.internal.p2687e.C53591e.m113892b(r2, r3)     // Catch:{ IOException -> 0x0078 }
                throw r2     // Catch:{ IOException -> 0x0078 }
            L_0x001c:
                okio.BufferedSource r2 = r2.f132924b     // Catch:{ IOException -> 0x0078 }
                okio.ByteString r3 = okhttp3.internal.p2687e.C53591e.f132838a     // Catch:{ IOException -> 0x0078 }
                int r3 = r3.size()     // Catch:{ IOException -> 0x0078 }
                long r6 = (long) r3     // Catch:{ IOException -> 0x0078 }
                okio.ByteString r2 = r2.readByteString(r6)     // Catch:{ IOException -> 0x0078 }
                java.util.logging.Logger r3 = okhttp3.internal.p2687e.C53609h.f132923a     // Catch:{ IOException -> 0x0078 }
                java.util.logging.Level r6 = java.util.logging.Level.FINE     // Catch:{ IOException -> 0x0078 }
                boolean r3 = r3.isLoggable(r6)     // Catch:{ IOException -> 0x0078 }
                if (r3 == 0) goto L_0x0046
                java.util.logging.Logger r3 = okhttp3.internal.p2687e.C53609h.f132923a     // Catch:{ IOException -> 0x0078 }
                java.lang.String r6 = "<< CONNECTION %s"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0078 }
                java.lang.String r8 = r2.hex()     // Catch:{ IOException -> 0x0078 }
                r7[r5] = r8     // Catch:{ IOException -> 0x0078 }
                java.lang.String r6 = okhttp3.internal.C53559c.m113798a(r6, r7)     // Catch:{ IOException -> 0x0078 }
                r3.fine(r6)     // Catch:{ IOException -> 0x0078 }
            L_0x0046:
                okio.ByteString r3 = okhttp3.internal.p2687e.C53591e.f132838a     // Catch:{ IOException -> 0x0078 }
                boolean r3 = r3.equals(r2)     // Catch:{ IOException -> 0x0078 }
                if (r3 == 0) goto L_0x0067
            L_0x004e:
                okhttp3.internal.e.h r2 = r10.f132916a     // Catch:{ IOException -> 0x0078 }
                boolean r2 = r2.mo111458a(r5, r10)     // Catch:{ IOException -> 0x0078 }
                if (r2 != 0) goto L_0x004e
                okhttp3.internal.e.b r2 = okhttp3.internal.p2687e.C53586b.NO_ERROR     // Catch:{ IOException -> 0x0078 }
                okhttp3.internal.e.b r0 = okhttp3.internal.p2687e.C53586b.CANCEL     // Catch:{ IOException -> 0x0065 }
                okhttp3.internal.e.g r1 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ IOException -> 0x005f }
            L_0x005c:
                r1.mo111443a(r2, r0)     // Catch:{ IOException -> 0x005f }
            L_0x005f:
                okhttp3.internal.e.h r0 = r10.f132916a
                okhttp3.internal.C53559c.m113805a(r0)
                return
            L_0x0065:
                r0 = r2
                goto L_0x0078
            L_0x0067:
                java.lang.String r3 = "Expected a connection header but was %s"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0078 }
                java.lang.String r2 = r2.utf8()     // Catch:{ IOException -> 0x0078 }
                r4[r5] = r2     // Catch:{ IOException -> 0x0078 }
                java.io.IOException r2 = okhttp3.internal.p2687e.C53591e.m113892b(r3, r4)     // Catch:{ IOException -> 0x0078 }
                throw r2     // Catch:{ IOException -> 0x0078 }
            L_0x0076:
                r2 = move-exception
                goto L_0x0083
            L_0x0078:
                okhttp3.internal.e.b r2 = okhttp3.internal.p2687e.C53586b.PROTOCOL_ERROR     // Catch:{ all -> 0x0076 }
                okhttp3.internal.e.b r0 = okhttp3.internal.p2687e.C53586b.PROTOCOL_ERROR     // Catch:{ all -> 0x007f }
                okhttp3.internal.e.g r1 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ IOException -> 0x005f }
                goto L_0x005c
            L_0x007f:
                r0 = move-exception
                r9 = r2
                r2 = r0
                r0 = r9
            L_0x0083:
                okhttp3.internal.e.g r3 = okhttp3.internal.p2687e.C53594g.this     // Catch:{ IOException -> 0x0088 }
                r3.mo111443a(r0, r1)     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                okhttp3.internal.e.h r0 = r10.f132916a
                okhttp3.internal.C53559c.m113805a(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53594g.C53605d.mo99503a():void");
        }

        C53605d(C53609h hVar) {
            super("OkHttp %s", C53594g.this.f132865e);
            this.f132916a = hVar;
        }

        /* renamed from: a */
        public final void mo111451a(int i, long j) {
            if (i == 0) {
                synchronized (C53594g.this) {
                    C53594g.this.f132874n += j;
                    C53594g.this.notifyAll();
                }
            } else {
                C53612i a = C53594g.this.mo111438a(i);
                if (a != null) {
                    synchronized (a) {
                        a.mo111460a(j);
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo111452a(int i, C53586b bVar) {
            if (C53594g.m113902c(i)) {
                C53594g gVar = C53594g.this;
                ExecutorService executorService = gVar.f132870j;
                C536006 r1 = new C53548b("OkHttp %s Push Reset[%s]", new Object[]{gVar.f132865e, Integer.valueOf(i)}, i, bVar) {

                    /* renamed from: a */
                    final /* synthetic */ int f132900a;

                    /* renamed from: b */
                    final /* synthetic */ C53586b f132901b;

                    /* renamed from: a */
                    public final void mo99503a() {
                        synchronized (C53594g.this) {
                            C53594g.this.f132881u.remove(Integer.valueOf(this.f132900a));
                        }
                    }

                    {
                        this.f132900a = r4;
                        this.f132901b = r5;
                    }
                };
                executorService.execute(r1);
                return;
            }
            C53612i b = C53594g.this.mo111444b(i);
            if (b != null) {
                b.mo111466c(bVar);
            }
        }

        /* renamed from: a */
        public final void mo111450a(int i, int i2, List<C53587c> list) {
            C53594g gVar = C53594g.this;
            synchronized (gVar) {
                if (gVar.f132881u.contains(Integer.valueOf(i2))) {
                    gVar.mo111441a(i2, C53586b.PROTOCOL_ERROR);
                    return;
                }
                gVar.f132881u.add(Integer.valueOf(i2));
                try {
                    ExecutorService executorService = gVar.f132870j;
                    C535973 r0 = new C53548b("OkHttp %s Push Request[%s]", new Object[]{gVar.f132865e, Integer.valueOf(i2)}, i2, list) {

                        /* renamed from: a */
                        final /* synthetic */ int f132888a;

                        /* renamed from: b */
                        final /* synthetic */ List f132889b;

                        /* renamed from: a */
                        public final void mo99503a() {
                            try {
                                C53594g.this.f132879s.mo111476a(this.f132888a, C53586b.CANCEL);
                                synchronized (C53594g.this) {
                                    C53594g.this.f132881u.remove(Integer.valueOf(this.f132888a));
                                }
                            } catch (IOException unused) {
                            }
                        }

                        {
                            this.f132888a = r4;
                            this.f132889b = r5;
                        }
                    };
                    executorService.execute(r0);
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo111453a(int i, C53586b bVar, ByteString byteString) {
            C53612i[] iVarArr;
            byteString.size();
            synchronized (C53594g.this) {
                iVarArr = (C53612i[]) C53594g.this.f132864d.values().toArray(new C53612i[C53594g.this.f132864d.size()]);
                C53594g.this.f132868h = true;
            }
            for (C53612i iVar : iVarArr) {
                if (iVar.f132937c > i && iVar.mo111464b()) {
                    iVar.mo111466c(C53586b.REFUSED_STREAM);
                    C53594g.this.mo111444b(iVar.f132937c);
                }
            }
        }

        /* renamed from: a */
        public final void mo111454a(boolean z, int i, int i2) {
            if (z) {
                synchronized (C53594g.this) {
                    C53594g.this.f132872l = false;
                    C53594g.this.notifyAll();
                }
            } else {
                try {
                    C53594g.this.f132869i.execute(new C53604c(true, i, i2));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    static boolean m113902c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111443a(C53586b bVar, C53586b bVar2) throws IOException {
        if (f132861v || !Thread.holdsLock(this)) {
            C53612i[] iVarArr = null;
            try {
                m113901a(bVar);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            synchronized (this) {
                if (!this.f132864d.isEmpty()) {
                    iVarArr = (C53612i[]) this.f132864d.values().toArray(new C53612i[this.f132864d.size()]);
                    this.f132864d.clear();
                }
            }
            if (iVarArr != null) {
                for (C53612i a : iVarArr) {
                    try {
                        a.mo111461a(bVar2);
                    } catch (IOException e2) {
                        if (e != null) {
                            e = e2;
                        }
                    }
                }
            }
            try {
                this.f132879s.close();
            } catch (IOException e3) {
                if (e == null) {
                    e = e3;
                }
            }
            try {
                this.f132878r.close();
            } catch (IOException e4) {
                e = e4;
            }
            this.f132869i.shutdown();
            this.f132870j.shutdown();
            if (e != null) {
                throw e;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo111445b() throws IOException {
        this.f132879s.mo111482b();
    }

    /* renamed from: c */
    public final void mo111447c() {
        try {
            C53586b bVar = C53586b.PROTOCOL_ERROR;
            mo111443a(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    public final void close() throws IOException {
        mo111443a(C53586b.NO_ERROR, C53586b.CANCEL);
    }

    /* renamed from: d */
    public final synchronized boolean mo111449d() {
        return this.f132868h;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C53559c.m113803a("OkHttp Http2Connection", true));
        f132860a = threadPoolExecutor;
    }

    /* renamed from: a */
    public final synchronized int mo111437a() {
        C53621m mVar = this.f132876p;
        if ((mVar.f132975a & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return mVar.f132976b[4];
    }

    /* renamed from: a */
    private void m113901a(C53586b bVar) throws IOException {
        synchronized (this.f132879s) {
            synchronized (this) {
                if (!this.f132868h) {
                    this.f132868h = true;
                    int i = this.f132866f;
                    this.f132879s.mo111477a(i, bVar, C53559c.f132733a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized C53612i mo111444b(int i) {
        C53612i iVar;
        iVar = (C53612i) this.f132864d.remove(Integer.valueOf(i));
        notifyAll();
        return iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C53612i mo111438a(int i) {
        return (C53612i) this.f132864d.get(Integer.valueOf(i));
    }

    public C53594g(C53601a aVar) {
        int i;
        C53601a aVar2 = aVar;
        this.f132871k = aVar2.f132908f;
        this.f132862b = aVar2.f132909g;
        this.f132863c = aVar2.f132907e;
        if (aVar2.f132909g) {
            i = 1;
        } else {
            i = 2;
        }
        this.f132867g = i;
        if (aVar2.f132909g) {
            this.f132867g += 2;
        }
        if (aVar2.f132909g) {
            this.f132875o.mo111488a(7, 16777216);
        }
        this.f132865e = aVar2.f132904b;
        this.f132869i = new ScheduledThreadPoolExecutor(1, C53559c.m113803a(C53559c.m113798a("OkHttp %s Writer", this.f132865e), false));
        if (aVar2.f132910h != 0) {
            this.f132869i.scheduleAtFixedRate(new C53604c(false, 0, 0), (long) aVar2.f132910h, (long) aVar2.f132910h, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C53559c.m113803a(C53559c.m113798a("OkHttp %s Push Observer", this.f132865e), true));
        this.f132870j = threadPoolExecutor;
        this.f132876p.mo111488a(7, 65535);
        this.f132876p.mo111488a(5, 16384);
        this.f132874n = (long) this.f132876p.mo111490b();
        this.f132878r = aVar2.f132903a;
        this.f132879s = new C53616j(aVar2.f132906d, this.f132862b);
        this.f132880t = new C53605d(new C53609h(aVar2.f132905c, this.f132862b));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo111446b(int i, C53586b bVar) throws IOException {
        this.f132879s.mo111476a(i, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111440a(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f132869i;
            final int i2 = i;
            final long j2 = j;
            C535962 r1 = new C53548b("OkHttp Window Update %s stream %d", new Object[]{this.f132865e, Integer.valueOf(i)}) {
                /* renamed from: a */
                public final void mo99503a() {
                    try {
                        C53594g.this.f132879s.mo111475a(i2, j2);
                    } catch (IOException unused) {
                        C53594g.this.mo111447c();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111441a(int i, C53586b bVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f132869i;
            final int i2 = i;
            final C53586b bVar2 = bVar;
            C535951 r1 = new C53548b("OkHttp %s stream %d", new Object[]{this.f132865e, Integer.valueOf(i)}) {
                /* renamed from: a */
                public final void mo99503a() {
                    try {
                        C53594g.this.mo111446b(i2, bVar2);
                    } catch (IOException unused) {
                        C53594g.this.mo111447c();
                    }
                }
            };
            scheduledExecutorService.execute(r1);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.internal.p2687e.C53612i mo111439a(int r10, java.util.List<okhttp3.internal.p2687e.C53587c> r11, boolean r12) throws java.io.IOException {
        /*
            r9 = this;
            r10 = r12 ^ 1
            okhttp3.internal.e.j r6 = r9.f132879s
            monitor-enter(r6)
            monitor-enter(r9)     // Catch:{ all -> 0x0065 }
            int r0 = r9.f132867g     // Catch:{ all -> 0x0062 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0012
            okhttp3.internal.e.b r0 = okhttp3.internal.p2687e.C53586b.REFUSED_STREAM     // Catch:{ all -> 0x0062 }
            r9.m113901a(r0)     // Catch:{ all -> 0x0062 }
        L_0x0012:
            boolean r0 = r9.f132868h     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x005c
            int r7 = r9.f132867g     // Catch:{ all -> 0x0062 }
            int r0 = r9.f132867g     // Catch:{ all -> 0x0062 }
            int r0 = r0 + 2
            r9.f132867g = r0     // Catch:{ all -> 0x0062 }
            okhttp3.internal.e.i r8 = new okhttp3.internal.e.i     // Catch:{ all -> 0x0062 }
            r4 = 0
            r0 = r8
            r1 = r7
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0062 }
            r0 = 0
            if (r12 == 0) goto L_0x003d
            long r1 = r9.f132874n     // Catch:{ all -> 0x0062 }
            r3 = 0
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x003d
            long r1 = r8.f132936b     // Catch:{ all -> 0x0062 }
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r12 = 0
            goto L_0x003e
        L_0x003d:
            r12 = 1
        L_0x003e:
            boolean r1 = r8.mo111462a()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x004d
            java.util.Map<java.lang.Integer, okhttp3.internal.e.i> r1 = r9.f132864d     // Catch:{ all -> 0x0062 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0062 }
            r1.put(r2, r8)     // Catch:{ all -> 0x0062 }
        L_0x004d:
            monitor-exit(r9)     // Catch:{ all -> 0x0062 }
            okhttp3.internal.e.j r1 = r9.f132879s     // Catch:{ all -> 0x0065 }
            r1.mo111480a(r10, r7, r0, r11)     // Catch:{ all -> 0x0065 }
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            if (r12 == 0) goto L_0x005b
            okhttp3.internal.e.j r10 = r9.f132879s
            r10.mo111482b()
        L_0x005b:
            return r8
        L_0x005c:
            okhttp3.internal.e.a r10 = new okhttp3.internal.e.a     // Catch:{ all -> 0x0062 }
            r10.<init>()     // Catch:{ all -> 0x0062 }
            throw r10     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0062 }
            throw r10     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r10 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0065 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53594g.mo111439a(int, java.util.List, boolean):okhttp3.internal.e.i");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f132874n), r8.f132879s.f132961a);
        r6 = (long) r3;
        r8.f132874n -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0059 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111442a(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.e.j r12 = r8.f132879s
            r12.mo111481a(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0061
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f132874n     // Catch:{ InterruptedException -> 0x0059 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.internal.e.i> r3 = r8.f132864d     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0030:
            long r3 = r8.f132874n     // Catch:{ all -> 0x0057 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0057 }
            int r3 = (int) r3     // Catch:{ all -> 0x0057 }
            okhttp3.internal.e.j r4 = r8.f132879s     // Catch:{ all -> 0x0057 }
            int r4 = r4.f132961a     // Catch:{ all -> 0x0057 }
            int r3 = java.lang.Math.min(r3, r4)     // Catch:{ all -> 0x0057 }
            long r4 = r8.f132874n     // Catch:{ all -> 0x0057 }
            long r6 = (long) r3     // Catch:{ all -> 0x0057 }
            long r4 = r4 - r6
            r8.f132874n = r4     // Catch:{ all -> 0x0057 }
            monitor-exit(r8)     // Catch:{ all -> 0x0057 }
            r4 = 0
            long r12 = r12 - r6
            okhttp3.internal.e.j r4 = r8.f132879s
            if (r10 == 0) goto L_0x0052
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            r4.mo111481a(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0057:
            r9 = move-exception
            goto L_0x005f
        L_0x0059:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0057 }
            r9.<init>()     // Catch:{ all -> 0x0057 }
            throw r9     // Catch:{ all -> 0x0057 }
        L_0x005f:
            monitor-exit(r8)     // Catch:{ all -> 0x0057 }
            throw r9
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53594g.mo111442a(int, boolean, okio.Buffer, long):void");
    }
}

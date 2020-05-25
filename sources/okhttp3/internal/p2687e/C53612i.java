package okhttp3.internal.p2687e;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.List;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* renamed from: okhttp3.internal.e.i */
public final class C53612i {

    /* renamed from: m */
    static final /* synthetic */ boolean f132934m = (!C53612i.class.desiredAssertionStatus());

    /* renamed from: a */
    long f132935a;

    /* renamed from: b */
    long f132936b;

    /* renamed from: c */
    public final int f132937c;

    /* renamed from: d */
    public final C53594g f132938d;

    /* renamed from: e */
    public final List<C53587c> f132939e;

    /* renamed from: f */
    List<C53587c> f132940f;

    /* renamed from: g */
    boolean f132941g;

    /* renamed from: h */
    public final C53614b f132942h;

    /* renamed from: i */
    final C53613a f132943i;

    /* renamed from: j */
    public final C53615c f132944j = new C53615c();

    /* renamed from: k */
    public final C53615c f132945k = new C53615c();

    /* renamed from: l */
    C53586b f132946l = null;

    /* renamed from: okhttp3.internal.e.i$a */
    final class C53613a implements Sink {

        /* renamed from: c */
        static final /* synthetic */ boolean f132947c = (!C53612i.class.desiredAssertionStatus());

        /* renamed from: a */
        boolean f132948a;

        /* renamed from: b */
        boolean f132949b;

        /* renamed from: e */
        private final Buffer f132951e = new Buffer();

        public final Timeout timeout() {
            return C53612i.this.f132945k;
        }

        public final void flush() throws IOException {
            if (f132947c || !Thread.holdsLock(C53612i.this)) {
                synchronized (C53612i.this) {
                    C53612i.this.mo111470g();
                }
                while (this.f132951e.size() > 0) {
                    m113963a(false);
                    C53612i.this.f132938d.mo111445b();
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r8.f132950d.f132943i.f132949b != false) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
            if (r8.f132951e.size() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
            if (r8.f132951e.size() <= 0) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
            m113963a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.f132950d.f132938d.mo111442a(r8.f132950d.f132937c, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
            r2 = r8.f132950d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.f132948a = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
            r8.f132950d.f132938d.mo111445b();
            r8.f132950d.mo111469f();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() throws java.io.IOException {
            /*
                r8 = this;
                boolean r0 = f132947c
                if (r0 != 0) goto L_0x0013
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                boolean r0 = java.lang.Thread.holdsLock(r0)
                if (r0 != 0) goto L_0x000d
                goto L_0x0013
            L_0x000d:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L_0x0013:
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                monitor-enter(r0)
                boolean r1 = r8.f132948a     // Catch:{ all -> 0x0065 }
                if (r1 == 0) goto L_0x001c
                monitor-exit(r0)     // Catch:{ all -> 0x0065 }
                return
            L_0x001c:
                monitor-exit(r0)     // Catch:{ all -> 0x0065 }
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                okhttp3.internal.e.i$a r0 = r0.f132943i
                boolean r0 = r0.f132949b
                r1 = 1
                if (r0 != 0) goto L_0x004f
                okio.Buffer r0 = r8.f132951e
                long r2 = r0.size()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
            L_0x0032:
                okio.Buffer r0 = r8.f132951e
                long r2 = r0.size()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x004f
                r8.m113963a(r1)
                goto L_0x0032
            L_0x0040:
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                okhttp3.internal.e.g r2 = r0.f132938d
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                int r3 = r0.f132937c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo111442a(r3, r4, r5, r6)
            L_0x004f:
                okhttp3.internal.e.i r2 = okhttp3.internal.p2687e.C53612i.this
                monitor-enter(r2)
                r8.f132948a = r1     // Catch:{ all -> 0x0062 }
                monitor-exit(r2)     // Catch:{ all -> 0x0062 }
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                okhttp3.internal.e.g r0 = r0.f132938d
                r0.mo111445b()
                okhttp3.internal.e.i r0 = okhttp3.internal.p2687e.C53612i.this
                r0.mo111469f()
                return
            L_0x0062:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0062 }
                throw r0
            L_0x0065:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0065 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53612i.C53613a.close():void");
        }

        C53613a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m113963a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (C53612i.this) {
                C53612i.this.f132945k.enter();
                while (C53612i.this.f132936b <= 0 && !this.f132949b && !this.f132948a && C53612i.this.f132946l == null) {
                    try {
                        C53612i.this.mo111471h();
                    } catch (Throwable th) {
                        C53612i.this.f132945k.mo111473a();
                        throw th;
                    }
                }
                C53612i.this.f132945k.mo111473a();
                C53612i.this.mo111470g();
                min = Math.min(C53612i.this.f132936b, this.f132951e.size());
                C53612i.this.f132936b -= min;
            }
            C53612i.this.f132945k.enter();
            try {
                C53594g gVar = C53612i.this.f132938d;
                int i = C53612i.this.f132937c;
                if (!z || min != this.f132951e.size()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                gVar.mo111442a(i, z2, this.f132951e, min);
            } finally {
                C53612i.this.f132945k.mo111473a();
            }
        }

        public final void write(Buffer buffer, long j) throws IOException {
            if (f132947c || !Thread.holdsLock(C53612i.this)) {
                this.f132951e.write(buffer, j);
                while (this.f132951e.size() >= 16384) {
                    m113963a(false);
                }
                return;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: okhttp3.internal.e.i$b */
    final class C53614b implements Source {

        /* renamed from: c */
        static final /* synthetic */ boolean f132952c = (!C53612i.class.desiredAssertionStatus());

        /* renamed from: a */
        boolean f132953a;

        /* renamed from: b */
        boolean f132954b;

        /* renamed from: e */
        private final Buffer f132956e = new Buffer();

        /* renamed from: f */
        private final Buffer f132957f = new Buffer();

        /* renamed from: g */
        private final long f132958g;

        public final Timeout timeout() {
            return C53612i.this.f132944j;
        }

        public final void close() throws IOException {
            synchronized (C53612i.this) {
                this.f132953a = true;
                this.f132957f.clear();
                C53612i.this.notifyAll();
            }
            C53612i.this.mo111469f();
        }

        /* renamed from: a */
        private void m113964a() throws IOException {
            C53612i.this.f132944j.enter();
            while (this.f132957f.size() == 0 && !this.f132954b && !this.f132953a && C53612i.this.f132946l == null) {
                try {
                    C53612i.this.mo111471h();
                } finally {
                    C53612i.this.f132944j.mo111473a();
                }
            }
        }

        C53614b(long j) {
            this.f132958g = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo111472a(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            if (f132952c || !Thread.holdsLock(C53612i.this)) {
                while (j > 0) {
                    synchronized (C53612i.this) {
                        z = this.f132954b;
                        z2 = false;
                        if (this.f132957f.size() + j > this.f132958g) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        bufferedSource.skip(j);
                        C53612i.this.mo111463b(C53586b.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        bufferedSource.skip(j);
                        return;
                    } else {
                        long read = bufferedSource.read(this.f132956e, j);
                        if (read != -1) {
                            j -= read;
                            synchronized (C53612i.this) {
                                if (this.f132957f.size() == 0) {
                                    z2 = true;
                                }
                                this.f132957f.writeAll(this.f132956e);
                                if (z2) {
                                    C53612i.this.notifyAll();
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
            r10 = r7.f132955d.f132938d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r7.f132955d.f132938d.f132873m += r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
            if (r7.f132955d.f132938d.f132873m < ((long) (r7.f132955d.f132938d.f132875o.mo111490b() / 2))) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
            r7.f132955d.f132938d.mo111440a(0, r7.f132955d.f132938d.f132873m);
            r7.f132955d.f132938d.f132873m = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
            monitor-exit(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
            return r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long read(okio.Buffer r8, long r9) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00b9
                okhttp3.internal.e.i r2 = okhttp3.internal.p2687e.C53612i.this
                monitor-enter(r2)
                r7.m113964a()     // Catch:{ all -> 0x00b6 }
                boolean r3 = r7.f132953a     // Catch:{ all -> 0x00b6 }
                if (r3 != 0) goto L_0x00ae
                okhttp3.internal.e.i r3 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.b r3 = r3.f132946l     // Catch:{ all -> 0x00b6 }
                if (r3 != 0) goto L_0x00a4
                okio.Buffer r3 = r7.f132957f     // Catch:{ all -> 0x00b6 }
                long r3 = r3.size()     // Catch:{ all -> 0x00b6 }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x0024
                r8 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00b6 }
                return r8
            L_0x0024:
                okio.Buffer r3 = r7.f132957f     // Catch:{ all -> 0x00b6 }
                okio.Buffer r4 = r7.f132957f     // Catch:{ all -> 0x00b6 }
                long r4 = r4.size()     // Catch:{ all -> 0x00b6 }
                long r9 = java.lang.Math.min(r9, r4)     // Catch:{ all -> 0x00b6 }
                long r8 = r3.read(r8, r9)     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r10 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                long r3 = r10.f132935a     // Catch:{ all -> 0x00b6 }
                r5 = 0
                long r3 = r3 + r8
                r10.f132935a = r3     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r10 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                long r3 = r10.f132935a     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r10 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.g r10 = r10.f132938d     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.m r10 = r10.f132875o     // Catch:{ all -> 0x00b6 }
                int r10 = r10.mo111490b()     // Catch:{ all -> 0x00b6 }
                int r10 = r10 / 2
                long r5 = (long) r10     // Catch:{ all -> 0x00b6 }
                int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r10 < 0) goto L_0x0064
                okhttp3.internal.e.i r10 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.g r10 = r10.f132938d     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r3 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                int r3 = r3.f132937c     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r4 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                long r4 = r4.f132935a     // Catch:{ all -> 0x00b6 }
                r10.mo111440a(r3, r4)     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r10 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                r10.f132935a = r0     // Catch:{ all -> 0x00b6 }
            L_0x0064:
                monitor-exit(r2)     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r10 = okhttp3.internal.p2687e.C53612i.this
                okhttp3.internal.e.g r10 = r10.f132938d
                monitor-enter(r10)
                okhttp3.internal.e.i r2 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.g r2 = r2.f132938d     // Catch:{ all -> 0x00a1 }
                long r3 = r2.f132873m     // Catch:{ all -> 0x00a1 }
                r5 = 0
                long r3 = r3 + r8
                r2.f132873m = r3     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.i r2 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.g r2 = r2.f132938d     // Catch:{ all -> 0x00a1 }
                long r2 = r2.f132873m     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.i r4 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.g r4 = r4.f132938d     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.m r4 = r4.f132875o     // Catch:{ all -> 0x00a1 }
                int r4 = r4.mo111490b()     // Catch:{ all -> 0x00a1 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00a1 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x009f
                okhttp3.internal.e.i r2 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.g r2 = r2.f132938d     // Catch:{ all -> 0x00a1 }
                r3 = 0
                okhttp3.internal.e.i r4 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.g r4 = r4.f132938d     // Catch:{ all -> 0x00a1 }
                long r4 = r4.f132873m     // Catch:{ all -> 0x00a1 }
                r2.mo111440a(r3, r4)     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.i r2 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00a1 }
                okhttp3.internal.e.g r2 = r2.f132938d     // Catch:{ all -> 0x00a1 }
                r2.f132873m = r0     // Catch:{ all -> 0x00a1 }
            L_0x009f:
                monitor-exit(r10)     // Catch:{ all -> 0x00a1 }
                return r8
            L_0x00a1:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x00a1 }
                throw r8
            L_0x00a4:
                okhttp3.internal.e.n r8 = new okhttp3.internal.e.n     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.i r9 = okhttp3.internal.p2687e.C53612i.this     // Catch:{ all -> 0x00b6 }
                okhttp3.internal.e.b r9 = r9.f132946l     // Catch:{ all -> 0x00b6 }
                r8.<init>(r9)     // Catch:{ all -> 0x00b6 }
                throw r8     // Catch:{ all -> 0x00b6 }
            L_0x00ae:
                java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00b6 }
                java.lang.String r9 = "stream closed"
                r8.<init>(r9)     // Catch:{ all -> 0x00b6 }
                throw r8     // Catch:{ all -> 0x00b6 }
            L_0x00b6:
                r8 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00b6 }
                throw r8
            L_0x00b9:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "byteCount < 0: "
                r0.<init>(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2687e.C53612i.C53614b.read(okio.Buffer, long):long");
        }
    }

    /* renamed from: okhttp3.internal.e.i$c */
    class C53615c extends AsyncTimeout {
        public final void timedOut() {
            C53612i.this.mo111463b(C53586b.CANCEL);
        }

        /* renamed from: a */
        public final void mo111473a() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        C53615c() {
        }

        public final IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo111471h() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* renamed from: b */
    public final boolean mo111464b() {
        boolean z;
        if ((this.f132937c & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f132938d.f132862b == z) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final Sink mo111467d() {
        synchronized (this) {
            if (!this.f132941g) {
                if (!mo111464b()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f132943i;
    }

    /* renamed from: a */
    public final synchronized boolean mo111462a() {
        if (this.f132946l != null) {
            return false;
        }
        if ((this.f132942h.f132954b || this.f132942h.f132953a) && ((this.f132943i.f132949b || this.f132943i.f132948a) && this.f132941g)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final synchronized List<C53587c> mo111465c() throws IOException {
        List<C53587c> list;
        if (mo111464b()) {
            this.f132944j.enter();
            while (this.f132940f == null && this.f132946l == null) {
                try {
                    mo111471h();
                } catch (Throwable th) {
                    this.f132944j.mo111473a();
                    throw th;
                }
            }
            this.f132944j.mo111473a();
            list = this.f132940f;
            if (list != null) {
                this.f132940f = null;
            } else {
                throw new C53622n(this.f132946l);
            }
        } else {
            throw new IllegalStateException("servers cannot read response headers");
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo111468e() {
        boolean a;
        if (f132934m || !Thread.holdsLock(this)) {
            synchronized (this) {
                this.f132942h.f132954b = true;
                a = mo111462a();
                notifyAll();
            }
            if (!a) {
                this.f132938d.mo111444b(this.f132937c);
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo111470g() throws IOException {
        if (this.f132943i.f132948a) {
            throw new IOException("stream closed");
        } else if (this.f132943i.f132949b) {
            throw new IOException("stream finished");
        } else if (this.f132946l != null) {
            throw new C53622n(this.f132946l);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo111469f() throws IOException {
        boolean z;
        boolean a;
        if (f132934m || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f132942h.f132954b || !this.f132942h.f132953a || (!this.f132943i.f132949b && !this.f132943i.f132948a)) {
                    z = false;
                } else {
                    z = true;
                }
                a = mo111462a();
            }
            if (z) {
                mo111461a(C53586b.CANCEL);
                return;
            }
            if (!a) {
                this.f132938d.mo111444b(this.f132937c);
            }
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111460a(long j) {
        this.f132936b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo111463b(C53586b bVar) {
        if (m113950d(bVar)) {
            this.f132938d.mo111441a(this.f132937c, bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized void mo111466c(C53586b bVar) {
        if (this.f132946l == null) {
            this.f132946l = bVar;
            notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo111461a(C53586b bVar) throws IOException {
        if (m113950d(bVar)) {
            this.f132938d.mo111446b(this.f132937c, bVar);
        }
    }

    /* renamed from: d */
    private boolean m113950d(C53586b bVar) {
        if (f132934m || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.f132946l != null) {
                    return false;
                }
                if (this.f132942h.f132954b && this.f132943i.f132949b) {
                    return false;
                }
                this.f132946l = bVar;
                notifyAll();
                this.f132938d.mo111444b(this.f132937c);
                return true;
            }
        }
        throw new AssertionError();
    }

    C53612i(int i, C53594g gVar, boolean z, boolean z2, List<C53587c> list) {
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f132937c = i;
            this.f132938d = gVar;
            this.f132936b = (long) gVar.f132876p.mo111490b();
            this.f132942h = new C53614b((long) gVar.f132875o.mo111490b());
            this.f132943i = new C53613a();
            this.f132942h.f132954b = z2;
            this.f132943i.f132949b = z;
            this.f132939e = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }
}

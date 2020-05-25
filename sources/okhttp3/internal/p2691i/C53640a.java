package okhttp3.internal.p2691i;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53511ah;
import okhttp3.C53512ai;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53664p;
import okhttp3.C53682y;
import okhttp3.C53685z;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53557g;
import okhttp3.internal.p2691i.C53649c.C53650a;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* renamed from: okhttp3.internal.i.a */
public final class C53640a implements C53511ah, C53650a {

    /* renamed from: d */
    static final /* synthetic */ boolean f133009d = (!C53640a.class.desiredAssertionStatus());

    /* renamed from: e */
    private static final List<C53685z> f133010e = Collections.singletonList(C53685z.HTTP_1_1);

    /* renamed from: a */
    final C53512ai f133011a;

    /* renamed from: b */
    final String f133012b;

    /* renamed from: c */
    C53524e f133013c;

    /* renamed from: f */
    private final C53498ab f133014f;

    /* renamed from: g */
    private final Random f133015g;

    /* renamed from: h */
    private final long f133016h;

    /* renamed from: i */
    private final Runnable f133017i;

    /* renamed from: j */
    private C53649c f133018j;

    /* renamed from: k */
    private C53651d f133019k;

    /* renamed from: l */
    private ScheduledExecutorService f133020l;

    /* renamed from: m */
    private C53647e f133021m;

    /* renamed from: n */
    private final ArrayDeque<ByteString> f133022n = new ArrayDeque<>();

    /* renamed from: o */
    private final ArrayDeque<Object> f133023o = new ArrayDeque<>();

    /* renamed from: p */
    private long f133024p;

    /* renamed from: q */
    private boolean f133025q;

    /* renamed from: r */
    private ScheduledFuture<?> f133026r;

    /* renamed from: s */
    private int f133027s = -1;

    /* renamed from: t */
    private String f133028t;

    /* renamed from: u */
    private boolean f133029u;

    /* renamed from: v */
    private int f133030v;

    /* renamed from: w */
    private int f133031w;

    /* renamed from: x */
    private int f133032x;

    /* renamed from: y */
    private boolean f133033y;

    /* renamed from: okhttp3.internal.i.a$a */
    final class C53643a implements Runnable {
        public final void run() {
            C53640a.this.f133013c.mo111248c();
        }

        C53643a() {
        }
    }

    /* renamed from: okhttp3.internal.i.a$b */
    static final class C53644b {

        /* renamed from: a */
        final int f133038a;

        /* renamed from: b */
        final ByteString f133039b;

        /* renamed from: c */
        final long f133040c;

        C53644b(int i, ByteString byteString, long j) {
            this.f133038a = i;
            this.f133039b = byteString;
            this.f133040c = j;
        }
    }

    /* renamed from: okhttp3.internal.i.a$c */
    static final class C53645c {

        /* renamed from: a */
        final int f133041a;

        /* renamed from: b */
        final ByteString f133042b;

        C53645c(int i, ByteString byteString) {
            this.f133041a = i;
            this.f133042b = byteString;
        }
    }

    /* renamed from: okhttp3.internal.i.a$d */
    final class C53646d implements Runnable {
        public final void run() {
            C53640a.this.mo111541d();
        }

        C53646d() {
        }
    }

    /* renamed from: okhttp3.internal.i.a$e */
    public static abstract class C53647e implements Closeable {

        /* renamed from: c */
        public final boolean f133044c;

        /* renamed from: d */
        public final BufferedSource f133045d;

        /* renamed from: e */
        public final BufferedSink f133046e;

        public C53647e(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f133044c = z;
            this.f133045d = bufferedSource;
            this.f133046e = bufferedSink;
        }
    }

    /* renamed from: a */
    public final C53498ab mo17195a() {
        return this.f133014f;
    }

    /* renamed from: e */
    private void m114075e() {
        if (!f133009d && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (this.f133020l != null) {
            this.f133020l.execute(this.f133017i);
        }
    }

    /* renamed from: b */
    public final void mo111537b() throws IOException {
        while (this.f133027s == -1) {
            C53649c cVar = this.f133018j;
            cVar.mo111545a();
            if (cVar.f133054h) {
                cVar.mo111546b();
            } else {
                int i = cVar.f133051e;
                if (i == 1 || i == 2) {
                    cVar.mo111547c();
                    if (i == 1) {
                        cVar.f133049c.mo111533a(cVar.f133055i.readUtf8());
                    } else {
                        cVar.f133049c.mo111536a(cVar.f133055i.readByteString());
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unknown opcode: ");
                    sb.append(Integer.toHexString(i));
                    throw new ProtocolException(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r2 = new java.lang.StringBuilder("sent ping but didn't receive pong within ");
        r2.append(r7.f133016h);
        r2.append("ms (after ");
        r2.append(r1 - 1);
        r2.append(" successful ping/pongs)");
        mo111532a((java.lang.Exception) new java.net.SocketTimeoutException(r2.toString()), (okhttp3.C53504ad) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.mo111549a(9, okio.ByteString.EMPTY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        mo111532a((java.lang.Exception) r0, (okhttp3.C53504ad) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111541d() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f133029u     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0052 }
            return
        L_0x0007:
            okhttp3.internal.i.d r0 = r7.f133019k     // Catch:{ all -> 0x0052 }
            boolean r1 = r7.f133033y     // Catch:{ all -> 0x0052 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.f133030v     // Catch:{ all -> 0x0052 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.f133030v     // Catch:{ all -> 0x0052 }
            r4 = 1
            int r3 = r3 + r4
            r7.f133030v = r3     // Catch:{ all -> 0x0052 }
            r7.f133033y = r4     // Catch:{ all -> 0x0052 }
            monitor-exit(r7)     // Catch:{ all -> 0x0052 }
            r3 = 0
            if (r1 == r2) goto L_0x0045
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.<init>(r5)
            long r5 = r7.f133016h
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.mo111532a(r0, r3)
            return
        L_0x0045:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch:{ IOException -> 0x004d }
            r2 = 9
            r0.mo111549a(r2, r1)     // Catch:{ IOException -> 0x004d }
            return
        L_0x004d:
            r0 = move-exception
            r7.mo111532a(r0, r3)
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0052 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2691i.C53640a.mo111541d():void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r2 == null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.mo111549a(10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r4 instanceof okhttp3.internal.p2691i.C53640a.C53645c) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0062, code lost:
        r2 = ((okhttp3.internal.p2691i.C53640a.C53645c) r4).f133042b;
        r3 = ((okhttp3.internal.p2691i.C53640a.C53645c) r4).f133041a;
        r4 = (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r0.f133066h != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        r0.f133066h = true;
        r0.f133065g.f133069a = r3;
        r0.f133065g.f133070b = r4;
        r0.f133065g.f133071c = true;
        r0.f133065g.f133072d = false;
        r0 = okio.Okio.buffer((okio.Sink) r0.f133065g);
        r0.write(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r12.f133024p -= (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        if ((r4 instanceof okhttp3.internal.p2691i.C53640a.C53644b) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        r4 = (okhttp3.internal.p2691i.C53640a.C53644b) r4;
        r1 = r4.f133038a;
        r2 = r4.f133039b;
        r4 = okio.ByteString.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (r1 != 0) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        if (r2 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ba, code lost:
        if (r1 == 0) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bc, code lost:
        okhttp3.internal.p2691i.C53648b.m114093b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bf, code lost:
        r4 = new okio.Buffer();
        r4.writeShort(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r2 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        r4.write(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cc, code lost:
        r4 = r4.readByteString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0.mo111549a(8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r0.f133063e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d9, code lost:
        r12.f133011a.onClosed(r12, r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        okhttp3.internal.C53559c.m113805a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r0.f133063e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e5, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00eb, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ec, code lost:
        okhttp3.internal.C53559c.m113805a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:25:0x0056, B:57:0x00d2] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo111540c() throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f133029u     // Catch:{ all -> 0x00f0 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)     // Catch:{ all -> 0x00f0 }
            return r1
        L_0x0008:
            okhttp3.internal.i.d r0 = r12.f133019k     // Catch:{ all -> 0x00f0 }
            java.util.ArrayDeque<okio.ByteString> r2 = r12.f133022n     // Catch:{ all -> 0x00f0 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00f0 }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x00f0 }
            r3 = 0
            if (r2 != 0) goto L_0x004d
            java.util.ArrayDeque<java.lang.Object> r4 = r12.f133023o     // Catch:{ all -> 0x00f0 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00f0 }
            boolean r5 = r4 instanceof okhttp3.internal.p2691i.C53640a.C53644b     // Catch:{ all -> 0x00f0 }
            if (r5 == 0) goto L_0x0047
            int r5 = r12.f133027s     // Catch:{ all -> 0x00f0 }
            java.lang.String r6 = r12.f133028t     // Catch:{ all -> 0x00f0 }
            r7 = -1
            if (r5 == r7) goto L_0x0031
            okhttp3.internal.i.a$e r7 = r12.f133021m     // Catch:{ all -> 0x00f0 }
            r12.f133021m = r3     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.ScheduledExecutorService r3 = r12.f133020l     // Catch:{ all -> 0x00f0 }
            r3.shutdown()     // Catch:{ all -> 0x00f0 }
        L_0x002f:
            r3 = r6
            goto L_0x0050
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r7 = r12.f133020l     // Catch:{ all -> 0x00f0 }
            okhttp3.internal.i.a$a r8 = new okhttp3.internal.i.a$a     // Catch:{ all -> 0x00f0 }
            r8.<init>()     // Catch:{ all -> 0x00f0 }
            r9 = r4
            okhttp3.internal.i.a$b r9 = (okhttp3.internal.p2691i.C53640a.C53644b) r9     // Catch:{ all -> 0x00f0 }
            long r9 = r9.f133040c     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r11)     // Catch:{ all -> 0x00f0 }
            r12.f133026r = r7     // Catch:{ all -> 0x00f0 }
            r7 = r3
            goto L_0x002f
        L_0x0047:
            if (r4 != 0) goto L_0x004b
            monitor-exit(r12)     // Catch:{ all -> 0x00f0 }
            return r1
        L_0x004b:
            r7 = r3
            goto L_0x004f
        L_0x004d:
            r4 = r3
            r7 = r4
        L_0x004f:
            r5 = 0
        L_0x0050:
            monitor-exit(r12)     // Catch:{ all -> 0x00f0 }
            r6 = 1
            if (r2 == 0) goto L_0x005e
            r1 = 10
            r0.mo111549a(r1, r2)     // Catch:{ all -> 0x005b }
            goto L_0x00de
        L_0x005b:
            r0 = move-exception
            goto L_0x00ec
        L_0x005e:
            boolean r2 = r4 instanceof okhttp3.internal.p2691i.C53640a.C53645c     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x00aa
            r2 = r4
            okhttp3.internal.i.a$c r2 = (okhttp3.internal.p2691i.C53640a.C53645c) r2     // Catch:{ all -> 0x005b }
            okio.ByteString r2 = r2.f133042b     // Catch:{ all -> 0x005b }
            okhttp3.internal.i.a$c r4 = (okhttp3.internal.p2691i.C53640a.C53645c) r4     // Catch:{ all -> 0x005b }
            int r3 = r4.f133041a     // Catch:{ all -> 0x005b }
            int r4 = r2.size()     // Catch:{ all -> 0x005b }
            long r4 = (long) r4     // Catch:{ all -> 0x005b }
            boolean r8 = r0.f133066h     // Catch:{ all -> 0x005b }
            if (r8 != 0) goto L_0x00a2
            r0.f133066h = r6     // Catch:{ all -> 0x005b }
            okhttp3.internal.i.d$a r8 = r0.f133065g     // Catch:{ all -> 0x005b }
            r8.f133069a = r3     // Catch:{ all -> 0x005b }
            okhttp3.internal.i.d$a r3 = r0.f133065g     // Catch:{ all -> 0x005b }
            r3.f133070b = r4     // Catch:{ all -> 0x005b }
            okhttp3.internal.i.d$a r3 = r0.f133065g     // Catch:{ all -> 0x005b }
            r3.f133071c = r6     // Catch:{ all -> 0x005b }
            okhttp3.internal.i.d$a r3 = r0.f133065g     // Catch:{ all -> 0x005b }
            r3.f133072d = r1     // Catch:{ all -> 0x005b }
            okhttp3.internal.i.d$a r0 = r0.f133065g     // Catch:{ all -> 0x005b }
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch:{ all -> 0x005b }
            r0.write(r2)     // Catch:{ all -> 0x005b }
            r0.close()     // Catch:{ all -> 0x005b }
            monitor-enter(r12)     // Catch:{ all -> 0x005b }
            long r0 = r12.f133024p     // Catch:{ all -> 0x009f }
            int r2 = r2.size()     // Catch:{ all -> 0x009f }
            long r2 = (long) r2     // Catch:{ all -> 0x009f }
            long r0 = r0 - r2
            r12.f133024p = r0     // Catch:{ all -> 0x009f }
            monitor-exit(r12)     // Catch:{ all -> 0x009f }
            goto L_0x00de
        L_0x009f:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "Another message writer is active. Did you call close()?"
            r0.<init>(r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x00aa:
            boolean r1 = r4 instanceof okhttp3.internal.p2691i.C53640a.C53644b     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x00e6
            okhttp3.internal.i.a$b r4 = (okhttp3.internal.p2691i.C53640a.C53644b) r4     // Catch:{ all -> 0x005b }
            int r1 = r4.f133038a     // Catch:{ all -> 0x005b }
            okio.ByteString r2 = r4.f133039b     // Catch:{ all -> 0x005b }
            okio.ByteString r4 = okio.ByteString.EMPTY     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x00ba
            if (r2 == 0) goto L_0x00d0
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            okhttp3.internal.p2691i.C53648b.m114093b(r1)     // Catch:{ all -> 0x005b }
        L_0x00bf:
            okio.Buffer r4 = new okio.Buffer     // Catch:{ all -> 0x005b }
            r4.<init>()     // Catch:{ all -> 0x005b }
            r4.writeShort(r1)     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x00cc
            r4.write(r2)     // Catch:{ all -> 0x005b }
        L_0x00cc:
            okio.ByteString r4 = r4.readByteString()     // Catch:{ all -> 0x005b }
        L_0x00d0:
            r1 = 8
            r0.mo111549a(r1, r4)     // Catch:{ all -> 0x00e2 }
            r0.f133063e = r6     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x00de
            okhttp3.ai r0 = r12.f133011a     // Catch:{ all -> 0x005b }
            r0.onClosed(r12, r5, r3)     // Catch:{ all -> 0x005b }
        L_0x00de:
            okhttp3.internal.C53559c.m113805a(r7)
            return r6
        L_0x00e2:
            r1 = move-exception
            r0.f133063e = r6     // Catch:{ all -> 0x005b }
            throw r1     // Catch:{ all -> 0x005b }
        L_0x00e6:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x005b }
            r0.<init>()     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x00ec:
            okhttp3.internal.C53559c.m113805a(r7)
            throw r0
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00f0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2691i.C53640a.mo111540c():boolean");
    }

    /* renamed from: a */
    public final void mo111533a(String str) throws IOException {
        this.f133011a.onMessage((C53511ah) this, str);
    }

    /* renamed from: a */
    public final void mo111536a(ByteString byteString) throws IOException {
        this.f133011a.onMessage((C53511ah) this, byteString);
    }

    /* renamed from: c */
    public final synchronized void mo111539c(ByteString byteString) {
        this.f133032x++;
        this.f133033y = false;
    }

    /* renamed from: d */
    public final boolean mo17209d(ByteString byteString) {
        if (byteString != null) {
            return m114074a(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* renamed from: b */
    public final boolean mo17204b(String str) {
        if (str != null) {
            return m114074a(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo111538b(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f133029u     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f133025q     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f133023o     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.f133022n     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.m114075e()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f133031w     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f133031w = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2691i.C53640a.mo111538b(okio.ByteString):void");
    }

    /* renamed from: a */
    public final void mo111535a(C53682y yVar) {
        C53682y a = yVar.mo111653b().mo111664a(C53664p.NONE).mo111655a(f133010e).mo111667a();
        final C53498ab c = this.f133014f.mo111256a().mo111263a("Upgrade", "websocket").mo111263a("Connection", "Upgrade").mo111263a("Sec-WebSocket-Key", this.f133012b).mo111263a("Sec-WebSocket-Version", "13").mo111272c();
        this.f133013c = C53533a.f132616a.mo111340a(a, c);
        this.f133013c.mo111246a(new C53526f() {
            public final void onFailure(C53524e eVar, IOException iOException) {
                C53640a.this.mo111532a((Exception) iOException, (C53504ad) null);
            }

            public final void onResponse(C53524e eVar, C53504ad adVar) {
                try {
                    C53640a aVar = C53640a.this;
                    if (adVar.f132400c == 101) {
                        String b = adVar.mo111276b("Connection");
                        if ("Upgrade".equalsIgnoreCase(b)) {
                            String b2 = adVar.mo111276b("Upgrade");
                            if ("websocket".equalsIgnoreCase(b2)) {
                                String b3 = adVar.mo111276b("Sec-WebSocket-Accept");
                                StringBuilder sb = new StringBuilder();
                                sb.append(aVar.f133012b);
                                sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                                String base64 = ByteString.encodeUtf8(sb.toString()).sha1().base64();
                                if (base64.equals(b3)) {
                                    C53557g a = C53533a.f132616a.mo111343a(eVar);
                                    a.mo111402d();
                                    C53647e a2 = a.mo111400b().mo111374a(a);
                                    try {
                                        C53640a.this.f133011a.onOpen(C53640a.this, adVar);
                                        StringBuilder sb2 = new StringBuilder("OkHttp WebSocket ");
                                        sb2.append(c.f132378a.mo111623i());
                                        C53640a.this.mo111534a(sb2.toString(), a2);
                                        a.mo111400b().mo111337b().setSoTimeout(0);
                                        C53640a.this.mo111537b();
                                    } catch (Exception e) {
                                        C53640a.this.mo111532a(e, (C53504ad) null);
                                    }
                                } else {
                                    StringBuilder sb3 = new StringBuilder("Expected 'Sec-WebSocket-Accept' header value '");
                                    sb3.append(base64);
                                    sb3.append("' but was '");
                                    sb3.append(b3);
                                    sb3.append("'");
                                    throw new ProtocolException(sb3.toString());
                                }
                            } else {
                                StringBuilder sb4 = new StringBuilder("Expected 'Upgrade' header value 'websocket' but was '");
                                sb4.append(b2);
                                sb4.append("'");
                                throw new ProtocolException(sb4.toString());
                            }
                        } else {
                            StringBuilder sb5 = new StringBuilder("Expected 'Connection' header value 'Upgrade' but was '");
                            sb5.append(b);
                            sb5.append("'");
                            throw new ProtocolException(sb5.toString());
                        }
                    } else {
                        StringBuilder sb6 = new StringBuilder("Expected HTTP 101 response but was '");
                        sb6.append(adVar.f132400c);
                        sb6.append(" ");
                        sb6.append(adVar.f132401d);
                        sb6.append("'");
                        throw new ProtocolException(sb6.toString());
                    }
                } catch (ProtocolException e2) {
                    C53640a.this.mo111532a((Exception) e2, adVar);
                    C53559c.m113805a((Closeable) adVar);
                }
            }
        });
    }

    /* renamed from: b */
    public final boolean mo17203b(int i, String str) {
        return m114073a(i, str, 60000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.f133011a.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        okhttp3.internal.C53559c.m113805a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111532a(java.lang.Exception r4, okhttp3.C53504ad r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f133029u     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0007:
            r0 = 1
            r3.f133029u = r0     // Catch:{ all -> 0x0031 }
            okhttp3.internal.i.a$e r0 = r3.f133021m     // Catch:{ all -> 0x0031 }
            r1 = 0
            r3.f133021m = r1     // Catch:{ all -> 0x0031 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f133026r     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f133026r     // Catch:{ all -> 0x0031 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0031 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f133020l     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.f133020l     // Catch:{ all -> 0x0031 }
            r1.shutdown()     // Catch:{ all -> 0x0031 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            okhttp3.ai r1 = r3.f133011a     // Catch:{ all -> 0x002c }
            r1.onFailure(r3, r4, r5)     // Catch:{ all -> 0x002c }
            okhttp3.internal.C53559c.m113805a(r0)
            return
        L_0x002c:
            r4 = move-exception
            okhttp3.internal.C53559c.m113805a(r0)
            throw r4
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2691i.C53640a.mo111532a(java.lang.Exception, okhttp3.ad):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m114074a(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f133029u     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f133025q     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f133024p     // Catch:{ all -> 0x003e }
            int r0 = r7.size()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.mo17203b(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f133024p     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f133024p = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f133023o     // Catch:{ all -> 0x003e }
            okhttp3.internal.i.a$c r1 = new okhttp3.internal.i.a$c     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.m114075e()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2691i.C53640a.m114074a(okio.ByteString, int):boolean");
    }

    /* renamed from: a */
    public final void mo111531a(int i, String str) {
        Closeable closeable;
        if (i != -1) {
            synchronized (this) {
                if (this.f133027s == -1) {
                    this.f133027s = i;
                    this.f133028t = str;
                    if (!this.f133025q || !this.f133023o.isEmpty()) {
                        closeable = null;
                    } else {
                        closeable = this.f133021m;
                        this.f133021m = null;
                        if (this.f133026r != null) {
                            this.f133026r.cancel(false);
                        }
                        this.f133020l.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.f133011a.onClosing(this, i, str);
                if (closeable != null) {
                    this.f133011a.onClosed(this, i, str);
                }
            } finally {
                C53559c.m113805a(closeable);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final void mo111534a(String str, C53647e eVar) throws IOException {
        synchronized (this) {
            this.f133021m = eVar;
            this.f133019k = new C53651d(eVar.f133044c, eVar.f133046e, this.f133015g);
            this.f133020l = new ScheduledThreadPoolExecutor(1, C53559c.m113803a(str, false));
            if (this.f133016h != 0) {
                this.f133020l.scheduleAtFixedRate(new C53646d(), this.f133016h, this.f133016h, TimeUnit.MILLISECONDS);
            }
            if (!this.f133023o.isEmpty()) {
                m114075e();
            }
        }
        this.f133018j = new C53649c(eVar.f133044c, eVar.f133045d, this);
    }

    /* renamed from: a */
    private synchronized boolean m114073a(int i, String str, long j) {
        C53648b.m114093b(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.encodeUtf8(str);
            if (((long) byteString.size()) > 123) {
                StringBuilder sb = new StringBuilder("reason.size() > 123: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!this.f133029u) {
            if (!this.f133025q) {
                this.f133025q = true;
                this.f133023o.add(new C53644b(i, byteString, 60000));
                m114075e();
                return true;
            }
        }
        return false;
    }

    public C53640a(C53498ab abVar, C53512ai aiVar, Random random, long j) {
        if ("GET".equals(abVar.f132379b)) {
            this.f133014f = abVar;
            this.f133011a = aiVar;
            this.f133015g = random;
            this.f133016h = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f133012b = ByteString.m114277of(bArr).base64();
            this.f133017i = new Runnable() {
                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            C53640a.this.mo111532a((Exception) e, (C53504ad) null);
                            return;
                        }
                    } while (C53640a.this.mo111540c());
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(abVar.f132379b);
        throw new IllegalArgumentException(sb.toString());
    }
}

package com.bytedance.common.wschannel.channel.p530a.p531a.p533b;

import com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9496e.C9497a;
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
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53524e;
import okhttp3.C53685z;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2691i.C53640a.C53647e;
import okio.ByteString;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a */
public class C9486a implements C9493b, C9497a {

    /* renamed from: e */
    static final /* synthetic */ boolean f25817e = (!C9486a.class.desiredAssertionStatus());

    /* renamed from: f */
    private static final List<C53685z> f25818f = Collections.singletonList(C53685z.HTTP_1_1);

    /* renamed from: a */
    public C9494c f25819a;

    /* renamed from: b */
    public final C53498ab f25820b;

    /* renamed from: c */
    public final String f25821c;

    /* renamed from: d */
    public C53524e f25822d;

    /* renamed from: g */
    private final Random f25823g;

    /* renamed from: h */
    private final Runnable f25824h;

    /* renamed from: i */
    private final ArrayDeque<ByteString> f25825i = new ArrayDeque<>();

    /* renamed from: j */
    private final ArrayDeque<Object> f25826j = new ArrayDeque<>();

    /* renamed from: k */
    private final long f25827k;

    /* renamed from: l */
    private C9496e f25828l;

    /* renamed from: m */
    private C9498f f25829m;

    /* renamed from: n */
    private ScheduledExecutorService f25830n;

    /* renamed from: o */
    private C53647e f25831o;

    /* renamed from: p */
    private long f25832p;

    /* renamed from: q */
    private boolean f25833q;

    /* renamed from: r */
    private ScheduledFuture<?> f25834r;

    /* renamed from: s */
    private int f25835s = -1;

    /* renamed from: t */
    private String f25836t;

    /* renamed from: u */
    private boolean f25837u;

    /* renamed from: v */
    private int f25838v;

    /* renamed from: w */
    private int f25839w;

    /* renamed from: x */
    private int f25840x;

    /* renamed from: y */
    private boolean f25841y;

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$a */
    final class C9489a implements Runnable {
        public final void run() {
            C9486a.this.mo17201b();
        }

        C9489a() {
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$b */
    static final class C9490b {

        /* renamed from: a */
        final int f25846a;

        /* renamed from: b */
        final ByteString f25847b;

        /* renamed from: c */
        final long f25848c;

        C9490b(int i, ByteString byteString, long j) {
            this.f25846a = i;
            this.f25847b = byteString;
            this.f25848c = j;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$c */
    static final class C9491c {

        /* renamed from: a */
        final int f25849a;

        /* renamed from: b */
        final ByteString f25850b;

        C9491c(int i, ByteString byteString) {
            this.f25849a = i;
            this.f25850b = byteString;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.a$d */
    final class C9492d implements Runnable {
        public final void run() {
            C9486a.this.mo17211e(ByteString.EMPTY);
        }

        C9492d() {
        }
    }

    /* renamed from: a */
    public final C53498ab mo17195a() {
        return this.f25820b;
    }

    /* renamed from: b */
    public final void mo17201b() {
        this.f25822d.mo111248c();
    }

    /* renamed from: e */
    public final void mo17210e() {
        if (this.f25830n != null) {
            this.f25830n.execute(new C9492d());
        }
    }

    /* renamed from: f */
    private void m18816f() {
        if (!f25817e && !Thread.holdsLock(this)) {
            throw new AssertionError();
        } else if (this.f25830n != null) {
            this.f25830n.execute(this.f25824h);
        }
    }

    /* renamed from: c */
    public final void mo17205c() throws IOException {
        while (this.f25835s == -1) {
            C9496e eVar = this.f25828l;
            eVar.mo17217a();
            if (eVar.f25858g > eVar.f25852a) {
                eVar.mo17218a(eVar.f25858g);
            } else if (eVar.f25860i) {
                eVar.mo17219b();
            } else {
                int i = eVar.f25857f;
                if (i == 1 || i == 2) {
                    eVar.mo17220c();
                    if (i == 1) {
                        eVar.f25855d.mo17198a(eVar.f25861j.readUtf8());
                    } else {
                        eVar.f25855d.mo17200a(eVar.f25861j.readByteString());
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unknown opcode: ");
                    sb.append(Integer.toHexString(i));
                    throw new ProtocolException(sb.toString());
                }
            }
        }
    }

    /* JADX INFO: used method not loaded: okio.Buffer.writeShort(int):null, types can be incorrect */
    /* JADX INFO: used method not loaded: okio.Buffer.write(okio.ByteString):null, types can be incorrect */
    /* JADX INFO: used method not loaded: okhttp3.internal.c.a(java.io.Closeable):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r2 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.mo17222a(10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9491c) == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0061, code lost:
        r2 = ((com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9491c) r4).f25850b;
        r4 = ((com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9491c) r4).f25849a;
        r5 = (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r0.f25872h != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r0.f25872h = true;
        r0.f25871g.f25875a = r4;
        r0.f25871g.f25876b = r5;
        r0.f25871g.f25877c = true;
        r0.f25871g.f25878d = false;
        r0 = okio.Okio.buffer((okio.Sink) r0.f25871g);
        r0.write(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r12.f25832p -= (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ab, code lost:
        if ((r4 instanceof com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9490b) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r4 = (com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9490b) r4;
        r1 = r4.f25846a;
        r2 = r4.f25847b;
        r4 = okio.ByteString.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b5, code lost:
        if (r1 != 0) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
        if (r2 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        if (r1 == 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bb, code lost:
        com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9495d.m18844b(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00be, code lost:
        r4 = new okio.Buffer();
        r4.writeShort(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        if (r2 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c8, code lost:
        r4.write(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        r4 = r4.readByteString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r0.mo17222a(8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r0.f25869e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d6, code lost:
        if (r3 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00da, code lost:
        if (r12.f25819a == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00dc, code lost:
        r12.f25819a.mo17180b(r12, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e1, code lost:
        okhttp3.internal.C53559c.m113805a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r0.f25869e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ee, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ef, code lost:
        okhttp3.internal.C53559c.m113805a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f2, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0055, B:56:0x00d1] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo17208d() throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f25837u     // Catch:{ all -> 0x00f3 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)     // Catch:{ all -> 0x00f3 }
            return r1
        L_0x0008:
            com.bytedance.common.wschannel.channel.a.a.b.f r0 = r12.f25829m     // Catch:{ all -> 0x00f3 }
            java.util.ArrayDeque<okio.ByteString> r2 = r12.f25825i     // Catch:{ all -> 0x00f3 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00f3 }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x00f3 }
            r3 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque<java.lang.Object> r4 = r12.f25826j     // Catch:{ all -> 0x00f3 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x00f3 }
            boolean r5 = r4 instanceof com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9490b     // Catch:{ all -> 0x00f3 }
            if (r5 == 0) goto L_0x0046
            int r5 = r12.f25835s     // Catch:{ all -> 0x00f3 }
            java.lang.String r6 = r12.f25836t     // Catch:{ all -> 0x00f3 }
            r7 = -1
            if (r5 == r7) goto L_0x0031
            okhttp3.internal.i.a$e r7 = r12.f25831o     // Catch:{ all -> 0x00f3 }
            r12.f25831o = r3     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.ScheduledExecutorService r3 = r12.f25830n     // Catch:{ all -> 0x00f3 }
            r3.shutdown()     // Catch:{ all -> 0x00f3 }
            r3 = r7
            goto L_0x004f
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r7 = r12.f25830n     // Catch:{ all -> 0x00f3 }
            com.bytedance.common.wschannel.channel.a.a.b.a$a r8 = new com.bytedance.common.wschannel.channel.a.a.b.a$a     // Catch:{ all -> 0x00f3 }
            r8.<init>()     // Catch:{ all -> 0x00f3 }
            r9 = r4
            com.bytedance.common.wschannel.channel.a.a.b.a$b r9 = (com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9490b) r9     // Catch:{ all -> 0x00f3 }
            long r9 = r9.f25848c     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f3 }
            java.util.concurrent.ScheduledFuture r7 = r7.schedule(r8, r9, r11)     // Catch:{ all -> 0x00f3 }
            r12.f25834r = r7     // Catch:{ all -> 0x00f3 }
            goto L_0x004f
        L_0x0046:
            if (r4 != 0) goto L_0x004a
            monitor-exit(r12)     // Catch:{ all -> 0x00f3 }
            return r1
        L_0x004a:
            r6 = r3
            goto L_0x004e
        L_0x004c:
            r4 = r3
            r6 = r4
        L_0x004e:
            r5 = 0
        L_0x004f:
            monitor-exit(r12)     // Catch:{ all -> 0x00f3 }
            r7 = 1
            if (r2 == 0) goto L_0x005d
            r1 = 10
            r0.mo17222a(r1, r2)     // Catch:{ all -> 0x005a }
            goto L_0x00e1
        L_0x005a:
            r0 = move-exception
            goto L_0x00ef
        L_0x005d:
            boolean r2 = r4 instanceof com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9491c     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x00a9
            r2 = r4
            com.bytedance.common.wschannel.channel.a.a.b.a$c r2 = (com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9491c) r2     // Catch:{ all -> 0x005a }
            okio.ByteString r2 = r2.f25850b     // Catch:{ all -> 0x005a }
            com.bytedance.common.wschannel.channel.a.a.b.a$c r4 = (com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9491c) r4     // Catch:{ all -> 0x005a }
            int r4 = r4.f25849a     // Catch:{ all -> 0x005a }
            int r5 = r2.size()     // Catch:{ all -> 0x005a }
            long r5 = (long) r5     // Catch:{ all -> 0x005a }
            boolean r8 = r0.f25872h     // Catch:{ all -> 0x005a }
            if (r8 != 0) goto L_0x00a1
            r0.f25872h = r7     // Catch:{ all -> 0x005a }
            com.bytedance.common.wschannel.channel.a.a.b.f$a r8 = r0.f25871g     // Catch:{ all -> 0x005a }
            r8.f25875a = r4     // Catch:{ all -> 0x005a }
            com.bytedance.common.wschannel.channel.a.a.b.f$a r4 = r0.f25871g     // Catch:{ all -> 0x005a }
            r4.f25876b = r5     // Catch:{ all -> 0x005a }
            com.bytedance.common.wschannel.channel.a.a.b.f$a r4 = r0.f25871g     // Catch:{ all -> 0x005a }
            r4.f25877c = r7     // Catch:{ all -> 0x005a }
            com.bytedance.common.wschannel.channel.a.a.b.f$a r4 = r0.f25871g     // Catch:{ all -> 0x005a }
            r4.f25878d = r1     // Catch:{ all -> 0x005a }
            com.bytedance.common.wschannel.channel.a.a.b.f$a r0 = r0.f25871g     // Catch:{ all -> 0x005a }
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch:{ all -> 0x005a }
            r0.write(r2)     // Catch:{ all -> 0x005a }
            r0.close()     // Catch:{ all -> 0x005a }
            monitor-enter(r12)     // Catch:{ all -> 0x005a }
            long r0 = r12.f25832p     // Catch:{ all -> 0x009e }
            int r2 = r2.size()     // Catch:{ all -> 0x009e }
            long r4 = (long) r2     // Catch:{ all -> 0x009e }
            long r0 = r0 - r4
            r12.f25832p = r0     // Catch:{ all -> 0x009e }
            monitor-exit(r12)     // Catch:{ all -> 0x009e }
            goto L_0x00e1
        L_0x009e:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "Another message writer is active. Did you call close()?"
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x00a9:
            boolean r1 = r4 instanceof com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9490b     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x00e9
            com.bytedance.common.wschannel.channel.a.a.b.a$b r4 = (com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.C9490b) r4     // Catch:{ all -> 0x005a }
            int r1 = r4.f25846a     // Catch:{ all -> 0x005a }
            okio.ByteString r2 = r4.f25847b     // Catch:{ all -> 0x005a }
            okio.ByteString r4 = okio.ByteString.EMPTY     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x00b9
            if (r2 == 0) goto L_0x00cf
        L_0x00b9:
            if (r1 == 0) goto L_0x00be
            com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9495d.m18844b(r1)     // Catch:{ all -> 0x005a }
        L_0x00be:
            okio.Buffer r4 = new okio.Buffer     // Catch:{ all -> 0x005a }
            r4.<init>()     // Catch:{ all -> 0x005a }
            r4.writeShort(r1)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x00cb
            r4.write(r2)     // Catch:{ all -> 0x005a }
        L_0x00cb:
            okio.ByteString r4 = r4.readByteString()     // Catch:{ all -> 0x005a }
        L_0x00cf:
            r1 = 8
            r0.mo17222a(r1, r4)     // Catch:{ all -> 0x00e5 }
            r0.f25869e = r7     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x00e1
            com.bytedance.common.wschannel.channel.a.a.b.c r0 = r12.f25819a     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x00e1
            com.bytedance.common.wschannel.channel.a.a.b.c r0 = r12.f25819a     // Catch:{ all -> 0x005a }
            r0.mo17180b(r12, r5, r6)     // Catch:{ all -> 0x005a }
        L_0x00e1:
            okhttp3.internal.C53559c.m113805a(r3)
            return r7
        L_0x00e5:
            r1 = move-exception
            r0.f25869e = r7     // Catch:{ all -> 0x005a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x00e9:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x005a }
            r0.<init>()     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x00ef:
            okhttp3.internal.C53559c.m113805a(r3)
            throw r0
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00f3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.mo17208d():boolean");
    }

    /* renamed from: a */
    public final void mo17198a(String str) throws IOException {
        if (this.f25819a != null) {
            this.f25819a.mo17176a((C9493b) this, str);
        }
    }

    /* renamed from: d */
    public final boolean mo17209d(ByteString byteString) {
        if (byteString != null) {
            return m18815a(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* renamed from: a */
    public final void mo17200a(ByteString byteString) throws IOException {
        if (this.f25819a != null) {
            this.f25819a.mo17179a((C9493b) this, byteString);
        }
    }

    /* renamed from: b */
    public final boolean mo17204b(String str) {
        if (str != null) {
            return m18815a(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    /* renamed from: c */
    public final synchronized void mo17207c(ByteString byteString) {
        this.f25840x++;
        this.f25841y = false;
        if (this.f25819a != null) {
            this.f25819a.mo17181b(this, byteString);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17202b(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f25837u     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f25833q     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f25826j     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.f25825i     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.m18816f()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f25839w     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f25839w = r2     // Catch:{ all -> 0x0024 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.mo17202b(okio.ByteString):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        mo17197a((java.lang.Exception) new java.net.SocketTimeoutException("sent ping but didn't receive pong"), (okhttp3.C53504ad) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if (r0 == null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r0.mo17222a(9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        mo17197a((java.lang.Exception) r6, (okhttp3.C53504ad) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17211e(okio.ByteString r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f25837u     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            com.bytedance.common.wschannel.channel.a.a.b.f r0 = r5.f25829m     // Catch:{ all -> 0x0036 }
            boolean r1 = r5.f25841y     // Catch:{ all -> 0x0036 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r5.f25838v     // Catch:{ all -> 0x0036 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r5.f25838v     // Catch:{ all -> 0x0036 }
            r4 = 1
            int r3 = r3 + r4
            r5.f25838v = r3     // Catch:{ all -> 0x0036 }
            r5.f25841y = r4     // Catch:{ all -> 0x0036 }
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            r3 = 0
            if (r1 == r2) goto L_0x0029
            java.net.SocketTimeoutException r6 = new java.net.SocketTimeoutException
            java.lang.String r0 = "sent ping but didn't receive pong"
            r6.<init>(r0)
            r5.mo17197a(r6, r3)
            return
        L_0x0029:
            if (r0 == 0) goto L_0x0035
            r1 = 9
            r0.mo17222a(r1, r6)     // Catch:{ IOException -> 0x0031 }
            return
        L_0x0031:
            r6 = move-exception
            r5.mo17197a(r6, r3)
        L_0x0035:
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.mo17211e(okio.ByteString):void");
    }

    /* renamed from: b */
    public final boolean mo17203b(int i, String str) {
        return m18814a(i, str, 60000);
    }

    /* renamed from: c */
    public final void mo17206c(int i, String str) {
        this.f25819a = null;
        try {
            mo17203b(1000, str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.wschannel.channel.a.a.b.c.a(com.bytedance.common.wschannel.channel.a.a.b.b, java.lang.Throwable, okhttp3.ad):null, types can be incorrect */
    /* JADX INFO: used method not loaded: okhttp3.internal.c.a(java.io.Closeable):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r3.f25819a == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r3.f25819a.mo17177a((com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9493b) r3, (java.lang.Throwable) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        okhttp3.internal.C53559c.m113805a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17197a(java.lang.Exception r4, okhttp3.C53504ad r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f25837u     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0007:
            r0 = 1
            r3.f25837u = r0     // Catch:{ all -> 0x0035 }
            okhttp3.internal.i.a$e r0 = r3.f25831o     // Catch:{ all -> 0x0035 }
            r1 = 0
            r3.f25831o = r1     // Catch:{ all -> 0x0035 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f25834r     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f25834r     // Catch:{ all -> 0x0035 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0035 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f25830n     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.f25830n     // Catch:{ all -> 0x0035 }
            r1.shutdown()     // Catch:{ all -> 0x0035 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            com.bytedance.common.wschannel.channel.a.a.b.c r1 = r3.f25819a     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002c
            com.bytedance.common.wschannel.channel.a.a.b.c r1 = r3.f25819a     // Catch:{ all -> 0x0030 }
            r1.mo17177a(r3, r4, r5)     // Catch:{ all -> 0x0030 }
        L_0x002c:
            okhttp3.internal.C53559c.m113805a(r0)
            return
        L_0x0030:
            r4 = move-exception
            okhttp3.internal.C53559c.m113805a(r0)
            throw r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.mo17197a(java.lang.Exception, okhttp3.ad):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m18815a(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f25837u     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f25833q     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f25832p     // Catch:{ all -> 0x003e }
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
            long r0 = r6.f25832p     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f25832p = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f25826j     // Catch:{ all -> 0x003e }
            com.bytedance.common.wschannel.channel.a.a.b.a$c r1 = new com.bytedance.common.wschannel.channel.a.a.b.a$c     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.m18816f()     // Catch:{ all -> 0x003e }
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.p530a.p531a.p533b.C9486a.m18815a(okio.ByteString, int):boolean");
    }

    /* renamed from: a */
    public final void mo17196a(int i, String str) {
        Closeable closeable;
        if (i != -1) {
            synchronized (this) {
                if (this.f25835s == -1) {
                    this.f25835s = i;
                    this.f25836t = str;
                    if (!this.f25833q || !this.f25826j.isEmpty()) {
                        closeable = null;
                    } else {
                        closeable = this.f25831o;
                        this.f25831o = null;
                        if (this.f25834r != null) {
                            this.f25834r.cancel(false);
                        }
                        this.f25830n.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                if (this.f25819a != null) {
                    this.f25819a.mo17175a((C9493b) this, i, str);
                    if (closeable != null) {
                        this.f25819a.mo17180b(this, i, str);
                    }
                }
            } finally {
                C53559c.m113805a(closeable);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final void mo17199a(String str, C53647e eVar) throws IOException {
        synchronized (this) {
            this.f25831o = eVar;
            this.f25829m = new C9498f(eVar.f133044c, eVar.f133046e, this.f25823g);
            this.f25830n = new ScheduledThreadPoolExecutor(1, C53559c.m113803a(str, false));
            if (!this.f25826j.isEmpty()) {
                m18816f();
            }
        }
        C9496e eVar2 = new C9496e(eVar.f133044c, eVar.f133045d, this, this.f25827k);
        this.f25828l = eVar2;
    }

    /* renamed from: a */
    private synchronized boolean m18814a(int i, String str, long j) {
        C9495d.m18844b(i);
        ByteString byteString = null;
        if (str != null) {
            byteString = ByteString.encodeUtf8(str);
            if (((long) byteString.size()) > 123) {
                StringBuilder sb = new StringBuilder("reason.size() > 123: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!this.f25837u) {
            if (!this.f25833q) {
                this.f25833q = true;
                this.f25826j.add(new C9490b(i, byteString, 60000));
                m18816f();
                return true;
            }
        }
        return false;
    }

    public C9486a(C53498ab abVar, long j, C9494c cVar, Random random) {
        if ("GET".equals(abVar.f132379b)) {
            this.f25820b = abVar;
            this.f25819a = cVar;
            this.f25823g = random;
            this.f25827k = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f25821c = ByteString.m114277of(bArr).base64();
            this.f25824h = new Runnable() {
                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            C9486a.this.mo17197a((Exception) e, (C53504ad) null);
                            return;
                        }
                    } while (C9486a.this.mo17208d());
                }
            };
            return;
        }
        StringBuilder sb = new StringBuilder("Request must be GET: ");
        sb.append(abVar.f132379b);
        throw new IllegalArgumentException(sb.toString());
    }
}

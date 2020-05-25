package com.p683ss.android.message.p1186a.p1188b.p1189a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.util.Pair;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9388b;
import com.p683ss.android.message.C19481h;
import com.p683ss.android.message.p1186a.p1187a.C19409a;
import com.p683ss.android.message.p1186a.p1187a.C19410b;
import com.p683ss.android.message.p1186a.p1187a.C19412d;
import com.p683ss.android.message.p1186a.p1187a.C19412d.C19415a;
import com.p683ss.android.message.p1186a.p1188b.C19417a;
import com.p683ss.android.message.p1186a.p1188b.C19447b;
import com.p683ss.android.message.p1186a.p1188b.C19448c;
import com.p683ss.android.message.p1186a.p1188b.C19449d;
import com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19419a;
import com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19420b;
import com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19421c;
import com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19423e;
import com.p683ss.android.message.p1191b.C19457c;
import com.p683ss.android.message.p1191b.C19464g;
import com.p683ss.android.pushmanager.p1204a.C19659a;
import com.p683ss.android.pushmanager.p1204a.C19659a.C19661a;
import com.p683ss.android.pushmanager.p1204a.C19667d;
import com.p683ss.android.pushmanager.setting.C19710b;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.SocketFactory;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.a.b.a.e */
public final class C19428e implements C9382a, C19449d {

    /* renamed from: K */
    private static final Set<Integer> f53707K;

    /* renamed from: v */
    static final Object f53708v = new Object();

    /* renamed from: A */
    protected final AtomicBoolean f53709A;

    /* renamed from: B */
    protected final AtomicBoolean f53710B;

    /* renamed from: C */
    protected IOException f53711C;

    /* renamed from: D */
    protected int f53712D;

    /* renamed from: E */
    protected int f53713E;

    /* renamed from: F */
    protected int f53714F;

    /* renamed from: G */
    protected final int f53715G;

    /* renamed from: H */
    protected int f53716H;

    /* renamed from: I */
    protected int f53717I;

    /* renamed from: J */
    protected final C9381g f53718J;

    /* renamed from: L */
    private final Map<C19447b, Set<C19417a>> f53719L;

    /* renamed from: a */
    protected final SocketFactory f53720a;

    /* renamed from: b */
    protected final boolean f53721b = true;

    /* renamed from: c */
    protected Context f53722c;

    /* renamed from: d */
    protected C19667d f53723d;

    /* renamed from: e */
    protected C19412d f53724e;

    /* renamed from: f */
    protected C19438h f53725f;

    /* renamed from: g */
    protected List<C19438h> f53726g;

    /* renamed from: h */
    protected int f53727h;

    /* renamed from: i */
    protected int f53728i = -1;

    /* renamed from: j */
    protected Socket f53729j;

    /* renamed from: k */
    protected DataInputStream f53730k;

    /* renamed from: l */
    protected DataOutputStream f53731l;

    /* renamed from: m */
    protected AtomicInteger f53732m;

    /* renamed from: n */
    protected ExecutorService f53733n;

    /* renamed from: o */
    protected Future<?> f53734o;

    /* renamed from: p */
    protected Future<?> f53735p;

    /* renamed from: q */
    protected Future<?> f53736q;

    /* renamed from: r */
    protected Runnable f53737r;

    /* renamed from: s */
    protected Runnable f53738s;

    /* renamed from: t */
    protected final C19431b f53739t;

    /* renamed from: u */
    protected Selector f53740u;

    /* renamed from: w */
    public volatile C19447b f53741w;

    /* renamed from: x */
    protected final Map<Integer, C19427d> f53742x;

    /* renamed from: y */
    protected final BlockingQueue<C19427d> f53743y;

    /* renamed from: z */
    protected final AtomicLong f53744z;

    /* renamed from: com.ss.android.message.a.b.a.e$a */
    class C19430a implements Runnable {
        public final void run() {
            if (C19428e.this.f53741w == C19447b.HANDSSHAKEING || C19428e.this.f53741w == C19447b.REGISTERING) {
                C19428e.this.mo40541a("Server Connection Exception", true);
                C19428e.this.f53738s = null;
            }
        }

        private C19430a() {
        }
    }

    /* renamed from: com.ss.android.message.a.b.a.e$b */
    class C19431b {

        /* renamed from: b */
        private long f53747b;

        /* renamed from: c */
        private PendingIntent f53748c;

        /* renamed from: b */
        public final void mo40555b() {
            if (!(C19428e.this.f53722c == null || this.f53748c == null)) {
                try {
                    ((AlarmManager) C19428e.this.f53722c.getSystemService("alarm")).cancel(this.f53748c);
                } catch (Throwable unused) {
                }
                this.f53748c = null;
            }
        }

        /* renamed from: a */
        public final void mo40553a() {
            if (C19428e.this.f53722c != null && !C19428e.this.mo40547f()) {
                mo40555b();
                C19428e.this.f53718J.removeMessages(4);
                this.f53748c = PendingIntent.getService(C19428e.this.f53722c, 0, C19481h.m47694c(C19428e.this.f53722c), 0);
                AlarmManager alarmManager = (AlarmManager) C19428e.this.f53722c.getSystemService("alarm");
                try {
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                } catch (Exception unused) {
                }
                boolean a = C19710b.m48173a().f54262b.mo41082a("is_close_alarm_wakeup", false);
                long currentTimeMillis = this.f53747b + System.currentTimeMillis();
                try {
                    C19457c.f53778a.mo40593a(alarmManager, a ? 1 : 0, currentTimeMillis, this.f53748c);
                } catch (Throwable unused2) {
                }
                C19428e.this.f53718J.sendEmptyMessageDelayed(4, this.f53747b);
            }
        }

        /* renamed from: a */
        public final synchronized void mo40554a(long j) {
            this.f53747b = j;
        }

        public C19431b(long j) {
            this.f53747b = j;
        }
    }

    /* renamed from: com.ss.android.message.a.b.a.e$c */
    class C19432c implements Runnable {
        public final void run() {
            if (C19428e.this.f53741w == C19447b.SOCKET_DISCONNECTED && C19436f.m47580a(C19428e.this.f53722c)) {
                C19428e.this.mo40535a();
            }
            C19428e.this.f53737r = null;
        }

        private C19432c() {
        }
    }

    /* renamed from: com.ss.android.message.a.b.a.e$d */
    class C19433d implements Runnable {
        public final void run() {
            Thread.currentThread().setName("SocketConnectionThread");
            try {
                if (!C19428e.this.mo40547f()) {
                    if (C19428e.this.f53741w == C19447b.SOCKET_CONNECTING) {
                        C19464g.m47634a();
                        return;
                    }
                    Context context = C19428e.this.f53722c;
                    if (C19464g.f53789a == null) {
                        C19464g.f53789a = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "PostPushService");
                        if (C19464g.f53789a != null) {
                            C19464g.f53789a.acquire();
                        }
                    }
                    C19428e.this.mo40539a(C19447b.SOCKET_CONNECTING);
                    C19428e.this.f53709A.compareAndSet(true, false);
                    C19428e.this.f53732m.getAndSet(0);
                    if (C19428e.this.f53726g == null || C19428e.this.f53726g.isEmpty()) {
                        if (C19428e.this.f53726g == null) {
                            C19428e.this.f53726g = new ArrayList();
                        }
                        List<InetSocketAddress> i = C19428e.this.mo40550i();
                        if (i == null || i.isEmpty()) {
                            throw new IOException("push server list is null");
                        }
                        for (InetSocketAddress hVar : i) {
                            C19428e.this.f53726g.add(new C19438h(hVar, 60000));
                        }
                        C19428e.this.mo40549h();
                    }
                    C19410b.m47510a(C19428e.this.f53722c, "setupConnect");
                    C19428e.this.mo40551j();
                    C19464g.m47634a();
                }
            } catch (IOException e) {
                C19428e.this.mo40541a(e.getMessage(), true);
            } catch (InterruptedException e2) {
                C19428e.this.mo40541a(e2.getMessage(), true);
            } catch (Exception e3) {
                C19428e.this.mo40541a(e3.getMessage(), true);
            } finally {
                C19464g.m47634a();
            }
        }

        private C19433d() {
        }
    }

    /* renamed from: com.ss.android.message.a.b.a.e$e */
    class C19434e implements Runnable {
        /* JADX WARNING: Removed duplicated region for block: B:74:0x011e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x012a A[SYNTHETIC, Splitter:B:79:0x012a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r1 = "SocketReadThread"
                r0.setName(r1)
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.net.Socket r0 = r0.f53729j
                if (r0 != 0) goto L_0x0010
                return
            L_0x0010:
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.net.Socket r0 = r0.f53729j
                java.nio.channels.SocketChannel r0 = r0.getChannel()
                r1 = 1
                if (r0 != 0) goto L_0x0052
            L_0x001b:
                boolean r0 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x0039 }
                if (r0 != 0) goto L_0x0038
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x0039 }
                boolean r0 = r0.mo40546e()     // Catch:{ Exception -> 0x0039 }
                if (r0 == 0) goto L_0x0038
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x0039 }
                boolean r0 = r0.mo40547f()     // Catch:{ Exception -> 0x0039 }
                if (r0 == 0) goto L_0x0032
                return
            L_0x0032:
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x0039 }
                r0.mo40548g()     // Catch:{ Exception -> 0x0039 }
                goto L_0x001b
            L_0x0038:
                return
            L_0x0039:
                r0 = move-exception
                com.ss.android.message.a.b.a.e r2 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unexpected exception receiving call responses e = "
                r3.<init>(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.mo40541a(r0, r1)
                return
            L_0x0052:
                com.ss.android.message.a.b.a.e r2 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                r3 = 0
                r2.f53740u = r3
                java.nio.channels.spi.SelectorProvider r2 = r0.provider()     // Catch:{ Exception -> 0x00eb }
                com.ss.android.message.a.b.a.e r4 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x00eb }
                java.nio.channels.spi.AbstractSelector r2 = r2.openSelector()     // Catch:{ Exception -> 0x00eb }
                r4.f53740u = r2     // Catch:{ Exception -> 0x00eb }
                com.ss.android.message.a.b.a.e r2 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x00eb }
                java.nio.channels.Selector r2 = r2.f53740u     // Catch:{ Exception -> 0x00eb }
                java.nio.channels.SelectionKey r2 = r0.register(r2, r1)     // Catch:{ Exception -> 0x00eb }
            L_0x006b:
                if (r0 == 0) goto L_0x00cd
                boolean r3 = r0.isOpen()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r3 == 0) goto L_0x00cd
                boolean r3 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r3 == 0) goto L_0x007e
                boolean r0 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                goto L_0x00cd
            L_0x007e:
                com.ss.android.message.a.b.a.e r3 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.nio.channels.Selector r3 = r3.f53740u     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                r3.select()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                com.ss.android.message.a.b.a.e r3 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.nio.channels.Selector r3 = r3.f53740u     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.util.Set r3 = r3.selectedKeys()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            L_0x0091:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r4 == 0) goto L_0x006b
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.nio.channels.SelectionKey r4 = (java.nio.channels.SelectionKey) r4     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                r3.remove()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                boolean r4 = r4.isReadable()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r4 == 0) goto L_0x0091
                com.ss.android.message.a.b.a.e r4 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                boolean r4 = r4.mo40547f()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r4 == 0) goto L_0x00c2
                if (r2 == 0) goto L_0x00b3
                r2.cancel()
            L_0x00b3:
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.nio.channels.Selector r0 = r0.f53740u
                if (r0 == 0) goto L_0x00c1
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ IOException -> 0x00c1 }
                java.nio.channels.Selector r0 = r0.f53740u     // Catch:{ IOException -> 0x00c1 }
                r0.close()     // Catch:{ IOException -> 0x00c1 }
                return
            L_0x00c1:
                return
            L_0x00c2:
                com.ss.android.message.a.b.a.e r4 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                r4.mo40548g()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                goto L_0x0091
            L_0x00c8:
                r0 = move-exception
                goto L_0x011f
            L_0x00ca:
                r0 = move-exception
                r3 = r2
                goto L_0x00ec
            L_0x00cd:
                if (r2 == 0) goto L_0x00d2
                r2.cancel()
            L_0x00d2:
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.nio.channels.Selector r0 = r0.f53740u
                if (r0 == 0) goto L_0x00e1
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ IOException -> 0x00e0 }
                java.nio.channels.Selector r0 = r0.f53740u     // Catch:{ IOException -> 0x00e0 }
                r0.close()     // Catch:{ IOException -> 0x00e0 }
                goto L_0x00e1
            L_0x00e0:
            L_0x00e1:
                boolean r0 = com.bytedance.common.utility.C9415i.m18635b()
                if (r0 == 0) goto L_0x011e
                return
            L_0x00e8:
                r0 = move-exception
                r2 = r3
                goto L_0x011f
            L_0x00eb:
                r0 = move-exception
            L_0x00ec:
                com.ss.android.message.a.b.a.e r2 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ all -> 0x00e8 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
                java.lang.String r5 = "Unexpected exception receiving call responses e = "
                r4.<init>(r5)     // Catch:{ all -> 0x00e8 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e8 }
                r4.append(r0)     // Catch:{ all -> 0x00e8 }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00e8 }
                r2.mo40541a(r0, r1)     // Catch:{ all -> 0x00e8 }
                if (r3 == 0) goto L_0x0108
                r3.cancel()
            L_0x0108:
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.nio.channels.Selector r0 = r0.f53740u
                if (r0 == 0) goto L_0x0117
                com.ss.android.message.a.b.a.e r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ IOException -> 0x0116 }
                java.nio.channels.Selector r0 = r0.f53740u     // Catch:{ IOException -> 0x0116 }
                r0.close()     // Catch:{ IOException -> 0x0116 }
                goto L_0x0117
            L_0x0116:
            L_0x0117:
                boolean r0 = com.bytedance.common.utility.C9415i.m18635b()
                if (r0 == 0) goto L_0x011e
                return
            L_0x011e:
                return
            L_0x011f:
                if (r2 == 0) goto L_0x0124
                r2.cancel()
            L_0x0124:
                com.ss.android.message.a.b.a.e r1 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this
                java.nio.channels.Selector r1 = r1.f53740u
                if (r1 == 0) goto L_0x0131
                com.ss.android.message.a.b.a.e r1 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.this     // Catch:{ IOException -> 0x0131 }
                java.nio.channels.Selector r1 = r1.f53740u     // Catch:{ IOException -> 0x0131 }
                r1.close()     // Catch:{ IOException -> 0x0131 }
            L_0x0131:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.C19434e.run():void");
        }

        private C19434e() {
        }
    }

    /* renamed from: com.ss.android.message.a.b.a.e$f */
    class C19435f implements Runnable {
        public final void run() {
            Thread.currentThread().setName("SocketWriteThread");
            while (!Thread.interrupted() && C19428e.this.mo40546e() && !C19428e.this.mo40547f()) {
                try {
                    C19428e.this.mo40538a((C19427d) C19428e.this.f53743y.take());
                } catch (InterruptedException e) {
                    C19428e eVar = C19428e.this;
                    StringBuilder sb = new StringBuilder("Unexpected Thread Interrupted exception receiving call responses e = ");
                    sb.append(e.getMessage());
                    eVar.mo40541a(sb.toString(), true);
                    return;
                } catch (Exception e2) {
                    C19428e eVar2 = C19428e.this;
                    StringBuilder sb2 = new StringBuilder("Unexpected exception receiving call responses e = ");
                    sb2.append(e2.getMessage());
                    eVar2.mo40541a(sb2.toString(), true);
                    return;
                }
            }
        }

        private C19435f() {
        }
    }

    /* renamed from: a */
    public final void mo40538a(C19427d dVar) throws Exception {
        if (!mo40547f() && !this.f53709A.get()) {
            C19440j jVar = new C19440j();
            try {
                if (dVar.f53698b == 0) {
                    jVar.write(C19464g.m47638a(dVar.f53698b, 1));
                } else {
                    jVar.write(C19464g.m47638a(dVar.f53698b, 1));
                    jVar.write(C19464g.m47638a(dVar.f53697a, 3));
                    int length = dVar.f53701e == null ? 0 : dVar.f53701e.length;
                    jVar.write(C19464g.m47638a(length, 4));
                    if (length > 0) {
                        jVar.write(dVar.f53701e);
                    }
                }
                byte[] a = jVar.f53757a.mo40562a();
                int b = jVar.f53757a.mo40563b();
                synchronized (this.f53731l) {
                    this.f53731l.write(a, 0, b);
                    this.f53731l.flush();
                }
                m47547a((Closeable) jVar);
            } catch (IOException e) {
                mo40541a(e.getMessage(), true);
                throw e;
            } catch (Exception e2) {
                try {
                    StringBuilder sb = new StringBuilder("Unexpected exception receiving call responses e = ");
                    sb.append(e2.getMessage());
                    mo40541a(sb.toString(), true);
                    throw e2;
                } catch (Throwable th) {
                    m47547a((Closeable) jVar);
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40541a(String str, boolean z) {
        Message obtainMessage = this.f53718J.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("close_io_exception", str);
        bundle.putBoolean("close_retry", z);
        obtainMessage.setData(bundle);
        obtainMessage.what = 3;
        this.f53718J.sendMessage(obtainMessage);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f53725f.f53753a != null) {
                jSONObject.put("address", this.f53725f.f53753a.toString());
            }
            jSONObject.put("exception", str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final synchronized void mo40539a(C19447b bVar) {
        try {
            C19448c cVar = new C19448c(this.f53741w, bVar);
            this.f53741w = bVar;
            HashSet<C19417a> hashSet = new HashSet<>();
            hashSet.addAll((Collection) this.f53719L.get(C19447b.ALL));
            hashSet.addAll((Collection) this.f53719L.get(bVar));
            for (C19417a a : hashSet) {
                a.mo40516a(cVar);
            }
        } catch (IllegalArgumentException unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: l */
    private void m47553l() {
        m47546a(0);
    }

    /* renamed from: p */
    private void m47557p() {
        if (this.f53738s != null) {
            this.f53718J.removeCallbacks(this.f53738s);
            this.f53738s = null;
        }
    }

    /* renamed from: q */
    private void m47558q() {
        if (this.f53737r != null) {
            this.f53718J.removeCallbacks(this.f53737r);
            this.f53737r = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo40542b() {
        mo40541a("client close", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo40546e() {
        if (!this.f53709A.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private synchronized ExecutorService m47552k() {
        if (this.f53733n == null) {
            new C9388b("PushConnection");
            this.f53733n = C24076h.m58902c();
        }
        return this.f53733n;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m47554m() {
        /*
            r1 = this;
            java.net.Socket r0 = r1.f53729j
            if (r0 == 0) goto L_0x001a
            java.net.Socket r0 = r1.f53729j     // Catch:{ Exception -> 0x0015 }
            java.nio.channels.SocketChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x0015
            java.net.Socket r0 = r1.f53729j     // Catch:{ Exception -> 0x0015 }
            java.nio.channels.SocketChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0015 }
            r0.close()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            java.net.Socket r0 = r1.f53729j     // Catch:{ Throwable -> 0x001a }
            r0.close()     // Catch:{ Throwable -> 0x001a }
        L_0x001a:
            r0 = 0
            r1.f53729j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.m47554m():void");
    }

    /* renamed from: o */
    private void m47556o() {
        m47557p();
        this.f53738s = new C19430a();
        this.f53718J.postDelayed(this.f53738s, 300000);
    }

    /* renamed from: r */
    private void m47559r() {
        m47549b((long) (this.f53717I * 60 * 1000));
        this.f53717I <<= 1;
        if (this.f53717I > this.f53716H) {
            this.f53717I = this.f53716H;
        }
    }

    /* renamed from: f */
    public final boolean mo40547f() {
        if (C19710b.m48173a().mo41102k()) {
            return false;
        }
        mo40541a("Push Service Is Not Allow", false);
        return true;
    }

    static {
        HashSet hashSet = new HashSet();
        f53707K = hashSet;
        hashSet.add(Integer.valueOf(0));
        f53707K.add(Integer.valueOf(1));
        f53707K.add(Integer.valueOf(3));
    }

    /* renamed from: h */
    public final void mo40549h() {
        if (!mo40547f() && this.f53726g != null && !this.f53726g.isEmpty()) {
            int size = this.f53726g.size();
            double random = Math.random();
            double d = (double) size;
            Double.isNaN(d);
            this.f53727h = (int) (random * d);
            this.f53728i = -1;
            this.f53725f = m47555n();
        }
    }

    /* renamed from: n */
    private C19438h m47555n() {
        if (mo40547f() || this.f53726g == null || this.f53726g.isEmpty()) {
            return null;
        }
        int size = this.f53726g.size();
        this.f53728i++;
        int i = (this.f53727h + this.f53728i) % size;
        if (this.f53728i != size) {
            return (C19438h) this.f53726g.get(i);
        }
        if (this.f53726g != null && !this.f53726g.isEmpty()) {
            this.f53726g.clear();
        }
        m47559r();
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40535a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = r3.f53722c     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            boolean r0 = r3.mo40547f()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r3)
            return
        L_0x000f:
            com.ss.android.message.a.b.b r0 = r3.f53741w     // Catch:{ all -> 0x0033 }
            com.ss.android.message.a.b.b r1 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_DISCONNECTED     // Catch:{ all -> 0x0033 }
            if (r0 != r1) goto L_0x0031
            java.util.concurrent.Future<?> r0 = r3.f53734o     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0021
            java.util.concurrent.Future<?> r0 = r3.f53734o     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
        L_0x0021:
            java.util.concurrent.ExecutorService r0 = r3.m47552k()     // Catch:{ all -> 0x0033 }
            com.ss.android.message.a.b.a.e$d r1 = new com.ss.android.message.a.b.a.e$d     // Catch:{ all -> 0x0033 }
            r2 = 0
            r1.<init>()     // Catch:{ all -> 0x0033 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ all -> 0x0033 }
            r3.f53734o = r0     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r3)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.mo40535a():void");
    }

    /* renamed from: c */
    public final void mo40544c() throws IOException {
        if (!mo40547f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f53744z.get() >= ((long) this.f53712D) && this.f53741w.getStateValue() >= C19447b.SOCKET_CONNECTED.getStateValue() && this.f53741w.getStateValue() < C19447b.SOCKET_DISCONNECTING.getStateValue()) {
                this.f53744z.set(currentTimeMillis);
                this.f53718J.removeMessages(4);
                C19410b.m47510a(this.f53722c, "sendHeartBeat");
                C19427d dVar = new C19427d();
                dVar.f53698b = 0;
                dVar.f53697a = 0;
                m47550b(dVar);
                this.f53739t.mo40553a();
            }
        }
    }

    /* renamed from: d */
    public final C19447b mo40545d() {
        boolean z;
        if ((this.f53735p == null || this.f53735p.isDone() || this.f53736q == null || this.f53736q.isDone()) && this.f53741w.getStateValue() >= C19447b.SOCKET_CONNECTED.getStateValue() && this.f53741w.getStateValue() <= C19447b.REGISTERED.getStateValue()) {
            mo40542b();
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return this.f53741w;
        }
        return C19447b.SOCKET_DISCONNECTED;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e A[Catch:{ IOException | Exception | JSONException -> 0x00ec }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f A[Catch:{ IOException | Exception | JSONException -> 0x00ec }] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.net.InetSocketAddress> mo40550i() {
        /*
            r8 = this;
            boolean r0 = r8.mo40547f()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.content.Context r0 = r8.f53722c
            boolean r0 = com.p683ss.android.message.p1186a.p1188b.p1189a.C19437g.m47581a(r0)
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            android.content.Context r0 = r8.f53722c     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r2 = "get serverAddrsString"
            com.p683ss.android.message.p1186a.p1187a.C19410b.m47510a(r0, r2)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            com.ss.android.pushmanager.a.d r0 = com.p683ss.android.pushmanager.p1204a.C19667d.m48045a()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.util.Map r0 = r0.mo41019c()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            com.ss.android.pushmanager.c r2 = com.p683ss.android.pushmanager.C19700f.f54218i     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r2 == 0) goto L_0x003e
            com.ss.android.pushmanager.c r2 = com.p683ss.android.pushmanager.C19700f.f54218i     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r2 = r2.mo41023b()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r2 == 0) goto L_0x0031
            goto L_0x003e
        L_0x0031:
            com.ss.android.pushmanager.c r2 = com.p683ss.android.pushmanager.C19700f.f54218i     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r2 = r2.mo41023b()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r3 = "/push/get_service_addrs/"
            java.lang.String r2 = com.p683ss.android.pushmanager.C19700f.m48125a(r2, r3)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            goto L_0x0040
        L_0x003e:
            java.lang.String r2 = com.p683ss.android.pushmanager.C19700f.f54212c     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
        L_0x0040:
            java.lang.String r0 = com.p683ss.android.message.p1191b.C19470k.m47653a(r2, r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            com.bytedance.common.utility.k r2 = com.bytedance.common.utility.C9423k.m18637a()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r0 = r2.mo17060a(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r0 != 0) goto L_0x004f
            return r1
        L_0x004f:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r2.<init>(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            android.content.Context r0 = r8.f53722c     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r4 = "get getServerList"
            r3.<init>(r4)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r3.append(r2)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            com.p683ss.android.message.p1186a.p1187a.C19410b.m47510a(r0, r3)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r0 = "max_interval"
            int r0 = r2.optInt(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r0 <= 0) goto L_0x0071
            r8.f53716H = r0     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
        L_0x0071:
            java.lang.String r0 = "addrs"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r0 == 0) goto L_0x00b7
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r2.<init>(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r0 = 0
            r3 = r1
            r1 = 0
        L_0x0081:
            int r4 = r2.length()     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            if (r1 >= r4) goto L_0x00b5
            java.lang.String r4 = r2.optString(r1)     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            if (r4 == 0) goto L_0x00b2
            java.lang.String r5 = ":"
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            if (r4 == 0) goto L_0x00b2
            int r5 = r4.length     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r6 = 2
            if (r5 != r6) goto L_0x00b2
            if (r3 != 0) goto L_0x00a1
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r5.<init>()     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r3 = r5
        L_0x00a1:
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r6 = r4[r0]     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r7 = 1
            r4 = r4[r7]     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r5.<init>(r6, r4)     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
            r3.add(r5)     // Catch:{ IOException | Exception | JSONException -> 0x00b5 }
        L_0x00b2:
            int r1 = r1 + 1
            goto L_0x0081
        L_0x00b5:
            r1 = r3
            goto L_0x00ec
        L_0x00b7:
            java.lang.String r0 = "err_no"
            java.lang.String r0 = r2.optString(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r3 = "err_msg"
            java.lang.String r2 = r2.optString(r3)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r3 != 0) goto L_0x00ec
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            if (r3 == 0) goto L_0x00d0
            goto L_0x00ec
        L_0x00d0:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r5 = "get server list err : err_no = "
            r4.<init>(r5)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r4.append(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r0 = " err_msg = "
            r4.append(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r4.append(r2)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            r3.<init>(r0)     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
            throw r3     // Catch:{ IOException | Exception | JSONException -> 0x00ec }
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.mo40550i():java.util.List");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r3 == -1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        if (r10.f53725f == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (r10.f53725f.f53754b <= 0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        m47546a((long) r10.f53725f.f53754b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        throw new java.io.IOException("Push Server Has Close Connection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0117, code lost:
        if (r10.f53725f.f53754b > 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013e, code lost:
        if (r10.f53725f.f53754b > 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014a, code lost:
        if (r10.f53725f.f53754b > 0) goto L_0x00ce;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40548g() throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r10.mo40547f()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f53709A
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            r0 = 8
            r1 = 1
            byte[] r2 = new byte[r0]     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0015:
            java.io.DataInputStream r3 = r10.f53730k     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4 = 0
            int r3 = r3.read(r2, r4, r0)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 <= 0) goto L_0x00c1
            byte[] r3 = com.p683ss.android.message.p1191b.C19464g.m47639a(r2, r4, r1)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r3 = com.p683ss.android.message.p1191b.C19464g.m47631a(r3)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4 = 3
            byte[] r4 = com.p683ss.android.message.p1191b.C19464g.m47639a(r2, r1, r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r4 = com.p683ss.android.message.p1191b.C19464g.m47631a(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r5 = 4
            byte[] r5 = com.p683ss.android.message.p1191b.C19464g.m47639a(r2, r5, r5)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r5 = com.p683ss.android.message.p1191b.C19464g.m47631a(r5)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r6 = 16
            if (r3 != r6) goto L_0x0053
            com.ss.android.message.a.b.a.d r7 = new com.ss.android.message.a.b.a.d     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.<init>()     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53697a = r4     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53698b = r6     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            com.ss.android.message.a.b.a.a.c r4 = new com.ss.android.message.a.b.a.a.c     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4.<init>()     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53706j = r4     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53704h = r8     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            goto L_0x0065
        L_0x0053:
            java.util.Map<java.lang.Integer, com.ss.android.message.a.b.a.d> r6 = r10.f53742x     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.Object r4 = r6.remove(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7 = r4
            com.ss.android.message.a.b.a.d r7 = (com.p683ss.android.message.p1186a.p1188b.p1189a.C19427d) r7     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r7 == 0) goto L_0x00ae
            com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0065:
            r7.f53699c = r3     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53700d = r5     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r7 == 0) goto L_0x0076
            byte[] r3 = new byte[r5]     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53702f = r3     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.io.DataInputStream r3 = r10.f53730k     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            byte[] r4 = r7.f53702f     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r3.read(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0076:
            byte[] r3 = r7.f53702f     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x0085
            com.ss.android.message.a.b.a.a.d r3 = r7.f53706j     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x0085
            com.ss.android.message.a.b.a.a.d r3 = r7.f53706j     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            byte[] r4 = r7.f53702f     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r3.mo40517a(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0085:
            java.util.Set<java.lang.Integer> r3 = f53707K     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r4 = r7.f53698b     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            boolean r3 = r3.contains(r4)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x00a0
            com.bytedance.common.utility.b.g r3 = r10.f53718J     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            android.os.Message r3 = r3.obtainMessage(r1, r7)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            com.bytedance.common.utility.b.g r4 = r10.f53718J     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4.sendMessage(r3)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            goto L_0x0015
        L_0x00a0:
            com.bytedance.common.utility.b.g r3 = r10.f53718J     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4 = 2
            android.os.Message r3 = r3.obtainMessage(r4, r7)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            com.bytedance.common.utility.b.g r4 = r10.f53718J     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4.sendMessage(r3)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            goto L_0x0015
        L_0x00ae:
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            if (r0 == 0) goto L_0x00c0
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            if (r0 <= 0) goto L_0x00c0
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            long r0 = (long) r0
            r10.m47546a(r0)
        L_0x00c0:
            return
        L_0x00c1:
            r0 = -1
            if (r3 == r0) goto L_0x00d7
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            if (r0 <= 0) goto L_0x014d
        L_0x00ce:
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            long r0 = (long) r0
            r10.m47546a(r0)
            return
        L_0x00d7:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.String r2 = "Push Server Has Close Connection"
            r0.<init>(r2)     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            throw r0     // Catch:{ c -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x00df:
            r0 = move-exception
            goto L_0x0122
        L_0x00e1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "Unexpected exception receiving call responses e = "
            r2.<init>(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r10.mo40541a(r2, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00f8:
            r0 = move-exception
            boolean r2 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x011a
            com.ss.android.message.a.b.a.h r2 = r10.f53725f     // Catch:{ all -> 0x00df }
            int r2 = r2.f53754b     // Catch:{ all -> 0x00df }
            if (r2 <= 0) goto L_0x011a
            r10.f53711C = r0     // Catch:{ all -> 0x00df }
            boolean r1 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00df }
        L_0x010f:
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            if (r0 <= 0) goto L_0x014d
            goto L_0x00ce
        L_0x011a:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00df }
            r10.mo40541a(r2, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x0122:
            com.ss.android.message.a.b.a.h r1 = r10.f53725f
            if (r1 == 0) goto L_0x0134
            com.ss.android.message.a.b.a.h r1 = r10.f53725f
            int r1 = r1.f53754b
            if (r1 <= 0) goto L_0x0134
            com.ss.android.message.a.b.a.h r1 = r10.f53725f
            int r1 = r1.f53754b
            long r1 = (long) r1
            r10.m47546a(r1)
        L_0x0134:
            throw r0
        L_0x0135:
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            if (r0 <= 0) goto L_0x014d
            goto L_0x00ce
        L_0x0141:
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.a.b.a.h r0 = r10.f53725f
            int r0 = r0.f53754b
            if (r0 <= 0) goto L_0x014d
            goto L_0x00ce
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.mo40548g():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo40551j() throws IOException, InterruptedException {
        InputStream inputStream;
        OutputStream outputStream;
        double d;
        if (this.f53729j == null && !this.f53709A.get() && !mo40547f()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    break;
                } catch (SocketTimeoutException e) {
                    short s = (short) (i + 1);
                    m47545a(i, 0, e);
                    i = s;
                } catch (IOException e2) {
                    short s2 = (short) (i2 + 1);
                    m47545a(i2, 0, e2);
                    i2 = s2;
                } catch (Exception unused) {
                    short s3 = (short) (i2 + 1);
                    m47545a(i2, 0, new IOException("unknown exception"));
                    i2 = s3;
                }
            }
            if (!mo40547f()) {
                if (this.f53710B.get()) {
                    this.f53729j = this.f53720a.createSocket();
                } else {
                    SocketChannel open = SocketChannel.open();
                    open.configureBlocking(false);
                    this.f53729j = open.socket();
                }
                this.f53729j.setTcpNoDelay(false);
                this.f53729j.setKeepAlive(true);
                Socket socket = this.f53729j;
                InetSocketAddress inetSocketAddress = this.f53725f.f53753a;
                int i3 = this.f53714F;
                if (!mo40547f()) {
                    if (socket == null || inetSocketAddress == null || i3 < 0) {
                        throw new IllegalArgumentException("Illegal argument for connect()");
                    }
                    SocketChannel channel = socket.getChannel();
                    if (channel == null) {
                        socket.connect(inetSocketAddress, i3);
                    } else {
                        C19442k.m47587a(channel, inetSocketAddress, (long) i3);
                    }
                    if (socket.getLocalPort() == socket.getPort()) {
                        if (socket.getLocalAddress().equals(socket.getInetAddress())) {
                            m47554m();
                            throw new ConnectException("Localhost targeted connection resulted in a loopback. No daemon is listening on the target port.");
                        }
                    }
                }
                mo40539a(C19447b.SOCKET_CONNECTED);
                this.f53729j.setSoTimeout(this.f53713E);
                this.f53717I = 1;
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (this.f53725f.f53753a != null) {
                        jSONObject.put("address", this.f53725f.f53753a.toString());
                    }
                } catch (Throwable unused2) {
                }
            }
            if (!mo40547f()) {
                Socket socket2 = this.f53729j;
                this.f53729j.getSoTimeout();
                if (socket2.getChannel() == null) {
                    inputStream = socket2.getInputStream();
                } else {
                    inputStream = new C19443l(socket2);
                }
                this.f53730k = new DataInputStream(new C19425b(inputStream));
                Socket socket3 = this.f53729j;
                if (socket3.getChannel() == null) {
                    outputStream = socket3.getOutputStream();
                } else {
                    outputStream = new C19445m(socket3);
                }
                this.f53731l = new DataOutputStream(new C19426c(outputStream));
                Pair pair = null;
                if (this.f53735p == null || this.f53735p.isDone()) {
                    this.f53735p = m47552k().submit(new C19434e());
                }
                if (this.f53736q == null || this.f53736q.isDone()) {
                    this.f53736q = m47552k().submit(new C19435f());
                }
                if (!mo40547f()) {
                    C19412d dVar = this.f53724e;
                    Context context = this.f53722c;
                    if (context != null && C19710b.m48173a().mo41102k() && dVar.f53661b != null && dVar.f53661b.mo40545d() == C19447b.SOCKET_CONNECTED) {
                        C19409a aVar = (C19409a) dVar.f53660a.get(Long.valueOf(dVar.f53662e));
                        if (aVar != null) {
                            try {
                                C19420b bVar = new C19420b();
                                bVar.f53670a = 1;
                                bVar.f53671b = (byte) C9425l.m18652c(context).getValue();
                                String a = aVar.mo40503a();
                                String b = aVar.mo40505b();
                                long d2 = aVar.mo40507d();
                                long c = aVar.mo40506c();
                                if (!C9431p.m18664a(a) && 0 != d2) {
                                    if (0 != c) {
                                        bVar.f53672c = Long.parseLong(b);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(a);
                                        sb.append("_");
                                        sb.append(d2);
                                        bVar.f53676g = sb.toString();
                                        bVar.f53673d = c;
                                        try {
                                            pair = C19710b.m48173a().mo41096e();
                                        } catch (Exception unused3) {
                                        }
                                        double d3 = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                                        if (pair == null) {
                                            d = 0.0d;
                                        } else {
                                            d = ((Double) pair.first).doubleValue();
                                        }
                                        bVar.f53674e = d;
                                        if (pair != null) {
                                            d3 = ((Double) pair.second).doubleValue();
                                        }
                                        bVar.f53675f = d3;
                                        dVar.f53661b.mo40536a(bVar);
                                    }
                                }
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m47547a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static C19427d m47544a(Message message) {
        if (message == null || message.obj == null) {
            return null;
        }
        return (C19427d) message.obj;
    }

    /* renamed from: b */
    private void m47549b(long j) {
        m47558q();
        this.f53737r = new C19432c();
        this.f53718J.postDelayed(this.f53737r, j);
    }

    /* renamed from: b */
    private boolean m47550b(C19427d dVar) {
        if (mo40547f() || this.f53709A.get() || dVar == null) {
            return false;
        }
        this.f53743y.add(dVar);
        if (f53707K.contains(Integer.valueOf(dVar.f53698b))) {
            this.f53742x.put(Integer.valueOf(dVar.f53697a), dVar);
        }
        return true;
    }

    /* renamed from: c */
    private void m47551c(C19427d dVar) {
        if (!mo40547f() && dVar != null) {
            C19410b.m47510a(this.f53722c, "handle TYPE_ERROR");
            C19419a aVar = (C19419a) dVar.f53706j;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("err_no : ");
                sb.append(aVar.f53668a);
                sb.append(" err_msg : ");
                sb.append(aVar.f53669b);
                dVar.f53705i = new IOException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private void m47546a(long j) {
        Iterator it = this.f53743y.iterator();
        while (it.hasNext()) {
            C19427d dVar = (C19427d) it.next();
            long currentTimeMillis = System.currentTimeMillis() - dVar.f53703g;
            if (currentTimeMillis >= j) {
                if (this.f53711C == null) {
                    StringBuilder sb = new StringBuilder("Packet id=");
                    sb.append(dVar.f53697a);
                    sb.append(", waitTime=");
                    sb.append(currentTimeMillis);
                    sb.append(", rpcTimetout=");
                    sb.append(j);
                    this.f53711C = new IOException(sb.toString());
                }
                dVar.f53705i = this.f53711C;
                synchronized (dVar) {
                    dVar.notifyAll();
                }
                it.remove();
                this.f53742x.remove(Integer.valueOf(dVar.f53697a));
            }
        }
        try {
            if (!this.f53743y.isEmpty()) {
                C19427d dVar2 = (C19427d) this.f53743y.peek();
                if (dVar2 != null) {
                    long currentTimeMillis2 = System.currentTimeMillis() - dVar2.f53703g;
                    if (currentTimeMillis2 < j) {
                        j -= currentTimeMillis2;
                    }
                }
            }
            if (!this.f53709A.get()) {
                this.f53711C = null;
                if (this.f53729j != null) {
                    this.f53729j.setSoTimeout((int) j);
                }
            }
        } catch (SocketException unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(38:9|10|(27:12|(1:14)|16|(1:20)|21|(4:25|26|27|(1:31))|32|33|(1:35)|36|(1:40)|41|(1:43)|44|(1:46)|47|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|(1:67)|68)|15|16|18|20|21|23|25|26|27|29|31|32|33|(0)|36|38|40|41|(0)|44|(0)|47|49|51|52|(0)|55|(0)|58|(0)|61|(0)|65|67|68) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c7 A[Catch:{ Exception -> 0x00d8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m47548a(boolean r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f53709A
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.message.a.b.b r0 = r2.f53741w
            com.ss.android.message.a.b.b r1 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_DISCONNECTED
            if (r0 != r1) goto L_0x0018
            if (r3 != 0) goto L_0x0014
            r2.m47558q()
        L_0x0014:
            r2.m47557p()
            return
        L_0x0018:
            java.io.IOException r0 = r2.f53711C     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x002d
            java.util.Map<java.lang.Integer, com.ss.android.message.a.b.a.d> r0 = r2.f53742x     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0030
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r1 = "Unexpected closed connection"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d8 }
            r2.f53711C = r0     // Catch:{ Exception -> 0x00d8 }
        L_0x002d:
            r2.m47553l()     // Catch:{ Exception -> 0x00d8 }
        L_0x0030:
            java.util.concurrent.Future<?> r0 = r2.f53734o     // Catch:{ Exception -> 0x00d8 }
            r1 = 1
            if (r0 == 0) goto L_0x0042
            java.util.concurrent.Future<?> r0 = r2.f53734o     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0042
            java.util.concurrent.Future<?> r0 = r2.f53734o     // Catch:{ Exception -> 0x00d8 }
            r0.cancel(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x0042:
            java.util.concurrent.Future<?> r0 = r2.f53735p     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0064
            java.util.concurrent.Future<?> r0 = r2.f53735p     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0064
            java.util.concurrent.Future<?> r0 = r2.f53735p     // Catch:{ Exception -> 0x00d8 }
            r0.cancel(r1)     // Catch:{ Exception -> 0x00d8 }
            java.nio.channels.Selector r0 = r2.f53740u     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            java.nio.channels.Selector r0 = r2.f53740u     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r0.isOpen()     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            java.nio.channels.Selector r0 = r2.f53740u     // Catch:{ Exception -> 0x0064 }
            r0.wakeup()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r2.m47557p()     // Catch:{ Exception -> 0x00d8 }
            if (r3 != 0) goto L_0x006c
            r2.m47558q()     // Catch:{ Exception -> 0x00d8 }
        L_0x006c:
            java.util.concurrent.Future<?> r0 = r2.f53736q     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x007d
            java.util.concurrent.Future<?> r0 = r2.f53736q     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x007d
            java.util.concurrent.Future<?> r0 = r2.f53736q     // Catch:{ Exception -> 0x00d8 }
            r0.cancel(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x007d:
            com.ss.android.message.a.b.a.e$b r0 = r2.f53739t     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0086
            com.ss.android.message.a.b.a.e$b r0 = r2.f53739t     // Catch:{ Exception -> 0x00d8 }
            r0.mo40555b()     // Catch:{ Exception -> 0x00d8 }
        L_0x0086:
            com.bytedance.common.utility.b.g r0 = r2.f53718J     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0090
            com.bytedance.common.utility.b.g r0 = r2.f53718J     // Catch:{ Exception -> 0x00d8 }
            r1 = 4
            r0.removeMessages(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x0090:
            java.util.concurrent.ExecutorService r0 = r2.f53733n     // Catch:{ Exception -> 0x00d8 }
            r1 = 0
            if (r0 == 0) goto L_0x00a4
            java.util.concurrent.ExecutorService r0 = r2.f53733n     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isShutdown()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x00a4
            java.util.concurrent.ExecutorService r0 = r2.f53733n     // Catch:{ Exception -> 0x00d8 }
            r0.shutdown()     // Catch:{ Exception -> 0x00d8 }
            r2.f53733n = r1     // Catch:{ Exception -> 0x00d8 }
        L_0x00a4:
            java.io.DataInputStream r0 = r2.f53730k     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00af
            java.io.DataInputStream r0 = r2.f53730k     // Catch:{ Exception -> 0x00d8 }
            m47547a(r0)     // Catch:{ Exception -> 0x00d8 }
            r2.f53730k = r1     // Catch:{ Exception -> 0x00d8 }
        L_0x00af:
            java.io.DataOutputStream r0 = r2.f53731l     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00ba
            java.io.DataOutputStream r0 = r2.f53731l     // Catch:{ Exception -> 0x00d8 }
            m47547a(r0)     // Catch:{ Exception -> 0x00d8 }
            r2.f53731l = r1     // Catch:{ Exception -> 0x00d8 }
        L_0x00ba:
            java.net.Socket r0 = r2.f53729j     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00c1
            r2.m47554m()     // Catch:{ Exception -> 0x00d8 }
        L_0x00c1:
            com.ss.android.message.a.b.b r0 = r2.f53741w     // Catch:{ Exception -> 0x00d8 }
            com.ss.android.message.a.b.b r1 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_DISCONNECTED     // Catch:{ Exception -> 0x00d8 }
            if (r0 == r1) goto L_0x00cc
            com.ss.android.message.a.b.b r0 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_DISCONNECTED     // Catch:{ Exception -> 0x00d8 }
            r2.mo40539a(r0)     // Catch:{ Exception -> 0x00d8 }
        L_0x00cc:
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r2.mo40547f()     // Catch:{ Exception -> 0x00d8 }
            if (r3 != 0) goto L_0x00d7
            r2.m47559r()     // Catch:{ Exception -> 0x00d8 }
        L_0x00d7:
            return
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.m47548a(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40536a(com.p683ss.android.message.p1186a.p1188b.p1189a.p1190a.C19420b r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mo40547f()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            com.ss.android.message.a.b.b r0 = r2.f53741w     // Catch:{ all -> 0x003b }
            com.ss.android.message.a.b.b r1 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_CONNECTED     // Catch:{ all -> 0x003b }
            if (r0 != r1) goto L_0x0039
            android.content.Context r0 = r2.f53722c     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "sendHandShake"
            com.p683ss.android.message.p1186a.p1187a.C19410b.m47510a(r0, r1)     // Catch:{ all -> 0x003b }
            com.ss.android.message.a.b.b r0 = com.p683ss.android.message.p1186a.p1188b.C19447b.HANDSSHAKEING     // Catch:{ all -> 0x003b }
            r2.mo40539a(r0)     // Catch:{ all -> 0x003b }
            com.ss.android.message.a.b.a.d r0 = new com.ss.android.message.a.b.a.d     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.concurrent.atomic.AtomicInteger r1 = r2.f53732m     // Catch:{ all -> 0x003b }
            int r1 = r1.incrementAndGet()     // Catch:{ all -> 0x003b }
            r0.f53697a = r1     // Catch:{ all -> 0x003b }
            r1 = 1
            r0.f53698b = r1     // Catch:{ all -> 0x003b }
            byte[] r1 = r3.mo40518a()     // Catch:{ all -> 0x003b }
            r0.f53701e = r1     // Catch:{ all -> 0x003b }
            r0.f53706j = r3     // Catch:{ all -> 0x003b }
            r2.m47550b(r0)     // Catch:{ all -> 0x003b }
            r2.m47556o()     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r2)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.p1186a.p1188b.p1189a.C19428e.mo40536a(com.ss.android.message.a.b.a.a.b):void");
    }

    public final void handleMsg(Message message) {
        boolean z;
        if (message != null) {
            if (message.what == 3 || !mo40547f()) {
                switch (message.what) {
                    case 1:
                        C19427d a = m47544a(message);
                        if (!mo40547f() && a != null) {
                            int i = a.f53698b;
                            if (i == 3) {
                                C19410b.m47510a(this.f53722c, "handle TYPE_REGISTER");
                                if (!mo40547f() && a != null) {
                                    switch (a.f53699c) {
                                        case 254:
                                            C19410b.m47510a(this.f53722c, "handle TYPE_OK");
                                            mo40539a(C19447b.REGISTERED);
                                            m47557p();
                                            if (this.f53738s != null) {
                                                this.f53718J.removeCallbacks(this.f53738s);
                                                this.f53738s = null;
                                                break;
                                            }
                                            break;
                                        case NormalGiftView.ALPHA_255 /*255*/:
                                            m47551c(a);
                                            break;
                                    }
                                }
                            } else {
                                switch (i) {
                                    case 0:
                                        C19410b.m47510a(this.f53722c, "handle TYPE_HEART_BEAT");
                                        if (!mo40547f() && a != null) {
                                            int i2 = a.f53699c;
                                            if (i2 != 0) {
                                                if (i2 == 255) {
                                                    m47551c(a);
                                                    break;
                                                }
                                            } else if (C9415i.m18635b()) {
                                                return;
                                            }
                                        }
                                        break;
                                    case 1:
                                        C19410b.m47510a(this.f53722c, "handle TYPE_HAND_SHAKE");
                                        if (!mo40547f() && a != null) {
                                            int i3 = a.f53699c;
                                            if (i3 != 2) {
                                                if (i3 == 255) {
                                                    C19410b.m47510a(this.f53722c, "handle TYPE_ERROR");
                                                    m47551c(a);
                                                    break;
                                                }
                                            } else {
                                                C19410b.m47510a(this.f53722c, "handle TYPE_HAND_SHAKE_REPLY");
                                                mo40539a(C19447b.HANDSSHAKEED);
                                                m47557p();
                                                this.f53724e.mo40514a(this.f53722c, (C19415a) null);
                                                if (a.f53706j != null) {
                                                    C19420b bVar = (C19420b) a.f53706j;
                                                    if (bVar.f53677h != -1) {
                                                        this.f53739t.mo40554a((long) (bVar.f53677h * 1000));
                                                    }
                                                }
                                                this.f53739t.mo40553a();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        }
                        return;
                    case 2:
                        C19427d a2 = m47544a(message);
                        if (!mo40547f() && a2 != null) {
                            C19410b.m47510a(this.f53722c, "handleMessageEvent");
                            C19421c cVar = (C19421c) a2.f53706j;
                            long j = cVar.f53680c;
                            long j2 = a2.f53704h;
                            if (mo40547f()) {
                                z = false;
                            } else {
                                C19659a aVar = C19439i.m47582a().f53756a;
                                aVar.getClass();
                                C19661a aVar2 = new C19661a();
                                aVar2.f54161a = Long.valueOf(j);
                                aVar2.f54162b = j2;
                                z = C19439i.m47582a().f53756a.mo41000a(aVar2);
                                C19439i a3 = C19439i.m47582a();
                                a3.f53756a.mo41002c(aVar2);
                                C19710b a4 = C19710b.m48173a();
                                a4.f54262b.mo41080a().mo41074a("self_push_message_ids", a3.f53756a.mo40998a()).mo41076a();
                            }
                            if (z) {
                                C19410b.m47510a(this.f53722c, "handleMessageEvent");
                            } else {
                                this.f53724e.mo40512a((long) cVar.f53679b, cVar.f53681d);
                            }
                            a2.f53698b = 17;
                            a2.f53701e = cVar.mo40519a();
                            m47550b(a2);
                        }
                        return;
                    case 3:
                        if (message.getData() != null && !message.getData().isEmpty()) {
                            String string = message.getData().getString("close_io_exception");
                            boolean z2 = message.getData().getBoolean("close_retry", true);
                            Context context = this.f53722c;
                            StringBuilder sb = new StringBuilder("receive close event ioException : ");
                            sb.append(string);
                            sb.append(" isRetry : ");
                            sb.append(z2);
                            C19410b.m47510a(context, sb.toString());
                            IOException iOException = new IOException(string);
                            if (this.f53741w != C19447b.SOCKET_DISCONNECTED && this.f53741w.getStateValue() < C19447b.SOCKET_DISCONNECTING.getStateValue() && this.f53709A.compareAndSet(false, true)) {
                                mo40539a(C19447b.SOCKET_DISCONNECTING);
                                this.f53711C = iOException;
                            }
                            m47548a(z2);
                            return;
                        }
                        return;
                    case 4:
                        if (this.f53722c != null) {
                            try {
                                Intent c = C19481h.m47694c(this.f53722c);
                                Context context2 = this.f53722c;
                                if (context2 == null || !(context2 instanceof Context) || !C40895d.m90464a(context2, c)) {
                                    context2.startService(c);
                                }
                                return;
                            } catch (Exception unused) {
                                break;
                            }
                        } else {
                            return;
                        }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo40537a(C19423e eVar) {
        if (!mo40547f()) {
            if (this.f53741w == C19447b.HANDSSHAKEED || this.f53741w == C19447b.REGISTERED) {
                C19410b.m47510a(this.f53722c, "registerApps");
                mo40539a(C19447b.REGISTERING);
                C19427d dVar = new C19427d();
                dVar.f53697a = this.f53732m.incrementAndGet();
                dVar.f53698b = 3;
                dVar.f53701e = eVar.mo40520a();
                dVar.f53706j = eVar;
                m47550b(dVar);
                m47556o();
            }
        }
    }

    /* renamed from: a */
    public final void mo40540a(C19447b bVar, C19417a aVar) {
        ((Set) this.f53719L.get(bVar)).add(aVar);
    }

    /* renamed from: b */
    public final boolean mo40543b(C19447b bVar, C19417a aVar) {
        return ((Set) this.f53719L.get(bVar)).remove(aVar);
    }

    public C19428e(Context context, C19412d dVar) throws IOException {
        this.f53732m = new AtomicInteger(0);
        this.f53719L = new HashMap();
        this.f53741w = C19447b.SOCKET_DISCONNECTED;
        this.f53742x = new ConcurrentHashMap();
        this.f53743y = new LinkedBlockingQueue();
        this.f53744z = new AtomicLong();
        this.f53709A = new AtomicBoolean();
        this.f53710B = new AtomicBoolean(false);
        this.f53712D = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        this.f53713E = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        this.f53714F = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        this.f53715G = 0;
        this.f53716H = 60;
        this.f53717I = 1;
        this.f53718J = new C9381g(Looper.getMainLooper(), this);
        this.f53722c = context;
        this.f53723d = C19667d.m48045a();
        this.f53724e = dVar;
        this.f53720a = SocketFactory.getDefault();
        this.f53739t = new C19431b((long) this.f53712D);
        for (C19447b put : C19447b.values()) {
            this.f53719L.put(put, new HashSet());
        }
    }

    /* renamed from: a */
    private void m47545a(int i, int i2, IOException iOException) throws IOException {
        if (!mo40547f()) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f53725f.f53753a != null) {
                    jSONObject.put("address", this.f53725f.f53753a.toString());
                }
                jSONObject.put("exception", iOException.getMessage());
            } catch (Throwable unused) {
            }
            m47554m();
            if (i >= 0) {
                this.f53725f = m47555n();
                if (this.f53725f != null) {
                    mo40539a(C19447b.SOCKET_CONNECTING);
                } else {
                    throw iOException;
                }
            }
        }
    }
}

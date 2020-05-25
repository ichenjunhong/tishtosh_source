package leakcanary.internal;

import android.app.Application;
import android.app.NotificationManager;
import android.os.FileObserver;
import android.os.Handler;
import java.io.File;
import leakcanary.C53362a;
import leakcanary.C53362a.C53363a;
import leakcanary.C53365c;
import leakcanary.C53367d;
import leakcanary.C53369f.C53370a;
import leakcanary.C53372h;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;
import p2673h.C53173a;
import p2673h.C53173a.C53174a;

/* renamed from: leakcanary.internal.g */
public final class C53406g {

    /* renamed from: l */
    public static final C53407a f132079l = new C53407a(null);

    /* renamed from: a */
    public final long f132080a = 300000;

    /* renamed from: b */
    public volatile boolean f132081b;

    /* renamed from: c */
    public int f132082c;

    /* renamed from: d */
    public FileObserver f132083d;

    /* renamed from: e */
    public final C52670a<C52860x> f132084e = new C53413e(this);

    /* renamed from: f */
    volatile long f132085f = -1;

    /* renamed from: g */
    public final Application f132086g;

    /* renamed from: h */
    public final Handler f132087h;

    /* renamed from: i */
    public final C53372h f132088i;

    /* renamed from: j */
    public final C53365c f132089j;

    /* renamed from: k */
    public final C53418i f132090k;

    /* renamed from: m */
    private final C52670a<C52860x> f132091m = new C53414f(this);

    /* renamed from: n */
    private final C52670a<C53370a> f132092n;

    /* renamed from: leakcanary.internal.g$a */
    public static final class C53407a {
        private C53407a() {
        }

        public /* synthetic */ C53407a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: leakcanary.internal.g$b */
    public static final class C53408b extends FileObserver {

        /* renamed from: a */
        final /* synthetic */ C53406g f132093a;

        /* renamed from: b */
        final /* synthetic */ File f132094b;

        /* renamed from: c */
        final /* synthetic */ C52725c f132095c;

        /* renamed from: d */
        final /* synthetic */ C53419j f132096d;

        public final void onEvent(int i, String str) {
            if (i == 8) {
                if (this.f132094b == null) {
                    this.f132093a.mo111034a(this.f132095c.element);
                    return;
                }
                C53174a a = C53173a.m112969a();
                if (a != null) {
                    a.mo110681a("HeapAnalyzerService.runAnalysis");
                }
                C53367d.f132000b.mo110955a(this.f132093a.f132086g, this.f132094b);
                this.f132093a.mo111037b();
                stopWatching();
                this.f132096d.mo110978b();
            }
        }

        C53408b(C53406g gVar, File file, C52725c cVar, C53419j jVar, String str, int i) {
            this.f132093a = gVar;
            this.f132094b = file;
            this.f132095c = cVar;
            this.f132096d = jVar;
            super(str, 4095);
        }
    }

    /* renamed from: leakcanary.internal.g$c */
    static final class C53409c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53406g f132097a;

        /* renamed from: b */
        final /* synthetic */ boolean f132098b;

        C53409c(C53406g gVar, boolean z) {
            this.f132097a = gVar;
            this.f132098b = z;
        }

        /* JADX WARNING: type inference failed for: r2v25, types: [d.f.a.a<d.x>, d.f.a.a] */
        /* JADX WARNING: type inference failed for: r2v26 */
        /* JADX WARNING: type inference failed for: r3v10, types: [leakcanary.internal.h] */
        /* JADX WARNING: type inference failed for: r2v28 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r22 = this;
                r8 = r22
                leakcanary.internal.g r0 = r8.f132097a
                r0.mo111039d()
                leakcanary.internal.g r0 = r8.f132097a
                leakcanary.c r0 = r0.f132089j
                r0.mo110954a()
                leakcanary.internal.g r0 = r8.f132097a
                leakcanary.h r0 = r0.f132088i
                int r4 = r0.mo110959a()
                r0 = 0
                if (r4 != 0) goto L_0x00af
                boolean r1 = r8.f132098b
                if (r1 != 0) goto L_0x00af
                h.a$a r1 = p2673h.C53173a.m112969a()
                if (r1 != 0) goto L_0x0024
                goto L_0x0029
            L_0x0024:
                java.lang.String r2 = "No retained objects after GC"
                r1.mo110681a(r2)
            L_0x0029:
                android.app.Notification$Builder r1 = new android.app.Notification$Builder
                leakcanary.internal.g r2 = r8.f132097a
                android.app.Application r2 = r2.f132086g
                android.content.Context r2 = (android.content.Context) r2
                r1.<init>(r2)
                java.lang.String r2 = "All retained objects were garbage collected"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                android.app.Notification$Builder r1 = r1.setContentTitle(r2)
                java.lang.String r2 = "Tap to dismiss"
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                android.app.Notification$Builder r1 = r1.setContentText(r2)
                r2 = 1
                android.app.Notification$Builder r1 = r1.setAutoCancel(r2)
                leakcanary.internal.g r2 = r8.f132097a
                android.app.Application r2 = r2.f132086g
                android.content.Context r2 = (android.content.Context) r2
                leakcanary.internal.NotificationReceiver$a r3 = leakcanary.internal.NotificationReceiver.C53393a.CANCEL_NOTIFICATION
                java.lang.String r4 = "context"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
                java.lang.String r4 = "action"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
                android.content.Intent r4 = new android.content.Intent
                java.lang.Class<leakcanary.internal.NotificationReceiver> r5 = leakcanary.internal.NotificationReceiver.class
                r4.<init>(r2, r5)
                java.lang.String r3 = r3.name()
                r4.setAction(r3)
                android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r2, r0, r4, r0)
                java.lang.String r3 = "PendingIntent.getBroadca…t, 0, broadcastIntent, 0)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                android.app.Notification$Builder r1 = r1.setContentIntent(r2)
                leakcanary.internal.g r2 = r8.f132097a
                android.app.Application r2 = r2.f132086g
                android.content.Context r2 = (android.content.Context) r2
                java.lang.String r3 = "builder"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
                leakcanary.internal.m r3 = leakcanary.internal.C53432m.LEAKCANARY_LOW
                android.app.Notification r1 = leakcanary.internal.C53433n.m113488a(r2, r1, r3)
                leakcanary.internal.g r2 = r8.f132097a
                android.app.NotificationManager r2 = r2.mo111033a()
                r3 = -1000111(0xfffffffffff0bd51, float:NaN)
                r2.notify(r3, r1)
                leakcanary.internal.g r1 = r8.f132097a
                android.os.Handler r1 = r1.f132087h
                leakcanary.internal.g r2 = r8.f132097a
                d.f.a.a<d.x> r2 = r2.f132084e
                if (r2 == 0) goto L_0x00a3
                leakcanary.internal.h r3 = new leakcanary.internal.h
                r3.<init>(r2)
                r2 = r3
            L_0x00a3:
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r3 = 30000(0x7530, double:1.4822E-319)
                r1.postDelayed(r2, r3)
                leakcanary.internal.g r1 = r8.f132097a
                r1.f132082c = r0
                return
            L_0x00af:
                long r9 = android.os.SystemClock.uptimeMillis()
                leakcanary.KeyedWeakReference.C53361a.m113428a(r9)
                h.a$a r1 = p2673h.C53173a.m112969a()
                if (r1 != 0) goto L_0x00bd
                goto L_0x00c2
            L_0x00bd:
                java.lang.String r2 = "Dumping the heap because user tapped notification"
                r1.mo110681a(r2)
            L_0x00c2:
                leakcanary.internal.g r1 = r8.f132097a
                leakcanary.internal.i r1 = r1.f132090k
                leakcanary.internal.j r11 = r1.dumpHeap()
                if (r11 != 0) goto L_0x00d9
                h.a$a r0 = p2673h.C53173a.m112969a()
                if (r0 != 0) goto L_0x00d3
                return
            L_0x00d3:
                java.lang.String r1 = "Failed to dump heap"
                r0.mo110681a(r1)
                return
            L_0x00d9:
                java.io.File r12 = r11.mo110977a()
                leakcanary.internal.g r13 = r8.f132097a
                leakcanary.internal.g$c$1 r14 = new leakcanary.internal.g$c$1
                java.lang.String r6 = r12.getAbsolutePath()
                r7 = 4095(0xfff, float:5.738E-42)
                r1 = r14
                r2 = r22
                r3 = r12
                r5 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7)
                android.os.FileObserver r14 = (android.os.FileObserver) r14
                r13.f132083d = r14
                r12.createNewFile()     // Catch:{ Exception -> 0x015d }
                boolean r1 = r12.exists()     // Catch:{ Exception -> 0x015d }
                if (r1 == 0) goto L_0x0127
                h.a$a r1 = p2673h.C53173a.m112969a()     // Catch:{ Exception -> 0x015d }
                if (r1 != 0) goto L_0x0103
                goto L_0x0118
            L_0x0103:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015d }
                java.lang.String r3 = "heapDumpFile exists:"
                r2.<init>(r3)     // Catch:{ Exception -> 0x015d }
                java.lang.String r3 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x015d }
                r2.append(r3)     // Catch:{ Exception -> 0x015d }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x015d }
                r1.mo110681a(r2)     // Catch:{ Exception -> 0x015d }
            L_0x0118:
                leakcanary.internal.g r1 = r8.f132097a     // Catch:{ Exception -> 0x015d }
                android.os.FileObserver r1 = r1.f132083d     // Catch:{ Exception -> 0x015d }
                if (r1 != 0) goto L_0x0123
                java.lang.String r2 = "fileObserver"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)     // Catch:{ Exception -> 0x015d }
            L_0x0123:
                r1.startWatching()     // Catch:{ Exception -> 0x015d }
                goto L_0x0133
            L_0x0127:
                h.a$a r1 = p2673h.C53173a.m112969a()     // Catch:{ Exception -> 0x015d }
                if (r1 != 0) goto L_0x012e
                goto L_0x0133
            L_0x012e:
                java.lang.String r2 = "heapDumpFile not exists"
                r1.mo110681a(r2)     // Catch:{ Exception -> 0x015d }
            L_0x0133:
                leakcanary.internal.g r1 = r8.f132097a     // Catch:{ Exception -> 0x015d }
                r1.f132082c = r0     // Catch:{ Exception -> 0x015d }
                leakcanary.internal.g r0 = r8.f132097a     // Catch:{ Exception -> 0x015d }
                leakcanary.h r0 = r0.f132088i     // Catch:{ Exception -> 0x015d }
                r0.mo110960a(r9)     // Catch:{ Exception -> 0x015d }
                leakcanary.a$a r13 = leakcanary.C53362a.m113429a()     // Catch:{ Exception -> 0x015d }
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r20 = 30
                r21 = 0
                leakcanary.a$a r0 = leakcanary.C53362a.C53363a.m113433a(r13, r14, r15, r16, r17, r18, r20, r21)     // Catch:{ Exception -> 0x015d }
                leakcanary.C53362a.m113430a(r0)     // Catch:{ Exception -> 0x015d }
                java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x015d }
                com.bytedance.crash.C9610j.m19134a(r0)     // Catch:{ Exception -> 0x015d }
                return
            L_0x015d:
                r0 = move-exception
                leakcanary.a$a r12 = leakcanary.C53362a.m113429a()
                r13 = 1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r19 = 30
                r20 = 0
                leakcanary.a$a r1 = leakcanary.C53362a.C53363a.m113433a(r12, r13, r14, r15, r16, r17, r19, r20)
                leakcanary.C53362a.m113430a(r1)
                h.a$a r1 = p2673h.C53173a.m112969a()
                if (r1 != 0) goto L_0x017b
                goto L_0x0182
            L_0x017b:
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                java.lang.String r2 = "Could not dump heap"
                r1.mo110682a(r0, r2)
            L_0x0182:
                r11.mo110978b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C53406g.C53409c.run():void");
        }
    }

    /* renamed from: leakcanary.internal.g$d */
    static final class C53412d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53406g f132104a;

        C53412d(C53406g gVar) {
            this.f132104a = gVar;
        }

        public final void run() {
            if (!C53367d.f131999a) {
                C53362a.m113430a(C53363a.m113433a(C53362a.m113429a(), true, false, false, false, 0, 30, null));
            } else {
                this.f132104a.mo111037b();
            }
        }
    }

    /* renamed from: leakcanary.internal.g$e */
    static final class C53413e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C53406g f132105a;

        C53413e(C53406g gVar) {
            this.f132105a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f132105a.mo111039d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: leakcanary.internal.g$f */
    static final class C53414f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C53406g f132106a;

        C53414f(C53406g gVar) {
            this.f132106a = gVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f132106a.mo111038c();
            return C52860x.f131107a;
        }
    }

    /* renamed from: leakcanary.internal.g$g */
    static final class C53415g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53406g f132107a;

        /* renamed from: b */
        final /* synthetic */ String f132108b;

        C53415g(C53406g gVar, String str) {
            this.f132107a = gVar;
            this.f132108b = str;
        }

        public final void run() {
            this.f132107a.f132081b = false;
            this.f132107a.mo111035a(this.f132108b);
        }
    }

    /* renamed from: leakcanary.internal.g$h */
    static final class C53416h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53406g f132109a;

        /* renamed from: b */
        final /* synthetic */ String f132110b;

        C53416h(C53406g gVar, String str) {
            this.f132109a = gVar;
            this.f132110b = str;
        }

        public final void run() {
            this.f132109a.f132081b = false;
            this.f132109a.mo111035a(this.f132110b);
        }
    }

    /* renamed from: b */
    public final void mo111037b() {
        this.f132087h.postDelayed(new C53412d(this), this.f132080a);
    }

    /* renamed from: a */
    public final NotificationManager mo111033a() {
        Object systemService = this.f132086g.getSystemService("notification");
        if (systemService != null) {
            return (NotificationManager) systemService;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [d.f.a.a<d.x>, d.f.a.a] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [leakcanary.internal.h] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111038c() {
        /*
            r3 = this;
            android.os.Handler r0 = r3.f132087h
            d.f.a.a<d.x> r1 = r3.f132091m
            if (r1 == 0) goto L_0x000c
            leakcanary.internal.h r2 = new leakcanary.internal.h
            r2.<init>(r1)
            r1 = r2
        L_0x000c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            android.app.NotificationManager r0 = r3.mo111033a()
            r1 = -101110101(0xfffffffff9f92eab, float:-1.6172856E35)
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C53406g.mo111038c():void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [d.f.a.a<d.x>, d.f.a.a] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v0, types: [leakcanary.internal.h] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111039d() {
        /*
            r3 = this;
            android.os.Handler r0 = r3.f132087h
            d.f.a.a<d.x> r1 = r3.f132084e
            if (r1 == 0) goto L_0x000c
            leakcanary.internal.h r2 = new leakcanary.internal.h
            r2.<init>(r1)
            r1 = r2
        L_0x000c:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            android.app.NotificationManager r0 = r3.mo111033a()
            r1 = -1000111(0xfffffffffff0bd51, float:NaN)
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C53406g.mo111039d():void");
    }

    /* renamed from: a */
    public final void mo111034a(int i) {
        C53174a a = C53173a.m112969a();
        if (a != null) {
            a.mo110681a("Failed to dump heap, will retry in 5000 ms");
        }
        mo111036a("failed to dump heap", 5000);
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [d.f.a.a<d.x>, d.f.a.a] */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r2v23, types: [leakcanary.internal.h] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ab, code lost:
        if (r2 != false) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111035a(java.lang.String r23) {
        /*
            r22 = this;
            r8 = r22
            d.f.a.a<leakcanary.f$a> r0 = r8.f132092n
            java.lang.Object r0 = r0.invoke()
            leakcanary.f$a r0 = (leakcanary.C53369f.C53370a) r0
            boolean r1 = r0.f132003a
            if (r1 != 0) goto L_0x001b
            h.a$a r0 = p2673h.C53173a.m112969a()
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            java.lang.String r1 = "No checking for retained object: LeakCanary.Config.dumpHeap is false"
            r0.mo110681a(r1)
            return
        L_0x001b:
            h.a$a r1 = p2673h.C53173a.m112969a()
            if (r1 != 0) goto L_0x0022
            goto L_0x0035
        L_0x0022:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Checking retained object because "
            r2.<init>(r3)
            r3 = r23
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo110681a(r2)
        L_0x0035:
            d.f.b.v$c r4 = new d.f.b.v$c
            r4.<init>()
            leakcanary.h r1 = r8.f132088i
            int r1 = r1.mo110959a()
            r4.element = r1
            int r1 = r4.element
            if (r1 <= 0) goto L_0x0053
            leakcanary.c r1 = r8.f132089j
            r1.mo110954a()
            leakcanary.h r1 = r8.f132088i
            int r1 = r1.mo110959a()
            r4.element = r1
        L_0x0053:
            int r1 = r4.element
            int r0 = r0.f132005c
            int r2 = r8.f132082c
            r9 = 0
            r3 = 1
            if (r2 == r1) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r8.f132082c = r1
            if (r1 != 0) goto L_0x0084
            h.a$a r0 = p2673h.C53173a.m112969a()
            if (r0 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            java.lang.String r1 = "No retained objects"
            r0.mo110681a(r1)
        L_0x0070:
            if (r2 == 0) goto L_0x00e5
            android.os.Handler r0 = r8.f132087h
            d.f.a.a<d.x> r1 = r8.f132091m
            if (r1 == 0) goto L_0x007e
            leakcanary.internal.h r2 = new leakcanary.internal.h
            r2.<init>(r1)
            r1 = r2
        L_0x007e:
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.removeCallbacks(r1)
            goto L_0x00e5
        L_0x0084:
            if (r1 >= r0) goto L_0x00e4
            long r5 = r8.f132085f
            r10 = -1
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0090
            r2 = 1
            goto L_0x0091
        L_0x0090:
            r2 = 0
        L_0x0091:
            if (r2 != 0) goto L_0x00ad
            long r5 = r8.f132085f
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x00aa
            long r10 = android.os.SystemClock.uptimeMillis()
            long r10 = r10 - r5
            leakcanary.a$a r2 = leakcanary.C53362a.m113429a()
            long r5 = r2.f131997e
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00aa
            r2 = 1
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            if (r2 == 0) goto L_0x00e4
        L_0x00ad:
            h.a$a r2 = p2673h.C53173a.m112969a()
            if (r2 != 0) goto L_0x00b4
            goto L_0x00cd
        L_0x00b4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Found "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = " retained objects, which is less than the visible threshold of "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r1 = r5.toString()
            r2.mo110681a(r1)
        L_0x00cd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "App visible, waiting until "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " retained objects"
            r1.append(r0)
            java.lang.String r0 = "Showing retained objects notification"
            r1 = 2000(0x7d0, double:9.88E-321)
            r8.mo111036a(r0, r1)
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            if (r3 == 0) goto L_0x00e8
            return
        L_0x00e8:
            h.a$a r0 = p2673h.C53173a.m112969a()
            if (r0 != 0) goto L_0x00ef
            goto L_0x0107
        L_0x00ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found "
            r1.<init>(r2)
            int r2 = r4.element
            r1.append(r2)
            java.lang.String r2 = " retained references, dumping the heap"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo110681a(r1)
        L_0x0107:
            long r10 = android.os.SystemClock.uptimeMillis()
            leakcanary.KeyedWeakReference.C53361a.m113428a(r10)
            r22.mo111038c()
            leakcanary.internal.i r0 = r8.f132090k
            leakcanary.internal.j r12 = r0.dumpHeap()
            if (r12 != 0) goto L_0x011f
            int r0 = r4.element
            r8.mo111034a(r0)
            return
        L_0x011f:
            h.a$a r0 = p2673h.C53173a.m112969a()
            if (r0 != 0) goto L_0x0126
            goto L_0x012b
        L_0x0126:
            java.lang.String r1 = "install FileObserver"
            r0.mo110681a(r1)
        L_0x012b:
            java.io.File r0 = r12.mo110977a()
            leakcanary.internal.g$b r13 = new leakcanary.internal.g$b
            java.lang.String r6 = r0.getAbsolutePath()
            r7 = 4095(0xfff, float:5.738E-42)
            r1 = r13
            r2 = r22
            r3 = r0
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            android.os.FileObserver r13 = (android.os.FileObserver) r13
            r8.f132083d = r13
            r0.createNewFile()     // Catch:{ Exception -> 0x01a7 }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x01a7 }
            if (r1 == 0) goto L_0x0175
            h.a$a r1 = p2673h.C53173a.m112969a()     // Catch:{ Exception -> 0x01a7 }
            if (r1 != 0) goto L_0x0153
            goto L_0x0168
        L_0x0153:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r3 = "heapDumpFile exists:"
            r2.<init>(r3)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01a7 }
            r2.append(r3)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x01a7 }
            r1.mo110681a(r2)     // Catch:{ Exception -> 0x01a7 }
        L_0x0168:
            android.os.FileObserver r1 = r8.f132083d     // Catch:{ Exception -> 0x01a7 }
            if (r1 != 0) goto L_0x0171
            java.lang.String r2 = "fileObserver"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)     // Catch:{ Exception -> 0x01a7 }
        L_0x0171:
            r1.startWatching()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0181
        L_0x0175:
            h.a$a r1 = p2673h.C53173a.m112969a()     // Catch:{ Exception -> 0x01a7 }
            if (r1 != 0) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            java.lang.String r2 = "heapDumpFile not exists"
            r1.mo110681a(r2)     // Catch:{ Exception -> 0x01a7 }
        L_0x0181:
            r8.f132082c = r9     // Catch:{ Exception -> 0x01a7 }
            leakcanary.h r1 = r8.f132088i     // Catch:{ Exception -> 0x01a7 }
            r1.mo110960a(r10)     // Catch:{ Exception -> 0x01a7 }
            leakcanary.a$a r13 = leakcanary.C53362a.m113429a()     // Catch:{ Exception -> 0x01a7 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 30
            r21 = 0
            leakcanary.a$a r1 = leakcanary.C53362a.C53363a.m113433a(r13, r14, r15, r16, r17, r18, r20, r21)     // Catch:{ Exception -> 0x01a7 }
            leakcanary.C53362a.m113430a(r1)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01a7 }
            com.bytedance.crash.C9610j.m19134a(r0)     // Catch:{ Exception -> 0x01a7 }
            return
        L_0x01a7:
            r0 = move-exception
            h.a$a r1 = p2673h.C53173a.m112969a()
            if (r1 != 0) goto L_0x01af
            goto L_0x01b6
        L_0x01af:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r2 = "Could not dump heap"
            r1.mo110682a(r0, r2)
        L_0x01b6:
            leakcanary.a$a r13 = leakcanary.C53362a.m113429a()
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 30
            r21 = 0
            leakcanary.a$a r0 = leakcanary.C53362a.C53363a.m113433a(r13, r14, r15, r16, r17, r18, r20, r21)
            leakcanary.C53362a.m113430a(r0)
            r12.mo110978b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: leakcanary.internal.C53406g.mo111035a(java.lang.String):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo111036a(String str, long j) {
        if (this.f132081b) {
            C53174a a = C53173a.m112969a();
            if (a != null) {
                StringBuilder sb = new StringBuilder("Already scheduled retained check, ignoring (");
                sb.append(str);
                sb.append(')');
                a.mo110681a(sb.toString());
                return;
            }
            return;
        }
        this.f132081b = true;
        this.f132087h.postDelayed(new C53416h(this, str), j);
    }

    public C53406g(Application application, Handler handler, C53372h hVar, C53365c cVar, C53418i iVar, C52670a<C53370a> aVar) {
        C52711k.m112240b(application, "application");
        C52711k.m112240b(handler, "backgroundHandler");
        C52711k.m112240b(hVar, "objectWatcher");
        C52711k.m112240b(cVar, "gcTrigger");
        C52711k.m112240b(iVar, "heapDumper");
        C52711k.m112240b(aVar, "configProvider");
        this.f132086g = application;
        this.f132087h = handler;
        this.f132088i = hVar;
        this.f132089j = cVar;
        this.f132090k = iVar;
        this.f132092n = aVar;
    }
}

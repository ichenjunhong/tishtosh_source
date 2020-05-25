package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Pair;

final class bmb implements Callback, brf, brh, bsm {

    /* renamed from: A */
    private int f42903A;

    /* renamed from: B */
    private bme f42904B;

    /* renamed from: C */
    private long f42905C;

    /* renamed from: D */
    private bmc f42906D;

    /* renamed from: E */
    private bmc f42907E;

    /* renamed from: F */
    private bmc f42908F;

    /* renamed from: G */
    private bmp f42909G;

    /* renamed from: a */
    final Handler f42910a;

    /* renamed from: b */
    boolean f42911b;

    /* renamed from: c */
    int f42912c;

    /* renamed from: d */
    private final bmm[] f42913d;

    /* renamed from: e */
    private final bmn[] f42914e;

    /* renamed from: f */
    private final bsl f42915f;

    /* renamed from: g */
    private final bmj f42916g;

    /* renamed from: h */
    private final btu f42917h;

    /* renamed from: i */
    private final HandlerThread f42918i;

    /* renamed from: j */
    private final Handler f42919j;

    /* renamed from: k */
    private final blu f42920k;

    /* renamed from: l */
    private final bms f42921l;

    /* renamed from: m */
    private final bmr f42922m;

    /* renamed from: n */
    private bmd f42923n;

    /* renamed from: o */
    private bml f42924o;

    /* renamed from: p */
    private bmm f42925p;

    /* renamed from: q */
    private btm f42926q;

    /* renamed from: r */
    private brg f42927r;

    /* renamed from: s */
    private bmm[] f42928s;

    /* renamed from: t */
    private boolean f42929t;

    /* renamed from: u */
    private boolean f42930u;

    /* renamed from: v */
    private boolean f42931v;

    /* renamed from: w */
    private int f42932w = 1;

    /* renamed from: x */
    private int f42933x;

    /* renamed from: y */
    private int f42934y;

    /* renamed from: z */
    private long f42935z;

    public bmb(bmm[] bmmArr, bsl bsl, bmj bmj, boolean z, int i, Handler handler, bmd bmd, blu blu) {
        this.f42913d = bmmArr;
        this.f42915f = bsl;
        this.f42916g = bmj;
        this.f42929t = z;
        this.f42919j = handler;
        this.f42923n = bmd;
        this.f42920k = blu;
        this.f42914e = new bmn[bmmArr.length];
        for (int i2 = 0; i2 < bmmArr.length; i2++) {
            bmmArr[i2].mo30341a(i2);
            this.f42914e[i2] = bmmArr[i2].mo30349b();
        }
        this.f42917h = new btu();
        this.f42928s = new bmm[0];
        this.f42921l = new bms();
        this.f42922m = new bmr();
        bsl.f43778a = this;
        this.f42924o = bml.f42970a;
        this.f42918i = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f42918i.start();
        this.f42910a = new Handler(this.f42918i.getLooper(), this);
    }

    /* renamed from: a */
    public final void mo30383a(bmp bmp, int i, long j) {
        this.f42910a.obtainMessage(3, new bme(bmp, i, j)).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|22|19|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0018, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30387a(com.google.android.gms.internal.ads.blx... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f42911b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            int r0 = r3.f42912c     // Catch:{ all -> 0x002a }
            int r1 = r0 + 1
            r3.f42912c = r1     // Catch:{ all -> 0x002a }
            android.os.Handler r1 = r3.f42910a     // Catch:{ all -> 0x002a }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x002a }
            r4.sendToTarget()     // Catch:{ all -> 0x002a }
        L_0x0018:
            int r4 = r3.f42934y     // Catch:{ all -> 0x002a }
            if (r4 > r0) goto L_0x0028
            r3.wait()     // Catch:{ InterruptedException -> 0x0020 }
            goto L_0x0018
        L_0x0020:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r4.interrupt()     // Catch:{ all -> 0x002a }
            goto L_0x0018
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmb.mo30387a(com.google.android.gms.internal.ads.blx[]):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo30382a() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f42911b     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f42910a     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f42911b     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f42918i     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmb.mo30382a():void");
    }

    /* renamed from: a */
    public final void mo30384a(bmp bmp, Object obj) {
        this.f42910a.obtainMessage(7, Pair.create(bmp, obj)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo30385a(bre bre) {
        this.f42910a.obtainMessage(8, bre).sendToTarget();
    }

    /* renamed from: b */
    public final void mo30388b() {
        this.f42910a.sendEmptyMessage(10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x038d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0450, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0451, code lost:
        r2 = r0;
        r8.f42923n = new com.google.android.gms.internal.ads.bmd(r3, r4);
        r8.f42919j.obtainMessage(4, r1, 0, r8.f42923n).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0464, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x087c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x087d, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0881, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0882, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0886, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0887, code lost:
        r8.f42919j.obtainMessage(8, com.google.android.gms.internal.ads.blt.m36050a(r0)).sendToTarget();
        m36111f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x089a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cd, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ce, code lost:
        monitor-enter(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.f42934y++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0290 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0293 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0297 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0359 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x036d A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0522 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0529 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0544 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0547 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0582 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0598 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x05b4 A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }, LOOP:8: B:321:0x05b4->B:325:0x05c6, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x07bd A[Catch:{ all -> 0x0450, all -> 0x038d, all -> 0x00cc, all -> 0x00d9, all -> 0x00c8, blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0886 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ blt -> 0x08b0, IOException -> 0x089b, RuntimeException -> 0x0886 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0845;
                case 1: goto L_0x0818;
                case 2: goto L_0x0465;
                case 3: goto L_0x03b6;
                case 4: goto L_0x0395;
                case 5: goto L_0x0391;
                case 6: goto L_0x037a;
                case 7: goto L_0x021c;
                case 8: goto L_0x01e6;
                case 9: goto L_0x01d3;
                case 10: goto L_0x00dd;
                case 11: goto L_0x009f;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42933x = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0026:
            if (r2 == 0) goto L_0x009e
            com.google.android.gms.internal.ads.bmc r3 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.bmc r4 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r4) goto L_0x0037
            r4 = r3
            r3 = r2
            r2 = 1
            goto L_0x003a
        L_0x0037:
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x003a:
            com.google.android.gms.internal.ads.bmp r11 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r12 = r3.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r13 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bms r14 = r8.f42921l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.mo30408a(r12, r13, r14, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r12 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x0065
            if (r11 == r5) goto L_0x0065
            com.google.android.gms.internal.ads.bmc r12 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r12 = r12.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 != r11) goto L_0x0065
            com.google.android.gms.internal.ads.bmc r3 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r11 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != r11) goto L_0x005a
            r11 = 1
            goto L_0x005b
        L_0x005a:
            r11 = 0
        L_0x005b:
            r4 = r4 | r11
            com.google.android.gms.internal.ads.bmc r11 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != r11) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0062:
            r11 = 0
        L_0x0063:
            r2 = r2 | r11
            goto L_0x003a
        L_0x0065:
            com.google.android.gms.internal.ads.bmc r5 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r5 == 0) goto L_0x0070
            com.google.android.gms.internal.ads.bmc r5 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            m36096a(r5)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42946k = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0070:
            int r5 = r3.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r5 = r8.m36106b(r5)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42943h = r5     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x007c
            r8.f42906D = r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x007c:
            if (r4 != 0) goto L_0x0095
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r8.m36090a(r2, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r5 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5.<init>(r2, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r5     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0095:
            int r2 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r15) goto L_0x009e
            if (r1 == 0) goto L_0x009e
            r8.m36093a(r7)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x009e:
            return r10
        L_0x009f:
            java.lang.Object r1 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blx[] r1 = (com.google.android.gms.internal.ads.blx[]) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r1.length     // Catch:{ all -> 0x00cc }
        L_0x00a4:
            if (r9 >= r2) goto L_0x00b4
            r3 = r1[r9]     // Catch:{ all -> 0x00cc }
            com.google.android.gms.internal.ads.blw r4 = r3.f42873a     // Catch:{ all -> 0x00cc }
            int r5 = r3.f42874b     // Catch:{ all -> 0x00cc }
            java.lang.Object r3 = r3.f42875c     // Catch:{ all -> 0x00cc }
            r4.mo30342a(r5, r3)     // Catch:{ all -> 0x00cc }
            int r9 = r9 + 1
            goto L_0x00a4
        L_0x00b4:
            com.google.android.gms.internal.ads.brg r1 = r8.f42927r     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x00bd
            android.os.Handler r1 = r8.f42910a     // Catch:{ all -> 0x00cc }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00cc }
        L_0x00bd:
            monitor-enter(r34)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r8.f42934y     // Catch:{ all -> 0x00c8 }
            int r1 = r1 + r10
            r8.f42934y = r1     // Catch:{ all -> 0x00c8 }
            r34.notifyAll()     // Catch:{ all -> 0x00c8 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            return r10
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c8 }
            throw r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x00cc:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r8.f42934y     // Catch:{ all -> 0x00d9 }
            int r2 = r2 + r10
            r8.f42934y = r2     // Catch:{ all -> 0x00d9 }
            r34.notifyAll()     // Catch:{ all -> 0x00d9 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d9 }
            throw r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x00dd:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x01d2
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 1
        L_0x00e4:
            if (r1 == 0) goto L_0x01d2
            boolean r3 = r1.f42944i     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != 0) goto L_0x00ec
            goto L_0x01d2
        L_0x00ec:
            boolean r3 = r1.mo30395c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != 0) goto L_0x00fa
            com.google.android.gms.internal.ads.bmc r3 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != r3) goto L_0x00f7
            r2 = 0
        L_0x00f7:
            com.google.android.gms.internal.ads.bmc r1 = r1.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x00e4
        L_0x00fa:
            if (r2 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.bmc r2 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == r3) goto L_0x0104
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            m36096a(r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42946k = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42906D = r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42907E = r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmm[] r3 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean[] r3 = new boolean[r3]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r4 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r5 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r5.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r4.mo30392a(r11, r2, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r2 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r2.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0136
            com.google.android.gms.internal.ads.bmd r2 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.f42957c = r4     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36094a(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0136:
            com.google.android.gms.internal.ads.bmm[] r2 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean[] r2 = new boolean[r2]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4 = 0
            r5 = 0
        L_0x013d:
            com.google.android.gms.internal.ads.bmm[] r11 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 >= r11) goto L_0x0189
            com.google.android.gms.internal.ads.bmm[] r11 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11 = r11[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r12 = r11.mo30351d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x014e
            r12 = 1
            goto L_0x014f
        L_0x014e:
            r12 = 0
        L_0x014f:
            r2[r4] = r12     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r12 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brr[] r12 = r12.f42939d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12 = r12[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x015b
            int r5 = r5 + 1
        L_0x015b:
            boolean r13 = r2[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r13 == 0) goto L_0x0186
            com.google.android.gms.internal.ads.brr r13 = r11.mo30353f()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == r13) goto L_0x017d
            com.google.android.gms.internal.ads.bmm r13 = r8.f42925p     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 != r13) goto L_0x0176
            if (r12 != 0) goto L_0x0172
            com.google.android.gms.internal.ads.btu r12 = r8.f42917h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.btm r13 = r8.f42926q     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.mo30714a(r13)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0172:
            r8.f42926q = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42925p = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0176:
            m36097a(r11)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo30358k()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0186
        L_0x017d:
            boolean r12 = r3[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x0186
            long r12 = r8.f42905C     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo30343a(r12)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0186:
            int r4 = r4 + 1
            goto L_0x013d
        L_0x0189:
            android.os.Handler r3 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsn r1 = r1.f42947l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36100a(r2, r5)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x01c7
        L_0x0198:
            r8.f42906D = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r1.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x019e:
            if (r1 == 0) goto L_0x01a6
            r1.mo30396d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r1.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x019e
        L_0x01a6:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42946k = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.f42944i     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x01c7
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.f42942g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r8.f42905C     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r3.mo30390a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = 0
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.mo30391a(r1, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x01c7:
            r34.m36112g()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m36110e()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42910a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r7)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x01d2:
            return r10
        L_0x01d3:
            java.lang.Object r1 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r1 = (com.google.android.gms.internal.ads.bre) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x01e5
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r2 = r2.f42936a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == r1) goto L_0x01e2
            goto L_0x01e5
        L_0x01e2:
            r34.m36112g()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x01e5:
            return r10
        L_0x01e6:
            java.lang.Object r1 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r1 = (com.google.android.gms.internal.ads.bre) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x021b
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r2 = r2.f42936a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == r1) goto L_0x01f5
            goto L_0x021b
        L_0x01f5:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42944i = r10     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo30395c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r1.f42942g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r1.mo30391a(r2, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42942g = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x0218
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42907E = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.f42942g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36094a(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36103b(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0218:
            r34.m36112g()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x021b:
            return r10
        L_0x021c:
            java.lang.Object r1 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r3 = r1.first     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r3 = (com.google.android.gms.internal.ads.bmp) r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42909G = r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r1 = r1.second     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x028b
            int r3 = r8.f42903A     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 <= 0) goto L_0x025b
            com.google.android.gms.internal.ads.bme r3 = r8.f42904B     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.util.Pair r3 = r8.m36091a(r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r4 = r8.f42903A     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42903A = r9     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42904B = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != 0) goto L_0x0243
            r8.m36098a(r1, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0379
        L_0x0243:
            com.google.android.gms.internal.ads.bmd r7 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r11 = r3.first     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.intValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r3 = r3.second     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r3.longValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7.<init>(r11, r14)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r7     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x028c
        L_0x025b:
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42956b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x028b
            com.google.android.gms.internal.ads.bmp r3 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r3 = r3.mo30413a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0270
            r8.m36098a(r1, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0379
        L_0x0270:
            android.util.Pair r3 = r8.m36101b(r9, r12)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r4 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r7 = r3.first     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.intValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r3 = r3.second     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r3.longValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4.<init>(r7, r14)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r4     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x028b:
            r4 = 0
        L_0x028c:
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0293
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0295
        L_0x0293:
            com.google.android.gms.internal.ads.bmc r3 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0295:
            if (r3 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.bmp r7 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r11 = r3.f42937b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.mo30409a(r11)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 != r5) goto L_0x02f9
            int r6 = r3.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r7 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r8.m36089a(r6, r2, r7)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != r5) goto L_0x02b0
            r8.m36098a(r1, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0379
        L_0x02b0:
            com.google.android.gms.internal.ads.bmp r6 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r7 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r6.mo30410a(r2, r7, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.util.Pair r2 = r8.m36101b(r9, r12)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r6 = r2.first     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r6 = r6.intValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r2 = r2.second     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r2.longValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r7 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo30410a(r6, r7, r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r2 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r2 = r2.f42978b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.f42941f = r5     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x02d8:
            com.google.android.gms.internal.ads.bmc r7 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == 0) goto L_0x02ec
            com.google.android.gms.internal.ads.bmc r3 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r7 = r3.f42937b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r7 = r7.equals(r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == 0) goto L_0x02e8
            r7 = r6
            goto L_0x02e9
        L_0x02e8:
            r7 = -1
        L_0x02e9:
            r3.f42941f = r7     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x02d8
        L_0x02ec:
            long r2 = r8.m36090a(r6, r11)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r5 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5.<init>(r6, r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r5     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0376
        L_0x02f9:
            boolean r2 = r8.m36106b(r7)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.mo30393a(r7, r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 != r2) goto L_0x0306
            r2 = 1
            goto L_0x0307
        L_0x0306:
            r2 = 0
        L_0x0307:
            com.google.android.gms.internal.ads.bmd r11 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11.f42955a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == r11) goto L_0x0320
            com.google.android.gms.internal.ads.bmd r11 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r12 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r13 = r11.f42956b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.<init>(r7, r13)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r13 = r11.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.f42957c = r13     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r13 = r11.f42958d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r12.f42958d = r13     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r12     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0320:
            com.google.android.gms.internal.ads.bmc r11 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 == 0) goto L_0x0376
            com.google.android.gms.internal.ads.bmc r11 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r12 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r13 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bms r14 = r8.f42921l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r15 = r8.f42933x     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r12.mo30408a(r7, r13, r14, r15)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == r5) goto L_0x0357
            java.lang.Object r12 = r11.f42937b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r13 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r14 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r13 = r13.mo30410a(r7, r14, r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r13 = r13.f42978b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r12 = r12.equals(r13)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r12 == 0) goto L_0x0357
            boolean r3 = r8.m36106b(r7)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo30393a(r7, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 != r3) goto L_0x0353
            r3 = 1
            goto L_0x0354
        L_0x0353:
            r3 = 0
        L_0x0354:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0320
        L_0x0357:
            if (r2 != 0) goto L_0x036d
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r5 = r3.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r5 = r8.m36090a(r2, r5)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r3 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.<init>(r2, r5)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0376
        L_0x036d:
            r8.f42906D = r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.f42946k = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            m36096a(r11)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0376:
            r8.m36104b(r1, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0379:
            return r10
        L_0x037a:
            r8.m36105b(r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmj r1 = r8.f42916g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo29046c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36093a(r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            monitor-enter(r34)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42911b = r10     // Catch:{ all -> 0x038d }
            r34.notifyAll()     // Catch:{ all -> 0x038d }
            monitor-exit(r34)     // Catch:{ all -> 0x038d }
            return r10
        L_0x038d:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x038d }
            throw r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0391:
            r34.m36111f()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            return r10
        L_0x0395:
            java.lang.Object r1 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bml r1 = (com.google.android.gms.internal.ads.bml) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.btm r2 = r8.f42926q     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x03a4
            com.google.android.gms.internal.ads.btm r2 = r8.f42926q     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bml r1 = r2.mo30464a(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x03aa
        L_0x03a4:
            com.google.android.gms.internal.ads.btu r2 = r8.f42917h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bml r1 = r2.mo30464a(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x03aa:
            r8.f42924o = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            return r10
        L_0x03b6:
            java.lang.Object r1 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bme r1 = (com.google.android.gms.internal.ads.bme) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x03c7
            int r2 = r8.f42903A     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2 + r10
            r8.f42903A = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42904B = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x044f
        L_0x03c7:
            android.util.Pair r2 = r8.m36091a(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x03ed
            com.google.android.gms.internal.ads.bmd r1 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.<init>(r9, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r2 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r1.obtainMessage(r15, r10, r9, r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r1 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.<init>(r9, r12)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36093a(r15)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36105b(r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x044f
        L_0x03ed:
            long r3 = r1.f42961c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03f5
            r1 = 1
            goto L_0x03f6
        L_0x03f5:
            r1 = 0
        L_0x03f6:
            java.lang.Object r3 = r2.first     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.intValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r2 = r2.second     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r2.longValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r2 = r8.f42923n     // Catch:{ all -> 0x0450 }
            int r2 = r2.f42955a     // Catch:{ all -> 0x0450 }
            if (r3 != r2) goto L_0x042c
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.bmd r2 = r8.f42923n     // Catch:{ all -> 0x0450 }
            long r13 = r2.f42957c     // Catch:{ all -> 0x0450 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x042c
            com.google.android.gms.internal.ads.bmd r2 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.<init>(r3, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x044f
        L_0x042c:
            long r6 = r8.m36090a(r3, r4)     // Catch:{ all -> 0x0450 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0436
            r2 = 1
            goto L_0x0437
        L_0x0436:
            r2 = 0
        L_0x0437:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.bmd r2 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.<init>(r3, r6)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0445
            r1 = 1
            goto L_0x0446
        L_0x0445:
            r1 = 0
        L_0x0446:
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x044f:
            return r10
        L_0x0450:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.bmd r6 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r6.<init>(r3, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r6     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r3 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r4 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            throw r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0465:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r1 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c7
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x0476
            com.google.android.gms.internal.ads.bmd r1 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.f42955a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x04b5
        L_0x0476:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.f42943h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0593
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.mo30394b()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0593
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r7 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r2 = r2.mo30410a(r1, r7, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r2.f42980d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0498
            goto L_0x0593
        L_0x0498:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x04a9
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42938c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r7 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.f42938c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x0593
        L_0x04a9:
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r7 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bms r14 = r8.f42921l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r15 = r8.f42933x     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r2.mo30408a(r1, r7, r14, r15)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x04b5:
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.mo30415c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 >= r2) goto L_0x0593
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x04c7
            com.google.android.gms.internal.ads.bmd r2 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r2.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x04c5:
            r14 = r5
            goto L_0x051e
        L_0x04c7:
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r7 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo30410a(r1, r7, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bms r7 = r8.f42921l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo30411a(r9, r7, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x04d8
            goto L_0x04c5
        L_0x04d8:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.mo30390a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r7 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r14 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r14 = r14.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r15 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r7 = r7.mo30410a(r14, r15, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r14 = r7.f42980d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7 = 0
            long r1 = r1 + r14
            long r14 = r8.f42905C     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7 = 0
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.bmp r7 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.m36092a(r2, r3, r4, r6)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0594
            java.lang.Object r2 = r1.first     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.intValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r1 = r1.second     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r1.longValue()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1 = r2
        L_0x051e:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0529
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x0526:
            r23 = r5
            goto L_0x0540
        L_0x0529:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r5 = r2.mo30390a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r7 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r7 = r7.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r11 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r2 = r2.mo30410a(r7, r11, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r12 = r2.f42980d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 0
            long r5 = r5 + r12
            goto L_0x0526
        L_0x0540:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0547
            r29 = 0
            goto L_0x054e
        L_0x0547:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42938c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2 + r10
            r29 = r2
        L_0x054e:
            boolean r31 = r8.m36106b(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r5 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo30410a(r1, r5, r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = new com.google.android.gms.internal.ads.bmc     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmm[] r5 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmn[] r6 = r8.f42914e     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsl r7 = r8.f42915f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmj r11 = r8.f42916g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brg r12 = r8.f42927r     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r13 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            java.lang.Object r13 = r13.f42978b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0586
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.f42946k = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0586:
            r8.f42906D = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r1 = r1.f42936a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo30577a(r8, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36099a(r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0594
        L_0x0593:
            r14 = r5
        L_0x0594:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x05ad
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.mo30394b()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x05a1
            goto L_0x05ad
        L_0x05a1:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x05b0
            boolean r1 = r8.f42931v     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x05b0
            r34.m36112g()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x05b0
        L_0x05ad:
            r8.m36099a(r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x05b0:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c8
        L_0x05b4:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == r2) goto L_0x05f1
            long r1 = r8.f42905C     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r3.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42940e     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x05f1
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.mo30396d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r1.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36103b(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r1 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42942g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.<init>(r2, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m36110e()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 5
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x05b4
        L_0x05f1:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.f42943h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x061b
            r1 = 0
        L_0x05f8:
            com.google.android.gms.internal.ads.bmm[] r2 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 >= r2) goto L_0x06c8
            com.google.android.gms.internal.ads.bmm[] r2 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = r2[r1]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brr[] r3 = r3.f42939d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = r3[r1]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0618
            com.google.android.gms.internal.ads.brr r4 = r2.mo30353f()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 != r3) goto L_0x0618
            boolean r3 = r2.mo30354g()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x0618
            r2.mo30355h()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0618:
            int r1 = r1 + 1
            goto L_0x05f8
        L_0x061b:
            r1 = 0
        L_0x061c:
            com.google.android.gms.internal.ads.bmm[] r2 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 >= r2) goto L_0x063e
            com.google.android.gms.internal.ads.bmm[] r2 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = r2[r1]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brr[] r3 = r3.f42939d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = r3[r1]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brr r4 = r2.mo30353f()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 != r3) goto L_0x06c8
            if (r3 == 0) goto L_0x063b
            boolean r2 = r2.mo30354g()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x063b
            goto L_0x06c8
        L_0x063b:
            int r1 = r1 + 1
            goto L_0x061c
        L_0x063e:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r1.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c8
            com.google.android.gms.internal.ads.bmc r1 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r1 = r1.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r1.f42944i     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x06c8
            com.google.android.gms.internal.ads.bmc r1 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsn r1 = r1.f42947l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r2.f42946k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42907E = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsn r2 = r2.f42947l     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r3 = r3.f42936a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.mo30583c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x066d
            r3 = 1
            goto L_0x066e
        L_0x066d:
            r3 = 0
        L_0x066e:
            r4 = 0
        L_0x066f:
            com.google.android.gms.internal.ads.bmm[] r5 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r5 = r5.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r4 >= r5) goto L_0x06c8
            com.google.android.gms.internal.ads.bmm[] r5 = r8.f42913d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = r5[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsk r6 = r1.f43780b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsi r6 = r6.mo30659a(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x06c4
            if (r3 != 0) goto L_0x06c1
            boolean r6 = r5.mo30356i()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 != 0) goto L_0x06c4
            com.google.android.gms.internal.ads.bsk r6 = r2.f43780b     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bsi r6 = r6.mo30659a(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmo[] r7 = r1.f43782d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7 = r7[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmo[] r11 = r2.f43782d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11 = r11[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x06c1
            boolean r7 = r11.equals(r7)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r7 == 0) goto L_0x06c1
            int r7 = r6.mo30645b()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.zzlg[] r7 = new com.google.android.gms.internal.ads.zzlg[r7]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11 = 0
        L_0x06a5:
            int r12 = r7.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r11 >= r12) goto L_0x06b1
            com.google.android.gms.internal.ads.zzlg r12 = r6.mo30644a(r11)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r7[r11] = r12     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r11 = r11 + 1
            goto L_0x06a5
        L_0x06b1:
            com.google.android.gms.internal.ads.bmc r6 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brr[] r6 = r6.f42939d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r6 = r6[r4]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r11 = r8.f42907E     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r11.mo30390a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5.mo30348a(r7, r6, r11)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x06c4
        L_0x06c1:
            r5.mo30355h()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x06c4:
            int r4 = r4 + 1
            goto L_0x066f
        L_0x06c7:
            r14 = r5
        L_0x06c8:
            com.google.android.gms.internal.ads.bmc r1 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 10
            if (r1 != 0) goto L_0x06d3
            r8.m36095a(r14, r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0817
        L_0x06d3:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.btv.m36752a(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m36110e()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmd r1 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r4 = r1.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmm[] r1 = r8.f42928s     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r4 = r1.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x06e5:
            if (r5 >= r4) goto L_0x0717
            r11 = r1[r5]     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r12 = r8.f42905C     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r8.f42935z     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r11.mo30402a(r12, r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x06fa
            boolean r2 = r11.mo30404q()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x06fa
            r6 = 1
            goto L_0x06fb
        L_0x06fa:
            r6 = 0
        L_0x06fb:
            boolean r2 = r11.mo30403p()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x070a
            boolean r2 = r11.mo30404q()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x0708
            goto L_0x070a
        L_0x0708:
            r2 = 0
            goto L_0x070b
        L_0x070a:
            r2 = 1
        L_0x070b:
            if (r7 == 0) goto L_0x0711
            if (r2 == 0) goto L_0x0711
            r7 = 1
            goto L_0x0712
        L_0x0711:
            r7 = 0
        L_0x0712:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x06e5
        L_0x0717:
            com.google.android.gms.internal.ads.btm r1 = r8.f42926q     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x073c
            com.google.android.gms.internal.ads.btm r1 = r8.f42926q     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bml r1 = r1.mo30472s()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bml r2 = r8.f42924o     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r1.equals(r2)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x073c
            r8.f42924o = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.btu r2 = r8.f42917h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.btm r3 = r8.f42926q     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo30714a(r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r2 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendToTarget()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x073c:
            com.google.android.gms.internal.ads.bmp r1 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r2 = r2.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r3 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r1 = r1.mo30410a(r2, r3, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r1 = r1.f42980d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r6 == 0) goto L_0x076d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x075d
            com.google.android.gms.internal.ads.bmd r3 = r8.f42923n     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r3 = r3.f42957c     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x076d
        L_0x075d:
            com.google.android.gms.internal.ads.bmc r3 = r8.f42908F     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r3 = r3.f42943h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 == 0) goto L_0x076d
            r3 = 4
            r8.m36093a(r3)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m36109d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4 = 2
            goto L_0x07ee
        L_0x076d:
            int r3 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r4 = 2
            if (r3 != r4) goto L_0x07d3
            com.google.android.gms.internal.ads.bmm[] r3 = r8.f42928s     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 <= 0) goto L_0x07c1
            if (r7 == 0) goto L_0x07bf
            boolean r1 = r8.f42930u     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.f42944i     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 != 0) goto L_0x0786
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r2.f42942g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x078e
        L_0x0786:
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bre r2 = r2.f42936a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r2.mo30584d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x078e:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07aa
            com.google.android.gms.internal.ads.bmc r2 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r2 = r2.f42943h     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r2 == 0) goto L_0x079c
            r1 = 1
            goto L_0x07bb
        L_0x079c:
            com.google.android.gms.internal.ads.bmp r2 = r8.f42909G     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r3 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.f42941f     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r5 = r8.f42922m     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmr r2 = r2.mo30410a(r3, r5, r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r2 = r2.f42980d     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07aa:
            com.google.android.gms.internal.ads.bmj r5 = r8.f42916g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmc r6 = r8.f42906D     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r11 = r8.f42905C     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            long r6 = r6.mo30390a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r13 = 0
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.mo29043a(r2, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07bb:
            if (r1 == 0) goto L_0x07bf
            r1 = 1
            goto L_0x07c5
        L_0x07bf:
            r1 = 0
            goto L_0x07c5
        L_0x07c1:
            boolean r1 = r8.m36107b(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07c5:
            if (r1 == 0) goto L_0x07ee
            r1 = 3
            r8.m36093a(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            boolean r1 = r8.f42929t     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x07ee
            r34.m36108c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x07ee
        L_0x07d3:
            int r3 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = 3
            if (r3 != r5) goto L_0x07ee
            com.google.android.gms.internal.ads.bmm[] r3 = r8.f42928s     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r3 = r3.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r3 <= 0) goto L_0x07de
            goto L_0x07e2
        L_0x07de:
            boolean r7 = r8.m36107b(r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07e2:
            if (r7 != 0) goto L_0x07ee
            boolean r1 = r8.f42929t     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42930u = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36093a(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m36109d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x07ee:
            boolean r1 = r8.f42929t     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x07fb
            int r1 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 3
            if (r1 == r2) goto L_0x07f8
            goto L_0x07fb
        L_0x07f8:
            r1 = 10
            goto L_0x0800
        L_0x07fb:
            int r1 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != r4) goto L_0x0804
            goto L_0x07f8
        L_0x0800:
            r8.m36095a(r14, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0814
        L_0x0804:
            com.google.android.gms.internal.ads.bmm[] r1 = r8.f42928s     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.length     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x080f
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.m36095a(r14, r1)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0814
        L_0x080f:
            android.os.Handler r1 = r8.f42910a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.removeMessages(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0814:
            com.google.android.gms.internal.ads.btv.m36751a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0817:
            return r10
        L_0x0818:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x081f
            r1 = 1
            goto L_0x0820
        L_0x081f:
            r1 = 0
        L_0x0820:
            r8.f42930u = r9     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42929t = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != 0) goto L_0x082d
            r34.m36109d()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r34.m36110e()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0844
        L_0x082d:
            int r1 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2 = 3
            if (r1 != r2) goto L_0x083b
            r34.m36108c()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42910a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            goto L_0x0844
        L_0x083b:
            int r1 = r8.f42932w     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 != r4) goto L_0x0844
            android.os.Handler r1 = r8.f42910a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x0844:
            return r10
        L_0x0845:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.brg r2 = (com.google.android.gms.internal.ads.brg) r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            int r1 = r1.arg1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x0850
            r1 = 1
            goto L_0x0851
        L_0x0850:
            r1 = 0
        L_0x0851:
            android.os.Handler r3 = r8.f42919j     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.sendEmptyMessage(r9)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36105b(r10)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.bmj r3 = r8.f42916g     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r3.mo29039a()     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            if (r1 == 0) goto L_0x086c
            com.google.android.gms.internal.ads.bmd r1 = new com.google.android.gms.internal.ads.bmd     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.f42923n = r1     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
        L_0x086c:
            r8.f42927r = r2     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            com.google.android.gms.internal.ads.blu r1 = r8.f42920k     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r2.mo30600a(r1, r10, r8)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r8.m36093a(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            android.os.Handler r1 = r8.f42910a     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            r1.sendEmptyMessage(r4)     // Catch:{ blt -> 0x0881, IOException -> 0x087c, RuntimeException -> 0x0886 }
            return r10
        L_0x087c:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x089f
        L_0x0881:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08b4
        L_0x0886:
            r0 = move-exception
            r1 = r0
            android.os.Handler r2 = r8.f42919j
            com.google.android.gms.internal.ads.blt r1 = com.google.android.gms.internal.ads.blt.m36050a(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m36111f()
            return r10
        L_0x089b:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x089f:
            android.os.Handler r2 = r8.f42919j
            com.google.android.gms.internal.ads.blt r1 = com.google.android.gms.internal.ads.blt.zza(r1)
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m36111f()
            return r10
        L_0x08b0:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08b4:
            android.os.Handler r2 = r8.f42919j
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m36111f()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bmb.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    private final void m36093a(int i) {
        if (this.f42932w != i) {
            this.f42932w = i;
            this.f42919j.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private final void m36099a(boolean z) {
        if (this.f42931v != z) {
            this.f42931v = z;
            this.f42919j.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: c */
    private final void m36108c() throws blt {
        this.f42930u = false;
        this.f42917h.mo30712a();
        for (bmm e : this.f42928s) {
            e.mo30352e();
        }
    }

    /* renamed from: d */
    private final void m36109d() throws blt {
        this.f42917h.mo30715b();
        for (bmm a : this.f42928s) {
            m36097a(a);
        }
    }

    /* renamed from: e */
    private final void m36110e() throws blt {
        long j;
        if (this.f42908F != null) {
            long c = this.f42908F.f42936a.mo30583c();
            if (c != -9223372036854775807L) {
                m36094a(c);
            } else {
                if (this.f42925p == null || this.f42925p.mo30404q()) {
                    this.f42905C = this.f42917h.mo30471r();
                } else {
                    this.f42905C = this.f42926q.mo30471r();
                    this.f42917h.mo30713a(this.f42905C);
                }
                c = this.f42905C - this.f42908F.mo30390a();
            }
            this.f42923n.f42957c = c;
            this.f42935z = SystemClock.elapsedRealtime() * 1000;
            if (this.f42928s.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f42908F.f42936a.mo30584d();
            }
            bmd bmd = this.f42923n;
            if (j == Long.MIN_VALUE) {
                j = this.f42909G.mo30410a(this.f42908F.f42941f, this.f42922m, false).f42980d;
            }
            bmd.f42958d = j;
        }
    }

    /* renamed from: a */
    private final void m36095a(long j, long j2) {
        this.f42910a.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f42910a.sendEmptyMessage(2);
        } else {
            this.f42910a.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    private final long m36090a(int i, long j) throws blt {
        bmc bmc;
        m36109d();
        this.f42930u = false;
        m36093a(2);
        if (this.f42908F == null) {
            if (this.f42906D != null) {
                this.f42906D.mo30396d();
            }
            bmc = null;
        } else {
            bmc = null;
            for (bmc bmc2 = this.f42908F; bmc2 != null; bmc2 = bmc2.f42946k) {
                if (bmc2.f42941f != i || !bmc2.f42944i) {
                    bmc2.mo30396d();
                } else {
                    bmc = bmc2;
                }
            }
        }
        if (!(this.f42908F == bmc && this.f42908F == this.f42907E)) {
            for (bmm k : this.f42928s) {
                k.mo30358k();
            }
            this.f42928s = new bmm[0];
            this.f42926q = null;
            this.f42925p = null;
            this.f42908F = null;
        }
        if (bmc != null) {
            bmc.f42946k = null;
            this.f42906D = bmc;
            this.f42907E = bmc;
            m36103b(bmc);
            if (this.f42908F.f42945j) {
                j = this.f42908F.f42936a.mo30581b(j);
            }
            m36094a(j);
            m36112g();
        } else {
            this.f42906D = null;
            this.f42907E = null;
            this.f42908F = null;
            m36094a(j);
        }
        this.f42910a.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: a */
    private final void m36094a(long j) throws blt {
        long j2;
        if (this.f42908F == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + this.f42908F.mo30390a();
        }
        this.f42905C = j2;
        this.f42917h.mo30713a(this.f42905C);
        for (bmm a : this.f42928s) {
            a.mo30343a(this.f42905C);
        }
    }

    /* renamed from: f */
    private final void m36111f() {
        m36105b(true);
        this.f42916g.mo29044b();
        m36093a(1);
    }

    /* renamed from: b */
    private final void m36105b(boolean z) {
        bmm[] bmmArr;
        bmc bmc;
        this.f42910a.removeMessages(2);
        this.f42930u = false;
        this.f42917h.mo30715b();
        this.f42926q = null;
        this.f42925p = null;
        this.f42905C = 60000000;
        for (bmm bmm : this.f42928s) {
            try {
                m36097a(bmm);
                bmm.mo30358k();
            } catch (blt | RuntimeException unused) {
            }
        }
        this.f42928s = new bmm[0];
        if (this.f42908F != null) {
            bmc = this.f42908F;
        } else {
            bmc = this.f42906D;
        }
        m36096a(bmc);
        this.f42906D = null;
        this.f42907E = null;
        this.f42908F = null;
        m36099a(false);
        if (z) {
            if (this.f42927r != null) {
                this.f42927r.mo30599a();
                this.f42927r = null;
            }
            this.f42909G = null;
        }
    }

    /* renamed from: a */
    private static void m36097a(bmm bmm) throws blt {
        if (bmm.mo30351d() == 2) {
            bmm.mo30357j();
        }
    }

    /* renamed from: b */
    private final boolean m36107b(long j) {
        return j == -9223372036854775807L || this.f42923n.f42957c < j || (this.f42908F.f42946k != null && this.f42908F.f42946k.f42944i);
    }

    /* renamed from: a */
    private final void m36098a(Object obj, int i) {
        this.f42923n = new bmd(0, 0);
        m36104b(obj, i);
        this.f42923n = new bmd(0, -9223372036854775807L);
        m36093a(4);
        m36105b(false);
    }

    /* renamed from: b */
    private final void m36104b(Object obj, int i) {
        this.f42919j.obtainMessage(6, new bmf(this.f42909G, obj, this.f42923n, i)).sendToTarget();
    }

    /* renamed from: a */
    private final int m36089a(int i, bmp bmp, bmp bmp2) {
        int c = bmp.mo30415c();
        int i2 = i;
        int i3 = -1;
        for (int i4 = 0; i4 < c && i3 == -1; i4++) {
            i2 = bmp.mo30408a(i2, this.f42922m, this.f42921l, this.f42933x);
            i3 = bmp2.mo30409a(bmp.mo30410a(i2, this.f42922m, true).f42978b);
        }
        return i3;
    }

    /* renamed from: b */
    private final boolean m36106b(int i) {
        this.f42909G.mo30410a(i, this.f42922m, false);
        if (this.f42909G.mo30411a(0, this.f42921l, false).f42987e || this.f42909G.mo30408a(i, this.f42922m, this.f42921l, this.f42933x) != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m36091a(bme bme) {
        bmp bmp = bme.f42959a;
        if (bmp.mo30413a()) {
            bmp = this.f42909G;
        }
        try {
            Pair<Integer, Long> b = m36102b(bmp, bme.f42960b, bme.f42961c);
            if (this.f42909G == bmp) {
                return b;
            }
            int a = this.f42909G.mo30409a(bmp.mo30410a(((Integer) b.first).intValue(), this.f42922m, true).f42978b);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), (Long) b.second);
            }
            int a2 = m36089a(((Integer) b.first).intValue(), bmp, this.f42909G);
            if (a2 == -1) {
                return null;
            }
            this.f42909G.mo30410a(a2, this.f42922m, false);
            return m36101b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new bmi(this.f42909G, bme.f42960b, bme.f42961c);
        }
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m36101b(int i, long j) {
        return m36102b(this.f42909G, 0, -9223372036854775807L);
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m36102b(bmp bmp, int i, long j) {
        return m36092a(bmp, i, j, 0);
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m36092a(bmp bmp, int i, long j, long j2) {
        bti.m36696a(i, 0, bmp.mo30414b());
        bmp.mo30412a(i, this.f42921l, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f42921l.f42990h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        long j3 = this.f42921l.f42992j + j;
        bmp.mo30410a(0, this.f42922m, false);
        return Pair.create(Integer.valueOf(0), Long.valueOf(j3));
    }

    /* renamed from: g */
    private final void m36112g() {
        long j;
        if (!this.f42906D.f42944i) {
            j = 0;
        } else {
            j = this.f42906D.f42936a.mo30571K_();
        }
        if (j == Long.MIN_VALUE) {
            m36099a(false);
            return;
        }
        long a = this.f42905C - this.f42906D.mo30390a();
        boolean a2 = this.f42916g.mo29042a(j - a);
        m36099a(a2);
        if (a2) {
            this.f42906D.f42936a.mo30572a(a);
        }
    }

    /* renamed from: a */
    private static void m36096a(bmc bmc) {
        while (bmc != null) {
            bmc.mo30396d();
            bmc = bmc.f42946k;
        }
    }

    /* renamed from: b */
    private final void m36103b(bmc bmc) throws blt {
        if (this.f42908F != bmc) {
            boolean[] zArr = new boolean[this.f42913d.length];
            int i = 0;
            for (int i2 = 0; i2 < this.f42913d.length; i2++) {
                bmm bmm = this.f42913d[i2];
                zArr[i2] = bmm.mo30351d() != 0;
                bsi a = bmc.f42947l.f43780b.mo30659a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (bmm.mo30356i() && bmm.mo30353f() == this.f42908F.f42939d[i2]))) {
                    if (bmm == this.f42925p) {
                        this.f42917h.mo30714a(this.f42926q);
                        this.f42926q = null;
                        this.f42925p = null;
                    }
                    m36097a(bmm);
                    bmm.mo30358k();
                }
            }
            this.f42908F = bmc;
            this.f42919j.obtainMessage(3, bmc.f42947l).sendToTarget();
            m36100a(zArr, i);
        }
    }

    /* renamed from: a */
    private final void m36100a(boolean[] zArr, int i) throws blt {
        this.f42928s = new bmm[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f42913d.length; i3++) {
            bmm bmm = this.f42913d[i3];
            bsi a = this.f42908F.f42947l.f43780b.mo30659a(i3);
            if (a != null) {
                int i4 = i2 + 1;
                this.f42928s[i2] = bmm;
                if (bmm.mo30351d() == 0) {
                    bmo bmo = this.f42908F.f42947l.f43782d[i3];
                    boolean z = this.f42929t && this.f42932w == 3;
                    boolean z2 = !zArr[i3] && z;
                    zzlg[] zzlgArr = new zzlg[a.mo30645b()];
                    for (int i5 = 0; i5 < zzlgArr.length; i5++) {
                        zzlgArr[i5] = a.mo30644a(i5);
                    }
                    bmm.mo30345a(bmo, zzlgArr, this.f42908F.f42939d[i3], this.f42905C, z2, this.f42908F.mo30390a());
                    btm c = bmm.mo30350c();
                    if (c != null) {
                        if (this.f42926q == null) {
                            this.f42926q = c;
                            this.f42925p = bmm;
                            this.f42926q.mo30464a(this.f42924o);
                        } else {
                            throw blt.m36050a(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        bmm.mo30352e();
                    }
                }
                i2 = i4;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo30386a(brs brs) {
        this.f42910a.obtainMessage(9, (bre) brs).sendToTarget();
    }
}

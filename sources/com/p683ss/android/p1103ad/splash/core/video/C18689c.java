package com.p683ss.android.p1103ad.splash.core.video;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18677b;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c.C18680a;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c.C18681b;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c.C18682c;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c.C18683d;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c.C18684e;
import com.p683ss.android.p1103ad.splash.core.video.p1119a.C18679c.C18685f;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r;
import com.p683ss.android.p1103ad.splash.p1123g.C18754r.C18755a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ad.splash.core.video.c */
public final class C18689c implements C18680a, C18681b, C18682c, C18683d, C18684e, C18685f, C18755a {

    /* renamed from: m */
    private static boolean f51644m;

    /* renamed from: n */
    private static Map<Integer, Integer> f51645n = new HashMap();

    /* renamed from: a */
    public C18679c f51646a;

    /* renamed from: b */
    public int f51647b;

    /* renamed from: c */
    long f51648c;

    /* renamed from: d */
    public Handler f51649d;

    /* renamed from: e */
    public boolean f51650e;

    /* renamed from: f */
    private boolean f51651f;

    /* renamed from: g */
    private boolean f51652g;

    /* renamed from: h */
    private boolean f51653h;

    /* renamed from: i */
    private Handler f51654i;

    /* renamed from: j */
    private ArrayList<Runnable> f51655j;

    /* renamed from: k */
    private int f51656k;

    /* renamed from: l */
    private int f51657l;

    /* renamed from: o */
    private final Set<SurfaceTexture> f51658o;

    /* renamed from: p */
    private final Object f51659p;

    /* renamed from: q */
    private StringBuilder f51660q;

    /* renamed from: a */
    public final boolean mo38227a(C18679c cVar, int i, int i2) {
        this.f51647b = 200;
        Integer num = (Integer) f51645n.get(Integer.valueOf(this.f51656k));
        if (num == null) {
            f51645n.put(Integer.valueOf(this.f51656k), Integer.valueOf(1));
        } else {
            f51645n.put(Integer.valueOf(this.f51656k), Integer.valueOf(num.intValue() + 1));
        }
        if (this.f51654i != null) {
            this.f51654i.obtainMessage(303, i, i2).sendToTarget();
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38232a(Runnable runnable) {
        if (!this.f51653h) {
            runnable.run();
        } else {
            m45519b(runnable);
        }
    }

    /* renamed from: d */
    private void m45520d() {
        if (f51644m) {
            m45516a(this.f51657l, false);
            f51644m = false;
        }
    }

    /* renamed from: b */
    public final void mo38233b() {
        this.f51649d.removeMessages(100);
        this.f51650e = true;
        this.f51649d.sendEmptyMessage(BaseNotice.HASHTAG);
    }

    /* renamed from: c */
    public final void mo38234c() {
        this.f51647b = 203;
        if (this.f51646a != null) {
            if (this.f51655j != null && !this.f51655j.isEmpty()) {
                this.f51655j.clear();
            }
            if (this.f51649d != null) {
                try {
                    m45517a("release");
                    this.f51649d.removeCallbacksAndMessages(null);
                    this.f51653h = true;
                    this.f51649d.sendEmptyMessage(103);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38231a() {
        if (this.f51646a == null) {
            this.f51646a = new C18677b();
            this.f51646a.mo38201a((C18684e) this);
            this.f51646a.mo38198a((C18681b) this);
            this.f51646a.mo38199a((C18682c) this);
            this.f51646a.mo38197a((C18680a) this);
            this.f51646a.mo38202a((C18685f) this);
            this.f51646a.mo38200a((C18683d) this);
            this.f51646a.mo38211b(this.f51651f);
            this.f51652g = false;
        }
    }

    public C18689c(Handler handler) {
        this(handler, -1);
    }

    /* renamed from: a */
    private boolean m45518a(SurfaceTexture surfaceTexture) {
        boolean contains;
        synchronized (this.f51658o) {
            contains = this.f51658o.contains(surfaceTexture);
        }
        return contains;
    }

    /* renamed from: c */
    public final void mo38230c(C18679c cVar) {
        if (this.f51654i != null) {
            this.f51654i.sendEmptyMessage(306);
        }
    }

    /* renamed from: b */
    private void m45519b(Runnable runnable) {
        if (this.f51655j == null) {
            this.f51655j = new ArrayList<>();
        }
        this.f51655j.add(runnable);
    }

    /* renamed from: a */
    private void m45517a(String str) {
        if (this.f51649d != null) {
            this.f51649d.removeMessages(201);
        }
        synchronized (this.f51659p) {
            if (this.f51660q != null) {
                this.f51660q = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo38229b(C18679c cVar) {
        this.f51647b = 205;
        if (this.f51650e) {
            this.f51649d.post(new Runnable() {
                public final void run() {
                    try {
                        C18689c.this.f51646a.mo38213d();
                        C18689c.this.f51647b = 207;
                        C18689c.this.f51650e = false;
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            this.f51649d.sendMessage(this.f51649d.obtainMessage(100, -1, -1));
        }
        f51645n.remove(Integer.valueOf(this.f51656k));
        if (this.f51654i != null) {
            this.f51654i.sendEmptyMessage(305);
        }
    }

    /* renamed from: a */
    public final void mo38226a(C18679c cVar) {
        int i;
        if (!this.f51651f) {
            i = 209;
        } else {
            i = 206;
        }
        this.f51647b = i;
        f51645n.remove(Integer.valueOf(this.f51656k));
        if (this.f51654i != null) {
            this.f51654i.obtainMessage(302).sendToTarget();
        }
        m45517a("completion");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01dd, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0170, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0171, code lost:
        r18 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37892a(android.os.Message r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r0.what
            java.lang.String r3 = ""
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51646a
            r7 = 1
            if (r4 == 0) goto L_0x0232
            int r4 = r0.what
            r8 = 10
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 208(0xd0, float:2.91E-43)
            r14 = 205(0xcd, float:2.87E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 206(0xce, float:2.89E-43)
            switch(r4) {
                case 100: goto L_0x01f9;
                case 101: goto L_0x01cf;
                case 102: goto L_0x01b8;
                case 103: goto L_0x018f;
                case 104: goto L_0x0167;
                case 105: goto L_0x013d;
                case 106: goto L_0x0115;
                case 107: goto L_0x00e9;
                case 108: goto L_0x00bb;
                case 109: goto L_0x008d;
                case 110: goto L_0x0061;
                case 111: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0232
        L_0x0028:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0053 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ Exception -> 0x0053 }
            java.util.Set<android.graphics.SurfaceTexture> r4 = r1.f51658o     // Catch:{ Exception -> 0x0053 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0053 }
            boolean r5 = r1.m45518a(r0)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x003f
            com.ss.android.ad.splash.core.video.a.c r5 = r1.f51646a     // Catch:{ all -> 0x0050 }
            android.view.Surface r6 = new android.view.Surface     // Catch:{ all -> 0x0050 }
            r6.<init>(r0)     // Catch:{ all -> 0x0050 }
            r5.mo38206a(r6)     // Catch:{ all -> 0x0050 }
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x0053 }
            r0.mo38209a(r7)     // Catch:{ Exception -> 0x0053 }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x0053 }
            android.content.Context r4 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()     // Catch:{ Exception -> 0x0053 }
            r0.mo38205a(r4, r8)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0232
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = r0.getMessage()
            r0.getMessage()
            goto L_0x0235
        L_0x0061:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x007f }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ Exception -> 0x007f }
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51646a     // Catch:{ Exception -> 0x007f }
            r4.mo38207a(r0)     // Catch:{ Exception -> 0x007f }
            int r0 = r1.f51656k     // Catch:{ Exception -> 0x007f }
            r4 = 2
            if (r0 != r4) goto L_0x0078
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x007f }
            android.content.Context r4 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()     // Catch:{ Exception -> 0x007f }
            r0.mo38205a(r4, r8)     // Catch:{ Exception -> 0x007f }
        L_0x0078:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x007f }
            r0.mo38209a(r7)     // Catch:{ Exception -> 0x007f }
            goto L_0x0232
        L_0x007f:
            r0 = move-exception
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = r0.getMessage()
            r0.getMessage()
            goto L_0x0235
        L_0x008d:
            int r0 = r1.f51647b
            if (r0 == r6) goto L_0x009a
            int r0 = r1.f51647b
            if (r0 != r5) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            r5 = 0
        L_0x0097:
            r16 = 0
            goto L_0x00b0
        L_0x009a:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x00a4 }
            long r14 = r0.mo38214e()     // Catch:{ Exception -> 0x00a4 }
            r16 = r14
            r5 = 0
            goto L_0x00b0
        L_0x00a4:
            r0 = move-exception
            r3 = 1011(0x3f3, float:1.417E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0097
        L_0x00b0:
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r1.m45515a(r0, r4)
            goto L_0x0235
        L_0x00bb:
            int r0 = r1.f51647b
            if (r0 == r6) goto L_0x00c8
            int r0 = r1.f51647b
            if (r0 != r5) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            r16 = 0
            goto L_0x00de
        L_0x00c8:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x00d2 }
            long r14 = r0.mo38215f()     // Catch:{ Exception -> 0x00d2 }
            r16 = r14
            r5 = 0
            goto L_0x00de
        L_0x00d2:
            r0 = move-exception
            r3 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x00c5
        L_0x00de:
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r1.m45515a(r0, r4)
            goto L_0x0235
        L_0x00e9:
            int r4 = r1.f51647b
            if (r4 == r11) goto L_0x00f1
            int r4 = r1.f51647b
            if (r4 != r10) goto L_0x0170
        L_0x00f1:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r4 = "/"
            boolean r4 = r0.startsWith(r4)     // Catch:{ Exception -> 0x0108 }
            if (r4 == 0) goto L_0x0104
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51646a     // Catch:{ Exception -> 0x0108 }
            r4.mo38208a(r0)     // Catch:{ Exception -> 0x0108 }
        L_0x0104:
            r1.f51647b = r12     // Catch:{ Exception -> 0x0108 }
            goto L_0x0232
        L_0x0108:
            r0 = move-exception
            r3 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0115:
            int r4 = r1.f51647b
            if (r4 == r6) goto L_0x0121
            int r4 = r1.f51647b
            if (r4 == r5) goto L_0x0121
            int r4 = r1.f51647b
            if (r4 != r15) goto L_0x0170
        L_0x0121:
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f51646a     // Catch:{ Exception -> 0x0130 }
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0130 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0130 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x0130 }
            r4.mo38204a(r5)     // Catch:{ Exception -> 0x0130 }
            goto L_0x0232
        L_0x0130:
            r0 = move-exception
            r3 = 1007(0x3ef, float:1.411E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x013d:
            int r0 = r1.f51647b
            if (r0 == r14) goto L_0x0151
            int r0 = r1.f51647b
            if (r0 == r6) goto L_0x0151
            int r0 = r1.f51647b
            if (r0 == r13) goto L_0x0151
            int r0 = r1.f51647b
            if (r0 == r5) goto L_0x0151
            int r0 = r1.f51647b
            if (r0 != r15) goto L_0x0170
        L_0x0151:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x015a }
            r0.mo38212c()     // Catch:{ Exception -> 0x015a }
            r1.f51647b = r13     // Catch:{ Exception -> 0x015a }
            goto L_0x0232
        L_0x015a:
            r0 = move-exception
            r3 = 1008(0x3f0, float:1.413E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0167:
            int r0 = r1.f51647b
            if (r0 == r12) goto L_0x0175
            int r0 = r1.f51647b
            if (r0 != r13) goto L_0x0170
            goto L_0x0175
        L_0x0170:
            r5 = 0
        L_0x0171:
            r18 = 1
            goto L_0x0237
        L_0x0175:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x0182 }
            com.ss.android.ad.splash.core.video.a.b r0 = (com.p683ss.android.p1103ad.splash.core.video.p1119a.C18677b) r0     // Catch:{ Exception -> 0x0182 }
            android.media.MediaPlayer r0 = r0.f51637g     // Catch:{ Exception -> 0x0182 }
            r0.prepare()     // Catch:{ Exception -> 0x0182 }
            r1.f51647b = r14     // Catch:{ Exception -> 0x0182 }
            goto L_0x0232
        L_0x0182:
            r0 = move-exception
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x018f:
            java.util.Set<android.graphics.SurfaceTexture> r4 = r1.f51658o     // Catch:{ Exception -> 0x019e }
            monitor-enter(r4)     // Catch:{ Exception -> 0x019e }
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x019e }
            r0.mo38216g()     // Catch:{ Exception -> 0x019e }
            r4 = 0
            r5 = 0
            goto L_0x01aa
        L_0x019b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ Exception -> 0x019e }
        L_0x019e:
            r0 = move-exception
            r3 = 1009(0x3f1, float:1.414E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            r4 = 0
        L_0x01aa:
            r1.f51653h = r4
            r0 = 309(0x135, float:4.33E-43)
            r4 = 0
            r1.m45515a(r0, r4)
            r1.f51647b = r10
            r1.f51646a = r4
            goto L_0x0235
        L_0x01b8:
            r4 = 0
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x01c2 }
            r0.mo38217h()     // Catch:{ Exception -> 0x01c2 }
            r1.f51647b = r11     // Catch:{ Exception -> 0x01c2 }
            goto L_0x0233
        L_0x01c2:
            r0 = move-exception
            r3 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x01cf:
            r4 = 0
            int r0 = r1.f51647b
            if (r0 == r6) goto L_0x01df
            int r0 = r1.f51647b
            if (r0 == r5) goto L_0x01df
            int r0 = r1.f51647b
            if (r0 != r15) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r5 = r4
            goto L_0x0171
        L_0x01df:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x01ec }
            r0.mo38213d()     // Catch:{ Exception -> 0x01ec }
            r1.f51647b = r5     // Catch:{ Exception -> 0x01ec }
            r8 = 0
            r1.f51650e = r8     // Catch:{ Exception -> 0x01ea }
            goto L_0x0234
        L_0x01ea:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ec:
            r0 = move-exception
            r8 = 0
        L_0x01ee:
            r3 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x01f9:
            r4 = 0
            r8 = 0
            int r0 = r1.f51647b
            if (r0 == r14) goto L_0x020b
            int r0 = r1.f51647b
            if (r0 == r6) goto L_0x020b
            int r0 = r1.f51647b
            if (r0 == r5) goto L_0x020b
            int r0 = r1.f51647b
            if (r0 != r15) goto L_0x01dd
        L_0x020b:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x0226 }
            r0.mo38210b()     // Catch:{ Exception -> 0x0226 }
            r1.f51647b = r6     // Catch:{ Exception -> 0x0226 }
            long r5 = r1.f51648c     // Catch:{ Exception -> 0x0226 }
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0234
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f51646a     // Catch:{ Exception -> 0x0226 }
            long r5 = r1.f51648c     // Catch:{ Exception -> 0x0226 }
            r0.mo38204a(r5)     // Catch:{ Exception -> 0x0226 }
            r5 = -1
            r1.f51648c = r5     // Catch:{ Exception -> 0x0226 }
            goto L_0x0234
        L_0x0226:
            r0 = move-exception
            r3 = 1004(0x3ec, float:1.407E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0232:
            r4 = 0
        L_0x0233:
            r8 = 0
        L_0x0234:
            r5 = r4
        L_0x0235:
            r18 = 0
        L_0x0237:
            if (r5 == 0) goto L_0x025a
            r0 = 310(0x136, float:4.34E-43)
            r1.m45515a(r0, r5)
            com.p683ss.android.p1103ad.splash.p1110b.C18557b.m44917a()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0259 }
            r0.<init>()     // Catch:{ Exception -> 0x0259 }
            java.lang.String r4 = "key_video_play_error_msg"
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0259 }
            com.ss.android.ad.splash.b.a r3 = com.p683ss.android.p1103ad.splash.p1110b.C18550a.m44899a()     // Catch:{ Exception -> 0x0259 }
            java.lang.String r4 = "service_video_play_error"
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0259 }
            r3.mo37843a(r4, r5, r0)     // Catch:{ Exception -> 0x0259 }
            goto L_0x025a
        L_0x0259:
        L_0x025a:
            if (r18 == 0) goto L_0x026f
            r0 = 200(0xc8, float:2.8E-43)
            r1.f51647b = r0
            boolean r0 = r1.f51652g
            if (r0 != 0) goto L_0x026f
            r0 = 308(0x134, float:4.32E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m45515a(r0, r2)
            r1.f51652g = r7
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.video.C18689c.mo37892a(android.os.Message):void");
    }

    /* renamed from: a */
    private void m45515a(int i, Object obj) {
        if (i == 309) {
            m45520d();
        }
        if (this.f51654i != null) {
            this.f51654i.obtainMessage(i, obj).sendToTarget();
        }
    }

    private C18689c(Handler handler, int i) {
        this.f51647b = 201;
        this.f51648c = -1;
        this.f51658o = new HashSet();
        this.f51659p = new Object();
        this.f51660q = null;
        this.f51656k = 0;
        this.f51654i = handler;
        HandlerThread handlerThread = new HandlerThread("VideoManager");
        handlerThread.start();
        this.f51649d = new C18754r(handlerThread.getLooper(), this);
        mo38231a();
    }

    /* renamed from: a */
    private void m45516a(int i, boolean z) {
        AudioManager audioManager = (AudioManager) C18642g.m45184L().getSystemService("audio");
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    /* renamed from: a */
    public final void mo38225a(C18679c cVar, int i) {
        if (this.f51646a == cVar && this.f51654i != null) {
            this.f51654i.obtainMessage(301, Integer.valueOf(i)).sendToTarget();
        }
    }

    /* renamed from: b */
    public final boolean mo38228b(C18679c cVar, int i, int i2) {
        if (this.f51646a == cVar && this.f51654i != null) {
            this.f51654i.obtainMessage(304, i, i2).sendToTarget();
        }
        return false;
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.ahj.C15575a;
import com.google.android.gms.internal.ads.amq.C15587a.C15588a;
import java.util.LinkedList;

public abstract class bee implements bed {

    /* renamed from: a */
    protected static volatile bey f42160a;

    /* renamed from: b */
    protected MotionEvent f42161b;

    /* renamed from: c */
    protected LinkedList<MotionEvent> f42162c = new LinkedList<>();

    /* renamed from: d */
    protected long f42163d = 0;

    /* renamed from: e */
    protected long f42164e = 0;

    /* renamed from: f */
    protected long f42165f = 0;

    /* renamed from: g */
    protected long f42166g = 0;

    /* renamed from: h */
    protected long f42167h = 0;

    /* renamed from: i */
    protected long f42168i = 0;

    /* renamed from: j */
    protected long f42169j = 0;

    /* renamed from: k */
    protected double f42170k;

    /* renamed from: l */
    protected float f42171l;

    /* renamed from: m */
    protected float f42172m;

    /* renamed from: n */
    protected float f42173n;

    /* renamed from: o */
    protected float f42174o;

    /* renamed from: p */
    protected boolean f42175p = false;

    /* renamed from: q */
    protected DisplayMetrics f42176q;

    /* renamed from: r */
    private double f42177r;

    /* renamed from: s */
    private double f42178s;

    /* renamed from: t */
    private boolean f42179t = false;

    protected bee(Context context) {
        try {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44268bB)).booleanValue()) {
                bbo.m35264a();
            } else {
                bfe.m35537a(f42160a);
            }
            this.f42176q = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo30073a(StackTraceElement[] stackTraceElementArr) throws bev;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C15588a mo30074a(Context context, View view, Activity activity);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C15588a mo30075a(Context context, C15575a aVar);

    /* renamed from: a */
    public void mo27639a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bff mo30076b(MotionEvent motionEvent) throws bev;

    /* renamed from: a */
    public final String mo27634a(Context context) {
        if (bfg.m35543a()) {
            if (((Boolean) caf.m37099d().mo30717a(C15740bx.f44270bD)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m35472a(context, null, false, null, null, null);
    }

    /* renamed from: a */
    public final String mo27635a(Context context, String str, View view) {
        return mo27636a(context, str, view, null);
    }

    /* renamed from: a */
    public final String mo27636a(Context context, String str, View view, Activity activity) {
        return m35472a(context, str, true, view, activity, null);
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27638a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.f42179t
            r1 = 0
            if (r0 == 0) goto L_0x0035
            r2 = 0
            r12.f42166g = r2
            r12.f42165f = r2
            r12.f42164e = r2
            r12.f42163d = r2
            r12.f42167h = r2
            r12.f42169j = r2
            r12.f42168i = r2
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f42162c
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            android.view.MotionEvent r2 = (android.view.MotionEvent) r2
            r2.recycle()
            goto L_0x001b
        L_0x002b:
            java.util.LinkedList<android.view.MotionEvent> r0 = r12.f42162c
            r0.clear()
            r0 = 0
            r12.f42161b = r0
            r12.f42179t = r1
        L_0x0035:
            int r0 = r13.getAction()
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x007a
        L_0x003d:
            float r0 = r13.getRawX()
            double r2 = (double) r0
            float r0 = r13.getRawY()
            double r4 = (double) r0
            double r6 = r12.f42177r
            java.lang.Double.isNaN(r2)
            double r6 = r2 - r6
            double r8 = r12.f42178s
            java.lang.Double.isNaN(r4)
            double r8 = r4 - r8
            double r10 = r12.f42170k
            double r6 = r6 * r6
            double r8 = r8 * r8
            double r6 = r6 + r8
            double r6 = java.lang.Math.sqrt(r6)
            double r10 = r10 + r6
            r12.f42170k = r10
            r12.f42177r = r2
            r12.f42178s = r4
            goto L_0x007a
        L_0x0068:
            r2 = 0
            r12.f42170k = r2
            float r0 = r13.getRawX()
            double r2 = (double) r0
            r12.f42177r = r2
            float r0 = r13.getRawY()
            double r2 = (double) r0
            r12.f42178s = r2
        L_0x007a:
            int r0 = r13.getAction()
            r2 = 1
            r4 = 1
            switch(r0) {
                case 0: goto L_0x0115;
                case 1: goto L_0x00df;
                case 2: goto L_0x008d;
                case 3: goto L_0x0086;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x0132
        L_0x0086:
            long r0 = r12.f42166g
            long r0 = r0 + r2
            r12.f42166g = r0
            goto L_0x0132
        L_0x008d:
            long r2 = r12.f42164e
            int r0 = r13.getHistorySize()
            int r0 = r0 + r4
            long r5 = (long) r0
            long r2 = r2 + r5
            r12.f42164e = r2
            com.google.android.gms.internal.ads.bff r13 = r12.mo30076b(r13)     // Catch:{ bev -> 0x0132 }
            java.lang.Long r0 = r13.f42249d     // Catch:{ bev -> 0x0132 }
            if (r0 == 0) goto L_0x00a6
            java.lang.Long r0 = r13.f42252g     // Catch:{ bev -> 0x0132 }
            if (r0 == 0) goto L_0x00a6
            r0 = 1
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            if (r0 == 0) goto L_0x00bc
            long r2 = r12.f42168i     // Catch:{ bev -> 0x0132 }
            java.lang.Long r0 = r13.f42249d     // Catch:{ bev -> 0x0132 }
            long r5 = r0.longValue()     // Catch:{ bev -> 0x0132 }
            java.lang.Long r0 = r13.f42252g     // Catch:{ bev -> 0x0132 }
            long r7 = r0.longValue()     // Catch:{ bev -> 0x0132 }
            r0 = 0
            long r5 = r5 + r7
            long r2 = r2 + r5
            r12.f42168i = r2     // Catch:{ bev -> 0x0132 }
        L_0x00bc:
            android.util.DisplayMetrics r0 = r12.f42176q     // Catch:{ bev -> 0x0132 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Long r0 = r13.f42250e     // Catch:{ bev -> 0x0132 }
            if (r0 == 0) goto L_0x00c9
            java.lang.Long r0 = r13.f42253h     // Catch:{ bev -> 0x0132 }
            if (r0 == 0) goto L_0x00c9
            r1 = 1
        L_0x00c9:
            if (r1 == 0) goto L_0x0132
            long r0 = r12.f42169j     // Catch:{ bev -> 0x0132 }
            java.lang.Long r2 = r13.f42250e     // Catch:{ bev -> 0x0132 }
            long r2 = r2.longValue()     // Catch:{ bev -> 0x0132 }
            java.lang.Long r13 = r13.f42253h     // Catch:{ bev -> 0x0132 }
            long r5 = r13.longValue()     // Catch:{ bev -> 0x0132 }
            r13 = 0
            long r2 = r2 + r5
            long r0 = r0 + r2
            r12.f42169j = r0     // Catch:{ bev -> 0x0132 }
            goto L_0x0132
        L_0x00df:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r12.f42161b = r13
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f42162c
            android.view.MotionEvent r0 = r12.f42161b
            r13.add(r0)
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f42162c
            int r13 = r13.size()
            r0 = 6
            if (r13 <= r0) goto L_0x0100
            java.util.LinkedList<android.view.MotionEvent> r13 = r12.f42162c
            java.lang.Object r13 = r13.remove()
            android.view.MotionEvent r13 = (android.view.MotionEvent) r13
            r13.recycle()
        L_0x0100:
            long r0 = r12.f42165f
            long r0 = r0 + r2
            r12.f42165f = r0
            java.lang.Throwable r13 = new java.lang.Throwable     // Catch:{ bev -> 0x0132 }
            r13.<init>()     // Catch:{ bev -> 0x0132 }
            java.lang.StackTraceElement[] r13 = r13.getStackTrace()     // Catch:{ bev -> 0x0132 }
            long r0 = r12.mo30073a(r13)     // Catch:{ bev -> 0x0132 }
            r12.f42167h = r0     // Catch:{ bev -> 0x0132 }
            goto L_0x0132
        L_0x0115:
            float r0 = r13.getX()
            r12.f42171l = r0
            float r0 = r13.getY()
            r12.f42172m = r0
            float r0 = r13.getRawX()
            r12.f42173n = r0
            float r13 = r13.getRawY()
            r12.f42174o = r13
            long r0 = r12.f42163d
            long r0 = r0 + r2
            r12.f42163d = r0
        L_0x0132:
            r12.f42175p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bee.mo27638a(android.view.MotionEvent):void");
    }

    /* renamed from: a */
    public final void mo27637a(int i, int i2, int i3) {
        if (this.f42161b != null) {
            this.f42161b.recycle();
        }
        if (this.f42176q != null) {
            this.f42161b = MotionEvent.obtain(0, (long) i3, 1, this.f42176q.density * ((float) i), this.f42176q.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f42161b = null;
        }
        this.f42175p = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[SYNTHETIC, Splitter:B:16:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a A[Catch:{ Exception -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066 A[SYNTHETIC, Splitter:B:31:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025 A[SYNTHETIC, Splitter:B:8:0x0025] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m35472a(android.content.Context r10, java.lang.String r11, boolean r12, android.view.View r13, android.app.Activity r14, byte[] r15) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.bey r15 = f42160a
            r0 = 0
            if (r15 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r15 = com.google.android.gms.internal.ads.C15740bx.f44310br
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r15 = r1.mo30717a(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.bey r15 = f42160a
            com.google.android.gms.internal.ads.bea r15 = r15.f42225j
            goto L_0x001d
        L_0x001c:
            r15 = r0
        L_0x001d:
            long r1 = java.lang.System.currentTimeMillis()
            r7 = -1
            r8 = 1
            if (r12 == 0) goto L_0x0033
            com.google.android.gms.internal.ads.amq$a$a r10 = r9.mo30074a(r10, r13, r14)     // Catch:{ Exception -> 0x0030 }
            r9.f42179t = r8     // Catch:{ Exception -> 0x002c }
            goto L_0x0037
        L_0x002c:
            r13 = move-exception
            r0 = r10
            r6 = r13
            goto L_0x004b
        L_0x0030:
            r10 = move-exception
            r6 = r10
            goto L_0x004b
        L_0x0033:
            com.google.android.gms.internal.ads.amq$a$a r10 = r9.mo30075a(r10, r0)     // Catch:{ Exception -> 0x0030 }
        L_0x0037:
            r0 = r10
            if (r15 == 0) goto L_0x0060
            if (r12 == 0) goto L_0x003f
            r10 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0041
        L_0x003f:
            r10 = 1000(0x3e8, float:1.401E-42)
        L_0x0041:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0030 }
            r3 = 0
            long r13 = r13 - r1
            r15.mo30068a(r10, r7, r13)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0060
        L_0x004b:
            if (r15 == 0) goto L_0x0060
            if (r12 == 0) goto L_0x0052
            r10 = 1003(0x3eb, float:1.406E-42)
            goto L_0x0054
        L_0x0052:
            r10 = 1001(0x3e9, float:1.403E-42)
        L_0x0054:
            r3 = -1
            long r13 = java.lang.System.currentTimeMillis()
            long r4 = r13 - r1
            r1 = r15
            r2 = r10
            r1.mo30069a(r2, r3, r4, r6)
        L_0x0060:
            long r13 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L_0x013c
            com.google.android.gms.internal.ads.azj r10 = r0.mo29832e()     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.axz r10 = (com.google.android.gms.internal.ads.axz) r10     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$a r10 = (com.google.android.gms.internal.ads.amq.C15587a) r10     // Catch:{ Exception -> 0x0139 }
            int r10 = r10.mo29824i()     // Catch:{ Exception -> 0x0139 }
            if (r10 != 0) goto L_0x0076
            goto L_0x013c
        L_0x0076:
            com.google.android.gms.internal.ads.azj r10 = r0.mo29832e()     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.axz r10 = (com.google.android.gms.internal.ads.axz) r10     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$a r10 = (com.google.android.gms.internal.ads.amq.C15587a) r10     // Catch:{ Exception -> 0x0139 }
            byte[] r10 = r10.mo29580f()     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C15740bx.f44268bB     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ Exception -> 0x0139 }
            java.lang.Object r0 = r1.mo30717a(r0)     // Catch:{ Exception -> 0x0139 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0139 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0139 }
            r1 = 0
            if (r0 != 0) goto L_0x00cd
            com.google.android.gms.internal.ads.apn r0 = com.google.android.gms.internal.ads.bfe.f42245a     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x00c7
            if (r11 == 0) goto L_0x00a0
            byte[] r11 = r11.getBytes()     // Catch:{ Exception -> 0x0139 }
            goto L_0x00a2
        L_0x00a0:
            byte[] r11 = new byte[r1]     // Catch:{ Exception -> 0x0139 }
        L_0x00a2:
            com.google.android.gms.internal.ads.apn r0 = com.google.android.gms.internal.ads.bfe.f42245a     // Catch:{ Exception -> 0x0139 }
            byte[] r10 = r0.mo29444a(r10, r11)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$f$a r11 = com.google.android.gms.internal.ads.amq.C15604f.m33608a()     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.awo r10 = com.google.android.gms.internal.ads.awo.zzy(r10)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$f$a r10 = r11.mo29344a(r10)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.ase r11 = com.google.android.gms.internal.ads.ase.TINK_HYBRID     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$f$a r10 = r10.mo29343a(r11)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.azj r10 = r10.mo29832e()     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.axz r10 = (com.google.android.gms.internal.ads.axz) r10     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$f r10 = (com.google.android.gms.internal.ads.amq.C15604f) r10     // Catch:{ Exception -> 0x0139 }
            byte[] r10 = r10.mo29580f()     // Catch:{ Exception -> 0x0139 }
            goto L_0x0122
        L_0x00c7:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException     // Catch:{ Exception -> 0x0139 }
            r10.<init>()     // Catch:{ Exception -> 0x0139 }
            throw r10     // Catch:{ Exception -> 0x0139 }
        L_0x00cd:
            r0 = 255(0xff, float:3.57E-43)
            java.util.Vector r0 = com.google.android.gms.internal.ads.bbo.m35263a(r10, r0)     // Catch:{ Exception -> 0x0139 }
            if (r0 == 0) goto L_0x0114
            int r2 = r0.size()     // Catch:{ Exception -> 0x0139 }
            if (r2 != 0) goto L_0x00dc
            goto L_0x0114
        L_0x00dc:
            com.google.android.gms.internal.ads.amq$f$a r2 = com.google.android.gms.internal.ads.amq.C15604f.m33608a()     // Catch:{ Exception -> 0x0139 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0139 }
        L_0x00e4:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x0139 }
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x0139 }
            byte[] r3 = (byte[]) r3     // Catch:{ Exception -> 0x0139 }
            byte[] r3 = com.google.android.gms.internal.ads.bbo.m35266a(r3, r11, r1)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.awo r3 = com.google.android.gms.internal.ads.awo.zzy(r3)     // Catch:{ Exception -> 0x0139 }
            r2.mo29344a(r3)     // Catch:{ Exception -> 0x0139 }
            goto L_0x00e4
        L_0x00fc:
            byte[] r10 = com.google.android.gms.internal.ads.bbo.m35265a(r10)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.awo r10 = com.google.android.gms.internal.ads.awo.zzy(r10)     // Catch:{ Exception -> 0x0139 }
            r2.mo29345b(r10)     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.azj r10 = r2.mo29832e()     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.axz r10 = (com.google.android.gms.internal.ads.axz) r10     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$f r10 = (com.google.android.gms.internal.ads.amq.C15604f) r10     // Catch:{ Exception -> 0x0139 }
            byte[] r10 = r10.mo29580f()     // Catch:{ Exception -> 0x0139 }
            goto L_0x0122
        L_0x0114:
            com.google.android.gms.internal.ads.amq$a$d r10 = com.google.android.gms.internal.ads.amq.C15587a.C15591d.PSN_ENCODE_SIZE_FAIL     // Catch:{ Exception -> 0x0139 }
            com.google.android.gms.internal.ads.amq$a r10 = com.google.android.gms.internal.ads.bbo.m35262a(r10)     // Catch:{ Exception -> 0x0139 }
            byte[] r10 = r10.mo29580f()     // Catch:{ Exception -> 0x0139 }
            byte[] r10 = com.google.android.gms.internal.ads.bbo.m35266a(r10, r11, r8)     // Catch:{ Exception -> 0x0139 }
        L_0x0122:
            java.lang.String r10 = com.google.android.gms.internal.ads.azm.m34870a(r10, r8)     // Catch:{ Exception -> 0x0139 }
            if (r15 == 0) goto L_0x015f
            if (r12 == 0) goto L_0x012d
            r11 = 1006(0x3ee, float:1.41E-42)
            goto L_0x012f
        L_0x012d:
            r11 = 1004(0x3ec, float:1.407E-42)
        L_0x012f:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0139 }
            r2 = 0
            long r0 = r0 - r13
            r15.mo30068a(r11, r7, r0)     // Catch:{ Exception -> 0x0139 }
            goto L_0x015f
        L_0x0139:
            r10 = move-exception
            r6 = r10
            goto L_0x0142
        L_0x013c:
            r10 = 5
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ Exception -> 0x0139 }
            goto L_0x015f
        L_0x0142:
            r10 = 7
            java.lang.String r10 = java.lang.Integer.toString(r10)
            if (r15 == 0) goto L_0x015f
            if (r12 == 0) goto L_0x0150
            r11 = 1007(0x3ef, float:1.411E-42)
            r2 = 1007(0x3ef, float:1.411E-42)
            goto L_0x0154
        L_0x0150:
            r11 = 1005(0x3ed, float:1.408E-42)
            r2 = 1005(0x3ed, float:1.408E-42)
        L_0x0154:
            r3 = -1
            long r11 = java.lang.System.currentTimeMillis()
            long r4 = r11 - r13
            r1 = r15
            r1.mo30069a(r2, r3, r4, r6)
        L_0x015f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bee.m35472a(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }
}

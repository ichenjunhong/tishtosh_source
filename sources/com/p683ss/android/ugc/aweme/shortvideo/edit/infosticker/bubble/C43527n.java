package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.n */
public final class C43527n extends C43514c {

    /* renamed from: j */
    public static final float f110091j;

    /* renamed from: k */
    public static final float f110092k;

    /* renamed from: l */
    public static final float f110093l;

    /* renamed from: m */
    public static final float f110094m;

    /* renamed from: n */
    public static final float f110095n;

    /* renamed from: o */
    public static final float f110096o;

    /* renamed from: p */
    public static final float f110097p;

    /* renamed from: q */
    public static final float f110098q;

    /* renamed from: r */
    public static final float f110099r;

    /* renamed from: s */
    public static final float f110100s;

    /* renamed from: t */
    public static final C43528a f110101t = new C43528a(null);

    /* renamed from: e */
    public boolean f110102e;

    /* renamed from: f */
    public RectF f110103f = new RectF();

    /* renamed from: g */
    public int f110104g;

    /* renamed from: h */
    public int f110105h;

    /* renamed from: i */
    public float f110106i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.n$a */
    public static final class C43528a {
        private C43528a() {
        }

        public /* synthetic */ C43528a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    private static float m95486a(float f) {
        while (f < 0.0f) {
            f += 360.0f;
        }
        while (f > 360.0f) {
            f -= 360.0f;
        }
        return f;
    }

    /* renamed from: v */
    private final float m95494v() {
        double d = (double) f110094m;
        double cos = Math.cos(Math.toRadians((double) m95486a(this.f110106i)));
        Double.isNaN(d);
        return Math.abs((float) (d * cos));
    }

    /* renamed from: t */
    private final void m95492t() {
        mo88550c(48);
        mo88557f((int) (((float) mo88571k()) / 2.0f));
        int g = mo88559g();
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        Context context = contentView.getContext();
        C52711k.m112236a((Object) context, "contentView.context");
        mo88557f(g - ((int) C43518e.m95450a(context, 3.5f)));
    }

    /* renamed from: u */
    private final float m95493u() {
        double d;
        float a = m95486a(this.f110106i);
        double d2 = (double) f110094m;
        double sin = Math.sin(Math.toRadians((double) a));
        Double.isNaN(d2);
        double d3 = d2 * sin;
        if (a <= 90.0f) {
            d = Math.abs(d3);
        } else if (a <= 180.0f || a > 270.0f) {
            d = -Math.abs(d3);
        } else {
            d = Math.abs(d3);
        }
        return (float) d;
    }

    static {
        Application b = C39629l.m88233b();
        C52711k.m112236a((Object) b, "CameraClient.getApplication()");
        f110091j = C9432q.m18687b(b.getApplicationContext(), 37.0f);
        Application b2 = C39629l.m88233b();
        C52711k.m112236a((Object) b2, "CameraClient.getApplication()");
        f110092k = C9432q.m18687b(b2.getApplicationContext(), 25.0f);
        Application b3 = C39629l.m88233b();
        C52711k.m112236a((Object) b3, "CameraClient.getApplication()");
        f110093l = C9432q.m18687b(b3.getApplicationContext(), 7.0f);
        Application b4 = C39629l.m88233b();
        C52711k.m112236a((Object) b4, "CameraClient.getApplication()");
        f110094m = C9432q.m18687b(b4.getApplicationContext(), 8.0f);
        Application b5 = C39629l.m88233b();
        C52711k.m112236a((Object) b5, "CameraClient.getApplication()");
        f110095n = C9432q.m18687b(b5.getApplicationContext(), 30.0f);
        Application b6 = C39629l.m88233b();
        C52711k.m112236a((Object) b6, "CameraClient.getApplication()");
        f110096o = C9432q.m18687b(b6.getApplicationContext(), 8.0f);
        Application b7 = C39629l.m88233b();
        C52711k.m112236a((Object) b7, "CameraClient.getApplication()");
        f110097p = C9432q.m18687b(b7.getApplicationContext(), 1.0f);
        Application b8 = C39629l.m88233b();
        C52711k.m112236a((Object) b8, "CameraClient.getApplication()");
        f110098q = C9432q.m18687b(b8.getApplicationContext(), 12.0f);
        Application b9 = C39629l.m88233b();
        C52711k.m112236a((Object) b9, "CameraClient.getApplication()");
        f110099r = C9432q.m18687b(b9.getApplicationContext(), 42.0f);
        Application b10 = C39629l.m88233b();
        C52711k.m112236a((Object) b10, "CameraClient.getApplication()");
        f110100s = C9432q.m18687b(b10.getApplicationContext(), 48.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03ae  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88589b(android.view.View r14) {
        /*
            r13 = this;
            android.app.Activity r0 = r13.f110070b
            java.lang.String r1 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x03c2
            if (r14 == 0) goto L_0x03c2
            android.os.IBinder r0 = r14.getWindowToken()
            if (r0 != 0) goto L_0x0017
            goto L_0x03c2
        L_0x0017:
            android.view.View r0 = r13.getContentView()
            java.lang.Runnable r1 = r13.mo88579s()
            r0.removeCallbacks(r1)
            boolean r0 = r13.isShowing()
            if (r0 != 0) goto L_0x03be
            android.graphics.RectF r2 = r13.f110103f
            float r3 = r13.f110106i
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r13
            android.graphics.PointF r0 = r1.m95488a(r2, r3, false)
            float r0 = r0.y
            int r1 = r13.mo88570j()
            float r1 = (float) r1
            float r2 = f110095n
            float r1 = r1 - r2
            float r0 = r0 - r1
            float r1 = f110096o
            r2 = 0
            r3 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            android.graphics.RectF r0 = r13.f110103f
            float r1 = r13.f110106i
            android.graphics.PointF r0 = r13.m95488a(r0, r1, r3)
            android.view.View r1 = r13.getContentView()
            java.lang.String r4 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            android.content.Context r1 = r1.getContext()
            int r1 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58221a(r1)
            float r1 = (float) r1
            float r0 = r0.y
            int r4 = r13.mo88570j()
            float r4 = (float) r4
            float r5 = f110095n
            float r4 = r4 - r5
            float r0 = r0 + r4
            float r1 = r1 - r0
            float r0 = f110096o
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r1 = 1073741824(0x40000000, float:2.0)
            r4 = 80
            if (r0 == 0) goto L_0x0095
            r13.m95492t()
            android.graphics.PointF r0 = new android.graphics.PointF
            int r5 = r13.f110104g
            float r5 = (float) r5
            int r6 = r13.f110105h
            float r6 = (float) r6
            int r7 = r13.mo88570j()
            float r7 = (float) r7
            float r8 = f110091j
            float r7 = r7 - r8
            float r6 = r6 - r7
            r0.<init>(r5, r6)
            goto L_0x030d
        L_0x0095:
            r13.m95492t()
            android.graphics.RectF r8 = r13.f110103f
            float r9 = r13.f110106i
            r10 = 0
            r11 = 4
            r12 = 0
            r7 = r13
            android.graphics.PointF r0 = r7.m95488a(r8, r9, false)
            float r5 = r0.y
            int r6 = r13.mo88570j()
            float r6 = (float) r6
            float r7 = f110095n
            float r6 = r6 - r7
            float r5 = r5 - r6
            float r6 = f110096o
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00c0
            r13.mo88550c(r4)
            android.graphics.RectF r0 = r13.f110103f
            float r5 = r13.f110106i
            android.graphics.PointF r0 = r13.m95488a(r0, r5, r3)
        L_0x00c0:
            android.graphics.RectF r5 = r13.f110103f
            float r6 = r13.f110106i
            int r7 = r13.cc_()
            if (r7 != r4) goto L_0x00cc
            r7 = 1
            goto L_0x00cd
        L_0x00cc:
            r7 = 0
        L_0x00cd:
            float[] r5 = m95490a(r5, r6)
            r6 = r5[r3]
            r8 = 3
            r8 = r5[r8]
            float r6 = r6 + r8
            r8 = 5
            r8 = r5[r8]
            r9 = 7
            r9 = r5[r9]
            float r8 = r8 + r9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00eb
            if (r7 != 0) goto L_0x00eb
            r6 = 2
            r6 = r5[r6]
            r5 = r5[r2]
            float r6 = r6 - r5
            goto L_0x00f2
        L_0x00eb:
            r6 = 6
            r6 = r5[r6]
            r7 = 4
            r5 = r5[r7]
            float r6 = r6 - r5
        L_0x00f2:
            float r5 = r0.x
            int r7 = r13.mo88571k()
            float r7 = (float) r7
            float r8 = f110095n
            float r7 = r7 - r8
            float r7 = r7 / r1
            float r5 = r5 - r7
            float r7 = f110097p
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a3
            float r5 = f110097p
            float r7 = r0.x
            int r8 = r13.mo88571k()
            float r8 = (float) r8
            float r9 = f110095n
            float r8 = r8 - r9
            float r8 = r8 / r1
            float r7 = r7 - r8
            float r5 = r5 - r7
            int r5 = (int) r5
            r13.mo88554d(r5)
            android.graphics.RectF r5 = r13.f110103f
            float r7 = r13.f110106i
            int r8 = r13.cc_()
            if (r8 != r4) goto L_0x0123
            r8 = 1
            goto L_0x0124
        L_0x0123:
            r8 = 0
        L_0x0124:
            int r9 = r13.cd_()
            float r9 = (float) r9
            float r5 = r13.m95491b(r5, r7, r8, r9)
            int r5 = (int) r5
            r13.mo88555e(r5)
            int r5 = r13.cd_()
            float r5 = (float) r5
            float r7 = r6 / r1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0149
            int r5 = r13.cd_()
            float r5 = (float) r5
            float r5 = r7 - r5
            float r8 = f110098q
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0156
        L_0x0149:
            int r5 = r13.cd_()
            float r5 = (float) r5
            float r8 = java.lang.Math.abs(r7)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a3
        L_0x0156:
            int r5 = r13.mo88559g()
            float r8 = f110098q
            float r9 = java.lang.Math.abs(r7)
            int r10 = r13.cd_()
            float r10 = (float) r10
            float r9 = r9 - r10
            float r8 = r8 - r9
            int r8 = (int) r8
            int r5 = r5 - r8
            r13.mo88557f(r5)
            int r5 = r13.mo88559g()
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            float r8 = f110099r
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0181
            int r5 = r13.mo88559g()
            if (r5 >= 0) goto L_0x0187
        L_0x0181:
            float r5 = f110099r
            int r5 = (int) r5
            r13.mo88557f(r5)
        L_0x0187:
            android.graphics.RectF r5 = r13.f110103f
            float r8 = r13.f110106i
            int r9 = r13.cc_()
            if (r9 != r4) goto L_0x0193
            r9 = 1
            goto L_0x0194
        L_0x0193:
            r9 = 0
        L_0x0194:
            float r7 = java.lang.Math.abs(r7)
            float r10 = f110098q
            float r7 = r7 - r10
            float r5 = r13.m95491b(r5, r8, r9, r7)
            int r5 = (int) r5
            r13.mo88555e(r5)
        L_0x01a3:
            android.app.Activity r5 = r13.f110070b
            android.content.Context r5 = (android.content.Context) r5
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58224b(r5)
            float r5 = (float) r5
            float r7 = r0.x
            int r8 = r13.mo88571k()
            float r8 = (float) r8
            float r9 = f110099r
            float r8 = r8 - r9
            float r8 = r8 / r1
            float r7 = r7 + r8
            float r5 = r5 - r7
            float r7 = f110097p
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x026d
            android.app.Activity r5 = r13.f110070b
            android.content.Context r5 = (android.content.Context) r5
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58224b(r5)
            float r5 = (float) r5
            float r7 = r0.x
            int r8 = r13.mo88571k()
            float r8 = (float) r8
            float r9 = f110099r
            float r8 = r8 - r9
            float r8 = r8 / r1
            float r7 = r7 + r8
            float r5 = r5 - r7
            float r7 = f110097p
            float r5 = r5 - r7
            int r5 = (int) r5
            r13.mo88554d(r5)
            android.graphics.RectF r5 = r13.f110103f
            float r7 = r13.f110106i
            int r8 = r13.cc_()
            if (r8 != r4) goto L_0x01e8
            r8 = 1
            goto L_0x01e9
        L_0x01e8:
            r8 = 0
        L_0x01e9:
            int r9 = r13.cd_()
            float r9 = (float) r9
            float r5 = r13.m95491b(r5, r7, r8, r9)
            int r5 = (int) r5
            r13.mo88555e(r5)
            int r5 = r13.cd_()
            int r5 = -r5
            float r5 = (float) r5
            float r6 = r6 / r1
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x020d
            int r5 = r13.cd_()
            float r5 = (float) r5
            float r5 = r5 + r6
            float r7 = f110098q
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x021a
        L_0x020d:
            int r5 = r13.cd_()
            float r5 = (float) r5
            float r7 = java.lang.Math.abs(r6)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x026d
        L_0x021a:
            int r5 = r13.mo88559g()
            float r7 = f110098q
            float r8 = java.lang.Math.abs(r6)
            int r9 = r13.cd_()
            float r9 = (float) r9
            float r8 = r8 + r9
            float r7 = r7 - r8
            int r7 = (int) r7
            int r5 = r5 + r7
            r13.mo88557f(r5)
            int r5 = r13.mo88559g()
            int r5 = java.lang.Math.abs(r5)
            float r5 = (float) r5
            int r7 = r13.mo88571k()
            float r7 = (float) r7
            float r8 = f110100s
            float r7 = r7 - r8
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0251
            int r5 = r13.mo88571k()
            float r5 = (float) r5
            float r7 = f110100s
            float r5 = r5 - r7
            int r5 = (int) r5
            r13.mo88557f(r5)
        L_0x0251:
            android.graphics.RectF r5 = r13.f110103f
            float r7 = r13.f110106i
            int r8 = r13.cc_()
            if (r8 != r4) goto L_0x025d
            r8 = 1
            goto L_0x025e
        L_0x025d:
            r8 = 0
        L_0x025e:
            float r9 = f110098q
            float r6 = java.lang.Math.abs(r6)
            float r9 = r9 - r6
            float r5 = r13.m95491b(r5, r7, r8, r9)
            int r5 = (int) r5
            r13.mo88555e(r5)
        L_0x026d:
            float r5 = r0.y
            float r6 = f110096o
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0298
            float r5 = f110096o
            float r6 = r0.y
            float r5 = r5 - r6
            int r5 = (int) r5
            r13.mo88555e(r5)
            android.graphics.RectF r5 = r13.f110103f
            float r6 = r13.f110106i
            int r7 = r13.cc_()
            if (r7 != r4) goto L_0x028a
            r7 = 1
            goto L_0x028b
        L_0x028a:
            r7 = 0
        L_0x028b:
            int r8 = r13.mo88549c()
            float r8 = (float) r8
            float r5 = r13.m95487a(r5, r6, r7, r8)
            int r5 = (int) r5
            r13.mo88554d(r5)
        L_0x0298:
            float r5 = r0.y
            android.view.View r6 = r13.getContentView()
            java.lang.String r7 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            android.content.Context r6 = r6.getContext()
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58229e(r6)
            float r6 = (float) r6
            float r7 = f110096o
            float r6 = r6 - r7
            int r7 = r13.mo88570j()
            float r7 = (float) r7
            float r8 = f110095n
            float r7 = r7 - r8
            float r6 = r6 - r7
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x02fb
            android.view.View r5 = r13.getContentView()
            java.lang.String r6 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            android.content.Context r5 = r5.getContext()
            int r5 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58229e(r5)
            float r5 = (float) r5
            float r6 = f110096o
            float r5 = r5 - r6
            int r6 = r13.mo88570j()
            float r6 = (float) r6
            float r7 = f110095n
            float r6 = r6 - r7
            float r5 = r5 - r6
            float r6 = r0.y
            float r5 = r5 - r6
            int r5 = (int) r5
            r13.mo88555e(r5)
            android.graphics.RectF r5 = r13.f110103f
            float r6 = r13.f110106i
            int r7 = r13.cc_()
            if (r7 != r4) goto L_0x02ed
            r7 = 1
            goto L_0x02ee
        L_0x02ed:
            r7 = 0
        L_0x02ee:
            int r8 = r13.mo88549c()
            float r8 = (float) r8
            float r5 = r13.m95487a(r5, r6, r7, r8)
            int r5 = (int) r5
            r13.mo88554d(r5)
        L_0x02fb:
            boolean r5 = com.p683ss.android.ugc.aweme.adaptation.C22452a.m55499e()
            if (r5 != 0) goto L_0x030d
            int r5 = r13.mo88549c()
            int r6 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58225c()
            int r5 = r5 - r6
            r13.mo88555e(r5)
        L_0x030d:
            int r5 = r13.cc_()
            int r5 = r13.mo88547b(r5)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.FixBubbleLayout r6 = r13.mo88544b()
            int r7 = r13.mo88559g()
            float r7 = (float) r7
            r6.mo88529a(r5, r7)
            r13.mo88573m()
            int r5 = r13.cc_()
            r6 = 48
            if (r5 == r6) goto L_0x0360
            if (r5 == r4) goto L_0x032f
            goto L_0x03a1
        L_0x032f:
            float r4 = r0.x
            int r5 = r13.cd_()
            float r5 = (float) r5
            float r4 = r4 + r5
            int r5 = r13.mo88571k()
            float r5 = (float) r5
            float r5 = r5 / r1
            float r4 = r4 - r5
            float r1 = r13.m95493u()
            float r4 = r4 + r1
            int r1 = (int) r4
            float r0 = r0.y
            int r4 = r13.mo88549c()
            float r4 = (float) r4
            float r0 = r0 + r4
            float r4 = f110093l
            float r0 = r0 + r4
            float r4 = r13.m95494v()
            float r0 = r0 + r4
            int r0 = (int) r0
            r13.showAtLocation(r14, r2, r1, r0)
            int r14 = r13.cc_()
            r13.mo88562a(r3, r14)
            goto L_0x03a1
        L_0x0360:
            boolean r4 = r13.f110102e
            if (r4 == 0) goto L_0x0368
            float r4 = f110092k
            int r4 = (int) r4
            goto L_0x0369
        L_0x0368:
            r4 = 0
        L_0x0369:
            float r5 = r0.x
            int r6 = r13.cd_()
            float r6 = (float) r6
            float r5 = r5 + r6
            int r6 = r13.mo88571k()
            float r6 = (float) r6
            float r6 = r6 / r1
            float r5 = r5 - r6
            float r1 = r13.m95493u()
            float r5 = r5 + r1
            int r1 = (int) r5
            float r0 = r0.y
            int r5 = r13.mo88549c()
            float r5 = (float) r5
            float r0 = r0 + r5
            int r5 = r13.mo88570j()
            float r5 = (float) r5
            float r6 = f110091j
            float r5 = r5 - r6
            float r0 = r0 - r5
            float r5 = r13.m95494v()
            float r0 = r0 - r5
            float r4 = (float) r4
            float r0 = r0 + r4
            int r0 = (int) r0
            r13.showAtLocation(r14, r2, r1, r0)
            int r14 = r13.cc_()
            r13.mo88562a(r3, r14)
        L_0x03a1:
            r13.mo88567e(r2)
            long r0 = r13.mo88578r()
            r2 = 0
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 <= 0) goto L_0x03c1
            android.view.View r14 = r13.getContentView()
            java.lang.Runnable r0 = r13.mo88579s()
            long r1 = r13.mo88578r()
            r14.postDelayed(r0, r1)
            return
        L_0x03be:
            super.dismiss()
        L_0x03c1:
            return
        L_0x03c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43527n.mo88589b(android.view.View):void");
    }

    public C43527n(Activity activity, boolean z) {
        super(activity, false);
    }

    /* renamed from: a */
    private static float[] m95490a(RectF rectF, float f) {
        float[] fArr = {rectF.left, rectF.top, rectF.right, rectF.top, rectF.left, rectF.bottom, rectF.right, rectF.bottom};
        Matrix matrix = new Matrix();
        matrix.postRotate(f, ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final PointF m95488a(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float[] a = m95490a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            pointF.set((a[4] + a[6]) / 2.0f, (a[5] + a[7]) / 2.0f);
        } else {
            pointF.set((a[0] + a[2]) / 2.0f, (a[1] + a[3]) / 2.0f);
        }
        return pointF;
    }

    /* renamed from: a */
    private final float m95487a(RectF rectF, float f, boolean z, float f2) {
        float f3;
        float[] a = m95490a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            f3 = (a[7] - a[5]) / (a[6] - a[4]);
        } else {
            f3 = (a[3] - a[1]) / (a[2] - a[0]);
        }
        return f2 / f3;
    }

    /* renamed from: b */
    private final float m95491b(RectF rectF, float f, boolean z, float f2) {
        float f3;
        float[] a = m95490a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            f3 = (a[7] - a[5]) / (a[6] - a[4]);
        } else {
            f3 = (a[3] - a[1]) / (a[2] - a[0]);
        }
        float abs = (Math.abs(a[2] - a[0]) * f3) / 2.0f;
        float f4 = f3 * f2;
        if (Math.abs(abs) >= Math.abs(f4)) {
            return f4;
        }
        if ((f4 < 0.0f && abs > 0.0f) || (f4 > 0.0f && abs < 0.0f)) {
            abs = -abs;
        }
        return abs;
    }
}

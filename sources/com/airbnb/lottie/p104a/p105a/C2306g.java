package com.airbnb.lottie.p104a.p105a;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.support.p030v4.p038f.C0785g;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.p110b.C2359c;
import com.airbnb.lottie.p108c.p110b.C2360d;
import com.airbnb.lottie.p108c.p110b.C2362f;
import com.airbnb.lottie.p108c.p111c.C2382a;
import com.airbnb.lottie.p114f.C2453e;
import com.airbnb.lottie.p115g.C2470c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.g */
public final class C2306g implements C2303d, C2309j, C2321a {

    /* renamed from: a */
    private final String f7169a;

    /* renamed from: b */
    private final C2382a f7170b;

    /* renamed from: c */
    private final C0785g<LinearGradient> f7171c = new C0785g<>();

    /* renamed from: d */
    private final C0785g<RadialGradient> f7172d = new C0785g<>();

    /* renamed from: e */
    private final Matrix f7173e = new Matrix();

    /* renamed from: f */
    private final Path f7174f = new Path();

    /* renamed from: g */
    private final Paint f7175g = new Paint(1);

    /* renamed from: h */
    private final RectF f7176h = new RectF();

    /* renamed from: i */
    private final List<C2312l> f7177i = new ArrayList();

    /* renamed from: j */
    private final C2362f f7178j;

    /* renamed from: k */
    private final C2320a<C2359c, C2359c> f7179k;

    /* renamed from: l */
    private final C2320a<Integer, Integer> f7180l;

    /* renamed from: m */
    private final C2320a<PointF, PointF> f7181m;

    /* renamed from: n */
    private final C2320a<PointF, PointF> f7182n;

    /* renamed from: o */
    private C2320a<ColorFilter, ColorFilter> f7183o;

    /* renamed from: p */
    private final C2455g f7184p;

    /* renamed from: q */
    private final int f7185q;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7169a;
    }

    /* renamed from: a */
    public final void mo6707a() {
        this.f7184p.invalidateSelf();
    }

    /* renamed from: c */
    private int m6881c() {
        int i;
        int round = Math.round(this.f7181m.f7252c * ((float) this.f7185q));
        int round2 = Math.round(this.f7182n.f7252c * ((float) this.f7185q));
        int round3 = Math.round(this.f7179k.f7252c * ((float) this.f7185q));
        if (round != 0) {
            i = round * 527;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        if (t == C2474j.f7659x) {
            if (cVar == null) {
                this.f7183o = null;
                return;
            }
            this.f7183o = new C2336p(cVar);
            this.f7183o.mo6722a((C2321a) this);
            this.f7170b.mo6752a(this.f7183o);
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        this.f7174f.reset();
        for (int i = 0; i < this.f7177i.size(); i++) {
            this.f7174f.addPath(((C2312l) this.f7177i.get(i)).mo6716e(), matrix);
        }
        this.f7174f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C2301b bVar = (C2301b) list2.get(i);
            if (bVar instanceof C2312l) {
                this.f7177i.add((C2312l) bVar);
            }
        }
    }

    public C2306g(C2455g gVar, C2382a aVar, C2360d dVar) {
        this.f7170b = aVar;
        this.f7169a = dVar.f7338g;
        this.f7184p = gVar;
        this.f7178j = dVar.f7332a;
        this.f7174f.setFillType(dVar.f7333b);
        this.f7185q = (int) (gVar.f7570a.mo6777a() / 32.0f);
        this.f7179k = dVar.f7334c.mo6735a();
        this.f7179k.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7179k);
        this.f7180l = dVar.f7335d.mo6735a();
        this.f7180l.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7180l);
        this.f7181m = dVar.f7336e.mo6735a();
        this.f7181m.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7181m);
        this.f7182n = dVar.f7337f.mo6735a();
        this.f7182n.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7182n);
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r3v13, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r8v0, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v24, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v13, types: [android.graphics.RadialGradient]
      assigns: [android.graphics.RadialGradient, android.graphics.LinearGradient, ?[OBJECT, ARRAY]]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], android.graphics.Shader, android.graphics.RadialGradient]
      mth insns count: 116
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6708a(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "GradientFillContent#draw"
            com.airbnb.lottie.C2340c.m6969b(r2)
            android.graphics.Path r2 = r0.f7174f
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x0010:
            java.util.List<com.airbnb.lottie.a.a.l> r4 = r0.f7177i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f7174f
            java.util.List<com.airbnb.lottie.a.a.l> r5 = r0.f7177i
            java.lang.Object r5 = r5.get(r3)
            com.airbnb.lottie.a.a.l r5 = (com.airbnb.lottie.p104a.p105a.C2312l) r5
            android.graphics.Path r5 = r5.mo6716e()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f7174f
            android.graphics.RectF r4 = r0.f7176h
            r3.computeBounds(r4, r2)
            com.airbnb.lottie.c.b.f r3 = r0.f7178j
            com.airbnb.lottie.c.b.f r4 = com.airbnb.lottie.p108c.p110b.C2362f.Linear
            if (r3 != r4) goto L_0x007d
            int r3 = r16.m6881c()
            android.support.v4.f.g<android.graphics.LinearGradient> r4 = r0.f7171c
            long r5 = (long) r3
            java.lang.Object r3 = r4.mo2487a(r5)
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            if (r3 == 0) goto L_0x004a
            goto L_0x00c7
        L_0x004a:
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f7181m
            java.lang.Object r3 = r3.mo6726d()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r4 = r0.f7182n
            java.lang.Object r4 = r4.mo6726d()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.a<com.airbnb.lottie.c.b.c, com.airbnb.lottie.c.b.c> r7 = r0.f7179k
            java.lang.Object r7 = r7.mo6726d()
            com.airbnb.lottie.c.b.c r7 = (com.airbnb.lottie.p108c.p110b.C2359c) r7
            int[] r13 = r7.f7331b
            float[] r14 = r7.f7330a
            android.graphics.LinearGradient r7 = new android.graphics.LinearGradient
            float r9 = r3.x
            float r10 = r3.y
            float r11 = r4.x
            float r12 = r4.y
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            android.support.v4.f.g<android.graphics.LinearGradient> r3 = r0.f7171c
            r3.mo2493b(r5, r7)
            r3 = r7
            goto L_0x00c7
        L_0x007d:
            int r3 = r16.m6881c()
            android.support.v4.f.g<android.graphics.RadialGradient> r4 = r0.f7172d
            long r5 = (long) r3
            java.lang.Object r3 = r4.mo2487a(r5)
            android.graphics.RadialGradient r3 = (android.graphics.RadialGradient) r3
            if (r3 == 0) goto L_0x008d
            goto L_0x00c7
        L_0x008d:
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.f7181m
            java.lang.Object r3 = r3.mo6726d()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r4 = r0.f7182n
            java.lang.Object r4 = r4.mo6726d()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.a<com.airbnb.lottie.c.b.c, com.airbnb.lottie.c.b.c> r7 = r0.f7179k
            java.lang.Object r7 = r7.mo6726d()
            com.airbnb.lottie.c.b.c r7 = (com.airbnb.lottie.p108c.p110b.C2359c) r7
            int[] r12 = r7.f7331b
            float[] r13 = r7.f7330a
            float r9 = r3.x
            float r10 = r3.y
            float r3 = r4.x
            float r4 = r4.y
            float r3 = r3 - r9
            double r7 = (double) r3
            float r4 = r4 - r10
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r7, r3)
            float r11 = (float) r3
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            android.support.v4.f.g<android.graphics.RadialGradient> r4 = r0.f7172d
            r4.mo2493b(r5, r3)
        L_0x00c7:
            android.graphics.Matrix r4 = r0.f7173e
            r4.set(r1)
            android.graphics.Matrix r1 = r0.f7173e
            r3.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.f7175g
            r1.setShader(r3)
            com.airbnb.lottie.a.b.a<android.graphics.ColorFilter, android.graphics.ColorFilter> r1 = r0.f7183o
            if (r1 == 0) goto L_0x00e7
            android.graphics.Paint r1 = r0.f7175g
            com.airbnb.lottie.a.b.a<android.graphics.ColorFilter, android.graphics.ColorFilter> r3 = r0.f7183o
            java.lang.Object r3 = r3.mo6726d()
            android.graphics.ColorFilter r3 = (android.graphics.ColorFilter) r3
            r1.setColorFilter(r3)
        L_0x00e7:
            r1 = r19
            float r1 = (float) r1
            r3 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r3
            com.airbnb.lottie.a.b.a<java.lang.Integer, java.lang.Integer> r4 = r0.f7180l
            java.lang.Object r4 = r4.mo6726d()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r1 = r1 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            float r1 = r1 * r3
            int r1 = (int) r1
            android.graphics.Paint r3 = r0.f7175g
            r4 = 255(0xff, float:3.57E-43)
            int r1 = com.airbnb.lottie.p114f.C2453e.m7171a(r1, r2, r4)
            r3.setAlpha(r1)
            android.graphics.Path r1 = r0.f7174f
            android.graphics.Paint r2 = r0.f7175g
            r3 = r17
            r3.drawPath(r1, r2)
            java.lang.String r1 = "GradientFillContent#draw"
            com.airbnb.lottie.C2340c.m6970c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p104a.p105a.C2306g.mo6708a(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        C2453e.m7174a(eVar, i, list, eVar2, this);
    }
}

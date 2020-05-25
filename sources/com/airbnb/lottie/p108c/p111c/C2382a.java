package com.airbnb.lottie.p108c.p111c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build.VERSION;
import com.airbnb.lottie.C2340c;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p105a.C2301b;
import com.airbnb.lottie.p104a.p105a.C2303d;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2323c;
import com.airbnb.lottie.p104a.p106b.C2327g;
import com.airbnb.lottie.p104a.p106b.C2335o;
import com.airbnb.lottie.p108c.C2398e;
import com.airbnb.lottie.p108c.C2399f;
import com.airbnb.lottie.p108c.p110b.C2363g;
import com.airbnb.lottie.p108c.p110b.C2363g.C2364a;
import com.airbnb.lottie.p108c.p111c.C2388d.C2389a;
import com.airbnb.lottie.p108c.p111c.C2388d.C2390b;
import com.airbnb.lottie.p115g.C2470c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.c.c.a */
public abstract class C2382a implements C2303d, C2321a, C2399f {

    /* renamed from: a */
    final Matrix f7416a;

    /* renamed from: b */
    final C2455g f7417b;

    /* renamed from: c */
    public final C2388d f7418c;

    /* renamed from: d */
    public C2382a f7419d;

    /* renamed from: e */
    public C2382a f7420e;

    /* renamed from: f */
    final C2335o f7421f;

    /* renamed from: g */
    private final Path f7422g = new Path();

    /* renamed from: h */
    private final Matrix f7423h = new Matrix();

    /* renamed from: i */
    private final Paint f7424i;

    /* renamed from: j */
    private final Paint f7425j;

    /* renamed from: k */
    private final Paint f7426k;

    /* renamed from: l */
    private final Paint f7427l;

    /* renamed from: m */
    private final Paint f7428m;

    /* renamed from: n */
    private final RectF f7429n;

    /* renamed from: o */
    private final RectF f7430o;

    /* renamed from: p */
    private final RectF f7431p;

    /* renamed from: q */
    private final RectF f7432q;

    /* renamed from: r */
    private final String f7433r;

    /* renamed from: s */
    private C2327g f7434s;

    /* renamed from: t */
    private List<C2382a> f7435t;

    /* renamed from: u */
    private final List<C2320a<?, ?>> f7436u;

    /* renamed from: v */
    private boolean f7437v;

    /* renamed from: com.airbnb.lottie.c.c.a$2 */
    static /* synthetic */ class C23842 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7440a = new int[C2389a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0072 */
        static {
            /*
                com.airbnb.lottie.c.b.g$a[] r0 = com.airbnb.lottie.p108c.p110b.C2363g.C2364a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7441b = r0
                r0 = 1
                int[] r1 = f7441b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.c.b.g$a r2 = com.airbnb.lottie.p108c.p110b.C2363g.C2364a.MaskModeSubtract     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f7441b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.c.b.g$a r3 = com.airbnb.lottie.p108c.p110b.C2363g.C2364a.MaskModeIntersect     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f7441b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.c.b.g$a r4 = com.airbnb.lottie.p108c.p110b.C2363g.C2364a.MaskModeAdd     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                com.airbnb.lottie.c.c.d$a[] r3 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f7440a = r3
                int[] r3 = f7440a     // Catch:{ NoSuchFieldError -> 0x003d }
                com.airbnb.lottie.c.c.d$a r4 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.Shape     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                int[] r0 = f7440a     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.airbnb.lottie.c.c.d$a r3 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.PreComp     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = f7440a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.airbnb.lottie.c.c.d$a r1 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.Solid     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0051:
                int[] r0 = f7440a     // Catch:{ NoSuchFieldError -> 0x005c }
                com.airbnb.lottie.c.c.d$a r1 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.Image     // Catch:{ NoSuchFieldError -> 0x005c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005c }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005c }
            L_0x005c:
                int[] r0 = f7440a     // Catch:{ NoSuchFieldError -> 0x0067 }
                com.airbnb.lottie.c.c.d$a r1 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.Null     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f7440a     // Catch:{ NoSuchFieldError -> 0x0072 }
                com.airbnb.lottie.c.c.d$a r1 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.Text     // Catch:{ NoSuchFieldError -> 0x0072 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0072 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0072 }
            L_0x0072:
                int[] r0 = f7440a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.airbnb.lottie.c.c.d$a r1 = com.airbnb.lottie.p108c.p111c.C2388d.C2389a.Unknown     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p108c.p111c.C2382a.C23842.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo6707a() {
        m7005d();
    }

    /* renamed from: a */
    public final void mo6712a(List<C2301b> list, List<C2301b> list2) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo6754b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6755b(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
    }

    /* renamed from: a */
    public final void mo6753a(boolean z) {
        if (z != this.f7437v) {
            this.f7437v = z;
            m7005d();
        }
    }

    /* renamed from: c */
    private boolean m7004c() {
        if (this.f7419d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m7005d() {
        this.f7417b.invalidateSelf();
    }

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7418c.f7453c;
    }

    /* renamed from: e */
    private boolean m7006e() {
        if (this.f7434s == null || this.f7434s.f7257a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo6752a(C2320a<?, ?> aVar) {
        this.f7436u.add(aVar);
    }

    /* renamed from: b */
    private void m7002b(float f) {
        this.f7417b.f7570a.f7515a.mo6878a(this.f7418c.f7453c, f);
    }

    /* renamed from: a */
    private void m6999a(Canvas canvas) {
        C2340c.m6969b("Layer#clearLayer");
        canvas.drawRect(this.f7429n.left - 1.0f, this.f7429n.top - 1.0f, this.f7429n.right + 1.0f, this.f7429n.bottom + 1.0f, this.f7428m);
        C2340c.m6970c("Layer#clearLayer");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6751a(float f) {
        C2335o oVar = this.f7421f;
        oVar.f7271a.mo6721a(f);
        oVar.f7272b.mo6721a(f);
        oVar.f7273c.mo6721a(f);
        oVar.f7274d.mo6721a(f);
        oVar.f7275e.mo6721a(f);
        if (oVar.f7276f != null) {
            oVar.f7276f.mo6721a(f);
        }
        if (oVar.f7277g != null) {
            oVar.f7277g.mo6721a(f);
        }
        if (this.f7434s != null) {
            for (int i = 0; i < this.f7434s.f7257a.size(); i++) {
                ((C2320a) this.f7434s.f7257a.get(i)).mo6721a(f);
            }
        }
        if (this.f7418c.f7463m != 0.0f) {
            f /= this.f7418c.f7463m;
        }
        if (this.f7419d != null) {
            this.f7419d.mo6751a(this.f7419d.f7418c.f7463m * f);
        }
        for (int i2 = 0; i2 < this.f7436u.size(); i2++) {
            ((C2320a) this.f7436u.get(i2)).mo6721a(f);
        }
    }

    /* renamed from: a */
    public <T> void mo6711a(T t, C2470c<T> cVar) {
        this.f7421f.mo6731a(t, cVar);
    }

    /* renamed from: a */
    public void mo6709a(RectF rectF, Matrix matrix) {
        this.f7416a.set(matrix);
        this.f7416a.preConcat(this.f7421f.mo6727a());
    }

    /* renamed from: b */
    private void m7003b(RectF rectF, Matrix matrix) {
        this.f7430o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m7006e()) {
            int size = this.f7434s.f7259c.size();
            int i = 0;
            while (i < size) {
                C2363g gVar = (C2363g) this.f7434s.f7259c.get(i);
                this.f7422g.set((Path) ((C2320a) this.f7434s.f7257a.get(i)).mo6726d());
                this.f7422g.transform(matrix);
                switch (gVar.f7354a) {
                    case MaskModeSubtract:
                        return;
                    case MaskModeIntersect:
                        return;
                    default:
                        this.f7422g.computeBounds(this.f7432q, false);
                        if (i == 0) {
                            this.f7430o.set(this.f7432q);
                        } else {
                            this.f7430o.set(Math.min(this.f7430o.left, this.f7432q.left), Math.min(this.f7430o.top, this.f7432q.top), Math.max(this.f7430o.right, this.f7432q.right), Math.max(this.f7430o.bottom, this.f7432q.bottom));
                        }
                        i++;
                }
            }
            rectF.set(Math.max(rectF.left, this.f7430o.left), Math.max(rectF.top, this.f7430o.top), Math.min(rectF.right, this.f7430o.right), Math.min(rectF.bottom, this.f7430o.bottom));
        }
    }

    C2382a(C2455g gVar, C2388d dVar) {
        boolean z = true;
        this.f7424i = new Paint(1);
        this.f7425j = new Paint(1);
        this.f7426k = new Paint(1);
        this.f7427l = new Paint(1);
        this.f7428m = new Paint();
        this.f7429n = new RectF();
        this.f7430o = new RectF();
        this.f7431p = new RectF();
        this.f7432q = new RectF();
        this.f7416a = new Matrix();
        this.f7436u = new ArrayList();
        this.f7437v = true;
        this.f7417b = gVar;
        this.f7418c = dVar;
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f7453c);
        sb.append("#draw");
        this.f7433r = sb.toString();
        this.f7428m.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f7425j.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        this.f7426k.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        if (dVar.f7471u == C2390b.Invert) {
            this.f7427l.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        } else {
            this.f7427l.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
        }
        this.f7421f = dVar.f7459i.mo6739a();
        this.f7421f.mo6729a((C2321a) this);
        if (dVar.f7458h != null && !dVar.f7458h.isEmpty()) {
            this.f7434s = new C2327g(dVar.f7458h);
            for (C2320a a : this.f7434s.f7257a) {
                a.mo6722a((C2321a) this);
            }
            for (C2320a aVar : this.f7434s.f7258b) {
                mo6752a(aVar);
                aVar.mo6722a((C2321a) this);
            }
        }
        if (!this.f7418c.f7470t.isEmpty()) {
            final C2323c cVar = new C2323c(this.f7418c.f7470t);
            cVar.f7251b = true;
            cVar.mo6722a((C2321a) new C2321a() {
                /* renamed from: a */
                public final void mo6707a() {
                    boolean z;
                    C2382a aVar = C2382a.this;
                    if (((Float) cVar.mo6726d()).floatValue() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo6753a(z);
                }
            });
            if (((Float) cVar.mo6726d()).floatValue() != 1.0f) {
                z = false;
            }
            mo6753a(z);
            mo6752a((C2320a<?, ?>) cVar);
            return;
        }
        mo6753a(true);
    }

    /* renamed from: a */
    private void m7000a(Canvas canvas, Matrix matrix, C2364a aVar) {
        Paint paint;
        boolean z = true;
        if (C23842.f7441b[aVar.ordinal()] != 1) {
            paint = this.f7425j;
        } else {
            paint = this.f7426k;
        }
        int size = this.f7434s.f7259c.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (((C2363g) this.f7434s.f7259c.get(i)).f7354a == aVar) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C2340c.m6969b("Layer#drawMask");
            C2340c.m6969b("Layer#saveLayer");
            m7001a(canvas, this.f7429n, paint, false);
            C2340c.m6970c("Layer#saveLayer");
            m6999a(canvas);
            for (int i2 = 0; i2 < size; i2++) {
                if (((C2363g) this.f7434s.f7259c.get(i2)).f7354a == aVar) {
                    this.f7422g.set((Path) ((C2320a) this.f7434s.f7257a.get(i2)).mo6726d());
                    this.f7422g.transform(matrix);
                    C2320a aVar2 = (C2320a) this.f7434s.f7258b.get(i2);
                    int alpha = this.f7424i.getAlpha();
                    this.f7424i.setAlpha((int) (((float) ((Integer) aVar2.mo6726d()).intValue()) * 2.55f));
                    canvas.drawPath(this.f7422g, this.f7424i);
                    this.f7424i.setAlpha(alpha);
                }
            }
            C2340c.m6969b("Layer#restoreLayer");
            canvas.restore();
            C2340c.m6970c("Layer#restoreLayer");
            C2340c.m6970c("Layer#drawMask");
        }
    }

    /* renamed from: a */
    public final void mo6708a(Canvas canvas, Matrix matrix, int i) {
        C2340c.m6969b(this.f7433r);
        if (!this.f7437v) {
            C2340c.m6970c(this.f7433r);
            return;
        }
        if (this.f7435t == null) {
            if (this.f7420e == null) {
                this.f7435t = Collections.emptyList();
            } else {
                this.f7435t = new ArrayList();
                for (C2382a aVar = this.f7420e; aVar != null; aVar = aVar.f7420e) {
                    this.f7435t.add(aVar);
                }
            }
        }
        C2340c.m6969b("Layer#parentMatrix");
        this.f7423h.reset();
        this.f7423h.set(matrix);
        for (int size = this.f7435t.size() - 1; size >= 0; size--) {
            this.f7423h.preConcat(((C2382a) this.f7435t.get(size)).f7421f.mo6727a());
        }
        C2340c.m6970c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f7421f.f7275e.mo6726d()).intValue())) / 100.0f) * 255.0f);
        if (m7004c() || m7006e()) {
            C2340c.m6969b("Layer#computeBounds");
            this.f7429n.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo6709a(this.f7429n, this.f7423h);
            RectF rectF = this.f7429n;
            Matrix matrix2 = this.f7423h;
            if (m7004c() && this.f7418c.f7471u != C2390b.Invert) {
                this.f7419d.mo6709a(this.f7431p, matrix2);
                rectF.set(Math.max(rectF.left, this.f7431p.left), Math.max(rectF.top, this.f7431p.top), Math.min(rectF.right, this.f7431p.right), Math.min(rectF.bottom, this.f7431p.bottom));
            }
            this.f7423h.preConcat(this.f7421f.mo6727a());
            m7003b(this.f7429n, this.f7423h);
            this.f7429n.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            C2340c.m6970c("Layer#computeBounds");
            C2340c.m6969b("Layer#saveLayer");
            m7001a(canvas, this.f7429n, this.f7424i, true);
            C2340c.m6970c("Layer#saveLayer");
            m6999a(canvas);
            C2340c.m6969b("Layer#drawLayer");
            mo6754b(canvas, this.f7423h, intValue);
            C2340c.m6970c("Layer#drawLayer");
            if (m7006e()) {
                Matrix matrix3 = this.f7423h;
                m7000a(canvas, matrix3, C2364a.MaskModeAdd);
                m7000a(canvas, matrix3, C2364a.MaskModeIntersect);
                m7000a(canvas, matrix3, C2364a.MaskModeSubtract);
            }
            if (m7004c()) {
                C2340c.m6969b("Layer#drawMatte");
                C2340c.m6969b("Layer#saveLayer");
                m7001a(canvas, this.f7429n, this.f7427l, false);
                C2340c.m6970c("Layer#saveLayer");
                m6999a(canvas);
                this.f7419d.mo6708a(canvas, matrix, intValue);
                C2340c.m6969b("Layer#restoreLayer");
                canvas.restore();
                C2340c.m6970c("Layer#restoreLayer");
                C2340c.m6970c("Layer#drawMatte");
            }
            C2340c.m6969b("Layer#restoreLayer");
            canvas.restore();
            C2340c.m6970c("Layer#restoreLayer");
            m7002b(C2340c.m6970c(this.f7433r));
            return;
        }
        this.f7423h.preConcat(this.f7421f.mo6727a());
        C2340c.m6969b("Layer#drawLayer");
        mo6754b(canvas, this.f7423h, intValue);
        C2340c.m6970c("Layer#drawLayer");
        m7002b(C2340c.m6970c(this.f7433r));
    }

    /* renamed from: a */
    private static void m7001a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i;
        if (VERSION.SDK_INT < 23) {
            if (z) {
                i = 31;
            } else {
                i = 19;
            }
            canvas.saveLayer(rectF, paint, i);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }

    /* renamed from: a */
    public final void mo6710a(C2398e eVar, int i, List<C2398e> list, C2398e eVar2) {
        if (eVar.mo6761a(mo6713b(), i)) {
            if (!"__container".equals(mo6713b())) {
                eVar2 = eVar2.mo6760a(mo6713b());
                if (eVar.mo6763c(mo6713b(), i)) {
                    list.add(eVar2.mo6759a((C2399f) this));
                }
            }
            if (eVar.mo6764d(mo6713b(), i)) {
                mo6755b(eVar, i + eVar.mo6762b(mo6713b(), i), list, eVar2);
            }
        }
    }
}

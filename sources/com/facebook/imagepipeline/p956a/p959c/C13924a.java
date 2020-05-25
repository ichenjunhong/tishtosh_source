package com.facebook.imagepipeline.p956a.p959c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.imagepipeline.p956a.p957a.C13905a;
import com.facebook.imagepipeline.p956a.p957a.C13906b;
import com.facebook.imagepipeline.p956a.p957a.C13911e;
import com.facebook.imagepipeline.p956a.p957a.C13912f;
import com.facebook.imagepipeline.p956a.p957a.C13913g;
import com.facebook.imagepipeline.p956a.p960d.C13934a;

/* renamed from: com.facebook.imagepipeline.a.c.a */
public final class C13924a implements C13905a {

    /* renamed from: a */
    public int f36319a = 2;

    /* renamed from: b */
    private final C13934a f36320b;

    /* renamed from: c */
    private final C13913g f36321c;

    /* renamed from: d */
    private final C13911e f36322d;

    /* renamed from: e */
    private final Rect f36323e;

    /* renamed from: f */
    private final int[] f36324f;

    /* renamed from: g */
    private final int[] f36325g;

    /* renamed from: h */
    private final int f36326h;

    /* renamed from: i */
    private final C13906b[] f36327i;

    /* renamed from: j */
    private final Rect f36328j = new Rect();

    /* renamed from: k */
    private final Rect f36329k = new Rect();

    /* renamed from: l */
    private Bitmap f36330l;

    /* renamed from: m */
    private boolean f36331m;

    /* renamed from: a */
    public final int mo26072a() {
        return this.f36322d.getFrameCount();
    }

    /* renamed from: b */
    public final int mo26076b() {
        return this.f36322d.getLoopCount();
    }

    /* renamed from: c */
    public final int mo26078c() {
        return this.f36322d.getWidth();
    }

    /* renamed from: d */
    public final int mo26079d() {
        return this.f36322d.getHeight();
    }

    /* renamed from: e */
    public final int mo26080e() {
        return this.f36323e.width();
    }

    /* renamed from: f */
    public final int mo26081f() {
        return this.f36323e.height();
    }

    /* renamed from: g */
    private synchronized void m28367g() {
        if (this.f36330l != null) {
            if (!this.f36331m) {
                this.f36330l.recycle();
            }
            this.f36330l = null;
        }
    }

    /* renamed from: a */
    public final C13906b mo26074a(int i) {
        return this.f36327i[i];
    }

    /* renamed from: b */
    public final int mo26077b(int i) {
        return this.f36324f[i];
    }

    /* renamed from: a */
    public final C13905a mo26073a(Rect rect) {
        if (m28364a(this.f36322d, rect).equals(this.f36323e)) {
            return this;
        }
        return new C13924a(this.f36320b, this.f36321c, rect);
    }

    /* renamed from: a */
    private static Rect m28364a(C13911e eVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, eVar.getWidth(), eVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), eVar.getWidth()), Math.min(rect.height(), eVar.getHeight()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m28366a(int r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.graphics.Bitmap r0 = r3.f36330l     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0018
            android.graphics.Bitmap r0 = r3.f36330l     // Catch:{ all -> 0x003f }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x003f }
            if (r0 < r4) goto L_0x0015
            android.graphics.Bitmap r0 = r3.f36330l     // Catch:{ all -> 0x003f }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x003f }
            if (r0 >= r5) goto L_0x0018
        L_0x0015:
            r3.m28367g()     // Catch:{ all -> 0x003f }
        L_0x0018:
            android.graphics.Bitmap r0 = r3.f36330l     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x003d
            com.facebook.imagepipeline.a.b.f r0 = com.facebook.imagepipeline.p956a.p958b.C13916b.f36308a     // Catch:{ all -> 0x003f }
            r1 = 0
            if (r0 == 0) goto L_0x0029
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x003f }
            int r2 = r3.f36319a     // Catch:{ all -> 0x003f }
            android.graphics.Bitmap r1 = r0.mo26092a(r4, r5, r1, r2)     // Catch:{ all -> 0x003f }
        L_0x0029:
            if (r1 == 0) goto L_0x0032
            r3.f36330l = r1     // Catch:{ all -> 0x003f }
            r4 = 1
            r3.f36331m = r4     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x0032:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x003f }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r0)     // Catch:{ all -> 0x003f }
            r3.f36330l = r4     // Catch:{ all -> 0x003f }
            r4 = 0
            r3.f36331m = r4     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p956a.p959c.C13924a.m28366a(int, int):void");
    }

    /* renamed from: a */
    public final void mo26075a(int i, Canvas canvas) {
        C13912f frame = this.f36322d.getFrame(i);
        try {
            if (this.f36322d.doesRenderSupportScaling()) {
                double width = (double) this.f36323e.width();
                double width2 = (double) this.f36322d.getWidth();
                Double.isNaN(width);
                Double.isNaN(width2);
                double d = width / width2;
                double height = (double) this.f36323e.height();
                double height2 = (double) this.f36322d.getHeight();
                Double.isNaN(height);
                Double.isNaN(height2);
                double d2 = height / height2;
                double b = (double) frame.mo25431b();
                Double.isNaN(b);
                int round = (int) Math.round(b * d);
                double c = (double) frame.mo25432c();
                Double.isNaN(c);
                int round2 = (int) Math.round(c * d2);
                double d3 = (double) frame.mo25433d();
                Double.isNaN(d3);
                int i2 = (int) (d3 * d);
                double e = (double) frame.mo25434e();
                Double.isNaN(e);
                int i3 = (int) (e * d2);
                synchronized (this) {
                    int width3 = this.f36323e.width();
                    int height3 = this.f36323e.height();
                    m28366a(width3, height3);
                    synchronized (this.f36330l) {
                        this.f36330l.eraseColor(0);
                        try {
                            frame.mo25430a(round, round2, this.f36330l);
                            this.f36328j.set(0, 0, width3, height3);
                            this.f36329k.set(i2, i3, width3 + i2, height3 + i3);
                            canvas.drawBitmap(this.f36330l, this.f36328j, this.f36329k, null);
                        } catch (IllegalStateException e2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(e2.getMessage());
                            sb.append(m28365a(this.f36330l, round, round2, this.f36323e, this.f36319a));
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
            } else {
                int b2 = frame.mo25431b();
                int c2 = frame.mo25432c();
                int d4 = frame.mo25433d();
                int e3 = frame.mo25434e();
                synchronized (this) {
                    m28366a(b2, c2);
                    synchronized (this.f36330l) {
                        this.f36330l.eraseColor(0);
                        try {
                            frame.mo25430a(b2, c2, this.f36330l);
                            this.f36328j.set(0, 0, b2, c2);
                            this.f36329k.set(0, 0, b2, c2);
                            canvas.save();
                            canvas.translate((float) d4, (float) e3);
                            canvas.drawBitmap(this.f36330l, this.f36328j, this.f36329k, null);
                            canvas.restore();
                        } catch (IllegalStateException e4) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(e4.getMessage());
                            sb2.append(m28365a(this.f36330l, b2, c2, null, this.f36319a));
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                }
            }
            frame.mo25429a();
        } catch (Throwable th) {
            frame.mo25429a();
            throw th;
        }
    }

    public C13924a(C13934a aVar, C13913g gVar, Rect rect) {
        this.f36320b = aVar;
        this.f36321c = gVar;
        this.f36322d = gVar.f36300a;
        this.f36324f = this.f36322d.getFrameDurations();
        C13934a.m28394a(this.f36324f);
        this.f36326h = C13934a.m28395b(this.f36324f);
        this.f36325g = C13934a.m28396c(this.f36324f);
        this.f36323e = m28364a(this.f36322d, rect);
        this.f36327i = new C13906b[this.f36322d.getFrameCount()];
        for (int i = 0; i < this.f36322d.getFrameCount(); i++) {
            this.f36327i[i] = this.f36322d.getFrameInfo(i);
        }
    }

    /* renamed from: a */
    private static String m28365a(Bitmap bitmap, int i, int i2, Rect rect, int i3) {
        StringBuilder sb = new StringBuilder(", mTempBitmap:");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append(", frame:");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        if (rect != null) {
            sb.append(", renderedBounds:");
            sb.append(rect.width());
            sb.append("x");
            sb.append(rect.height());
        }
        sb.append(", decodeType:");
        sb.append(i3);
        return sb.toString();
    }
}

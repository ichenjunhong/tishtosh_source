package com.airbnb.lottie.p104a.p105a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.support.p030v4.p038f.C0785g;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p108c.p110b.C2359c;
import com.airbnb.lottie.p108c.p110b.C2361e;
import com.airbnb.lottie.p108c.p110b.C2362f;
import com.airbnb.lottie.p108c.p111c.C2382a;

/* renamed from: com.airbnb.lottie.a.a.h */
public final class C2307h extends C2298a {

    /* renamed from: b */
    private final String f7186b;

    /* renamed from: c */
    private final C0785g<LinearGradient> f7187c = new C0785g<>();

    /* renamed from: d */
    private final C0785g<RadialGradient> f7188d = new C0785g<>();

    /* renamed from: e */
    private final RectF f7189e = new RectF();

    /* renamed from: f */
    private final C2362f f7190f;

    /* renamed from: g */
    private final int f7191g;

    /* renamed from: h */
    private final C2320a<C2359c, C2359c> f7192h;

    /* renamed from: i */
    private final C2320a<PointF, PointF> f7193i;

    /* renamed from: j */
    private final C2320a<PointF, PointF> f7194j;

    /* renamed from: b */
    public final String mo6713b() {
        return this.f7186b;
    }

    /* renamed from: c */
    private int m6889c() {
        int i;
        int round = Math.round(this.f7193i.f7252c * ((float) this.f7191g));
        int round2 = Math.round(this.f7194j.f7252c * ((float) this.f7191g));
        int round3 = Math.round(this.f7192h.f7252c * ((float) this.f7191g));
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

    public C2307h(C2455g gVar, C2382a aVar, C2361e eVar) {
        super(gVar, aVar, eVar.f7348h.toPaintCap(), eVar.f7349i.toPaintJoin(), eVar.f7350j, eVar.f7344d, eVar.f7347g, eVar.f7351k, eVar.f7352l);
        this.f7186b = eVar.f7341a;
        this.f7190f = eVar.f7342b;
        this.f7191g = (int) (gVar.f7570a.mo6777a() / 32.0f);
        this.f7192h = eVar.f7343c.mo6735a();
        this.f7192h.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7192h);
        this.f7193i = eVar.f7345e.mo6735a();
        this.f7193i.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7193i);
        this.f7194j = eVar.f7346f.mo6735a();
        this.f7194j.mo6722a((C2321a) this);
        aVar.mo6752a(this.f7194j);
    }

    /* renamed from: a */
    public final void mo6708a(Canvas canvas, Matrix matrix, int i) {
        mo6709a(this.f7189e, matrix);
        if (this.f7190f == C2362f.Linear) {
            Paint paint = this.f7128a;
            long c = (long) m6889c();
            LinearGradient linearGradient = (LinearGradient) this.f7187c.mo2487a(c);
            if (linearGradient == null) {
                PointF pointF = (PointF) this.f7193i.mo6726d();
                PointF pointF2 = (PointF) this.f7194j.mo6726d();
                C2359c cVar = (C2359c) this.f7192h.mo6726d();
                LinearGradient linearGradient2 = new LinearGradient((float) ((int) (this.f7189e.left + (this.f7189e.width() / 2.0f) + pointF.x)), (float) ((int) (this.f7189e.top + (this.f7189e.height() / 2.0f) + pointF.y)), (float) ((int) (this.f7189e.left + (this.f7189e.width() / 2.0f) + pointF2.x)), (float) ((int) (this.f7189e.top + (this.f7189e.height() / 2.0f) + pointF2.y)), cVar.f7331b, cVar.f7330a, TileMode.CLAMP);
                this.f7187c.mo2493b(c, linearGradient2);
                linearGradient = linearGradient2;
            }
            paint.setShader(linearGradient);
        } else {
            Paint paint2 = this.f7128a;
            long c2 = (long) m6889c();
            RadialGradient radialGradient = (RadialGradient) this.f7188d.mo2487a(c2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) this.f7193i.mo6726d();
                PointF pointF4 = (PointF) this.f7194j.mo6726d();
                C2359c cVar2 = (C2359c) this.f7192h.mo6726d();
                int[] iArr = cVar2.f7331b;
                float[] fArr = cVar2.f7330a;
                int width = (int) (this.f7189e.left + (this.f7189e.width() / 2.0f) + pointF3.x);
                int height = (int) (this.f7189e.top + (this.f7189e.height() / 2.0f) + pointF3.y);
                float f = (float) width;
                float f2 = (float) height;
                RadialGradient radialGradient2 = new RadialGradient(f, f2, (float) Math.hypot((double) (((int) ((this.f7189e.left + (this.f7189e.width() / 2.0f)) + pointF4.x)) - width), (double) (((int) ((this.f7189e.top + (this.f7189e.height() / 2.0f)) + pointF4.y)) - height)), iArr, fArr, TileMode.CLAMP);
                this.f7188d.mo2493b(c2, radialGradient2);
                radialGradient = radialGradient2;
            }
            paint2.setShader(radialGradient);
        }
        super.mo6708a(canvas, matrix, i);
    }
}

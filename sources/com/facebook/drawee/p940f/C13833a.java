package com.facebook.drawee.p940f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.p920d.C13689i;
import com.facebook.drawee.p939e.C13800c;
import com.facebook.drawee.p939e.C13803f;
import com.facebook.drawee.p939e.C13804g;
import com.facebook.drawee.p939e.C13805h;
import com.facebook.drawee.p939e.C13815p;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p942h.C13844c;
import com.facebook.imagepipeline.p976p.C14237b;

/* renamed from: com.facebook.drawee.f.a */
public class C13833a implements C13844c {

    /* renamed from: a */
    public C13837e f36079a;

    /* renamed from: b */
    public final C13803f f36080b;

    /* renamed from: c */
    public final C13804g f36081c;

    /* renamed from: d */
    private final Drawable f36082d = new ColorDrawable(0);

    /* renamed from: e */
    private final Resources f36083e;

    /* renamed from: f */
    private final C13836d f36084f;

    /* renamed from: a */
    public final Drawable mo25888a() {
        return this.f36084f;
    }

    /* renamed from: a */
    public final void mo25900a(Throwable th) {
        this.f36080b.mo25811b();
        m28054d();
        if (this.f36080b.mo25779a(5) != null) {
            m28056e(5);
        } else {
            m28056e(1);
        }
        this.f36080b.mo25813c();
    }

    /* renamed from: a */
    public final void mo25898a(C13818b bVar) {
        C13689i.m27652a(bVar);
        m28060h(2).mo25872a(bVar);
    }

    /* renamed from: a */
    public final void mo25897a(Drawable drawable, C13818b bVar) {
        mo25891a(1, drawable);
        m28060h(1).mo25872a(bVar);
    }

    /* renamed from: a */
    public final void mo25899a(C13837e eVar) {
        this.f36079a = eVar;
        C13839f.m28129a((C13800c) this.f36084f, this.f36079a);
        for (int i = 0; i < this.f36080b.mo25778a(); i++) {
            C13839f.m28130a(m28059g(i), this.f36079a, this.f36083e);
        }
    }

    /* renamed from: b */
    public final void mo25901b() {
        this.f36081c.setDrawable(this.f36082d);
        m28053c();
    }

    /* renamed from: c */
    private void m28053c() {
        if (this.f36080b != null) {
            this.f36080b.mo25811b();
            this.f36080b.mo25815d();
            m28054d();
            m28056e(1);
            this.f36080b.mo25817e();
            this.f36080b.mo25813c();
        }
    }

    /* renamed from: d */
    private void m28054d() {
        m28058f(1);
        m28058f(2);
        m28058f(3);
        m28058f(4);
        m28058f(5);
    }

    /* renamed from: e */
    private void m28056e(int i) {
        if (i >= 0) {
            this.f36080b.mo25814c(i);
        }
    }

    /* renamed from: f */
    private void m28058f(int i) {
        if (i >= 0) {
            this.f36080b.mo25816d(i);
        }
    }

    /* renamed from: a */
    public final void mo25890a(int i) {
        this.f36080b.mo25812b(i);
    }

    /* renamed from: b */
    public final void mo25904b(Drawable drawable) {
        mo25891a(1, drawable);
    }

    /* renamed from: c */
    public final void mo25909c(Drawable drawable) {
        mo25891a(5, drawable);
    }

    /* renamed from: d */
    public final void mo25911d(Drawable drawable) {
        mo25891a(0, drawable);
    }

    /* renamed from: e */
    private void m28057e(Drawable drawable) {
        mo25891a(4, drawable);
    }

    /* renamed from: b */
    public final void mo25902b(int i) {
        mo25904b(this.f36083e.getDrawable(i));
    }

    /* renamed from: a */
    private void m28051a(float f) {
        Drawable a = this.f36080b.mo25779a(3);
        if (a != null) {
            if (f >= 0.999f) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                m28058f(3);
            } else {
                if (a instanceof Animatable) {
                    ((Animatable) a).start();
                }
                m28056e(3);
            }
            a.setLevel(Math.round(f * 10000.0f));
        }
    }

    /* renamed from: h */
    private C13815p m28060h(int i) {
        C13800c g = m28059g(i);
        if (g instanceof C13815p) {
            return (C13815p) g;
        }
        Drawable a = C13839f.m28124a(g.setDrawable(C13839f.f36117a), C13818b.f36061a);
        g.setDrawable(a);
        C13689i.m27653a(a, (Object) "Parent has no child drawable!");
        return (C13815p) a;
    }

    /* renamed from: c */
    public final void mo25907c(int i) {
        mo25909c(this.f36083e.getDrawable(i));
    }

    /* renamed from: d */
    public final void mo25910d(int i) {
        m28057e(this.f36083e.getDrawable(i));
    }

    /* renamed from: g */
    private C13800c m28059g(int i) {
        boolean z;
        C13803f fVar = this.f36080b;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i < fVar.f35953a.length) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        if (fVar.f35953a[i] == null) {
            fVar.f35953a[i] = new C13800c(i) {

                /* renamed from: a */
                final /* synthetic */ int f35961a;

                public final Drawable getDrawable() {
                    return C13797a.this.mo25779a(this.f35961a);
                }

                public final Drawable setDrawable(Drawable drawable) {
                    return C13797a.this.mo25780a(this.f35961a, drawable);
                }

                {
                    this.f35961a = r2;
                }
            };
        }
        C13800c cVar = fVar.f35953a[i];
        if (cVar.getDrawable() instanceof C13805h) {
            cVar = (C13805h) cVar.getDrawable();
        }
        if (cVar.getDrawable() instanceof C13815p) {
            return (C13815p) cVar.getDrawable();
        }
        return cVar;
    }

    C13833a(C13834b bVar) {
        int i;
        int i2;
        if (C14237b.m29187b()) {
            C14237b.m29186a("GenericDraweeHierarchy()");
        }
        this.f36083e = bVar.f36087c;
        this.f36079a = bVar.f36104t;
        this.f36081c = new C13804g(this.f36082d);
        int i3 = 1;
        if (bVar.f36102r != null) {
            i = bVar.f36102r.size();
        } else {
            i = 1;
        }
        if (bVar.f36103s != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        Drawable[] drawableArr = new Drawable[(i4 + 6)];
        drawableArr[0] = m28052c(bVar.f36101q, (C13818b) null);
        drawableArr[1] = m28052c(bVar.f36090f, bVar.f36091g);
        C13804g gVar = this.f36081c;
        C13818b bVar2 = bVar.f36098n;
        PointF pointF = bVar.f36099o;
        gVar.setColorFilter(bVar.f36100p);
        drawableArr[2] = C13839f.m28125a((Drawable) gVar, bVar2, pointF);
        drawableArr[3] = m28052c(bVar.f36096l, bVar.f36097m);
        drawableArr[4] = m28052c(bVar.f36092h, bVar.f36093i);
        drawableArr[5] = m28052c(bVar.f36094j, bVar.f36095k);
        if (i4 > 0) {
            if (bVar.f36102r != null) {
                i3 = 0;
                for (Drawable c : bVar.f36102r) {
                    int i5 = i3 + 1;
                    drawableArr[i3 + 6] = m28052c(c, (C13818b) null);
                    i3 = i5;
                }
            }
            if (bVar.f36103s != null) {
                drawableArr[i3 + 6] = m28052c(bVar.f36103s, (C13818b) null);
            }
        }
        this.f36080b = new C13803f(drawableArr);
        this.f36080b.mo25812b(bVar.f36088d);
        this.f36084f = new C13836d(C13839f.m28126a((Drawable) this.f36080b, this.f36079a));
        this.f36084f.mutate();
        m28053c();
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    /* renamed from: a */
    public final void mo25893a(PointF pointF) {
        C13689i.m27652a(pointF);
        m28060h(2).mo25871a(pointF);
    }

    /* renamed from: b */
    public final void mo25906b(Throwable th) {
        this.f36080b.mo25811b();
        m28054d();
        if (this.f36080b.mo25779a(4) != null) {
            m28056e(4);
        } else {
            m28056e(1);
        }
        this.f36080b.mo25813c();
    }

    /* renamed from: a */
    public final void mo25894a(RectF rectF) {
        this.f36081c.getTransformedBounds(rectF);
    }

    /* renamed from: a */
    public final void mo25895a(Drawable drawable) {
        C13836d dVar = this.f36084f;
        dVar.f36106a = drawable;
        dVar.invalidateSelf();
    }

    /* renamed from: c */
    private Drawable m28052c(Drawable drawable, C13818b bVar) {
        return C13839f.m28124a(C13839f.m28127a(drawable, this.f36079a, this.f36083e), bVar);
    }

    /* renamed from: d */
    private void m28055d(Drawable drawable, C13818b bVar) {
        mo25891a(4, drawable);
        m28060h(4).mo25872a(bVar);
    }

    /* renamed from: a */
    public final void mo25892a(int i, C13818b bVar) {
        mo25897a(this.f36083e.getDrawable(i), bVar);
    }

    /* renamed from: a */
    public final void mo25889a(float f, boolean z) {
        if (this.f36080b.mo25779a(3) != null) {
            this.f36080b.mo25811b();
            m28051a(f);
            if (z) {
                this.f36080b.mo25817e();
            }
            this.f36080b.mo25813c();
        }
    }

    /* renamed from: b */
    public final void mo25903b(int i, C13818b bVar) {
        mo25905b(this.f36083e.getDrawable(i), bVar);
    }

    /* renamed from: a */
    public void mo25891a(int i, Drawable drawable) {
        if (drawable == null) {
            this.f36080b.mo25780a(i, null);
            return;
        }
        m28059g(i).setDrawable(C13839f.m28127a(drawable, this.f36079a, this.f36083e));
    }

    /* renamed from: b */
    public final void mo25905b(Drawable drawable, C13818b bVar) {
        mo25891a(5, drawable);
        m28060h(5).mo25872a(bVar);
    }

    /* renamed from: c */
    public final void mo25908c(int i, C13818b bVar) {
        m28055d(this.f36083e.getDrawable(i), bVar);
    }

    /* renamed from: a */
    public final void mo25896a(Drawable drawable, float f, boolean z) {
        Drawable a = C13839f.m28127a(drawable, this.f36079a, this.f36083e);
        a.mutate();
        this.f36081c.setDrawable(a);
        this.f36080b.mo25811b();
        m28054d();
        m28056e(2);
        m28051a(f);
        if (z) {
            this.f36080b.mo25817e();
        }
        this.f36080b.mo25813c();
    }
}

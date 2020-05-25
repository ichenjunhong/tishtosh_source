package com.facebook.fresco.animation.p948b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13715a;
import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p947a.C13859c.C13861a;
import com.facebook.fresco.animation.p947a.C13862d;
import com.facebook.fresco.animation.p948b.p950b.C13868a;
import com.facebook.fresco.animation.p948b.p950b.C13869b;
import com.facebook.imagepipeline.p963c.C13946f;

/* renamed from: com.facebook.fresco.animation.b.a */
public class C13863a implements C13857a, C13861a {

    /* renamed from: c */
    private static final Class<?> f36157c = C13863a.class;

    /* renamed from: a */
    public C13868a f36158a;

    /* renamed from: b */
    public Config f36159b = Config.ARGB_8888;

    /* renamed from: d */
    private final C13946f f36160d;

    /* renamed from: e */
    private final C13867b f36161e;

    /* renamed from: f */
    private final C13862d f36162f;

    /* renamed from: g */
    private final C13873c f36163g;

    /* renamed from: h */
    private final C13869b f36164h;

    /* renamed from: i */
    private final Paint f36165i;

    /* renamed from: j */
    private Rect f36166j;

    /* renamed from: k */
    private int f36167k;

    /* renamed from: l */
    private int f36168l;

    /* renamed from: a */
    public final int mo25996a() {
        return this.f36167k;
    }

    /* renamed from: b */
    public final int mo26001b() {
        return this.f36168l;
    }

    /* renamed from: f */
    public final void mo26009f() {
        mo26003c();
    }

    /* renamed from: d */
    public final int mo26005d() {
        return this.f36162f.mo26005d();
    }

    /* renamed from: e */
    public final int mo26006e() {
        return this.f36162f.mo26006e();
    }

    /* renamed from: c */
    public final void mo26003c() {
        this.f36161e.mo26012a();
    }

    /* renamed from: g */
    private void m28207g() {
        int i;
        this.f36167k = this.f36163g.mo26019a();
        int i2 = -1;
        if (this.f36167k == -1) {
            if (this.f36166j == null) {
                i = -1;
            } else {
                i = this.f36166j.width();
            }
            this.f36167k = i;
        }
        this.f36168l = this.f36163g.mo26022b();
        if (this.f36168l == -1) {
            if (this.f36166j != null) {
                i2 = this.f36166j.height();
            }
            this.f36168l = i2;
        }
    }

    /* renamed from: a */
    public final void mo25997a(int i) {
        this.f36165i.setAlpha(i);
    }

    /* renamed from: b */
    public final boolean mo26002b(int i) {
        return this.f36161e.mo26016c(i);
    }

    /* renamed from: c */
    public final int mo26004c(int i) {
        return this.f36162f.mo26004c(i);
    }

    /* renamed from: a */
    public final void mo25998a(ColorFilter colorFilter) {
        this.f36165i.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final void mo25999a(Rect rect) {
        this.f36166j = rect;
        this.f36163g.mo26020a(rect);
        m28207g();
    }

    /* renamed from: a */
    private boolean m28204a(int i, C13715a<Bitmap> aVar) {
        if (!C13715a.m27750a(aVar)) {
            return false;
        }
        boolean a = this.f36163g.mo26021a(i, (Bitmap) aVar.mo25630a());
        if (!a) {
            C13715a.m27752c(aVar);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m28206a(Canvas canvas, int i, int i2) {
        C13715a aVar;
        boolean z;
        while (true) {
            int i3 = 3;
            C13715a aVar2 = null;
            boolean z2 = true;
            switch (i2) {
                case 0:
                    aVar = this.f36161e.mo26010a(i);
                    z = m28205a(i, aVar, canvas, 0);
                    i3 = 1;
                    break;
                case 1:
                    aVar = this.f36161e.mo26011a(i, this.f36167k, this.f36168l);
                    if (!m28204a(i, aVar) || !m28205a(i, aVar, canvas, 1)) {
                        z2 = false;
                    }
                    z = z2;
                    i3 = 2;
                    break;
                case 2:
                    aVar = this.f36160d.mo26111b(this.f36167k, this.f36168l, this.f36159b);
                    if (m28204a(i, aVar) && m28205a(i, aVar, canvas, 2)) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 3:
                    try {
                        aVar = this.f36161e.mo26014b(i);
                        try {
                            z = m28205a(i, aVar, canvas, 3);
                            i3 = -1;
                            break;
                        } catch (Throwable th) {
                            th = th;
                            aVar2 = aVar;
                            C13715a.m27752c(aVar2);
                            throw th;
                        }
                    } catch (RuntimeException e) {
                        C13697a.m27677a(f36157c, "Failed to create frame bitmap", (Throwable) e);
                        C13715a.m27752c(null);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        C13715a.m27752c(aVar2);
                        throw th;
                    }
                default:
                    C13715a.m27752c(null);
                    return false;
            }
            C13715a.m27752c(aVar);
            if (z || i3 == -1) {
                return z;
            }
            i2 = i3;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo26000a(Drawable drawable, Canvas canvas, int i) {
        boolean a = m28206a(canvas, i, 0);
        if (!(this.f36158a == null || this.f36164h == null)) {
            this.f36158a.mo23159a(this.f36164h, this.f36161e, this, i);
        }
        return a;
    }

    /* renamed from: a */
    private boolean m28205a(int i, C13715a<Bitmap> aVar, Canvas canvas, int i2) {
        if (!C13715a.m27750a(aVar)) {
            return false;
        }
        if (this.f36166j == null) {
            canvas.drawBitmap((Bitmap) aVar.mo25630a(), 0.0f, 0.0f, this.f36165i);
        } else {
            canvas.drawBitmap((Bitmap) aVar.mo25630a(), null, this.f36166j, this.f36165i);
        }
        if (i2 != 3) {
            this.f36161e.mo26013a(i, aVar, i2);
        }
        return true;
    }

    public C13863a(C13946f fVar, C13867b bVar, C13862d dVar, C13873c cVar, C13868a aVar, C13869b bVar2) {
        this.f36160d = fVar;
        this.f36161e = bVar;
        this.f36162f = dVar;
        this.f36163g = cVar;
        this.f36158a = aVar;
        this.f36164h = bVar2;
        this.f36165i = new Paint(6);
        m28207g();
    }
}

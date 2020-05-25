package com.facebook.imagepipeline.p970j;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p924h.C13718c;
import com.facebook.imageutils.C14250a;

/* renamed from: com.facebook.imagepipeline.j.d */
public final class C14043d extends C14041b {

    /* renamed from: a */
    public final int f36695a;

    /* renamed from: b */
    public final int f36696b;

    /* renamed from: c */
    private C13715a<Bitmap> f36697c;

    /* renamed from: d */
    private volatile Bitmap f36698d;

    /* renamed from: e */
    private final C14047h f36699e;

    /* renamed from: d */
    public final Bitmap mo26257d() {
        return this.f36698d;
    }

    /* renamed from: e */
    public final C14047h mo26258e() {
        return this.f36699e;
    }

    /* renamed from: b */
    public final int mo26251b() {
        return C14250a.m29204a(this.f36698d);
    }

    /* renamed from: g */
    private synchronized C13715a<Bitmap> m28697g() {
        C13715a<Bitmap> aVar;
        aVar = this.f36697c;
        this.f36697c = null;
        this.f36698d = null;
        return aVar;
    }

    public final void close() {
        C13715a g = m28697g();
        if (g != null) {
            g.close();
        }
    }

    /* renamed from: f */
    public final synchronized C13715a<Bitmap> mo26260f() {
        return C13715a.m27751b(this.f36697c);
    }

    /* renamed from: a */
    public final synchronized boolean mo26250a() {
        boolean z;
        if (this.f36697c == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final int getHeight() {
        if (this.f36695a % NormalGiftView.ALPHA_180 != 0 || this.f36696b == 5 || this.f36696b == 7) {
            return m28695a(this.f36698d);
        }
        return m28696b(this.f36698d);
    }

    public final int getWidth() {
        if (this.f36695a % NormalGiftView.ALPHA_180 != 0 || this.f36696b == 5 || this.f36696b == 7) {
            return m28696b(this.f36698d);
        }
        return m28695a(this.f36698d);
    }

    /* renamed from: a */
    private static int m28695a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: b */
    private static int m28696b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public C14043d(C13715a<Bitmap> aVar, C14047h hVar, int i) {
        this(aVar, hVar, 0, 0);
    }

    public C14043d(Bitmap bitmap, C13718c<Bitmap> cVar, C14047h hVar, int i) {
        this(bitmap, cVar, hVar, 0, 0);
    }

    public C14043d(C13715a<Bitmap> aVar, C14047h hVar, int i, int i2) {
        this.f36697c = (C13715a) C13689i.m27652a(aVar.mo25632c());
        this.f36698d = (Bitmap) this.f36697c.mo25630a();
        this.f36699e = hVar;
        this.f36695a = i;
        this.f36696b = i2;
    }

    private C14043d(Bitmap bitmap, C13718c<Bitmap> cVar, C14047h hVar, int i, int i2) {
        this.f36698d = (Bitmap) C13689i.m27652a(bitmap);
        this.f36697c = C13715a.m27747a(this.f36698d, (C13718c) C13689i.m27652a(cVar));
        this.f36699e = hVar;
        this.f36695a = i;
        this.f36696b = 0;
    }
}

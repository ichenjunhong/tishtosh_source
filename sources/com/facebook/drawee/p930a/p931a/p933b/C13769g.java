package com.facebook.drawee.p930a.p931a.p933b;

import android.graphics.Rect;
import com.facebook.common.time.C13737b;
import com.facebook.drawee.p930a.p931a.C13772d;
import com.facebook.drawee.p930a.p931a.p933b.p934a.C13761a;
import com.facebook.drawee.p930a.p931a.p933b.p934a.C13762b;
import com.facebook.drawee.p930a.p931a.p933b.p934a.C13763c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13843b;
import com.facebook.imagepipeline.p971k.C14048a;
import com.facebook.imagepipeline.p971k.C14049b;
import com.facebook.imagepipeline.p971k.C14050c;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.drawee.a.a.b.g */
public final class C13769g extends C14048a {

    /* renamed from: a */
    public final C13770h f35802a = new C13770h();

    /* renamed from: b */
    public List<C13768f> f35803b;

    /* renamed from: c */
    private final C13772d f35804c;

    /* renamed from: d */
    private final C13737b f35805d;

    /* renamed from: e */
    private C13765c f35806e;

    /* renamed from: f */
    private C13764b f35807f;

    /* renamed from: g */
    private C13763c f35808g;

    /* renamed from: h */
    private C13761a f35809h;

    /* renamed from: i */
    private C14049b f35810i;

    /* renamed from: j */
    private boolean f35811j;

    /* renamed from: a */
    private void m27864a() {
        if (this.f35809h == null) {
            this.f35809h = new C13761a(this.f35805d, this.f35802a, this);
        }
        if (this.f35808g == null) {
            this.f35808g = new C13763c(this.f35805d, this.f35802a);
        }
        if (this.f35807f == null) {
            this.f35807f = new C13762b(this.f35802a, this);
        }
        if (this.f35806e == null) {
            this.f35806e = new C13765c(this.f35804c.f35888k, this.f35807f);
        } else {
            this.f35806e.f35781a = this.f35804c.f35888k;
        }
        if (this.f35810i == null) {
            this.f35810i = new C14049b(this.f35808g, this.f35806e);
        }
    }

    /* renamed from: a */
    public final void mo25700a(boolean z) {
        this.f35811j = z;
        if (z) {
            m27864a();
            if (this.f35807f != null) {
                this.f35804c.mo25707a(this.f35807f);
            }
            if (this.f35809h != null) {
                this.f35804c.mo25736a((C13791d<? super INFO>) this.f35809h);
            }
            if (this.f35810i != null) {
                this.f35804c.mo25710a((C14050c) this.f35810i);
            }
        } else {
            if (this.f35807f != null) {
                this.f35804c.mo25715b(this.f35807f);
            }
            if (this.f35809h != null) {
                this.f35804c.mo25743b((C13791d<? super INFO>) this.f35809h);
            }
            if (this.f35810i != null) {
                this.f35804c.mo25716b((C14050c) this.f35810i);
            }
        }
    }

    public C13769g(C13737b bVar, C13772d dVar) {
        this.f35805d = bVar;
        this.f35804c = dVar;
    }

    /* renamed from: b */
    public final void mo25701b(C13770h hVar, int i) {
        if (this.f35811j && this.f35803b != null && !this.f35803b.isEmpty()) {
            hVar.mo25702a();
            Iterator it = this.f35803b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: a */
    public final void mo25699a(C13770h hVar, int i) {
        hVar.f35828q = i;
        if (this.f35811j && this.f35803b != null && !this.f35803b.isEmpty()) {
            if (i == 3) {
                C13843b e = this.f35804c.mo25745e();
                if (!(e == null || e.mo25888a() == null)) {
                    Rect bounds = e.mo25888a().getBounds();
                    this.f35802a.f35826o = bounds.width();
                    this.f35802a.f35827p = bounds.height();
                }
            }
            hVar.mo25702a();
            Iterator it = this.f35803b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}

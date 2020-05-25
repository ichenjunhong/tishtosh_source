package android.support.p043v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.e */
final class C1478e {

    /* renamed from: a */
    private final View f5326a;

    /* renamed from: b */
    private final C1480g f5327b;

    /* renamed from: c */
    private int f5328c = -1;

    /* renamed from: d */
    private C1448az f5329d;

    /* renamed from: e */
    private C1448az f5330e;

    /* renamed from: f */
    private C1448az f5331f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ColorStateList mo5757a() {
        if (this.f5330e != null) {
            return this.f5330e.f5225a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Mode mo5763b() {
        if (this.f5330e != null) {
            return this.f5330e.f5226b;
        }
        return null;
    }

    /* renamed from: d */
    private boolean m5184d() {
        int i = VERSION.SDK_INT;
        if (i > 21) {
            if (this.f5329d != null) {
                return true;
            }
            return false;
        } else if (i == 21) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo5764c() {
        Drawable background = this.f5326a.getBackground();
        if (background != null && (!m5184d() || !m5183b(background))) {
            if (this.f5330e != null) {
                C1480g.m5207a(background, this.f5330e, this.f5326a.getDrawableState());
                return;
            }
            if (this.f5329d != null) {
                C1480g.m5207a(background, this.f5329d, this.f5326a.getDrawableState());
            }
        }
    }

    C1478e(View view) {
        this.f5326a = view;
        this.f5327b = C1480g.m5205a();
    }

    /* renamed from: b */
    private void m5182b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5329d == null) {
                this.f5329d = new C1448az();
            }
            this.f5329d.f5225a = colorStateList;
            this.f5329d.f5228d = true;
        } else {
            this.f5329d = null;
        }
        mo5764c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5758a(int i) {
        ColorStateList colorStateList;
        this.f5328c = i;
        if (this.f5327b != null) {
            colorStateList = this.f5327b.mo5774b(this.f5326a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m5182b(colorStateList);
        mo5764c();
    }

    /* renamed from: b */
    private boolean m5183b(Drawable drawable) {
        if (this.f5331f == null) {
            this.f5331f = new C1448az();
        }
        C1448az azVar = this.f5331f;
        azVar.mo5643a();
        ColorStateList v = C1056u.m3076v(this.f5326a);
        if (v != null) {
            azVar.f5228d = true;
            azVar.f5225a = v;
        }
        Mode w = C1056u.m3077w(this.f5326a);
        if (w != null) {
            azVar.f5227c = true;
            azVar.f5226b = w;
        }
        if (!azVar.f5228d && !azVar.f5227c) {
            return false;
        }
        C1480g.m5207a(drawable, azVar, this.f5326a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5759a(ColorStateList colorStateList) {
        if (this.f5330e == null) {
            this.f5330e = new C1448az();
        }
        this.f5330e.f5225a = colorStateList;
        this.f5330e.f5228d = true;
        mo5764c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5760a(Mode mode) {
        if (this.f5330e == null) {
            this.f5330e = new C1448az();
        }
        this.f5330e.f5226b = mode;
        this.f5330e.f5227c = true;
        mo5764c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5761a(Drawable drawable) {
        this.f5328c = -1;
        m5182b((ColorStateList) null);
        mo5764c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5762a(AttributeSet attributeSet, int i) {
        C1451bb a = C1451bb.m5032a(this.f5326a.getContext(), attributeSet, new int[]{16842964, R.attr.by, R.attr.bz}, i, 0);
        try {
            if (a.mo5664f(0)) {
                this.f5328c = a.mo5665g(0, -1);
                ColorStateList b = this.f5327b.mo5774b(this.f5326a.getContext(), this.f5328c);
                if (b != null) {
                    m5182b(b);
                }
            }
            if (a.mo5664f(1)) {
                C1056u.m3026a(this.f5326a, a.mo5662e(1));
            }
            if (a.mo5664f(2)) {
                C1056u.m3028a(this.f5326a, C1518y.m5425a(a.mo5650a(2, -1), null));
            }
        } finally {
            a.mo5653a();
        }
    }
}

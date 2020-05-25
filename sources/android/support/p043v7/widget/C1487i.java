package android.support.p043v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.p030v4.widget.C1110j;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.i */
public final class C1487i {

    /* renamed from: a */
    private final ImageView f5353a;

    /* renamed from: b */
    private C1448az f5354b;

    /* renamed from: c */
    private C1448az f5355c;

    /* renamed from: d */
    private C1448az f5356d;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final ColorStateList mo5781b() {
        if (this.f5355c != null) {
            return this.f5355c.f5225a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Mode mo5782c() {
        if (this.f5355c != null) {
            return this.f5355c.f5226b;
        }
        return null;
    }

    /* renamed from: e */
    private boolean m5226e() {
        int i = VERSION.SDK_INT;
        if (i > 21) {
            if (this.f5354b != null) {
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
    /* renamed from: d */
    public final void mo5783d() {
        Drawable drawable = this.f5353a.getDrawable();
        if (drawable != null) {
            C1518y.m5427b(drawable);
        }
        if (drawable != null && (!m5226e() || !m5225a(drawable))) {
            if (this.f5355c != null) {
                C1480g.m5207a(drawable, this.f5355c, this.f5353a.getDrawableState());
                return;
            }
            if (this.f5354b != null) {
                C1480g.m5207a(drawable, this.f5354b, this.f5353a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo5780a() {
        Drawable background = this.f5353a.getBackground();
        if (VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public C1487i(ImageView imageView) {
        this.f5353a = imageView;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5777a(ColorStateList colorStateList) {
        if (this.f5355c == null) {
            this.f5355c = new C1448az();
        }
        this.f5355c.f5225a = colorStateList;
        this.f5355c.f5228d = true;
        mo5783d();
    }

    /* renamed from: a */
    private boolean m5225a(Drawable drawable) {
        if (this.f5356d == null) {
            this.f5356d = new C1448az();
        }
        C1448az azVar = this.f5356d;
        azVar.mo5643a();
        ColorStateList a = C1110j.m3240a(this.f5353a);
        if (a != null) {
            azVar.f5228d = true;
            azVar.f5225a = a;
        }
        Mode b = C1110j.m3243b(this.f5353a);
        if (b != null) {
            azVar.f5227c = true;
            azVar.f5226b = b;
        }
        if (!azVar.f5228d && !azVar.f5227c) {
            return false;
        }
        C1480g.m5207a(drawable, azVar, this.f5353a.getDrawableState());
        return true;
    }

    /* renamed from: a */
    public final void mo5776a(int i) {
        if (i != 0) {
            Drawable b = C1124a.m3315b(this.f5353a.getContext(), i);
            if (b != null) {
                C1518y.m5427b(b);
            }
            this.f5353a.setImageDrawable(b);
        } else {
            this.f5353a.setImageDrawable(null);
        }
        mo5783d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5778a(Mode mode) {
        if (this.f5355c == null) {
            this.f5355c = new C1448az();
        }
        this.f5355c.f5226b = mode;
        this.f5355c.f5227c = true;
        mo5783d();
    }

    /* renamed from: a */
    public final void mo5779a(AttributeSet attributeSet, int i) {
        C1451bb a = C1451bb.m5032a(this.f5353a.getContext(), attributeSet, new int[]{16843033, R.attr.a2s, R.attr.a6s, R.attr.a6t}, i, 0);
        try {
            Drawable drawable = this.f5353a.getDrawable();
            if (drawable == null) {
                int g = a.mo5665g(1, -1);
                if (g != -1) {
                    drawable = C1124a.m3315b(this.f5353a.getContext(), g);
                    if (drawable != null) {
                        this.f5353a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C1518y.m5427b(drawable);
            }
            if (a.mo5664f(2)) {
                C1110j.m3241a(this.f5353a, a.mo5662e(2));
            }
            if (a.mo5664f(3)) {
                C1110j.m3242a(this.f5353a, C1518y.m5425a(a.mo5650a(3, -1), null));
            }
        } finally {
            a.mo5653a();
        }
    }
}

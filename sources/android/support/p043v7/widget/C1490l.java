package android.support.p043v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.l */
final class C1490l extends C1489k {

    /* renamed from: b */
    final SeekBar f5362b;

    /* renamed from: c */
    public Drawable f5363c;

    /* renamed from: d */
    public ColorStateList f5364d;

    /* renamed from: e */
    public Mode f5365e;

    /* renamed from: f */
    private boolean f5366f;

    /* renamed from: g */
    private boolean f5367g;

    /* renamed from: a */
    private void m5237a() {
        if (this.f5363c == null) {
            return;
        }
        if (this.f5366f || this.f5367g) {
            this.f5363c = C0809a.m2337f(this.f5363c.mutate());
            if (this.f5366f) {
                C0809a.m2327a(this.f5363c, this.f5364d);
            }
            if (this.f5367g) {
                C0809a.m2330a(this.f5363c, this.f5365e);
            }
            if (this.f5363c.isStateful()) {
                this.f5363c.setState(this.f5362b.getDrawableState());
            }
        }
    }

    C1490l(SeekBar seekBar) {
        super(seekBar);
        this.f5362b = seekBar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5787a(AttributeSet attributeSet, int i) {
        super.mo5787a(attributeSet, i);
        C1451bb a = C1451bb.m5032a(this.f5362b.getContext(), attributeSet, new int[]{16843074, R.attr.a6p, R.attr.a6q, R.attr.a6r}, i, 0);
        Drawable b = a.mo5656b(0);
        if (b != null) {
            this.f5362b.setThumb(b);
        }
        Drawable a2 = a.mo5652a(1);
        if (this.f5363c != null) {
            this.f5363c.setCallback(null);
        }
        this.f5363c = a2;
        if (a2 != null) {
            a2.setCallback(this.f5362b);
            C0809a.m2333b(a2, C1056u.m3055f(this.f5362b));
            if (a2.isStateful()) {
                a2.setState(this.f5362b.getDrawableState());
            }
            m5237a();
        }
        this.f5362b.invalidate();
        if (a.mo5664f(3)) {
            this.f5365e = C1518y.m5425a(a.mo5650a(3, -1), this.f5365e);
            this.f5367g = true;
        }
        if (a.mo5664f(2)) {
            this.f5364d = a.mo5662e(2);
            this.f5366f = true;
        }
        a.mo5653a();
        m5237a();
    }
}

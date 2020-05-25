package android.support.p043v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.widget.C1102e;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.f */
final class C1479f {

    /* renamed from: a */
    public ColorStateList f5332a;

    /* renamed from: b */
    public Mode f5333b;

    /* renamed from: c */
    private final CompoundButton f5334c;

    /* renamed from: d */
    private boolean f5335d;

    /* renamed from: e */
    private boolean f5336e;

    /* renamed from: f */
    private boolean f5337f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5766a() {
        if (this.f5337f) {
            this.f5337f = false;
            return;
        }
        this.f5337f = true;
        m5193b();
    }

    /* renamed from: b */
    private void m5193b() {
        Drawable a = C1102e.m3213a(this.f5334c);
        if (a == null) {
            return;
        }
        if (this.f5335d || this.f5336e) {
            Drawable mutate = C0809a.m2337f(a).mutate();
            if (this.f5335d) {
                C0809a.m2327a(mutate, this.f5332a);
            }
            if (this.f5336e) {
                C0809a.m2330a(mutate, this.f5333b);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f5334c.getDrawableState());
            }
            this.f5334c.setButtonDrawable(mutate);
        }
    }

    C1479f(CompoundButton compoundButton) {
        this.f5334c = compoundButton;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo5765a(int i) {
        if (VERSION.SDK_INT >= 17) {
            return i;
        }
        Drawable a = C1102e.m3213a(this.f5334c);
        if (a != null) {
            return i + a.getIntrinsicWidth();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5767a(ColorStateList colorStateList) {
        this.f5332a = colorStateList;
        this.f5335d = true;
        m5193b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5768a(Mode mode) {
        this.f5333b = mode;
        this.f5336e = true;
        m5193b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5769a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f5334c.getContext().obtainStyledAttributes(attributeSet, new int[]{16843015, R.attr.dt, R.attr.du}, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    this.f5334c.setButtonDrawable(C1124a.m3315b(this.f5334c.getContext(), resourceId));
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                C1102e.m3214a(this.f5334c, obtainStyledAttributes.getColorStateList(1));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                C1102e.m3215a(this.f5334c, C1518y.m5425a(obtainStyledAttributes.getInt(2, -1), null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

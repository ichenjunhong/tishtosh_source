package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.p035a.C0720f.C0721a;
import android.support.p030v4.widget.C1095b;
import android.support.p030v4.widget.C1115o;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.m */
final class C1491m {

    /* renamed from: a */
    int f5368a;

    /* renamed from: b */
    Typeface f5369b;

    /* renamed from: c */
    boolean f5370c;

    /* renamed from: d */
    private final TextView f5371d;

    /* renamed from: e */
    private C1448az f5372e;

    /* renamed from: f */
    private C1448az f5373f;

    /* renamed from: g */
    private C1448az f5374g;

    /* renamed from: h */
    private C1448az f5375h;

    /* renamed from: i */
    private C1448az f5376i;

    /* renamed from: j */
    private C1448az f5377j;

    /* renamed from: k */
    private final C1493n f5378k = new C1493n(this.f5371d);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5794a(boolean z) {
        this.f5371d.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5795a(boolean z, int i, int i2, int i3, int i4) {
        if (!C1095b.f3483a) {
            mo5797b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5796a(int[] iArr, int i) throws IllegalArgumentException {
        this.f5378k.mo5809a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo5798c() {
        return this.f5378k.mo5813e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo5799d() {
        return this.f5378k.f5383a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo5800e() {
        return this.f5378k.mo5804a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo5801f() {
        return this.f5378k.mo5810b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo5802g() {
        return this.f5378k.mo5811c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final int[] mo5803h() {
        return this.f5378k.f5384b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo5797b() {
        this.f5378k.mo5812d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5788a() {
        if (!(this.f5372e == null && this.f5373f == null && this.f5374g == null && this.f5375h == null)) {
            Drawable[] compoundDrawables = this.f5371d.getCompoundDrawables();
            m5241a(compoundDrawables[0], this.f5372e);
            m5241a(compoundDrawables[1], this.f5373f);
            m5241a(compoundDrawables[2], this.f5374g);
            m5241a(compoundDrawables[3], this.f5375h);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f5376i != null || this.f5377j != null) {
            Drawable[] compoundDrawablesRelative = this.f5371d.getCompoundDrawablesRelative();
            m5241a(compoundDrawablesRelative[0], this.f5376i);
            m5241a(compoundDrawablesRelative[2], this.f5377j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5789a(int i) {
        this.f5378k.mo5805a(i);
    }

    C1491m(TextView textView) {
        this.f5371d = textView;
    }

    /* renamed from: b */
    private void m5242b(int i, float f) {
        this.f5378k.mo5806a(i, f);
    }

    /* renamed from: a */
    private void m5241a(Drawable drawable, C1448az azVar) {
        if (drawable != null && azVar != null) {
            C1480g.m5207a(drawable, azVar, this.f5371d.getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5790a(int i, float f) {
        if (!C1095b.f3483a && !mo5798c()) {
            m5242b(i, f);
        }
    }

    /* renamed from: a */
    private void m5240a(Context context, C1451bb bbVar) {
        this.f5368a = bbVar.mo5650a(2, this.f5368a);
        int i = 10;
        boolean z = false;
        if (bbVar.mo5664f(10) || bbVar.mo5664f(11)) {
            this.f5369b = null;
            if (bbVar.mo5664f(11)) {
                i = 11;
            }
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f5371d);
                try {
                    this.f5369b = bbVar.mo5651a(i, this.f5368a, (C0721a) new C0721a() {
                        /* renamed from: a */
                        public final void mo2382a(Typeface typeface) {
                            C1491m mVar = C1491m.this;
                            WeakReference weakReference = weakReference;
                            if (mVar.f5370c) {
                                mVar.f5369b = typeface;
                                TextView textView = (TextView) weakReference.get();
                                if (textView != null) {
                                    textView.setTypeface(typeface, mVar.f5368a);
                                }
                            }
                        }
                    });
                    if (this.f5369b == null) {
                        z = true;
                    }
                    this.f5370c = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f5369b == null) {
                String d = bbVar.mo5660d(i);
                if (d != null) {
                    this.f5369b = Typeface.create(d, this.f5368a);
                }
            }
            return;
        }
        if (bbVar.mo5664f(1)) {
            this.f5370c = false;
            switch (bbVar.mo5650a(1, 1)) {
                case 1:
                    this.f5369b = Typeface.SANS_SERIF;
                    return;
                case 2:
                    this.f5369b = Typeface.SERIF;
                    return;
                case 3:
                    this.f5369b = Typeface.MONOSPACE;
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5792a(Context context, int i) {
        C1451bb a = C1451bb.m5030a(context, i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
        if (a.mo5664f(12)) {
            mo5794a(a.mo5654a(12, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo5664f(3)) {
            ColorStateList e = a.mo5662e(3);
            if (e != null) {
                this.f5371d.setTextColor(e);
            }
        }
        if (a.mo5664f(0) && a.mo5661e(0, -1) == 0) {
            this.f5371d.setTextSize(0, 0.0f);
        }
        m5240a(context, a);
        a.mo5653a();
        if (this.f5369b != null) {
            this.f5371d.setTypeface(this.f5369b, this.f5368a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5793a(AttributeSet attributeSet, int i) {
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z2;
        ColorStateList colorStateList3;
        boolean z3;
        ColorStateList colorStateList4;
        ColorStateList colorStateList5;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f5371d.getContext();
        C1480g a = C1480g.m5205a();
        C1451bb a2 = C1451bb.m5032a(context, attributeSet2, new int[]{16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667}, i2, 0);
        int g = a2.mo5665g(0, -1);
        if (a2.mo5664f(3)) {
            this.f5372e = m5239a(context, a, a2.mo5665g(3, 0));
        }
        if (a2.mo5664f(1)) {
            this.f5373f = m5239a(context, a, a2.mo5665g(1, 0));
        }
        if (a2.mo5664f(4)) {
            this.f5374g = m5239a(context, a, a2.mo5665g(4, 0));
        }
        if (a2.mo5664f(2)) {
            this.f5375h = m5239a(context, a, a2.mo5665g(2, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a2.mo5664f(5)) {
                this.f5376i = m5239a(context, a, a2.mo5665g(5, 0));
            }
            if (a2.mo5664f(6)) {
                this.f5377j = m5239a(context, a, a2.mo5665g(6, 0));
            }
        }
        a2.mo5653a();
        boolean z4 = this.f5371d.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C1451bb a3 = C1451bb.m5030a(context, g, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
            if (z4 || !a3.mo5664f(12)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo5654a(12, false);
                z2 = true;
            }
            m5240a(context, a3);
            if (VERSION.SDK_INT < 23) {
                if (a3.mo5664f(3)) {
                    colorStateList2 = a3.mo5662e(3);
                } else {
                    colorStateList2 = null;
                }
                if (a3.mo5664f(4)) {
                    colorStateList4 = a3.mo5662e(4);
                } else {
                    colorStateList4 = null;
                }
                if (a3.mo5664f(5)) {
                    colorStateList5 = a3.mo5662e(5);
                } else {
                    colorStateList5 = null;
                }
            } else {
                colorStateList2 = null;
                colorStateList5 = null;
                colorStateList4 = null;
            }
            a3.mo5653a();
            colorStateList3 = colorStateList5;
            colorStateList = colorStateList4;
        } else {
            colorStateList3 = null;
            z2 = false;
            colorStateList2 = null;
            colorStateList = null;
            z = false;
        }
        C1451bb a4 = C1451bb.m5032a(context, attributeSet2, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j}, i2, 0);
        if (z4 || !a4.mo5664f(12)) {
            z3 = z;
        } else {
            z3 = a4.mo5654a(12, false);
            z2 = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a4.mo5664f(3)) {
                colorStateList2 = a4.mo5662e(3);
            }
            if (a4.mo5664f(4)) {
                colorStateList = a4.mo5662e(4);
            }
            if (a4.mo5664f(5)) {
                colorStateList3 = a4.mo5662e(5);
            }
        }
        ColorStateList colorStateList6 = colorStateList;
        if (VERSION.SDK_INT >= 28 && a4.mo5664f(0) && a4.mo5661e(0, -1) == 0) {
            this.f5371d.setTextSize(0, 0.0f);
        }
        m5240a(context, a4);
        a4.mo5653a();
        if (colorStateList2 != null) {
            this.f5371d.setTextColor(colorStateList2);
        }
        if (colorStateList6 != null) {
            this.f5371d.setHintTextColor(colorStateList6);
        }
        if (colorStateList3 != null) {
            this.f5371d.setLinkTextColor(colorStateList3);
        }
        if (!z4 && z2) {
            mo5794a(z3);
        }
        if (this.f5369b != null) {
            this.f5371d.setTypeface(this.f5369b, this.f5368a);
        }
        this.f5378k.mo5808a(attributeSet2, i2);
        if (C1095b.f3483a && this.f5378k.f5383a != 0) {
            int[] iArr = this.f5378k.f5384b;
            if (iArr.length > 0) {
                if (((float) this.f5371d.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f5371d.setAutoSizeTextTypeUniformWithConfiguration(this.f5378k.mo5810b(), this.f5378k.mo5811c(), this.f5378k.mo5804a(), 0);
                } else {
                    this.f5371d.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
                }
            }
        }
        C1451bb a5 = C1451bb.m5031a(context, attributeSet2, new int[]{16842804, R.attr.bn, R.attr.bo, R.attr.bp, R.attr.bq, R.attr.br, R.attr.ls, R.attr.m2, R.attr.q3, R.attr.sg, R.attr.a5j});
        int e = a5.mo5661e(6, -1);
        int e2 = a5.mo5661e(8, -1);
        int e3 = a5.mo5661e(9, -1);
        a5.mo5653a();
        if (e != -1) {
            C1115o.m3263c(this.f5371d, e);
        }
        if (e2 != -1) {
            C1115o.m3264d(this.f5371d, e2);
        }
        if (e3 != -1) {
            C1115o.m3265e(this.f5371d, e3);
        }
    }

    /* renamed from: a */
    private static C1448az m5239a(Context context, C1480g gVar, int i) {
        ColorStateList b = gVar.mo5774b(context, i);
        if (b == null) {
            return null;
        }
        C1448az azVar = new C1448az();
        azVar.f5228d = true;
        azVar.f5225a = b;
        return azVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5791a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f5378k.mo5807a(i, i2, i3, i4);
    }
}

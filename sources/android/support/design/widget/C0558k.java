package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.design.p022a.C0389a;
import android.support.design.p022a.C0390b;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1115o;
import android.support.p030v4.widget.Space;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.widget.k */
final class C0558k {

    /* renamed from: a */
    final Context f2004a;

    /* renamed from: b */
    final TextInputLayout f2005b;

    /* renamed from: c */
    public Animator f2006c;

    /* renamed from: d */
    public int f2007d;

    /* renamed from: e */
    int f2008e;

    /* renamed from: f */
    public CharSequence f2009f;

    /* renamed from: g */
    public boolean f2010g;

    /* renamed from: h */
    public TextView f2011h;

    /* renamed from: i */
    int f2012i;

    /* renamed from: j */
    public CharSequence f2013j;

    /* renamed from: k */
    public boolean f2014k;

    /* renamed from: l */
    TextView f2015l;

    /* renamed from: m */
    int f2016m;

    /* renamed from: n */
    Typeface f2017n;

    /* renamed from: o */
    private LinearLayout f2018o;

    /* renamed from: p */
    private int f2019p;

    /* renamed from: q */
    private FrameLayout f2020q;

    /* renamed from: r */
    private int f2021r;

    /* renamed from: s */
    private final float f2022s;

    /* renamed from: c */
    private static boolean m1526c(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1739a(TextView textView, CharSequence charSequence) {
        return C1056u.m3079y(this.f2005b) && this.f2005b.isEnabled() && (this.f2008e != this.f2007d || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1738a(TextView textView, int i) {
        if (this.f2018o == null && this.f2020q == null) {
            this.f2018o = new LinearLayout(this.f2004a);
            this.f2018o.setOrientation(0);
            this.f2005b.addView(this.f2018o, -1, -2);
            this.f2020q = new FrameLayout(this.f2004a);
            this.f2018o.addView(this.f2020q, -1, new LayoutParams(-2, -2));
            this.f2018o.addView(new Space(this.f2004a), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f2005b.getEditText() != null) {
                mo1743c();
            }
        }
        if (m1526c(i)) {
            this.f2020q.setVisibility(0);
            this.f2020q.addView(textView);
            this.f2021r++;
        } else {
            this.f2018o.addView(textView, i);
        }
        this.f2018o.setVisibility(0);
        this.f2019p++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1740b() {
        if (this.f2006c != null) {
            this.f2006c.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo1745e() {
        if (this.f2011h != null) {
            return this.f2011h.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final ColorStateList mo1746f() {
        if (this.f2011h != null) {
            return this.f2011h.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1743c() {
        boolean z;
        if (this.f2018o == null || this.f2005b.getEditText() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1056u.m3044b(this.f2018o, C1056u.m3061i(this.f2005b.getEditText()), 0, C1056u.m3063j(this.f2005b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo1744d() {
        if (this.f2008e != 1 || this.f2011h == null || TextUtils.isEmpty(this.f2009f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1735a() {
        this.f2009f = null;
        mo1740b();
        if (this.f2007d == 1) {
            if (!this.f2014k || TextUtils.isEmpty(this.f2013j)) {
                this.f2008e = 0;
            } else {
                this.f2008e = 2;
            }
        }
        mo1737a(this.f2007d, this.f2008e, mo1739a(this.f2011h, (CharSequence) null));
    }

    /* renamed from: a */
    private ObjectAnimator m1520a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f2022s, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C0389a.f1270d);
        return ofFloat;
    }

    /* renamed from: d */
    private TextView m1527d(int i) {
        switch (i) {
            case 1:
                return this.f2011h;
            case 2:
                return this.f2015l;
            default:
                return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1741b(int i) {
        this.f2016m = i;
        if (this.f2015l != null) {
            C1115o.m3256a(this.f2015l, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1736a(int i) {
        this.f2012i = i;
        if (this.f2011h != null) {
            this.f2005b.mo1603a(this.f2011h, i);
        }
    }

    /* renamed from: a */
    private static void m1523a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    static void m1524a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m1521a(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C0389a.f1267a);
        return ofFloat;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1742b(TextView textView, int i) {
        if (this.f2018o != null) {
            if (!m1526c(i) || this.f2020q == null) {
                this.f2018o.removeView(textView);
            } else {
                this.f2021r--;
                m1523a((ViewGroup) this.f2020q, this.f2021r);
                this.f2020q.removeView(textView);
            }
            this.f2019p--;
            m1523a((ViewGroup) this.f2018o, this.f2019p);
        }
    }

    /* renamed from: a */
    private void m1522a(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView d = m1527d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView d2 = m1527d(i);
                if (d2 != null) {
                    d2.setVisibility(4);
                    if (i == 1) {
                        d2.setText(null);
                    }
                }
            }
            this.f2007d = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1737a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2006c = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m1525a(arrayList2, this.f2014k, this.f2015l, 2, i3, i4);
            m1525a(arrayList2, this.f2010g, this.f2011h, 1, i3, i4);
            C0390b.m965a(animatorSet, arrayList);
            final TextView d = m1527d(i);
            final TextView d2 = m1527d(i2);
            final int i5 = i2;
            final int i6 = i;
            C05591 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    if (d2 != null) {
                        d2.setVisibility(0);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    C0558k.this.f2007d = i5;
                    C0558k.this.f2006c = null;
                    if (d != null) {
                        d.setVisibility(4);
                        if (i6 == 1 && C0558k.this.f2011h != null) {
                            C0558k.this.f2011h.setText(null);
                        }
                    }
                }
            };
            animatorSet.addListener(r0);
            animatorSet.start();
        } else {
            m1522a(i, i2);
        }
        this.f2005b.mo1601a();
        this.f2005b.mo1604a(z);
        this.f2005b.mo1606b();
    }

    /* renamed from: a */
    private void m1525a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(m1521a(textView, z2));
                if (i3 == i) {
                    list.add(m1520a(textView));
                }
            }
        }
    }
}

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.p022a.C0389a;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.AbsSavedState;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.widget.AppCompatTextView;
import android.support.p043v7.widget.C1451bb;
import android.support.p043v7.widget.C1480g;
import android.support.p043v7.widget.C1518y;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public final class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    private float f1812A;

    /* renamed from: B */
    private int f1813B;

    /* renamed from: C */
    private final int f1814C;

    /* renamed from: D */
    private final int f1815D;

    /* renamed from: E */
    private int f1816E;

    /* renamed from: F */
    private int f1817F;

    /* renamed from: G */
    private Drawable f1818G;

    /* renamed from: H */
    private final Rect f1819H;

    /* renamed from: I */
    private final RectF f1820I;

    /* renamed from: J */
    private Typeface f1821J;

    /* renamed from: K */
    private Drawable f1822K;

    /* renamed from: L */
    private CharSequence f1823L;

    /* renamed from: M */
    private CheckableImageButton f1824M;

    /* renamed from: N */
    private boolean f1825N;

    /* renamed from: O */
    private Drawable f1826O;

    /* renamed from: P */
    private Drawable f1827P;

    /* renamed from: Q */
    private ColorStateList f1828Q;

    /* renamed from: R */
    private boolean f1829R;

    /* renamed from: S */
    private Mode f1830S;

    /* renamed from: T */
    private boolean f1831T;

    /* renamed from: U */
    private ColorStateList f1832U;

    /* renamed from: V */
    private ColorStateList f1833V;

    /* renamed from: W */
    private final int f1834W;

    /* renamed from: a */
    EditText f1835a;

    /* renamed from: aa */
    private final int f1836aa;

    /* renamed from: ab */
    private int f1837ab;

    /* renamed from: ac */
    private final int f1838ac;

    /* renamed from: ad */
    private ValueAnimator f1839ad;

    /* renamed from: ae */
    private boolean f1840ae;

    /* renamed from: af */
    private boolean f1841af;

    /* renamed from: b */
    public boolean f1842b;

    /* renamed from: c */
    public boolean f1843c;

    /* renamed from: d */
    public boolean f1844d;

    /* renamed from: e */
    public boolean f1845e;

    /* renamed from: f */
    public boolean f1846f;

    /* renamed from: g */
    final C0543e f1847g;

    /* renamed from: h */
    public boolean f1848h;

    /* renamed from: i */
    public boolean f1849i;

    /* renamed from: j */
    private final FrameLayout f1850j;

    /* renamed from: k */
    private CharSequence f1851k;

    /* renamed from: l */
    private final C0558k f1852l;

    /* renamed from: m */
    private int f1853m;

    /* renamed from: n */
    private boolean f1854n;

    /* renamed from: o */
    private TextView f1855o;

    /* renamed from: p */
    private final int f1856p;

    /* renamed from: q */
    private final int f1857q;

    /* renamed from: r */
    private CharSequence f1858r;

    /* renamed from: s */
    private GradientDrawable f1859s;

    /* renamed from: t */
    private final int f1860t;

    /* renamed from: u */
    private final int f1861u;

    /* renamed from: v */
    private int f1862v;

    /* renamed from: w */
    private final int f1863w;

    /* renamed from: x */
    private float f1864x;

    /* renamed from: y */
    private float f1865y;

    /* renamed from: z */
    private float f1866z;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        CharSequence f1870a;

        /* renamed from: b */
        boolean f1871b;

        public String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f1870a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f1870a, parcel, i);
            parcel.writeInt(this.f1871b ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1870a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f1871b = z;
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$a */
    public static class C0533a extends C1002a {

        /* renamed from: a */
        private final TextInputLayout f1872a;

        public C0533a(TextInputLayout textInputLayout) {
            this.f1872a = textInputLayout;
        }

        /* renamed from: b */
        public final void mo1675b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence charSequence;
            super.mo1675b(view, accessibilityEvent);
            EditText editText = this.f1872a.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f1872a.getHint();
            }
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityEvent.getText().add(charSequence);
            }
        }

        /* renamed from: a */
        public final void mo1119a(View view, C1008c cVar) {
            Editable editable;
            boolean z;
            boolean z2;
            Bundle bundle;
            super.mo1119a(view, cVar);
            EditText editText = this.f1872a.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f1872a.getHint();
            CharSequence error = this.f1872a.getError();
            CharSequence counterOverflowDescription = this.f1872a.getCounterOverflowDescription();
            boolean z3 = !TextUtils.isEmpty(editable);
            boolean z4 = !TextUtils.isEmpty(hint);
            boolean z5 = !TextUtils.isEmpty(error);
            int i = 0;
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                cVar.mo3144c((CharSequence) editable);
            } else if (z4) {
                cVar.mo3144c(hint);
            }
            if (z4) {
                if (VERSION.SDK_INT >= 26) {
                    cVar.f3230a.setHintText(hint);
                } else if (VERSION.SDK_INT >= 19) {
                    cVar.f3230a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hint);
                }
                if (z3 || !z4) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (VERSION.SDK_INT >= 26) {
                    cVar.f3230a.setShowingHintText(z2);
                } else {
                    if (VERSION.SDK_INT >= 19) {
                        bundle = cVar.f3230a.getExtras();
                    } else {
                        bundle = new Bundle();
                    }
                    if (bundle != null) {
                        int i2 = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & -5;
                        if (z2) {
                            i = 4;
                        }
                        bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i);
                    }
                }
            }
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                if (VERSION.SDK_INT >= 21) {
                    cVar.f3230a.setError(error);
                }
                if (VERSION.SDK_INT >= 19) {
                    cVar.f3230a.setContentInvalid(true);
                }
            }
        }
    }

    public final int getBoxBackgroundColor() {
        return this.f1817F;
    }

    public final float getBoxCornerRadiusBottomEnd() {
        return this.f1866z;
    }

    public final float getBoxCornerRadiusBottomStart() {
        return this.f1812A;
    }

    public final float getBoxCornerRadiusTopEnd() {
        return this.f1865y;
    }

    public final float getBoxCornerRadiusTopStart() {
        return this.f1864x;
    }

    public final int getBoxStrokeColor() {
        return this.f1837ab;
    }

    public final int getCounterMaxLength() {
        return this.f1853m;
    }

    public final ColorStateList getDefaultHintTextColor() {
        return this.f1832U;
    }

    public final EditText getEditText() {
        return this.f1835a;
    }

    public final CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1823L;
    }

    public final Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1822K;
    }

    public final Typeface getTypeface() {
        return this.f1821J;
    }

    /* renamed from: f */
    private boolean m1421f() {
        return this.f1852l.f2014k;
    }

    public final int getErrorCurrentTextColors() {
        return this.f1852l.mo1745e();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.f1852l.mo1745e();
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.f1847g.mo1697a();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f1847g.mo1705c();
    }

    /* renamed from: c */
    private void m1416c() {
        m1418d();
        if (this.f1862v != 0) {
            m1420e();
        }
        m1422g();
    }

    /* renamed from: t */
    private void m1435t() {
        if (m1433r()) {
            ((C0544f) this.f1859s).mo1708a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final CharSequence getError() {
        if (this.f1852l.f2010g) {
            return this.f1852l.f2009f;
        }
        return null;
    }

    public final CharSequence getHelperText() {
        if (this.f1852l.f2014k) {
            return this.f1852l.f2013j;
        }
        return null;
    }

    public final int getHelperTextCurrentTextColor() {
        C0558k kVar = this.f1852l;
        if (kVar.f2015l != null) {
            return kVar.f2015l.getCurrentTextColor();
        }
        return -1;
    }

    public final CharSequence getHint() {
        if (this.f1843c) {
            return this.f1858r;
        }
        return null;
    }

    /* renamed from: e */
    private void m1420e() {
        LayoutParams layoutParams = (LayoutParams) this.f1850j.getLayoutParams();
        int i = m1424i();
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f1850j.requestLayout();
        }
    }

    private Drawable getBoxBackground() {
        if (this.f1862v == 1 || this.f1862v == 2) {
            return this.f1859s;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    private boolean m1430o() {
        if (this.f1835a == null || !(this.f1835a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private boolean m1431p() {
        if (!this.f1845e || (!m1430o() && !this.f1825N)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m1433r() {
        if (!this.f1843c || TextUtils.isEmpty(this.f1858r) || !(this.f1859s instanceof C0544f)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private void m1434s() {
        if (m1433r()) {
            RectF rectF = this.f1820I;
            this.f1847g.mo1701a(rectF);
            m1413a(rectF);
            ((C0544f) this.f1859s).mo1709a(rectF);
        }
    }

    /* access modifiers changed from: 0000 */
    public final CharSequence getCounterOverflowDescription() {
        if (!this.f1842b || !this.f1854n || this.f1855o == null) {
            return null;
        }
        return this.f1855o.getContentDescription();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f1852l.mo1744d()) {
            savedState.f1870a = getError();
        }
        savedState.f1871b = this.f1825N;
        return savedState;
    }

    /* renamed from: d */
    private void m1418d() {
        if (this.f1862v == 0) {
            this.f1859s = null;
        } else if (this.f1862v != 2 || !this.f1843c || (this.f1859s instanceof C0544f)) {
            if (!(this.f1859s instanceof GradientDrawable)) {
                this.f1859s = new GradientDrawable();
            }
        } else {
            this.f1859s = new C0544f();
        }
    }

    /* renamed from: h */
    private int m1423h() {
        if (this.f1835a == null) {
            return 0;
        }
        switch (this.f1862v) {
            case 1:
                return this.f1835a.getTop();
            case 2:
                return this.f1835a.getTop() + m1424i();
            default:
                return 0;
        }
    }

    /* renamed from: i */
    private int m1424i() {
        if (!this.f1843c) {
            return 0;
        }
        switch (this.f1862v) {
            case 0:
            case 1:
                return (int) this.f1847g.mo1697a();
            case 2:
                return (int) (this.f1847g.mo1697a() / 2.0f);
            default:
                return 0;
        }
    }

    /* renamed from: k */
    private void m1426k() {
        switch (this.f1862v) {
            case 1:
                this.f1813B = 0;
                return;
            case 2:
                if (this.f1837ab == 0) {
                    this.f1837ab = this.f1833V.getColorForState(getDrawableState(), this.f1833V.getDefaultColor());
                    break;
                }
                break;
        }
    }

    /* renamed from: m */
    private void m1428m() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f1835a.getBackground();
            if (background != null && !this.f1840ae) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f1840ae = C0546h.m1487a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f1840ae) {
                    C1056u.m3030a((View) this.f1835a, newDrawable);
                    this.f1840ae = true;
                    m1416c();
                }
            }
        }
    }

    /* renamed from: g */
    private void m1422g() {
        if (this.f1862v != 0 && this.f1859s != null && this.f1835a != null && getRight() != 0) {
            int left = this.f1835a.getLeft();
            int h = m1423h();
            int right = this.f1835a.getRight();
            int bottom = this.f1835a.getBottom() + this.f1860t;
            if (this.f1862v == 2) {
                left += this.f1815D / 2;
                h -= this.f1815D / 2;
                right -= this.f1815D / 2;
                bottom += this.f1815D / 2;
            }
            this.f1859s.setBounds(left, h, right, bottom);
            m1427l();
            m1425j();
        }
    }

    private float[] getCornerRadiiAsArray() {
        boolean z;
        if (C1056u.m3055f(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new float[]{this.f1864x, this.f1864x, this.f1865y, this.f1865y, this.f1866z, this.f1866z, this.f1812A, this.f1812A};
        }
        return new float[]{this.f1865y, this.f1865y, this.f1864x, this.f1864x, this.f1812A, this.f1812A, this.f1866z, this.f1866z};
    }

    /* renamed from: j */
    private void m1425j() {
        if (this.f1835a != null) {
            Drawable background = this.f1835a.getBackground();
            if (background != null) {
                if (C1518y.m5428c(background)) {
                    background = background.mutate();
                }
                C0545g.m1485a((ViewGroup) this, (View) this.f1835a, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f1835a.getBottom());
                }
            }
        }
    }

    /* renamed from: l */
    private void m1427l() {
        if (this.f1859s != null) {
            m1426k();
            if (this.f1835a != null && this.f1862v == 2) {
                if (this.f1835a.getBackground() != null) {
                    this.f1818G = this.f1835a.getBackground();
                }
                C1056u.m3030a((View) this.f1835a, (Drawable) null);
            }
            if (!(this.f1835a == null || this.f1862v != 1 || this.f1818G == null)) {
                C1056u.m3030a((View) this.f1835a, this.f1818G);
            }
            if (this.f1813B >= 0 && this.f1816E != 0) {
                this.f1859s.setStroke(this.f1813B, this.f1816E);
            }
            this.f1859s.setCornerRadii(getCornerRadiiAsArray());
            this.f1859s.setColor(this.f1817F);
            invalidate();
        }
    }

    /* renamed from: q */
    private void m1432q() {
        if (this.f1822K == null) {
            return;
        }
        if (this.f1829R || this.f1831T) {
            this.f1822K = C0809a.m2337f(this.f1822K).mutate();
            if (this.f1829R) {
                C0809a.m2327a(this.f1822K, this.f1828Q);
            }
            if (this.f1831T) {
                C0809a.m2330a(this.f1822K, this.f1830S);
            }
            if (this.f1824M != null && this.f1824M.getDrawable() != this.f1822K) {
                this.f1824M.setImageDrawable(this.f1822K);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.f1841af) {
            boolean z4 = true;
            this.f1841af = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C1056u.m3079y(this) || !isEnabled()) {
                z = false;
            } else {
                z = true;
            }
            mo1604a(z);
            mo1601a();
            m1422g();
            mo1606b();
            if (this.f1847g != null) {
                C0543e eVar = this.f1847g;
                eVar.f1941v = drawableState;
                if ((eVar.f1930k == null || !eVar.f1930k.isStateful()) && (eVar.f1929j == null || !eVar.f1929j.isStateful())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    eVar.mo1706d();
                } else {
                    z4 = false;
                }
                z2 = z4 | false;
            } else {
                z2 = false;
            }
            if (z2) {
                invalidate();
            }
            this.f1841af = false;
        }
    }

    /* renamed from: n */
    private void m1429n() {
        if (this.f1835a != null) {
            if (m1431p()) {
                if (this.f1824M == null) {
                    this.f1824M = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.jc, this.f1850j, false);
                    this.f1824M.setImageDrawable(this.f1822K);
                    this.f1824M.setContentDescription(this.f1823L);
                    this.f1850j.addView(this.f1824M);
                    this.f1824M.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            TextInputLayout.this.mo1607b(false);
                        }
                    });
                }
                if (this.f1835a != null && C1056u.m3066l(this.f1835a) <= 0) {
                    this.f1835a.setMinimumHeight(C1056u.m3066l(this.f1824M));
                }
                this.f1824M.setVisibility(0);
                this.f1824M.setChecked(this.f1825N);
                if (this.f1826O == null) {
                    this.f1826O = new ColorDrawable();
                }
                this.f1826O.setBounds(0, 0, this.f1824M.getMeasuredWidth(), 1);
                Drawable[] b = C1115o.m3261b(this.f1835a);
                if (b[2] != this.f1826O) {
                    this.f1827P = b[2];
                }
                C1115o.m3258a((TextView) this.f1835a, b[0], b[1], this.f1826O, b[3]);
                this.f1824M.setPadding(this.f1835a.getPaddingLeft(), this.f1835a.getPaddingTop(), this.f1835a.getPaddingRight(), this.f1835a.getPaddingBottom());
                return;
            }
            if (this.f1824M != null && this.f1824M.getVisibility() == 0) {
                this.f1824M.setVisibility(8);
            }
            if (this.f1826O != null) {
                Drawable[] b2 = C1115o.m3261b(this.f1835a);
                if (b2[2] == this.f1826O) {
                    C1115o.m3258a((TextView) this.f1835a, b2[0], b2[1], this.f1827P, b2[3]);
                    this.f1826O = null;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1606b() {
        boolean z;
        if (this.f1859s != null && this.f1862v != 0) {
            boolean z2 = true;
            if (this.f1835a == null || !this.f1835a.hasFocus()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f1835a == null || !this.f1835a.isHovered()) {
                z2 = false;
            }
            if (this.f1862v == 2) {
                if (!isEnabled()) {
                    this.f1816E = this.f1838ac;
                } else if (this.f1852l.mo1744d()) {
                    this.f1816E = this.f1852l.mo1745e();
                } else if (this.f1854n && this.f1855o != null) {
                    this.f1816E = this.f1855o.getCurrentTextColor();
                } else if (z) {
                    this.f1816E = this.f1837ab;
                } else if (z2) {
                    this.f1816E = this.f1836aa;
                } else {
                    this.f1816E = this.f1834W;
                }
                if ((z2 || z) && isEnabled()) {
                    this.f1813B = this.f1815D;
                } else {
                    this.f1813B = this.f1814C;
                }
                m1427l();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1601a() {
        if (this.f1835a != null) {
            Drawable background = this.f1835a.getBackground();
            if (background != null) {
                m1428m();
                if (C1518y.m5428c(background)) {
                    background = background.mutate();
                }
                if (this.f1852l.mo1744d()) {
                    background.setColorFilter(C1480g.m5201a(this.f1852l.mo1745e(), Mode.SRC_IN));
                } else if (!this.f1854n || this.f1855o == null) {
                    C0809a.m2336e(background);
                    this.f1835a.refreshDrawableState();
                } else {
                    background.setColorFilter(C1480g.m5201a(this.f1855o.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
        }
    }

    public final void setHintAnimationEnabled(boolean z) {
        this.f1848h = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1604a(boolean z) {
        m1415a(z, false);
    }

    public final void setEnabled(boolean z) {
        m1414a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public final void setErrorTextAppearance(int i) {
        this.f1852l.mo1736a(i);
    }

    public final void setHelperTextTextAppearance(int i) {
        this.f1852l.mo1741b(i);
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f1849i = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1849i = false;
    }

    public final void setBoxBackgroundColor(int i) {
        if (this.f1817F != i) {
            this.f1817F = i;
            m1427l();
        }
    }

    public final void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0726c.m2098c(getContext(), i));
    }

    public final void setBoxBackgroundMode(int i) {
        if (i != this.f1862v) {
            this.f1862v = i;
            m1416c();
        }
    }

    public final void setBoxStrokeColor(int i) {
        if (this.f1837ab != i) {
            this.f1837ab = i;
            mo1606b();
        }
    }

    public final void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1832U = colorStateList;
        this.f1833V = colorStateList;
        if (this.f1835a != null) {
            mo1604a(false);
        }
    }

    public final void setErrorTextColor(ColorStateList colorStateList) {
        C0558k kVar = this.f1852l;
        if (kVar.f2011h != null) {
            kVar.f2011h.setTextColor(colorStateList);
        }
    }

    public final void setHelperTextColor(ColorStateList colorStateList) {
        C0558k kVar = this.f1852l;
        if (kVar.f2015l != null) {
            kVar.f2015l.setTextColor(colorStateList);
        }
    }

    public final void setHint(CharSequence charSequence) {
        if (this.f1843c) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public final void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public final void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1124a.m3315b(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public final void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f1828Q = colorStateList;
        this.f1829R = true;
        m1432q();
    }

    public final void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f1830S = mode;
        this.f1831T = true;
        m1432q();
    }

    public final void setTextInputAccessibilityDelegate(C0533a aVar) {
        if (this.f1835a != null) {
            C1056u.m3031a((View) this.f1835a, (C1002a) aVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3119e);
        setError(savedState.f1870a);
        if (savedState.f1871b) {
            mo1607b(true);
        }
        requestLayout();
    }

    public final void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1823L = charSequence;
        if (this.f1824M != null) {
            this.f1824M.setContentDescription(charSequence);
        }
    }

    public final void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1822K = drawable;
        if (this.f1824M != null) {
            this.f1824M.setImageDrawable(drawable);
        }
    }

    public final void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f1845e != z) {
            this.f1845e = z;
            if (!z && this.f1825N && this.f1835a != null) {
                this.f1835a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f1825N = false;
            m1429n();
        }
    }

    /* renamed from: a */
    private void m1413a(RectF rectF) {
        rectF.left -= (float) this.f1861u;
        rectF.top -= (float) this.f1861u;
        rectF.right += (float) this.f1861u;
        rectF.bottom += (float) this.f1861u;
    }

    /* renamed from: c */
    private void m1417c(boolean z) {
        if (this.f1839ad != null && this.f1839ad.isRunning()) {
            this.f1839ad.cancel();
        }
        if (!z || !this.f1848h) {
            this.f1847g.mo1699a(1.0f);
        } else {
            m1412a(1.0f);
        }
        this.f1846f = false;
        if (m1433r()) {
            m1434s();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f1858r)) {
            this.f1858r = charSequence;
            C0543e eVar = this.f1847g;
            if (charSequence == null || !charSequence.equals(eVar.f1934o)) {
                eVar.f1934o = charSequence;
                eVar.f1935p = null;
                eVar.mo1707e();
                eVar.mo1706d();
            }
            if (!this.f1846f) {
                m1434s();
            }
        }
    }

    /* renamed from: b */
    public final void mo1607b(boolean z) {
        if (this.f1845e) {
            int selectionEnd = this.f1835a.getSelectionEnd();
            if (m1430o()) {
                this.f1835a.setTransformationMethod(null);
                this.f1825N = true;
            } else {
                this.f1835a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f1825N = false;
            }
            this.f1824M.setChecked(this.f1825N);
            if (z) {
                this.f1824M.jumpDrawablesToCurrentState();
            }
            this.f1835a.setSelection(selectionEnd);
        }
    }

    public final void setCounterMaxLength(int i) {
        int i2;
        if (this.f1853m != i) {
            if (i > 0) {
                this.f1853m = i;
            } else {
                this.f1853m = -1;
            }
            if (this.f1842b) {
                if (this.f1835a == null) {
                    i2 = 0;
                } else {
                    i2 = this.f1835a.getText().length();
                }
                mo1602a(i2);
            }
        }
    }

    public final void setError(CharSequence charSequence) {
        if (!this.f1852l.f2010g) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C0558k kVar = this.f1852l;
            kVar.mo1740b();
            kVar.f2009f = charSequence;
            kVar.f2011h.setText(charSequence);
            if (kVar.f2007d != 1) {
                kVar.f2008e = 1;
            }
            kVar.mo1737a(kVar.f2007d, kVar.f2008e, kVar.mo1739a(kVar.f2011h, charSequence));
            return;
        }
        this.f1852l.mo1735a();
    }

    public final void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!m1421f()) {
                setHelperTextEnabled(true);
            }
            C0558k kVar = this.f1852l;
            kVar.mo1740b();
            kVar.f2013j = charSequence;
            kVar.f2015l.setText(charSequence);
            if (kVar.f2007d != 2) {
                kVar.f2008e = 2;
            }
            kVar.mo1737a(kVar.f2007d, kVar.f2008e, kVar.mo1739a(kVar.f2015l, charSequence));
        } else if (m1421f()) {
            setHelperTextEnabled(false);
        }
    }

    public final void setTypeface(Typeface typeface) {
        if (typeface != this.f1821J) {
            this.f1821J = typeface;
            this.f1847g.mo1702a(typeface);
            C0558k kVar = this.f1852l;
            if (typeface != kVar.f2017n) {
                kVar.f2017n = typeface;
                C0558k.m1524a(kVar.f2011h, typeface);
                C0558k.m1524a(kVar.f2015l, typeface);
            }
            if (this.f1855o != null) {
                this.f1855o.setTypeface(typeface);
            }
        }
    }

    /* renamed from: a */
    private void m1412a(float f) {
        if (this.f1847g.f1922c != f) {
            if (this.f1839ad == null) {
                this.f1839ad = new ValueAnimator();
                this.f1839ad.setInterpolator(C0389a.f1268b);
                this.f1839ad.setDuration(167);
                this.f1839ad.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.f1847g.mo1699a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.f1839ad.setFloatValues(new float[]{this.f1847g.f1922c, f});
            this.f1839ad.start();
        }
    }

    /* renamed from: d */
    private void m1419d(boolean z) {
        if (this.f1839ad != null && this.f1839ad.isRunning()) {
            this.f1839ad.cancel();
        }
        if (!z || !this.f1848h) {
            this.f1847g.mo1699a(0.0f);
        } else {
            m1412a(0.0f);
        }
        if (m1433r() && ((C0544f) this.f1859s).mo1710a()) {
            m1435t();
        }
        this.f1846f = true;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        if (this.f1859s != null) {
            this.f1859s.draw(canvas);
        }
        super.draw(canvas);
        if (this.f1843c) {
            C0543e eVar = this.f1847g;
            int save = canvas.save();
            if (eVar.f1935p != null && eVar.f1921b) {
                float f2 = eVar.f1931l;
                float f3 = eVar.f1932m;
                if (!eVar.f1936q || eVar.f1937r == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    f = eVar.f1939t * eVar.f1940u;
                } else {
                    eVar.f1943x.ascent();
                    f = 0.0f;
                    eVar.f1943x.descent();
                }
                if (z) {
                    f3 += f;
                }
                float f4 = f3;
                if (eVar.f1940u != 1.0f) {
                    canvas.scale(eVar.f1940u, eVar.f1940u, f2, f4);
                }
                if (z) {
                    canvas.drawBitmap(eVar.f1937r, f2, f4, eVar.f1938s);
                } else {
                    canvas.drawText(eVar.f1935p, 0, eVar.f1935p.length(), f2, f4, eVar.f1943x);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    public final void setCounterEnabled(boolean z) {
        if (this.f1842b != z) {
            if (z) {
                this.f1855o = new AppCompatTextView(getContext());
                this.f1855o.setId(R.id.czd);
                if (this.f1821J != null) {
                    this.f1855o.setTypeface(this.f1821J);
                }
                this.f1855o.setMaxLines(1);
                mo1603a(this.f1855o, this.f1857q);
                this.f1852l.mo1738a(this.f1855o, 2);
                if (this.f1835a == null) {
                    mo1602a(0);
                } else {
                    mo1602a(this.f1835a.getText().length());
                }
            } else {
                this.f1852l.mo1742b(this.f1855o, 2);
                this.f1855o = null;
            }
            this.f1842b = z;
        }
    }

    public final void setErrorEnabled(boolean z) {
        C0558k kVar = this.f1852l;
        if (kVar.f2010g != z) {
            kVar.mo1740b();
            if (z) {
                kVar.f2011h = new AppCompatTextView(kVar.f2004a);
                kVar.f2011h.setId(R.id.cze);
                if (kVar.f2017n != null) {
                    kVar.f2011h.setTypeface(kVar.f2017n);
                }
                kVar.mo1736a(kVar.f2012i);
                kVar.f2011h.setVisibility(4);
                C1056u.m3054e(kVar.f2011h, 1);
                kVar.mo1738a(kVar.f2011h, 0);
            } else {
                kVar.mo1735a();
                kVar.mo1742b(kVar.f2011h, 0);
                kVar.f2011h = null;
                kVar.f2005b.mo1601a();
                kVar.f2005b.mo1606b();
            }
            kVar.f2010g = z;
        }
    }

    public final void setHelperTextEnabled(boolean z) {
        C0558k kVar = this.f1852l;
        if (kVar.f2014k != z) {
            kVar.mo1740b();
            if (z) {
                kVar.f2015l = new AppCompatTextView(kVar.f2004a);
                kVar.f2015l.setId(R.id.czf);
                if (kVar.f2017n != null) {
                    kVar.f2015l.setTypeface(kVar.f2017n);
                }
                kVar.f2015l.setVisibility(4);
                C1056u.m3054e(kVar.f2015l, 1);
                kVar.mo1741b(kVar.f2016m);
                kVar.mo1738a(kVar.f2015l, 1);
            } else {
                kVar.mo1740b();
                if (kVar.f2007d == 2) {
                    kVar.f2008e = 0;
                }
                kVar.mo1737a(kVar.f2007d, kVar.f2008e, kVar.mo1739a(kVar.f2015l, (CharSequence) null));
                kVar.mo1742b(kVar.f2015l, 1);
                kVar.f2015l = null;
                kVar.f2005b.mo1601a();
                kVar.f2005b.mo1606b();
            }
            kVar.f2014k = z;
        }
    }

    public final void setHintEnabled(boolean z) {
        if (z != this.f1843c) {
            this.f1843c = z;
            if (!this.f1843c) {
                this.f1844d = false;
                if (!TextUtils.isEmpty(this.f1858r) && TextUtils.isEmpty(this.f1835a.getHint())) {
                    this.f1835a.setHint(this.f1858r);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1835a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1858r)) {
                        setHint(hint);
                    }
                    this.f1835a.setHint(null);
                }
                this.f1844d = true;
            }
            if (this.f1835a != null) {
                m1420e();
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1835a == null) {
            this.f1835a = editText;
            m1416c();
            setTextInputAccessibilityDelegate(new C0533a(this));
            if (!m1430o()) {
                this.f1847g.mo1702a(this.f1835a.getTypeface());
            }
            C0543e eVar = this.f1847g;
            float textSize = this.f1835a.getTextSize();
            if (eVar.f1927h != textSize) {
                eVar.f1927h = textSize;
                eVar.mo1706d();
            }
            int gravity = this.f1835a.getGravity();
            C0543e eVar2 = this.f1847g;
            int i = (gravity & -113) | 48;
            if (eVar2.f1926g != i) {
                eVar2.f1926g = i;
                eVar2.mo1706d();
            }
            C0543e eVar3 = this.f1847g;
            if (eVar3.f1925f != gravity) {
                eVar3.f1925f = gravity;
                eVar3.mo1706d();
            }
            this.f1835a.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    TextInputLayout.this.mo1604a(!TextInputLayout.this.f1849i);
                    if (TextInputLayout.this.f1842b) {
                        TextInputLayout.this.mo1602a(editable.length());
                    }
                }
            });
            if (this.f1832U == null) {
                this.f1832U = this.f1835a.getHintTextColors();
            }
            if (this.f1843c) {
                if (TextUtils.isEmpty(this.f1858r)) {
                    this.f1851k = this.f1835a.getHint();
                    setHint(this.f1851k);
                    this.f1835a.setHint(null);
                }
                this.f1844d = true;
            }
            if (this.f1855o != null) {
                mo1602a(this.f1835a.getText().length());
            }
            this.f1852l.mo1743c();
            m1429n();
            m1415a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    public final void setHintTextAppearance(int i) {
        C0543e eVar = this.f1847g;
        C1451bb a = C1451bb.m5030a(eVar.f1920a.getContext(), i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j});
        if (a.mo5664f(3)) {
            eVar.f1930k = a.mo5662e(3);
        }
        if (a.mo5664f(0)) {
            eVar.f1928i = (float) a.mo5661e(0, (int) eVar.f1928i);
        }
        eVar.f1902B = a.mo5650a(6, 0);
        eVar.f1945z = a.mo5649a(7, 0.0f);
        eVar.f1901A = a.mo5649a(8, 0.0f);
        eVar.f1944y = a.mo5649a(9, 0.0f);
        a.mo5653a();
        if (VERSION.SDK_INT >= 16) {
            eVar.f1933n = eVar.mo1698a(i);
        }
        eVar.mo1706d();
        this.f1833V = this.f1847g.f1930k;
        if (this.f1835a != null) {
            mo1604a(false);
            m1420e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1602a(int i) {
        boolean z;
        int i2;
        boolean z2 = this.f1854n;
        if (this.f1853m == -1) {
            this.f1855o.setText(String.valueOf(i));
            this.f1855o.setContentDescription(null);
            this.f1854n = false;
        } else {
            if (C1056u.m3059h(this.f1855o) == 1) {
                C1056u.m3054e(this.f1855o, 0);
            }
            if (i > this.f1853m) {
                z = true;
            } else {
                z = false;
            }
            this.f1854n = z;
            if (z2 != this.f1854n) {
                TextView textView = this.f1855o;
                if (this.f1854n) {
                    i2 = this.f1856p;
                } else {
                    i2 = this.f1857q;
                }
                mo1603a(textView, i2);
                if (this.f1854n) {
                    C1056u.m3054e(this.f1855o, 1);
                }
            }
            this.f1855o.setText(getContext().getString(R.string.a0j, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1853m)}));
            this.f1855o.setContentDescription(getContext().getString(R.string.a0i, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1853m)}));
        }
        if (this.f1835a != null && z2 != this.f1854n) {
            mo1604a(false);
            mo1606b();
            mo1601a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m1429n();
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private static void m1414a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m1414a((ViewGroup) childAt, z);
            }
        }
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f1851k == null || this.f1835a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f1844d;
        this.f1844d = false;
        CharSequence hint = this.f1835a.getHint();
        this.f1835a.setHint(this.f1851k);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f1835a.setHint(hint);
            this.f1844d = z;
        }
    }

    /* renamed from: a */
    private void m1415a(boolean z, boolean z2) {
        boolean z3;
        boolean isEnabled = isEnabled();
        boolean z4 = true;
        if (this.f1835a == null || TextUtils.isEmpty(this.f1835a.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f1835a == null || !this.f1835a.hasFocus()) {
            z4 = false;
        }
        boolean d = this.f1852l.mo1744d();
        if (this.f1832U != null) {
            this.f1847g.mo1700a(this.f1832U);
            this.f1847g.mo1704b(this.f1832U);
        }
        if (!isEnabled) {
            this.f1847g.mo1700a(ColorStateList.valueOf(this.f1838ac));
            this.f1847g.mo1704b(ColorStateList.valueOf(this.f1838ac));
        } else if (d) {
            this.f1847g.mo1700a(this.f1852l.mo1746f());
        } else if (this.f1854n && this.f1855o != null) {
            this.f1847g.mo1700a(this.f1855o.getTextColors());
        } else if (z4 && this.f1833V != null) {
            this.f1847g.mo1700a(this.f1833V);
        }
        if (z3 || (isEnabled() && (z4 || d))) {
            if (z2 || this.f1846f) {
                m1417c(z);
            }
        } else if (z2 || !this.f1846f) {
            m1419d(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1603a(TextView textView, int i) {
        boolean z = true;
        try {
            C1115o.m3256a(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1115o.m3256a(textView, (int) R.style.jz);
            textView.setTextColor(C0726c.m2098c(getContext(), R.color.ku));
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f1850j.addView(view, layoutParams2);
            this.f1850j.setLayoutParams(layoutParams);
            m1420e();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1859s != null) {
            m1422g();
        }
        if (this.f1843c && this.f1835a != null) {
            Rect rect = this.f1819H;
            C0545g.m1485a((ViewGroup) this, (View) this.f1835a, rect);
            int compoundPaddingLeft = rect.left + this.f1835a.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f1835a.getCompoundPaddingRight();
            switch (this.f1862v) {
                case 1:
                    i5 = getBoxBackground().getBounds().top + this.f1863w;
                    break;
                case 2:
                    i5 = getBoxBackground().getBounds().top - m1424i();
                    break;
                default:
                    i5 = getPaddingTop();
                    break;
            }
            C0543e eVar = this.f1847g;
            int compoundPaddingTop = rect.top + this.f1835a.getCompoundPaddingTop();
            int compoundPaddingBottom = rect.bottom - this.f1835a.getCompoundPaddingBottom();
            if (!C0543e.m1459a(eVar.f1923d, compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom)) {
                eVar.f1923d.set(compoundPaddingLeft, compoundPaddingTop, compoundPaddingRight, compoundPaddingBottom);
                eVar.f1942w = true;
                eVar.mo1703b();
            }
            C0543e eVar2 = this.f1847g;
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            if (!C0543e.m1459a(eVar2.f1924e, compoundPaddingLeft, i5, compoundPaddingRight, paddingBottom)) {
                eVar2.f1924e.set(compoundPaddingLeft, i5, compoundPaddingRight, paddingBottom);
                eVar2.f1942w = true;
                eVar2.mo1703b();
            }
            this.f1847g.mo1706d();
            if (m1433r() && !this.f1846f) {
                m1434s();
            }
        }
    }
}

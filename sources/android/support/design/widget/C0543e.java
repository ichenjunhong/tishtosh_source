package android.support.design.widget;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.design.p022a.C0389a;
import android.support.p030v4.p037e.C0768d;
import android.support.p030v4.p037e.C0769e;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;

/* renamed from: android.support.design.widget.e */
public final class C0543e {

    /* renamed from: C */
    private static final boolean f1899C;

    /* renamed from: D */
    private static final Paint f1900D = null;

    /* renamed from: A */
    float f1901A;

    /* renamed from: B */
    int f1902B;

    /* renamed from: E */
    private final RectF f1903E;

    /* renamed from: F */
    private float f1904F;

    /* renamed from: G */
    private float f1905G;

    /* renamed from: H */
    private float f1906H;

    /* renamed from: I */
    private float f1907I;

    /* renamed from: J */
    private Typeface f1908J;

    /* renamed from: K */
    private Typeface f1909K;

    /* renamed from: L */
    private boolean f1910L;

    /* renamed from: M */
    private float f1911M;

    /* renamed from: N */
    private float f1912N;

    /* renamed from: O */
    private final TextPaint f1913O;

    /* renamed from: P */
    private TimeInterpolator f1914P;

    /* renamed from: Q */
    private TimeInterpolator f1915Q;

    /* renamed from: R */
    private float f1916R;

    /* renamed from: S */
    private float f1917S;

    /* renamed from: T */
    private float f1918T;

    /* renamed from: U */
    private int f1919U;

    /* renamed from: a */
    final View f1920a;

    /* renamed from: b */
    boolean f1921b;

    /* renamed from: c */
    public float f1922c;

    /* renamed from: d */
    final Rect f1923d;

    /* renamed from: e */
    final Rect f1924e;

    /* renamed from: f */
    public int f1925f;

    /* renamed from: g */
    public int f1926g;

    /* renamed from: h */
    public float f1927h;

    /* renamed from: i */
    public float f1928i;

    /* renamed from: j */
    public ColorStateList f1929j;

    /* renamed from: k */
    public ColorStateList f1930k;

    /* renamed from: l */
    float f1931l;

    /* renamed from: m */
    float f1932m;

    /* renamed from: n */
    Typeface f1933n;

    /* renamed from: o */
    public CharSequence f1934o;

    /* renamed from: p */
    CharSequence f1935p;

    /* renamed from: q */
    boolean f1936q;

    /* renamed from: r */
    Bitmap f1937r;

    /* renamed from: s */
    Paint f1938s;

    /* renamed from: t */
    float f1939t;

    /* renamed from: u */
    float f1940u;

    /* renamed from: v */
    int[] f1941v;

    /* renamed from: w */
    boolean f1942w;

    /* renamed from: x */
    final TextPaint f1943x;

    /* renamed from: y */
    float f1944y;

    /* renamed from: z */
    float f1945z;

    /* renamed from: a */
    public final void mo1700a(ColorStateList colorStateList) {
        if (this.f1930k != colorStateList) {
            this.f1930k = colorStateList;
            mo1706d();
        }
    }

    /* renamed from: a */
    public final void mo1701a(RectF rectF) {
        float f;
        boolean a = m1460a(this.f1934o);
        if (!a) {
            f = (float) this.f1924e.left;
        } else {
            f = ((float) this.f1924e.right) - m1465f();
        }
        rectF.left = f;
        rectF.top = (float) this.f1924e.top;
        rectF.right = !a ? rectF.left + m1465f() : (float) this.f1924e.right;
        rectF.bottom = ((float) this.f1924e.top) + mo1697a();
    }

    /* renamed from: a */
    public final void mo1699a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f1922c) {
            this.f1922c = f;
            m1466g();
        }
    }

    /* renamed from: g */
    private void m1466g() {
        m1461b(this.f1922c);
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 18) {
            z = true;
        } else {
            z = false;
        }
        f1899C = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1707e() {
        if (this.f1937r != null) {
            this.f1937r.recycle();
            this.f1937r = null;
        }
    }

    /* renamed from: f */
    private float m1465f() {
        if (this.f1934o == null) {
            return 0.0f;
        }
        m1457a(this.f1913O);
        return this.f1913O.measureText(this.f1934o, 0, this.f1934o.length());
    }

    /* renamed from: h */
    private int m1467h() {
        if (this.f1941v != null) {
            return this.f1929j.getColorForState(this.f1941v, 0);
        }
        return this.f1929j.getDefaultColor();
    }

    /* renamed from: c */
    public final int mo1705c() {
        if (this.f1941v != null) {
            return this.f1930k.getColorForState(this.f1941v, 0);
        }
        return this.f1930k.getDefaultColor();
    }

    /* renamed from: d */
    public final void mo1706d() {
        if (this.f1920a.getHeight() > 0 && this.f1920a.getWidth() > 0) {
            m1468i();
            m1466g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1703b() {
        boolean z;
        if (this.f1924e.width() <= 0 || this.f1924e.height() <= 0 || this.f1923d.width() <= 0 || this.f1923d.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f1921b = z;
    }

    /* renamed from: j */
    private void m1469j() {
        if (this.f1937r == null && !this.f1923d.isEmpty() && !TextUtils.isEmpty(this.f1935p)) {
            m1461b(0.0f);
            this.f1939t = this.f1943x.ascent();
            this.f1911M = this.f1943x.descent();
            int round = Math.round(this.f1943x.measureText(this.f1935p, 0, this.f1935p.length()));
            int round2 = Math.round(this.f1911M - this.f1939t);
            if (round > 0 && round2 > 0) {
                this.f1937r = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
                new Canvas(this.f1937r).drawText(this.f1935p, 0, this.f1935p.length(), 0.0f, ((float) round2) - this.f1943x.descent(), this.f1943x);
                if (this.f1938s == null) {
                    this.f1938s = new Paint(3);
                }
            }
        }
    }

    /* renamed from: i */
    private void m1468i() {
        float f;
        float f2 = this.f1912N;
        m1464e(this.f1928i);
        float f3 = 0.0f;
        if (this.f1935p != null) {
            f = this.f1943x.measureText(this.f1935p, 0, this.f1935p.length());
        } else {
            f = 0.0f;
        }
        int a = C1039e.m2968a(this.f1926g, this.f1910L ? 1 : 0);
        int i = a & 112;
        if (i == 48) {
            this.f1905G = ((float) this.f1924e.top) - this.f1943x.ascent();
        } else if (i != 80) {
            this.f1905G = ((float) this.f1924e.centerY()) + (((this.f1943x.descent() - this.f1943x.ascent()) / 2.0f) - this.f1943x.descent());
        } else {
            this.f1905G = (float) this.f1924e.bottom;
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f1907I = ((float) this.f1924e.centerX()) - (f / 2.0f);
        } else if (i2 != 5) {
            this.f1907I = (float) this.f1924e.left;
        } else {
            this.f1907I = ((float) this.f1924e.right) - f;
        }
        m1464e(this.f1927h);
        if (this.f1935p != null) {
            f3 = this.f1943x.measureText(this.f1935p, 0, this.f1935p.length());
        }
        int a2 = C1039e.m2968a(this.f1925f, this.f1910L ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f1904F = ((float) this.f1923d.top) - this.f1943x.ascent();
        } else if (i3 != 80) {
            this.f1904F = ((float) this.f1923d.centerY()) + (((this.f1943x.descent() - this.f1943x.ascent()) / 2.0f) - this.f1943x.descent());
        } else {
            this.f1904F = (float) this.f1923d.bottom;
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f1906H = ((float) this.f1923d.centerX()) - (f3 / 2.0f);
        } else if (i4 != 5) {
            this.f1906H = (float) this.f1923d.left;
        } else {
            this.f1906H = ((float) this.f1923d.right) - f3;
        }
        mo1707e();
        m1463d(f2);
    }

    /* renamed from: a */
    public final float mo1697a() {
        m1457a(this.f1913O);
        return -this.f1913O.ascent();
    }

    /* renamed from: a */
    public final void mo1702a(Typeface typeface) {
        this.f1908J = typeface;
        this.f1933n = typeface;
        mo1706d();
    }

    /* renamed from: b */
    public final void mo1704b(ColorStateList colorStateList) {
        if (this.f1929j != colorStateList) {
            this.f1929j = colorStateList;
            mo1706d();
        }
    }

    /* renamed from: a */
    private void m1457a(TextPaint textPaint) {
        textPaint.setTextSize(this.f1928i);
        textPaint.setTypeface(this.f1933n);
    }

    /* renamed from: d */
    private void m1463d(float f) {
        boolean z;
        m1464e(f);
        if (!f1899C || this.f1940u == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.f1936q = z;
        if (this.f1936q) {
            m1469j();
        }
        C1056u.m3052d(this.f1920a);
    }

    /* renamed from: b */
    private void m1461b(float f) {
        m1462c(f);
        this.f1931l = m1455a(this.f1906H, this.f1907I, f, this.f1914P);
        this.f1932m = m1455a(this.f1904F, this.f1905G, f, this.f1914P);
        m1463d(m1455a(this.f1927h, this.f1928i, f, this.f1915Q));
        if (this.f1930k != this.f1929j) {
            this.f1943x.setColor(m1456a(m1467h(), mo1705c(), f));
        } else {
            this.f1943x.setColor(mo1705c());
        }
        this.f1943x.setShadowLayer(m1455a(this.f1916R, this.f1944y, f, null), m1455a(this.f1917S, this.f1945z, f, null), m1455a(this.f1918T, this.f1901A, f, null), m1456a(this.f1919U, this.f1902B, f));
        C1056u.m3052d(this.f1920a);
    }

    /* renamed from: c */
    private void m1462c(float f) {
        this.f1903E.left = m1455a((float) this.f1923d.left, (float) this.f1924e.left, f, this.f1914P);
        this.f1903E.top = m1455a(this.f1904F, this.f1905G, f, this.f1914P);
        this.f1903E.right = m1455a((float) this.f1923d.right, (float) this.f1924e.right, f, this.f1914P);
        this.f1903E.bottom = m1455a((float) this.f1923d.bottom, (float) this.f1924e.bottom, f, this.f1914P);
    }

    /* renamed from: e */
    private void m1464e(float f) {
        boolean z;
        float f2;
        boolean z2;
        boolean z3;
        if (this.f1934o != null) {
            float width = (float) this.f1924e.width();
            float width2 = (float) this.f1923d.width();
            boolean z4 = true;
            if (m1458a(f, this.f1928i)) {
                float f3 = this.f1928i;
                this.f1940u = 1.0f;
                if (this.f1909K != this.f1933n) {
                    this.f1909K = this.f1933n;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f2 = f3;
                z = z3;
            } else {
                f2 = this.f1927h;
                if (this.f1909K != this.f1908J) {
                    this.f1909K = this.f1908J;
                    z = true;
                } else {
                    z = false;
                }
                if (m1458a(f, this.f1927h)) {
                    this.f1940u = 1.0f;
                } else {
                    this.f1940u = f / this.f1927h;
                }
                float f4 = this.f1928i / this.f1927h;
                if (width2 * f4 > width) {
                    width = Math.min(width / f4, width2);
                } else {
                    width = width2;
                }
            }
            if (width > 0.0f) {
                if (this.f1912N != f2 || this.f1942w || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f1912N = f2;
                this.f1942w = false;
            }
            if (this.f1935p == null || z) {
                this.f1943x.setTextSize(this.f1912N);
                this.f1943x.setTypeface(this.f1909K);
                TextPaint textPaint = this.f1943x;
                if (this.f1940u == 1.0f) {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.f1934o, this.f1943x, width, TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f1935p)) {
                    this.f1935p = ellipsize;
                    this.f1910L = m1460a(this.f1935p);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m1460a(CharSequence charSequence) {
        C0768d dVar;
        boolean z = true;
        if (C1056u.m3055f(this.f1920a) != 1) {
            z = false;
        }
        if (z) {
            dVar = C0769e.f2655d;
        } else {
            dVar = C0769e.f2654c;
        }
        return dVar.mo2446a(charSequence, 0, charSequence.length());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Typeface mo1698a(int i) {
        TypedArray obtainStyledAttributes = this.f1920a.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private static boolean m1458a(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m1456a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m1455a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C0389a.m963a(f, f2, f3);
    }

    /* renamed from: a */
    static boolean m1459a(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }
}

package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.design.p022a.C0389a;
import android.support.design.p022a.C0390b;
import android.support.design.p022a.C0394f;
import android.support.design.p022a.C0395g;
import android.support.design.p022a.C0396h;
import android.support.design.p027e.C0424a;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1056u;
import android.util.StateSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.i */
public class C0547i {

    /* renamed from: a */
    static final TimeInterpolator f1953a = C0389a.f1269c;

    /* renamed from: u */
    static final int[] f1954u = {16842919, 16842910};

    /* renamed from: v */
    static final int[] f1955v = {16843623, 16842908, 16842910};

    /* renamed from: w */
    static final int[] f1956w = {16842908, 16842910};

    /* renamed from: x */
    static final int[] f1957x = {16843623, 16842910};

    /* renamed from: y */
    static final int[] f1958y = {16842910};

    /* renamed from: z */
    static final int[] f1959z = new int[0];

    /* renamed from: A */
    final C0574u f1960A;

    /* renamed from: B */
    final C0562n f1961B;

    /* renamed from: C */
    OnPreDrawListener f1962C;

    /* renamed from: D */
    private final C0567p f1963D;

    /* renamed from: E */
    private final Rect f1964E = new Rect();

    /* renamed from: F */
    private final RectF f1965F = new RectF();

    /* renamed from: G */
    private final RectF f1966G = new RectF();

    /* renamed from: H */
    private final Matrix f1967H = new Matrix();

    /* renamed from: b */
    int f1968b;

    /* renamed from: c */
    Animator f1969c;

    /* renamed from: d */
    public C0396h f1970d;

    /* renamed from: e */
    public C0396h f1971e;

    /* renamed from: f */
    C0396h f1972f;

    /* renamed from: g */
    C0396h f1973g;

    /* renamed from: h */
    C0561m f1974h;

    /* renamed from: i */
    float f1975i;

    /* renamed from: j */
    Drawable f1976j;

    /* renamed from: k */
    Drawable f1977k;

    /* renamed from: l */
    C0541d f1978l;

    /* renamed from: m */
    public Drawable f1979m;

    /* renamed from: n */
    float f1980n;

    /* renamed from: o */
    public float f1981o;

    /* renamed from: p */
    public float f1982p;

    /* renamed from: q */
    int f1983q;

    /* renamed from: r */
    float f1984r = 1.0f;

    /* renamed from: s */
    public ArrayList<AnimatorListener> f1985s;

    /* renamed from: t */
    public ArrayList<AnimatorListener> f1986t;

    /* renamed from: android.support.design.widget.i$a */
    class C0551a extends C0556f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1732a() {
            return 0.0f;
        }

        C0551a() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.i$b */
    class C0552b extends C0556f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1732a() {
            return C0547i.this.f1980n + C0547i.this.f1981o;
        }

        C0552b() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.i$c */
    class C0553c extends C0556f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1732a() {
            return C0547i.this.f1980n + C0547i.this.f1982p;
        }

        C0553c() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.i$d */
    interface C0554d {
    }

    /* renamed from: android.support.design.widget.i$e */
    class C0555e extends C0556f {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final float mo1732a() {
            return C0547i.this.f1980n;
        }

        C0555e() {
            super();
        }
    }

    /* renamed from: android.support.design.widget.i$f */
    abstract class C0556f extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f1999a;

        /* renamed from: c */
        private float f2001c;

        /* renamed from: d */
        private float f2002d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo1732a();

        private C0556f() {
        }

        public void onAnimationEnd(Animator animator) {
            C0547i.this.f1974h.mo1749a(this.f2002d);
            this.f1999a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f1999a) {
                this.f2001c = C0547i.this.f1974h.f2037j;
                this.f2002d = mo1732a();
                this.f1999a = true;
            }
            C0547i.this.f1974h.mo1749a(this.f2001c + ((this.f2002d - this.f2001c) * valueAnimator.getAnimatedFraction()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo1712a() {
        return this.f1980n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1720b(Rect rect) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1721c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo1723e() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1719b() {
        C0567p pVar = this.f1963D;
        if (pVar.f2056c != null) {
            pVar.f2056c.end();
            pVar.f2056c = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1722d() {
        Rect rect = this.f1964E;
        mo1717a(rect);
        mo1720b(rect);
        this.f1961B.mo1450a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo1724f() {
        if (this.f1960A.getVisibility() != 0) {
            if (this.f1968b == 2) {
                return true;
            }
            return false;
        } else if (this.f1968b != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo1725g() {
        if (!C1056u.m3079y(this.f1960A) || this.f1960A.isInEditMode()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1717a(Rect rect) {
        this.f1974h.getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1714a(float f) {
        this.f1984r = f;
        Matrix matrix = this.f1967H;
        m1490a(f, matrix);
        this.f1960A.setImageMatrix(matrix);
    }

    /* renamed from: a */
    private static ValueAnimator m1489a(C0556f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1953a);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1716a(ColorStateList colorStateList) {
        if (this.f1977k != null) {
            C0809a.m2327a(this.f1977k, C0424a.m1036a(colorStateList));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1718a(int[] iArr) {
        C0569a aVar;
        C0567p pVar = this.f1963D;
        int size = pVar.f2054a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C0569a) pVar.f2054a.get(i);
            if (StateSet.stateSetMatches(aVar.f2059a, iArr)) {
                break;
            }
            i++;
        }
        if (aVar != pVar.f2055b) {
            if (!(pVar.f2055b == null || pVar.f2056c == null)) {
                pVar.f2056c.cancel();
                pVar.f2056c = null;
            }
            pVar.f2055b = aVar;
            if (aVar != null) {
                pVar.f2056c = aVar.f2060b;
                pVar.f2056c.start();
            }
        }
    }

    /* renamed from: a */
    private void m1490a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f1960A.getDrawable();
        if (drawable != null && this.f1983q != 0) {
            RectF rectF = this.f1965F;
            RectF rectF2 = this.f1966G;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            rectF2.set(0.0f, 0.0f, (float) this.f1983q, (float) this.f1983q);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            matrix.postScale(f, f, ((float) this.f1983q) / 2.0f, ((float) this.f1983q) / 2.0f);
        }
    }

    C0547i(C0574u uVar, C0562n nVar) {
        this.f1960A = uVar;
        this.f1961B = nVar;
        this.f1963D = new C0567p();
        this.f1963D.mo1769a(f1954u, m1489a((C0556f) new C0553c()));
        this.f1963D.mo1769a(f1955v, m1489a((C0556f) new C0552b()));
        this.f1963D.mo1769a(f1956w, m1489a((C0556f) new C0552b()));
        this.f1963D.mo1769a(f1957x, m1489a((C0556f) new C0552b()));
        this.f1963D.mo1769a(f1958y, m1489a((C0556f) new C0555e()));
        this.f1963D.mo1769a(f1959z, m1489a((C0556f) new C0551a()));
        this.f1975i = this.f1960A.getRotation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1715a(float f, float f2, float f3) {
        if (this.f1974h != null) {
            this.f1974h.mo1750a(f, this.f1982p + f);
            mo1722d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public AnimatorSet mo1713a(C0396h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1960A, View.ALPHA, new float[]{f});
        hVar.mo889a("opacity").mo894a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f1960A, View.SCALE_X, new float[]{f2});
        hVar.mo889a("scale").mo894a((Animator) ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f1960A, View.SCALE_Y, new float[]{f2});
        hVar.mo889a("scale").mo894a((Animator) ofFloat3);
        arrayList.add(ofFloat3);
        m1490a(f3, this.f1967H);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f1960A, new C0394f(), new C0395g(), new Matrix[]{new Matrix(this.f1967H)});
        hVar.mo889a("iconScale").mo894a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C0390b.m965a(animatorSet, arrayList);
        return animatorSet;
    }
}

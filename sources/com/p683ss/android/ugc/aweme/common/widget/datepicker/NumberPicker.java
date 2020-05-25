package com.p683ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p030v4.view.C1044i;
import android.support.p030v4.view.C1060v;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker */
public class NumberPicker extends View {

    /* renamed from: P */
    private static final int f71061P = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: Q */
    private static final int f71062Q = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: R */
    private static final int f71063R = Color.rgb(NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255);

    /* renamed from: A */
    protected int f71064A;

    /* renamed from: B */
    protected Scroller f71065B;

    /* renamed from: C */
    protected Scroller f71066C;

    /* renamed from: D */
    protected int f71067D;

    /* renamed from: E */
    protected int f71068E;

    /* renamed from: F */
    protected int f71069F;

    /* renamed from: G */
    protected int f71070G;

    /* renamed from: H */
    protected int f71071H;

    /* renamed from: I */
    protected boolean f71072I;

    /* renamed from: J */
    protected C26969b f71073J;

    /* renamed from: K */
    protected Set<String> f71074K;

    /* renamed from: L */
    protected int f71075L;

    /* renamed from: M */
    protected C26970a f71076M;

    /* renamed from: N */
    protected boolean f71077N;

    /* renamed from: O */
    protected String[] f71078O;

    /* renamed from: S */
    private int f71079S;

    /* renamed from: T */
    private int f71080T;

    /* renamed from: U */
    private int f71081U;

    /* renamed from: V */
    private int f71082V;

    /* renamed from: W */
    private VelocityTracker f71083W;

    /* renamed from: a */
    protected int f71084a;

    /* renamed from: aa */
    private float f71085aa;

    /* renamed from: b */
    protected int f71086b;

    /* renamed from: c */
    protected TextPaint f71087c;

    /* renamed from: d */
    protected TextPaint f71088d;

    /* renamed from: e */
    protected TextPaint f71089e;

    /* renamed from: f */
    protected Paint f71090f;

    /* renamed from: g */
    protected Rect f71091g;

    /* renamed from: h */
    protected C26968a[] f71092h;

    /* renamed from: i */
    protected int f71093i;

    /* renamed from: j */
    protected int f71094j;

    /* renamed from: k */
    protected int f71095k;

    /* renamed from: l */
    protected int f71096l;

    /* renamed from: m */
    protected float f71097m;

    /* renamed from: n */
    protected int f71098n;

    /* renamed from: o */
    protected int f71099o;

    /* renamed from: p */
    protected int f71100p;

    /* renamed from: q */
    protected float f71101q;

    /* renamed from: r */
    protected float f71102r;

    /* renamed from: s */
    protected int f71103s;

    /* renamed from: t */
    protected String f71104t;

    /* renamed from: u */
    protected int f71105u;

    /* renamed from: v */
    protected float f71106v;

    /* renamed from: w */
    protected int[] f71107w;

    /* renamed from: x */
    protected int f71108x;

    /* renamed from: y */
    protected RectF f71109y;

    /* renamed from: z */
    protected Rect f71110z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker$a */
    class C26968a {

        /* renamed from: a */
        public int f71111a;

        /* renamed from: b */
        public int f71112b;

        C26968a(int i, int i2) {
            this.f71111a = i;
            this.f71112b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker$b */
    public interface C26969b {
        /* renamed from: a */
        void mo55075a(NumberPicker numberPicker, int i, int i2);
    }

    public int getCurrentNumber() {
        return this.f71100p;
    }

    /* renamed from: c */
    private void m65137c() {
        int length = String.valueOf(this.f71099o).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        this.f71087c.getTextBounds(sb2, 0, sb2.length(), this.f71091g);
        if (this.f71104t != null) {
            this.f71088d.getTextBounds(this.f71104t, 0, this.f71104t.length(), this.f71110z);
        }
    }

    /* renamed from: d */
    private void m65138d() {
        if (this.f71066C.isFinished()) {
            this.f71068E = 0;
            int round = (this.f71093i + (Math.round(((float) (this.f71092h[0].f71112b - this.f71093i)) / ((float) this.f71071H)) * this.f71071H)) - this.f71092h[0].f71112b;
            if (round != 0) {
                this.f71066C.startScroll(0, 0, 0, round, 300);
            }
        }
    }

    /* renamed from: e */
    private void m65139e() {
        for (int i = 0; i < this.f71092h.length; i++) {
            C26968a aVar = new C26968a((this.f71108x - 3) + i, this.f71093i + (this.f71071H * i));
            if (aVar.f71111a > this.f71107w.length - 1) {
                aVar.f71111a -= this.f71107w.length;
            } else if (aVar.f71111a < 0) {
                aVar.f71111a += this.f71107w.length;
            }
            this.f71092h[i] = aVar;
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f71065B;
        if (scroller.isFinished()) {
            m65141h(0);
            scroller = this.f71066C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        this.f71069F = scroller.getCurrY();
        this.f71070G = this.f71069F - this.f71068E;
        m65140g(this.f71070G);
        invalidate();
        this.f71068E = this.f71069F;
    }

    /* renamed from: a */
    private void m65135a() {
        if (this.f71098n < 0 || this.f71099o < 0) {
            throw new IllegalArgumentException("number can not be negative");
        }
        if (this.f71098n > this.f71099o) {
            this.f71099o = this.f71098n;
        }
        if (this.f71100p < this.f71098n) {
            this.f71100p = this.f71098n;
        }
        if (this.f71100p > this.f71099o) {
            this.f71100p = this.f71099o;
        }
        if (this.f71078O != null) {
            this.f71107w = new int[this.f71078O.length];
        } else {
            this.f71107w = new int[((this.f71099o - this.f71098n) + 1)];
        }
        for (int i = 0; i < this.f71107w.length; i++) {
            this.f71107w[i] = this.f71098n + i;
        }
        this.f71108x = this.f71100p - this.f71098n;
    }

    /* renamed from: b */
    private void m65136b() {
        this.f71087c = new TextPaint();
        this.f71087c.setTextSize(this.f71097m);
        this.f71087c.setColor(this.f71095k);
        this.f71087c.setFlags(1);
        this.f71087c.setTextAlign(Align.CENTER);
        this.f71089e = new TextPaint(this.f71087c);
        this.f71089e.setColor(Color.argb((int) (((float) Color.alpha(this.f71095k)) * 0.3f), Color.red(this.f71095k), Color.green(this.f71095k), Color.blue(this.f71095k)));
        this.f71088d = new TextPaint();
        this.f71088d.setTextSize(this.f71106v);
        this.f71088d.setColor(this.f71105u);
        this.f71088d.setFlags(1);
        this.f71088d.setTextAlign(Align.LEFT);
        this.f71090f = new Paint();
        this.f71090f.setColor(this.f71096l);
        this.f71090f.setStyle(Style.STROKE);
        this.f71090f.setStrokeWidth(this.f71101q);
    }

    /* renamed from: a */
    public final NumberPicker mo55084a(C26969b bVar) {
        this.f71073J = bVar;
        return this;
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    private void m65141h(int i) {
        if (this.f71080T != i) {
            this.f71080T = i;
        }
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f71077N = z;
    }

    /* renamed from: a */
    public final NumberPicker mo55083a(int i) {
        this.f71098n = i;
        m65135a();
        m65139e();
        invalidate();
        return this;
    }

    /* renamed from: b */
    public final NumberPicker mo55086b(int i) {
        this.f71099o = i;
        m65135a();
        m65139e();
        invalidate();
        return this;
    }

    /* renamed from: c */
    public final NumberPicker mo55087c(int i) {
        this.f71100p = i;
        m65135a();
        m65139e();
        invalidate();
        return this;
    }

    /* renamed from: d */
    public final NumberPicker mo55089d(int i) {
        this.f71095k = i;
        m65136b();
        invalidate();
        return this;
    }

    /* renamed from: e */
    public final NumberPicker mo55090e(int i) {
        this.f71105u = i;
        m65136b();
        invalidate();
        return this;
    }

    /* renamed from: f */
    public final NumberPicker mo55091f(int i) {
        this.f71096l = i;
        m65136b();
        invalidate();
        return this;
    }

    /* renamed from: a */
    public final NumberPicker mo55085a(String[] strArr) {
        this.f71078O = strArr;
        m65135a();
        invalidate();
        return this;
    }

    /* renamed from: g */
    private void m65140g(int i) {
        for (int i2 = 0; i2 < this.f71092h.length; i2++) {
            C26968a aVar = this.f71092h[i2];
            aVar.f71112b += i;
            if (this.f71092h[i2].f71112b >= this.f71094j + this.f71071H) {
                C26968a aVar2 = this.f71092h[i2];
                aVar2.f71112b -= (this.f71075L + 2) * this.f71071H;
                C26968a aVar3 = this.f71092h[i2];
                aVar3.f71111a -= this.f71075L + 2;
                while (this.f71092h[i2].f71111a < 0) {
                    C26968a aVar4 = this.f71092h[i2];
                    aVar4.f71111a += this.f71107w.length;
                }
            }
            if (this.f71092h[i2].f71112b <= this.f71093i - this.f71071H) {
                C26968a aVar5 = this.f71092h[i2];
                aVar5.f71112b += (this.f71075L + 2) * this.f71071H;
                C26968a aVar6 = this.f71092h[i2];
                aVar6.f71111a += this.f71075L + 2;
                while (this.f71092h[i2].f71111a > this.f71107w.length - 1) {
                    C26968a aVar7 = this.f71092h[i2];
                    aVar7.f71111a -= this.f71107w.length;
                }
            }
            if (Math.abs(this.f71092h[i2].f71112b - (this.f71086b / 2)) < this.f71071H / 4) {
                this.f71108x = Math.min(this.f71092h[i2].f71111a, this.f71107w.length - 1);
                int i3 = this.f71100p;
                if (this.f71108x >= 0) {
                    this.f71100p = this.f71107w[this.f71108x];
                }
                if (i3 != this.f71100p) {
                    if (this.f71073J != null) {
                        this.f71073J.mo55075a(this, i3, this.f71100p);
                    }
                    if (this.f71076M != null && this.f71077N) {
                        this.f71076M.mo55097a();
                    }
                }
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f71083W == null) {
            this.f71083W = VelocityTracker.obtain();
        }
        this.f71083W.addMovement(motionEvent);
        int a = C1044i.m2981a(motionEvent);
        this.f71064A = a;
        if (a == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f71068E = (int) motionEvent.getY();
            if (!this.f71065B.isFinished() || !this.f71066C.isFinished()) {
                this.f71065B.forceFinished(true);
                this.f71066C.forceFinished(true);
                m65141h(0);
            }
        } else if (2 == a) {
            this.f71069F = (int) motionEvent.getY();
            this.f71070G = this.f71069F - this.f71068E;
            if (!this.f71072I && Math.abs(this.f71070G) < this.f71079S) {
                return false;
            }
            this.f71072I = true;
            if (this.f71070G > this.f71079S) {
                this.f71070G -= this.f71079S;
            } else if (this.f71070G < (-this.f71079S)) {
                this.f71070G += this.f71079S;
            }
            this.f71068E = this.f71069F;
            m65140g(this.f71070G);
            m65141h(1);
            invalidate();
        } else if (1 == a) {
            this.f71072I = false;
            VelocityTracker velocityTracker = this.f71083W;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f71082V);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f71081U) {
                if (yVelocity > 0) {
                    int i = (int) (this.f71097m * 10.0f);
                    this.f71068E = 0;
                    this.f71065B.fling(0, 0, 0, yVelocity, 0, 0, 0, i);
                } else if (yVelocity < 0) {
                    int i2 = (int) (this.f71097m * 10.0f);
                    this.f71068E = i2;
                    this.f71065B.fling(0, i2, 0, yVelocity, 0, 0, 0, i2);
                }
                invalidate();
                m65141h(2);
            } else {
                m65138d();
                invalidate();
            }
            this.f71083W.recycle();
            this.f71083W = null;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        TextPaint textPaint;
        canvas.drawColor(this.f71067D);
        if (this.f71102r == 0.0f) {
            this.f71102r = (float) this.f71084a;
        }
        if (this.f71102r > ((float) this.f71084a)) {
            f = (float) this.f71084a;
        } else {
            f = this.f71102r;
        }
        float f2 = f / 2.0f;
        float f3 = ((float) (this.f71084a / 2)) - f2;
        float f4 = f2 + ((float) (this.f71084a / 2));
        canvas.drawLine(f3, this.f71109y.top, f4, this.f71109y.top, this.f71090f);
        canvas.drawLine(f3, this.f71109y.bottom, f4, this.f71109y.bottom, this.f71090f);
        if (this.f71104t != null) {
            canvas.drawText(this.f71104t, (float) ((int) (((float) ((this.f71084a + this.f71091g.width()) / 2)) + (this.f71085aa * 4.0f))), (float) (((this.f71086b / 2) + (this.f71091g.height() / 2)) - 4), this.f71088d);
        }
        for (int i = 0; i < this.f71092h.length; i++) {
            if (this.f71092h[i].f71111a >= 0 && this.f71092h[i].f71111a <= this.f71099o - this.f71098n) {
                String str = "";
                if (this.f71092h[i].f71111a >= 0 && this.f71092h[i].f71111a < this.f71107w.length) {
                    str = this.f71078O != null ? this.f71078O[this.f71092h[i].f71111a] : String.valueOf(this.f71107w[this.f71092h[i].f71111a]);
                }
                float f5 = (float) (this.f71084a / 2);
                float height = (float) (this.f71092h[i].f71112b + (this.f71091g.height() / 2));
                if (this.f71092h[i].f71111a == this.f71108x) {
                    textPaint = this.f71087c;
                } else {
                    textPaint = this.f71089e;
                }
                canvas.drawText(str, f5, height, textPaint);
                this.f71074K.add(str);
            }
        }
        this.f71074K.clear();
        if (1 == this.f71064A && this.f71065B.isFinished()) {
            m65138d();
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f71084a = size;
        } else {
            this.f71084a = this.f71091g.width() + getPaddingLeft() + getPaddingRight() + this.f71110z.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f71086b = size2;
        } else {
            this.f71086b = (this.f71075L * this.f71091g.height()) + ((this.f71075L - 1) * this.f71103s) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f71084a, this.f71086b);
        if (this.f71109y == null) {
            this.f71109y = new RectF();
            this.f71109y.left = 0.0f;
            this.f71109y.right = (float) this.f71084a;
            this.f71109y.top = (float) (((this.f71086b - this.f71091g.height()) - this.f71103s) / 2);
            this.f71109y.bottom = (float) (((this.f71086b + this.f71091g.height()) + this.f71103s) / 2);
            this.f71071H = this.f71103s + this.f71091g.height();
            this.f71093i = (this.f71086b / 2) - (this.f71071H * 3);
            this.f71094j = (this.f71086b / 2) + (this.f71071H * 3);
            m65139e();
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71064A = 3;
        this.f71074K = new HashSet();
        this.f71077N = true;
        this.f71085aa = getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bu, R.attr.j3, R.attr.j9, R.attr.j_, R.attr.ju, R.attr.jw, R.attr.jy, R.attr.kl, R.attr.lv, R.attr.lw, R.attr.lx, R.attr.acn, R.attr.a0n, R.attr.a37, R.attr.a_j}, i, 0);
        this.f71095k = obtainStyledAttributes.getColor(2, f71061P);
        this.f71097m = obtainStyledAttributes.getDimension(3, this.f71085aa * 32.0f);
        this.f71096l = obtainStyledAttributes.getColor(4, f71061P);
        this.f71098n = obtainStyledAttributes.getInteger(13, 0);
        this.f71099o = obtainStyledAttributes.getInteger(7, 0);
        this.f71100p = obtainStyledAttributes.getInteger(1, 0);
        this.f71103s = (int) obtainStyledAttributes.getDimension(14, this.f71085aa * 16.0f);
        this.f71104t = obtainStyledAttributes.getString(8);
        this.f71105u = obtainStyledAttributes.getColor(9, f71062Q);
        this.f71106v = obtainStyledAttributes.getDimension(10, this.f71085aa * 12.0f);
        this.f71067D = obtainStyledAttributes.getColor(0, f71063R);
        this.f71075L = obtainStyledAttributes.getInteger(12, 5);
        this.f71101q = obtainStyledAttributes.getDimension(6, this.f71085aa * 2.0f);
        this.f71102r = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        m65135a();
        m65136b();
        this.f71091g = new Rect();
        this.f71110z = new Rect();
        m65137c();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f71079S = C1060v.m3090a(viewConfiguration);
        this.f71081U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f71082V = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f71065B = new Scroller(getContext(), null);
        this.f71066C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        this.f71092h = new C26968a[(this.f71075L + 4)];
    }
}

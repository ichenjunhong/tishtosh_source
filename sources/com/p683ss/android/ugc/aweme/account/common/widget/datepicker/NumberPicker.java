package com.p683ss.android.ugc.aweme.account.common.widget.datepicker;

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

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker */
public class NumberPicker extends View {

    /* renamed from: Q */
    private static final int f56980Q = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: R */
    private static final int f56981R = Color.rgb(0, NormalGiftView.MASK_TRANSLATE_VALUE, 136);

    /* renamed from: S */
    private static final int f56982S = Color.rgb(NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255, NormalGiftView.ALPHA_255);

    /* renamed from: A */
    protected int f56983A;

    /* renamed from: B */
    protected Scroller f56984B;

    /* renamed from: C */
    protected Scroller f56985C;

    /* renamed from: D */
    protected int f56986D;

    /* renamed from: E */
    protected int f56987E;

    /* renamed from: F */
    protected int f56988F;

    /* renamed from: G */
    protected int f56989G;

    /* renamed from: H */
    protected int f56990H;

    /* renamed from: I */
    protected boolean f56991I;

    /* renamed from: J */
    protected C20943b f56992J;

    /* renamed from: K */
    protected Set<String> f56993K;

    /* renamed from: L */
    protected int f56994L;

    /* renamed from: M */
    protected C20944a f56995M;

    /* renamed from: N */
    protected boolean f56996N;

    /* renamed from: O */
    protected String[] f56997O;

    /* renamed from: P */
    int f56998P;

    /* renamed from: T */
    private int f56999T;

    /* renamed from: U */
    private int f57000U;

    /* renamed from: V */
    private int f57001V;

    /* renamed from: W */
    private int f57002W;

    /* renamed from: a */
    protected int f57003a;

    /* renamed from: aa */
    private VelocityTracker f57004aa;

    /* renamed from: ab */
    private float f57005ab;

    /* renamed from: ac */
    private boolean f57006ac;

    /* renamed from: b */
    protected int f57007b;

    /* renamed from: c */
    protected TextPaint f57008c;

    /* renamed from: d */
    protected TextPaint f57009d;

    /* renamed from: e */
    protected TextPaint f57010e;

    /* renamed from: f */
    protected Paint f57011f;

    /* renamed from: g */
    protected Rect f57012g;

    /* renamed from: h */
    protected C20942a[] f57013h;

    /* renamed from: i */
    protected int f57014i;

    /* renamed from: j */
    protected int f57015j;

    /* renamed from: k */
    protected int f57016k;

    /* renamed from: l */
    protected int f57017l;

    /* renamed from: m */
    protected float f57018m;

    /* renamed from: n */
    protected int f57019n;

    /* renamed from: o */
    protected int f57020o;

    /* renamed from: p */
    protected int f57021p;

    /* renamed from: q */
    protected float f57022q;

    /* renamed from: r */
    protected float f57023r;

    /* renamed from: s */
    protected int f57024s;

    /* renamed from: t */
    protected String f57025t;

    /* renamed from: u */
    protected int f57026u;

    /* renamed from: v */
    protected float f57027v;

    /* renamed from: w */
    protected int[] f57028w;

    /* renamed from: x */
    protected int f57029x;

    /* renamed from: y */
    protected RectF f57030y;

    /* renamed from: z */
    protected Rect f57031z;

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker$a */
    class C20942a {

        /* renamed from: a */
        public int f57032a;

        /* renamed from: b */
        public int f57033b;

        public C20942a(int i, int i2) {
            this.f57032a = i;
            this.f57033b = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker$b */
    public interface C20943b {
        /* renamed from: a */
        void mo44938a(NumberPicker numberPicker, int i, int i2);
    }

    public int getCurrentNumber() {
        return this.f57021p;
    }

    /* renamed from: b */
    private void m53294b() {
        int length = String.valueOf(this.f57020o).length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        String sb2 = sb.toString();
        this.f57008c.getTextBounds(sb2, 0, sb2.length(), this.f57012g);
        if (this.f57025t != null) {
            this.f57009d.getTextBounds(this.f57025t, 0, this.f57025t.length(), this.f57031z);
        }
    }

    /* renamed from: c */
    private void m53295c() {
        if (this.f56985C.isFinished()) {
            this.f56987E = 0;
            int round = (this.f57014i + (Math.round(((float) (this.f57013h[0].f57033b - this.f57014i)) / ((float) this.f56990H)) * this.f56990H)) - this.f57013h[0].f57033b;
            if (round != 0) {
                this.f56985C.startScroll(0, 0, 0, round, 300);
            }
        }
    }

    public void computeScroll() {
        Scroller scroller = this.f56984B;
        if (scroller.isFinished()) {
            m53298e(0);
            scroller = this.f56985C;
            if (scroller.isFinished()) {
                return;
            }
        }
        scroller.computeScrollOffset();
        this.f56988F = scroller.getCurrY();
        this.f56989G = this.f56988F - this.f56987E;
        m53297d(this.f56989G);
        invalidate();
        this.f56987E = this.f56988F;
    }

    /* renamed from: a */
    private void m53293a() {
        if (this.f57019n < 0 || this.f57020o < 0) {
            throw new IllegalArgumentException("number can not be negative");
        }
        if (this.f57019n > this.f57020o) {
            this.f57020o = this.f57019n;
        }
        if (this.f57021p < this.f57019n) {
            this.f57021p = this.f57019n;
        }
        if (this.f57021p > this.f57020o) {
            this.f57021p = this.f57020o;
        }
        if (this.f56997O != null) {
            this.f57028w = new int[this.f56997O.length];
        } else {
            this.f57028w = new int[((this.f57020o - this.f57019n) + 1)];
        }
        for (int i = 0; i < this.f57028w.length; i++) {
            this.f57028w[i] = this.f57019n + i;
        }
        this.f57029x = this.f57021p - this.f57019n;
    }

    /* renamed from: d */
    private void m53296d() {
        int i = 0;
        if (this.f57006ac) {
            this.f56998P = this.f57013h.length / 2;
            while (i < this.f57013h.length) {
                this.f57013h[i] = new C20942a((this.f57029x - 3) + i, this.f57014i + (this.f56990H * i));
                i++;
            }
            return;
        }
        while (i < this.f57013h.length) {
            C20942a aVar = new C20942a((this.f57029x - 3) + i, this.f57014i + (this.f56990H * i));
            if (aVar.f57032a > this.f57028w.length - 1) {
                aVar.f57032a -= this.f57028w.length;
            } else if (aVar.f57032a < 0) {
                aVar.f57032a += this.f57028w.length;
            }
            this.f57013h[i] = aVar;
            i++;
        }
    }

    /* renamed from: a */
    public final NumberPicker mo44947a(C20943b bVar) {
        this.f56992J = bVar;
        return this;
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m53298e(int i) {
        if (this.f57000U != i) {
            this.f57000U = i;
        }
    }

    public void setNonRecurrent(boolean z) {
        this.f57006ac = z;
        m53296d();
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f56996N = z;
    }

    /* renamed from: a */
    public final NumberPicker mo44946a(int i) {
        this.f57019n = i;
        m53293a();
        m53296d();
        invalidate();
        return this;
    }

    /* renamed from: b */
    public final NumberPicker mo44949b(int i) {
        this.f57020o = i;
        m53293a();
        m53296d();
        invalidate();
        return this;
    }

    /* renamed from: c */
    public final NumberPicker mo44950c(int i) {
        this.f57021p = i;
        m53293a();
        m53296d();
        invalidate();
        return this;
    }

    /* renamed from: a */
    public final NumberPicker mo44948a(String[] strArr) {
        this.f56997O = strArr;
        m53293a();
        invalidate();
        return this;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f57004aa == null) {
            this.f57004aa = VelocityTracker.obtain();
        }
        this.f57004aa.addMovement(motionEvent);
        int a = C1044i.m2981a(motionEvent);
        this.f56983A = a;
        if (a == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.f56987E = (int) motionEvent.getY();
            if (!this.f56984B.isFinished() || !this.f56985C.isFinished()) {
                this.f56984B.forceFinished(true);
                this.f56985C.forceFinished(true);
                m53298e(0);
            }
        } else if (2 == a) {
            this.f56988F = (int) motionEvent.getY();
            this.f56989G = this.f56988F - this.f56987E;
            if (!this.f56991I && Math.abs(this.f56989G) < this.f56999T) {
                return false;
            }
            this.f56991I = true;
            if (this.f56989G > this.f56999T) {
                this.f56989G -= this.f56999T;
            } else if (this.f56989G < (-this.f56999T)) {
                this.f56989G += this.f56999T;
            }
            this.f56987E = this.f56988F;
            m53297d(this.f56989G);
            m53298e(1);
            invalidate();
        } else if (1 == a) {
            this.f56991I = false;
            VelocityTracker velocityTracker = this.f57004aa;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f57002W);
            int yVelocity = (int) velocityTracker.getYVelocity();
            if (Math.abs(yVelocity) > this.f57001V) {
                if (yVelocity > 0) {
                    int i = (int) (this.f57018m * 10.0f);
                    this.f56987E = 0;
                    this.f56984B.fling(0, 0, 0, yVelocity, 0, 0, 0, i);
                } else if (yVelocity < 0) {
                    int i2 = (int) (this.f57018m * 10.0f);
                    this.f56987E = i2;
                    this.f56984B.fling(0, i2, 0, yVelocity, 0, 0, 0, i2);
                }
                invalidate();
                m53298e(2);
            } else {
                m53295c();
                invalidate();
            }
            this.f57004aa.recycle();
            this.f57004aa = null;
        }
        return true;
    }

    /* renamed from: d */
    private void m53297d(int i) {
        int i2 = 0;
        if (this.f57006ac) {
            if (this.f57029x == 0 && this.f57013h[this.f56998P].f57033b + i > this.f57007b / 2) {
                i = (this.f57007b / 2) - this.f57013h[this.f56998P].f57033b;
            } else if (this.f57029x == this.f57028w.length - 1 && this.f57013h[this.f56998P].f57033b + i < this.f57007b / 2) {
                i = (this.f57007b / 2) - this.f57013h[this.f56998P].f57033b;
            }
            while (i2 < this.f57013h.length) {
                C20942a aVar = this.f57013h[i2];
                aVar.f57033b += i;
                if (this.f57013h[i2].f57033b >= this.f57015j + this.f56990H) {
                    C20942a aVar2 = this.f57013h[i2];
                    aVar2.f57033b -= (this.f56994L + 2) * this.f56990H;
                    C20942a aVar3 = this.f57013h[i2];
                    aVar3.f57032a -= this.f56994L + 2;
                }
                if (this.f57013h[i2].f57033b <= this.f57014i - this.f56990H) {
                    C20942a aVar4 = this.f57013h[i2];
                    aVar4.f57033b += (this.f56994L + 2) * this.f56990H;
                    C20942a aVar5 = this.f57013h[i2];
                    aVar5.f57032a += this.f56994L + 2;
                }
                if (Math.abs(this.f57013h[i2].f57033b - (this.f57007b / 2)) < this.f56990H / 4) {
                    int i3 = this.f57021p;
                    if (this.f57013h[i2].f57032a >= 0 && this.f57013h[i2].f57032a < this.f57028w.length) {
                        this.f56998P = i2;
                        this.f57029x = this.f57013h[i2].f57032a;
                        this.f57021p = this.f57028w[this.f57029x];
                    }
                    if (i3 != this.f57021p) {
                        if (this.f56992J != null) {
                            this.f56992J.mo44938a(this, i3, this.f57021p);
                        }
                        if (this.f56995M != null && this.f56996N) {
                            this.f56995M.mo44958a();
                        }
                    }
                }
                i2++;
            }
            return;
        }
        while (i2 < this.f57013h.length) {
            C20942a aVar6 = this.f57013h[i2];
            aVar6.f57033b += i;
            if (this.f57013h[i2].f57033b >= this.f57015j + this.f56990H) {
                C20942a aVar7 = this.f57013h[i2];
                aVar7.f57033b -= (this.f56994L + 2) * this.f56990H;
                C20942a aVar8 = this.f57013h[i2];
                aVar8.f57032a -= this.f56994L + 2;
                while (this.f57013h[i2].f57032a < 0) {
                    C20942a aVar9 = this.f57013h[i2];
                    aVar9.f57032a += this.f57028w.length;
                }
            }
            if (this.f57013h[i2].f57033b <= this.f57014i - this.f56990H) {
                C20942a aVar10 = this.f57013h[i2];
                aVar10.f57033b += (this.f56994L + 2) * this.f56990H;
                C20942a aVar11 = this.f57013h[i2];
                aVar11.f57032a += this.f56994L + 2;
                while (this.f57013h[i2].f57032a > this.f57028w.length - 1) {
                    C20942a aVar12 = this.f57013h[i2];
                    aVar12.f57032a -= this.f57028w.length;
                }
            }
            if (Math.abs(this.f57013h[i2].f57033b - (this.f57007b / 2)) < this.f56990H / 4) {
                this.f57029x = Math.min(this.f57013h[i2].f57032a, this.f57028w.length - 1);
                int i4 = this.f57021p;
                if (this.f57029x >= 0) {
                    this.f57021p = this.f57028w[this.f57029x];
                }
                if (i4 != this.f57021p) {
                    if (this.f56992J != null) {
                        this.f56992J.mo44938a(this, i4, this.f57021p);
                    }
                    if (this.f56995M != null && this.f56996N) {
                        this.f56995M.mo44958a();
                    }
                }
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        TextPaint textPaint;
        canvas.drawColor(this.f56986D);
        if (this.f57023r == 0.0f) {
            this.f57023r = (float) this.f57003a;
        }
        if (this.f57023r > ((float) this.f57003a)) {
            f = (float) this.f57003a;
        } else {
            f = this.f57023r;
        }
        float f2 = f / 2.0f;
        float f3 = ((float) (this.f57003a / 2)) - f2;
        float f4 = f2 + ((float) (this.f57003a / 2));
        canvas.drawLine(f3, this.f57030y.top, f4, this.f57030y.top, this.f57011f);
        canvas.drawLine(f3, this.f57030y.bottom, f4, this.f57030y.bottom, this.f57011f);
        if (this.f57025t != null) {
            canvas.drawText(this.f57025t, (float) ((int) (((float) ((this.f57003a + this.f57012g.width()) / 2)) + (this.f57005ab * 4.0f))), (float) (((this.f57007b / 2) + (this.f57012g.height() / 2)) - 4), this.f57009d);
        }
        for (int i = 0; i < this.f57013h.length; i++) {
            if (this.f57013h[i].f57032a >= 0 && this.f57013h[i].f57032a <= this.f57020o - this.f57019n) {
                String str = "";
                if (this.f57013h[i].f57032a >= 0 && this.f57013h[i].f57032a < this.f57028w.length) {
                    str = this.f56997O != null ? this.f56997O[this.f57013h[i].f57032a] : String.valueOf(this.f57028w[this.f57013h[i].f57032a]);
                }
                this.f56993K.contains(str);
                float f5 = (float) (this.f57003a / 2);
                float height = (float) (this.f57013h[i].f57033b + (this.f57012g.height() / 2));
                if (this.f57013h[i].f57032a == this.f57029x) {
                    textPaint = this.f57008c;
                } else {
                    textPaint = this.f57010e;
                }
                canvas.drawText(str, f5, height, textPaint);
                this.f56993K.add(str);
            }
        }
        this.f56993K.clear();
        if (1 == this.f56983A && this.f56984B.isFinished()) {
            m53295c();
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
            this.f57003a = size;
        } else {
            this.f57003a = this.f57012g.width() + getPaddingLeft() + getPaddingRight() + this.f57031z.width() + 6;
        }
        if (mode2 == 1073741824) {
            this.f57007b = size2;
        } else {
            this.f57007b = (this.f56994L * this.f57012g.height()) + ((this.f56994L - 1) * this.f57024s) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(this.f57003a, this.f57007b);
        if (this.f57030y == null) {
            this.f57030y = new RectF();
            this.f57030y.left = 0.0f;
            this.f57030y.right = (float) this.f57003a;
            this.f57030y.top = (float) (((this.f57007b - this.f57012g.height()) - this.f57024s) / 2);
            this.f57030y.bottom = (float) (((this.f57007b + this.f57012g.height()) + this.f57024s) / 2);
            this.f56990H = this.f57024s + this.f57012g.height();
            this.f57014i = (this.f57007b / 2) - (this.f56990H * 3);
            this.f57015j = (this.f57007b / 2) + (this.f56990H * 3);
            m53296d();
        }
    }

    public NumberPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f56983A = 3;
        this.f56993K = new HashSet();
        this.f56996N = true;
        this.f57005ab = getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bu, R.attr.j3, R.attr.j9, R.attr.j_, R.attr.ju, R.attr.jw, R.attr.jy, R.attr.kl, R.attr.lv, R.attr.lw, R.attr.lx, R.attr.acn, R.attr.a0n, R.attr.a37, R.attr.a_j}, i, 0);
        this.f57016k = obtainStyledAttributes.getColor(2, f56980Q);
        this.f57018m = obtainStyledAttributes.getDimension(3, this.f57005ab * 32.0f);
        this.f57017l = obtainStyledAttributes.getColor(4, f56980Q);
        this.f57019n = obtainStyledAttributes.getInteger(13, 0);
        this.f57020o = obtainStyledAttributes.getInteger(7, 0);
        this.f57021p = obtainStyledAttributes.getInteger(1, 0);
        this.f57024s = (int) obtainStyledAttributes.getDimension(14, this.f57005ab * 16.0f);
        this.f57025t = obtainStyledAttributes.getString(8);
        this.f57026u = obtainStyledAttributes.getColor(9, f56981R);
        this.f57027v = obtainStyledAttributes.getDimension(10, this.f57005ab * 12.0f);
        this.f56986D = obtainStyledAttributes.getColor(0, f56982S);
        this.f56994L = obtainStyledAttributes.getInteger(12, 5);
        this.f57022q = obtainStyledAttributes.getDimension(6, this.f57005ab * 2.0f);
        this.f57023r = obtainStyledAttributes.getDimension(5, 0.0f);
        obtainStyledAttributes.recycle();
        m53293a();
        this.f57008c = new TextPaint();
        this.f57008c.setTextSize(this.f57018m);
        this.f57008c.setColor(this.f57016k);
        this.f57008c.setFlags(1);
        this.f57008c.setTextAlign(Align.CENTER);
        this.f57010e = new TextPaint(this.f57008c);
        this.f57010e.setAlpha(77);
        this.f57009d = new TextPaint();
        this.f57009d.setTextSize(this.f57027v);
        this.f57009d.setColor(this.f57026u);
        this.f57009d.setFlags(1);
        this.f57009d.setTextAlign(Align.LEFT);
        this.f57011f = new Paint();
        this.f57011f.setColor(this.f57017l);
        this.f57011f.setStyle(Style.STROKE);
        this.f57011f.setStrokeWidth(this.f57022q);
        this.f57012g = new Rect();
        this.f57031z = new Rect();
        m53294b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f56999T = C1060v.m3090a(viewConfiguration);
        this.f57001V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f57002W = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.f56984B = new Scroller(getContext(), null);
        this.f56985C = new Scroller(getContext(), new DecelerateInterpolator(2.5f));
        this.f57013h = new C20942a[(this.f56994L + 4)];
    }
}

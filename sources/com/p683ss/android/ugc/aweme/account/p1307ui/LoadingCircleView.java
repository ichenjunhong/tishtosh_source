package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView */
public final class LoadingCircleView extends View {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59865a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadingCircleView.class), "rotateAnim", "getRotateAnim()Landroid/view/animation/RotateAnimation;"))};

    /* renamed from: b */
    public static final C22187a f59866b = new C22187a(null);

    /* renamed from: c */
    private int f59867c;

    /* renamed from: d */
    private float f59868d;

    /* renamed from: e */
    private float f59869e;

    /* renamed from: f */
    private boolean f59870f;

    /* renamed from: g */
    private boolean f59871g;

    /* renamed from: h */
    private Paint f59872h;

    /* renamed from: i */
    private RectF f59873i;

    /* renamed from: j */
    private final C52668f f59874j;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView$a */
    public static final class C22187a {
        private C22187a() {
        }

        public /* synthetic */ C22187a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView$b */
    static final class C22188b extends C52712l implements C52670a<RotateAnimation> {

        /* renamed from: a */
        public static final C22188b f59875a = new C22188b();

        C22188b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000);
            return rotateAnimation;
        }
    }

    public LoadingCircleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoadingCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: e */
    private final void m54987e() {
        clearAnimation();
    }

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.f59874j.getValue();
    }

    /* renamed from: b */
    public final void mo46300b() {
        this.f59871g = false;
        m54987e();
    }

    /* renamed from: a */
    public final void mo46299a() {
        this.f59871g = true;
        if (this.f59870f) {
            m54986d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59870f = true;
        if (this.f59871g) {
            m54986d();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59870f = false;
        m54987e();
    }

    /* renamed from: c */
    private boolean m54985c() {
        if (!getRotateAnim().hasStarted() || getRotateAnim().hasEnded()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final void m54986d() {
        if (!m54985c()) {
            startAnimation(getRotateAnim());
        }
    }

    public final void setLineWidth(float f) {
        this.f59872h.setStrokeWidth(f);
    }

    public final void setLoadingColor(int i) {
        this.f59872h.setColor(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f59873i == null) {
            float f = this.f59868d / 2.0f;
            View view = this;
            this.f59873i = new RectF(((float) C1056u.m3061i(view)) + f, ((float) getPaddingTop()) + f, ((float) (getWidth() - C1056u.m3063j(view))) - f, ((float) (getHeight() - getPaddingBottom())) - f);
        }
        if (canvas != null) {
            RectF rectF = this.f59873i;
            if (rectF == null) {
                C52711k.m112234a();
            }
            canvas.drawArc(rectF, 0.0f, this.f59869e, false, this.f59872h);
        }
    }

    public LoadingCircleView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f59872h = new Paint();
        this.f59874j = C52732g.m112285a(C22188b.f59875a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ey, R.attr.sk, R.attr.a41});
        this.f59867c = obtainStyledAttributes.getColor(0, -16777216);
        this.f59868d = (float) obtainStyledAttributes.getDimensionPixelSize(1, C23728o.m58241a(5.0d));
        this.f59869e = obtainStyledAttributes.getFloat(2, 300.0f);
        obtainStyledAttributes.recycle();
        this.f59872h.setAntiAlias(true);
        this.f59872h.setStyle(Style.STROKE);
        this.f59872h.setStrokeCap(Cap.ROUND);
        setLoadingColor(this.f59867c);
        setLineWidth(this.f59868d);
    }

    public /* synthetic */ LoadingCircleView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

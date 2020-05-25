package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.p022a.C0391c;
import android.support.p043v7.widget.CardView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView */
public final class MultiSelectView extends CardView implements OnClickListener {

    /* renamed from: e */
    public final ImageView f111502e;

    /* renamed from: f */
    public final DmtTextView f111503f;

    /* renamed from: g */
    public boolean f111504g;

    /* renamed from: h */
    public int f111505h;

    /* renamed from: i */
    public int f111506i;

    /* renamed from: j */
    public int f111507j;

    /* renamed from: k */
    public Drawable f111508k;

    /* renamed from: l */
    public Drawable f111509l;

    /* renamed from: m */
    public boolean f111510m;

    /* renamed from: n */
    public int f111511n;

    /* renamed from: o */
    public int f111512o;

    /* renamed from: p */
    public final C0391c f111513p;

    /* renamed from: q */
    private C44032a f111514q;

    /* renamed from: r */
    private ValueAnimator f111515r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView$a */
    public interface C44032a {
        /* renamed from: a */
        void mo70209a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MultiSelectView$b */
    static final class C44033b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MultiSelectView f111517a;

        C44033b(MultiSelectView multiSelectView) {
            this.f111517a = multiSelectView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            if (!this.f111517a.f111510m) {
                float f = 1.0f - animatedFraction;
                this.f111517a.f111503f.setAlpha(f);
                LayoutParams layoutParams = this.f111517a.getLayoutParams();
                layoutParams.width = (int) (((float) this.f111517a.f111512o) + (((float) (this.f111517a.f111511n - this.f111517a.f111512o)) * f));
                MultiSelectView multiSelectView = this.f111517a;
                multiSelectView.setLayoutParams(layoutParams);
                Integer a = C0391c.m966a(animatedFraction, Integer.valueOf(multiSelectView.f111506i), Integer.valueOf(multiSelectView.f111505h));
                C52711k.m112236a((Object) a, "argbEvaluator.evaluate(v…SelectColor, selectColor)");
                multiSelectView.setCardBackgroundColor(a.intValue());
                if (animatedFraction == 1.0f) {
                    this.f111517a.f111510m = true;
                    this.f111517a.f111502e.setImageDrawable(this.f111517a.f111508k);
                    this.f111517a.postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44033b f111518a;

                        {
                            this.f111518a = r1;
                        }

                        public final void run() {
                            if (this.f111518a.f111517a.f111504g) {
                                C44032a onModeChangeListener = this.f111518a.f111517a.getOnModeChangeListener();
                                if (onModeChangeListener != null) {
                                    onModeChangeListener.mo70209a(this.f111518a.f111517a.f111510m);
                                }
                            }
                        }
                    }, 50);
                }
            } else {
                this.f111517a.f111503f.setAlpha(animatedFraction);
                LayoutParams layoutParams2 = this.f111517a.getLayoutParams();
                layoutParams2.width = (int) (((float) this.f111517a.f111512o) + (((float) (this.f111517a.f111511n - this.f111517a.f111512o)) * animatedFraction));
                MultiSelectView multiSelectView2 = this.f111517a;
                multiSelectView2.setLayoutParams(layoutParams2);
                Integer a2 = C0391c.m966a(animatedFraction, Integer.valueOf(multiSelectView2.f111505h), Integer.valueOf(multiSelectView2.f111506i));
                C52711k.m112236a((Object) a2, "argbEvaluator.evaluate(v…lectColor, unSelectColor)");
                multiSelectView2.setCardBackgroundColor(a2.intValue());
                if (animatedFraction == 1.0f) {
                    this.f111517a.f111510m = false;
                    this.f111517a.f111502e.setImageDrawable(this.f111517a.f111509l);
                    this.f111517a.postDelayed(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44033b f111519a;

                        {
                            this.f111519a = r1;
                        }

                        public final void run() {
                            if (this.f111519a.f111517a.f111504g) {
                                C44032a onModeChangeListener = this.f111519a.f111517a.getOnModeChangeListener();
                                if (onModeChangeListener != null) {
                                    onModeChangeListener.mo70209a(this.f111519a.f111517a.f111510m);
                                }
                            }
                        }
                    }, 50);
                }
            }
        }
    }

    public MultiSelectView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MultiSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C44032a getOnModeChangeListener() {
        return this.f111514q;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f111504g = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f111504g = false;
    }

    /* renamed from: a */
    private final void m96598a() {
        if (this.f111515r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 100.0f});
            ofFloat.setDuration(150);
            ofFloat.addUpdateListener(new C44033b(this));
            this.f111515r = ofFloat;
        }
    }

    public final void setOnModeChangeListener(C44032a aVar) {
        this.f111514q = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!this.f111510m) {
            m96598a();
            ValueAnimator valueAnimator = this.f111515r;
            if (valueAnimator == null) {
                C52711k.m112234a();
            }
            if (!valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f111515r;
                if (valueAnimator2 == null) {
                    C52711k.m112234a();
                }
                valueAnimator2.start();
            }
            return;
        }
        m96598a();
        ValueAnimator valueAnimator3 = this.f111515r;
        if (valueAnimator3 == null) {
            C52711k.m112234a();
        }
        if (!valueAnimator3.isRunning()) {
            ValueAnimator valueAnimator4 = this.f111515r;
            if (valueAnimator4 == null) {
                C52711k.m112234a();
            }
            valueAnimator4.start();
        }
    }

    public MultiSelectView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f111502e = new ImageView(context);
        this.f111503f = new DmtTextView(context);
        this.f111513p = new C0391c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abx, R.attr.ad2, R.attr.ad3, R.attr.ad4, R.attr.ad5}, i, 0);
        this.f111507j = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f111505h = obtainStyledAttributes.getColor(1, 0);
        this.f111506i = obtainStyledAttributes.getColor(3, 0);
        this.f111508k = obtainStyledAttributes.getDrawable(2);
        this.f111509l = obtainStyledAttributes.getDrawable(4);
        obtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f111507j, this.f111507j);
        ImageView imageView = this.f111502e;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageDrawable(this.f111509l);
        imageView.setScaleType(ScaleType.CENTER_INSIDE);
        DmtTextView dmtTextView = this.f111503f;
        dmtTextView.setGravity(17);
        dmtTextView.setTypeface(null, 1);
        dmtTextView.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        MarginLayoutParams marginLayoutParams = layoutParams2;
        int i2 = this.f111507j;
        C52711k.m112240b(context, "context");
        if (VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(i2);
        } else if (!C47918gj.m103682a(context)) {
            marginLayoutParams.leftMargin = i2;
        } else {
            marginLayoutParams.rightMargin = i2;
        }
        dmtTextView.setLayoutParams(layoutParams2);
        dmtTextView.setText(dmtTextView.getResources().getString(R.string.c88));
        if (C47842ed.m103485a(context)) {
            dmtTextView.setPadding(this.f111507j / 2, 0, 0, 0);
        } else {
            dmtTextView.setPadding(0, 0, this.f111507j / 2, 0);
        }
        dmtTextView.setTextColor(dmtTextView.getResources().getColor(R.color.ji));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(this.f111502e);
        addView(this.f111503f);
        setOnClickListener(this);
        setClipChildren(false);
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

            /* renamed from: a */
            final /* synthetic */ MultiSelectView f111516a;

            public final void onGlobalLayout() {
                this.f111516a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f111516a.f111511n = this.f111516a.getMeasuredWidth();
                this.f111516a.f111512o = this.f111516a.f111502e.getMeasuredWidth();
                LayoutParams layoutParams = this.f111516a.f111503f.getLayoutParams();
                layoutParams.width = this.f111516a.f111511n - this.f111516a.f111507j;
                this.f111516a.f111503f.setLayoutParams(layoutParams);
            }

            {
                this.f111516a = r1;
            }
        });
    }

    public /* synthetic */ MultiSelectView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

package com.p683ss.android.ugc.aweme.choosemusic.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.music.p1977e.C37375a.C37376a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem */
public final class CommerceTipsItem extends LinearLayout {

    /* renamed from: a */
    private View f66117a;

    /* renamed from: b */
    private ValueAnimator f66118b;

    /* renamed from: c */
    private HashMap f66119c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a */
    static final class C24973a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommerceTipsItem f66120a;

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a$a */
        static final class C24974a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C24973a f66121a;

            /* renamed from: b */
            final /* synthetic */ MarginLayoutParams f66122b;

            /* renamed from: c */
            final /* synthetic */ int f66123c;

            C24974a(C24973a aVar, MarginLayoutParams marginLayoutParams, int i) {
                this.f66121a = aVar;
                this.f66122b = marginLayoutParams;
                this.f66123c = i;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = ((Float) animatedValue).floatValue();
                    CommerceTipsItem commerceTipsItem = this.f66121a.f66120a;
                    float f = 0.0f;
                    if (floatValue >= 0.0f && floatValue <= 200.0f) {
                        f = 1.0f - (floatValue / 200.0f);
                    }
                    commerceTipsItem.setAlpha(f);
                    if (floatValue >= 100.0f && floatValue <= 300.0f) {
                        View underView = this.f66121a.f66120a.getUnderView();
                        if (underView != null) {
                            float height = ((floatValue - 100.0f) / 200.0f) * (((float) this.f66121a.f66120a.getHeight()) + ((float) this.f66122b.topMargin) + ((float) this.f66122b.bottomMargin));
                            LayoutParams layoutParams = underView.getLayoutParams();
                            if (layoutParams != null) {
                                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = this.f66123c - ((int) height);
                                underView.setLayoutParams(marginLayoutParams);
                                return;
                            }
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.CommerceTipsItem$a$b */
        public static final class C24975b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C24973a f66124a;

            /* renamed from: b */
            final /* synthetic */ MarginLayoutParams f66125b;

            /* renamed from: c */
            final /* synthetic */ int f66126c;

            public final void onAnimationStart(Animator animator) {
                View underView = this.f66124a.f66120a.getUnderView();
                if (underView != null) {
                    LayoutParams layoutParams = underView.getLayoutParams();
                    layoutParams.height = underView.getMeasuredHeight() + this.f66124a.f66120a.getHeight() + this.f66125b.topMargin + this.f66125b.bottomMargin;
                    underView.setLayoutParams(layoutParams);
                }
            }

            C24975b(C24973a aVar, MarginLayoutParams marginLayoutParams, int i) {
                this.f66124a = aVar;
                this.f66125b = marginLayoutParams;
                this.f66126c = i;
            }
        }

        C24973a(CommerceTipsItem commerceTipsItem) {
            this.f66120a = commerceTipsItem;
        }

        public final void onClick(View view) {
            LayoutParams layoutParams;
            ClickInstrumentation.onClick(view);
            C37376a.m83687a("show_commerce_tips", Boolean.valueOf(false), "music_sp");
            LayoutParams layoutParams2 = this.f66120a.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                View underView = this.f66120a.getUnderView();
                if (underView != null) {
                    layoutParams = underView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    int i = ((MarginLayoutParams) layoutParams).topMargin;
                    CommerceTipsItem commerceTipsItem = this.f66120a;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 300.0f});
                    ofFloat.addUpdateListener(new C24974a(this, marginLayoutParams, i));
                    ofFloat.addListener(new C24975b(this, marginLayoutParams, i));
                    ofFloat.setDuration(300);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    commerceTipsItem.setCurrentAnimator(ofFloat);
                    ValueAnimator currentAnimator = this.f66120a.getCurrentAnimator();
                    if (currentAnimator != null) {
                        currentAnimator.start();
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public CommerceTipsItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommerceTipsItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo50945a(int i) {
        if (this.f66119c == null) {
            this.f66119c = new HashMap();
        }
        View view = (View) this.f66119c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66119c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.f66118b;
    }

    public final View getUnderView() {
        return this.f66117a;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f66118b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.f66118b = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.f66117a = view;
    }

    public CommerceTipsItem(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.byo, this);
        setOrientation(1);
        ((ImageView) mo50945a(R.id.e35)).setOnClickListener(new C24973a(this));
        DmtTextView dmtTextView = (DmtTextView) mo50945a(R.id.e34);
        C52711k.m112236a((Object) dmtTextView, "commerceTips");
        dmtTextView.setText(getContext().getString(R.string.fx2));
        setLayerType(1, null);
    }

    public /* synthetic */ CommerceTipsItem(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

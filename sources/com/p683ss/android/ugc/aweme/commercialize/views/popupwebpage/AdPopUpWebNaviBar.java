package com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.AutoRTLImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feed.adapter.C30081g;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebNaviBar */
public final class AdPopUpWebNaviBar extends RelativeLayout {

    /* renamed from: a */
    boolean f70465a;

    /* renamed from: b */
    private Animator f70466b;

    /* renamed from: c */
    private boolean f70467c;

    /* renamed from: d */
    private C26751a f70468d;

    /* renamed from: e */
    private HashMap f70469e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebNaviBar$a */
    public interface C26751a {
        /* renamed from: a */
        void mo54615a();

        /* renamed from: b */
        void mo54616b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.AdPopUpWebNaviBar$b */
    static final class C26752b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebNaviBar f70472a;

        C26752b(AdPopUpWebNaviBar adPopUpWebNaviBar) {
            this.f70472a = adPopUpWebNaviBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            AdPopUpWebNaviBar adPopUpWebNaviBar = this.f70472a;
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                adPopUpWebNaviBar.setBottomMargin(((Integer) animatedValue).intValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public AdPopUpWebNaviBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPopUpWebNaviBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m64666a(int i) {
        if (this.f70469e == null) {
            this.f70469e = new HashMap();
        }
        View view = (View) this.f70469e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f70469e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C26751a getNaviBarListener() {
        return this.f70468d;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f70466b;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final int getBottomMargin() {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            return ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo54604a() {
        if (!this.f70467c) {
            Animator animator = this.f70466b;
            if ((animator == null || !animator.isRunning()) && !this.f70465a) {
                this.f70467c = true;
                this.f70465a = true;
                m64667a(C23728o.m58241a(-52.0d), 0, 300);
            }
        }
    }

    public final void setNaviBarListener(C26751a aVar) {
        this.f70468d = aVar;
    }

    public final void setBottomMargin(int i) {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setGoBackEnable(boolean z) {
        float f;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m64666a(R.id.eq5);
        C52711k.m112236a((Object) autoRTLImageView, "pop_up_web_navi_go_back");
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        autoRTLImageView.setAlpha(f);
    }

    public final void setGoForwardEnable(boolean z) {
        float f;
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m64666a(R.id.eq6);
        C52711k.m112236a((Object) autoRTLImageView, "pop_up_web_navi_go_forward");
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        autoRTLImageView.setAlpha(f);
    }

    public AdPopUpWebNaviBar(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.byu, this, true);
        ((AutoRTLImageView) m64666a(R.id.eq5)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebNaviBar f70470a;

            {
                this.f70470a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26751a naviBarListener = this.f70470a.getNaviBarListener();
                if (naviBarListener != null) {
                    naviBarListener.mo54615a();
                }
            }
        });
        ((AutoRTLImageView) m64666a(R.id.eq6)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdPopUpWebNaviBar f70471a;

            {
                this.f70471a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C26751a naviBarListener = this.f70471a.getNaviBarListener();
                if (naviBarListener != null) {
                    naviBarListener.mo54616b();
                }
            }
        });
    }

    /* renamed from: a */
    private final void m64667a(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C26752b(this));
        C52711k.m112236a((Object) ofInt, "anim");
        ofInt.setDuration(300);
        ofInt.setInterpolator(new C30081g());
        ofInt.setTarget(this);
        ofInt.start();
        this.f70466b = ofInt;
    }

    /* renamed from: a */
    public final void mo54605a(int i, int i2, int i3, int i4) {
        if (getVisibility() != 8) {
            if (i2 - i4 > 0) {
                if (this.f70467c) {
                    Animator animator = this.f70466b;
                    if ((animator == null || !animator.isRunning()) && !this.f70465a) {
                        this.f70467c = false;
                        this.f70465a = true;
                        m64667a(0, C23728o.m58241a(-52.0d), 300);
                        return;
                    }
                }
                return;
            }
            mo54604a();
        }
    }

    public /* synthetic */ AdPopUpWebNaviBar(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

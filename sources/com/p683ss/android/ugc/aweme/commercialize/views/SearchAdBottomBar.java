package com.p683ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26345b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26348d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar */
public final class SearchAdBottomBar extends FrameLayout {

    /* renamed from: a */
    private final int f70187a;

    /* renamed from: b */
    private int f70188b;

    /* renamed from: c */
    private Aweme f70189c;

    /* renamed from: d */
    private int f70190d;

    /* renamed from: e */
    private View f70191e;

    /* renamed from: f */
    private ImageView f70192f;

    /* renamed from: g */
    private DmtTextView f70193g;

    /* renamed from: h */
    private ImageView f70194h;

    /* renamed from: i */
    private View f70195i;

    /* renamed from: j */
    private View f70196j;

    /* renamed from: k */
    private Animator f70197k;

    /* renamed from: l */
    private Animator f70198l;

    /* renamed from: m */
    private Animator f70199m;

    /* renamed from: n */
    private ObjectAnimator f70200n;

    /* renamed from: o */
    private ObjectAnimator f70201o;

    /* renamed from: p */
    private int f70202p;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar$a */
    static final class C26640a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f70203a;

        /* renamed from: b */
        final /* synthetic */ Aweme f70204b;

        /* renamed from: c */
        final /* synthetic */ AwemeRawAd f70205c;

        C26640a(SearchAdBottomBar searchAdBottomBar, Aweme aweme, AwemeRawAd awemeRawAd) {
            this.f70203a = searchAdBottomBar;
            this.f70204b = aweme;
            this.f70205c = awemeRawAd;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26325a a = C26345b.m63777a(this.f70204b, "button");
            if (this.f70205c.isAppAd()) {
                Context context = this.f70203a.getContext();
                C52711k.m112236a((Object) context, "context");
                C26348d.m63785a(context, a, C266411.f70206a, C266422.f70207a).mo54089a();
                return;
            }
            Context context2 = this.f70203a.getContext();
            C52711k.m112236a((Object) context2, "context");
            C26348d.m63784a(context2, a).mo54089a();
            C26088l.m63325b(this.f70203a.getContext(), this.f70205c.getCreativeIdStr(), "button", this.f70205c.getLogExtra());
            C26060ay.f68819a.mo53545a("click", this.f70205c.getClickTrackUrlList(), this.f70205c.getCreativeId(), this.f70205c.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C52682m<C26080b, Boolean, C26080b>(this) {

                /* renamed from: a */
                final /* synthetic */ C26640a f70208a;

                {
                    this.f70208a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    C26080b bVar = (C26080b) obj;
                    ((Boolean) obj2).booleanValue();
                    C52711k.m112240b(bVar, "$receiver");
                    bVar.mo53579a(this.f70208a.f70205c);
                    C26080b g = bVar.mo53602g("button");
                    C52711k.m112236a((Object) g, "refer(CommercializeMob.Refer.BUTTON)");
                    return g;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar$b */
    static final class C26644b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f70209a;

        C26644b(SearchAdBottomBar searchAdBottomBar) {
            this.f70209a = searchAdBottomBar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                this.f70209a.setBackgroundColor(((Integer) animatedValue).intValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.SearchAdBottomBar$c */
    static final class C26645c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ SearchAdBottomBar f70210a;

        /* renamed from: b */
        final /* synthetic */ int f70211b;

        /* renamed from: c */
        final /* synthetic */ C52727e f70212c;

        C26645c(SearchAdBottomBar searchAdBottomBar, int i, C52727e eVar) {
            this.f70210a = searchAdBottomBar;
            this.f70211b = i;
            this.f70212c = eVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f70210a.setMargin(intValue);
                if (intValue >= this.f70211b) {
                    C52670a aVar = (C52670a) this.f70212c.element;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    this.f70212c.element = null;
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public SearchAdBottomBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchAdBottomBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getStyle() {
        return this.f70202p;
    }

    public final int getMargin() {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            switch (this.f70202p) {
                case 1:
                    return marginLayoutParams.bottomMargin;
                case 2:
                    return marginLayoutParams.topMargin;
                default:
                    return 0;
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        Aweme aweme = this.f70189c;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "mAweme?.awemeRawAd ?: return");
                if (awemeRawAd.getShowButtonSeconds() <= 0) {
                    i = 0;
                } else {
                    i = C23728o.m58241a(-40.0d);
                }
                setMargin(i);
                setBackgroundColor(this.f70187a);
                View view = this.f70191e;
                if (view == null) {
                    C52711k.m112237a("bottomBarContent");
                }
                view.setAlpha(0.5f);
                this.f70190d = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f70197k;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f70198l;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f70199m;
        if (animator3 != null) {
            animator3.cancel();
        }
        ObjectAnimator objectAnimator = this.f70200n;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.f70201o;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.f70200n = null;
        this.f70201o = null;
        View view = this.f70195i;
        if (view == null) {
            C52711k.m112237a("downloadMask1");
        }
        view.setVisibility(8);
        View view2 = this.f70196j;
        if (view2 == null) {
            C52711k.m112237a("downloadMask2");
        }
        view2.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ze);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.content)");
        this.f70191e = findViewById;
        View findViewById2 = findViewById(R.id.aqa);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.icon)");
        this.f70192f = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.text);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.text)");
        this.f70193g = (DmtTextView) findViewById3;
        View findViewById4 = findViewById(R.id.g_);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.arrow)");
        this.f70194h = (ImageView) findViewById4;
        View findViewById5 = findViewById(R.id.e66);
        C52711k.m112236a((Object) findViewById5, "findViewById(R.id.download_mask_1)");
        this.f70195i = findViewById5;
        View findViewById6 = findViewById(R.id.e67);
        C52711k.m112236a((Object) findViewById6, "findViewById(R.id.download_mask_2)");
        this.f70196j = findViewById6;
        View view = this.f70195i;
        if (view == null) {
            C52711k.m112237a("downloadMask1");
        }
        view.setBackgroundResource(R.drawable.ct0);
        View view2 = this.f70196j;
        if (view2 == null) {
            C52711k.m112237a("downloadMask2");
        }
        view2.setBackgroundResource(R.drawable.ct0);
    }

    public final void setStyle(int i) {
        this.f70202p = i;
    }

    public final void setMargin(int i) {
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            switch (this.f70202p) {
                case 1:
                    marginLayoutParams.bottomMargin = i;
                    break;
                case 2:
                    marginLayoutParams.topMargin = i;
                    break;
            }
            setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public final void mo54457a(boolean z) {
        if (z) {
            setBackgroundColor(this.f70188b);
            View view = this.f70191e;
            if (view == null) {
                C52711k.m112237a("bottomBarContent");
            }
            view.setAlpha(1.0f);
            return;
        }
        int i = this.f70187a;
        int i2 = this.f70188b;
        if (i != i2) {
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            ofObject.addUpdateListener(new C26644b(this));
            C52711k.m112236a((Object) ofObject, "colorAnimator");
            ofObject.setDuration(300);
            ofObject.start();
            this.f70198l = ofObject;
        }
        View view2 = this.f70191e;
        if (view2 == null) {
            C52711k.m112237a("bottomBarContent");
        }
        this.f70199m = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.5f, 1.0f}).setDuration(300);
        Animator animator = this.f70199m;
        if (animator != null) {
            animator.start();
        }
    }

    /* renamed from: a */
    public final void mo54456a(Aweme aweme) {
        int i;
        int i2;
        int i3;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "aweme?.awemeRawAd ?: return");
                this.f70189c = aweme;
                boolean z = false;
                setVisibility(0);
                ImageView imageView = this.f70192f;
                if (imageView == null) {
                    C52711k.m112237a("bottomBarIcon");
                }
                if (awemeRawAd.isAppAd()) {
                    i = R.drawable.cxk;
                } else {
                    i = R.drawable.cxl;
                }
                imageView.setImageResource(i);
                String buttonText = awemeRawAd.getButtonText();
                if (buttonText != null) {
                    DmtTextView dmtTextView = this.f70193g;
                    if (dmtTextView == null) {
                        C52711k.m112237a("bottomBarText");
                    }
                    dmtTextView.setText(buttonText);
                }
                ImageView imageView2 = this.f70194h;
                if (imageView2 == null) {
                    C52711k.m112237a("bottomBarArrow");
                }
                if (awemeRawAd.isAppAd()) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                imageView2.setVisibility(i2);
                setOnClickListener(new C26640a(this, aweme, awemeRawAd));
                try {
                    CharSequence learnMoreBgColor = awemeRawAd.getLearnMoreBgColor();
                    if (learnMoreBgColor == null || learnMoreBgColor.length() == 0) {
                        z = true;
                    }
                    if (!z) {
                        i3 = Color.parseColor(awemeRawAd.getLearnMoreBgColor());
                    } else {
                        i3 = Color.parseColor("#F1683D");
                    }
                } catch (Exception unused) {
                    i3 = Color.parseColor("#F1683D");
                }
                this.f70188b = i3;
            }
        }
    }

    /* renamed from: a */
    public final void mo54458a(boolean z, C52670a<C52860x> aVar) {
        if (z) {
            setMargin(0);
            aVar.invoke();
        } else {
            int margin = getMargin();
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{margin, 0});
            int i = (margin + 0) / 2;
            C52727e eVar = new C52727e();
            eVar.element = aVar;
            ofInt.addUpdateListener(new C26645c(this, i, eVar));
            C52711k.m112236a((Object) ofInt, "animator");
            ofInt.setDuration(300);
            ofInt.setTarget(this);
            ofInt.start();
            this.f70197k = ofInt;
        }
        Aweme aweme = this.f70189c;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                C52711k.m112236a((Object) awemeRawAd, "mAweme?.awemeRawAd ?: return");
                C26088l.m63344d(getContext(), awemeRawAd.getCreativeIdStr(), "button", awemeRawAd.getLogExtra());
            }
        }
    }

    public SearchAdBottomBar(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f70187a = Color.parseColor("#4D3A3A3A");
        this.f70188b = Color.parseColor("#F1683D");
        this.f70202p = -1;
    }

    public /* synthetic */ SearchAdBottomBar(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

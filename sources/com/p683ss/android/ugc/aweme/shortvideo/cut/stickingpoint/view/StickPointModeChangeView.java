package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43018b;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p683ss.android.ugc.aweme.themechange.base.C46788b;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView */
public final class StickPointModeChangeView extends FrameLayout {

    /* renamed from: h */
    public static final C43068a f108728h = new C43068a(null);

    /* renamed from: a */
    public AVDmtTextView f108729a;

    /* renamed from: b */
    public AVDmtTextView f108730b;

    /* renamed from: c */
    public DmtThreeAngleView f108731c;

    /* renamed from: d */
    public final int[] f108732d;

    /* renamed from: e */
    public final int[] f108733e;

    /* renamed from: f */
    public int f108734f;

    /* renamed from: g */
    public int f108735g;

    /* renamed from: i */
    private C43018b f108736i;

    /* renamed from: j */
    private final Runnable f108737j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$a */
    public static final class C43068a {
        private C43068a() {
        }

        public /* synthetic */ C43068a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$b */
    static final class C43069b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f108738a;

        C43069b(StickPointModeChangeView stickPointModeChangeView) {
            this.f108738a = stickPointModeChangeView;
        }

        public final void onClick(View view) {
            float f;
            ClickInstrumentation.onClick(view);
            ViewPropertyAnimator animate = StickPointModeChangeView.m94375a(this.f108738a).animate();
            if (C43036f.m94313g()) {
                f = 0.0f;
            } else {
                f = -((float) this.f108738a.f108735g);
            }
            animate.translationX(f).setDuration(200).start();
            this.f108738a.mo87456a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$c */
    static final class C43070c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f108739a;

        C43070c(StickPointModeChangeView stickPointModeChangeView) {
            this.f108739a = stickPointModeChangeView;
        }

        public final void onClick(View view) {
            float f;
            ClickInstrumentation.onClick(view);
            ViewPropertyAnimator animate = StickPointModeChangeView.m94375a(this.f108739a).animate();
            if (C43036f.m94313g()) {
                f = (float) this.f108739a.f108735g;
            } else {
                f = 0.0f;
            }
            animate.translationX(f).setDuration(200).start();
            this.f108739a.mo87456a(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView$d */
    static final class C43071d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StickPointModeChangeView f108740a;

        C43071d(StickPointModeChangeView stickPointModeChangeView) {
            this.f108740a = stickPointModeChangeView;
        }

        public final void run() {
            StickPointModeChangeView.m94376b(this.f108740a).getLocationOnScreen(this.f108740a.f108732d);
            StickPointModeChangeView.m94377c(this.f108740a).getLocationOnScreen(this.f108740a.f108733e);
            LayoutParams layoutParams = StickPointModeChangeView.m94375a(this.f108740a).getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (this.f108740a.f108734f == 1) {
                    layoutParams2.leftMargin = (this.f108740a.f108732d[0] + (StickPointModeChangeView.m94376b(this.f108740a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.m94375a(this.f108740a).getMeasuredWidth() / 2);
                } else {
                    layoutParams2.leftMargin = (this.f108740a.f108733e[0] + (StickPointModeChangeView.m94377c(this.f108740a).getMeasuredWidth() / 2)) - (StickPointModeChangeView.m94375a(this.f108740a).getMeasuredWidth() / 2);
                }
                StickPointModeChangeView.m94375a(this.f108740a).setLayoutParams(layoutParams2);
                this.f108740a.f108735g = (this.f108740a.f108733e[0] - this.f108740a.f108732d[0]) + ((StickPointModeChangeView.m94377c(this.f108740a).getMeasuredWidth() - StickPointModeChangeView.m94376b(this.f108740a).getMeasuredWidth()) / 2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public StickPointModeChangeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickPointModeChangeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getCurrentMode() {
        return this.f108734f;
    }

    public final void setStickPointModeChangeListener(C43018b bVar) {
        C52711k.m112240b(bVar, "listener");
        this.f108736i = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtThreeAngleView m94375a(StickPointModeChangeView stickPointModeChangeView) {
        DmtThreeAngleView dmtThreeAngleView = stickPointModeChangeView.f108731c;
        if (dmtThreeAngleView == null) {
            C52711k.m112237a("angleView");
        }
        return dmtThreeAngleView;
    }

    /* renamed from: b */
    public static final /* synthetic */ AVDmtTextView m94376b(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f108729a;
        if (aVDmtTextView == null) {
            C52711k.m112237a("stickPointModeView");
        }
        return aVDmtTextView;
    }

    /* renamed from: c */
    public static final /* synthetic */ AVDmtTextView m94377c(StickPointModeChangeView stickPointModeChangeView) {
        AVDmtTextView aVDmtTextView = stickPointModeChangeView.f108730b;
        if (aVDmtTextView == null) {
            C52711k.m112237a("normalModeView");
        }
        return aVDmtTextView;
    }

    /* renamed from: a */
    public final void mo87456a(int i) {
        this.f108734f = i;
        if (i == 1) {
            AVDmtTextView aVDmtTextView = this.f108729a;
            if (aVDmtTextView == null) {
                C52711k.m112237a("stickPointModeView");
            }
            aVDmtTextView.setSelected(true);
            AVDmtTextView aVDmtTextView2 = this.f108730b;
            if (aVDmtTextView2 == null) {
                C52711k.m112237a("normalModeView");
            }
            aVDmtTextView2.setSelected(false);
            AVDmtTextView aVDmtTextView3 = this.f108730b;
            if (aVDmtTextView3 == null) {
                C52711k.m112237a("normalModeView");
            }
            aVDmtTextView3.setTypeface(Typeface.defaultFromStyle(0));
            AVDmtTextView aVDmtTextView4 = this.f108730b;
            if (aVDmtTextView4 == null) {
                C52711k.m112237a("normalModeView");
            }
            TextPaint paint = aVDmtTextView4.getPaint();
            C52711k.m112236a((Object) paint, "normalModeView.paint");
            paint.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView5 = this.f108729a;
            if (aVDmtTextView5 == null) {
                C52711k.m112237a("stickPointModeView");
            }
            aVDmtTextView5.mo93998b();
            AVDmtTextView aVDmtTextView6 = this.f108729a;
            if (aVDmtTextView6 == null) {
                C52711k.m112237a("stickPointModeView");
            }
            TextPaint paint2 = aVDmtTextView6.getPaint();
            C52711k.m112236a((Object) paint2, "stickPointModeView.paint");
            paint2.setFakeBoldText(true);
        } else {
            AVDmtTextView aVDmtTextView7 = this.f108729a;
            if (aVDmtTextView7 == null) {
                C52711k.m112237a("stickPointModeView");
            }
            aVDmtTextView7.setSelected(false);
            AVDmtTextView aVDmtTextView8 = this.f108730b;
            if (aVDmtTextView8 == null) {
                C52711k.m112237a("normalModeView");
            }
            aVDmtTextView8.setSelected(true);
            AVDmtTextView aVDmtTextView9 = this.f108729a;
            if (aVDmtTextView9 == null) {
                C52711k.m112237a("stickPointModeView");
            }
            aVDmtTextView9.setTypeface(Typeface.defaultFromStyle(0));
            AVDmtTextView aVDmtTextView10 = this.f108729a;
            if (aVDmtTextView10 == null) {
                C52711k.m112237a("stickPointModeView");
            }
            TextPaint paint3 = aVDmtTextView10.getPaint();
            C52711k.m112236a((Object) paint3, "stickPointModeView.paint");
            paint3.setFakeBoldText(false);
            AVDmtTextView aVDmtTextView11 = this.f108730b;
            if (aVDmtTextView11 == null) {
                C52711k.m112237a("normalModeView");
            }
            aVDmtTextView11.mo93998b();
            AVDmtTextView aVDmtTextView12 = this.f108730b;
            if (aVDmtTextView12 == null) {
                C52711k.m112237a("normalModeView");
            }
            TextPaint paint4 = aVDmtTextView12.getPaint();
            C52711k.m112236a((Object) paint4, "normalModeView.paint");
            paint4.setFakeBoldText(true);
        }
        C43018b bVar = this.f108736i;
        if (bVar != null) {
            bVar.mo87220a(i);
        }
    }

    public StickPointModeChangeView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        int i3 = 2;
        this.f108732d = new int[2];
        this.f108733e = new int[2];
        if (C43036f.m94313g()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f108734f = i2;
        this.f108737j = new C43071d(this);
        View inflate = LayoutInflater.from(context).inflate(R.layout.a86, this);
        View findViewById = inflate.findViewById(R.id.csx);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.stick_mode)");
        this.f108729a = (AVDmtTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.bri);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.normal_mode)");
        this.f108730b = (AVDmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.fe);
        C52711k.m112236a((Object) findViewById3, "contentView.findViewById(R.id.angle_view)");
        this.f108731c = (DmtThreeAngleView) findViewById3;
        DmtThreeAngleView dmtThreeAngleView = this.f108731c;
        if (dmtThreeAngleView == null) {
            C52711k.m112237a("angleView");
        }
        dmtThreeAngleView.setBgColor(C46788b.f118235d.mo94007a(true, true, false, false, false));
        DmtThreeAngleView dmtThreeAngleView2 = this.f108731c;
        if (dmtThreeAngleView2 == null) {
            C52711k.m112237a("angleView");
        }
        C52711k.m112236a((Object) inflate, "contentView");
        dmtThreeAngleView2.setRoundRadius((int) C9432q.m18687b(inflate.getContext(), 4.0f));
        AVDmtTextView aVDmtTextView = this.f108729a;
        if (aVDmtTextView == null) {
            C52711k.m112237a("stickPointModeView");
        }
        aVDmtTextView.setOnClickListener(new C43069b(this));
        AVDmtTextView aVDmtTextView2 = this.f108730b;
        if (aVDmtTextView2 == null) {
            C52711k.m112237a("normalModeView");
        }
        aVDmtTextView2.setOnClickListener(new C43070c(this));
        if (C43036f.m94313g()) {
            i3 = 1;
        }
        this.f108734f = i3;
        AVDmtTextView aVDmtTextView3 = this.f108729a;
        if (aVDmtTextView3 == null) {
            C52711k.m112237a("stickPointModeView");
        }
        aVDmtTextView3.post(this.f108737j);
        mo87456a(this.f108734f);
    }

    public /* synthetic */ StickPointModeChangeView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

package com.p683ss.android.ugc.aweme.commercialize.symphony;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p667c.C10672b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout */
public final class AdDislikeLayout extends FrameLayout {

    /* renamed from: a */
    boolean f69362a;

    /* renamed from: b */
    final float f69363b;

    /* renamed from: c */
    int f69364c;

    /* renamed from: d */
    int f69365d;

    /* renamed from: e */
    int f69366e;

    /* renamed from: f */
    C26275a f69367f;

    /* renamed from: g */
    int f69368g;

    /* renamed from: h */
    private C26276b f69369h;

    /* renamed from: i */
    private HashMap f69370i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$a */
    public interface C26275a {
        /* renamed from: a */
        void mo53945a();

        /* renamed from: b */
        void mo53946b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b */
    public interface C26276b {
        /* renamed from: b */
        void mo53947b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$c */
    public static final class C26277c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AdDislikeLayout f69375a;

        C26277c(AdDislikeLayout adDislikeLayout) {
            this.f69375a = adDislikeLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            LinearLayout linearLayout = (LinearLayout) this.f69375a.mo53931a(R.id.d0r);
            C52711k.m112236a((Object) linearLayout, "titleAndOptions");
            linearLayout.setVisibility(8);
            View a = this.f69375a.mo53931a(R.id.agk);
            C52711k.m112236a((Object) a, "flDislikeBg");
            a.setVisibility(8);
            C26275a iDislike = this.f69375a.getIDislike();
            if (iDislike != null) {
                iDislike.mo53945a();
            }
            super.onAnimationEnd(animator);
        }
    }

    public AdDislikeLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdDislikeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo53931a(int i) {
        if (this.f69370i == null) {
            this.f69370i = new HashMap();
        }
        View view = (View) this.f69370i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f69370i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C26275a getIDislike() {
        return this.f69367f;
    }

    public final C26276b getIDislikeClick() {
        return this.f69369h;
    }

    public final int getLastY() {
        return this.f69368g;
    }

    /* renamed from: a */
    public final void mo53932a() {
        C10691a.m21549c(getContext(), (int) R.string.dm, 0).mo19066a();
    }

    /* renamed from: b */
    public final void mo53933b() {
        ObjectAnimator objectAnimator;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo53931a(R.id.agk), "alpha", new float[]{1.0f, 0.0f});
        C52711k.m112236a((Object) ofFloat, "fadeInBg");
        ofFloat.setDuration(150);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((LinearLayout) mo53931a(R.id.d0r), "alpha", new float[]{1.0f, 0.0f});
        C52711k.m112236a((Object) ofFloat2, "fadeInContent");
        ofFloat2.setDuration(200);
        if (this.f69362a) {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) mo53931a(R.id.d0r), "translationY", new float[]{0.0f, this.f69363b});
            C52711k.m112236a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…0f, translationYDistance)");
        } else {
            objectAnimator = ObjectAnimator.ofFloat((LinearLayout) mo53931a(R.id.d0r), "translationY", new float[]{this.f69363b, 0.0f});
            C52711k.m112236a((Object) objectAnimator, "ObjectAnimator.ofFloat(t…translationYDistance, 0f)");
        }
        ObjectAnimator duration = objectAnimator.setDuration(250);
        C52711k.m112236a((Object) duration, "jumpContent.setDuration(…_CONTENT_DURATION_MEDIUM)");
        duration.setInterpolator(new C10672b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(objectAnimator);
        animatorSet.start();
        animatorSet.addListener(new C26277c(this));
    }

    public final void setIDislike(C26275a aVar) {
        this.f69367f = aVar;
    }

    public final void setIDislikeClick(C26276b bVar) {
        this.f69369h = bVar;
    }

    public final void setLastY(int i) {
        this.f69368g = i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent != null) {
            i = (int) motionEvent.getY();
        } else {
            i = 0;
        }
        this.f69368g = i;
        return super.onTouchEvent(motionEvent);
    }

    public AdDislikeLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f69362a = true;
        this.f69363b = (float) C23728o.m58241a(70.0d);
        this.f69364c = C23728o.m58241a(60.0d);
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        this.f69365d = resources.getDisplayMetrics().heightPixels - this.f69364c;
        this.f69366e = C23728o.m58241a(230.0d);
        LayoutInflater.from(context).inflate(R.layout.ey, this, true);
        mo53931a(R.id.agk).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f69371a;

            {
                this.f69371a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f69371a.mo53933b();
            }
        });
        ((TextView) mo53931a(R.id.a67)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f69372a;

            {
                this.f69372a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f69372a.mo53933b();
                C26276b iDislikeClick = this.f69372a.getIDislikeClick();
                if (iDislikeClick != null) {
                    iDislikeClick.mo53947b();
                }
            }
        });
        ((TextView) mo53931a(R.id.a67)).setOnTouchListener(new C26309b());
        ((TextView) mo53931a(R.id.cgq)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f69373a;

            {
                this.f69373a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f69373a.mo53933b();
                this.f69373a.mo53932a();
            }
        });
        ((TextView) mo53931a(R.id.cgq)).setOnTouchListener(new C26309b());
        ((TextView) mo53931a(R.id.ux)).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AdDislikeLayout f69374a;

            {
                this.f69374a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f69374a.mo53933b();
                this.f69374a.mo53932a();
            }
        });
        ((TextView) mo53931a(R.id.ux)).setOnTouchListener(new C26309b());
        ((TextView) mo53931a(R.id.ux)).setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(R.drawable.asd), null, null);
    }

    public /* synthetic */ AdDislikeLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}

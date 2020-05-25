package com.p683ss.android.ugc.aweme.sticker.panel.guide.p2307a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.effectplatform.C29240a;
import com.p683ss.android.ugc.aweme.shortvideo.C43862ga;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.C46185e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.a.a */
public final class C46173a implements C46185e {

    /* renamed from: a */
    public View f116520a;

    /* renamed from: b */
    private TextView f116521b;

    /* renamed from: c */
    private SimpleDraweeView f116522c;

    /* renamed from: d */
    private View f116523d;

    /* renamed from: e */
    private FrameLayout f116524e;

    /* renamed from: f */
    private Effect f116525f;

    /* renamed from: g */
    private Runnable f116526g = new Runnable() {
        public final void run() {
            Animation a = C46173a.m100312a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C46173a.this.mo88287a(true);
                }
            });
            C46173a.this.f116520a.startAnimation(a);
        }
    };

    public C46173a(Effect effect) {
        this.f116525f = effect;
    }

    /* renamed from: a */
    public final void mo88287a(boolean z) {
        if (this.f116525f != null) {
            this.f116520a.removeCallbacks(this.f116526g);
            this.f116524e.removeView(this.f116523d);
        }
    }

    /* renamed from: a */
    public final void mo88286a(FrameLayout frameLayout) {
        boolean z;
        this.f116524e = frameLayout;
        if (this.f116525f != null) {
            int i = 0;
            this.f116523d = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.a82, frameLayout, false);
            this.f116524e.addView(this.f116523d);
            this.f116520a = this.f116523d.findViewById(R.id.agn);
            this.f116521b = (TextView) this.f116523d.findViewById(R.id.ct6);
            if (this.f116525f.getHint() != null) {
                this.f116521b.setText(this.f116525f.getHint());
            }
            this.f116522c = (SimpleDraweeView) this.f116523d.findViewById(R.id.ct7);
            if (this.f116525f.getHintIcon() == null || C50201e.m108355a(this.f116525f.getHintIcon().getUrlList())) {
                z = false;
            } else {
                z = true;
            }
            SimpleDraweeView simpleDraweeView = this.f116522c;
            if (!z) {
                i = 8;
            }
            C43862ga.m96321a((View) simpleDraweeView, i);
            if (z) {
                C50181a.m108287a(this.f116522c, C29240a.m68865a(this.f116525f.getHintIcon()));
            }
            this.f116520a.startAnimation(m100312a(0.0f, 1.0f, 300));
            this.f116520a.postDelayed(this.f116526g, 5000);
        }
    }

    /* renamed from: a */
    public static Animation m100312a(float f, float f2, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }
}

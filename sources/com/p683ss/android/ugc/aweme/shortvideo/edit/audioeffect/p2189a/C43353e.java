package com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.p2189a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.sticker.panel.guide.C46185e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e */
public final class C43353e implements C46185e {

    /* renamed from: b */
    public static final C43354a f109612b = new C43354a(null);

    /* renamed from: a */
    public View f109613a;

    /* renamed from: c */
    private TextView f109614c;

    /* renamed from: d */
    private SimpleDraweeView f109615d;

    /* renamed from: e */
    private View f109616e;

    /* renamed from: f */
    private FrameLayout f109617f;

    /* renamed from: g */
    private final Runnable f109618g = new C43355b(this);

    /* renamed from: h */
    private final Effect f109619h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$a */
    public static final class C43354a {
        private C43354a() {
        }

        public /* synthetic */ C43354a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static Animation m95080a(float f, float f2, long j) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
            alphaAnimation.setDuration(300);
            return alphaAnimation;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$b */
    static final class C43355b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43353e f109620a;

        C43355b(C43353e eVar) {
            this.f109620a = eVar;
        }

        public final void run() {
            Animation a = C43354a.m95080a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener(this) {

                /* renamed from: a */
                final /* synthetic */ C43355b f109621a;

                public final void onAnimationRepeat(Animation animation) {
                    C52711k.m112240b(animation, "animation");
                }

                public final void onAnimationStart(Animation animation) {
                    C52711k.m112240b(animation, "animation");
                }

                {
                    this.f109621a = r1;
                }

                public final void onAnimationEnd(Animation animation) {
                    C52711k.m112240b(animation, "animation");
                    this.f109621a.f109620a.mo88287a(true);
                }
            });
            View view = this.f109620a.f109613a;
            if (view != null) {
                view.startAnimation(a);
            }
        }
    }

    public C43353e(Effect effect) {
        C52711k.m112240b(effect, "mEffect");
        this.f109619h = effect;
    }

    /* renamed from: a */
    public final void mo88287a(boolean z) {
        View view = this.f109613a;
        if (view != null) {
            view.removeCallbacks(this.f109618g);
        }
        FrameLayout frameLayout = this.f109617f;
        if (frameLayout != null) {
            frameLayout.removeView(this.f109616e);
        }
    }

    /* renamed from: a */
    public final void mo88286a(FrameLayout frameLayout) {
        View view;
        TextView textView;
        if (frameLayout != null) {
            this.f109617f = frameLayout;
            this.f109616e = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.a82, frameLayout, false);
            FrameLayout frameLayout2 = this.f109617f;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f109616e);
            }
            View view2 = this.f109616e;
            SimpleDraweeView simpleDraweeView = null;
            if (view2 != null) {
                view = view2.findViewById(R.id.agn);
            } else {
                view = null;
            }
            this.f109613a = view;
            View view3 = this.f109616e;
            if (view3 != null) {
                textView = (TextView) view3.findViewById(R.id.ct6);
            } else {
                textView = null;
            }
            this.f109614c = textView;
            TextView textView2 = this.f109614c;
            if (textView2 != null) {
                String hint = this.f109619h.getHint();
                if (hint == null) {
                    hint = "";
                }
                textView2.setText(hint);
            }
            View view4 = this.f109616e;
            if (view4 != null) {
                simpleDraweeView = (SimpleDraweeView) view4.findViewById(R.id.ct7);
            }
            this.f109615d = simpleDraweeView;
            C23729p.m58257a((View) this.f109615d, 8);
            View view5 = this.f109613a;
            if (view5 != null) {
                view5.startAnimation(C43354a.m95080a(0.0f, 1.0f, 300));
            }
            View view6 = this.f109613a;
            if (view6 != null) {
                view6.postDelayed(this.f109618g, 5000);
            }
        }
    }
}

package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0214z;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.bytedance.als.ApiCenter;
import com.p683ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p683ss.android.ugc.aweme.tools.C47336q;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49577b;
import com.p683ss.android.ugc.gamora.recorder.p2465b.C49596h;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a;
import com.p683ss.android.ugc.gamora.recorder.p2466c.C49607a.C49608a;
import com.p683ss.android.ugc.gamora.recorder.p2473g.C49784a;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gb */
public final class C43863gb {

    /* renamed from: a */
    private C42562ct f111109a;

    /* renamed from: b */
    private RecordStatusViewModel f111110b;

    /* renamed from: c */
    private C49607a f111111c;

    /* renamed from: d */
    private C49577b f111112d;

    /* renamed from: e */
    private ShortVideoContext f111113e;

    public C43863gb(C42562ct ctVar) {
        this.f111109a = ctVar;
    }

    /* renamed from: c */
    private void m96324c(boolean z) {
        this.f111112d.mo97483a(z);
        this.f111112d.mo97484b(z);
    }

    /* renamed from: a */
    public final void mo89408a(boolean z) {
        if (z) {
            m96324c(false);
            return;
        }
        this.f111109a.mo86793h().mo89397a(false);
        m96324c(false);
        ((C49860a) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49860a.class)).mo97696d(false);
        this.f111110b.mo92167l().setValue(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final void mo89409b(boolean z) {
        boolean z2;
        if (z) {
            m96324c(true);
            return;
        }
        this.f111109a.mo86793h().mo89397a(true);
        if (this.f111109a.mo87883J().f107134a.mo86372m() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !this.f111113e.f107122o) {
            m96324c(true);
        }
        ((C49860a) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49860a.class)).mo97696d(true);
        this.f111110b.mo92167l().setValue(Boolean.valueOf(false));
    }

    public final void onEvent(C47336q qVar) {
        if (this.f111110b == null) {
            this.f111110b = (RecordStatusViewModel) C0214z.m440a(this.f111109a.mo87882I()).mo359a(RecordStatusViewModel.class);
        }
        if (this.f111113e == null) {
            this.f111113e = ((ShortVideoContextViewModel) C0214z.m440a(this.f111109a.mo87882I()).mo359a(ShortVideoContextViewModel.class)).f107134a;
        }
        if (this.f111112d == null) {
            this.f111112d = (C49577b) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49577b.class);
        }
        if (qVar.f119489a == 0 && qVar.f119491c) {
            final boolean z = qVar.f119490b;
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C43863gb.this.mo89408a(z);
                }
            });
            if (this.f111111c == null) {
                this.f111111c = C49608a.m107072a(this.f111109a.mo87882I());
            }
            this.f111111c.mo97513a(1.0f, 0.0f);
            ((C49784a) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49784a.class)).mo97640a(new C52847n(Float.valueOf(1.0f), Float.valueOf(0.0f)));
            ((C49596h) this.f111109a.mo24388a("RecordBottomTabScene")).mo97507a((Animation) alphaAnimation);
            ((C49860a) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49860a.class)).mo97686a((Animation) alphaAnimation);
        } else if (qVar.f119489a == 0) {
            mo89408a(qVar.f119490b);
        } else if (qVar.f119489a != 8 || !qVar.f119491c) {
            mo89409b(qVar.f119490b);
        } else {
            final boolean z2 = qVar.f119490b;
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(150);
            alphaAnimation2.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C43863gb.this.mo89409b(z2);
                }
            });
            if (this.f111111c == null) {
                this.f111111c = C49608a.m107072a(this.f111109a.mo87882I());
            }
            this.f111111c.mo97513a(0.0f, 1.0f);
            ((C49784a) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49784a.class)).mo97640a(new C52847n(Float.valueOf(0.0f), Float.valueOf(1.0f)));
            ((C49596h) this.f111109a.mo24388a("RecordBottomTabScene")).mo97507a((Animation) alphaAnimation2);
            C49860a aVar = (C49860a) ApiCenter.m7844a(this.f111109a.mo87882I()).mo7339a(C49860a.class);
            aVar.mo97697e();
            aVar.mo97686a((Animation) alphaAnimation2);
        }
    }
}

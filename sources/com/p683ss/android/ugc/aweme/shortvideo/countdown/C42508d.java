package com.p683ss.android.ugc.aweme.shortvideo.countdown;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.ContentResolver;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.p683ss.android.ugc.aweme.shortvideo.countdown.C42536j.C42537a;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.d */
public final class C42508d implements AnimatorListener, C42536j {

    /* renamed from: a */
    private C42537a f107505a;

    /* renamed from: b */
    private C42535i f107506b;

    /* renamed from: c */
    private FrameLayout f107507c;

    /* renamed from: d */
    private LottieAnimationView f107508d;

    /* renamed from: e */
    private int f107509e;

    /* renamed from: f */
    private boolean f107510f;

    /* renamed from: b */
    public final boolean mo86722b() {
        return this.f107510f;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    /* renamed from: a */
    public final void mo86720a() {
        if (this.f107508d != null && this.f107507c != null && this.f107508d.mo6660e()) {
            this.f107508d.mo6661f();
            this.f107508d.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f107506b.mo86717a(this.f107509e);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f107510f = false;
        C47625i.m103103a("record cound down onAnimationCancel() called");
        this.f107505a.mo86753c();
        this.f107506b.mo86718b();
    }

    public final void onAnimationEnd(Animator animator) {
        C47625i.m103103a("record cound down onAnimationEnd() called");
        this.f107510f = false;
        if (!(this.f107508d == null || this.f107507c == null || !this.f107508d.mo6660e())) {
            this.f107508d.setVisibility(8);
        }
        this.f107505a.mo86752b();
        this.f107506b.mo86718b();
    }

    /* renamed from: a */
    public final void mo86721a(int i) {
        String str;
        float f;
        float f2;
        float f3;
        this.f107509e = i;
        this.f107510f = true;
        this.f107505a.mo86751a();
        this.f107508d = (LottieAnimationView) LayoutInflater.from(this.f107507c.getContext()).inflate(R.layout.agd, this.f107507c, false);
        this.f107507c.addView(this.f107508d);
        this.f107508d.mo6659d();
        this.f107508d.mo6652a((AnimatorListener) this);
        LottieAnimationView lottieAnimationView = this.f107508d;
        if (i == 3) {
            str = "countdown_3_lottie.json";
        } else {
            str = "countdown_10_lottie.json";
        }
        lottieAnimationView.setAnimation(str);
        this.f107508d.mo6654b();
        this.f107508d.setVisibility(0);
        ContentResolver contentResolver = this.f107507c.getContext().getContentResolver();
        if (contentResolver != null) {
            if (VERSION.SDK_INT >= 17) {
                f3 = Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                f2 = Global.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                f = Global.getFloat(contentResolver, "window_animation_scale", 1.0f);
            } else {
                f3 = System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
                f2 = System.getFloat(contentResolver, "transition_animation_scale", 1.0f);
                f = System.getFloat(contentResolver, "window_animation_scale", 1.0f);
            }
            StringBuilder sb = new StringBuilder("anim_duration_scale =");
            sb.append(f3);
            C47625i.m103103a(sb.toString());
            StringBuilder sb2 = new StringBuilder("transition_anim_scale =");
            sb2.append(f2);
            C47625i.m103103a(sb2.toString());
            StringBuilder sb3 = new StringBuilder("window_anim_scale =");
            sb3.append(f);
            C47625i.m103103a(sb3.toString());
        }
    }

    public C42508d(FrameLayout frameLayout, C42537a aVar, C42535i iVar) {
        this.f107507c = frameLayout;
        this.f107505a = aVar;
        this.f107506b = iVar;
    }
}

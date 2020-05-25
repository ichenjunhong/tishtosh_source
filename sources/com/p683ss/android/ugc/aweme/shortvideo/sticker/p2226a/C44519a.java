package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43524k;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c.C44524a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a */
public final class C44519a implements C44523c {

    /* renamed from: a */
    public final C43524k f112655a;

    /* renamed from: b */
    private AnimatorSet f112656b;

    /* renamed from: c */
    private ObjectAnimator f112657c;

    /* renamed from: d */
    private ObjectAnimator f112658d;

    /* renamed from: e */
    private float f112659e;

    /* renamed from: f */
    private final Context f112660f;

    /* renamed from: g */
    private final long f112661g = 200;

    /* renamed from: h */
    private final long f112662h = 200;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.a$a */
    public static final class C44520a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C44519a f112663a;

        /* renamed from: b */
        final /* synthetic */ boolean f112664b;

        /* renamed from: c */
        final /* synthetic */ View f112665c;

        /* renamed from: d */
        final /* synthetic */ C44524a f112666d;

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f112664b) {
                this.f112665c.setVisibility(0);
            }
            C44524a aVar = this.f112666d;
            if (aVar != null) {
                aVar.mo88582a();
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            if (!this.f112664b) {
                this.f112665c.setVisibility(8);
                C43524k kVar = this.f112663a.f112655a;
                if (kVar != null) {
                    kVar.dismiss();
                }
            }
            C44524a aVar = this.f112666d;
            if (aVar != null) {
                aVar.mo88583b();
            }
        }

        C44520a(C44519a aVar, boolean z, View view, C44524a aVar2) {
            this.f112663a = aVar;
            this.f112664b = z;
            this.f112665c = view;
            this.f112666d = aVar2;
        }
    }

    /* renamed from: b */
    private final void m97424b() {
        m97425c();
    }

    /* renamed from: c */
    private final void m97425c() {
        if (this.f112656b == null) {
            this.f112656b = new AnimatorSet();
            return;
        }
        AnimatorSet animatorSet = this.f112656b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f112656b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: a */
    public final void mo90457a() {
        AnimatorSet animatorSet = this.f112656b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f112656b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f112656b = null;
    }

    /* renamed from: a */
    public final void mo90458a(View view, int i, C44524a aVar) {
        C52711k.m112240b(view, "view");
        m97424b();
        m97423a(view, i, true, aVar);
    }

    /* renamed from: b */
    public final void mo90459b(View view, int i, C44524a aVar) {
        C52711k.m112240b(view, "view");
        m97424b();
        m97423a(view, i, false, aVar);
    }

    public C44519a(Context context, long j, long j2, C43524k kVar) {
        C52711k.m112240b(context, "context");
        this.f112660f = context;
        this.f112655a = kVar;
        this.f112659e = C9432q.m18687b(this.f112660f, 15.0f);
    }

    /* renamed from: a */
    private final void m97423a(View view, int i, boolean z, C44524a aVar) {
        float f;
        float f2;
        float f3;
        long j;
        String str = "alpha";
        float[] fArr = new float[2];
        float f4 = 1.0f;
        float f5 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (!z) {
            f4 = 0.0f;
        }
        fArr[1] = f4;
        this.f112657c = ObjectAnimator.ofFloat(view, str, fArr);
        if (i != 80) {
            f2 = C9432q.m18687b(this.f112660f, 15.0f);
        } else {
            f2 = -C9432q.m18687b(this.f112660f, 15.0f);
        }
        this.f112659e = f2;
        String str2 = "translationY";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = this.f112659e;
        } else {
            f3 = 0.0f;
        }
        fArr2[0] = f3;
        if (!z) {
            f5 = this.f112659e;
        }
        fArr2[1] = f5;
        this.f112658d = ObjectAnimator.ofFloat(view, str2, fArr2);
        AnimatorSet animatorSet = this.f112656b;
        if (animatorSet != null) {
            Builder play = animatorSet.play(this.f112657c);
            if (play != null) {
                play.with(this.f112658d);
            }
        }
        AnimatorSet animatorSet2 = this.f112656b;
        if (animatorSet2 != null) {
            if (z) {
                j = this.f112661g;
            } else {
                j = this.f112662h;
            }
            animatorSet2.setDuration(j);
        }
        AnimatorSet animatorSet3 = this.f112656b;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new C44520a(this, z, view, aVar));
        }
        AnimatorSet animatorSet4 = this.f112656b;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }
}

package com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C43524k;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.FixBubbleLayout;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2226a.C44523c.C44524a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b */
public final class C44521b implements C44523c {

    /* renamed from: a */
    public final C43524k f112667a;

    /* renamed from: b */
    private AnimatorSet f112668b;

    /* renamed from: c */
    private int f112669c;

    /* renamed from: d */
    private int f112670d;

    /* renamed from: e */
    private ObjectAnimator f112671e;

    /* renamed from: f */
    private ObjectAnimator f112672f;

    /* renamed from: g */
    private final boolean f112673g;

    /* renamed from: h */
    private final long f112674h;

    /* renamed from: i */
    private final long f112675i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.a.b$a */
    public static final class C44522a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C44521b f112676a;

        /* renamed from: b */
        final /* synthetic */ boolean f112677b;

        /* renamed from: c */
        final /* synthetic */ View f112678c;

        /* renamed from: d */
        final /* synthetic */ C44524a f112679d;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            if (!this.f112677b) {
                this.f112678c.setVisibility(8);
                this.f112676a.f112667a.dismiss();
            }
            C44524a aVar = this.f112679d;
            if (aVar != null) {
                aVar.mo88583b();
            }
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationStart(animator);
            if (this.f112677b) {
                this.f112678c.setVisibility(0);
            }
            C44524a aVar = this.f112679d;
            if (aVar != null) {
                aVar.mo88582a();
            }
        }

        C44522a(C44521b bVar, boolean z, View view, C44524a aVar) {
            this.f112676a = bVar;
            this.f112677b = z;
            this.f112678c = view;
            this.f112679d = aVar;
        }
    }

    /* renamed from: b */
    private final void m97431b() {
        if (this.f112668b == null) {
            this.f112668b = new AnimatorSet();
            return;
        }
        AnimatorSet animatorSet = this.f112668b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f112668b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    /* renamed from: a */
    public final void mo90457a() {
        AnimatorSet animatorSet = this.f112668b;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f112668b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f112668b = null;
    }

    /* renamed from: a */
    private final void m97429a(View view, int i) {
        m97431b();
        m97432b(view, i);
    }

    /* renamed from: b */
    private final void m97432b(View view, int i) {
        if (view instanceof FixBubbleLayout) {
            if (i == 3) {
                FixBubbleLayout fixBubbleLayout = (FixBubbleLayout) view;
                this.f112669c = (int) (fixBubbleLayout.getX() + ((float) fixBubbleLayout.getMeasuredWidth()));
                this.f112670d = (int) (fixBubbleLayout.getY() + fixBubbleLayout.getBubbleOffset());
            } else if (i == 5) {
                FixBubbleLayout fixBubbleLayout2 = (FixBubbleLayout) view;
                this.f112669c = (int) fixBubbleLayout2.getX();
                this.f112670d = (int) (fixBubbleLayout2.getY() + fixBubbleLayout2.getBubbleOffset());
            } else if (i == 48) {
                FixBubbleLayout fixBubbleLayout3 = (FixBubbleLayout) view;
                this.f112669c = (int) (fixBubbleLayout3.getX() + fixBubbleLayout3.getBubbleOffset());
                this.f112670d = (int) (fixBubbleLayout3.getY() + ((float) fixBubbleLayout3.getMeasuredHeight()));
            } else if (i == 80) {
                FixBubbleLayout fixBubbleLayout4 = (FixBubbleLayout) view;
                this.f112669c = (int) (fixBubbleLayout4.getX() + fixBubbleLayout4.getBubbleOffset());
                this.f112670d = (int) fixBubbleLayout4.getY();
            }
            FixBubbleLayout fixBubbleLayout5 = (FixBubbleLayout) view;
            fixBubbleLayout5.setPivotY((float) this.f112670d);
            fixBubbleLayout5.setPivotX((float) this.f112669c);
        }
    }

    /* renamed from: a */
    public final void mo90458a(View view, int i, C44524a aVar) {
        C52711k.m112240b(view, "view");
        m97429a(view, i);
        m97430a(view, true, aVar);
    }

    /* renamed from: b */
    public final void mo90459b(View view, int i, C44524a aVar) {
        C52711k.m112240b(view, "view");
        m97429a(view, i);
        m97430a(view, false, aVar);
    }

    /* renamed from: a */
    private final void m97430a(View view, boolean z, C44524a aVar) {
        float f;
        float f2;
        float f3;
        long j;
        String str = "scaleX";
        float[] fArr = new float[2];
        float f4 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        this.f112671e = ObjectAnimator.ofFloat(view, str, fArr);
        String str2 = "scaleY";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        this.f112672f = ObjectAnimator.ofFloat(view, str2, fArr2);
        AnimatorSet animatorSet = this.f112668b;
        if (animatorSet != null) {
            Builder play = animatorSet.play(this.f112671e);
            if (play != null) {
                play.with(this.f112672f);
            }
        }
        AnimatorSet animatorSet2 = this.f112668b;
        if (animatorSet2 != null) {
            if (z) {
                j = this.f112674h;
            } else {
                j = this.f112675i;
            }
            animatorSet2.setDuration(j);
        }
        if (this.f112673g) {
            AnimatorSet animatorSet3 = this.f112668b;
            if (animatorSet3 != null) {
                animatorSet3.setInterpolator(new OvershootInterpolator(1.0f));
            }
        }
        AnimatorSet animatorSet4 = this.f112668b;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new C44522a(this, z, view, aVar));
        }
        AnimatorSet animatorSet5 = this.f112668b;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public C44521b(boolean z, long j, long j2, C43524k kVar) {
        C52711k.m112240b(kVar, "popupWindow");
        this.f112673g = z;
        this.f112674h = j;
        this.f112675i = j2;
        this.f112667a = kVar;
    }
}

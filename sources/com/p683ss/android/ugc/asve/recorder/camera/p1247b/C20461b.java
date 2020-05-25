package com.p683ss.android.ugc.asve.recorder.camera.p1247b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ttve.utils.C20140a;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.p1241e.C20395f;
import com.p683ss.android.ugc.asve.p1241e.C20399j;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b */
public final class C20461b {

    /* renamed from: a */
    public boolean f56102a;

    /* renamed from: b */
    public final ASCameraView f56103b;

    /* renamed from: c */
    private final Context f56104c;

    /* renamed from: d */
    private final C20355c f56105d;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.b$a */
    public static final class C20462a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C20461b f56106a;

        /* renamed from: b */
        final /* synthetic */ ImageView f56107b;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f56106a.f56103b.removeView(this.f56107b);
            this.f56106a.f56102a = false;
        }

        C20462a(C20461b bVar, ImageView imageView) {
            this.f56106a = bVar;
            this.f56107b = imageView;
        }
    }

    /* renamed from: a */
    public final void mo43412a(int i, int i2) {
        if (!this.f56102a) {
            this.f56102a = true;
            ImageView imageView = new ImageView(this.f56104c);
            imageView.setImageResource(this.f56105d.mo43115g());
            imageView.setScaleType(ScaleType.CENTER_CROP);
            int a = (int) C20399j.m50606a(this.f56104c, 65.0f);
            LayoutParams layoutParams = new LayoutParams(a, a);
            layoutParams.leftMargin = (int) (((float) i) - (C20399j.m50606a(this.f56104c, 60.0f) / 2.0f));
            if (C20395f.m50601a(this.f56104c)) {
                layoutParams.rightMargin = (C20399j.m50607a(this.f56104c) - layoutParams.leftMargin) - a;
            }
            layoutParams.topMargin = i2 - (((int) C20399j.m50606a(this.f56104c, 60.0f)) / 2);
            if (layoutParams.leftMargin > C20399j.m50607a(this.f56104c) - a) {
                layoutParams.leftMargin = C20399j.m50607a(this.f56104c) - a;
            }
            if (C20395f.m50601a(this.f56104c) && layoutParams.rightMargin > C20399j.m50607a(this.f56104c) - a) {
                layoutParams.rightMargin = C20399j.m50607a(this.f56104c) - a;
            }
            if (layoutParams.leftMargin < 0) {
                layoutParams.leftMargin = 0;
            }
            if (C20395f.m50601a(this.f56104c) && layoutParams.rightMargin < 0) {
                layoutParams.rightMargin = 0;
            }
            if (layoutParams.topMargin > C20399j.m50608b(this.f56104c) - a) {
                layoutParams.topMargin = C20399j.m50608b(this.f56104c) - a;
            }
            if (layoutParams.topMargin < 0) {
                layoutParams.topMargin = 0;
            }
            imageView.setLayoutParams(layoutParams);
            this.f56103b.addView(imageView);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.SCALE_X, new float[]{1.0f, 1.1f, 0.95f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, View.SCALE_Y, new float[]{1.0f, 1.1f, 0.95f});
            ofFloat.addListener(new C20462a(this, imageView));
            C52711k.m112236a((Object) ofFloat, "animatorX");
            ofFloat.setInterpolator(new C20140a());
            C52711k.m112236a((Object) ofFloat2, "animatorY");
            ofFloat2.setInterpolator(new C20140a());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.setDuration(1500).start();
        }
    }

    public C20461b(Context context, ASCameraView aSCameraView, C20355c cVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aSCameraView, "rootView");
        C52711k.m112240b(cVar, "cameraContext");
        this.f56104c = context;
        this.f56103b = aSCameraView;
        this.f56105d = cVar;
    }
}

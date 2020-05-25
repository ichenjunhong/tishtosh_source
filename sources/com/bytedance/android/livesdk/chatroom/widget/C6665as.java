package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p030v4.view.p042b.C1027f;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.as */
public final class C6665as extends FrameLayout {

    /* renamed from: a */
    View f18184a;

    /* renamed from: b */
    public TextView f18185b;

    /* renamed from: c */
    public TextView f18186c;

    /* renamed from: d */
    public HSImageView f18187d;

    /* renamed from: e */
    public TextView f18188e;

    /* renamed from: f */
    public HSImageView f18189f;

    /* renamed from: g */
    public View f18190g;

    /* renamed from: h */
    View f18191h;

    /* renamed from: i */
    View f18192i;

    /* renamed from: j */
    public ImageView f18193j;

    /* renamed from: k */
    public TextView f18194k;

    /* renamed from: l */
    public TextView f18195l;

    /* renamed from: m */
    View f18196m;

    /* renamed from: n */
    public View f18197n;

    /* renamed from: o */
    public float f18198o;

    /* renamed from: p */
    public float f18199p;

    /* renamed from: q */
    public AnimatorSet f18200q;

    /* renamed from: r */
    private final float f18201r = 0.3272727f;

    /* renamed from: s */
    private final float f18202s = 0.375f;

    /* renamed from: t */
    private final int f18203t = ((int) C9432q.m18687b(C8830k.m17329c(), 32.0f));

    /* renamed from: u */
    private final int f18204u = 600;

    public C6665as(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(R.layout.bve, this, true);
        this.f18184a = findViewById(R.id.dz_);
        this.f18190g = findViewById(R.id.ewb);
        this.f18185b = (TextView) findViewById(R.id.f51);
        this.f18186c = (TextView) findViewById(R.id.f57);
        this.f18188e = (TextView) findViewById(R.id.f58);
        this.f18187d = (HSImageView) findViewById(R.id.eg_);
        this.f18189f = (HSImageView) findViewById(R.id.ega);
        this.f18191h = findViewById(R.id.f7o);
        this.f18192i = findViewById(R.id.f7r);
        this.f18193j = (ImageView) findViewById(R.id.ar5);
        this.f18194k = (TextView) findViewById(R.id.f27);
        this.f18195l = (TextView) findViewById(R.id.dh7);
        this.f18196m = findViewById(R.id.kn);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12796a(View view, float f) {
        if (view != null) {
            C9432q.m18679a(view, -3, (int) (f * ((float) this.f18203t)));
        }
    }

    /* renamed from: a */
    public final void mo12795a(int i, AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{0.0f, (float) i});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C1027f.m2954a(0.4f, 1.2f, 0.74f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(300);
        ofFloat2.setStartDelay(1233);
        this.f18184a.setPivotX(0.0f);
        this.f18184a.setPivotY(0.0f);
        this.f18196m.setPivotX(0.0f);
        this.f18196m.setPivotY(0.0f);
        ofFloat2.addUpdateListener(new C6667at(this));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f18184a, "alpha", new float[]{1.0f, 0.0f});
        ofFloat3.setDuration(100);
        ofFloat3.setStartDelay(1233);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f18190g, "translationX", new float[]{0.0f, -C9432q.m18687b(getContext(), 37.0f)});
        ofFloat4.setDuration(300);
        ofFloat4.setStartDelay(1233);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f18190g, "translationY", new float[]{0.0f, -C9432q.m18687b(getContext(), 30.0f)});
        ofFloat5.setDuration(300);
        ofFloat5.setStartDelay(1233);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f18197n, "alpha", new float[]{0.0f, 1.0f});
        ofFloat6.setDuration(200);
        ofFloat6.setStartDelay(1333);
        ofFloat6.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (C6665as.this.f18190g != null) {
                    C6665as.this.f18190g.setVisibility(0);
                }
            }
        });
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f18195l, "alpha", new float[]{0.0f, 1.0f});
        ofFloat7.setDuration(100);
        ofFloat7.setStartDelay(1433);
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat8.setStartDelay(1433);
        ofFloat8.setDuration(400);
        ofFloat8.addUpdateListener(new C6668au(this));
        this.f18200q = new AnimatorSet();
        this.f18200q.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8});
        this.f18200q.addListener(animatorListener);
        this.f18200q.start();
    }
}

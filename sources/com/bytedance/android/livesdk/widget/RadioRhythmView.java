package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

public class RadioRhythmView extends FrameLayout {

    /* renamed from: a */
    final float f23175a;

    /* renamed from: b */
    final float f23176b;

    /* renamed from: c */
    final float f23177c;

    /* renamed from: d */
    final float f23178d;

    /* renamed from: e */
    final float f23179e;

    /* renamed from: f */
    final int f23180f;

    /* renamed from: g */
    private AnimatorSet f23181g;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23181g.end();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        View findViewById = findViewById(R.id.av3);
        View findViewById2 = findViewById(R.id.av4);
        View findViewById3 = findViewById(R.id.av5);
        View findViewById4 = findViewById(R.id.av6);
        View findViewById5 = findViewById(R.id.av7);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, "scaleY", new float[]{1.0f, 1.47f, 1.0f, 0.588f, 1.0f});
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById3, "scaleY", new float[]{1.0f, 0.4f, 1.0f});
        ofFloat3.setRepeatCount(-1);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById4, "scaleY", new float[]{1.0f, 1.47f, 1.0f, 0.588f, 1.0f});
        ofFloat4.setRepeatCount(-1);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById5, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ofFloat5.setRepeatCount(-1);
        this.f23181g = new AnimatorSet();
        this.f23181g.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        this.f23181g.setInterpolator(linearInterpolator);
        this.f23181g.setDuration(800);
        this.f23181g.start();
    }

    public RadioRhythmView(Context context) {
        this(context, null);
    }

    public RadioRhythmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadioRhythmView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23175a = 1.0f;
        this.f23176b = 1.47f;
        this.f23177c = 2.5f;
        this.f23178d = 0.4f;
        this.f23179e = 0.588f;
        this.f23180f = 800;
        inflate(context, R.layout.ar7, this);
    }
}

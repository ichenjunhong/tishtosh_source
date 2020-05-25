package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.ChatDiggLayout */
public class ChatDiggLayout extends FrameLayout {

    /* renamed from: f */
    private static Drawable f87470f;

    /* renamed from: a */
    Queue<ImageView> f87471a;

    /* renamed from: b */
    int f87472b;

    /* renamed from: c */
    int f87473c;

    /* renamed from: d */
    Random f87474d;

    /* renamed from: e */
    private Context f87475e;

    public ChatDiggLayout(Context context) {
        this(context, null, 0);
    }

    public ChatDiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo71749a(float f, float f2) {
        final ImageView imageView;
        if (this.f87471a.isEmpty()) {
            imageView = new ImageView(this.f87475e);
            if (f87470f == null) {
                f87470f = C0726c.m2091a(this.f87475e, (int) R.drawable.d8o);
            }
        } else {
            imageView = (ImageView) this.f87471a.poll();
        }
        imageView.setImageDrawable(f87470f);
        LayoutParams layoutParams = new LayoutParams(this.f87473c, this.f87472b);
        layoutParams.setMargins((int) (f - ((float) (this.f87473c / 2))), (int) (f2 - ((float) this.f87472b)), 0, 0);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            addView(imageView);
        }
        float nextInt = (float) (this.f87474d.nextInt(20) - 10);
        imageView.setRotation(nextInt);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setDuration(300);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(500);
        animationSet2.setStartOffset(500);
        animationSet2.setFillAfter(true);
        animationSet2.setInterpolator(new DecelerateInterpolator());
        float nextInt2 = (((float) this.f87474d.nextInt(10)) + 20.0f) / 10.0f;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int b = (int) C9432q.m18687b(this.f87475e, 50.0f);
        float f3 = (float) (-(this.f87474d.nextInt(b) + b));
        double d = (double) f3;
        double d2 = (double) nextInt;
        Double.isNaN(d2);
        double tan = Math.tan((d2 * 3.141592653589793d) / 360.0d);
        Double.isNaN(d);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d * tan), 0.0f, f3);
        animationSet2.addAnimation(scaleAnimation2);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(animationSet2);
        imageView.startAnimation(animationSet);
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                ChatDiggLayout.this.post(new Runnable() {
                    public final void run() {
                        if (ChatDiggLayout.this.f87471a.size() < 3) {
                            ChatDiggLayout.this.f87471a.add(imageView);
                        }
                        imageView.setImageDrawable(null);
                        imageView.clearAnimation();
                        ChatDiggLayout.this.removeView(imageView);
                    }
                });
            }
        });
    }

    public ChatDiggLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f87471a = new LinkedList();
        this.f87472b = -1;
        this.f87473c = -1;
        this.f87475e = context;
        this.f87474d = new Random();
        this.f87473c = (int) C9432q.m18687b(context, 72.0f);
        this.f87472b = (int) C9432q.m18687b(context, 79.0f);
    }
}

package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.livesdk.chatroom.C4995b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

public class MTSlideUpGuideView extends ConstraintLayout {

    /* renamed from: h */
    private LottieAnimationView f18120h;

    /* renamed from: b */
    public final void mo12746b() {
        this.f18120h.mo6661f();
        animate().alpha(0.0f).setDuration(200).setListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (MTSlideUpGuideView.this.getParent() instanceof ViewGroup) {
                    ((ViewGroup) MTSlideUpGuideView.this.getParent()).removeView(MTSlideUpGuideView.this);
                }
            }
        }).start();
    }

    private MTSlideUpGuideView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m14037a(int i) {
        int i2;
        LottieAnimationView lottieAnimationView = this.f18120h;
        if (i == 1) {
            i2 = 2;
        } else {
            i2 = -1;
        }
        lottieAnimationView.setRepeatCount(i2);
        if (i == 1) {
            this.f18120h.mo6652a((AnimatorListener) new AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    MTSlideUpGuideView.this.mo12746b();
                }
            });
        }
        this.f18120h.mo6654b();
    }

    public MTSlideUpGuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static void m14038a(ViewGroup viewGroup, int i) {
        if (viewGroup != null && viewGroup.getContext() != null) {
            MTSlideUpGuideView mTSlideUpGuideView = new MTSlideUpGuideView(viewGroup.getContext());
            viewGroup.addView(mTSlideUpGuideView, -1, -1);
            mTSlideUpGuideView.m14037a(i);
            mTSlideUpGuideView.setAlpha(0.0f);
            mTSlideUpGuideView.animate().alpha(1.0f).setDuration(300).start();
            HashMap hashMap = new HashMap();
            hashMap.put("request_page", C4995b.m11478a().mo10874f());
            C8049c.m15979a().mo14202a("draw_guide_show", hashMap, Room.class, C8059j.class);
        }
    }

    public MTSlideUpGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.bx6, this);
        this.f18120h = (LottieAnimationView) findViewById(R.id.ew8);
        setBackgroundColor(Color.parseColor("#80000000"));
        setOnTouchListener(new C6658ap(this));
    }
}

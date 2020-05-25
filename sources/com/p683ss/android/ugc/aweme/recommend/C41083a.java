package com.p683ss.android.ugc.aweme.recommend;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.FansFollowUserBtn;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.a */
public final class C41083a {

    /* renamed from: a */
    public static final C41083a f104427a = new C41083a();

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$a */
    public static final class C41084a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f104428a;

        public C41084a(FansFollowUserBtn fansFollowUserBtn) {
            this.f104428a = fansFollowUserBtn;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                LayoutParams buttonLayoutParams = this.f104428a.getButtonLayoutParams();
                buttonLayoutParams.width = intValue;
                this.f104428a.setButtonLayoutParams(buttonLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.a$b */
    static final class C41085b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ FansFollowUserBtn f104429a;

        C41085b(FansFollowUserBtn fansFollowUserBtn) {
            this.f104429a = fansFollowUserBtn;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                LayoutParams buttonLayoutParams = this.f104429a.getButtonLayoutParams();
                buttonLayoutParams.width = intValue;
                this.f104429a.setButtonLayoutParams(buttonLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    private C41083a() {
    }

    /* renamed from: a */
    public final void mo83599a(Context context, FansFollowUserBtn fansFollowUserBtn, DmtTextView dmtTextView, int i, int i2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fansFollowUserBtn, "followUserBtn");
        C52711k.m112240b(dmtTextView, "dislikeBtn");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(fansFollowUserBtn, "followUserBtn");
        C52711k.m112240b(dmtTextView, "dislikeBtn");
        if (dmtTextView.getVisibility() != 0) {
            dmtTextView.setVisibility(0);
            fansFollowUserBtn.mo65360a(i, i2);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) C9432q.m18687b(context, 142.0f), (int) C9432q.m18687b(context, 68.0f)});
            C52711k.m112236a((Object) ofInt, "it");
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(300);
            C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(orig…tion = duration\n        }");
            ofInt.addUpdateListener(new C41085b(fansFollowUserBtn));
            ofInt.start();
        }
    }
}

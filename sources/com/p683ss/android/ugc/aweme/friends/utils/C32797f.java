package com.p683ss.android.ugc.aweme.friends.utils;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.utils.f */
public final class C32797f {

    /* renamed from: a */
    public static final C32797f f85398a = new C32797f();

    /* renamed from: com.ss.android.ugc.aweme.friends.utils.f$a */
    public static final class C32798a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f85399a;

        public C32798a(View view) {
            this.f85399a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f85399a;
                Context context = view.getContext();
                LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) (floatValue * C9432q.m18687b(context, 72.0f));
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    private C32797f() {
    }
}

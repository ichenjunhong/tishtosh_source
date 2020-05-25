package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35214b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ai */
public final class C33746ai extends C33805c {

    /* renamed from: u */
    public ImageView f87533u;

    /* renamed from: v */
    private Animation f87534v;

    /* renamed from: w */
    private AnimationListener f87535w = new AnimationListener() {
        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
        this.f87533u = (ImageView) mo71845a((int) R.id.cav);
    }

    /* renamed from: g */
    public final void mo71799g() {
        if (this.f87534v == null) {
            this.f87534v = C35214b.m79601a(800, this.f87535w);
        }
        this.f87533u.startAnimation(this.f87534v);
    }

    public C33746ai(View view, int i) {
        super(view, i);
    }
}

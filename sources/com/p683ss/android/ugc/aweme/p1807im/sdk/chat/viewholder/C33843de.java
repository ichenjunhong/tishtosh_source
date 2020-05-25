package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.AudioContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35214b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.de */
public final class C33843de extends C33842dd {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71779a() {
        super.mo71779a();
    }

    /* renamed from: a */
    public final void mo71783a(OnClickListener onClickListener) {
        super.mo71783a(onClickListener);
    }

    public C33843de(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public final void mo71780a(C11207p pVar, C11207p pVar2, AudioContent audioContent, int i) {
        this.f87712n = pVar;
        this.f87801x.mo71862a(this.f87712n);
        if (audioContent == null) {
            mo71786a(pVar, f87693q);
            this.f87799v.setText("");
            this.f87798u.setVisibility(8);
            mo71875b(1);
            this.f87712n.setMsgStatus(5);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
            alphaAnimation.setDuration(2000);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setFillBefore(false);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setRepeatMode(2);
            alphaAnimation.setRepeatCount(-1);
            this.f87708j.startAnimation(alphaAnimation);
            return;
        }
        super.mo71780a(pVar, pVar2, audioContent, i);
        this.f87798u.setVisibility(0);
        this.f87800w.setVisibility(8);
        C35214b.m79603a(this.f87708j);
    }
}

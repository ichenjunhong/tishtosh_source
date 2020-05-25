package com.p683ss.android.ugc.aweme.guide;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.guide.a */
final /* synthetic */ class C32929a implements C0011g {

    /* renamed from: a */
    private final LiveBroadcastWarn f85588a;

    C32929a(LiveBroadcastWarn liveBroadcastWarn) {
        this.f85588a = liveBroadcastWarn;
    }

    public final Object then(C0013i iVar) {
        LiveBroadcastWarn liveBroadcastWarn = this.f85588a;
        if (liveBroadcastWarn.f85583a == null) {
            return null;
        }
        liveBroadcastWarn.f85583a.setBackgroundResource(R.drawable.dht);
        Context context = liveBroadcastWarn.f85584b.getContext();
        if (context != null) {
            liveBroadcastWarn.f85583a.setVisibility(0);
            liveBroadcastWarn.f85583a.setLayerType(2, null);
            Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.f9);
            loadAnimation.setRepeatMode(2);
            loadAnimation.setRepeatCount(-1);
            loadAnimation.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    LiveBroadcastWarn.this.f85583a.setLayerType(0, null);
                }
            });
            liveBroadcastWarn.f85583a.startAnimation(loadAnimation);
        }
        C0013i.m12a(5000).mo20a((C0011g<TResult, TContinuationResult>) new C32937b<TResult,TContinuationResult>(liveBroadcastWarn), C0013i.f25b);
        return null;
    }
}

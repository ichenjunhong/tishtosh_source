package com.p683ss.android.ugc.aweme.photo.setfilter;

import android.transition.Transition;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.shortvideo.transition.C44893a;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.c */
final /* synthetic */ class C38711c implements Runnable {

    /* renamed from: a */
    private final EffectPhotoSetFilterActivity f98484a;

    /* renamed from: b */
    private final C31459g f98485b;

    C38711c(EffectPhotoSetFilterActivity effectPhotoSetFilterActivity, C31459g gVar) {
        this.f98484a = effectPhotoSetFilterActivity;
        this.f98485b = gVar;
    }

    public final void run() {
        EffectPhotoSetFilterActivity effectPhotoSetFilterActivity = this.f98484a;
        effectPhotoSetFilterActivity.getWindow().getSharedElementEnterTransition().addListener(new C44893a(this.f98485b) {

            /* renamed from: a */
            final /* synthetic */ C31459g f98469a;

            public final void onTransitionEnd(Transition transition) {
                EffectPhotoSetFilterActivity.this.f98458c.mo64513a(this.f98469a);
            }

            {
                this.f98469a = r2;
            }
        });
    }
}

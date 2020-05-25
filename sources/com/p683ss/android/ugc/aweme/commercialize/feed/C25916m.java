package com.p683ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.common.utility.C9432q;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.m */
final /* synthetic */ class C25916m implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f68453a;

    C25916m(CommerceVideoDelegate commerceVideoDelegate) {
        this.f68453a = commerceVideoDelegate;
    }

    public final void run() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68453a;
        commerceVideoDelegate.introContainer.setVisibility(8);
        commerceVideoDelegate.introContainer.setTranslationY(C9432q.m18687b(commerceVideoDelegate.f68308j, 15.0f));
    }
}

package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.o */
final /* synthetic */ class C25918o implements Runnable {

    /* renamed from: a */
    private final CommerceVideoDelegate f68455a;

    C25918o(CommerceVideoDelegate commerceVideoDelegate) {
        this.f68455a = commerceVideoDelegate;
    }

    public final void run() {
        CommerceVideoDelegate commerceVideoDelegate = this.f68455a;
        Context context = commerceVideoDelegate.f68308j;
        Aweme aweme = commerceVideoDelegate.f68301c;
        C26088l.m63322b(context, "play_15s", aweme, C26088l.m63373m(context, aweme, "play_15s"));
    }
}

package com.twitter.sdk.android.tweetui;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.twitter.sdk.android.tweetui.l */
final /* synthetic */ class C52304l implements OnClickListener {

    /* renamed from: a */
    private final C52270g f130251a;

    C52304l(C52270g gVar) {
        this.f130251a = gVar;
    }

    public final void onClick(View view) {
        C52270g gVar = this.f130251a;
        if (gVar.f130147d.getVisibility() == 0) {
            gVar.f130147d.setVisibility(8);
        } else {
            gVar.f130147d.setVisibility(0);
        }
    }
}

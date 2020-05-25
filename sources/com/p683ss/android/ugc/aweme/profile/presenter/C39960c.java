package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.c */
final /* synthetic */ class C39960c implements C2205y {

    /* renamed from: a */
    private final C39958b f101875a;

    /* renamed from: b */
    private final String f101876b;

    C39960c(C39958b bVar, String str) {
        this.f101875a = bVar;
        this.f101876b = str;
    }

    public final void subscribe(C2204x xVar) {
        FeedItemList b = this.f101875a.mo81864b(this.f101876b);
        if (b == null) {
            b = new FeedItemList();
        }
        b.hasMore = 0;
        xVar.mo6282a(b);
    }
}

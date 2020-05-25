package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.d */
public final /* synthetic */ class C39961d implements C2205y {

    /* renamed from: a */
    private final C39958b f101877a;

    /* renamed from: b */
    private final String f101878b;

    /* renamed from: c */
    private final Aweme f101879c;

    public C39961d(C39958b bVar, String str, Aweme aweme) {
        this.f101877a = bVar;
        this.f101878b = str;
        this.f101879c = aweme;
    }

    public final void subscribe(C2204x xVar) {
        C39958b bVar = this.f101877a;
        String str = this.f101878b;
        Aweme aweme = this.f101879c;
        FeedItemList b = bVar.mo81864b(str);
        if (b != null && b.getItems() != null) {
            C31190f.m72832a(b.getItems(), aweme, null);
            bVar.mo81861a(b, str);
        }
    }
}

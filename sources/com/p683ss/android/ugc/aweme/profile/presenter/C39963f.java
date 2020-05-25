package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.f */
final /* synthetic */ class C39963f implements C2205y {

    /* renamed from: a */
    private final C39958b f101883a;

    /* renamed from: b */
    private final String f101884b;

    /* renamed from: c */
    private final Aweme f101885c;

    C39963f(C39958b bVar, String str, Aweme aweme) {
        this.f101883a = bVar;
        this.f101884b = str;
        this.f101885c = aweme;
    }

    public final void subscribe(C2204x xVar) {
        C39958b bVar = this.f101883a;
        String str = this.f101884b;
        Aweme aweme = this.f101885c;
        FeedItemList b = bVar.mo81864b(str);
        if (b == null) {
            b = new FeedItemList();
        }
        if (b.getItems() == null) {
            b.items = new ArrayList(1);
        }
        b.getItems().add(0, aweme);
        bVar.mo81861a(b, str);
    }
}

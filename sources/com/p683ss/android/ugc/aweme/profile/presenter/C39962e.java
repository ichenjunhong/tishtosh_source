package com.p683ss.android.ugc.aweme.profile.presenter;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import java.util.Collection;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.e */
final /* synthetic */ class C39962e implements C2205y {

    /* renamed from: a */
    private final C39958b f101880a;

    /* renamed from: b */
    private final String f101881b;

    /* renamed from: c */
    private final Collection f101882c;

    C39962e(C39958b bVar, String str, Collection collection) {
        this.f101880a = bVar;
        this.f101881b = str;
        this.f101882c = collection;
    }

    public final void subscribe(C2204x xVar) {
        C39958b bVar = this.f101880a;
        String str = this.f101881b;
        Collection<Aweme> collection = this.f101882c;
        FeedItemList b = bVar.mo81864b(str);
        if (b != null && b.getItems() != null) {
            for (Aweme a : collection) {
                C31190f.m72832a(b.getItems(), a, null);
            }
            bVar.mo81861a(b, str);
        }
    }
}

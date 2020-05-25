package com.bytedance.android.livesdk.feed.p331a;

import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.Media;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.a.i */
public final /* synthetic */ class C6820i implements C1710e {

    /* renamed from: a */
    private final C6812e f18705a;

    public C6820i(C6812e eVar) {
        this.f18705a = eVar;
    }

    public final void accept(Object obj) {
        C6812e eVar = this.f18705a;
        FeedItem feedItem = (FeedItem) obj;
        eVar.f18686l = true;
        if (feedItem != null && (feedItem.item instanceof Media)) {
            eVar.f18675a.mo12997c();
        }
        if (eVar.f18683i != null) {
            eVar.f18683i.mo13013a(feedItem);
        }
    }
}

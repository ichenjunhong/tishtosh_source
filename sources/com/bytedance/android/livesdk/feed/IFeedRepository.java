package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.C0184k;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.C3945b;
import com.bytedance.android.livesdk.feed.feed.C6940a;
import com.bytedance.android.livesdk.feed.feed.C6941b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p094l.C2180b;

public interface IFeedRepository extends ItemRepository<FeedItem> {

    /* renamed from: com.bytedance.android.livesdk.feed.IFeedRepository$a */
    public interface C6800a {
        /* renamed from: a */
        FeedDataKey mo12978a();

        /* renamed from: b */
        int mo12979b();

        /* renamed from: c */
        int mo12980c();
    }

    /* renamed from: a */
    C2180b<Object> mo12968a();

    /* renamed from: a */
    C6940a<C3945b<FeedItem>, C6941b> mo12969a(String str);

    /* renamed from: a */
    void mo12970a(C0184k kVar);

    /* renamed from: a */
    void mo12971a(C6800a aVar);

    /* renamed from: a */
    void mo12972a(String str, String str2);

    /* renamed from: a */
    void mo12973a(boolean z);

    /* renamed from: b */
    C2201v<String> mo12974b();

    /* renamed from: c */
    C2201v<List<ImageModel>> mo12975c();

    /* renamed from: d */
    void mo12976d();

    /* renamed from: e */
    C6957i mo12977e();
}

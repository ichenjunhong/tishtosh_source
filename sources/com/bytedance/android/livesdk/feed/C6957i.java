package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.feed.feed.C6944e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.i */
public interface C6957i extends C7008k {

    /* renamed from: com.bytedance.android.livesdk.feed.i$a */
    public interface C6958a {
        /* renamed from: a */
        void mo13148a(String str);
    }

    /* renamed from: a */
    ItemRepository mo13096a(FeedDataKey feedDataKey);

    /* renamed from: a */
    void mo13097a();

    /* renamed from: a */
    void mo13098a(FeedDataKey feedDataKey, ItemRepository itemRepository);

    /* renamed from: a */
    void mo13099a(FeedDataKey feedDataKey, String str);

    /* renamed from: a */
    void mo13100a(C6944e eVar);

    /* renamed from: a */
    void mo13101a(C6958a aVar);

    /* renamed from: a */
    void mo13102a(String str, List<FeedItem> list, C2974a aVar, boolean z);

    /* renamed from: b */
    void mo13104b(C6944e eVar);

    /* renamed from: b */
    void mo13105b(C6958a aVar);

    /* renamed from: b */
    boolean mo13106b(FeedDataKey feedDataKey, ItemRepository itemRepository);
}

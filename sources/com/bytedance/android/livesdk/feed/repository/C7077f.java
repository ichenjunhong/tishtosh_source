package com.bytedance.android.livesdk.feed.repository;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p222a.C3823n;
import com.bytedance.android.live.core.p230g.C3912s;

/* renamed from: com.bytedance.android.livesdk.feed.repository.f */
final /* synthetic */ class C7077f implements C3823n {

    /* renamed from: a */
    private final String f19281a;

    C7077f(String str) {
        this.f19281a = str;
    }

    /* renamed from: a */
    public final boolean mo9194a(Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        return (feedItem == null || feedItem.item == null || !TextUtils.equals(C3912s.m9889a(feedItem.item.getMixId()), C3912s.m9889a(this.f19281a))) ? false : true;
    }
}

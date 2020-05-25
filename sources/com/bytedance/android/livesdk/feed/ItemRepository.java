package com.bytedance.android.livesdk.feed;

import android.arch.lifecycle.C0183j;
import com.bytedance.android.live.base.model.feed.FeedItem;
import java.util.List;

public interface ItemRepository<T extends FeedItem> extends C0183j {
    /* renamed from: b */
    void mo12981b(String str);

    /* renamed from: c */
    T mo12982c(String str);

    /* renamed from: f */
    List<T> mo12983f();

    /* renamed from: g */
    void mo12984g();
}

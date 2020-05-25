package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.C2990d;
import com.bytedance.android.livesdk.feed.repository.FeedRepository.C7070a;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.repository.p */
final /* synthetic */ class C7087p implements C1710e {

    /* renamed from: a */
    private final C7070a f19292a;

    C7087p(C7070a aVar) {
        this.f19292a = aVar;
    }

    public final void accept(Object obj) {
        C7070a aVar = this.f19292a;
        Pair pair = (Pair) obj;
        if (pair != null && !C9414h.m18630a((List) pair.first)) {
            ArrayList arrayList = new ArrayList();
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || feedItem.item == null || !(feedItem.item instanceof C2990d) || ((C2990d) feedItem.item).getVideoModel() == null || ((C2990d) feedItem.item).getVideoModel().getCoverModel() == null)) {
                    arrayList.add(((C2990d) feedItem.item).getVideoModel().getCoverModel());
                }
            }
            aVar.f19269j.onNext(arrayList);
        }
    }
}

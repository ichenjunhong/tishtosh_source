package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.common.utility.C9414h;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.feed.repository.o */
final /* synthetic */ class C7086o implements C1710e {

    /* renamed from: a */
    static final C1710e f19291a = new C7086o();

    private C7086o() {
    }

    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && !C9414h.m18630a((List) pair.first)) {
            for (FeedItem feedItem : (List) pair.first) {
                if (((C2974a) pair.second).mo7693a() != null) {
                    feedItem.logPb = ((C2974a) pair.second).mo7693a().toString();
                }
            }
        }
    }
}

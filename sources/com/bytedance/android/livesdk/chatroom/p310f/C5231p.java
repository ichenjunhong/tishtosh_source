package com.bytedance.android.livesdk.chatroom.p310f;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.common.utility.C9414h;
import java.util.List;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.p */
public final /* synthetic */ class C5231p implements C1710e {

    /* renamed from: a */
    public static final C1710e f13958a = new C5231p();

    private C5231p() {
    }

    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && !C9414h.m18630a((List) pair.first) && pair.second != null) {
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || ((C2974a) pair.second).mo7693a() == null)) {
                    feedItem.logPb = ((C2974a) pair.second).mo7693a().toString();
                }
            }
        }
    }
}

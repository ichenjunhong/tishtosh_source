package com.bytedance.android.livesdk.chatroom.p310f;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.f.o */
public final /* synthetic */ class C5230o implements C1711f {

    /* renamed from: a */
    public static final C1711f f13957a = new C5230o();

    private C5230o() {
    }

    public final Object apply(Object obj) {
        C4172a aVar = (C4172a) obj;
        ArrayList<FeedItem> arrayList = new ArrayList<>(aVar.f11365b);
        C5225j.m11847a((List<FeedItem>) arrayList);
        if (!C9414h.m18630a(arrayList)) {
            for (FeedItem a : arrayList) {
                C5225j.m11846a(a);
            }
        }
        return Pair.create(arrayList, aVar.f11366c);
    }
}

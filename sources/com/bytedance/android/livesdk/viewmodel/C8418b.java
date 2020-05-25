package com.bytedance.android.livesdk.viewmodel;

import android.util.Pair;
import com.bytedance.android.live.base.model.feed.C2974a;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.chatroom.model.C5749g;
import java.util.ArrayList;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.viewmodel.b */
final /* synthetic */ class C8418b implements C1711f {

    /* renamed from: a */
    static final C1711f f22868a = new C8418b();

    private C8418b() {
    }

    public final Object apply(Object obj) {
        C4175b bVar = (C4175b) obj;
        if (bVar == null || bVar.extra == null || bVar.data == null) {
            return Pair.create(new ArrayList(), new C2974a());
        }
        ((C2974a) bVar.extra).hasMore = ((C5749g) bVar.data).f15112a;
        return Pair.create(((C5749g) bVar.data).f15113b, bVar.extra);
    }
}

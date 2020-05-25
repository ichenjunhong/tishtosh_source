package com.bytedance.android.livesdk;

import com.bytedance.android.livesdk.live.model.C7759c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.livesdk.h */
final /* synthetic */ class C7655h implements C1715j {

    /* renamed from: a */
    private final Map f21086a;

    C7655h(Map map) {
        this.f21086a = map;
    }

    /* renamed from: a */
    public final boolean mo6207a(Object obj) {
        Map map = this.f21086a;
        String valueOf = String.valueOf(((Room) obj).getId());
        return map.containsKey(valueOf) && !((C7759c) map.get(valueOf)).f21333b;
    }
}

package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.p399o.C8049c;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.c */
final /* synthetic */ class C5130c implements C1710e {

    /* renamed from: a */
    private final Map f13719a;

    C5130c(Map map) {
        this.f13719a = map;
    }

    public final void accept(Object obj) {
        Map map = this.f13719a;
        map.putAll((Map) obj);
        C8049c.m15979a().mo14202a("live_show", map, new Object[0]);
    }
}

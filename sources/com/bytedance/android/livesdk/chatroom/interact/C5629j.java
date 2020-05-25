package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.j */
public final class C5629j {
    /* renamed from: a */
    public static void m12529a() {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        C8049c.m15979a().mo14202a("guest_connection_anchor", hashMap, Room.class);
    }

    /* renamed from: a */
    public static void m12530a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "show");
        hashMap.put("request_page", str);
        C8049c.m15979a().mo14202a("guest_connection", hashMap, Room.class);
    }

    /* renamed from: b */
    public static void m12531b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("request_page", str);
        C8049c.m15979a().mo14202a("guest_connection", hashMap, Room.class);
    }
}

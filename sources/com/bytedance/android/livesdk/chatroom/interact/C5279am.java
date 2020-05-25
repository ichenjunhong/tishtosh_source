package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.am */
public final class C5279am {

    /* renamed from: a */
    private static String f14133a;

    /* renamed from: b */
    private static long f14134b;

    /* renamed from: c */
    private static String f14135c;

    /* renamed from: d */
    private static long f14136d;

    /* renamed from: c */
    private static void m11945c() {
        f14134b = 0;
        f14133a = null;
        f14135c = null;
        f14136d = 0;
    }

    /* renamed from: a */
    public static void m11943a() {
        f14134b = System.currentTimeMillis();
        LinkCrossRoomDataHolder a = LinkCrossRoomDataHolder.m11103a();
        a.f12633x = f14134b;
        if (a.f12627r == 2) {
            if (a.f12628s == 1) {
                f14133a = "non_connection_screen_match";
            } else {
                f14133a = "non_connection_screen";
            }
        } else if (a.f12619j <= 0) {
            f14133a = "anchor";
        } else {
            f14133a = "pk";
        }
        if (a.f12627r == 0) {
            f14135c = "manual";
        } else {
            f14135c = "random";
        }
        f14136d = a.f12614e;
    }

    /* renamed from: b */
    public static void m11944b() {
        if (f14134b != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - f14134b) / 1000));
            if (LinkCrossRoomDataHolder.m11103a().f12627r == 2 && LinkCrossRoomDataHolder.m11103a().f12606A != null) {
                hashMap.put("right_user_id", String.valueOf(LinkCrossRoomDataHolder.m11103a().f12606A.getId()));
                LinkCrossRoomDataHolder.m11103a().f12614e = LinkCrossRoomDataHolder.m11103a().f12606A.getId();
            }
            C8056g gVar = new C8056g();
            if (LinkCrossRoomDataHolder.m11103a().f12627r == 0) {
                gVar.mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
            }
            C8049c.m15979a().mo14202a("livesdk_connection_watch_duration", hashMap, Room.class, new C8059j(), LinkCrossRoomDataHolder.m11103a().mo10411b(), gVar);
            m11945c();
        }
    }
}

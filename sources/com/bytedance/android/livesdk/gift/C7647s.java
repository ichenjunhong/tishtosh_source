package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.s */
public final class C7647s {
    /* renamed from: a */
    public static void m15651a(long j, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        hashMap.put("error_msg", str2);
        C3837e.m9743a(m15643a("ttlive_gift_icon_load_status"), 1, (Map<String, Object>) hashMap);
        C3837e.m9743a(m15652b("ttlive_gift_icon_load_status"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_icon_load_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static String m15643a(String str) {
        return C3836d.m9734a(str);
    }

    /* renamed from: b */
    public static String m15652b(String str) {
        return C3836d.m9735b(str);
    }

    /* renamed from: c */
    public static void m15655c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", str);
        C3837e.m9741a(m15643a("ttlive_gift_list_status"), 1, 0, (Map<String, Object>) hashMap);
        C3837e.m9743a(m15652b("ttlive_gift_list_status"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_list_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m15644a(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_page_type", Integer.valueOf(i));
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
            hashMap.put("room_id", Long.valueOf(currentRoom.getId()));
        }
        C3837e.m9743a(m15643a("ttlive_gift_panel_red_dot_show"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m15650a(long j, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("gift_icon_url", str);
        C3837e.m9743a(m15643a("ttlive_gift_icon_load_status"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m15645a(long j, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("asset_id", Long.valueOf(j));
        hashMap.put("source_type", Integer.valueOf(i));
        C3837e.m9743a(m15643a("ttlive_gift_asset_download_source"), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m15653b(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("prop_id", Long.valueOf(j));
        C3837e.m9741a(m15643a("ttlive_prop_send_status"), 0, j3, (Map<String, Object>) hashMap);
    }

    /* renamed from: b */
    public static void m15654b(long j, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("prop_id", Long.valueOf(j));
        if (th instanceof C2944a) {
            hashMap.put("error_code", Integer.valueOf(((C2944a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        hashMap.put("error_msg", th.getMessage());
        C3837e.m9741a(m15643a("ttlive_prop_send_status"), 1, 0, (Map<String, Object>) hashMap);
        C3837e.m9743a(m15652b("ttlive_prop_send_status"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_prop_send_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m15648a(long j, long j2, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3837e.m9741a(m15643a("ttlive_gift_send_status"), 0, j3, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m15649a(long j, long j2, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        if (th instanceof C2944a) {
            hashMap.put("error_code", Integer.valueOf(((C2944a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
        }
        C3837e.m9741a(m15643a("ttlive_gift_send_status"), 1, 0, (Map<String, Object>) hashMap);
        C3837e.m9743a(m15652b("ttlive_gift_send_status"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_gift_send_status", 1, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m15646a(long j, long j2, int i, String str, long j3) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("count", Integer.valueOf(i));
        hashMap.put("send_gift_position", str);
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        C3837e.m9741a(m15643a("ttlive_cny_gift_send_status"), 0, j3, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_cny_gift_send_status", 0, (Map) hashMap);
    }

    /* renamed from: a */
    public static void m15647a(long j, long j2, int i, String str, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        hashMap.put("gift_id", Long.valueOf(j));
        hashMap.put("count", Integer.valueOf(i));
        hashMap.put("send_gift_position", str);
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
        }
        if (th instanceof C2944a) {
            hashMap.put("error_code", Integer.valueOf(((C2944a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", Integer.valueOf(0));
        }
        if (th != null) {
            hashMap.put("error_msg", th.getMessage());
        }
        C3837e.m9741a(m15643a("ttlive_cny_gift_send_status"), 1, 0, (Map<String, Object>) hashMap);
        C3837e.m9743a(m15652b("ttlive_cny_gift_send_status"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_cny_gift_send_status", 1, (Map) hashMap);
    }
}

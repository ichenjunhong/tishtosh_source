package com.bytedance.android.livesdk.p399o.p401b;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.o.b.n */
public final class C8045n extends C8032a<Room> {

    /* renamed from: a */
    public Map<String, String> f21979a = new HashMap();

    /* renamed from: b */
    public String f21980b;

    /* renamed from: c */
    public long f21981c;

    /* renamed from: d */
    private Map<String, String> f21982d = new HashMap();

    /* renamed from: e */
    private Map<String, String> f21983e = new HashMap();

    /* renamed from: a */
    public final void mo14197a(Room room) {
        if (room != null) {
            this.f21979a.clear();
            this.f21980b = String.valueOf(room.getId());
            m15969a(mo14192a(), room);
        }
    }

    /* renamed from: b */
    public final String mo14199b(String str) {
        if (this.f21982d.containsKey(str)) {
            return (String) this.f21982d.get(str);
        }
        return "";
    }

    /* renamed from: c */
    public final String mo14200c(String str) {
        if (this.f21983e.containsKey(str)) {
            return (String) this.f21983e.get(str);
        }
        return "";
    }

    /* renamed from: a */
    public final void mo14195a(Map<String, String> map) {
        super.mo14195a(map);
        if (this.f21980b != null) {
            String str = (String) this.f21983e.get(this.f21980b);
            if (str != null) {
                map.put("request_id", str);
            }
            String str2 = (String) this.f21982d.get(this.f21980b);
            if (str2 != null) {
                map.put("log_pb", str2);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14196a(Map map, Object obj) {
        Room room = (Room) obj;
        if (room != null) {
            m15969a(map, room);
        }
    }

    /* renamed from: a */
    private void m15969a(Map<String, String> map, Room room) {
        String str;
        if (room != null) {
            if (this.f21979a.size() > 0) {
                map.putAll(this.f21979a);
            }
            if (room.getId() != 0) {
                map.put("room_id", String.valueOf(room.getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                map.put("request_id", room.getRequestId());
            }
            if (!TextUtils.isEmpty(room.getLog_pb())) {
                map.put("log_pb", room.getLog_pb());
            } else {
                map.remove("log_pb");
            }
            if (room.getOwner() != null) {
                map.put("anchor_id", String.valueOf(room.getOwner().getId()));
            } else {
                map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            }
            if (!TextUtils.isEmpty(room.getSourceType())) {
                map.put("moment_room_source", room.getSourceType());
            }
            String str2 = "live_type";
            if (room.isLiveTypeAudio()) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            map.put(str2, str);
        }
    }

    /* renamed from: a */
    public final void mo14198a(String str, String str2, String str3) {
        this.f21982d.put(str, str2);
        this.f21983e.put(str, str3);
    }
}

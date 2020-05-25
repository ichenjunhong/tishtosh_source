package com.bytedance.android.livesdk.commerce;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p445e.C8733c;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.commerce.a */
public final class C6704a implements C8733c {

    /* renamed from: a */
    public HashMap<String, String> f18281a = new HashMap<>();

    public C6704a(Room room) {
        String str;
        boolean z;
        String str2;
        HashMap<String, String> hashMap = this.f18281a;
        String str3 = "room_id";
        if (room == null) {
            str = "0";
        } else {
            str = String.valueOf(room.getId());
        }
        hashMap.put(str3, str);
        if (room != null) {
            if (room.getOwner() != null) {
                this.f18281a.put("anchor_id", String.valueOf(room.getOwner().getId()));
            }
            if (!TextUtils.isEmpty(room.getRequestId())) {
                this.f18281a.put("request_id", room.getRequestId());
            }
            HashMap<String, String> hashMap2 = this.f18281a;
            String str4 = "follow_status";
            if (room == null || room.getOwner() == null) {
                z = false;
            } else {
                z = room.getOwner().isFollowing();
            }
            if (z) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap2.put(str4, str2);
        }
        this.f18281a.put("sdk_version", "1510");
        this.f18281a.put("_param_live_platform", CustomActionPushReceiver.f104061f);
    }
}

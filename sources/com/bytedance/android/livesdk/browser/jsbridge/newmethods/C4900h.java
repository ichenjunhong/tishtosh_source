package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.h */
public final class C4900h extends C10782e<Object, JSONObject> {
    /* renamed from: a */
    private static void m11410a(User user, JSONObject jSONObject) throws JSONException {
        jSONObject.put("short_id", user.getShortId());
        jSONObject.put("user_id", user.getId());
        jSONObject.put("sec_user_id", user.getSecUid());
        if (user.getAvatarThumb() != null) {
            jSONObject.put("avatar", user.getAvatarThumb().getUrls().get(0));
        }
        jSONObject.put("nickname", user.getNickName());
        jSONObject.put("user_level", user.getLevel());
        if (user.getAnchorInfo() != null) {
            jSONObject.put("anchor_level", user.getAnchorInfo().f8814a);
            jSONObject.put("anchor_type", user.getAnchorInfo().f8815b);
        }
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = new JSONObject();
        User from = User.from(TTLiveSDKContext.getHostService().mo10315h().mo14521a());
        JSONObject jSONObject2 = new JSONObject();
        m11410a(from, jSONObject2);
        jSONObject.put("user_info", jSONObject2);
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("room_id", currentRoom.getId());
            jSONObject.put("room_info", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            m11410a(currentRoom.getOwner(), jSONObject4);
            jSONObject.put("anchor_info", jSONObject4);
        }
        jSONObject.put("code", 1);
        return jSONObject;
    }
}

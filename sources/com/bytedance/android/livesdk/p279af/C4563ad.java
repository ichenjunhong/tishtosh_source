package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.af.ad */
public final class C4563ad {
    /* renamed from: a */
    public static void m10955a(Room room) {
        Context context = TTLiveSDKContext.getHostService().mo10308a().context();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
        } catch (JSONException unused) {
        }
        C8068g.m16014a(context);
        room.getOwner().getId();
        room.getId();
    }

    /* renamed from: a */
    public static void m10957a(Room room, boolean z, String str) {
        String str2;
        Context context = TTLiveSDKContext.getHostService().mo10308a().context();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            String str3 = "connection_type";
            if (z) {
                str2 = "live_type";
            } else {
                str2 = "voice_type";
            }
            jSONObject.put(str3, str2);
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
            jSONObject.put("request_id", room.getRequestId());
        } catch (JSONException unused) {
        }
        C8068g.m16014a(context);
        TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        room.getId();
    }

    /* renamed from: a */
    public static void m10956a(Room room, String str, String str2, boolean z) {
        Context context = TTLiveSDKContext.getHostService().mo10308a().context();
        if (z) {
            C8068g.m16014a(context);
            TTLiveSDKContext.getHostService().mo10315h().mo14529b();
            room.getId();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("request_id", room.getRequestId());
            jSONObject.put("log_pb", room.getLog_pb());
            jSONObject.put("source", room.getUserFrom());
        } catch (JSONException unused) {
        }
        C8068g.m16014a(context);
        TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        room.getId();
    }
}

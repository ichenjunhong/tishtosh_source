package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.schema.interfaces.C8264d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.schema.k */
public final class C8266k implements C8264d {
    public final boolean canHandle(Uri uri) {
        return TextUtils.equals("webcast_profile", uri.getHost());
    }

    public final boolean handle(Context context, Uri uri) {
        String queryParameter = uri.getQueryParameter("user_id");
        long j = 0;
        try {
            if (!TextUtils.isEmpty(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Throwable unused) {
        }
        String queryParameter2 = uri.getQueryParameter("sec_user_id");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(queryParameter2)) {
            hashMap.put("sec_user_id", queryParameter2);
        }
        return m16380a(j, uri.getQueryParameter("type"), hashMap);
    }

    /* renamed from: a */
    public static boolean m16380a(long j, String str, Map<String, String> map) {
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (j == 0) {
            j = TTLiveSDKContext.getHostService().mo10315h().mo14529b();
        }
        if (currentRoom == null || !TextUtils.equals(str, "half")) {
            TTLiveSDKContext.getHostService().mo10313f().mo14425a(j, map);
        } else {
            C4495a.m10823a().mo10301a((Object) new UserProfileEvent(j));
        }
        return true;
    }
}

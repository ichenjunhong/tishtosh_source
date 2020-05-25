package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C7866cg;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.er */
final /* synthetic */ class C6567er implements OnClickListener {

    /* renamed from: a */
    private final RoomPushWidget f17899a;

    /* renamed from: b */
    private final C7866cg f17900b;

    /* renamed from: c */
    private final String f17901c;

    C6567er(RoomPushWidget roomPushWidget, C7866cg cgVar, String str) {
        this.f17899a = roomPushWidget;
        this.f17900b = cgVar;
        this.f17901c = str;
    }

    public final void onClick(View view) {
        RoomPushWidget roomPushWidget = this.f17899a;
        C7866cg cgVar = this.f17900b;
        String str = this.f17901c;
        if (roomPushWidget.isViewValid()) {
            if (!TextUtils.isEmpty(cgVar.f21769c)) {
                try {
                    new JSONObject().put("trace_id", cgVar.f21769c);
                    C3009i a = TTLiveSDKContext.getHostService().mo10315h().mo14521a();
                    C8068g.m16014a(roomPushWidget.context);
                    if (a != null) {
                        a.getId();
                    }
                    roomPushWidget.f17551b.getId();
                } catch (JSONException unused) {
                }
            }
            String str2 = cgVar.f21777k;
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(roomPushWidget.f17551b.getOwnerUserId()));
            hashMap.put("room_id", String.valueOf(roomPushWidget.f17551b.getId()));
            hashMap.put(CustomActionPushReceiver.f104056a, str2);
            C8049c.m15979a().mo14202a("livesdk_bottom_message_click", hashMap, new Object[0]);
            roomPushWidget.mo12528a(str, cgVar.f21771e);
        }
    }
}

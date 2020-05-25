package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.m */
final /* synthetic */ class C6589m implements C1711f {

    /* renamed from: a */
    private final BottomRightBannerWidget f17928a;

    C6589m(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f17928a = bottomRightBannerWidget;
    }

    public final Object apply(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f17928a;
        String str = (String) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "refresh");
        jSONObject.put("data", str);
        JSONObject jSONObject2 = new JSONObject();
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        String str2 = "";
        String str3 = "";
        if (a instanceof C8042k) {
            C8042k kVar = (C8042k) a;
            if (kVar.mo14192a().containsKey("enter_from")) {
                kVar.mo14192a().get("enter_from");
            }
            if (kVar.mo14192a().containsKey("source")) {
                kVar.mo14192a().get("source");
            }
            HashMap hashMap = new HashMap();
            str2 = (String) hashMap.get("enter_from_merge");
            str3 = (String) hashMap.get("enter_method");
        }
        jSONObject2.put("enter_from_merge", str2).put("enter_method", str3).put("event_page", bottomRightBannerWidget.f16803c ? "live_take_detail" : "live_detail").put("room_id", String.valueOf(bottomRightBannerWidget.f16802b.getId())).put("anchor_id", String.valueOf(bottomRightBannerWidget.f16802b.getOwnerUserId())).put("request_id", bottomRightBannerWidget.f16802b.getRequestId()).put("log_pb", bottomRightBannerWidget.f16802b.getLog_pb());
        jSONObject.put("log", jSONObject2);
        return jSONObject;
    }
}

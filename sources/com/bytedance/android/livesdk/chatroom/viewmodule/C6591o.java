package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.p388k.C7709b;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.o */
final /* synthetic */ class C6591o implements C1710e {

    /* renamed from: a */
    private final BottomRightBannerWidget f17930a;

    C6591o(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f17930a = bottomRightBannerWidget;
    }

    public final void accept(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f17930a;
        if (obj instanceof C7709b) {
            C7709b bVar = (C7709b) obj;
            if (bVar != null && bVar.f21213a == 1) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", bVar.f21214b);
                    jSONObject.put("data", bVar.f21215c.toString());
                    if (bottomRightBannerWidget.f16804d != null) {
                        bottomRightBannerWidget.f16804d.mo10496a(bottomRightBannerWidget.f16801a, "H5_roomStatusChange", jSONObject);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}

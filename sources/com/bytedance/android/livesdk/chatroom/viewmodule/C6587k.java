package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.user.C3013l;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.k */
final /* synthetic */ class C6587k implements C1710e {

    /* renamed from: a */
    private final BottomRightBannerWidget f17926a;

    C6587k(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f17926a = bottomRightBannerWidget;
    }

    public final void accept(Object obj) {
        C3013l lVar;
        BottomRightBannerWidget bottomRightBannerWidget = this.f17926a;
        if (((C3013l) obj) != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            String str = "0";
            switch (lVar.f8853a) {
                case Login:
                    str = "1";
                    break;
                case Logout:
                    str = "2";
                    break;
                case Update:
                    str = "3";
                    break;
            }
            try {
                jSONObject2.put("code", str);
                jSONObject.put("args", jSONObject2);
                if (!(bottomRightBannerWidget.f16801a == null || bottomRightBannerWidget.f16801a.f12814b == null || bottomRightBannerWidget.f16801a.f12814b.mo10483a() == null)) {
                    bottomRightBannerWidget.f16801a.f12814b.mo10483a().mo19581a("H5_loginStatus", jSONObject);
                }
            } catch (JSONException unused) {
            }
        }
    }
}

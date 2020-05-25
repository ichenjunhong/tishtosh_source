package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.webkit.WebView;
import com.bytedance.android.live.core.p230g.C3913t;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.g */
final /* synthetic */ class C6583g implements C4702d {

    /* renamed from: a */
    private final BottomRightBannerWidget f17922a;

    C6583g(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f17922a = bottomRightBannerWidget;
    }

    /* renamed from: a */
    public final void mo8983a(WebView webView, String str) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f17922a;
        if (bottomRightBannerWidget.isViewValid() && webView != null) {
            webView.setVisibility(0);
            bottomRightBannerWidget.containerView.setVisibility(0);
            try {
                JSONObject jSONObject = new JSONObject();
                if (bottomRightBannerWidget.f16805e != null) {
                    jSONObject.put("data", C3913t.m9891a(bottomRightBannerWidget.f16805e.f15097a.f15102b));
                    jSONObject.put("type", "init");
                    bottomRightBannerWidget.f16804d.mo10496a(bottomRightBannerWidget.f16801a, "H5_roomStatusChange", jSONObject);
                    HashMap hashMap = new HashMap();
                    for (C8692a aVar : bottomRightBannerWidget.f16805e.f15097a.f15102b) {
                        hashMap.put("banner_id", String.valueOf(aVar.f23794a));
                        hashMap.put("request_page", "bottomright");
                        C8049c a = C8049c.m15979a();
                        String str2 = "livesdk_live_banner_show";
                        Object[] objArr = new Object[2];
                        objArr[0] = new C8059j().mo14213a(bottomRightBannerWidget.f16803c ? "live_take_detail" : "live_detail");
                        objArr[1] = Room.class;
                        a.mo14202a(str2, hashMap, objArr);
                    }
                    if (bottomRightBannerWidget.f16807g != null) {
                        bottomRightBannerWidget.f16807g.mo12577g();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}

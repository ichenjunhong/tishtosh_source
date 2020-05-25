package com.bytedance.android.live.broadcast.preview;

import android.webkit.WebView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4702d;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8692a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9431p;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.preview.u */
final /* synthetic */ class C3611u implements C4702d {

    /* renamed from: a */
    private final C3589i f10290a;

    C3611u(C3589i iVar) {
        this.f10290a = iVar;
    }

    /* renamed from: a */
    public final void mo8983a(WebView webView, String str) {
        C3589i iVar = this.f10290a;
        if (webView != null) {
            if (!(iVar.f10249g != null && iVar.f10249g.isShowing())) {
                webView.setVisibility(0);
            }
            if (iVar.f10261s == null || C9431p.m18664a(iVar.f10261s.f15101a) || C3914u.m9892a(iVar.f10261s.f15102b)) {
                webView.setVisibility(8);
                if (iVar.f10250h != null) {
                    iVar.f10250h.setVisibility(8);
                }
            } else if (iVar.f10260r != null && iVar.f10260r.f12813a == webView) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", C2942b.m8369a().mo34889b(iVar.f10261s.f15102b));
                    jSONObject.put("type", "init");
                    ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10496a(iVar.f10260r, "H5_roomStatusChange", jSONObject);
                    for (C8692a aVar : iVar.f10261s.f15102b) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("banner_id", String.valueOf(aVar.f23794a));
                        hashMap.put("request_page", "topleft");
                        C8049c.m15979a().mo14202a("livesdk_live_banner_show", hashMap, new C8059j().mo14213a("live_take_entrance"), Room.class);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}

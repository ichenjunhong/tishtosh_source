package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.e */
public final class C4779e implements C10762d {

    /* renamed from: a */
    private WeakReference<C4780a> f12996a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.e$a */
    public interface C4780a {
        /* renamed from: a */
        void mo10551a(long j);

        /* renamed from: a */
        void mo10553a(String str);

        /* renamed from: a */
        void mo10554a(String str, Object obj);

        /* renamed from: g */
        void mo10560g();
    }

    public C4779e(WeakReference<C4780a> weakReference) {
        this.f12996a = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (hVar.f28947d != null) {
            C4780a aVar = (C4780a) this.f12996a.get();
            String optString = hVar.f28947d.optString("type");
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != -1361632588) {
                if (hashCode == 24553548 && optString.equals("cashdesk")) {
                    c = 1;
                }
            } else if (optString.equals("charge")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    aVar.mo10553a(C3836d.m9734a(IWalletService.SERVICE_RECHARGE_WEBVIEW_LOAD_DETAIL));
                    break;
                case 1:
                    aVar.mo10553a(C3836d.m9734a("ttlive_charge_open_check_fe_detail"));
                    break;
            }
            if (hVar.f28947d.has("args")) {
                JSONObject optJSONObject = hVar.f28947d.optJSONObject("args");
                if (optJSONObject.has("first_loaded")) {
                    aVar.mo10560g();
                }
                if (optJSONObject.has("blank_duration")) {
                    long optLong = optJSONObject.optLong("blank_duration");
                    aVar.mo10554a("blank_duration", Long.valueOf(optLong));
                    aVar.mo10551a(optLong);
                }
                if (optJSONObject.has("interactive_duration")) {
                    aVar.mo10554a("interactive_duration", Long.valueOf(optJSONObject.optLong("interactive_duration")));
                }
                if (optJSONObject.has("finished_duration")) {
                    aVar.mo10554a("finished_duration", Long.valueOf(optJSONObject.optLong("finished_duration")));
                }
            }
        }
    }
}

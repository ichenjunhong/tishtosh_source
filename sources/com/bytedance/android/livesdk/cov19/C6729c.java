package com.bytedance.android.livesdk.cov19;

import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.livesdk.message.model.C7860ca;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.cov19.c */
final /* synthetic */ class C6729c implements C1710e {

    /* renamed from: a */
    private final C6724b f18406a;

    C6729c(C6724b bVar) {
        this.f18406a = bVar;
    }

    public final void accept(Object obj) {
        C6724b bVar = this.f18406a;
        C4172a aVar = (C4172a) obj;
        if (aVar.f11364a == 0 && aVar.f11365b != null) {
            if (aVar.f11366c instanceof C7860ca) {
                Map<String, String> map = ((C7860ca) aVar.f11366c).f21732a;
                if (map != null && map.containsKey("mt_donation_rp_show")) {
                    String str = (String) map.get("mt_donation_rp_show");
                    if (str != null && str.equals("1")) {
                        bVar.f18388b.mo12836d();
                    }
                }
            }
            if (aVar.f11365b.size() > 0) {
                for (T t : aVar.f11365b) {
                    t.timestamp = ((C7860ca) aVar.f11366c).now;
                    bVar.onMessage(t);
                }
            }
        }
    }
}

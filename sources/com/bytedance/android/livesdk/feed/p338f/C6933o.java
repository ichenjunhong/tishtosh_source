package com.bytedance.android.livesdk.feed.p338f;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.p226e.C3842b.C3843a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.feed.p342j.C7007b;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.p450h.C8752c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.f.o */
final /* synthetic */ class C6933o implements C0199s {

    /* renamed from: a */
    private final C6926k f18981a;

    C6933o(C6926k kVar) {
        this.f18981a = kVar;
    }

    public final void onChanged(Object obj) {
        C6926k kVar = this.f18981a;
        C3842b bVar = (C3842b) obj;
        kVar.f18931s.setRefreshing(bVar != null && kVar.f18970j && bVar.mo9203a() && kVar.f18973n);
        kVar.f18973n = true;
        if (bVar.f10823a.equals(C3843a.SUCCESS) && kVar.f18972m != null) {
            kVar.f18972m.mo12987g();
        }
        if (kVar.f18963c != null && kVar.f18963c.f19439a) {
            kVar.f18963c.mo13276b();
        }
        if (bVar.f10823a != C3843a.RUNNING) {
            if (!kVar.f18952G) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("enter_from_merge", "live_live");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("duration", String.valueOf(System.currentTimeMillis() - kVar.f18951F));
                C7007b.m14648a("livesdk_live_feed_first_refresh_duration", (Map<String, String>) hashMap);
                kVar.f18952G = true;
            }
            if (((Boolean) LiveSettingKeys.LIVE_IS_LOAD_GIFT_AFTER_FEED_END.mo9431a()).booleanValue() && !kVar.f18971k) {
                kVar.f18971k = true;
                if (C8830k.m17330d() != null) {
                    C8830k.m17328b();
                }
            }
            if (kVar.getActivity() != null && (kVar.getActivity() instanceof C8752c)) {
                ((C8752c) kVar.getActivity()).mo15413a();
            }
        }
    }
}

package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.gift.C7649u.C7650a;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.w */
final /* synthetic */ class C7652w implements C1710e {

    /* renamed from: a */
    private final C7649u f21081a;

    C7652w(C7649u uVar) {
        this.f21081a = uVar;
    }

    public final void accept(Object obj) {
        C7649u uVar = this.f21081a;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            for (C7650a a : uVar.f21077b) {
                a.mo13538a();
            }
        }
        uVar.f21078c = false;
        String message = th.getMessage();
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", message);
        C3837e.m9741a(C7647s.m15643a("ttlive_prop_list_status"), 1, 0, (Map<String, Object>) hashMap);
        C3837e.m9743a(C7647s.m15652b("ttlive_prop_list_status"), 1, (Map<String, Object>) hashMap);
        C8029a.m15933a().mo14189a(C8030b.Gift.info, "ttlive_prop_list_status", 1, (Map) hashMap);
    }
}

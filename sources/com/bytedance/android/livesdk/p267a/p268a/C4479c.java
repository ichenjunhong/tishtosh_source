package com.bytedance.android.livesdk.p267a.p268a;

import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.p267a.C4488c;
import com.bytedance.android.livesdk.p267a.C4489d;
import com.bytedance.android.livesdkapi.depend.live.C8648g;
import java.util.Map;

@C4488c(mo10289a = "webcast_inroom_giftpanel")
/* renamed from: com.bytedance.android.livesdk.a.a.c */
public final class C4479c extends C4489d<Void> {
    /* renamed from: a */
    public final void mo10286a(Map map) throws Exception {
        String str = "gift";
        Object obj = map.get("tab");
        if (obj != null && TextUtils.equals(obj.toString(), "5")) {
            str = "prop";
        }
        ((C8648g) C4116c.m10249a(C8648g.class)).sendGift(str, true);
        mo10291a(null);
    }
}

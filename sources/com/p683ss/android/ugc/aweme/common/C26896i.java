package com.p683ss.android.ugc.aweme.common;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.experiment.MuteV1LogExperiment;
import com.p683ss.android.ugc.aweme.lancet.C18985f;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.i */
final class C26896i {
    /* renamed from: a */
    static void m65023a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        if (C10181b.m20511a().mo18172a(MuteV1LogExperiment.class, true, "mute_v1_log", 31744, false)) {
            Set set = (Set) C18985f.f52290a.get(str2);
            if (set != null && set.contains(str3)) {
                return;
            }
        }
        C26890h.m65010a(str, str2, str3, str4, j, jSONObject);
    }
}

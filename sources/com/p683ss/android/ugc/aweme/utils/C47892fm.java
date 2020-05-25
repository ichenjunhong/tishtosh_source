package com.p683ss.android.ugc.aweme.utils;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.fm */
public final class C47892fm {

    /* renamed from: a */
    private static String f120487a = "";

    /* renamed from: a */
    public static final String m103594a() {
        if (!TextUtils.isEmpty(f120487a)) {
            return f120487a;
        }
        try {
            Object systemService = C11010c.m22280a().getSystemService("phone");
            if (systemService != null) {
                String deviceId = ((TelephonyManager) systemService).getDeviceId();
                C52711k.m112236a((Object) deviceId, "tManager.deviceId");
                f120487a = deviceId;
                if (TextUtils.isEmpty(f120487a)) {
                    f120487a = "";
                }
                return f120487a;
            }
            throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception unused) {
        }
    }
}

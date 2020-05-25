package com.p683ss.android.ugc.aweme.i18n.p1804a;

import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.aweme.i18n.a.a */
public final class C33092a extends C33093b<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo70099a() {
        return m76064c();
    }

    /* renamed from: c */
    private static String m76064c() {
        String str = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C11010c.m22280a().getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            str = telephonyManager.getNetworkOperator();
            return str;
        } catch (Exception unused) {
        }
    }
}

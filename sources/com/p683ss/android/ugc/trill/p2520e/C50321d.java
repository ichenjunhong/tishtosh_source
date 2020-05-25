package com.p683ss.android.ugc.trill.p2520e;

import android.telephony.TelephonyManager;
import com.bytedance.ies.ugc.p694a.C11010c;

/* renamed from: com.ss.android.ugc.trill.e.d */
public final class C50321d extends C50319b<String> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo98225a() {
        return m108599c();
    }

    /* renamed from: c */
    private static String m108599c() {
        try {
            if (((TelephonyManager) C11010c.m22280a().getSystemService("phone")).getPhoneType() == 2) {
                Class cls = Class.forName("android.os.SystemProperties");
                return ((String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.cdma.home.operator.numeric"})).substring(0, 3);
            }
            int i = C11010c.m22280a().getResources().getConfiguration().mcc;
            if (i == 0) {
                return "";
            }
            return String.valueOf(i);
        } catch (Exception unused) {
            return "";
        }
    }
}

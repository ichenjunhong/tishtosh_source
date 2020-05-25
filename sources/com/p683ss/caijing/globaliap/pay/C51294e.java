package com.p683ss.caijing.globaliap.pay;

import android.os.Bundle;

/* renamed from: com.ss.caijing.globaliap.pay.e */
public final class C51294e {
    /* renamed from: c */
    public static Bundle m110288c() {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 5);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m110282a() {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 1);
        bundle2.putString("pay_result_msg", "cancel");
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m110286b() {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 3);
        bundle2.putString("pay_result_msg", "inner error");
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m110287b(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 194);
        bundle2.putString("pay_result_msg", str);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m110284a(String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", 2);
        bundle2.putString("pay_result_msg", str);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m110285a(String str, Bundle bundle) {
        Bundle a = m110283a(197, str);
        Bundle bundle2 = a.getBundle("pay_result_extra");
        if (bundle2 != null) {
            bundle2.putBundle("pay_result_bundle", bundle);
        }
        return a;
    }

    /* renamed from: a */
    public static Bundle m110283a(int i, String str) {
        if (i == 101) {
            return m110282a();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("pay_result_code", 1);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("pay_result_detail_code", i);
        bundle2.putString("pay_result_msg", str);
        bundle.putBundle("pay_result_extra", bundle2);
        return bundle;
    }
}

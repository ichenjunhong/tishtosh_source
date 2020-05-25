package com.p683ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: com.ss.android.ugc.aweme.account.util.p */
public final class C22276p {

    /* renamed from: a */
    public static final C22276p f60045a = new C22276p();

    private C22276p() {
    }

    /* renamed from: a */
    public static final boolean m55133a(Context context) {
        Object obj;
        if (context != null) {
            obj = context.getSystemService("phone");
        } else {
            obj = null;
        }
        if (!(obj instanceof TelephonyManager)) {
            obj = null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        if (telephonyManager == null) {
            return false;
        }
        switch (telephonyManager.getSimState()) {
            case 0:
            case 1:
                return false;
            default:
                return true;
        }
    }
}

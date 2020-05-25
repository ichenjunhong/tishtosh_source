package com.p683ss.android.ugc.aweme.commercialize.coupon;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25686a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a */
public final class C25668a {
    /* renamed from: a */
    public static String m62226a(C25687b bVar) {
        String str = "";
        if (bVar.getCouponSource() == 0) {
            return "poi_offline";
        }
        if (bVar.getCouponSource() == 1 && bVar.getCouponType() == 1) {
            return "ad_online";
        }
        if (bVar.getCouponSource() == 1 && bVar.getCouponType() == 0) {
            return "ad_offline";
        }
        return str;
    }

    /* renamed from: a */
    public static String m62225a(Context context, int i, boolean z) {
        String str;
        String str2 = "";
        switch (C25686a.getStatus(i)) {
            case StatusUnReceived:
                if (!z) {
                    str = "";
                    break;
                } else {
                    str = "unclaimed";
                    break;
                }
            case StatusValid:
                if (!z) {
                    str = context.getString(R.string.ak3);
                    break;
                } else {
                    str = "valid";
                    break;
                }
            case StatusRedeemed:
                if (!z) {
                    str = context.getString(R.string.ajh);
                    break;
                } else {
                    str = "used";
                    break;
                }
            case StatusExpired:
                if (!z) {
                    str = context.getString(R.string.ajo);
                    break;
                } else {
                    str = "invalid";
                    break;
                }
            case StatusRefunded:
                return context.getString(R.string.ajv);
            default:
                return str2;
        }
        return str;
    }
}

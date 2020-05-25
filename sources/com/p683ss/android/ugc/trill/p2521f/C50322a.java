package com.p683ss.android.ugc.trill.p2521f;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.ss.android.ugc.trill.f.a */
public final class C50322a {
    /* renamed from: a */
    public static boolean m108601a(Context context) {
        if (m108602b(context) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m108602b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Exception unused) {
            return 1;
        }
    }
}

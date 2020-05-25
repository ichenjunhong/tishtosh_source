package com.p683ss.android.ugc.aweme.account.utils;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p683ss.android.ugc.aweme.C23826bi;

/* renamed from: com.ss.android.ugc.aweme.account.utils.f */
public final class C22299f {
    /* renamed from: a */
    public static boolean m55184a() {
        return m55185a(C23826bi.m58460b());
    }

    /* renamed from: b */
    public static int m55186b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context.getApplicationContext());
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: a */
    public static boolean m55185a(Context context) {
        if (m55186b(context) == 0) {
            return true;
        }
        return false;
    }
}

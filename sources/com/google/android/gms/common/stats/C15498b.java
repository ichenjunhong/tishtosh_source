package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.google.android.gms.common.stats.b */
final class C15498b {
    /* renamed from: a */
    static boolean m32250a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, i);
        }
        if (C40895d.m90464a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, i);
    }
}

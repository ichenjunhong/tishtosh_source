package com.p683ss.android.message.p1191b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.message.b.h */
final class C19467h {
    /* renamed from: a */
    static ComponentName m47644a(Context context, Intent intent) {
        if (context == null || !(context instanceof Context)) {
            return context.startService(intent);
        }
        if (C40895d.m90464a(context, intent)) {
            return null;
        }
        return context.startService(intent);
    }

    /* renamed from: a */
    static boolean m47645a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (C40895d.m90464a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}

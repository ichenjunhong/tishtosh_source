package com.p683ss.caijing.globaliap.p2559d;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.caijing.globaliap.d.f */
final class C51264f {
    /* renamed from: a */
    static boolean m110202a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (C40895d.m90464a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}

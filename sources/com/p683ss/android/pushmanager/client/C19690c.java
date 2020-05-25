package com.p683ss.android.pushmanager.client;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.pushmanager.client.c */
final class C19690c {
    /* renamed from: a */
    static void m48095a(Context context) {
        if (C18920g.m46048a(context)) {
            C19688b.m48090b(context);
        }
    }

    /* renamed from: a */
    static boolean m48096a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (C40895d.m90464a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}

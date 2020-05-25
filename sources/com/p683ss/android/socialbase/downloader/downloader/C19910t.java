package com.p683ss.android.socialbase.downloader.downloader;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.socialbase.downloader.downloader.t */
final class C19910t {
    /* renamed from: a */
    static ComponentName m48886a(Context context, Intent intent) {
        if (context == null || !(context instanceof Context)) {
            return context.startService(intent);
        }
        if (C40895d.m90464a(context, intent)) {
            return null;
        }
        return context.startService(intent);
    }

    /* renamed from: a */
    static boolean m48887a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (C40895d.m90464a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}

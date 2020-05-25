package com.p683ss.android.newmedia.redbadge.p1201c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.c.a */
public final class C19600a {
    /* renamed from: a */
    public static boolean m47943a(Context context, Intent intent) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }
}

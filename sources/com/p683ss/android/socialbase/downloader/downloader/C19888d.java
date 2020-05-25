package com.p683ss.android.socialbase.downloader.downloader;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.socialbase.downloader.downloader.d */
final class C19888d {
    /* renamed from: a */
    static ComponentName m48644a(Context context, Intent intent) {
        if (context == null || !(context instanceof Context)) {
            return context.startService(intent);
        }
        if (C40895d.m90464a(context, intent)) {
            return null;
        }
        return context.startService(intent);
    }
}

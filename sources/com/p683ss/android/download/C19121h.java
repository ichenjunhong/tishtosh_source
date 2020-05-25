package com.p683ss.android.download;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.download.h */
final class C19121h {
    /* renamed from: a */
    static ComponentName m46603a(Context context, Intent intent) {
        if (context == null || !(context instanceof Context)) {
            return context.startService(intent);
        }
        if (C40895d.m90464a(context, intent)) {
            return null;
        }
        return context.startService(intent);
    }
}

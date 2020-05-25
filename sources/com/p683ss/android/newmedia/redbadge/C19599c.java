package com.p683ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;

/* renamed from: com.ss.android.newmedia.redbadge.c */
final class C19599c {
    /* renamed from: a */
    static ComponentName m47942a(Context context, Intent intent) {
        if (context == null || !(context instanceof Context)) {
            return context.startService(intent);
        }
        if (C40895d.m90464a(context, intent)) {
            return null;
        }
        return context.startService(intent);
    }
}

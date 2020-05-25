package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.twitter.sdk.android.core.f */
public final class C52074f {
    /* renamed from: b */
    public static boolean m111396b(Context context, Intent intent) {
        if (!m111395a(context, intent)) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static boolean m111395a(Context context, Intent intent) {
        if (!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}

package com.p683ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.ss.android.ugc.aweme.utils.c */
public final class C47743c {
    /* renamed from: a */
    public static Activity m103371a(Context context) {
        while (context != null && !(context instanceof Application)) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}

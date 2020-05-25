package com.bytedance.android.live.core.p230g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.p030v4.app.FragmentActivity;

/* renamed from: com.bytedance.android.live.core.g.d */
public final class C3889d {
    /* renamed from: a */
    public static Activity m9831a(Context context) {
        while (context != null) {
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

    /* renamed from: b */
    public static FragmentActivity m9832b(Context context) {
        while (context != null) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}

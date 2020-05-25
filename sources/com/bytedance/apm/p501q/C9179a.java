package com.bytedance.apm.p501q;

import android.app.Application;
import android.content.Context;

/* renamed from: com.bytedance.apm.q.a */
public final class C9179a {

    /* renamed from: a */
    private static int f25147a = 40;

    /* renamed from: a */
    public static Application m18206a(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Application) {
            return (Application) context;
        }
        return (Application) context.getApplicationContext();
    }
}

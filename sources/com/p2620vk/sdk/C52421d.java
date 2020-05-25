package com.p2620vk.sdk;

import android.content.Context;

/* renamed from: com.vk.sdk.d */
public final class C52421d {

    /* renamed from: a */
    private static Context f130760a;

    /* renamed from: a */
    public static Context m111976a() {
        return f130760a;
    }

    /* renamed from: a */
    static void m111977a(Context context) {
        if (context != null) {
            f130760a = context.getApplicationContext();
        }
    }
}

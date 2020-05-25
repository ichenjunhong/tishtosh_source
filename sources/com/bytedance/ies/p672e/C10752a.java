package com.bytedance.ies.p672e;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.ies.e.a */
public final class C10752a {

    /* renamed from: a */
    public static String f28910a = "notify.log";

    /* renamed from: b */
    public static SimpleDateFormat f28911b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    private static ExecutorService f28912c;

    /* renamed from: a */
    public static synchronized void m21792a(Context context, String str) {
        synchronized (C10752a.class) {
            try {
                if (f28912c != null) {
                    f28912c.shutdown();
                }
            } catch (Exception unused) {
            }
        }
    }
}

package com.p683ss.android.message.p1186a.p1187a;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.message.a.a.b */
public final class C19410b {

    /* renamed from: a */
    public static String f53648a = "notify.log";

    /* renamed from: b */
    public static SimpleDateFormat f53649b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: c */
    private static ExecutorService f53650c;

    /* renamed from: a */
    public static synchronized void m47510a(Context context, String str) {
        synchronized (C19410b.class) {
            try {
                if (f53650c != null) {
                    f53650c.shutdown();
                }
            } catch (Exception unused) {
            }
        }
    }
}

package com.p683ss.android.ugc.rhea.p2502d;

import android.app.Notification;
import android.app.NotificationManager;
import android.widget.RemoteViews;
import com.p683ss.android.ugc.rhea.p2500b.C50175b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.rhea.d.a */
public final class C50177a {

    /* renamed from: a */
    public static String f125710a = "com.ss.android.ugc.conan.trace";

    /* renamed from: b */
    public static NotificationManager f125711b = null;

    /* renamed from: c */
    private static int f125712c = 1;

    /* renamed from: d */
    private static int f125713d = 2;

    /* renamed from: e */
    private static RemoteViews f125714e;

    /* renamed from: f */
    private static Notification f125715f;

    /* renamed from: a */
    public static void m108282a() {
        String str;
        if (f125714e != null) {
            boolean a = C50175b.m108281a();
            RemoteViews remoteViews = f125714e;
            if (a) {
                str = "Stop";
            } else {
                str = "Start";
            }
            remoteViews.setTextViewText(R.id.e0d, str);
            f125711b.notify(f125710a.hashCode(), f125715f);
        }
    }
}

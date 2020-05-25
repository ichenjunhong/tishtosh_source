package com.p683ss.android.pushmanager.p1204a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build.VERSION;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.util.Map;

/* renamed from: com.ss.android.pushmanager.a.e */
final class C19669e {
    /* renamed from: a */
    static Map m48060a(C19667d dVar) {
        Map d = dVar.mo41020d();
        NotificationManager notificationManager = (NotificationManager) C11010c.m22280a().getSystemService("notification");
        if (VERSION.SDK_INT >= 26 && notificationManager != null) {
            for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                d.put(notificationChannel.getId(), String.valueOf(notificationChannel.getImportance()));
            }
        }
        return d;
    }
}

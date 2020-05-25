package com.p683ss.android.ugc.awemepushlib.interaction;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.awemepushapi.PushSettingExperiment;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.b */
public final class C48442b {

    /* renamed from: a */
    public static final Map<String, Integer> f121811a = new HashMap<String, Integer>() {
        {
            put("digg_push", Integer.valueOf(R.string.dgy));
            put("comment_push", Integer.valueOf(R.string.dgu));
            put("follow_push", Integer.valueOf(R.string.dgw));
            put("mention_push", Integer.valueOf(R.string.dh1));
            put("im_push", Integer.valueOf(R.string.dgv));
            put("follow_new_video_push", Integer.valueOf(R.string.dh_));
            put("recommend_video_push", Integer.valueOf(R.string.dha));
            put("live_push", Integer.valueOf(R.string.dgz));
            put("other_channel", Integer.valueOf(R.string.hik));
        }
    };

    /* renamed from: b */
    public static void m104833b(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        m104832a(context, notificationManager, f121811a);
        m104828a(notificationManager, "com.ss.android.ugc.aweme.server");
        m104828a(notificationManager, "com.ss.android.ugc.aweme.server.important.low");
    }

    /* renamed from: c */
    public static void m104834c(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        m104829a(notificationManager, "com.ss.android.ugc.aweme.server", "Notification");
        m104830a(notificationManager, "com.ss.android.ugc.aweme.server.important.low", "Notification", 2);
        for (Entry key : f121811a.entrySet()) {
            m104828a(notificationManager, (String) key.getKey());
        }
    }

    /* renamed from: a */
    public static void m104831a(Context context) {
        if (VERSION.SDK_INT >= 26 && context != null) {
            if (C10181b.m20511a().mo18172a(PushSettingExperiment.class, false, "enable_notification_category", 31744, false)) {
                m104833b(context);
            } else {
                m104834c(context);
            }
        }
    }

    /* renamed from: a */
    private static void m104828a(NotificationManager notificationManager, String str) {
        if (!(VERSION.SDK_INT < 26 || notificationManager == null || notificationManager.getNotificationChannel(str) == null)) {
            notificationManager.deleteNotificationChannel(str);
        }
    }

    /* renamed from: a */
    private static void m104829a(NotificationManager notificationManager, String str, String str2) {
        m104830a(notificationManager, str, str2, 4);
    }

    /* renamed from: a */
    private static void m104832a(Context context, NotificationManager notificationManager, Map<String, Integer> map) {
        if (VERSION.SDK_INT >= 26 && notificationManager != null) {
            ArrayList arrayList = new ArrayList();
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String string = context.getString(((Integer) entry.getValue()).intValue());
                if (notificationManager.getNotificationChannel(str) == null) {
                    NotificationChannel notificationChannel = new NotificationChannel(str, string, 4);
                    notificationChannel.enableLights(true);
                    notificationChannel.enableVibration(true);
                    notificationChannel.setLockscreenVisibility(1);
                    notificationChannel.setShowBadge(true);
                    notificationChannel.setLightColor(-16711936);
                    arrayList.add(notificationChannel);
                }
            }
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    /* renamed from: a */
    private static void m104830a(NotificationManager notificationManager, String str, String str2, int i) {
        if (VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, i);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLightColor(-16711936);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}

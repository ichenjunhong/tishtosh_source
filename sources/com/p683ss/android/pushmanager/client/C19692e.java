package com.p683ss.android.pushmanager.client;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.client.e */
public final class C19692e {

    /* renamed from: a */
    private static List<NotificationChannel> f54203a;

    /* renamed from: a */
    static void m48100a(final Context context) {
        C9393e.submitRunnable(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
                if (r2 != false) goto L_0x0039;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    com.ss.android.pushmanager.setting.b r0 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()
                    com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r0 = r0.f54262b
                    java.lang.String r1 = "last_send_notify_enable_is_succ"
                    r2 = 1
                    boolean r0 = r0.mo41082a(r1, r2)
                    r1 = 0
                    if (r0 == 0) goto L_0x0039
                    android.content.Context r0 = r1
                    int r3 = com.p683ss.android.message.p1191b.C19470k.m47659d(r0)
                    com.ss.android.pushmanager.setting.b r4 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()
                    com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r4 = r4.f54262b
                    java.lang.String r5 = "system_push_enable"
                    r6 = -2
                    int r4 = r4.mo41078a(r5, r6)
                    if (r4 == r3) goto L_0x0027
                    r3 = 1
                    goto L_0x0028
                L_0x0027:
                    r3 = 0
                L_0x0028:
                    if (r3 == 0) goto L_0x002b
                    goto L_0x0037
                L_0x002b:
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r3 = 26
                    if (r2 >= r3) goto L_0x0033
                    r2 = 0
                    goto L_0x0037
                L_0x0033:
                    boolean r2 = com.p683ss.android.pushmanager.client.C19692e.m48102b(r0)
                L_0x0037:
                    if (r2 == 0) goto L_0x0067
                L_0x0039:
                    android.content.Context r0 = r1
                    com.ss.android.pushmanager.setting.b r2 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()
                    boolean r2 = r2.mo41094c()
                    boolean r3 = com.p683ss.android.pushmanager.client.C19696f.m48104a(r0)
                    if (r3 != 0) goto L_0x0051
                    com.ss.android.pushmanager.setting.b r0 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()
                    r0.mo41092b(r1)
                    return
                L_0x0051:
                    com.ss.android.pushmanager.client.e$2 r1 = new com.ss.android.pushmanager.client.e$2
                    r1.<init>(r0, r2)
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    android.os.Looper r2 = android.os.Looper.myLooper()
                    if (r0 != r2) goto L_0x0064
                    com.bytedance.common.utility.p523c.C9393e.submitRunnable(r1)
                    return
                L_0x0064:
                    r1.run()
                L_0x0067:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.pushmanager.client.C19692e.C196931.run():void");
            }
        });
    }

    /* renamed from: b */
    static boolean m48102b(Context context) {
        try {
            List c = m48103c(context);
            String a = C19710b.m48173a().f54262b.mo41081a("notification_channel_status", "");
            if (TextUtils.isEmpty(a)) {
                if (c != null) {
                    if (!c.isEmpty()) {
                        return true;
                    }
                }
                return false;
            } else if (!m48101a(c, m48098a(new JSONArray(a)))) {
                return true;
            } else {
                return false;
            }
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static List<NotificationChannel> m48103c(Context context) {
        if (f54203a == null || f54203a.isEmpty()) {
            try {
                f54203a = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannels();
            } catch (Throwable unused) {
                f54203a = Collections.emptyList();
            }
        }
        return f54203a;
    }

    /* renamed from: a */
    private static Map<String, NotificationChannel> m48098a(JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("id");
            NotificationChannel notificationChannel = new NotificationChannel(optString, optJSONObject.optString(LeakCanaryFileProvider.f132049i), optJSONObject.optInt("importance", -1));
            notificationChannel.setBypassDnd(optJSONObject.optBoolean("bypassDnd"));
            notificationChannel.setLockscreenVisibility(optJSONObject.optInt("lockscreenVisibility", -1));
            notificationChannel.enableLights(optJSONObject.optBoolean("lights"));
            notificationChannel.enableVibration(optJSONObject.optBoolean("vibration"));
            hashMap.put(optString, notificationChannel);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONArray m48099a(List<NotificationChannel> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        for (NotificationChannel notificationChannel : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", notificationChannel.getId());
                jSONObject.put(LeakCanaryFileProvider.f132049i, notificationChannel.getName());
                jSONObject.put("importance", notificationChannel.getImportance());
                jSONObject.put("bypassDnd", notificationChannel.canBypassDnd());
                jSONObject.put("lockscreenVisibility", notificationChannel.getLockscreenVisibility());
                jSONObject.put("lights", notificationChannel.shouldShowLights());
                jSONObject.put("vibration", notificationChannel.shouldVibrate());
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static boolean m48101a(List<NotificationChannel> list, Map<String, NotificationChannel> map) {
        if (list.size() != map.size()) {
            return false;
        }
        for (NotificationChannel notificationChannel : list) {
            NotificationChannel notificationChannel2 = (NotificationChannel) map.get(notificationChannel.getId());
            if (notificationChannel2 == null || notificationChannel2.getImportance() != notificationChannel.getImportance() || notificationChannel2.getLockscreenVisibility() != notificationChannel.getLockscreenVisibility() || notificationChannel2.canBypassDnd() != notificationChannel.canBypassDnd() || notificationChannel2.shouldShowLights() != notificationChannel.shouldShowLights()) {
                return false;
            }
            if (notificationChannel2.shouldVibrate() != notificationChannel.shouldVibrate()) {
                return false;
            }
        }
        return true;
    }
}

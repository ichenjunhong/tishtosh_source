package com.fcm.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.p683ss.android.message.p1191b.C19464g;
import com.p683ss.android.push.PushDependManager;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import org.json.JSONObject;

public class SSGcmListenerService extends FirebaseMessagingService {
    public void onNewToken(String str) {
        super.onNewToken(str);
        sendToken(str);
    }

    private void sendToken(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this, FcmRegistrationJobIntentService.class);
                intent.putExtra("key_token", str);
                FcmRegistrationJobIntentService.enqueueWork(this, intent);
            }
        } catch (Throwable th) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb = new StringBuilder("Error = ");
                sb.append(th.getMessage());
                PushDependManager.inst().loggerD("SSGcmListenerService", sb.toString());
            }
        }
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.f49832b == null) {
                Bundle bundle = remoteMessage.f49831a;
                C0777a aVar = new C0777a();
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals(CustomActionPushReceiver.f104056a) && !str.equals("collapse_key")) {
                            aVar.put(str, str2);
                        }
                    }
                }
                remoteMessage.f49832b = aVar;
            }
            handleMessage(this, 1, (String) remoteMessage.f49832b.get(C19700f.m48127b().mo41022a()), 5);
        } catch (Exception e) {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("SSGcmListenerService", e.getMessage());
            }
        }
    }

    public static void handleMessage(Context context, int i, String str, int i2) {
        handleMessage(context, i, str, i2, null);
    }

    public static void handleMessage(Context context, int i, String str, int i2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!TextUtils.isEmpty(jSONObject.optString("id"))) {
                C26890h.onEvent(MobClick.obtain().setEventName("push_receive").setLabelName("perf_monitor").setValue(jSONObject.optString("id")));
            }
        } catch (Exception unused) {
        }
        handleMessage$___twin___(context, i, str, i2, str2);
    }

    public static void handleMessage$___twin___(Context context, int i, String str, int i2, String str2) {
        if (context != null && !C9431p.m18664a(str)) {
            try {
                Intent intent = new Intent("com.ss.android.fcm.message");
                intent.setPackage(context.getPackageName());
                intent.putExtra(CustomActionPushReceiver.f104056a, i);
                intent.putExtra(CustomActionPushReceiver.f104057b, str);
                intent.putExtra(CustomActionPushReceiver.f104058c, i2);
                intent.putExtra(CustomActionPushReceiver.f104059d, str2);
                C19464g.m47635a(context, intent);
            } catch (Exception unused) {
            }
        }
    }
}

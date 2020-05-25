package com.adm.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.p1191b.C19464g;
import com.p683ss.android.push.PushDependManager;
import com.p683ss.android.pushmanager.C19700f;
import com.p683ss.android.pushmanager.p1205b.C19679d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import org.json.JSONObject;

public class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {
    private static long sLastSendTokenTimeStamp;
    private static String sLastToken;
    private Handler mHandler;

    /* renamed from: com.adm.push.ADMMessageHandlerJob$a */
    static class C2286a extends Handler {

        /* renamed from: a */
        private final Context f7097a;

        C2286a(Context context) {
            super(Looper.getMainLooper());
            this.f7097a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    try {
                        String str = (String) message.obj;
                        ADMMessageHandlerJob.handleMessage(this.f7097a, 0, str, 14);
                        C2287a.m6817a(this.f7097a, str, 2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("label", "get_token");
                        jSONObject.put("type", 14);
                        jSONObject.put("token", str);
                        PushDependManager.inst().sendMonitor(this.f7097a, "ss_push", jSONObject);
                        return;
                    } catch (Throwable th) {
                        if (PushDependManager.inst().loggerDebug()) {
                            StringBuilder sb = new StringBuilder("ADMMessageHandlerJob.AdmHandler handleMessage error = ");
                            sb.append(th.getMessage());
                            PushDependManager.inst().loggerD("AdmPush", sb.toString());
                        }
                        return;
                    }
                case 2:
                    try {
                        String str2 = (String) message.obj;
                        C19679d.m48075a(14, 102, (String) message.obj, "ADMMessageHandlerJob.AdmHandler 注册通道时，通道返回ERROR");
                        ADMMessageHandlerJob.handleMessage(this.f7097a, 2, str2, 14);
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("label", "onRegistrationError");
                            jSONObject2.put("type", 14);
                            jSONObject2.put("errorId", str2);
                            PushDependManager.inst().sendMonitor(this.f7097a, "ss_push", jSONObject2);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable unused2) {
                        break;
                    }
            }
        }
    }

    private Handler getHandler(Context context) {
        if (this.mHandler == null) {
            this.mHandler = new C2286a(context.getApplicationContext());
        }
        return this.mHandler;
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastSendTokenTimeStamp >= 2000 || !C9431p.m18665a(str, sLastToken)) {
            sLastSendTokenTimeStamp = currentTimeMillis;
            sLastToken = str;
            sendToken(context, str);
        }
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("ADMMessageHandlerJob onRegistrationError: ");
            sb.append(str);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
        getHandler(context).obtainMessage(2, str).sendToTarget();
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("ADMMessageHandlerJob unregisterPush: ");
            sb.append(str);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
    }

    private void sendToken(Context context, String str) {
        try {
            StringBuilder sb = new StringBuilder("ADMMessageHandlerJob sendToken = ");
            sb.append(str);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
            if (TextUtils.isEmpty(str)) {
                C19679d.m48075a(14, 102, "0", "ADMMessageHandlerJob token 为空");
            } else {
                getHandler(context).obtainMessage(1, str).sendToTarget();
            }
        } catch (Throwable th) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb2 = new StringBuilder("ADMMessageHandlerJob sendToken error = ");
                sb2.append(th.getMessage());
                PushDependManager.inst().loggerD("AdmPush", sb2.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        if (intent != null) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb = new StringBuilder("ADMMessageHandlerJob onMessage: ");
                sb.append(intent);
                PushDependManager.inst().loggerD("AdmPush", sb.toString());
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    handleMessage(context, 1, extras.getString(C19700f.m48127b().mo41022a()), 14);
                } catch (Exception e) {
                    if (PushDependManager.inst().loggerDebug()) {
                        PushDependManager.inst().loggerD("AdmPush", e.getMessage());
                    }
                }
            }
        }
    }

    public static void handleMessage(Context context, int i, String str, int i2) {
        handleMessage(context, i, str, i2, null);
    }

    private static void handleMessage(Context context, int i, String str, int i2, String str2) {
        if (context != null && !C9431p.m18664a(str)) {
            try {
                Intent intent = new Intent("com.ss.android.adm.message");
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

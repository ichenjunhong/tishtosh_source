package com.adm.push;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.p683ss.android.message.p1191b.C19453a;
import com.p683ss.android.message.p1191b.C19453a.C19454a;
import com.p683ss.android.message.p1191b.C19453a.C19455b;
import com.p683ss.android.message.p1191b.C19462e;
import com.p683ss.android.push.PushDependManager;
import com.p683ss.android.pushmanager.p1205b.C19679d;
import com.p683ss.android.pushmanager.thirdparty.IPushAdapter;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.Arrays;
import java.util.Collections;

public class AdmPushAdapter implements IPushAdapter {
    private static boolean sSupport = true;

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
        } catch (Throwable unused) {
        }
    }

    private boolean isSupport(Context context) {
        try {
            if (!sSupport || !C2289b.m6819a(context).f7100a.isSupported()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isPushAvailable(Context context, int i) {
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("isPushAvailable: ");
            sb.append(isSupport(context));
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
        return isSupport(context);
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 14 && isSupport(context)) {
            if (PushDependManager.inst().loggerDebug()) {
                StringBuilder sb = new StringBuilder("unregisterPush: ");
                sb.append(i);
                PushDependManager.inst().loggerD("AdmPush", sb.toString());
            }
            C2289b.m6819a(context).f7100a.startUnregister();
        }
    }

    public void registerPush(Context context, int i) {
        if (context == null || i != 14 || !isSupport(context)) {
            String str = null;
            if (context == null) {
                str = "空 context";
            } else if (i != 14) {
                str = "通道注册错误";
            } else if (!isSupport(context)) {
                str = "不支持的系统";
            }
            C19679d.m48075a(i, BaseNotice.HASHTAG, "0", str);
            return;
        }
        if (PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("registerPush: ");
            sb.append(i);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
        C2289b.m6819a(context).f7100a.startRegister();
    }

    public boolean checkThirdPushConfig(String str, Context context) throws NameNotFoundException {
        boolean a = C2290c.m6820a(str, context);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".permission.RECEIVE_ADM_MESSAGE");
        boolean z = false;
        String[] strArr = {sb.toString(), "com.amazon.device.messaging.permission.RECEIVE", "android.permission.WAKE_LOCK"};
        boolean a2 = a & C19462e.m47620a(context, str, "ADMPush 错误,", Arrays.asList(strArr));
        String str2 = "Adm Push 错误";
        boolean b = C19462e.m47623b(context, str, str2, Arrays.asList(new C19453a[]{C19454a.m47606c("com.adm.push.ADMMessageHandler").mo40588a(context.getPackageName()).f53774a, C19454a.m47606c("com.adm.push.ADMMessageHandlerJob").mo40588a(context.getPackageName()).mo40589b("android.permission.BIND_JOB_SERVICE").f53774a}));
        if (C19462e.m47626c(context, str, "Adm Push 错误", Collections.singletonList(C19454a.m47606c("com.adm.push.ADMMessageHandler$Receiver").mo40588a(context.getPackageName()).mo40589b("com.amazon.device.messaging.permission.SEND").mo40587a(new C19455b(Arrays.asList(new String[]{"com.amazon.device.messaging.intent.REGISTRATION", "com.amazon.device.messaging.intent.RECEIVE"}), Collections.singletonList(context.getPackageName()))).f53774a)) && b) {
            z = true;
        }
        return a2 & z;
    }

    public void setAlias(Context context, String str, int i) {
        if (context != null && i == 14 && isSupport(context) && PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("setAlias: ");
            sb.append(i);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        if (context != null && i == 14 && isSupport(context) && PushDependManager.inst().loggerDebug()) {
            StringBuilder sb = new StringBuilder("trackPush: ");
            sb.append(i);
            PushDependManager.inst().loggerD("AdmPush", sb.toString());
        }
    }
}

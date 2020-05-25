package com.fcm.p991a;

import android.content.Context;
import com.p683ss.android.push.PushDependManager;
import com.p683ss.android.pushmanager.thirdparty.ISendTokenCallBack;

/* renamed from: com.fcm.a.a */
public final class C14705a {
    /* renamed from: a */
    public static void m30080a(Context context, final String str, int i) {
        try {
            m30081a(context, str, (ISendTokenCallBack) new ISendTokenCallBack() {
                public final int getType() {
                    return 5;
                }

                public final String getToken(Context context) {
                    return str;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m30081a(Context context, String str, ISendTokenCallBack iSendTokenCallBack) {
        if (context != null) {
            try {
                PushDependManager.inst().sendToken(context.getApplicationContext(), iSendTokenCallBack);
            } catch (Throwable unused) {
            }
        }
    }
}

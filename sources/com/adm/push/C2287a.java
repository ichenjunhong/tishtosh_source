package com.adm.push;

import android.content.Context;
import com.p683ss.android.push.PushDependManager;
import com.p683ss.android.pushmanager.thirdparty.ISendTokenCallBack;

/* renamed from: com.adm.push.a */
final class C2287a {
    /* renamed from: a */
    public static void m6817a(Context context, final String str, int i) {
        try {
            m6818a(context, str, (ISendTokenCallBack) new ISendTokenCallBack() {
                public final int getType() {
                    return 14;
                }

                public final String getToken(Context context) {
                    return str;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m6818a(Context context, String str, ISendTokenCallBack iSendTokenCallBack) {
        if (context != null) {
            try {
                PushDependManager.inst().sendToken(context.getApplicationContext(), iSendTokenCallBack);
            } catch (Throwable unused) {
            }
        }
    }
}

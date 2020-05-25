package com.p683ss.android.message.sswo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.p523c.C9393e;
import com.p683ss.android.pushmanager.setting.C19710b;

/* renamed from: com.ss.android.message.sswo.SswoReceiver */
public class SswoReceiver extends BroadcastReceiver {
    public void onReceive(final Context context, final Intent intent) {
        C9393e.submitRunnable(new Runnable() {
            public final void run() {
                Intent intent = intent;
                Context context = context;
                try {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        C19495a a = C19495a.m47729a(context);
                        if (!C19710b.m48173a().mo41104n()) {
                            a.mo40652b();
                        } else {
                            Context context2 = a.f53843a;
                            if (context2 != null) {
                                try {
                                    Intent intent2 = new Intent(context2, SswoActivity.class);
                                    intent2.addFlags(268435456);
                                    context2.startActivity(intent2);
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    } else if ("android.intent.action.USER_PRESENT".equals(action) || "android.intent.action.SCREEN_ON".equals(action)) {
                        C19495a.m47729a(context).mo40652b();
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }
}

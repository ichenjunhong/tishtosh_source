package com.bytedance.jirafast.p752ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.jirafast.ui.JIRANotification */
public class JIRANotification extends BroadcastReceiver {

    /* renamed from: a */
    private static boolean f31910a = false;

    /* renamed from: b */
    private static String f31911b = "jira_channel_01";

    /* renamed from: c */
    private static String f31912c = "JIRAFast";

    public void onReceive(Context context, Intent intent) {
        Method method;
        if (!f31910a && intent.getExtras() != null) {
            Object systemService = context.getSystemService("statusbar");
            if (systemService != null) {
                try {
                    Class cls = Class.forName("android.app.StatusBarManager");
                    if (VERSION.SDK_INT <= 16) {
                        method = cls.getMethod("collapse", new Class[0]);
                    } else {
                        method = cls.getMethod("collapsePanels", new Class[0]);
                    }
                    method.setAccessible(true);
                    method.invoke(systemService, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }
}

package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.m */
public class C19588m implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"com.vivo.launcher", "com.bbk.launcher2"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            try {
                Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                intent.putExtra("packageName", context.getPackageName());
                intent.putExtra("className", componentName.getClassName());
                intent.putExtra("notificationNum", i);
                if (VERSION.SDK_INT >= 26) {
                    intent.addFlags(16777216);
                }
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                throw new C19610g(th.getMessage());
            }
        }
    }
}

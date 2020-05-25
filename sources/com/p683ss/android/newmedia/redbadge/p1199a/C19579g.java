package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.p1201c.C19600a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.g */
public class C19579g implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
            intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
            intent.putExtra("com.htc.launcher.extra.COUNT", i);
            Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
            intent2.putExtra("packagename", componentName.getPackageName());
            intent2.putExtra("count", i);
            if (C19600a.m47943a(context, intent) || C19600a.m47943a(context, intent2)) {
                try {
                    context.sendBroadcast(intent);
                    context.sendBroadcast(intent2);
                } catch (Throwable th) {
                    throw new C19610g(th.getMessage());
                }
            } else {
                StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                sb.append(intent2.toString());
                throw new C19610g(sb.toString());
            }
        }
    }
}

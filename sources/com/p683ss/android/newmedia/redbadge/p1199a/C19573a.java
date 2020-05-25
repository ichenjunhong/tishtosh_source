package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.p1201c.C19600a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.a */
public class C19573a implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher", "org.adw.launcher.one"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("org.adw.launcher.counter.SEND");
            intent.putExtra("PNAME", componentName.getPackageName());
            intent.putExtra("CNAME", componentName.getClassName());
            intent.putExtra("COUNT", i);
            if (C19600a.m47943a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new C19610g(th.getMessage());
                }
            } else {
                StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                sb.append(intent.toString());
                throw new C19610g(sb.toString());
            }
        }
    }
}

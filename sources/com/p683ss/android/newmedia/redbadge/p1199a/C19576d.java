package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.p1201c.C19600a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.d */
public final class C19576d implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return new ArrayList(0);
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count", i);
            intent.putExtra("badge_count_package_name", componentName.getPackageName());
            intent.putExtra("badge_count_class_name", componentName.getClassName());
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

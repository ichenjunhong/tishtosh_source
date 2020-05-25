package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.p1201c.C19600a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.k */
public class C19583k implements C19572a {
    /* renamed from: a */
    public final List<String> mo40825a() {
        return Arrays.asList(new String[]{"com.smartisanos.launcher", "com.smartisanos.home"});
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            Intent intent = new Intent("com.smartisanos.launcher.new_message");
            intent.putExtra("extra_packagename", componentName.getPackageName());
            intent.putExtra("extra_componentname", componentName.getClassName());
            intent.putExtra("extra_message_count", i);
            if (C19600a.m47943a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new C19610g(th.getMessage());
                }
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("badge_num", i);
                try {
                    context.getContentResolver().call(Uri.parse("content://com.smartisanos.launcher.badge"), "updateMessageBadge", null, bundle);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                    sb.append(intent.toString());
                    throw new C19610g(sb.toString());
                }
            }
        }
    }
}

package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.p */
public class C19591p implements C19572a {

    /* renamed from: a */
    private final Uri f53973a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public final List<String> mo40825a() {
        return Collections.singletonList("com.zui.launcher");
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("app_badge_count", i);
                context.getContentResolver().call(this.f53973a, "setAppBadgeCount", null, bundle);
            } catch (Throwable th) {
                throw new C19610g(th.getMessage());
            }
        }
    }
}

package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.o */
public class C19590o implements C19572a {
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
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            bundle.putString("app_badge_component_name", componentName.flattenToString());
            try {
                context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", null, bundle);
            } catch (Throwable th) {
                throw new C19610g(th.getMessage());
            }
        }
    }
}

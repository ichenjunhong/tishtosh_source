package com.p683ss.android.newmedia.redbadge.p1199a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.newmedia.redbadge.C19572a;
import com.p683ss.android.newmedia.redbadge.C19610g;
import com.p683ss.android.newmedia.redbadge.p1201c.C19600a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.i */
public class C19581i implements C19572a {

    /* renamed from: a */
    private static int f53965a = -1;

    /* renamed from: b */
    private int f53966b = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: a */
    public final List<String> mo40825a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: a */
    public final void mo40826a(Context context, ComponentName componentName, int i) throws C19610g {
        if (context != null && componentName != null && this.f53966b != i && (this.f53966b <= 99 || i <= 99)) {
            this.f53966b = i;
            Intent intent = new Intent("com.oppo.unsettledevent");
            intent.putExtra("pakeageName", componentName.getPackageName());
            intent.putExtra("number", i);
            intent.putExtra("upgradeNumber", i);
            if (C19600a.m47943a(context, intent)) {
                try {
                    context.sendBroadcast(intent);
                } catch (Throwable th) {
                    throw new C19610g(th.getMessage());
                }
            } else {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("app_badge_count", i);
                    context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", null, bundle);
                } catch (Throwable unused) {
                    StringBuilder sb = new StringBuilder("unable to resolve intent: ");
                    sb.append(intent.toString());
                    throw new C19610g(sb.toString());
                }
            }
        }
    }
}

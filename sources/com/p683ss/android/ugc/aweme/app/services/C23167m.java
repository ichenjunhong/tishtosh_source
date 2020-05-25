package com.p683ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.service.C36688i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.services.m */
public final class C23167m implements C36688i {
    /* renamed from: a */
    public final Intent mo47882a() {
        Intent mainActivityIntent = MainActivity.getMainActivityIntent(C11010c.m22280a());
        C52711k.m112236a((Object) mainActivityIntent, "MainActivity.getMainActi….getApplicationContext())");
        return mainActivityIntent;
    }

    /* renamed from: b */
    public final Activity mo47883b() {
        C52711k.m112236a((Object) AwemeApplication.m56199a(), "AwemeApplication.getApplication()");
        return AwemeApplication.m56200b();
    }
}

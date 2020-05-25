package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.customtabs.C0367b;
import android.support.customtabs.C0376d;
import android.support.customtabs.C0378e;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.cv */
public final class C15817cv implements bdj {

    /* renamed from: a */
    C0378e f44793a;

    /* renamed from: b */
    C0367b f44794b;

    /* renamed from: c */
    C0376d f44795c;

    /* renamed from: d */
    public C15818cw f44796d;

    /* renamed from: a */
    public static boolean m37169a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(bdh.m35441a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo30911a(Activity activity) {
        if (this.f44794b == null) {
            String a = bdh.m35441a(activity);
            if (a != null) {
                this.f44795c = new bdi(this);
                C0367b.m917a(activity, a, this.f44795c);
            }
        }
    }

    /* renamed from: a */
    public final void mo30063a(C0367b bVar) {
        this.f44794b = bVar;
        this.f44794b.mo854a(0);
        if (this.f44796d != null) {
            this.f44796d.mo28679a();
        }
    }

    /* renamed from: a */
    public final void mo30062a() {
        this.f44794b = null;
        this.f44793a = null;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ie */
public final class C15963ie {

    /* renamed from: a */
    final Context f45064a;

    /* renamed from: b */
    final beh f45065b;

    /* renamed from: c */
    final View f45066c;

    public C15963ie(Context context, beh beh, View view) {
        this.f45064a = context;
        this.f45065b = beh;
        this.f45066c = view;
    }

    /* renamed from: a */
    static Intent m37783a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ResolveInfo mo31089a(Intent intent) {
        return mo31090a(intent, new ArrayList<>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ResolveInfo mo31090a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f45064a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = (ResolveInfo) queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            C14963ax.m30834d().mo28588a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    /* renamed from: a */
    static Intent m37782a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }
}

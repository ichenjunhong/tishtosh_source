package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class bdh {

    /* renamed from: a */
    private static String f41937a;

    /* renamed from: a */
    public static String m35441a(Context context) {
        if (f41937a != null) {
            return f41937a;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f41937a = null;
        } else if (arrayList.size() == 1) {
            f41937a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str) && !m35442a(context, intent) && arrayList.contains(str)) {
            f41937a = str;
        } else if (arrayList.contains("com.android.chrome")) {
            f41937a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f41937a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f41937a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f41937a = "com.google.android.apps.chrome";
        }
        return f41937a;
    }

    /* renamed from: a */
    private static boolean m35442a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (queryIntentActivities.size() != 0) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        IntentFilter intentFilter = resolveInfo.filter;
                        if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
        }
    }
}

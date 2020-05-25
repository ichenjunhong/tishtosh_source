package com.p683ss.android.ugc.aweme.share.systemshare;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.share.systemshare.SystemShareTargetChosenReceiver */
public class SystemShareTargetChosenReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private static String m92668a(Context context, ComponentName componentName) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = componentName.getPackageName();
            TextUtils.equals(packageName, C11010c.m22280a().getPackageName());
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            if (applicationInfo == null) {
                return "";
            }
            return applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            C9220a.m18312a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!(intent == null || context == null || VERSION.SDK_INT < 22)) {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                String str = null;
                String stringExtra = intent.getStringExtra("extra_type");
                if (!C9431p.m18664a(stringExtra)) {
                    str = m92669a(context, componentName, stringExtra);
                }
                if (C9431p.m18664a(str)) {
                    str = m92668a(context, componentName);
                }
                C26890h.m65011a("share_video_more_track", new C23089d().mo47829a("platform", str).mo47829a("package_name", componentName.getPackageName()).mo47829a("component_name", componentName.getClassName()).f61491a);
            }
        }
    }

    /* renamed from: a */
    private static String m92669a(Context context, ComponentName componentName, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
                if (resolveInfo.activityInfo != null && C9431p.m18665a(resolveInfo.activityInfo.name, componentName.getClassName()) && C9431p.m18665a(resolveInfo.activityInfo.packageName, componentName.getPackageName())) {
                    return resolveInfo.loadLabel(packageManager).toString();
                }
            }
        } catch (Throwable th) {
            C9220a.m18312a(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
        }
        return "";
    }
}

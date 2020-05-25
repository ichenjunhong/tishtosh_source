package android.support.p030v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

/* renamed from: android.support.v4.app.y */
public final class C0701y {
    /* renamed from: b */
    public static String m2031b(Activity activity) {
        try {
            return m2032b(activity, activity.getComponentName());
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static Intent m2029a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            Intent parentActivityIntent = activity.getParentActivityIntent();
            if (parentActivityIntent != null) {
                return parentActivityIntent;
            }
        }
        String b = m2031b(activity);
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, b);
        try {
            if (m2032b(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m2030a(Context context, ComponentName componentName) throws NameNotFoundException {
        Intent intent;
        String b = m2032b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        if (m2032b(context, componentName2) == null) {
            intent = Intent.makeMainActivity(componentName2);
        } else {
            intent = new Intent().setComponent(componentName2);
        }
        return intent;
    }

    /* renamed from: b */
    private static String m2032b(Context context, ComponentName componentName) throws NameNotFoundException {
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (VERSION.SDK_INT >= 16) {
            String str = activityInfo.parentActivityName;
            if (str != null) {
                return str;
            }
        }
        if (activityInfo.metaData == null) {
            return null;
        }
        String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
        if (string == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(string);
            string = sb.toString();
        }
        return string;
    }
}

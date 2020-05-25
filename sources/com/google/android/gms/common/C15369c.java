package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.util.C15518i;

/* renamed from: com.google.android.gms.common.c */
public class C15369c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C15384g.f39685b;
    private static final C15369c zzm = new C15369c();

    public static C15369c getInstance() {
        return zzm;
    }

    public boolean isUserResolvableError(int i) {
        if (i != 9) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    C15369c() {
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        int a = C15384g.m31956a(context, i);
        if (C15384g.m31964c(context, a)) {
            return 18;
        }
        return a;
    }

    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, errorResolutionIntent, 134217728);
    }

    public int getApkVersion(Context context) {
        return C15384g.m31965d(context);
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        return C15384g.m31964c(context, i);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return C15384g.m31960a(context, str);
    }

    private static String zza(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C15377d.m31951a(context).mo28321b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                if (context == null || !C15518i.m32285b(context)) {
                    String zza = zza(context, str);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                    if (!TextUtils.isEmpty(zza)) {
                        appendQueryParameter.appendQueryParameter("pcampaignid", zza);
                    }
                    intent.setData(appendQueryParameter.build());
                    intent.setPackage("com.android.vending");
                    intent.addFlags(524288);
                    return intent;
                }
                Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                intent2.setPackage("com.google.android.wearable.app");
                return intent2;
            case 3:
                Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
                Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent3.setData(fromParts);
                return intent3;
            default:
                return null;
        }
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        if (!C15384g.f39686c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public String getErrorString(int i) {
        return ConnectionResult.m31443a(i);
    }
}

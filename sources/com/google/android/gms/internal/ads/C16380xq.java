package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.xq */
public final class C16380xq extends ContextWrapper {
    public final Context getApplicationContext() {
        throw new NoSuchMethodError();
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageName() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageResourcePath() {
        throw new NoSuchMethodError();
    }

    public final synchronized void startActivity(Intent intent) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Context m39015a(Context context) {
        if (context instanceof C16380xq) {
            return ((C16380xq) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}

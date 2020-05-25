package com.bytedance.android.livesdk.p416t.p419c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.android.livesdk.t.c.f */
public class C8296f extends C8290a {
    /* renamed from: a */
    public final boolean mo14473a() {
        if (VERSION.SDK_INT == 23) {
            return true;
        }
        return super.mo14473a();
    }

    /* renamed from: a */
    public final Intent mo14472a(Context context) {
        String str;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
        intent.putExtra("pkg_name", context.getPackageName());
        String str2 = "app_name";
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            str = applicationInfo.nonLocalizedLabel.toString();
        } else {
            str = context.getString(i);
        }
        intent.putExtra(str2, str);
        intent.putExtra("class_name", C8296f.class.getSimpleName());
        return intent;
    }
}

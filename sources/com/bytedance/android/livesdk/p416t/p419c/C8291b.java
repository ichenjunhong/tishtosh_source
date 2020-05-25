package com.bytedance.android.livesdk.p416t.p419c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.bytedance.android.livesdk.t.c.b */
public final class C8291b extends C8290a {
    /* renamed from: a */
    public final boolean mo14473a() {
        return super.mo14473a();
    }

    /* renamed from: a */
    public final Intent mo14472a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        return intent;
    }
}

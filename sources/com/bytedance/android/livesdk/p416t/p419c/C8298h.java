package com.bytedance.android.livesdk.p416t.p419c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.bytedance.android.livesdk.t.c.h */
public final class C8298h extends C8290a {
    /* renamed from: a */
    public final boolean mo14473a() {
        return super.mo14473a();
    }

    /* renamed from: a */
    public final Intent mo14472a(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }
}

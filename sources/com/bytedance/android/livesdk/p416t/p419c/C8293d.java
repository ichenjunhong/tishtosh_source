package com.bytedance.android.livesdk.p416t.p419c;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.bytedance.android.livesdk.t.c.d */
public final class C8293d extends C8290a {
    /* renamed from: a */
    public final boolean mo14473a() {
        return true;
    }

    /* renamed from: a */
    public final Intent mo14472a(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("packageName", context.getPackageName());
        return intent;
    }
}

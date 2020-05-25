package com.bytedance.android.livesdk.p416t.p419c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.bytedance.android.livesdk.t.c.a */
public class C8290a implements C8292c {
    /* renamed from: a */
    public boolean mo14473a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo14474b() {
        return true;
    }

    /* renamed from: a */
    public Intent mo14472a(Context context) {
        StringBuilder sb = new StringBuilder("package:");
        sb.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
    }
}

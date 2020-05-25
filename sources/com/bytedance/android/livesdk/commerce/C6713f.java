package com.bytedance.android.livesdk.commerce;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.C4472a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p279af.C4581b;

/* renamed from: com.bytedance.android.livesdk.commerce.f */
public final class C6713f {
    /* renamed from: a */
    public static boolean m14094a(String str) {
        if (!C4472a.f12233a.booleanValue() || TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("market://details?id=") && !str.startsWith("https://play.google.com")) || !C4581b.m11010b("com.android.vending")) {
            return false;
        }
        Context context = TTLiveSDKContext.getHostService().mo10308a().context();
        if (context == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

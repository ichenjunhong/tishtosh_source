package com.bytedance.android.livesdk.feed.p342j;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.feed.j.b */
public final class C7007b {

    /* renamed from: a */
    private static C7007b f19143a = new C7007b();

    /* renamed from: a */
    public static void m14649a(Map<String, String> map, Context context) {
        if (context instanceof Activity) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("gd_label");
                if (!TextUtils.isEmpty(stringExtra)) {
                    map.put("gd_label", stringExtra);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14647a(Context context, Bundle bundle) {
        if ((context instanceof Activity) && bundle != null) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("gd_label");
                if (!TextUtils.isEmpty(stringExtra)) {
                    bundle.putString("gd_label", stringExtra);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m14648a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str) && !str.startsWith("livesdk_") && !"live_enter".equals(str)) {
            StringBuilder sb = new StringBuilder("livesdk_");
            sb.append(str);
            str = sb.toString();
        }
        map.put("sdk_version", "1510");
        map.put("_param_live_platform", CustomActionPushReceiver.f104061f);
        C6856b.m14400c().mo13043e().mo15567a(str, map);
    }
}

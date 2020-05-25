package com.bytedance.android.live.broadcast.utils;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.broadcast.utils.b */
public final class C3632b {
    /* renamed from: a */
    public static void m9464a(String str, String str2, String str3, String str4) {
        CharSequence charSequence;
        if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
            charSequence = "system_position";
        } else if (str.equals("android.permission.READ_PHONE_STATE")) {
            charSequence = "call";
        } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
            charSequence = "save";
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C8059j jVar = new C8059j();
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(null)) {
                jVar.mo14216d(null);
            }
            if (!TextUtils.isEmpty(str4)) {
                jVar.mo14219g(str4);
            }
            hashMap.put("popup_type", charSequence);
            C8049c.m15979a().mo14202a("system_popup", hashMap, jVar.mo14214b("video").mo14218f(str2));
        }
    }
}

package com.bytedance.android.live.broadcast.preview;

import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.p683ss.android.ugc.aweme.keva.C35807d;

/* renamed from: com.bytedance.android.live.broadcast.preview.c */
public final class C3558c {
    /* renamed from: a */
    public static String m9387a() {
        String str;
        if (C8830k.m17331e().mo13039a().isLocalTest()) {
            SharedPreferences a = C35807d.m80935a(C8830k.m17329c(), "test_setting", 0);
            String str2 = "pref_carrier";
            if (((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion()) {
                str = "US";
            } else {
                str = "ID";
            }
            String string = a.getString(str2, str);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String str3 = "";
        try {
            str3 = ((TelephonyManager) C8830k.m17329c().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str3)) {
            str3 = str3.toUpperCase();
        }
        return str3;
    }
}

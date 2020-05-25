package com.p683ss.android.ugc.aweme.language;

import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.language.o */
public final class C35853o {
    /* renamed from: a */
    public static final String m80992a() {
        String b = m80994b();
        if (TextUtils.isEmpty(b)) {
            b = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysRegion();
            if (TextUtils.isEmpty(b)) {
                b = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getRegion();
            }
        }
        if (TextUtils.isEmpty(b)) {
            b = "";
        }
        return b.toUpperCase();
    }

    /* renamed from: b */
    public static final String m80994b() {
        if (C35836g.m80971a()) {
            String string = C35807d.m80935a(C11010c.m22280a(), "test_setting", 0).getString("pref_carrier", "US");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String str = "";
        try {
            str = ((TelephonyManager) C11010c.m22280a().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.toUpperCase();
        }
        return str;
    }

    /* renamed from: a */
    public static final boolean m80993a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Arrays.asList(new String[]{"AT", "BE", "BG", "HR", "CY", "CZ", "EE", "FI", "FR", "DE", "GR", "HU", "IE", "IT", "LV", "LT", "LU", "MT", "NL", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "GB"}).contains(str.toUpperCase());
    }
}

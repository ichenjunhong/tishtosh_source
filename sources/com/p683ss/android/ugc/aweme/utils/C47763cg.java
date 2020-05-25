package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.cg */
public final class C47763cg {
    /* renamed from: a */
    private static boolean m103390a(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: b */
    private static boolean m103393b(String str) {
        if (str == null || !str.toLowerCase().contains("tiktok")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m103391a(String str, Context context) {
        if (str == null || str.length() < 2) {
            C10691a.m21548c(context, (int) R.string.hfg).mo19066a();
            return false;
        } else if (str != null && str.length() > 24) {
            C10691a.m21548c(context, (int) R.string.hfh).mo19066a();
            return false;
        } else if (!str.matches("[0-9A-Za-z_.]*")) {
            C10691a.m21548c(context, (int) R.string.hfd).mo19066a();
            return false;
        } else if (!m103390a(str)) {
            return true;
        } else {
            C10691a.m21548c(context, (int) R.string.hfe).mo19066a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m103392a(String str, String str2, String str3, Context context) {
        if (m103393b(str3) || TextUtils.equals(str, "2062")) {
            C10691a.m21542b(context, (int) R.string.bdo).mo19066a();
            return false;
        } else if (TextUtils.equals(str, "2064")) {
            C10691a.m21548c(context, (int) R.string.hff).mo19066a();
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            return true;
        } else {
            C10691a.m21551c(context, str2).mo19066a();
            return false;
        }
    }
}

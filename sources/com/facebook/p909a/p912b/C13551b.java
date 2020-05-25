package com.facebook.p909a.p912b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.facebook.C14533n;
import com.facebook.internal.C14277aa;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.a.b.b */
public final class C13551b {
    /* renamed from: a */
    public static String m27371a() {
        Context g = C14533n.m29773g();
        try {
            return g.getPackageManager().getPackageInfo(g.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static double m27370a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            }
            return NumberFormat.getNumberInstance(C14277aa.m29281b()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
    }
}

package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.c */
public final class C39442c {
    /* renamed from: b */
    private static double m87698b(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    /* renamed from: a */
    private static double m87690a(double d) {
        double sin = Math.sin(d / 2.0d);
        return sin * sin;
    }

    /* renamed from: a */
    public static double m87692a(double[] dArr, double[] dArr2) {
        return m87691a(dArr[0], dArr[1], dArr2[0], dArr2[1]);
    }

    /* renamed from: a */
    public static String m87693a(Context context, double d) {
        if (d > 10.0d) {
            return C2240a.m6772a(context.getResources().getString(R.string.cqv), new Object[]{Integer.valueOf((int) d)});
        } else if (d > 1.0d) {
            return C2240a.m6772a(context.getResources().getString(R.string.h24), new Object[]{Double.valueOf(d)});
        } else if (d > 0.1d) {
            return C2240a.m6772a(context.getResources().getString(R.string.cqw), new Object[]{Integer.valueOf((int) (d * 1000.0d))});
        } else {
            return C2240a.m6772a(context.getResources().getString(R.string.cqu), new Object[]{"<"});
        }
    }

    /* renamed from: a */
    public static String m87695a(Context context, PoiStruct poiStruct) {
        double d;
        double d2;
        C36282r a = C36286a.m81925a().mo75118a();
        if (a == null || poiStruct == null || TextUtils.isEmpty(poiStruct.poiLatitude) || TextUtils.isEmpty(poiStruct.poiLongitude)) {
            return "";
        }
        double parseDouble = Double.parseDouble(poiStruct.poiLatitude);
        double parseDouble2 = Double.parseDouble(poiStruct.poiLongitude);
        double latitude = a.getLatitude();
        double longitude = a.getLongitude();
        if (!a.isGaode()) {
            double[] a2 = C39440a.m87681a(longitude, latitude);
            double d3 = a2[0];
            d2 = a2[1];
            d = d3;
        } else {
            d = longitude;
            d2 = latitude;
        }
        return m87694a(context, parseDouble, parseDouble2, d2, d);
    }

    /* renamed from: a */
    public static double[] m87696a(double d, double d2) {
        double[] dArr = {ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT};
        try {
            double[] a = C39440a.m87681a(d2, d);
            dArr[0] = a[1];
            dArr[1] = a[0];
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
        return dArr;
    }

    /* renamed from: a */
    public static double[] m87697a(String str, String str2) {
        try {
            return m87696a(Double.parseDouble(str), Double.parseDouble(str2));
        } catch (Exception e) {
            C32458a.m75143a(e);
            return new double[]{ProfileUiInitOptimizeEnterThreshold.DEFAULT, ProfileUiInitOptimizeEnterThreshold.DEFAULT};
        }
    }

    /* renamed from: a */
    public static double m87691a(double d, double d2, double d3, double d4) {
        double b = m87698b(d);
        double b2 = m87698b(d2);
        double b3 = m87698b(d3);
        return Math.asin(Math.sqrt(m87690a(Math.abs(b - b3)) + (Math.cos(b) * Math.cos(b3) * m87690a(Math.abs(b2 - m87698b(d4)))))) * 12742.0d;
    }

    /* renamed from: c */
    public static String m87700c(Context context, double d, double d2, double d3, double d4) {
        return m87693a(context, m87691a(d, d2, d3, d4));
    }

    /* renamed from: b */
    public static String m87699b(Context context, double d, double d2, double d3, double d4) {
        double a = m87691a(d, d2, d3, d4);
        return C2240a.m6772a(context.getResources().getString(R.string.cqs), new Object[]{Double.valueOf(a)});
    }

    /* renamed from: a */
    public static String m87694a(Context context, double d, double d2, double d3, double d4) {
        double[] a = m87696a(d, d2);
        return m87700c(context, a[0], a[1], d3, d4);
    }
}

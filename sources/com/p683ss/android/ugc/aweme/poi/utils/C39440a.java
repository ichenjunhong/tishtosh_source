package com.p683ss.android.ugc.aweme.poi.utils;

import com.C2240a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.a */
public final class C39440a {

    /* renamed from: a */
    public static double f100859a = 52.35987755982988d;

    /* renamed from: b */
    static double f100860b = 3.141592653589793d;

    /* renamed from: c */
    static double f100861c = 6378245.0d;

    /* renamed from: d */
    static double f100862d = 0.006693421622965943d;

    /* renamed from: e */
    private static boolean m87687e(double d, double d2) {
        return true;
    }

    /* renamed from: a */
    public static String[] m87682a(C36282r rVar) {
        String str;
        String str2;
        if (rVar.isGaode()) {
            double[] b = m87684b(rVar.getLongitude(), rVar.getLatitude());
            str2 = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(b[0])});
            str = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(b[1])});
        } else {
            str2 = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(rVar.getLongitude())});
            str = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(rVar.getLatitude())});
        }
        return new String[]{str, str2};
    }

    /* renamed from: a */
    public static String[] m87683a(C39054d dVar) {
        String str;
        String str2;
        if (dVar.isGaode) {
            double[] b = m87684b(dVar.longitude, dVar.latitude);
            str2 = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(b[0])});
            str = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(b[1])});
        } else {
            str2 = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(dVar.longitude)});
            str = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(dVar.latitude)});
        }
        return new String[]{str, str2};
    }

    /* renamed from: a */
    public static double[] m87681a(double d, double d2) {
        if (m87687e(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double c = m87685c(d3, d4);
        double d5 = m87686d(d3, d4);
        double d6 = (d2 / 180.0d) * f100860b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((f100862d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        return new double[]{d + ((d5 * 180.0d) / (((f100861c / sqrt) * Math.cos(d6)) * f100860b)), d2 + ((c * 180.0d) / (((f100861c * (1.0d - f100862d)) / (d7 * sqrt)) * f100860b))};
    }

    /* renamed from: b */
    public static double[] m87684b(double d, double d2) {
        if (m87687e(d, d2)) {
            return new double[]{d, d2};
        }
        double d3 = d - 105.0d;
        double d4 = d2 - 35.0d;
        double c = m87685c(d3, d4);
        double d5 = m87686d(d3, d4);
        double d6 = (d2 / 180.0d) * f100860b;
        double sin = Math.sin(d6);
        double d7 = 1.0d - ((f100862d * sin) * sin);
        double sqrt = Math.sqrt(d7);
        double d8 = d * 2.0d;
        return new double[]{d8 - (d + ((d5 * 180.0d) / (((f100861c / sqrt) * Math.cos(d6)) * f100860b))), (d2 * 2.0d) - (d2 + ((c * 180.0d) / (((f100861c * (1.0d - f100862d)) / (d7 * sqrt)) * f100860b)))};
    }

    /* renamed from: c */
    private static double m87685c(double d, double d2) {
        double d3 = d * 2.0d;
        return -100.0d + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (Math.sqrt(Math.abs(d)) * 0.2d) + ((((Math.sin((d * 6.0d) * f100860b) * 20.0d) + (Math.sin(d3 * f100860b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f100860b * d2) * 20.0d) + (Math.sin((d2 / 3.0d) * f100860b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d2 / 12.0d) * f100860b) * 160.0d) + (Math.sin((d2 * f100860b) / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    /* renamed from: d */
    private static double m87686d(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (Math.sqrt(Math.abs(d)) * 0.1d) + ((((Math.sin((6.0d * d) * f100860b) * 20.0d) + (Math.sin((d * 2.0d) * f100860b) * 20.0d)) * 2.0d) / 3.0d) + ((((Math.sin(f100860b * d) * 20.0d) + (Math.sin((d / 3.0d) * f100860b) * 40.0d)) * 2.0d) / 3.0d) + ((((Math.sin((d / 12.0d) * f100860b) * 150.0d) + (Math.sin((d / 30.0d) * f100860b) * 300.0d)) * 2.0d) / 3.0d);
    }
}

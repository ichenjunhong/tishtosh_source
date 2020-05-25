package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.nn */
public final class C16107nn {
    /* renamed from: a */
    public static auw m38101a(bpz bpz) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        bpz bpz2 = bpz;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = bpz2.f43519c;
        String str = (String) map.get("Date");
        long a = str != null ? m38100a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? m38100a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? m38100a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                j3 = (j * 1000) + j4;
                auw auw = new auw();
                auw.f41390a = bpz2.f43518b;
                auw.f41391b = str5;
                auw.f41395f = j4;
                auw.f41394e = j3;
                auw.f41392c = a;
                auw.f41393d = a3;
                auw.f41396g = map;
                auw.f41397h = bpz2.f43520d;
                return auw;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            auw auw2 = new auw();
            auw2.f41390a = bpz2.f43518b;
            auw2.f41391b = str5;
            auw2.f41395f = j4;
            auw2.f41394e = j3;
            auw2.f41392c = a;
            auw2.f41393d = a3;
            auw2.f41396g = map;
            auw2.f41397h = bpz2.f43520d;
            return auw2;
        }
        j3 = j4;
        auw auw22 = new auw();
        auw22.f41390a = bpz2.f43518b;
        auw22.f41391b = str5;
        auw22.f41395f = j4;
        auw22.f41394e = j3;
        auw22.f41392c = a;
        auw22.f41393d = a3;
        auw22.f41396g = map;
        auw22.f41397h = bpz2.f43520d;
        return auw22;
    }

    /* renamed from: a */
    private static long m38100a(String str) {
        try {
            return m38102a().parse(str).getTime();
        } catch (ParseException unused) {
            new Object[1][0] = str;
            return 0;
        }
    }

    /* renamed from: a */
    static SimpleDateFormat m38102a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}

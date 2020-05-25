package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.az */
public final class C35213az {

    /* renamed from: a */
    public static final C35213az f90499a = new C35213az();

    /* renamed from: b */
    private static final SimpleDateFormat f90500b = new SimpleDateFormat("HH:mm", Locale.US);

    private C35213az() {
    }

    /* renamed from: a */
    public static String m79600a(Calendar calendar, long j) {
        C52711k.m112240b(calendar, "calendar");
        String format = f90500b.format(calendar.getTime());
        C52711k.m112236a((Object) format, "s24HourTimeFormat.format(calendar.time)");
        return format;
    }
}

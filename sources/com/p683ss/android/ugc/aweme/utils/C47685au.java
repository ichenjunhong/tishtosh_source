package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.utils.au */
public final class C47685au {

    /* renamed from: com.ss.android.ugc.aweme.utils.au$a */
    public static class C47686a {

        /* renamed from: a */
        public long f120166a;

        /* renamed from: b */
        public long f120167b;
    }

    /* renamed from: a */
    private static C47686a m103201a() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, -1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(5, -1);
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        C47686a aVar = new C47686a();
        aVar.f120166a = time;
        aVar.f120167b = time2;
        return aVar;
    }

    /* renamed from: b */
    private static C47686a m103203b() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long time = instance.getTime().getTime();
        Calendar instance2 = Calendar.getInstance();
        instance2.set(11, 23);
        instance2.set(12, 59);
        instance2.set(13, 59);
        instance2.set(14, 999);
        long time2 = instance2.getTime().getTime();
        C47686a aVar = new C47686a();
        aVar.f120166a = time;
        aVar.f120167b = time2;
        return aVar;
    }

    /* renamed from: c */
    public static int m103205c(long j) {
        return C23728o.m58245b(m103206d(j));
    }

    /* renamed from: d */
    private static long m103206d(long j) {
        return j + ((long) TimeZone.getDefault().getRawOffset());
    }

    /* renamed from: a */
    public static boolean m103202a(long j) {
        C47686a b = m103203b();
        if (j <= b.f120166a || j >= b.f120167b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m103204b(long j) {
        C47686a a = m103201a();
        if (j <= a.f120166a || j >= a.f120167b) {
            return false;
        }
        return true;
    }
}

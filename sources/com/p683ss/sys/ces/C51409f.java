package com.p683ss.sys.ces;

import android.content.Context;
import com.p683ss.p1096a.p1098b.C18481a;
import com.p683ss.sys.ces.p2580a.C51380a;
import java.security.MessageDigest;
import java.util.Calendar;

/* renamed from: com.ss.sys.ces.f */
public final class C51409f {
    /* renamed from: a */
    public static String m110570a() {
        try {
            Context applicationContext = C51393c.m110533a().f128514c != null ? C51393c.m110533a().f128514c : C51380a.m110501b().getApplicationContext();
            return C18481a.m44725a(MessageDigest.getInstance("SHA1").digest(applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 64).signatures[0].toByteArray())).toUpperCase();
        } catch (Throwable unused) {
            return "0000000000000000000000000000000000000000";
        }
    }

    /* renamed from: a */
    public static String m110571a(String str) {
        String str2 = "";
        int timeInMillis = (int) (Calendar.getInstance().getTimeInMillis() / 1000);
        String c = C51393c.m110537c();
        String d = C51393c.m110538d();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(c);
            sb.append("_");
            sb.append(d);
            sb.append("_");
            sb.append(timeInMillis);
            return C18481a.m44725a((byte[]) C51379a.meta(601, null, sb.toString().getBytes()));
        } catch (Throwable unused) {
            return str2;
        }
    }
}

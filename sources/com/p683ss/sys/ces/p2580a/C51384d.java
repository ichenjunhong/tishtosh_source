package com.p683ss.sys.ces.p2580a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.p1096a.p1098b.C18481a;
import com.p683ss.p1096a.p1098b.C18483c;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.sys.ces.a.d */
public final class C51384d {
    /* renamed from: a */
    public static String m110513a() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = null;
        }
        return C18483c.m44730a(str);
    }

    /* renamed from: a */
    public static String m110514a(Context context) {
        String str;
        try {
            Locale locale = context.getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            str = sb.toString();
        } catch (Throwable unused) {
            str = null;
        }
        return C18483c.m44730a(str);
    }

    /* renamed from: b */
    public static String m110515b(Context context) {
        double d;
        try {
            Class cls = Class.forName(new String(C18481a.m44726a("636f6d2e616e64726f69642e696e7465726e616c2e6f732e506f77657250726f66696c65")));
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            Method declaredMethod = cls.getDeclaredMethod(new String(C18481a.m44726a("67657441766572616765506f776572")), new Class[]{String.class});
            declaredMethod.setAccessible(true);
            d = ((Double) declaredMethod.invoke(newInstance, new Object[]{new String(C18481a.m44726a("626174746572792e6361706163697479"))})).doubleValue();
        } catch (Throwable unused) {
            d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
        }
        return Integer.toString((int) d);
    }
}

package com.p683ss.android.p1103ad.p1104a.p1108c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Random;

/* renamed from: com.ss.android.ad.a.c.f */
public final class C18541f {

    /* renamed from: a */
    private static int f51092a = 16;

    /* renamed from: b */
    private static String f51093b = "-";

    /* renamed from: a */
    public static Activity m44861a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    private static String m44862a(int i) {
        String str = "abcdefghijklmnopqrstuvwxyz0123456789";
        int length = str.length();
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(str.charAt(random.nextInt(length)));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m44863a(Long l) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(l));
        sb.append(f51093b);
        sb.append(m44862a(f51092a));
        sb.append(f51093b);
        sb.append(String.valueOf(System.currentTimeMillis()));
        return sb.toString();
    }
}

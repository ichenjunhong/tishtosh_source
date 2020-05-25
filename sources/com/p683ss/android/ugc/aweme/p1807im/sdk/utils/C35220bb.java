package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.utils.C47685au;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bb */
public final class C35220bb {

    /* renamed from: a */
    private static final SimpleDateFormat f90516a = new SimpleDateFormat("MM-dd", Locale.US);

    /* renamed from: b */
    private static final SimpleDateFormat f90517b = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    /* renamed from: c */
    private static final SimpleDateFormat f90518c = new SimpleDateFormat("HH:mm", Locale.US);

    /* renamed from: a */
    private static String m79610a(Date date) {
        String[] stringArray = C11010c.m22280a().getResources().getStringArray(R.array.w);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(7) - 1;
        if (i < 0) {
            i = 0;
        }
        return stringArray[i];
    }

    /* renamed from: b */
    public static String m79611b(Context context, long j) {
        if (j == 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f90516a.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 300000) {
            return context.getResources().getString(R.string.bkk);
        }
        if (C47685au.m103202a(j)) {
            return C35213az.m79600a(instance, j);
        }
        if (C47685au.m103204b(j)) {
            return context.getResources().getString(R.string.bqi);
        }
        if (currentTimeMillis <= 259200000) {
            return m79610a(new Date(j));
        }
        return f90516a.format(instance.getTime());
    }

    /* renamed from: a */
    public static String m79609a(Context context, long j) {
        if (j == 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f90516a.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 300000) {
            return context.getResources().getString(R.string.bkk);
        }
        if (C47685au.m103202a(j)) {
            return f90518c.format(instance.getTime());
        }
        if (C47685au.m103204b(j)) {
            return context.getResources().getString(R.string.bqi);
        }
        if (currentTimeMillis <= 259200000) {
            return m79610a(new Date(j));
        }
        return f90516a.format(instance.getTime());
    }

    /* renamed from: c */
    public static String m79612c(Context context, long j) {
        if (j == 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f90516a.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 300000) {
            return context.getResources().getString(R.string.bkk);
        }
        if (C47685au.m103202a(j)) {
            return C35213az.m79600a(instance, j);
        }
        if (C47685au.m103204b(j)) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getResources().getString(R.string.bqi));
            sb.append(" ");
            sb.append(f90518c.format(instance.getTime()));
            return sb.toString();
        } else if (currentTimeMillis > 259200000) {
            return f90517b.format(instance.getTime());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m79610a(new Date(j)));
            sb2.append(" ");
            sb2.append(f90518c.format(instance.getTime()));
            return sb2.toString();
        }
    }
}

package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.ss.android.ugc.trill.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.utils.fw */
public final class C47903fw {

    /* renamed from: a */
    public static final SimpleDateFormat f120495a = new SimpleDateFormat("yyyy-MM-dd", f120497c);

    /* renamed from: b */
    public static final SimpleDateFormat f120496b = new SimpleDateFormat("MM-dd", f120497c);

    /* renamed from: c */
    private static Locale f120497c = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getCountryLocale();

    /* renamed from: d */
    private static final SimpleDateFormat f120498d = new SimpleDateFormat("MM-dd", Locale.getDefault());

    /* renamed from: e */
    private static final SimpleDateFormat f120499e = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* renamed from: a */
    public static long m103623a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            return simpleDateFormat.parse(str).getTime() / 1000;
        } catch (ParseException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static int m103622a(long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= FbUploadTokenTime.group0) {
            return 1;
        }
        if (timeInMillis <= 172800000) {
            return 2;
        }
        if (timeInMillis <= 604800000) {
            return 3;
        }
        if (timeInMillis <= 2592000000L) {
            return 4;
        }
        return 5;
    }

    /* renamed from: c */
    public static String m103626c(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            return context.getString(R.string.bu6);
        }
        if (timeInMillis < 3600000) {
            return context.getString(R.string.dy1, new Object[]{Long.valueOf(timeInMillis / 60000)});
        } else if (timeInMillis < FbUploadTokenTime.group0) {
            return context.getString(R.string.dxz, new Object[]{Long.valueOf(timeInMillis / 3600000)});
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.dxx, new Object[]{Long.valueOf(timeInMillis / FbUploadTokenTime.group0)});
        } else {
            return context.getString(R.string.dy4, new Object[]{Long.valueOf(timeInMillis / 604800000)});
        }
    }

    /* renamed from: a */
    public static String m103624a(Context context, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        if (instance.get(1) < Calendar.getInstance().get(1)) {
            return f120498d.format(instance.getTime());
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 60000) {
            return context.getString(R.string.bu6);
        }
        if (currentTimeMillis <= 3600000) {
            return context.getString(R.string.c6l, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
        } else if (currentTimeMillis <= FbUploadTokenTime.group0) {
            return context.getString(R.string.bcs, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
        } else if (currentTimeMillis > 259200000) {
            return f120499e.format(instance.getTime());
        } else {
            return context.getString(R.string.ant, new Object[]{Long.valueOf(currentTimeMillis / FbUploadTokenTime.group0)});
        }
    }

    /* renamed from: b */
    public static String m103625b(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 <= 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.d82, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.dy1, new Object[]{Long.valueOf(timeInMillis / 60000)});
        } else if (timeInMillis < FbUploadTokenTime.group0) {
            return context.getString(R.string.dxz, new Object[]{Long.valueOf(timeInMillis / 3600000)});
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.dxx, new Object[]{Long.valueOf(timeInMillis / FbUploadTokenTime.group0)});
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > FbUploadTokenTime.group0) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + FbUploadTokenTime.group0) {
                    return f120496b.format(instance.getTime());
                }
                return f120495a.format(instance.getTime());
            }
            return context.getString(R.string.dy4, new Object[]{Integer.valueOf(1)});
        }
    }

    /* renamed from: d */
    public static String m103627d(Context context, long j) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j2 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j2 == 0) {
                j2 = 1;
            }
            objArr[0] = Long.valueOf(j2);
            return context.getString(R.string.dy3, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.dy2, new Object[]{Long.valueOf(timeInMillis / 60000)});
        } else if (timeInMillis < FbUploadTokenTime.group0) {
            return context.getString(R.string.dy0, new Object[]{Long.valueOf(timeInMillis / 3600000)});
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.dxy, new Object[]{Long.valueOf(timeInMillis / FbUploadTokenTime.group0)});
        } else {
            long j3 = timeInMillis - 604800000;
            if (j3 <= 0 || j3 > FbUploadTokenTime.group0) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j >= instance2.getTimeInMillis() + FbUploadTokenTime.group0) {
                    return f120496b.format(instance.getTime());
                }
                return f120495a.format(instance.getTime());
            }
            return context.getString(R.string.dy5, new Object[]{Integer.valueOf(1)});
        }
    }
}

package com.p683ss.android.medialib.p1184e;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.ss.android.medialib.e.a */
public class C19314a {

    /* renamed from: a */
    private static boolean f53349a;

    /* renamed from: b */
    private static String f53350b;

    /* renamed from: c */
    private static String f53351c;

    /* renamed from: d */
    private static String f53352d;

    /* renamed from: e */
    private static String f53353e;

    /* renamed from: f */
    private static String f53354f;

    /* renamed from: g */
    private static String f53355g;

    /* renamed from: h */
    private static String f53356h;

    /* renamed from: i */
    private static String f53357i;

    /* renamed from: j */
    private static String f53358j;

    /* renamed from: k */
    private static String f53359k;

    /* renamed from: l */
    private static String f53360l;

    /* renamed from: m */
    private static String f53361m;

    /* renamed from: n */
    private static String f53362n;

    /* renamed from: o */
    private static String f53363o;

    /* renamed from: p */
    private static String f53364p;

    /* renamed from: a */
    private static String m47171a() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i++) {
                    sb.append(strArr[i]);
                    if (i != strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.CPU_ABI);
        sb2.append(",");
        sb2.append(Build.CPU_ABI2);
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m47172a(Context context) {
        String str;
        long j;
        int i;
        if (!f53349a) {
            synchronized (C19314a.class) {
                if (!f53349a) {
                    Context applicationContext = context.getApplicationContext();
                    String language = Locale.getDefault().getLanguage();
                    String country = Locale.getDefault().getCountry();
                    if (TextUtils.isEmpty(country)) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder("_");
                        sb.append(country.toUpperCase());
                        str = sb.toString();
                    }
                    f53350b = Build.MODEL;
                    f53351c = C19315b.m47174a();
                    f53352d = C19315b.m47177b();
                    f53353e = String.valueOf(C19315b.m47178c());
                    f53354f = String.valueOf(C19315b.m47180d());
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    if (VERSION.SDK_INT >= 18) {
                        j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 1048576;
                    } else {
                        j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
                    }
                    f53355g = String.valueOf(j);
                    f53356h = String.valueOf(C19315b.m47173a(applicationContext));
                    f53359k = String.valueOf(VERSION.SDK_INT);
                    if (applicationContext == null) {
                        i = 0;
                    } else {
                        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                        i = displayMetrics.widthPixels;
                    }
                    f53357i = String.valueOf(i);
                    f53358j = String.valueOf(C19315b.m47176b(applicationContext));
                    String string = C35807d.m80935a(applicationContext, "ShortVideo", 0).getString("DeviceId", null);
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        C35807d.m80935a(applicationContext, "ShortVideo", 0).edit().putString("DeviceId", string).apply();
                    }
                    f53360l = string;
                    f53361m = applicationContext.getPackageName();
                    f53362n = m47171a();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(language);
                    sb2.append(str);
                    f53363o = sb2.toString();
                    f53364p = C19315b.m47179c(applicationContext);
                    f53349a = true;
                }
            }
        }
    }
}

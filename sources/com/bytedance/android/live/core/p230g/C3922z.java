package com.bytedance.android.live.core.p230g;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import java.util.Locale;

/* renamed from: com.bytedance.android.live.core.g.z */
public final class C3922z {
    /* renamed from: a */
    public static Resources m9901a() {
        Context e = m9915e();
        if (e == null) {
            return null;
        }
        return e.getResources();
    }

    /* renamed from: c */
    public static int m9910c() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m9908b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: e */
    public static Context m9915e() {
        IHostContext iHostContext = (IHostContext) C4116c.m10249a(IHostContext.class);
        if (iHostContext != null) {
            return iHostContext.context();
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m9916f() {
        if (m9901a() == null || m9901a().getConfiguration().orientation == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final int m9912d() {
        int i;
        Context e = m9915e();
        if (e == null) {
            i = 0;
        } else {
            i = e.getResources().getIdentifier("status_bar_height", "dimen", "android");
        }
        if (i > 0) {
            return e.getResources().getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: b */
    public static float m9907b(float f) {
        return TypedValue.applyDimension(2, f, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: e */
    public static float m9914e(int i) {
        return ((float) i) / Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static int m9899a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static Drawable m9911c(int i) {
        Context e = m9915e();
        if (e == null || e.getResources() == null) {
            return null;
        }
        return e.getResources().getDrawable(i);
    }

    /* renamed from: d */
    public static int m9913d(int i) {
        Context e = m9915e();
        if (e == null || e.getResources() == null) {
            return 0;
        }
        return (int) e.getResources().getDimension(i);
    }

    /* renamed from: b */
    public static int m9909b(int i) {
        Context e = m9915e();
        if (e == null || e.getResources() == null) {
            return 0;
        }
        return e.getResources().getColor(i);
    }

    /* renamed from: f */
    public static String[] m9917f(int i) {
        Context e = m9915e();
        if (e == null) {
            return new String[0];
        }
        return e.getResources().getStringArray(i);
    }

    /* renamed from: a */
    public static DisplayMetrics m9902a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (VERSION.SDK_INT >= 17) {
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            try {
                Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            } catch (Exception unused) {
            }
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static String m9903a(int i) {
        Context e = m9915e();
        if (e == null) {
            return null;
        }
        return e.getString(i);
    }

    /* renamed from: a */
    public static String m9906a(Locale locale, int i) {
        return m9903a(i);
    }

    /* renamed from: a */
    public static int m9900a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            if (!str.startsWith("#")) {
                StringBuilder sb = new StringBuilder("#");
                sb.append(str);
                str = sb.toString();
            }
            return Color.parseColor(str);
        } catch (IllegalArgumentException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static String m9905a(int i, Object... objArr) {
        Context e = m9915e();
        if (e == null) {
            return null;
        }
        return e.getString(i, objArr);
    }

    /* renamed from: a */
    public static String m9904a(int i, int i2, Object... objArr) {
        Context e = m9915e();
        if (e == null) {
            return null;
        }
        return e.getResources().getQuantityString(i, i2, objArr);
    }
}

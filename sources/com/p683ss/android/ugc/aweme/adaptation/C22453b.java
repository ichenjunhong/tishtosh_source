package com.p683ss.android.ugc.aweme.adaptation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.experiment.FullScreenReadAdaptionExperiment;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.story.api.model.C46629a;

/* renamed from: com.ss.android.ugc.aweme.adaptation.b */
public final class C22453b {

    /* renamed from: a */
    public static final int f60461a = C23728o.m58241a(11.0d);

    /* renamed from: b */
    public static final int f60462b = C23728o.m58241a(8.0d);

    /* renamed from: i */
    static int f60463i;

    /* renamed from: j */
    static int f60464j;

    /* renamed from: o */
    private static boolean f60465o = C10181b.m20511a().mo18172a(FullScreenReadAdaptionExperiment.class, true, "enable_full_screen_read_adaption", 31744, true);

    /* renamed from: p */
    private static int f60466p = -1;

    /* renamed from: c */
    public int f60467c;

    /* renamed from: d */
    public int f60468d;

    /* renamed from: e */
    public int f60469e;

    /* renamed from: f */
    public int f60470f;

    /* renamed from: g */
    public boolean f60471g;

    /* renamed from: h */
    public C46629a f60472h;

    /* renamed from: k */
    public boolean f60473k;

    /* renamed from: l */
    public boolean f60474l;

    /* renamed from: m */
    public boolean f60475m;

    /* renamed from: n */
    public boolean f60476n;

    /* renamed from: com.ss.android.ugc.aweme.adaptation.b$a */
    static class C22455a {

        /* renamed from: a */
        public static C22453b f60488a = new C22453b();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.b$b */
    public interface C22456b {
        /* renamed from: a */
        void mo46747a();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.b$c */
    public interface C22457c {
        /* renamed from: a */
        void mo46748a();
    }

    /* renamed from: com.ss.android.ugc.aweme.adaptation.b$d */
    public interface C22458d {
        void aA_();
    }

    /* renamed from: a */
    public static C22453b m55505a() {
        return C22455a.f60488a;
    }

    /* renamed from: a */
    public static boolean m55507a(MotionEvent motionEvent, Context context) {
        return false;
    }

    /* renamed from: c */
    public static boolean m55510c() {
        return f60465o;
    }

    /* renamed from: d */
    public static int m55511d() {
        return f60463i;
    }

    /* renamed from: e */
    public static int m55513e() {
        return f60464j;
    }

    private C22453b() {
        this.f60472h = new C46629a();
    }

    /* renamed from: f */
    static boolean m55514f() {
        if (VERSION.SDK_INT >= 17) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo46745b() {
        double d;
        if (m55510c()) {
            d = 58.0d;
        } else {
            d = 47.0d;
        }
        return C23728o.m58241a(d);
    }

    /* renamed from: d */
    public static int m55512d(Context context) {
        if (C18920g.m46047a()) {
            return m55509c(context);
        }
        return C9432q.m18695e(context);
    }

    /* renamed from: a */
    public static boolean m55506a(Context context) {
        int i;
        if (context == null || !m55514f()) {
            i = 0;
        } else {
            i = Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m55508b(Context context) {
        int i;
        if (!C18920g.m46047a()) {
            return false;
        }
        if (context == null) {
            i = 0;
        } else {
            i = Secure.getInt(context.getContentResolver(), "display_notch_status", 0);
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m55509c(Context context) {
        if (!C18920g.m46047a()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
        } catch (Throwable unused) {
            return iArr[1];
        }
    }

    /* renamed from: a */
    public static int m55504a(Activity activity) {
        int i;
        WindowManager windowManager = (WindowManager) C11010c.m22280a().getSystemService("window");
        int i2 = 0;
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", new Class[]{DisplayMetrics.class}).invoke(defaultDisplay, new Object[]{displayMetrics});
            int i3 = displayMetrics.heightPixels;
            if (activity == null || !TextUtils.equals("OnePlus", Build.BRAND)) {
                i = defaultDisplay.getHeight();
            } else {
                View decorView = activity.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                i = rect.bottom;
            }
            i2 = i3 - i;
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo46744a(int i, View view, View view2, View view3, C22457c cVar) {
        if (m55510c() && view != null && view2 != null) {
            C22461e eVar = new C22461e(view2, i, view, view3, cVar);
            C18842a.m45934b(eVar);
        }
    }
}

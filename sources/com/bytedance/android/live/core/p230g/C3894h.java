package com.bytedance.android.live.core.p230g;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.core.p230g.p232b.C3871a;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.g.h */
public final class C3894h {
    /* renamed from: a */
    public static boolean m9842a(Context context) {
        if (m9843b(context) || new C3871a(context).f10892a || m9844c(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m9844c(Context context) {
        String str;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0) {
                str = resources.getString(identifier);
            } else {
                str = null;
            }
            if (str == null || TextUtils.isEmpty(str)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m9843b(Context context) {
        if (!(context instanceof Activity) || VERSION.SDK_INT < 28) {
            return false;
        }
        View decorView = ((Activity) context).getWindow().getDecorView();
        try {
            Object invoke = decorView.getClass().getMethod("getRootWindowInsets", new Class[0]).invoke(decorView, new Object[0]);
            Object invoke2 = invoke.getClass().getDeclaredMethod("getDisplayCutout", new Class[0]).invoke(invoke, new Object[0]);
            List list = (List) invoke2.getClass().getMethod("getBoundingRects", new Class[0]).invoke(invoke2, new Object[0]);
            if (list == null || list.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

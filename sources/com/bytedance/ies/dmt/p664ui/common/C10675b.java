package com.bytedance.ies.dmt.p664ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.ies.dmt.p664ui.p665a.C10638c;

/* renamed from: com.bytedance.ies.dmt.ui.common.b */
public final class C10675b {

    /* renamed from: a */
    public int f28434a;

    /* renamed from: com.bytedance.ies.dmt.ui.common.b$a */
    static class C10677a {

        /* renamed from: a */
        static C10675b f28435a = new C10675b();
    }

    /* renamed from: a */
    public static C10675b m21494a() {
        return C10677a.f28435a;
    }

    /* renamed from: a */
    public static boolean m21495a(int i) {
        return i == 1;
    }

    private C10675b() {
        this.f28434a = 1;
    }

    /* renamed from: c */
    public static boolean m21499c() {
        return m21498b(null);
    }

    /* renamed from: b */
    public static boolean m21497b() {
        if (m21494a().f28434a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m21496a(Context context) {
        Activity activity;
        while (true) {
            activity = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        if (activity instanceof C10638c) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m21498b(Context context) {
        if (m21494a().f28434a == 0 || m21496a(context)) {
            return true;
        }
        return false;
    }
}

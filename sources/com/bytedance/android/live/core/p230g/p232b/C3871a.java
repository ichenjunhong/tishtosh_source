package com.bytedance.android.live.core.p230g.p232b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3874a;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3875b;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3876c;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3877d;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3878e;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3879f;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3880g;
import com.bytedance.android.live.core.p230g.p232b.p233a.C3881h;
import com.p683ss.p2544b.p2545a.C51151a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.core.g.b.a */
public final class C3871a {

    /* renamed from: b */
    static Map<String, C3884c> f10890b = new HashMap<String, C3884c>() {
        {
            put("OPPO", new C3878e());
            put("VIVO", new C3880g());
            put("HISENSE", new C3875b());
            put("HUAWEI", new C3877d());
            put("XIAOMI", new C3881h());
            put("ASUS", new C3874a());
            put("ONEPLUS", new C3879f());
        }
    };

    /* renamed from: c */
    static Map<String, C3884c> f10891c = new HashMap<String, C3884c>() {
        {
            put("HONOR", new C3876c());
        }
    };

    /* renamed from: a */
    public boolean f10892a;

    public C3871a(Context context) {
        boolean z;
        if (m9806b(context) || m9805a(context)) {
            z = true;
        } else {
            z = false;
        }
        this.f10892a = z;
    }

    /* renamed from: a */
    private static boolean m9805a(Context context) {
        boolean z;
        boolean z2;
        try {
            String trim = Build.MANUFACTURER.toUpperCase().trim();
            C3884c cVar = (C3884c) f10890b.get(trim);
            C3884c cVar2 = (C3884c) f10891c.get(Build.BRAND.toUpperCase().trim());
            if (cVar == null || !cVar.mo9248a(context)) {
                z = false;
            } else {
                z = true;
            }
            if (cVar2 == null || cVar == cVar2 || !cVar2.mo9248a(context)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m9806b(Context context) {
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
        } catch (Exception e) {
            C51151a.m110018b("DigHoleCheck", Log.getStackTraceString(e));
            return false;
        }
    }
}

package com.p683ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.f */
public class C40897f {

    /* renamed from: a */
    static Set<String> f104078a = new HashSet();

    /* renamed from: b */
    private static volatile boolean f104079b;

    /* renamed from: a */
    public static void m90468a(Context context) {
        if (!f104079b) {
            synchronized (C40897f.class) {
                if (!f104079b) {
                    m90470b(context);
                    f104079b = true;
                }
            }
        }
    }

    /* renamed from: b */
    private static void m90470b(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            if (!(packageInfo == null || packageInfo.services == null)) {
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                String a = C40898g.m90471a(context);
                String b = C40898g.m90473b(context);
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (serviceInfo != null && (TextUtils.equals(a, serviceInfo.processName) || TextUtils.equals(b, serviceInfo.processName))) {
                        f104078a.add(serviceInfo.name);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static boolean m90469a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
                if (!(resolveService == null || resolveService.serviceInfo == null)) {
                    String str = resolveService.serviceInfo.processName;
                    if (TextUtils.equals(C40898g.m90471a(context), str) || TextUtils.equals(C40898g.m90473b(context), str)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}

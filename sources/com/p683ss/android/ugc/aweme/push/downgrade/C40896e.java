package com.p683ss.android.ugc.aweme.push.downgrade;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35890a;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.e */
public class C40896e {

    /* renamed from: a */
    public static volatile boolean f104076a;

    /* renamed from: b */
    public static volatile boolean f104077b;

    /* renamed from: a */
    public static boolean m90465a(Context context) {
        m90466b(context);
        return f104076a;
    }

    /* renamed from: b */
    private static void m90466b(Context context) {
        if (!f104077b) {
            synchronized (C40896e.class) {
                if (!f104077b) {
                    if (context == null || !C35890a.m81058a(context)) {
                        f104077b = true;
                    } else {
                        f104077b = m90467c(context);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static boolean m90467c(Context context) {
        boolean z;
        try {
            int a = C10181b.m20511a().mo18168a(OptimizePushProcessExperiment.class, true, "optimize_push_process", 31744, 1);
            if (a != 4) {
                if (a != 1) {
                    C23337c.m57396a(context, 2);
                    if (a != 3 || !C23337c.m57398a()) {
                        if (a != 2 || !C23337c.m57400c()) {
                            z = false;
                            f104076a = z;
                        }
                    }
                }
                return true;
            }
            z = true;
            f104076a = z;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

package com.p683ss.android.ugc.tools.utils;

import android.util.Log;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import java.net.UnknownHostException;

/* renamed from: com.ss.android.ugc.tools.utils.g */
public final class C50203g {
    /* renamed from: a */
    public static void m108358a(String str) {
        C39629l.m88232a().mo58567E().mo49423a(3, "Tools-Client", str);
    }

    /* renamed from: b */
    public static void m108361b(String str) {
        C39629l.m88232a().mo58567E().mo49423a(6, "Tools-Client", str);
    }

    /* renamed from: c */
    public static void m108362c(String str) {
        C39629l.m88232a().mo58567E().mo49423a(5, "Tools-Client", str);
    }

    /* renamed from: d */
    public static void m108363d(String str) {
        C39629l.m88232a().mo58567E().mo49423a(4, "Tools-Client", str);
    }

    /* renamed from: a */
    public static void m108359a(Throwable th) {
        C39629l.m88232a().mo58567E().mo49423a(6, "Tools-Client", Log.getStackTraceString(th));
    }

    /* renamed from: b */
    public static String m108360b(Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "UnknownHostException";
            }
        }
        return Log.getStackTraceString(th);
    }
}

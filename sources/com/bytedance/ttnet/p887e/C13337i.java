package com.bytedance.ttnet.p887e;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.ttnet.hostmonitor.C13351f;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.e.i */
public final class C13337i {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m26872a(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            r1.<init>()     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r2)     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            if (r3 == 0) goto L_0x0020
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r2)     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            if (r3 == 0) goto L_0x0020
            com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43751a(r3, r2)     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
        L_0x0020:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            r2.close()
            goto L_0x0039
        L_0x0028:
            r3 = move-exception
            goto L_0x002c
        L_0x002a:
            r3 = move-exception
            r2 = r0
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()
        L_0x0031:
            throw r3
        L_0x0032:
            r2 = r0
        L_0x0033:
            if (r2 == 0) goto L_0x0038
            r2.close()
        L_0x0038:
            r3 = r0
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p887e.C13337i.m26872a(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: a */
    public static void m26874a(C13329d<String, C12792q> dVar, C12727a aVar) {
        if (dVar != null && dVar.mo24933a() > 0) {
            Map b = dVar.mo24936b();
            Collection<C12792q> values = b.values();
            synchronized (b) {
                for (C12792q qVar : values) {
                    List<C12727a> list = qVar.f33450g;
                    if (list != null && !list.contains(aVar)) {
                        list.add(aVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m26875a(String str, List<String> list) {
        if (C9431p.m18664a(str) || C9414h.m18630a(list)) {
            return false;
        }
        for (String str2 : list) {
            if (!C9431p.m18664a(str2) && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m26873a(Context context, Class<? extends BroadcastReceiver> cls, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        String str2 = "TtnetUtil";
        try {
            StringBuilder sb = new StringBuilder();
            if (z) {
                str = "enabling";
            } else {
                str = "disabling";
            }
            sb.append(str);
            sb.append(" connectivity receiver");
            C13351f.m26926b(str2, sb.toString());
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), i, 1);
        } catch (Throwable unused) {
        }
    }
}

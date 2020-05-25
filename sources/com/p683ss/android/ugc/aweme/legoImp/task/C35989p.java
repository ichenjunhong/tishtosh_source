package com.p683ss.android.ugc.aweme.legoImp.task;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.utils.C47689aw;
import p2628d.C52857u;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.p */
public final class C35989p {

    /* renamed from: a */
    public static final C35989p f92219a = new C35989p();

    /* renamed from: b */
    private static Keva f92220b;

    private C35989p() {
    }

    /* renamed from: a */
    public static final String m81164a() {
        String str;
        String str2;
        if (f92220b == null) {
            f92220b = Keva.getRepo("PosterSR");
        }
        Keva keva = f92220b;
        String str3 = null;
        if (keva != null) {
            str = keva.getString("cpu_model", null);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String d = C47689aw.m103221d();
        if (d == null) {
            str2 = null;
        } else if (d != null) {
            str2 = C52830p.m112447b(d).toString();
        } else {
            throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Build.HARDWARE;
        }
        if (str2 != null) {
            if (str2 != null) {
                str3 = C52830p.m112447b(str2).toString();
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        StringBuilder sb = new StringBuilder("not use cacheCpuModel:");
        sb.append(str3);
        C32458a.m75141a(4, "cacheCpuModel", sb.toString());
        Keva keva2 = f92220b;
        if (keva2 != null) {
            keva2.storeString("cpu_model", str3);
        }
        return str3;
    }
}

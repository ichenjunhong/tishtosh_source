package com.p683ss.android.ttve.log;

import com.p683ss.android.vesdk.C50791x;

/* renamed from: com.ss.android.ttve.log.a */
public final class C20085a {

    /* renamed from: a */
    public static C50791x f55217a;

    /* renamed from: a */
    public static void m49602a(int i, String str) {
        if (f55217a != null) {
            C50791x xVar = f55217a;
            StringBuilder sb = new StringBuilder("[VESDK]");
            sb.append(str);
            xVar.mo43229a(i, sb.toString());
        }
    }
}

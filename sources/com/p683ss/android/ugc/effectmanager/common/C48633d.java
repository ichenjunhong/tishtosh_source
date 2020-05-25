package com.p683ss.android.ugc.effectmanager.common;

import com.p683ss.android.ugc.effectmanager.model.ModelInfo;

/* renamed from: com.ss.android.ugc.effectmanager.common.d */
public final class C48633d {
    /* renamed from: b */
    public static String m105243b(String str) {
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        int a = C48645g.m105253a(str, ".model|.dat");
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, a);
        }
        return "v1.0";
    }

    /* renamed from: a */
    public static String m105241a(ModelInfo modelInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(modelInfo.getName());
        sb.append("_v");
        sb.append(modelInfo.getVersion());
        sb.append(".model");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m105242a(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf("_v");
        if (lastIndexOf2 > 0) {
            return str.substring(lastIndexOf + 1, lastIndexOf2);
        }
        int a = C48645g.m105253a(str, ".model|.dat");
        if (a > 0) {
            return str.substring(lastIndexOf + 1, a);
        }
        return str.substring(lastIndexOf + 1, str.length());
    }
}

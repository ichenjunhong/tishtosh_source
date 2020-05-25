package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b.f */
public final class C34849f {
    /* renamed from: a */
    public static String m78931a(List<String> list) {
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append("\"");
            sb.append(str);
            sb.append("\",");
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(sb2.substring(0, sb2.lastIndexOf(",")));
        sb3.append("]");
        return sb3.toString();
    }
}

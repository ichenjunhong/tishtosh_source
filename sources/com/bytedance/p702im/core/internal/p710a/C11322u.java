package com.bytedance.p702im.core.internal.p710a;

import java.util.List;

/* renamed from: com.bytedance.im.core.internal.a.u */
public final class C11322u {
    /* renamed from: a */
    public static String m23120a(List list, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i));
                sb.append(str);
            }
        }
        return sb.toString();
    }
}

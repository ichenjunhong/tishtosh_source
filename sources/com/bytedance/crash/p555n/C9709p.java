package com.bytedance.crash.p555n;

import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.crash.n.p */
public final class C9709p {
    /* renamed from: a */
    public static boolean m19415a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Float m19414a(Map<? super String, Float> map) {
        float f = 0.0f;
        for (Float f2 : map.values()) {
            if (f2 != null) {
                f += f2.floatValue();
            }
        }
        return Float.valueOf(f);
    }
}

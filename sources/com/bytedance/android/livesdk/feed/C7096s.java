package com.bytedance.android.livesdk.feed;

import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.s */
public final class C7096s<T> implements C7033o<T> {
    /* renamed from: a */
    public final boolean mo13188a(List<T> list, List<T> list2) {
        boolean z;
        if ((list == null && list2 == null) || list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            Object obj2 = list2.get(i);
            if (obj == null && obj2 == null) {
                z = true;
            } else if (obj == null || obj2 == null) {
                z = false;
            } else {
                z = obj.equals(obj2);
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}

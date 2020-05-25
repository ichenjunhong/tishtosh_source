package com.p2620vk.sdk.p2621a;

import android.text.TextUtils;
import com.C2240a;
import com.p2620vk.sdk.api.model.VKAttachments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.vk.sdk.a.b */
public final class C52324b {
    /* renamed from: a */
    public static String m111790a(Map<String, ?> map) {
        return m111791a(map, false);
    }

    /* renamed from: a */
    public static String m111789a(Collection<?> collection, String str) {
        return TextUtils.join(str, collection);
    }

    /* renamed from: a */
    private static String m111791a(Map<String, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof VKAttachments) {
                value = ((VKAttachments) value).mo109340a();
            }
            arrayList.add(C2240a.m6772a("%s=%s", new Object[]{entry.getKey(), String.valueOf(value)}));
        }
        return m111789a((Collection<?>) arrayList, "&");
    }
}

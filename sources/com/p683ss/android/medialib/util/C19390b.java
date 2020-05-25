package com.p683ss.android.medialib.util;

import android.content.Context;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.medialib.util.b */
public final class C19390b {
    /* renamed from: a */
    public static Map<String, Integer> m47480a(Context context) {
        HashMap hashMap = new HashMap();
        for (Entry entry : C35807d.m80935a(context, "ShortVideo", 0).getAll().entrySet()) {
            if (((String) entry.getKey()).startsWith("PerfConfig_")) {
                hashMap.put(((String) entry.getKey()).substring(11), (Integer) entry.getValue());
            }
        }
        return hashMap;
    }
}

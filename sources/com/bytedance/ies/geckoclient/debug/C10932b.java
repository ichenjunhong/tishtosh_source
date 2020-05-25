package com.bytedance.ies.geckoclient.debug;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ies.geckoclient.debug.b */
public final class C10932b {

    /* renamed from: a */
    private static final Map<String, List<Pair<Long, String>>> f29343a = new HashMap();

    /* renamed from: a */
    public static void m22190a(String str, String... strArr) {
        if (C10931a.m22189a()) {
            synchronized (f29343a) {
                List list = (List) f29343a.get(str);
                if (list == null) {
                    list = new ArrayList();
                    f29343a.put(str, list);
                }
                StringBuilder sb = new StringBuilder();
                for (String append : strArr) {
                    sb.append(append);
                }
                list.add(new Pair(Long.valueOf(System.currentTimeMillis()), sb.toString()));
            }
        }
    }
}

package com.bytedance.apm.p501q;

import android.util.Pair;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.apm.q.h */
public final class C9190h {

    /* renamed from: com.bytedance.apm.q.h$a */
    public interface C9191a<A, B> {
        /* renamed from: a */
        boolean mo16533a(A a, B b);
    }

    /* renamed from: a */
    public static boolean m18253a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Map<String, String> m18255b(List<Pair<String, String>> list) {
        if (m18253a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Pair pair : list) {
            if (!(pair == null || pair.first == null)) {
                hashMap.put(pair.first, pair.second);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String[] m18254a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i = 0;
        for (String str : set) {
            int i2 = i + 1;
            strArr[i] = str;
            i = i2;
        }
        return strArr;
    }

    /* renamed from: a */
    public static String m18251a(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object next : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(next.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static <L, O> boolean m18252a(Collection<L> collection, O o, C9191a<? super L, O> aVar) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (aVar.mo16533a(it.next(), o)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}

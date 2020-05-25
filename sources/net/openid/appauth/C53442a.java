package net.openid.appauth;

import android.net.Uri;
import com.C2240a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: net.openid.appauth.a */
public final class C53442a {
    /* renamed from: a */
    static Map<String, String> m113496a(Uri uri, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m113497a(Map<String, String> map, Set<String> set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            C53487p.m113585a(str, (Object) "additional parameter keys cannot be null");
            C53487p.m113585a(str2, (Object) "additional parameter values cannot be null");
            Object[] objArr = {str};
            if (!set.contains(str)) {
                linkedHashMap.put(str, str2);
            } else {
                throw new IllegalArgumentException(C2240a.m6772a("Parameter %s is directly supported via the authorization request builder, use the builder method instead", objArr));
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}

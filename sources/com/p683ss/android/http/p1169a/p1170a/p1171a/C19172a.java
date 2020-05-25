package com.p683ss.android.http.p1169a.p1170a.p1171a;

import com.p683ss.android.http.p1169a.C19184c;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.ss.android.http.a.a.a.a */
public final class C19172a {
    /* renamed from: a */
    public static URI m46741a(URI uri, C19184c cVar) throws URISyntaxException {
        return m46742a(uri, cVar, false);
    }

    /* renamed from: a */
    private static URI m46742a(URI uri, C19184c cVar, boolean z) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        } else if (cVar != null) {
            return m46740a(cVar.f52885d, cVar.f52882a, cVar.f52884c, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        } else {
            return m46740a(null, null, -1, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        }
    }

    /* renamed from: a */
    private static URI m46740a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }
}

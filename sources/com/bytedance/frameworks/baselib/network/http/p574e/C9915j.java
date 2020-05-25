package com.bytedance.frameworks.baselib.network.http.p574e;

import com.bytedance.common.utility.C9431p;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.j */
public final class C9915j {
    /* renamed from: a */
    public static URI m19868a(String str) throws RuntimeException {
        if (C9431p.m18664a(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m19871b(str);
            }
        }
    }

    /* renamed from: b */
    public static URI m19871b(String str) throws RuntimeException {
        if (C9431p.m18664a(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static URI m19870a(URI uri, C9908c cVar) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        } else if (cVar != null) {
            return m19869a(cVar.f26980d, cVar.f26977a, cVar.f26979c, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        } else {
            return m19869a(null, null, -1, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        }
    }

    /* renamed from: a */
    public static URI m19869a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
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

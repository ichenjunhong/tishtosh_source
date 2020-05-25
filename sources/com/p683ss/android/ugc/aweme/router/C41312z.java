package com.p683ss.android.ugc.aweme.router;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.router.z */
public final class C41312z {
    /* renamed from: a */
    public static List<String> m91070a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Uri.parse(str).getPathSegments();
    }

    /* renamed from: b */
    public static String m91072b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Uri.parse(str).getQueryParameter(str2);
    }

    /* renamed from: a */
    public static boolean m91071a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (!TextUtils.equals(parse.getScheme(), parse2.getScheme()) || !TextUtils.equals(parse.getHost(), parse2.getHost())) {
            return false;
        }
        List pathSegments = parse.getPathSegments();
        List pathSegments2 = parse2.getPathSegments();
        if (pathSegments.size() != pathSegments2.size()) {
            return false;
        }
        int size = pathSegments.size();
        for (int i = 0; i < size; i++) {
            if (!((String) pathSegments.get(i)).startsWith(":") && !((String) pathSegments.get(i)).equals(pathSegments2.get(i))) {
                return false;
            }
        }
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.size() == 0) {
            return true;
        }
        Set queryParameterNames2 = parse2.getQueryParameterNames();
        Iterator it = queryParameterNames2.iterator();
        for (String equals : queryParameterNames) {
            if (!it.hasNext()) {
                return false;
            }
            if (!TextUtils.equals(equals, (String) it.next())) {
                return false;
            }
        }
        return true;
    }
}

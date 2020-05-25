package com.bytedance.apm.p501q;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.q.l */
public final class C9195l {
    /* renamed from: a */
    public static JSONObject m18263a(JSONObject jSONObject, String str) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: a */
    public static boolean m18264a(String str, List<String> list) {
        if (C9190h.m18253a(list) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = Uri.parse(str).getHost();
            for (String equalsIgnoreCase : list) {
                if (host.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[Catch:{ Exception -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0015 A[Catch:{ Exception -> 0x0031 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m18266b(org.json.JSONObject r5, java.lang.String r6) {
        /*
            r0 = 0
            org.json.JSONArray r5 = r5.optJSONArray(r6)     // Catch:{ Exception -> 0x0031 }
            r6 = 0
            if (r5 == 0) goto L_0x0011
            int r1 = r5.length()     // Catch:{ Exception -> 0x0031 }
            if (r1 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r1 = 0
            goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 == 0) goto L_0x0015
            return r0
        L_0x0015:
            int r1 = r5.length()     // Catch:{ Exception -> 0x0031 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0031 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0031 }
        L_0x001e:
            if (r6 >= r1) goto L_0x0030
            java.lang.String r3 = r5.getString(r6)     // Catch:{ Exception -> 0x0031 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0031 }
            if (r4 != 0) goto L_0x002d
            r2.add(r3)     // Catch:{ Exception -> 0x0031 }
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0030:
            return r2
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p501q.C9195l.m18266b(org.json.JSONObject, java.lang.String):java.util.List");
    }

    /* renamed from: c */
    public static List<String> m18267c(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (C9185g.m18238c(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (optJSONObject.optInt(str2) == 1) {
                    arrayList.add(str2);
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static List<Pattern> m18268d(JSONObject jSONObject, String str) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    String string = optJSONArray.getString(i);
                    if (!TextUtils.isEmpty(string)) {
                        arrayList.add(Pattern.compile(string));
                    }
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: e */
    public static List<Pattern> m18269e(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (C9185g.m18238c(optJSONObject)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (optJSONObject.optInt(str2) == 1) {
                    arrayList.add(Pattern.compile(str2));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m18265a(String str, List<String> list, List<Pattern> list2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!C9190h.m18253a(list)) {
            for (String contains : list) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        try {
            String path = new URI(str).getPath();
            if (!C9190h.m18253a(list2)) {
                for (Pattern matcher : list2) {
                    if (matcher.matcher(path).matches()) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
